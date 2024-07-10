package com.sunbase.servlets;

import com.sunbase.dao.impl.StudentDAOImpl;
import com.sunbase.models.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ReadServlet")
public class ReadServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentDAOImpl studentDAO = new StudentDAOImpl();
        List<Student> students = studentDAO.getAllStudents();

        request.setAttribute("students", students);
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }
}
