# TradeInstDetails - Project
This project is built using BDD framework using Cucumber. This will generate HTML and JSON reports. It is a very basic project and will just give you the trade details as per the dates provided by the user.

### Installation (pre-requisites)
1. JDK 1.8+ (make sure Java class path is set)
2. Maven (make sure .m2 class path is set)
3. Eclipse
4. Eclipse Plugins for
    - Maven
    - Cucumber
    - Selenium
5. Browser driver (make sure you have your desired browser driver and class path is set)-- Not required in my code. though it can be used if any Application URL is used

### Framework set up
Clone repository from (https://github.com/erikachakraborty/CucumberProject) or download zip and set it up in your local workspace.

### Run Your Tests
For this project, we will directly run from TestRunner.java file(Maven setup instruction is not provided)

Generally we can follow the following steps to run:
For windows OS and navigate to the project directory. Open cmd and do the following:
type `mvn clean test` command to run features. With this command it will invoke the browser and will execute the tests.

- To run features on specific browser use, `mvn test "-Dbrowser=browser_name"`
browser_name can be one of following but make sure that browser’s driver file are present and specified in system variable.

### Reporters
Once you ran your tests you can generate the various types of reports. Here you can open the HTML file present in 'target' folder.


### Develop automation scripts using BDD approach - Cucumber-Java
- We write the features file giving extension as ".feature". For Eg: `TradeData.feature`.
- Tests are written in the Cucumber framework using the Gherkin Syntax. It follows the pattern of Given,When,Then format with few other keywords.
- Then we create the Step definition to each of the feature file using GWT format. It acts as a glue code for every feature.file. Eg: `/stepdefinitions/TradeDataStepDefinitions.java`
- Ultimately we write the logic of each and every step in the files.

**********************************************************************************************************************************

All about the "TradesInstDetails" Cucumber Project
(Import as a Maven project)

Project contains the following files:
1. trades.txt - contains dummy trade data
2. inst.txt - contains dummy instrument data
3. TestRunner.java - Project can be run using this runner file file
4. TradeData.feature - Test cases is written here in gherkin language.
5. TradeDataStepDefinition.java - Correspnding glue code of feature file.
6. Instrument.java, Trade.java, TradeDataDisplay.java - files used for writing the codes related to reading of data and accordingly manupulating the same in order to get results.
