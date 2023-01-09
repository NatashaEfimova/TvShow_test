Feature: TV show broadcast confirmation

  Background: im on website homepage
    Given openSite "https://tv-guide.walla.co.il/"


  Scenario: TV show search

    When user wants to find a tv show
    And he clicks on the button first channel
    Then he clicks on the button "evening"
    Then he sees the show on thursday at 21-15



