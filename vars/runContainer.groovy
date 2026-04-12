def call(containerName, imageName) {
    sh "docker stop ${containerName} || true"
    sh "docker rm ${containerName} || true"
    sh "docker run -d --name ${containerName} -p 3000:3000 ${imageName}"
}
