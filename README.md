[![Testspace](http://www.testspace.com/public/img/testspace_logo.png)](http://www.testspace.com)
***

## Java/TestNG sample for demonstrating Testspace

Sample demonstrates techniques for using Testspace with Java code and the [TestNG](http://testng.org/).

***

[![Build Status](https://travis-ci.org/testspace-samples/java.testng.svg?branch=master)](https://travis-ci.org/testspace-samples/java.testng)
[![Space Health](https://samples.testspace.com/projects/88/spaces/325/badge)](https://samples.testspace.com/projects/88/spaces/325 "Test Cases")
[![Space Metric](https://samples.testspace.com/projects/88/spaces/325/metrics/228/badge)](https://samples.testspace.com/projects/88/spaces/325/metrics#metric-228 "Line/Statement Coverage")

***

Build examples:

<pre>
 mvn clean compile
 mvn cobertura:cobertura -Dcobertura.report.format=xml
</pre>

Publishing results example:

<pre>
 testspace publish target/surefire-reports/TEST-TestSuite.xml target/site/cobertura/coverage.xml
</pre>

Checkout the [Space](https://samples.testspace.com/projects/java/spaces/testng).

***

To fork this example using Travis requires:
  - Create an account at www.testspace.com
  - Travis Environment Variables:
    - `TESTSPACE_USER_TOKEN` set to the `value` defined as your [Access token](http://help.testspace.com/using-your-organization:user-settings).
    - `TESTSPACE_URL` set to `my-org-name.testspace.com/my-project/my-space`. Refer [here](http://help.testspace.com/reference:runner-reference#config) for more details.
