pipeline {
    agent any
    
    tools {
        jdk 'JDK11'
        maven 'M3'
    }
    
    stages {
        stage('Environment') {
            steps {
                sh '''
                    echo "Java version:"
                    java -version
                    echo "Maven version:"
                    mvn -version
                '''
            }
        }
        
        stage('Checkout') {
            steps {
                git branch: 'master', 
                    url: 'https://github.com/Briantorralva/SnakeRemake.git'
            }
        }
        
        stage('Build') {
            steps {
                echo 'Building the project...'
                sh 'mvn clean compile'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
    }
}
post {
        success {  
            echo 'Build and tests completed successfully!'
            emailext(
                subject: "SUCCESS: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
                body: "<p>SUCCESS: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>\n<p>Check console output at <a href='${env.$
                to: "briantorralva@gmail.com",
                from: "jenkins@example.com",
                mimeType: 'text/html'
            )
        }
                    
        failure {  
            echo 'Build or tests failed!'
            emailext(
                subject: "FAILED: Snake Game Build ${env.BUILD_NUMBER}",
                body: """<p>FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>\n<p>Check console output at <a href='${env$
                to: "briantorralva@gmail.com",  
                mimeType: 'text/html'
            )
        }
             
        always {
            echo 'Pipeline finished'
        }           
    }
