FROM tomcat:latest
RUN rm -rf /usr/local/tomcat/webapps/*
COPY target/TestTp2-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/TestTp2-0.0.1-SNAPSHOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]
