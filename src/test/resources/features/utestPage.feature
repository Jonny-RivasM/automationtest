#Autor: Jonny Rivas Montaño
@stories
Feature: utest Page
  As a user, I want to create an account on utestcom
  @scanario1
    Scenario: Create an account on utestcom
     Given than Jaime wants to create an account on utestcom, he needs to click on the button Join Today
     When he watch the register form to create an account
       | strFirstName | strLastName | strEmail               | strBirthMonth | strBirthDay | strBirthYear | strLanguages | strCity | strZip | strCountry | strComputer | strVersion | strLanguageComputer | strPassword   | strConfirmPassword | checkboxStayInfo | checkboxConduct | checkboxPSP |
       | Jaime        | Moralez     | jmoralez@sincorreo.com | April         | 23          | 1988         | Spanish      | Cali    | 760030 | Colombia   | Windows     | Windiws 10 | Spanish             | SinPass123456 | SinPass123456      | TRUE             | TRUE            | TRUE        |
    Then he can fill out the form and after register, he redirects to welcome page