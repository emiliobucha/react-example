library identifier: 'jenkins-library-react-pipeline@main', 
        retriever: modernSCM([$class: 'GitSCMSource', remote: 'https://github.com/emiliobucha/jenkins-library-react-pipeline.git'])

reactBuildPipeline{
    npmCmd      = "npm"
    devTag      = "0.0-0"
    prodTag     = "0.0"
    prefix = "semperti"
    app = "react"
    env = "development-rapientrega"
    artifact = "${app}.zip"
    s3Artifact = "${prefix}-${app}-${env}"
    awsCredentials = "aws-bucha"
    awsRegion = "us-east-1"
    awsProfile = "semperti"
}