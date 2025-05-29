package com.java.ejb.jsf;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.naming.NamingException;

import com.java.ejb.bean.RemoteStatelessHelper;
import com.java.ejb.bean.UserBeanRemote;
import com.java.ejb.model.User;

public class UserEjbImpl {

    static UserBeanRemote remote;

    static {
        
            try {
				remote = RemoteStatelessHelper.lookupRemoteStatelessUser();
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

    public List<User> showUsersEjb() throws NamingException, ClassNotFoundException, SQLException {
        return remote.showUsers();
    }

    public String searchUserEjb(int id) throws ClassNotFoundException, SQLException {
        Map<String, Object> sessionMap = 
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap();

        User userFound = remote.searchUser(id);
        sessionMap.put("userFound", userFound);

        return "updateUser?faces-redirect=true";
    }

    public String addUserEjb(User user) throws ClassNotFoundException, SQLException {
        remote.addUser(user);
        return "ShowUser?faces-redirect=true";
    }

   
}
