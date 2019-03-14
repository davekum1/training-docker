# training-docker
### Required
* [Docker] - Docker container
* [JDK] - JDK 1.8
* [Gradle] - Latest version

### Installation

How to run

```sh
./gradlew clean build
docker build -t training-docker:latest .
docker run -p 8080:8080 training-docker:latest
```

In case docker is not running:

```sh
sudo systemctl restart docker.service
```
Open in your browser:
localhost:8080/demo/hello