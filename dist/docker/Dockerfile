FROM openjdk:11
ENV MYSQL_DB_IP localhost
ENV MYSQL_DB_PASSWORD rootpass
COPY web/target/web-0.0.2-SNAPSHOT.jar /home/app.jar
EXPOSE 8080 
ENTRYPOINT java -jar /home/app.jar
