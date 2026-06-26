package com.techin60academy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.techin60academy.model.Contact;
import com.techin60academy.util.DBConnection;

public class ContactDAO {

    public boolean saveContact(Contact contact) {

        boolean status = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql =
                    "INSERT INTO contacts(name,email,message) VALUES(?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, contact.getName());
            ps.setString(2, contact.getEmail());
            ps.setString(3, contact.getMessage());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                status = true;
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}