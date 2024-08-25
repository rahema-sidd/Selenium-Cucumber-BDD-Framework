# Selenium Cucumber Framework with Maven

This project is a Selenium Cucumber-based test automation framework using Maven. It is designed to automate end-to-end testing for the Swag Lab application. The framework supports Behavior-Driven Development (BDD) with feature files, step definitions, and a test runner. The test results include comprehensive reports with attached screenshots for precise documentation of test outcomes.

## Table of Contents

- [Project Structure](#project-structure)
- [Setup Instructions](#setup-instructions)
- [Running Tests](#running-tests)
- [Reporting](#reporting)
- [Dependencies](#dependencies)
- [Contributing](#contributing)
- [License](#license)

## Project Structure

The project structure follows a standard Maven project layout with the following directories and files:

### Key Directories and Files:
- **PageFactory**: Contains page object classes that represent different pages of the application.
- **StepDefinition**: Contains the step definitions corresponding to the Gherkin steps in feature files.
  - **AddToCart**: Handles steps related to adding items to the cart.
  - **Checkout**: Manages steps for the checkout process.
  - **FinalProcess**: Final processing steps for completing a transaction.
  - **Hooks**: Contains setup and teardown methods for scenarios.
  - **Login**: Handles login-related steps.
  - **ReadProperties**: Utility to read configuration properties.
  - **Utility**: Additional helper methods.
  - **ViewItems**: Handles steps related to viewing items.
- **TestRunner**: Configures the test execution.
- **Drivers**: Place to store WebDriver executables.
- **Features**: Contains Cucumber feature files written in Gherkin syntax.
  - **TestA-Login.feature**: Tests related to login functionality.
  - **TestB-ViewItems.feature**: Tests for viewing items.
  - **TestC-AddToCartItems.feature**: Tests for adding items to the cart.
  - **TestD-CheckOut.feature**: Tests for the checkout process.
  - **TestE-FinalProcess.feature**: Final process steps to complete the purchase.
- **Locators**: Contains property files for element locators.
  - **SwagLab.properties**: Locators for the Swag Lab application.
- **TestData**: Contains test data files.
  - **SwagLab.properties**: Test data specific to the Swag Lab application.
- **extent.properties**: Configuration file for the Extent reporting tool.

## Setup Instructions

1. **Clone the repository:**
   ```bash
   git clone https://github.com/rahema-sidd/Selenium-Cucumber-BDD-Framework.git
   cd selenium-cucumber-framework
