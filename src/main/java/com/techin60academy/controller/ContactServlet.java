package com.techin60academy.controller;

import java.io.IOException;

import com.techin60academy.dao.ContactDAO;
import com.techin60academy.model.*;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/contact")
public class ContactServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        Contact contact = new Contact(name,email,message);
        
        ContactDAO dao = new ContactDAO();
        
        boolean status = dao.saveContact(contact);
        
        if(status) {
        	response.sendRedirect("contact.html?success=true");
        	
        }else {
        	response.sendRedirect("contact.html?error=true");
        }
    }
}