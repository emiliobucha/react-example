@Library("shared-library") _
pipeline
{
    agent any

    stages {
        stage("build"){
            steps{
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
            }}
        }
        stage("deploy"){
             steps{
            reactDeployS3Pipeline{
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
            } }
        }
    }
}
