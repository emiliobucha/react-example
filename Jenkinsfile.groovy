@Library("shared-library") _
reactAwsS3StandardPipeline{
    NPM_CMD      = "npm"
    S3_BUCKET = "semperti-react-development-rapientrega"
    AWS_REGION = "us-east-1"
    BUILD_FOLDER = "build"
    DEPLOY_JOB = "RapientregaFrontend-Deploy"
}