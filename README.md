## APIzza
A basic Springboot API for ordering pizza to a mock database.  


### Build Instructions

1.  Clone the repository
2.  Run -> gradle runBoot


### Enabling Error Messaging
As a standard security setting, the message text from http error messages is not enabled. 
To enable navigate to  `resources/application.properties` and add the line:

    server.error.incluse-message=always

### Enabling Exit Command
Additionally, add this to the `resources/application.properties` file to allow you to quit gracefully

    endpoints.shutdown.enabled=true
