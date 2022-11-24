# spring-boot-mvc-crud
Reference (Original Post) : https://javatechonline.com/spring-boot-mvc-crud-example/

When we develop a Web Application using Spring Boot, the knowledge of MVC pattern becomes important. 
Needless to say, the MVC is a short form of Model, View and the Controller.

Moreover, the Spring Boot makes a developer’s life easier in developing the web application using MVC architecture. 
Spring Boot offers us a starter project ‘Spring web’ to work with MVC applications.

In this example, we are going to learn entire CRUD operations that are mandatory to develop any MVC application. 
It will also provide you the knowledge of complete flow of MVC starting from user interface till the data layer. 
Hence our article title is ‘Spring Boot MVC CRUD Example’.
We will make use of Thymeleaf, Bootstrap for view part and MySQL for database.

Let’s discuss our topic ‘Spring Boot MVC CRUD Example’ and the related concepts.


What is MVC? 
  Before starting the implementation of Spring Boot MVC CRUD example, it is important to know what the MVC is all about.
  Model–View–Controller (usually known as MVC) is a software design pattern popularly used for developing web applications. 
  It divides the related programming logic into three interrelated components. 
  The three components are Model, View, and the Controller.

* Model: Model is the central component of the pattern. It is the application’s dynamic data structure, independent of the user interface. 
  Model directly manages the data, logic and business rules of the application.
  
* View:
  Any representation of information that an end user can see, such as forms, text boxes, drop-downs, charts, diagrams or tables. 
  Multiple views of the same information are also possible, such as a bar chart, pie chart and a tabular representation of a particular data. 
  Even excel and pdf reports are also considered as part of the View.

* Controller: 
  The controller accepts requests from the user and converts it into commands for the model or view to get the response for the user. 
  Moreover, it acts as an interface between Model and View components to process all the incoming requests from the user.
  
  
Interaction among the three Components: 
  1) The model is responsible for managing the data of the application. It receives user input from the controller.
  2) The view renders presentation of the model in a particular format.
  3) The controller responds to the user input and performs interactions with the data model objects. Moreover, it receives the input, optionally validates it and then passes the input to the model.
     
Why to use the MVC Pattern?
  Before going through the implementation of ‘Spring Boot MVC CRUD Example’, let’s understand why to use the MVC pattern. 
  There are multiple reasons to use MVC pattern. Some of them are as below:
  
  1) Separation of Concerns - Separation of Concern is one of the core advantages of an MVC Pattern. The MVC pattern provides a clean separation between the UI, Business Logic, Model or Data. On the other hand, we can also say it provides a separation of Programming logics for various components.
  2) Easy to modify – Because of the separation of responsibilities, future development or modification becomes easier and in turn it increases the scalability of the software.
  3) Simultaneous development — Multiple developers can work simultaneously on the model, controller and views separately as per their area of expertise.
  4) Low coupling — The MVC pattern offers low coupling between its components.
  5) High cohesion — It provides high cohesion such as it enables logical grouping of related actions on a controller together. The views for a specific model are also grouped together.
     
     
