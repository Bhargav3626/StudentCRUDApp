1) Index Page:

The index page (index.jsp) contains a form to add a new student with fields for name, email, and age.
It also includes a button to view the list of students.

2)Add Student:
When a user fills in the student details and clicks the "Submit" button, the form data is sent to the CreateServlet.
CreateServlet collects the data, creates a new Student object, and uses StudentDAOImpl to add the student to the database.
After adding the student, the user is redirected back to the home page (home.jsp) with a success message.

3)View Students:
When a user clicks the "View Students" button, the request is sent to the ReadServlet.
ReadServlet retrieves the list of students from the database using StudentDAOImpl and sets this list as a request attribute.
The user is forwarded to home.jsp, which displays the list of students.

4) Home Page:
The home page (home.jsp) displays the list of all students retrieved from the database.
Each student entry has "Edit" and "Delete" buttons.

5) Update Student:
When a user clicks the "Edit" button next to a student, they are redirected to an update form (update.jsp).
After updating the details and submitting the form, the data is sent to the UpdateServlet.
UpdateServlet updates the student details in the database and redirects back to home.jsp with a success message.

6)Delete Student:
When a user clicks the "Delete" button next to a student, a confirmation pop-up appears.
Upon confirmation, the request is sent to the DeleteServlet.
DeleteServlet deletes the student from the database and redirects back to home.jsp with a success message.

7)Search Students:
Users can search for students using the search bar on the home page.
The search form sends the search parameters to the SearchServlet.
SearchServlet retrieves the matching students from the database and forwards the list to home.jsp for display.
