Feature: User Selects Items Added to Cart

  Scenario: Verify User Selected Items Added in the Card or not
    Given Check if user navigate to page "CartTitleField" and it matches the "CartPageName" from page "SwagLab"
    When Verify if user added "product1Field" into the cart must named as "product1" from page "SwagLab"
    And Verify if user added "product2Field" into the cart must named as "product2" from page "SwagLab"
    And Verify if user added "product3Field" into the cart must named as "product3" from page "SwagLab"
    And Verify if user added "product4Field" into the cart must named as "product4" from page "SwagLab"
    And Verify if user added "product5Field" into the cart must named as "product5" from page "SwagLab"
    And Verify if user added "product6Field" into the cart must named as "product6" from page "SwagLab"
    Then Check if User able to click on "CheckoutBtn" from page "SwagLab"