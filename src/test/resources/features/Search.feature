@UI
Feature: Search box functionality

  Background:
    Given user is on the commerce decisions support home page

Scenario: user enters data
  When user enters "jaggaer" and click search button
  And user clicks "No Evidence items exist" in the title
  Then user should see image with data id "80119448694"

