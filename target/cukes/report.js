$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/mands/bdd/search/ViewContents.feature");
formatter.feature({
  "line": 1,
  "name": "As a customer, I wish to view the contents of my bag prior to checkout",
  "description": "Adding a shirt in this which is defined during the steps. This could come from here and make\nmore generic. Eg adding an item and having the URl/ Product ID as a scenario outline from here",
  "id": "as-a-customer,-i-wish-to-view-the-contents-of-my-bag-prior-to-checkout",
  "keyword": "Feature"
});
formatter.before({
  "duration": 79950917,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Add shirt to bag and view bag",
  "description": "",
  "id": "as-a-customer,-i-wish-to-view-the-contents-of-my-bag-prior-to-checkout;add-shirt-to-bag-and-view-bag",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I have added a shirt to my bag",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I view the contents of my bag",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I can see the contents of the bag include a shirt",
  "keyword": "Then "
});
formatter.match({
  "location": "ViewContents.I_have_added_a_shirt_to_my_bag()"
});
formatter.result({
  "duration": 10365846417,
  "status": "passed"
});
formatter.match({
  "location": "ViewContents.I_view_the_contents_of_my_bag()"
});
formatter.result({
  "duration": 1867986941,
  "status": "passed"
});
formatter.match({
  "location": "ViewContents.I_can_see_the_contents_of_the_bag_include_a_shirt()"
});
formatter.result({
  "duration": 7365292945,
  "status": "passed"
});
formatter.after({
  "duration": 33832,
  "status": "passed"
});
});