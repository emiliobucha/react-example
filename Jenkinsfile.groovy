@Library("shared-library") _
reactAwsS3Pipeline{
    NPM_CMD      = "npm"
    S3_BUCKET = "semperti-react-development-rapientrega"
    AWS_CREDENTIALS = "aws-bucha"
    AWS_REGION = "us-east-1"
    BUILD_FOLDER = "build"
}