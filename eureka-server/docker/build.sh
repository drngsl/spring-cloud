#!/bin/bash

cur=$(cd $(dirname $0);pwd)

pkg_name=eureka-server
mvn package -f $cur/../pom.xml

cp $cur/../target/eureka-server*.jar $cur/

pkg_ver=`ls eureka-server*  | sed "s/eureka-server-\(.*\).jar/\1/g"`

docker build -t dengshaolin/spring-eureka $cur

rm -rf $cur/eureka-server*.jar
