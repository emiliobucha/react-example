@Library("jenkins-library-react-pipeline") _
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