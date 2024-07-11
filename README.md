Student Management System
Overview
The Student Management System is a web-based application designed to manage student records. It allows users to add, update, delete, and search for students. The system is built using Java, JSP, Servlets, and MySQL.

Features
1)Add Student: Allows users to add a new student record with name, email, and age.
2)View Students: Displays a list of all students in the database.
3)Update Student: Enables users to update existing student records.
4)Delete Student: Allows users to delete a student record.
5)Search Students: Provides functionality to search students by ID, name, email, or age.

Setup and Installation
1) Prerequisites:

-> Java Development Kit (JDK)
-> Apache Tomcat Server
-> MySQL Database

2) Database Setup:
-> Create a database named student_db.
-> Create a table students with columns id, name, email, and age.
   
3) Project Configuration:
-> Update the MySQL database connection details in the project.
   
How to Run
1) Deploy the application:
  -> Deploy the application on the Apache Tomcat server.
  
2) Access the application:
  -> Open a web browser and go to http://localhost:9090/StudentCRUDApp.
  
3) Using the Application:
  -> Home Page: Displays options to add a student or view the student list.
  -> Add Student: Fill in the student details and submit the form to add a new student.
  ->View Students: Displays all students. Options are available to update or delete each student.
  ->Search Students: Use the search bar to find students by ID, name, email, or age.
   
Folder Structure
-->> src/main/java: Contains the Java source files.
      ->com.sunbase.dao: Contains DAO interfaces and implementations.
      ->com.sunbase.models: Contains the Student POJO class.
      ->com.sunbase.servlets: Contains the servlet classes.
-->> src/main/webapp: Contains the JSP files and static resources.


Code Explanation
* Student.java: The POJO class for the student entity.
* StudentDAO.java: Interface defining CRUD operations.
* StudentDAOImpl.java: Implementation of the StudentDAO interface.
* Servlets: Handle HTTP requests and responses for creating, reading, updating, and deleting students.

