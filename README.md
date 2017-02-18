[![Testspace](http://www.testspace.com/img/Testspace.png)](http://www.testspace.com)

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

[![Space Health](https://samples.testspace.com/spaces/812/badge)](https://samples.testspace.com/spaces/812 "Test Cases")
[![Space Metric](https://samples.testspace.com/spaces/812/metrics/775/badge)](https://samples.testspace.com/spaces/812/schema/Code%20Coverage "Code Coverage (branches)")
[![Space Metric](https://samples.testspace.com/spaces/812/metrics/777/badge)](https://samples.testspace.com/spaces/812/schema/Code%20Coverage "Code Coverage (methods)")
[![Space Metric](https://samples.testspace.com/spaces/812/metrics/778/badge)](https://samples.testspace.com/spaces/812/schema/Static%20Analysis "Static Analysis (issues)")


***

Build examples:

<pre>
 mvn clean compile
 mvn pmd:pmd
 mvn cobertura:cobertura -Dcobertura.report.format=xml
</pre>

Push Content using **Testspace client**: 

<pre>
curl -s https://testspace-client.s3.amazonaws.com/testspace-linux.tgz | sudo tar -zxvf- -C /usr/local/bin
testspace @.testspace.txt $TESTSPACE_TOKEN/$GITHUB_ORG:$REPO_NAME/$BRANCH_NAME#$BUILD_NUMBER
</pre> 

Checkout the published [Test Content](https://samples.testspace.com/projects/testspace-samples:java.testng). Note that the `.testspace.txt` file contains the [set of files](http://help.testspace.com/how-to:publish-content#publishing-via-content-list-file) to publish. 

***

To replicate this sample: 
  - Setup account at www.testspace.com.
  - Create a Environment variable called `TESTSPACE_TOKEN`
     - `TESTSPACE_TOKEN` = `credentials@Your-Org-Name.testspace.com`
     - `credentials` set to `username:password` or your [access token](http://help.testspace.com/reference:client-reference#login-credentials)
     - To [use Testspace with a CI system](http://help.testspace.com/how-to:add-to-ci-workflow), store `TESTSPACE_TOKEN` as a secure environment variable
 
