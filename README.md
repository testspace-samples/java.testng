[![Testspace](https://www.testspace.com/img/Testspace.png)](http://www.testspace.com)

***

## Java/TestNG sample for demonstrating Testspace

Sample demonstrates techniques for using Testspace with Java code and the [TestNG](http://testng.org/).
  * Using a Testspace Project that is `connected` with this GitHub Repo
  * Using 3 Online CI services for demonstration purposes only
  * Can review the Results at [testspace-samples:java.testng](https://samples.testspace.com/projects/testspace-samples:java.testng)  
  * Refer to our [Getting Started](https://help.testspace.com/getting-started) help articles for more information

***

Using Multiple Online CI Services:

[![Build Status](https://travis-ci.org/testspace-samples/java.testng.svg?branch=master)](https://travis-ci.org/testspace-samples/java.testng)
[![CircleCI](https://circleci.com/gh/testspace-samples/java.testng.svg?style=svg)](https://circleci.com/gh/testspace-samples/java.testng)
[![Run Status](https://api.shippable.com/projects/570770c52a8192902e1bc922/badge?branch=master)](https://app.shippable.com/projects/570770c52a8192902e1bc922)


***
Publishing **Test Content** using www.testspace.com.

[![Space Health](https://samples.testspace.com/spaces/812/badge?token=c3ed21215685a52ea7921f37e16ec0fe9201a881)](https://samples.testspace.com/spaces/812 "Test Cases")
[![Space Metric](https://samples.testspace.com/spaces/812/metrics/776/badge?token=3705d870c50b78076485ee8781cf4f11aa6f487b)](https://samples.testspace.com/spaces/812/schema/Code%20Coverage "Code Coverage (lines)")
[![Space Metric](https://samples.testspace.com/spaces/812/metrics/778/badge?token=5881f7fbb15146585b0139c783f78388effd44bf)](https://samples.testspace.com/spaces/812/schema/Static%20Analysis "Static Analysis (issues)")

***

Download and configure the Testspace client 

<pre>
mkdir -p $HOME/bin
curl -s https://testspace-client.s3.amazonaws.com/testspace-linux.tgz | tar -zxvf- -C $HOME/bin
testspace config url samples.testspace.com
</pre>

Build examples:

<pre>
 mvn clean compile
 mvn pmd:pmd
 mvn cobertura:cobertura -Dcobertura.report.format=xml
</pre>

Push Content using Testspace client 

<pre>
testspace target/pmd.xml [Tests]target/surefire-reports/TEST-TestSuite.xml target/site/cobertura/coverage.xml
</pre> 