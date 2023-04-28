##NHSBSA COST ONLINE SERVICE##

selenium-cucumber: Automation Testing Using Java
selenium-cucumber is a behavior-driven development (BDD) approach to writing automation test scripts to test Web. 
It enables you to write and execute automated acceptance/unit tests. It is cross-platform, open source, and free. 
Automate your test cases with minimal coding.

Installation (pre-requisites)
    - JDK 17 (Make sure Java classpath is set)
    - Maven (make sure .m2 classpath is set)
    - Eclipse or IntelliJ 

Download a Framework from :
https://github.com/RajashreeZaware-NHSBSA/RajashreeZaware-NHSBSA

The report will be generated tо directory: \target\cucumber-reports and you can view it locally.

Running Test through command line in Chrome browser:
mvn -Dtest=TestRunner -Dbrowser=chrome test

Running Test through command line in Firefox browser:
mvn -Dtest=TestRunner -Dbrowser=firefox test

HTML Report:
To generate an HTML report use mvn test -Dcucumber.options="–plugin html:target/result.html"

JSON Report:
To generate a JSON report Use mvn test -Dcucumber.options="–plugin json:target/result.json"
