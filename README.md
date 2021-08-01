#LigaTest (Java + Selenide + TestNG + Allure)

Simple template for automated end-to-end testing.


Java
Selenide
TestNG
Allure


Pages are created in one place - PageBuilder
AppConfig class stores the settings of the web application under test 
All pages are created in the constructor of the App class.

Run test - `mvn test -Dbrowser=chrome -Dheadless=1` or just `mvn test`

**parameters:**

- `browser` - chrome or firefox. default - chrome 
- `headless` - 0 or 1. default - 0

Generate allure report  - `allure serve target/allure-results`
