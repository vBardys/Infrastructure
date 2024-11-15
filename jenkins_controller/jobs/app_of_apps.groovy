pipelineJob('app_of_apps') {
    parameters {
        stringParam('backendDockerTag', 'latest', 'Backend docker image tag')
        stringParam('frontendDockerTag', 'latest', 'Frontend docker image tag')
    }
 
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/vBardys/App_of_apps.git")
                    }
                    branches('main')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}