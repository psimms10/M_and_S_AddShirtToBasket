Feature: As a customer, I wish to view the contents of my bag prior to checkout
  Adding a shirt in this which is defined during the steps. This could come from here and make
  more generic. Eg adding an item and having the URl/ Product ID as a scenario outline from here

Scenario: Add shirt to bag and view bag
  Given I have added a shirt to my bag
  When I view the contents of my bag
  Then I can see the contents of the bag include a shirt