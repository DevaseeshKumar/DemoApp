pipeline {
    agent any

    tools {
        maven 'Maven_3.9.9' // Make sure this matches the name in Jenkins Global Tool Configuration
    }

    environment {
        MAVEN_HOME = "C:/Program Files/Maven/apache-maven-3.9.9"  // Adjust the path if needed
    }

    stages {
        stage('Checkout Code') {
            steps {
                script {
                    try {
                        git 'https://github.com/DevaseeshKumar/DemoApplication.git'
                    } catch (Exception e) {
                        error "❌ Failed to checkout code: ${e.message}"
                    }
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    try {
                        bat 'mvn clean package'  // 'bat' for Windows, 'sh' for Linux/Mac
                    } catch (Exception e) {
                        error "❌ Build failed: ${e.message}"
                    }
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    try {
                        bat 'mvn test'
                    } catch (Exception e) {
                        error "❌ Tests failed: ${e.message}"
                    }
                }
            }
        }

        stage('Deploy') {
            steps {
                echo '🚀 Deploying Application...'
                // Add deployment steps here (e.g., SCP, SSH, Docker, Kubernetes)
            }
        }
    }

    post {
        success {
            echo '✅ Build and Deployment Successful!'
        }
        failure {
            echo '❌ Build or Deployment Failed. Check logs!'
        }
        always {
            cleanWs() // Clean workspace after every build
        }
    }
}
