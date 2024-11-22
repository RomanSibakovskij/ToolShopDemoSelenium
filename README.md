# ToolShopDemoSelenium

Simple Selenium test suite on user account registration/login/logout/basic product addition to cart functionality. The test suite captures screenshots at the end of test case run (for logging purposes).

#Important note: Due to the inability of the website to store user account data for longer than 20-30 seconds (it gets erased and user logged out WITHOUT any prior notice / actions), further testing of the website UI is aborted until the developers will fix the issue.

#Tech Requirements:
 1.Java JDK 8 or higher 
 
 2.Apache Maven 
 
 3.IntelliJ IDEA (or another IDE that supports Java and Maven)

#Setup

1. Clone this repository into IntelliJ(or other IDE) workspace folder (or wherever the project can be launched by IDE)
2. Open the IDE and open the project folder
3. Navigate to the pom.xml file and install all required dependencies for the test run
4. Run the test suite on the IDE

## Test Case List


1.  Test 001: User navigation to the sign-up page test

//valid user account creation test

1.  Test 002: Valid user account creation test

//negative user account creation tests

1.	Test 002a: Invalid user account creation test (no first name)
2.	Test 002b: Invalid user account creation test (no last name)
3.	Test 002c: Invalid user account creation test (no birthdate)
4.	Test 002d: Invalid user account creation test (no user address)
5.	Test 002e: Invalid user account creation test (no user post code)
6.	Test 002f: Invalid user account creation test (no user city)
7.	Test 002g: Invalid user account creation test (no user state)
8.	Test 002h: Invalid user account creation test (no user country)
9.	Test 002i: Invalid user account creation test (no user phone number)
10.	Test 002j: Invalid user account creation test (no user email address)
11.	Test 002k: Invalid user account creation test (no password)

//too short singular input tests

1.	Test 002l: Invalid user account creation test (too short first name)
2.	Test 002m: Invalid user account creation test (too short last name)
3.	Test 002n: Invalid user account creation test (too short user address)
4.	Test 002o: Invalid user account creation test (too short user post code)
5.	Test 002p: Invalid user account creation test (too short user city)
6.	Test 002q: Invalid user account creation test (too short user state)
7.	Test 002r: Invalid user account creation test (too short user phone)
8.	Test 002s: Invalid user account creation test (too short user email)
9.	Test 002t: Invalid user account creation test (too short password)

//invalid singular input format tests

1.	Test 002u: Invalid user account creation test (invalid user phone format)
2.	Test 002v: Invalid user account creation test (invalid user email format)
3.	Test 002w: Invalid user account creation test (already used user email)
4.	Test 002x: Invalid user account creation test (invalid password format)
5.	Test 002y: Invalid user account creation test (invalid birthdate format)

//too long singular input tests

1.	Test 002z: Invalid user account creation test (too long first name)
2.	Test 002aa: Invalid user account creation test (too long last name)
3.	Test 002ab: Invalid user account creation test (too long user address)
4.	Test 002ac: Invalid user account creation test (too long user post code)
5.	Test 002ad: Invalid user account creation test (too long user city)
6.	Test 002ae: Invalid user account creation test (too long user state)
7.	Test 002af: Invalid user account creation test (too long user phone)
8.	Test 002ag: Invalid user account creation test (too long user email)

//valid login test

1.  Test 003: Valid user login test

//negative login tests

1.	Test 003a: Invalid user login test (no login email)
2.	Test 003b: Invalid user login test (no login password)
3.	Test 003c: Invalid user login test (invalid login email)
4.	Test 003d: Invalid user login test (invalid login email format)
5.	Test 003e: Invalid user login test (invalid login password)

//user logout test

1.  Test 004: Valid user logout test

//add single product to cart test

1.  Test 005: Add bolt cutters product to cart test (test aborted due to fatal bug causing user logout after 20-30 seconds and inability to log back in with valid credentials)

