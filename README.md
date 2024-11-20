This is a simple application built with Spring Boot, Lombok, Thymeleaf, Spring Data JPA, MySQL Driver, and Bootstrap. The application provides an interface for managing tasks or notes via a web view.

***FEATURES***
Registration Form: There is a registration form on the landing page with fields for the user's name and e-mail address.Upon clicking Submit, a user's credentials will be stored in a MySQL database.

Tasks Page: After registration, users are redirected to a tasks page. On the tasks page, users can add a new task with a title and content. The tasks will appear on the page with three options: Toggle, Edit, and Delete.

Toggle Button:When the Toggle button is clicked, the title and content of the task will be struck through (crossed out) to indicate it's completed.

Edit Button:Clicking the Edit button takes the user to an edit page where they can change the title and content of the task.Once changed, the user can save the changed task. The changes will be reflected on the tasks page.

Delete Button:The Delete button removes a task completely from both the web interface and the database. It does not just hide it but erases it completely.

***TECHNOLOGIES USED***
Spring Boot: This is the framework that is used to build the backend of the application.
Lombok: Eliminates repetitive Java boilerplate code, such as getters, setters, and constructors.
Thymeleaf: Template engine to render HTML pages
Spring Data JPA: Dependency that deals with communication between the MySQL database and handles CRUD operations in data.
MySQL: Database for all user data and task information
Bootstrap: Front-end UI, responsible for responsive and modern front-end UI

***PROJECT SETUP***

Clone the repository:
Clone this repository to your local machine using:
bash
Copy code
git clone https://github.com/Devi2815/SimpleNotesTakerApplication.git

***INSTALL DEPENDENCIES***
Ensure you have Java 8+ installed on your system.
Dependency Installation using Maven:
bash
Copy code
mvn clean install

***INSTALLATION OF MySQL DATABASES***
In the application.properties file, Create a new MySQL database with your MySQL credentials
properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/simple_notes_db
spring.datasource.username=root
spring.datasource.password=your_password

***RUNNING THE APPLICATION***
Starting Spring Boot
bash
Copy code
mvn spring-boot:run
Open http://localhost:8080 in your browser for the application
Screenshots
Registration Page:

Tasks Page:

Edit Task Page:

Conclusion
This simple notes application shows how one can make a basic CRUD-based web application with the support of Spring Boot, Thymeleaf, and MySQL. In this application, user-friendliness is built into the management of tasks, thereby adding, editing, toggling, and deleting tasks, while proper backend support is also given for the data storage that persists.
