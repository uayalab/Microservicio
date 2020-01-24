FROM glassfish:4.1-jdk8
MAINTAINER uayala "uayala@spsolutions.com.mx"
COPY PizzasAutentia_Ulises.war /
COPY start.sh /
EXPOSE 8080