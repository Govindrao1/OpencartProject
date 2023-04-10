Feature: opencart site registration page testing

  Scenario Outline: User validate the whether the registration page working or not
    Given user open the  browser
    When the opencart site launch "https://demo.opencart.com/index.php?route=account/login&language=en-gb"
    Then user checks whether the site is open correctly or no "Register Account"
    Then user fill the registration fields with "<FIRSTNAME>","<LASTNAME>","<EMAIL>","<PASSWORD>"
    Then user click the privacy policy and click continue button
    Then close the browser

    Examples: 
      | FIRSTNAME | LASTNAME   | EMAIL           | PASSWORD |
      | abdul     | kalam      | kalam@gmail.com | abdul123 |
      | govind    | %^&^&12345 | govind123       | naidu    |
      | jagadeesh | pydisetti  | jagadsh2345     | pydi1234 |
