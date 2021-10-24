From java:8
Expose 8083
ADD /target/timesheet-0.0.3-SNAPSHOT.jar timesheet-0.0.3-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "timesheet-0.0.2-SNAPSHOT.jar"]