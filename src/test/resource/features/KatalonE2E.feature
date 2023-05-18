Feature: KatalonEcommerce

  E2E flow for Katalon Ecommerce Application


  Scenario: Adding product in Cart
    Given User launches the URL 'https://cms.demo.katalon.com/'
    And  I add four random items to my cart
    When  I view my cart
    Then   I find total four items listed in my cart
