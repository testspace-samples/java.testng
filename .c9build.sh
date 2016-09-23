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

# Publish
curl -s https://testspace-client.s3.amazonaws.com/testspace-linux.tgz | sudo tar -zxvf- -C /usr/local/bin
testspace target/pmd.xml [Tests]target/surefire-reports/TEST-TestSuite.xml target/site/cobertura/coverage.xml master.c9