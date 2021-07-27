## Install Docker
1. Install Docker: https://docs.docker.com/get-docker/
2. Install Docker compose: https://docs.docker.com/compose/install/

## Build App
1. mvn clean install -DskipTests
1. sudo docker build --rm --force-rm -t poc:0.0.1.base .

## Run App
1. sudo docker-compose up -d

## Postman
1. Postman project files under folder "etc" can be import into Postman

## Check app
1. Run checkApp Postman script to check if backend is accepting requests.

## Postman testing
1. First run "authenticate" request.
2. Token is returned.
3. This token must be added to the Global variable "authToken"
4. Rest of Postman requests can be executed.

