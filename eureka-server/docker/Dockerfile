FROM dengshaolin/jre

MAINTAINER dengshaolin drngsl@qq.com

ARG version=0.0.1-SNAPSHOT

ENV version=${version}

COPY eureka-server-${version}.jar .

CMD java -jar /data/eureka-server-${version}.jar
