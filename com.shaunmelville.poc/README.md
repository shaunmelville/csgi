## Technology used
1. The backend server was developed using Spring boot.
2. REST Get and Post controllers implemented.
3. All service end points are secured using Spring Security.
4. JWT tokens are issued to successful authenticated users. 
5. All subsiquent calls to the backend must have the JWT bearer token present to be able to use the service.
6. JPA is used for database operations
7. 

## Install Docker
1. Install Docker: https://docs.docker.com/get-docker/
2. Install Docker compose: https://docs.docker.com/compose/install/

## Build App
1. 
2. mvn clean install -DskipTests
3. sudo docker build --rm --force-rm -t poc:0.0.1.base .

## Run App
1. sudo docker-compose up -d

## Postman
1. Postman project files under folder "etc" can be import into Postman

## Check app
1. Open browser and paste http://localhost:8080/checkApp in URL. This should return a hello world message.
2. Run checkApp Postman script to check if backend is accepting requests.

## Postman testing
1. First run "authenticate" request.
2. Token is returned.
3. This token must be added to the Global variable "authToken"
4. Rest of Postman requests can be executed.

## Source setup
1. Install Spring Tools: https://spring.io/tools
2. Clone git repo: git clone https://github.com/shaunmelville/csgi.gi
3. Start Spring Tool Suite
4. Set workspace as the csgi folder
5. Import Existing maven project under com.shaunmelville.poc folder.
6. Run project as Spring Boot application



