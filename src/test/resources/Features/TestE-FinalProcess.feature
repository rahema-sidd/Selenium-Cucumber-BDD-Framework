Feature: User Reached out at Final Screen

  Scenario: Validate user can see the Thank You screen after checkout on SwagLab
    Given Check if user redirect to page "CompleteTitleField" and it matches the "CompletePageName" from page "SwagLab"
    Then Check to ensure that the message displayed on the "CompleteScreenMsgField" matches the expected message "CompleteScreenMsg" in the "SwagLab"
    And Check if Click on "BackToHomePageBtn" navigates to the Home "ProductTitleField" and it matches the "DashboardPageName" from page "SwagLab"