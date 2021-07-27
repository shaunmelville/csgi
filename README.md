# POC

## Technology
### Technologies used
1. Spring Boot
2. Spring JPA
3. Spring Security
4. Spring Rest Controller
5. JSON Web Tokens (JWT) with HS512 signature algoritm
6. Posgresql
6. Docker
7. Docker Compose
 
### Technology notes
1. The back end server was developed using Spring boot.
2. REST Get and Post controllers implemented.
3. All service end points are secured using Spring Security.
4. JWT tokens are issued to successful authenticated users. 
5. All subsequent calls to the backend must have the JWT bearer token present to be able to use the service.
6. JPA is used for database operations

## Building and Installation
Please following steps in section A,B,C and D.
### A. Source code cloning and setup
The POC project for CSGI is a fully Spring Boot application. You should be able to use your favorite Spring Tool IDE to import the project.
1. Install Spring Tools: https://spring.io/tools
2. Clone git repo: git clone https://github.com/shaunmelville/csgi.gi
3. Start Spring Tool Suite
4. Set workspace as the csgi folder
5. Import Existing maven project under the folder "com.shaunmelville.poc folder".
6. Run project as Spring Boot application

### B. Build App
1. Chane to directory "com.shaunmelville.poc"
1. mvn clean install -DskipTests
2. sudo docker build --rm --force-rm -t poc:0.0.1.base .

### C. Install Docker
1. Install Docker: https://docs.docker.com/get-docker/
2. Install Docker compose: https://docs.docker.com/compose/install/

### D. Start App
1. sudo docker-compose up -d

## Services consumption and testing
### Postman
1. Download and Install Postman: https://www.postman.com/downloads/
2. Postman project files under folder "etc" can be import into Postman

### Check app
1. Open browser and paste http://localhost:8080/checkApp in URL. This should return a hello world message.
2. Run checkApp Postman script to check if back end is accepting requests.

### Postman testing
1. First run "authenticate" request.
2. Token is returned.
3. This token must be added to the Global variable "authToken"
4. Rest of Postman requests can be executed.
