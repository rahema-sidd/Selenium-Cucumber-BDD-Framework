Feature: User Checkout Validation

  Scenario: Validate user is able to Checkout on SwagLab after Added items into Cart
    Given Check if user navigates to page "CheckoutTitleField" and it matches the "CheckoutPageName" from page "SwagLab"
    When Check if User enter "firstnameData" on "firstnameField" from page "SwagLab"
    And Check if User enter "lastnameData" on "lastnameField" from page "SwagLab"
    And Check if User enter "zipcodeData" on "zipcodeField" from page "SwagLab"
    And Check User is able to click on "continueBtn" from page "SwagLab"
    Then Check if "TotalAmountField" and it matches the "ExpectedTotalAmount" from page "SwagLab"
    And Check User is able to click on "finishBtn" from page "SwagLab"