FROM maven:3.8.3-openjdk-17 as build
ENV HOME=/usr/app
RUN mkdir -p $HOME
WORKDIR $HOME
ADD . $HOME
run echo "package kube uno"
RUN mvn clean package

FROM openjdk:8-jdk-alpine
run echo "copy kube uno"
COPY --from=build /usr/app/target/prova_minikube-0.0.1-SNAPSHOT.jar /app/minikube.jar
run echo "kube uno"
EXPOSE 8080
CMD ["java", "-jar", "/app/minikube.jar"]