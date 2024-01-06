@search
Feature: Search

  Background: Load landing page
    Given user navigates to "othaimMall"

  @sanity # WSDK-750
  Scenario: As a Web SDK user, I should see the POI is centered and highlighted on the map and Level Selector is updated, When I click on a POI in the search results
    Given I should see "GF" text in the "Level Selector Title"
    When I type "starbucks" into "Search Input"
    And I click on "First Search Result"
    Then "Take me there Button - POI Details Modal" should be displayed
    And I should see "1" highlighted POI on the map
    And I should see "2F" text in the "Level Selector Title"