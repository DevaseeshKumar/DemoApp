pipeline {
    agent any

    environment {
        MAVEN_HOME = tool 'Maven'  // Uses Jenkins Maven tool
    }

    stages {
        stage('Checkout Code') {
            steps {
                git credentialsId: 'github-token', url: 'https://github.com/DevaseeshKumar/DemoApplication.git', branch: 'master'
            }
        }

        stage('Build') {
            steps {
                sh '${MAVEN_HOME}/bin/mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh '${MAVEN_HOME}/bin/mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying Application...'
                // Modify with your actual deployment strategy (Docker, Kubernetes, SCP, etc.)
                sh 'scp target/*.jar user@yourserver.com:/home/user/app.jar'
            }
        }
    }

    post {
        success {
            echo '✅ Build & Deployment Successful!'
        }
        failure {
            echo '❌ Build or Deployment Failed. Check logs!'
        }
    }
}
