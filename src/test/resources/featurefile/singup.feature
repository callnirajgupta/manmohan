@singup @regerssion
  Feature: login

    Scenario Outline: verify user is able to move to personal details page after filling mandatory fields
      Given user navigates to home page
      When user click on start application button in home page
      And user enter mandatory data for field "<First Name>" and "<Middle Name>" and "<Last Name>" and "<Programme Type>" and "<Gender>" and "<Nationality>" and "<HearAboutUs>" and "<Mobile Number>" and "<Email address>" and "<Password>" and "<Confirm Password>" and "<Captcha>"
      And user click start application button
      Then user should navigate to personal details page

      Examples:
        | First Name    | Middle Name    | Last Name    | Programme Type                                                   | Gender | Nationality | HearAboutUs | Mobile Number | Email address | Password | Confirm Password | Captcha |
        | testFirstName | testMiddleName | TestLastName | Diploma in Jewellery Design Technology                           | M      | India       | TV          | +919241521992 | auto          | password | password         | yes     |

