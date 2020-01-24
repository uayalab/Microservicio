FROM glassfish:4.1-jdk8
MAINTAINER uayala "uayala@spsolutions.com.mx"
COPY PizzasAutentia.war /usr/local/glassfish4/glassfish/domains/domain1/autodeploy
COPY start.sh /
EXPOSE 8080