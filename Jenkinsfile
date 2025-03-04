pipeline {
    agent any

    environment {
        MAVEN_HOME = "/usr/share/maven"
    }

    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/DevaseeshKumar/DemoApplication.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying Application...'
                // Add deployment steps here (e.g., SCP, SSH, Docker, Kubernetes)
            }
        }
    }
}
