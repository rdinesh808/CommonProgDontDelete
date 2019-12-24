@Important
Feature: Cucumber Learn

@Smoke
Scenario Outline: scenario description
    Given Open a Browser with <url>
    When Enter <username> and <password> then click loginbutton
    Then Navigate to CarePlan App and Enter <pateintid>
    
    
Examples:
| url | username | password | patientid | 
|https://hhcuat.gsihealth.net| prabhaharan.velu@gsihealth.com | Imax123# | 555 | 