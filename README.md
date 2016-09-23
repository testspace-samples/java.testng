[![Testspace](http://www.testspace.com/public/img/testspace_logo.png)](http://www.testspace.com)
***

## Java/TestNG sample for demonstrating Testspace

Sample demonstrates techniques for using Testspace with Java code and the [TestNG](http://testng.org/).

***

Using Multiple Online CI Services:

[![Build Status](https://travis-ci.org/testspace-samples/java.testng.svg?branch=master)](https://travis-ci.org/testspace-samples/java.testng)
[![CircleCI](https://circleci.com/gh/testspace-samples/java.testng.svg?style=svg)](https://circleci.com/gh/testspace-samples/java.testng)
[![Run Status](https://api.shippable.com/projects/570770c52a8192902e1bc922/badge?branch=master)](https://app.shippable.com/projects/570770c52a8192902e1bc922)


***
Publishing **Test Content** using www.testspace.com.

[![Space Health](https://samples.testspace.com/projects/125/spaces/456/badge)](https://samples.testspace.com/projects/125/spaces/456 "Test Cases")
[![Space Metric](https://samples.testspace.com/projects/125/spaces/456/metrics/299/badge)](https://samples.testspace.com/spaces/456/schema/Code%20Coverage "Code Coverage (branches)")
[![Space Metric](https://samples.testspace.com/projects/125/spaces/456/metrics/301/badge)](https://samples.testspace.com/spaces/456/schema/Code%20Coverage "Code Coverage (methods)")
[![Space Metric](https://samples.testspace.com/projects/125/spaces/456/metrics/333/badge)](https://samples.testspace.com/spaces/456/schema/Static%20Analysis "Static Analysis (issues)")


***

***

Build examples:

<pre>
 mvn clean compile
 mvn pmd:pmd
 mvn cobertura:cobertura -Dcobertura.report.format=xml
</pre>

Publishing results example:

<pre>
testspace target/pmd.xml [Tests]target/surefire-reports/TEST-TestSuite.xml target/site/cobertura/coverage.xml $TESTSPACE_TOKEN/$BRANCH_NAME
</pre>

Checkout the [Space](https://samples.testspace.com/projects/java.testng).

***

To replicate this sample: 
  - Account at www.testspace.com.
  - CI Environment Variable called **TESTSPACE_TOKEN** required:
    -  `TESTSPACE_TOKEN` = `credentials@my-org-name.testspace.com/my-project`
    - `credentials` set to `username:password` or your [access token](http://help.testspace.com/reference:client-reference#login-credentials).
    - `my-org-name.testspace.com/my-project` based on your *organization* (subdomain) and *project* names.  
