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

Feature: FaceBook Login 
  We will be logging into facebook

  @tag1
  Scenario: Log in to Facebook
    Given You are on facebook page
    When you enter username and password
    Then user should be at homepage
    
  @main
  Scenario Outline: Log in to Facebook with Examples
    Given You are on facebook page
    When you enter username '<username>'
    And you enter password '<password>'
    Then user should be at homepage

    Examples: 
      | username               | password |
      | 2310strygwyr@gmail.com | 12345667 |
      | 2310strygwyr@gmail.com | 12345667 |
