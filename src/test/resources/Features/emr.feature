Feature: EMR features

Scenario: user login
Given Navigate onto EMR website
When Update username as "admin"
And update Password as "pass"
And click on login button
When Navigate onto Patient/Client
When choose New/Search
And Add the firstname, lastname
And Update DOB as todays date (According to IST)
And Update the Gender
And click on the create new patient button
And click on confirm create new patient button
And validate the alert message

And close the birthday wishes message
And Choose Billy Smith from Menu bar at the right corner
And Click on Log Out
Then should display message as "Test Passed"



