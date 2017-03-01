#/bin/bash

mvn clean package -DskipTests

cp target/spring-template-war-0.0.1-SNAPSHOT.war ../../../../../servers/jboss-as-7.1.1.Final/standalone/deployments/
