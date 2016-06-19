#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
Feature: Login to the mahara site


	
@tag1
Scenario Outline: Valid login to mahara site111
Given I am on the login page
	When I enter "<usern>" and "<pwd>"
	Then I see wecome message
Examples:
|usern   |pwd     |
|student2|Testing1|
|tutor   |Testing1| 


@tag2
Scenario: Valid login to mahara site
Given I am on the login page
	When I enter username and passowrd
	Then I see wecome message