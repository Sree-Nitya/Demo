package com.example.demo.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

@WebServlet("/Main")
public class Main extends javax.servlet.http.HttpServlet implements
        javax.servlet.Servlet {
    static final long serialVersionUID = 1L;

    public Main() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response){

        Scanner key = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = key.nextLine();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test?user=root&password=root");
            Statement stmt = con.createStatement();
            try {
                stmt.execute("CREATE TABLE IF NOT EXISTS simple( name char(30))");
            } catch (Exception e) {}

            String s = "Insert into simple values(\'" + name + "\')";
            if (name != null)
                stmt.execute(s);
            ResultSet rs = stmt.executeQuery("Select * from simple");
            while (rs.next())
                System.out.println(rs.getString(1));
        } catch (Exception ex) {
            System.out.println(ex);
            System.exit(0);
        }
        System.out.println("Program terminated with no error.");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
    }
}