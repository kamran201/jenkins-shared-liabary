def call(string image tag,string dockerHubUser){
  sh "docker build -t ${DockerHubUser}/${projectName}:${imageTag} ."
  
}
