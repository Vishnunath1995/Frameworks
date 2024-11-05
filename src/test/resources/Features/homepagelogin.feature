@smoke
Feature: Verify the login functionality of FB Home page
Background:
Given the user should be in face book login page
@sanity
Scenario: Verify the login with valid user invalid pass details

When the user has to fill username and password 
|vishnunath|123245|
Then user click on the "login" button
And the user verify the invalid page "privacy"

@regression
Scenario: Verify the login with invalid user invalid pass details

When the user has to fill username and password 
|Gokulnath|123245|
Then user click on the "login" button
And the user verify the invalid page "privacy"

@retest
Scenario Outline: Verify the login with invalid user valid pass details

When the user has to fill "<username>" and "<password>" 
Then user click on the "login" button
And the user verify the invalid page "privacy"
Examples:
|username|password|
|priya|priya123|
|varsha|varsha123|