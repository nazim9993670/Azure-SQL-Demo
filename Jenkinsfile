pipeline {
    agent any
    
    environment {
        // Define the path to your Maven installation (if not in system PATH)
        MAVEN_HOME = tool 'Maven_3.8.4' // Adjust the tool name to match your Maven installation in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                // Check out your source code from the repository
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Set up Maven and build the Spring Boot application
                sh """
                ${MAVEN_HOME}/bin/mvn clean install
                """
            }
        }

        stage('Test') {
            steps {
                // Run tests
                sh """
                ${MAVEN_HOME}/bin/mvn test
                """
            }
        }
    }

    post {
        success {
            // Add post-build actions here, e.g., deployment steps
        }
    }
}
