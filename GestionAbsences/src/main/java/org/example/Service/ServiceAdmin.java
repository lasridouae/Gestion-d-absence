package org.example.Service;


import org.example.DAO.UserDao;
import org.example.DAO.UserDaoImp;
import org.example.Model.Users;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceAdmin {

    public static void main(String[] args) throws SQLException {
//        Users user = new Users("KHOUILID ABDELKBIR", "ABDO@ABDO@", "A","Formateur");
        Users user = new Users();
        user.setEmail("e@e");
        user.setPassword("s");
        user.setId(4);
        UserDao newUser = new UserDaoImp();
        System.out.println(newUser.update(user));



    }

}
