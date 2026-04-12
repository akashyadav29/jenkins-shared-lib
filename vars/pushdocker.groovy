def call(imageName, credId) {
    withCredentials([usernamePassword(credentialsId: ${credId},
    usernameVariable: 'user', passwordVariable: 'pass')]) {

        sh "docker login -u ${env.user} -p ${env.pass}"
        sh "docker image tag ${imageName} ${env.user}/${imageName}"
        sh "docker push ${env.user}/${imageName}"

        echo "pushing image to dockerhub"
    }
}
