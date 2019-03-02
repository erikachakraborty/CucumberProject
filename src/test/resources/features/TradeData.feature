Feature: To fetch Trade data
@Trade
Scenario Outline: Instrument wise traded volume between the date range
Given the user reads the trade files
When the user provides the dates FromDate "<toDate>" and ToDate "<fromDate>" to filter the data
Then he gets the trade results of Instruments according to date   

Examples:
| toDate		| 	fromDate 			|
|30/04/2017 13:10:00	|	30/08/2017 12:00:00	| 
|20/07/2017 13:11:01	|	30/12/2017 12:00:00	| 
|20/12/2018 13:11:01	|	30/04/2019 12:00:00	|                                    