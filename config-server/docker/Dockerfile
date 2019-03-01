FROM dengshaolin/jre

MAINTAINER dengshaolin drngsl@qq.com

ARG version=0.0.1-SNAPSHOT

ENV version=${version}

COPY config-server-${version}.jar .

CMD java -jar /data/config-server-${version}.jar
