Scenario
You are given a schedule for recurring reports to be sent. The schedule can be the nth day of every month or the nth day of every quarter, where n is provided and quarters are aligned on January, April, July, and October. Given today’s date and a schedule, determine the next date that the report should be sent. A collection of date utility functions that may be useful is provided at the top of the script.

Syntax
Schedule Type	Schedule Day	Interpretation
M	            15	            Report is sent on the 15th day of every month
Q	            15	            Report is sent on the 15th day of every quarter

Example
Current Date	Schedule Type	Schedule Day	Returns
7-Oct-2022	    M	            15	            15-Oct-2022
20-Oct-2022	    M	            15	            15-Nov-2022
20-Nov-2022	    Q	            15	            15-Jan-2023