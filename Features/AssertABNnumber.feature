Feature: AssertABNnumber

  Scenario: Assert ABN Number
    Given Launch the Browser
    And I Open the FreeView web "https://www.freeview.com.au"
    When I navigate to WatchTV page from the Navigation bar
    And Find and Click on Privacy Notice at bottom of the page
    Then I validate the ABN number with this "72 130 448 510"
