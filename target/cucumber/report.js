$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/thomsonreuters/grc/accelus/regint/bdd/search/search.feature");
formatter.feature({
  "id": "accelus-search",
  "tags": [
    {
      "name": "@search",
      "line": 1
    }
  ],
  "description": "AS A User\nI WANT TO perform a search using the google search engine for the term Thomson Reuters\nSO THAT I can investigate the returned search results",
  "name": "Accelus Search",
  "keyword": "Feature",
  "line": 2
});
formatter.before({
  "duration": 298076913,
  "status": "passed"
});
formatter.scenario({
  "id": "accelus-search;a-user-searches-for-thomson-reuters",
  "description": "",
  "name": "A user searches for Thomson Reuters",
  "keyword": "Scenario",
  "line": 7,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the google search page",
  "keyword": "Given ",
  "line": 8
});
formatter.step({
  "name": "I search for the term \"Thomson Reuters\"",
  "keyword": "When ",
  "line": 9
});
formatter.step({
  "name": "the Thomson Reuters company website link is returned within the results",
  "keyword": "Then ",
  "line": 10
});
formatter.match({
  "location": "SearchStepDef.navigateToSearch()"
});
formatter.result({
  "duration": 733929734,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thomson Reuters",
      "offset": 23
    }
  ],
  "location": "SearchStepDef.I_search_for_the_term(String)"
});
formatter.result({
  "duration": 11188682,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDef.the_Thomson_Reuters_company_website_link_is_returned_within_the_results()"
});
formatter.result({
  "duration": 87203,
  "status": "passed"
});
formatter.after({
  "duration": 199029,
  "status": "passed"
});
});