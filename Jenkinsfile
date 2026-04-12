// This Jenkinsfile is from previous repo " jenkins-python-app " using shared library


@Library("akash-lib") _
pipeline{
    agent {label "akash"}
    
    stages{
        stage("clone code"){
            steps{
                clone("https://github.com/akashyadav29/jenkins-python-app.git" ,"main")
            }
        }
        stage("build image"){
            steps{
                build("python-app")
            }
        }
        stage("push to dockerhub"){
            steps{
                pushDocker("python-app" , "dockerhubcred")
            }
        }
        stage("run container"){
            steps{
                runContainer("python-app" , "python-app")
                
                Final()
            }
    
        }
        
    }
}
