#!groovy

import jenkins.model.*

def jobName = "my-job-project"
def configXml = new File("/tmp/jenkins-master/config.xml")
def xmlStream = new ByteArrayInputStream( configXml.getBytes() )

Jenkins.instance.createProjectFromXML(jobName, xmlStream)