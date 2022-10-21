
                        TELADOC PROJECT

For this project I used IntelliJ IDEA.

1) In order to run this test I import some dependencies in pom.xml.
    a-cucumber-java link: https://mvnrepository.com/artifact/io.cucumber/cucumber-java/7.8.1
    b-cucumber-junit  link: https://mvnrepository.com/artifact/io.cucumber/cucumber-junit/7.8.1
    c-webdrivermanager link: https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.0
    d-selenium java link: https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59

2) Created new package structure for project under 'test.java'.
3) Under the test I crate resources and under the resources I create feature directory to store my feature files.
4) I needed to add plug-in for cucumber and gherkin language from intellij setting.
5) I crate classes and feature files for automate scenarios.
6) When you click the Run Test under the CukesRunner class,
7) First It will check the tag name
8) Then It will check the tage name under the feature file and try to find matching tag names
9) After find the tag name it will take all steps which is under the scenario
10) It will go to step definition package and try to find matching method annotation with scenario steps
11) Then it will start fire the those methods
12) Then It will create report under the target file.