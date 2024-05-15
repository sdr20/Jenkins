def gv

pipeline {
    agent any
    parameters {
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    stages {
        stage("init") {
            steps {
                script {
                   gv = load "script.groovy" 
                }
            }
        }
        stage("build") {
            steps {
                echo 'building the application...'
                script {
                    gv.buildApp()
                }
            }
        }
        stage("test") {
                }
            }
            steps {
                echo 'testing the application...'
                script {
                    gv.testApp()
                }
            }
        }
        stage("deploy") {
            steps {
                echo 'deplying the application...'
                echo "deploying version ${params.VERSION}"
                script {
                    gv.deployApp()
                }
            }
        }
    }   
