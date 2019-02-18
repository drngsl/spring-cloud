FROM dengshaolin/ubuntu

MAINTAINER dengshaolin drngsl@qq.com

ARG version=0.0.1-SNAPSHOT

RUN apt-get update -y && apt-get install default-jdk -y && \
    apt-get clean -y && \
    rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*

ENV version=${version}

COPY eureka-server-${version}.jar .

CMD java -jar /data/eureka-server-${version}.jar
