def call(String ImageTag, string DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTge} . "
