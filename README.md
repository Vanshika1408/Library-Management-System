Title- Library Management System

1. Methodology

The project is build on Apache Netbeans in core java and java swing. The first and foremost task is to identify the day-to-day operations of the library. After these are identified, the classes are created for different operations- login, signup, home page containing all the operations. The next task is to connect the java classes to the sql using JDBC so that the data at backend can be accessed. Then . All the pages are linked to one another in a specific order. 

<img width="583" alt="flowchart" src="https://user-images.githubusercontent.com/91916983/208253381-8fa1b7b8-e4d2-40ce-a2ae-cab8ac603728.png">

2. Description

The frontend contains a total of 14 .java classes and a sql database. 

The classes are named as:
a. Connecting.java b. Library.java c. UserLogin.java d. Home.java e. AddBook.java f. AddStudent.java g. BookDetails.java h. IssueBook.java i. ReadMe.java 
j. ReturnBook.java k. Statistics.java l. StudentDetails.java m. aboutUs.java n. signup.java

<img width="152" alt="classes" src="https://user-images.githubusercontent.com/91916983/208253428-956b487a-4e01-49c6-ab50-2d46c2cdc6f7.png">

The backend in mysql has database named librarymanagement and 5 tables are created:
a. account b. book c. issuebook d. returnbook e. student
The frontend is connected to backend via JDBC in the connecting class.

<img width="298" alt="sql" src="https://user-images.githubusercontent.com/91916983/208253445-08514eea-21d1-48f1-9821-7ab5e47c8b17.png">


3. Input/Output

The user inputs his/her userid and password which is authenticated by the backend sql server. For the new user, signing up option is there. There is also an option of forget password which authenticates the user using a security question (asked during the signup process). 
So, the user enters his/her details and gets home page access in the output. 

4. Live link

https://github.com/Vanshika1408/Library-Management-System

5. Screenshots

<img width="734" alt="front" src="https://user-images.githubusercontent.com/91916983/208252942-4ff64253-0229-401a-a8b0-9be5d3217737.png">

<img width="298" alt="sql" src="https://user-images.githubusercontent.com/91916983/208252967-77a97f42-2806-4829-8861-bf9b88cbf38e.png">

<img width="479" alt="sql1" src="https://user-images.githubusercontent.com/91916983/208253082-61950bac-9dcf-43c3-bda2-126433672811.png">

<img width="433" alt="login" src="https://user-images.githubusercontent.com/91916983/208252980-b1ff4af9-815c-413e-a371-6b25a69bceee.png">

<img width="502" alt="home" src="https://user-images.githubusercontent.com/91916983/208252984-ed99c1f3-c7b4-44a7-8a96-30601bb16a49.png">
