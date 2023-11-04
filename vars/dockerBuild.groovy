def call(String ImageName, String ImageTag, String hubUser){
    
    sh """
     docker image build -t ${hubUser}/${ImageName} . 
     docker image tag ${hubUser}/${ImageName} ${hubUser}/${ImageName}:${ImageTag}
     docker image tag ${hubUser}/${ImageName} ${hubUser}/${ImageName}:latest
    """
}

// def call(String aws_account_id, String region, String ecr_repoName){
    
//     sh """
//      docker build -t ${ecr_repoName} .
//      docker tag ${ecr_repoName}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
//     """
// }
