Feature: User Selects Items

  Scenario: User is able to Select Items and Add them to the cart
    Given Check if user navigate to "ProductTitleField" and it matches the "DashboardPageName" from page "SwagLab"
    When Verify if the user able to click on "addToCartBtn1" from page "SwagLab"
    When Verify if the user able to click on "addToCartBtn2" from page "SwagLab"
    When Verify if the user able to click on "addToCartBtn3" from page "SwagLab"
    When Verify if the user able to click on "addToCartBtn4" from page "SwagLab"
    When Verify if the user able to click on "addToCartBtn5" from page "SwagLab"
    When Verify if the user able to click on "addToCartBtn6" from page "SwagLab"
    Then Verify "addToCartIcon" Product count matches to "expectedCount" from page "SwagLab"
    And Check if User click on "addToCartIcon" from page "SwagLab"




