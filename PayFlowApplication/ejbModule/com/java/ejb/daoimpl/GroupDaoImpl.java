package com.java.ejb.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.ejb.dao.GroupDao;
import com.java.ejb.model.Group;
import com.java.ejb.util.ConnectionHelper;

public class GroupDaoImpl implements GroupDao {

	static Connection connection;
	static PreparedStatement pmst;

	static {

		try {
			connection = ConnectionHelper.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Group> showAllGroup() throws SQLException {

		List<Group> groupList = new ArrayList<Group>();

		String sql = "select * from groupses";

		pmst = connection.prepareStatement(sql);

		ResultSet rs = pmst.executeQuery();

		while (rs.next()) {

			Group gp = new Group();

			gp.setId(rs.getInt("id")); // auto generated

			gp.setName(rs.getString("name"));

			gp.setCreatedAt(rs.getTimestamp("created_at"));// bydefault sql will handle

			groupList.add(gp);

		}

		return groupList;
	}

}
