# User Interface Automation Testing Project

This project focuses on automating UI testing for the website [Automation Practice](http://automationpractice.com/index.php) using Selenium with Java, implementing the Page Object Model (POM) design pattern. UI automation testing plays a critical role in ensuring the quality and reliability of web applications by automating the interaction with user interfaces. By utilizing Selenium, developers can simulate user actions across various browsers, ensuring compatibility and functionality across different platforms. The Page Object Model (POM) design pattern enhances test maintainability and readability by encapsulating web elements and their related functionalities into separate classes. This approach promotes reusability and reduces code duplication, leading to more efficient test development and maintenance.

## Project Instructions

1. **Automate the UI**: Automate the UI for the website - http://automationpractice.com/index.php.
2. **Write Test Scripts**: Write test scripts for two pages using the Page Object Model (POM).
3. **Test Scenarios**: Each page must have five test scenarios, approved by the mentor.
4. **TestNG Implementation**: Utilize TestNG for all test cases.
5. **Browser Independence**: Ensure automation tests are browser-independent.

## Technology Stack

- **Selenium**: Selenium is an open-source tool used to automate web browsers. It provides a rich set of APIs for interacting with web elements and executing browser actions programmatically.
- **Java**: Java programming language is utilized to write Selenium test scripts. Java's robustness and platform independence make it a popular choice for building automation frameworks.
- **Cucumber**: Cucumber is employed as a tool based on the Behavior Driven Development (BDD) framework, facilitating the writing of acceptance tests for the web application. It allows test scenarios to be written in a human-readable format, promoting collaboration between technical and non-technical stakeholders.
- **TestNG**: TestNG is an open-source test automation framework for Java. It enhances automated tests by making them more structured, readable, maintainable, and user-friendly. TestNG provides features such as annotations, grouping, and parameterization, enabling developers to create comprehensive test suites.
- **Page Object Model (POM)**: POM is a design pattern in Selenium that establishes an object repository for storing all web elements of a webpage. By encapsulating web elements and their related actions into separate classes, POM promotes code reusability, maintainability, and scalability.

## Feature Files in UI Automation Testing

Feature files in UI automation testing play a pivotal role in implementing Behavior Driven Development (BDD) practices. These files contain human-readable scenarios, outlining application behavior from an end-user perspective. By defining scenarios with Given-When-Then steps, feature files promote collaboration, clarity, and better test coverage. They serve as living documentation, facilitating continuous refinement of test scenarios as the application evolves. Overall, feature files bridge the communication gap between stakeholders and technical teams, fostering collaboration and driving quality in UI automation testing projects.

### Scenarios For the Automation of the Sign-up Page's Feature File
![SignUpPage](https://github.com/SourabhGPatil/Capstone-Project/assets/81312909/15737821-2fb9-45a0-b8e3-7844e8ddc4dd) - The Signup Page to automate.

![SignUpPage](https://github.com/SourabhGPatil/Capstone-Project/assets/81312909/c9deaa92-a373-4ca5-bac2-fc1b1c63b438) - The Scenarios decided for the Automation of the Signup Page.

### Scenarios For the Automation of the Home Page's Feature File
![Homepage](https://github.com/SourabhGPatil/Capstone-Project/assets/81312909/bbb08b30-6307-4eb9-9ab9-175315fa1d41) - The Home Page Page to automate.

![HomePage](https://github.com/SourabhGPatil/Capstone-Project/assets/81312909/c317ef9d-6d0c-477d-a9a1-622063fc3c51) - The Scenarios decided for the Automation of the Home Page.

## Project Output

Please refer to the provided screenshots for the project output.

### Screenshots for the Homepage Automation TestNG Report 

![Homepage_TestNG_Report (1)](https://github.com/SourabhGPatil/Capstone-Project/assets/81312909/e5a7fae8-8639-49ae-8b65-b29e9b392545) - Homepage TestNG Report #01

![Homepage_TestNG_Report (2)](https://github.com/SourabhGPatil/Capstone-Project/assets/81312909/bfeed779-6713-4400-bf53-9fa7bc0ea532) - Homepage TestNG Report #02

### Screenshots for the Signup Page Automation TestNG Report 
![Sign Up Page_TestNG_Report (1)](https://github.com/SourabhGPatil/Capstone-Project/assets/81312909/150877b4-bf28-4cfe-9b5d-a2672494b53e) - Signup Page TestNG Report #01

![Sign Up Page_TestNG_Report (2)](https://github.com/SourabhGPatil/Capstone-Project/assets/81312909/3c532d3e-9171-4740-bbf8-207d8b780340) - Signup Page TestNG Report #02


## Getting Started

To get a copy of this project up and running on your local machine for development and testing purposes, follow these steps:

1. Clone this repository.
   ```bash
   git clone https://github.com/SourabhGPatil/Capstone-Project
   ```
2. Install the necessary dependencies.
   ```bash
   npm install
   ```
3. Configure the test environment.
   - Ensure you have Java Development Kit (JDK) installed.
   - Install Selenium WebDriver.
   - Set up TestNG in your project.
   - Install any required browser drivers (e.g., ChromeDriver, GeckoDriver).
4. Your Maven Project structure must look like this:
   
   ![UI_ProjectStruct](https://github.com/SourabhGPatil/Capstone-Project/assets/81312909/9efbad77-e6cb-4624-aaef-b68ccf702e96)


## Running the Tests

1. Build the Project:
   Inside the project directory, execute the following Maven command to build the project:
   ```bash
    mvn clean install
   ```
   This command will compile the source code, run tests, and package the project into a JAR file.

2. Run the Project:
    Execute the following command to run the test suite:
    ```bash
    mvn test
    ```
## Acknowledgments

- Special thanks to my Mentor Ms. Swati Ma'am for guidance and approval of test scenarios.
- Thanks to the developers of Selenium, Java, TestNG, and Cucumber for their valuable contributions to the field of automated testing.

-------

# Project #02 - Create and Automate a REST API


## Overview

TopJobs Inc. is a company aiming to develop an online job recruitment application that facilitates both employers and job seekers. The primary objective of this project is to create a RESTful API using Spring Boot and MySQL, enabling CRUD operations. This API will empower employers to post job openings while allowing applicants to apply for these positions. Moreover, automation of this API will be achieved using TestNG for efficient testing.

## Technologies Used

- **Apache Maven**: Maven is utilized for managing dependencies in Java-based projects, ensuring the appropriate JAR files are obtained for seamless integration.
- **Spring Boot**: Spring Boot serves as the foundation for building enterprise Spring applications, providing a robust framework for development.
- **REST API**: Representational State Transfer (REST) API conforms to REST architectural principles, enabling interaction with RESTful web services.
- **MySQL**: MySQL acts as the relational database management system (RDBMS) for storing and managing API data efficiently.
- **Postman**: Postman serves as a comprehensive API development tool, facilitating the creation, testing, and modification of REST APIs.

## Steps Followed for Building the Project

1. Create a Spring Boot project using Spring Initializr.
2. Configure and set up a MySQL database, defining necessary configurations.
3. Design entity model classes to represent database entities.
4. Implement service classes to handle business logic.
5. Develop REST controller classes to define API endpoints and operations.
6. Build and run the project to ensure functionality.
7. Utilize Postman for testing, executing GET, POST, PUT, and DELETE request methods.
8. Write test methods and execute them using TestNG for automation.

## Project Structure

The project structure encompasses various components such as entity models, service classes, REST controllers, and configuration files. Refer to the provided screenshot for a detailed visualization.

![API_ProjectStruct](https://github.com/SourabhGPatil/Capstone-Project/assets/81312909/4ef61b72-781f-4305-912b-5f9a5814158c) <br> - The Project Structure


## Database Schema

The database schema consists of tables representing job and resume entities, along with their respective attributes. Below are the schema details:

### job Table
- **JobID**: Unique identifier for each job.
- **EmployerID**: Identifier for the employer posting the job.
- **Qualifications**: Qualifications required for the job.
- **Compensation**: Compensation offered for the job.
- **employer_name**: Name of the employer.
- **job_title**: Title of the job.

### resume Table
- **ApplicantID**: Unique identifier for each applicant.
- **JobID**: Identifier for the job applied by the applicant.
- **Skills**: Skills possessed by the applicant.
- **applicant_name**: Name of the applicant.
- **education_completed**: Educational qualifications completed by the applicant.
- **employer_name**: Name of the employer.
- **phone_no**: Contact number of the applicant.

## Getting Started

### Cloning the Repository

To begin, clone the project repository to your local machine using Git. Open your terminal and execute the following command:

```bash
git clone https://github.com/SourabhGPatil/Capstone-Project
```

### Running the Project

Follow these steps to run the project on your computer:

1. **Database Setup**: Before running the project, ensure that you have MySQL installed on your system. Create a MySQL database and configure the necessary credentials. Update the database configurations in the project accordingly.

2. **Project Configuration**: Open the project in your preferred Integrated Development Environment (IDE), such as IntelliJ IDEA or Eclipse. Ensure that you have Apache Maven installed for dependency management.

3. **Build the Project**: Using Maven, build the project to resolve dependencies and compile the source code. Navigate to the root directory of the project in your terminal and execute the following command:

   ```bash
   mvn clean install
   ```

4. **Run the Application**: After successfully building the project, run the Spring Boot application. Use the following command:

   ```bash
   mvn spring-boot:run
   ```

   This command will start the embedded Tomcat server, and your application will be accessible at the specified port (usually `http://localhost:8080/`).

5. **Testing with Postman**: Once the application is up and running, you can test the REST API endpoints using Postman. Execute GET, POST, PUT, and DELETE requests to interact with the API and verify its functionality.

6. **Automated Testing with TestNG**: To perform automated testing, ensure that TestNG is configured in your IDE. Write test methods to cover various scenarios and execute them using TestNG. Refer to the provided TestNG report for insights into test results and coverage.

By following these steps, you should be able to clone the repository, set up the project, run the application locally, and perform testing using both Postman and TestNG.

## TestNG Report

TestNG report showcases the results of automated tests performed on the API. Refer to the provided screenshot for a comprehensive overview.
![API_TestNG_Report (1)](https://github.com/SourabhGPatil/Capstone-Project/assets/81312909/d4c54384-1a3e-4f26-8224-3ee91ef744c8) - TestNG Report #01 

![API_TestNG_Report (2)](https://github.com/SourabhGPatil/Capstone-Project/assets/81312909/454fb004-94e1-45f4-a3c6-9fa2cee7733d) - TestNG Report #02

For more detailed information and implementation, please refer to the project's source code.



