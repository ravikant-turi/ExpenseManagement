package com.java.ejb.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.java.ejb.dao.UserDao;
import com.java.ejb.model.User;
import com.java.ejb.util.ConnectionHelper;

public class UserDaoImpl implements UserDao {

	Connection con;

	@Override
	public String addUser(User user) throws SQLException, ClassNotFoundException {
		Connection con = ConnectionHelper.getConnection();
		String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
		PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, user.getName());
		ps.setString(2, user.getEmail());
		int rows = ps.executeUpdate();

		if (rows > 0) {
			ResultSet rs = ps.getGeneratedKeys();
			if (rs.next()) {
				return "Added"; // Return generated user ID
			}
		}
		return sql;
	}

	@Override
	public User getUserById(int id) throws SQLException, ClassNotFoundException {
		Connection con = ConnectionHelper.getConnection();
		String sql = "SELECT * FROM users WHERE id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			return new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getDate("created_at"));
		}
		return null;
	}

	@Override
	public List<User> getAllUsers() throws SQLException, ClassNotFoundException {
		Connection con = ConnectionHelper.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM users");

		List<User> users = new ArrayList<>();
		while (rs.next()) {
			users.add(new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getDate("created_at")));
		}
		return users;
	}


        


	
}

