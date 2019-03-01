#!/bin/bash

cur=$(cd $(dirname $0);pwd)

pkg_name=config-server
mvn package -f $cur/../pom.xml

cp $cur/../target/config-server*.jar $cur/

pkg_ver=`ls config-server*  | sed "s/config-server-\(.*\).jar/\1/g"`

docker build -t dengshaolin/spring-config $cur

rm -rf $cur/config-server*.jar
