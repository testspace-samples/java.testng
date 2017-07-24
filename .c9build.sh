#!/bin/bash

# Prerequisites 
sudo apt-get update
sudo apt-get install openjdk-7-jdk

# Build
mvn clean compile

# Analysis
mvn pmd:pmd 

# Test
mvn cobertura:cobertura -Dcobertura.report.format=xml

# Download and configure the Testspace client
curl -fsSL https://testspace-client.s3.amazonaws.com/testspace-linux.tgz | tar -zxvf- -C $HOME/bin
# note c9 host requires "access token", storing in ~/.netrc (refer to https://help.testspace.com/reference:client-reference#login-credentials)
CI=true testspace config url samples.testspace.com
testspace -v

# Push content
testspace target/pmd.xml [Tests]target/surefire-reports/TEST-TestSuite.xml target/site/cobertura/coverage.xml "#c9.Build" --repo git
