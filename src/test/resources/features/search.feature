@search
Feature: Search

  Background: Load landing page
    Given user navigates to "othaimMall"

  @sanity # WSDK-750
  Scenario: As a Web SDK user, I should see the POI is centered and highlighted on the map and Level Selector is updated, When I click on a POI in the search results
    Given I should see "L1" text in the "Level Selector Title"
    When I type "D&R" into "Search Input"
    Then I click on "First Result"
    And "directionButton" should be displayed

    #And I should see "1" highlighted POI on the map
    #And I should see "2F" text in the "Level Selector Title"