# AutomationPractice Project
This project is related to an e-commerce website [automationpractice.com](http://automationpractice.com) with the aim of validating it's functionalities.
## Getting Started
These instructions will get you a copy of the project up and running on your local machine for testing purposes:
1. Launch eclipse IDE
2. Click on the 'File' tab at the top left corner of your eclipse screen
3. Select 'Import' from the displayed menu
4. The "select an import wizard screen" is displayed
  * Scroll down the list to search for 'Git' in the options
  * Click on 'Git' to get a drop down list
  * Select "Project from Git"
  * Click on the 'next' button at the buttom of the screen
5. "Select Repository Source" screen will be displayed
 * Select the "Clone URL" option
 * Click on the 'next' button at the buttom of the screen
 6. The "source Git Repository" screen is displayed
 * Type or copy and paste this URL(https://github.com/Moshood-Automation/AutomationPractice.git) into the "URL input box"
 * It will automatically populate the 'Host' and "Repository Path" input fields
 * Click on the 'next' button at the buttom of the screen
 7. The "Branch Selection" screen is displayed
 * The 'master' checkbox will be automatically checked
 * Click on the 'next' button at the buttom of the screen
 8. The "Local Destination" screen is displayed
 *  It will automatically populate the 'Directory' and "Remote name" input fields
 * Click on the 'next' button at the buttom of the screen
9. The "Select a wizard to use for importing projects" screen is displayed
 * The 'Import existing Eclipse projects' radio button will be automatically enabled
 * Click on the 'next' button at the buttom of the screen
 10. The "import projects" screen is displayed
 * Click on the 'finish' button at the buttom of the screen
 * Then the project will be downloaded and displayed on the left hand side of your Eclipse screen under the "Package Explorer" perspective
 ### Prerequisites
 Eclipse IDE have to be or already have been downloaded/installed on your local machine
 ### Running the tests
 This is a maven project integrated with tools/technologies such as selenium, java, Behaviour Diven Development(BDD), cucumber, junit/testng. Maven project allows the user multiple options to run/execute the tests.
 The project structure consists of these folders, packages, files and classes in the hierarchies below:
1. AutomationPractice > src/main/java > com.cucumber.AutomationPractice
2. AutomationPractice > src/test/java > com.cucumber.AutomationPractice > BatchRunner.java > BatchRunner
3. AutomationPractice > src/test/java > com.cucumber.AutomationPractice > Test_Steps.java > Test_Steps > driver and list of scenarios in the class
4. AutomationPractice > src/test/resource > Add-Item-To-Cart-Test.feature ; Checkout-Test.feature; Login-Test.feature; Register-New-User-Test.feature; Search-Test.feature; Twitter-Logo-Test.feature 
5. AutomationPractice > JRE System Library [J2SE-1.5] > List of jars/location
6. AutomationPractice > maven dependencies > List of Dependencies/location
7. AutomationPractice > src > main , test
8. AutomationPractice > target > html(list of html reports) ; json(output.json)
9. AutomationPractice > test-output > Default suite > Default test.html ; Default test.xml ; testng-failed.xml
10. AutomationPractice > junitreports > TEST-com.cucumber.AutomationPractice.BatchRunner.xml
11. AutomationPractice > old > Default suite > List of reports
12. AutomationPractice > pom.xml
13. AutomationPractice > testng.xml

 The tests can be executed in the following ways:
1. #### Running the test classes individually via the editor screen
* Double-click on AutomationPractice or single-click on it's drop-down icon; Double-click on src/test/resource or single-click on it's drop-down icon; Double-click on any of the classes/test cases e.g Login-Test.feature; The scenarios in that class will be displayed on the editor screen; Right-click on the editor screen; Mouse-over "Run As" from list of options; Then click on "Cucumber Feature" and the test will start getting executed.
2. #### Running all the test classes as a batch via the the Package Explorer perspective
* Double-click on AutomationPractice or single-click on it's drop-down icon; Double-click on src/test/java or single-click on it's drop-down icon; Double-click on com.cucumber.AutomationPractice or single-click on it's drop-down icon; Right-click on "BatchRunner.java"; Mouse-over "Run As"; Then click on either "JUnit Test" or "TestNG Test"
3. #### Running all the test classes as a batch via the editor screen
* Double-click on AutomationPractice or single-click on it's drop-down icon; Double-click on src/test/java or single-click on it's drop-down icon; Double-click on com.cucumber.AutomationPractice or single-click on it's drop-down icon; Double-click on BatchRunner.java; The mmethods/contents in that class will be displayed on the editor screen; Right-click on the editor screen; Mouse-over "Run As" from list of options; Then click on either "JUnit Test" or "TestNG Test"
4. #### Running all the test classes as a batch via the projects root/main folder in the Package Explorer perspective
*  Right-click on AutomationPractice; Mouse-over "Run As"; Then click on either "JUnit Test" or "TestNG Test" or "Maven Test"
5. #### Running all the test classes as a batch via the projects pom.xml file in the Package Explorer perspective
*  Double-click on AutomationPractice or single-click on it's drop-down icon; right-click on pom.xml; Mouse-over "Run As"; Then click on "Maven Test"
6. #### Running all the test classes as a batch via the editor screen
* Double-click on AutomationPractice or single-click on it's drop-down icon; Double-click on pom.xml; All the dependencies/contents in that file will be displayed on the editor screen; Right-click on the editor screen; Mouse-over "Run As" from list of options; Then click on "Maven Test"
7. #### Running all the test classes as a suite/batch via the projects testng.xml file in the Package Explorer perspective
* Double-click on AutomationPractice or single-click on it's drop-down icon; right-click on testng.xml; Mouse-over "Run As"; Then click on "TestNG Suite"
8. #### Running all the test classes as a suite/batch via the editor screen
* Double-click on AutomationPractice or single-click on it's drop-down icon; Double-click on testng.xml; All the contents in that file will be displayed on the editor screen; Right-click on the editor screen; Mouse-over "Run As" from list of options; Then click on "TestNG Suite".









