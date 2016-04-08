[![Testspace](http://www.testspace.com/public/img/testspace_logo.png)](http://www.testspace.com)
***

## Java/TestNG sample for demonstrating Testspace

Sample demonstrates techniques for using Testspace with Java code and the [TestNG](http://testng.org/).

***

[![Build Status](https://travis-ci.org/testspace-samples/java.testng.svg?branch=master)](https://travis-ci.org/testspace-samples/java.testng)
[![Space Health](https://samples.testspace.com/projects/84/spaces/285/badge)](https://samples.testspace.com/projects/84/spaces/285 "Test Cases")
[![Space Metric](https://samples.testspace.com/projects/84/spaces/285/metrics/179/badge)](https://samples.testspace.com/projects/84/spaces/285/metrics#metric-179 "Line/Statement Coverage")

***

Build examples:

<pre>
 mvn clean compile
 mvn cobertura:cobertura -Dcobertura.report.format=xml
</pre>

Publish **`test results`** along with **`code coverage`**

<pre>
 testspace publish ./target/surefire-reports/junitreports/TEST*.xml ./target/site/cobertura/coverage.xml results
</pre>

Checkout the [Space](https://samples.testspace.com/projects/java/spaces/testng).

***

To fork this example using Travis requires:
  - Create an account at www.testspace.com
  - Travis Environment Variables:
    - `TESTSPACE_USER_TOKEN` set to the `value` defined as your [Access token](http://help.testspace.com/using-your-organization:user-settings).
    - `TESTSPACE_URL` set to `my-org-name.testspace.com/my-project/my-space`. Refer [here](http://help.testspace.com/reference:runner-reference#config) for more details. This example uses `samples.testspace.com/cpp/googletest`.
