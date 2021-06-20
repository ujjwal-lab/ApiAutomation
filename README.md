# Api Automation
 
This project is written in Java and uses Cucumber(gherkin-BDD) alonwith an open source automation tool Rest Assured. This project will serve an example of implementing a API test project with Rest Asured and Maven. Everything is set up and tests can be added straight away. 

#**Prerequisites**
>=JDK8 installed

#**Used tools and frameworks**
Rest-Assured
Maven repository
TestNG
Cucumber

#**IDE**
Eclipse
Install testng in eclipse

#**Framework Structure**

Fetaure Files: Feature files has all the scenarios given in the problem statement. A single feature file 'apitesting.feature' conatins all the three scenarios with examples. The feature file has @tag at feature level in order to run the whole feature as well as tags are present at scenairo level to enable execution at scenario level. The feature file is present in location 'src/test/resoucres' .

Step Definition: There are two step definition files one for a positive scenairo and another for neagtive scenairo. The steps defintion just makes calls to the specific API method function. Step definition can be found at /src/test/java at com.qa.stepdef package

Api Method Class : This class implement all the function related to API method call and other asserstion that needs to be done. In future based on api endpoints more such Api Method class needs to created for testing those endpoints.

Single Class instance: This is singleton implementation for all the Api method classes. This is done in order to have same single instance of class across the Step definitions and no duplicate instances are created of Api method class everytime a call is made to same Api method class from different Step definition class.

Base Test Class: This class has Before Hook and is for initializing singleton class.

Runner: Runner class uses Testng execution feature by extending to AbstractTestNGCucumberTests.

Utility: Utility classes are created for common operation like loading of various properties and data file

Test Data: Test data is used stored in a .json format and present under 'src/test/resources'

#**How to execute**
The test suite can be executed at two level
1. IDE level

Run the testng.xml file from the IDE and it will trigger the execution of the feature

2. Command line.

Naviagte to the project repo in your local and run below command. This same command can be used in the CICD tool
mvn clean test

#**Reporting**
The test generate two reports one in HTML and another in .Json format

Html report : target/cucumber-html-report/index.html

Json report : target/cucumber-reports/cucumber.json
