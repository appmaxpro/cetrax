#!/bin/sh

set -e

help() {
    echo "*** available commands:"
    typeset -F | awk 'NF>1{print $NF}' | grep -v 'internal$'
}

clean() {
    echo "*** running maven clean..."
    mvn clean
}

compile() {
    echo "*** running maven install..."
    mvn compile
}

test() {
    echo "*** running maven test..."
    mvn test
}

install() {
    echo "*** running maven clean/install..."
    mvn clean install
}

install_skip_tests() {
    echo "*** running maven clean/install..."
    mvn clean install -DskipTests
}

run_jar() {
    echo "*** running cetrax..."
    java -jar cetrax-server/target/cetrax-server.jar cetrax-server/src/main/resources/cetrax-server.conf
}

prep_docker_internal() {
    echo "*** moving jar to docker folder"
    cp cetrax-server/target/cetrax-server.jar env/dockers/cetrax/
}

build_docker() {
    prep_docker_internal

    echo "*** building cetrax docker"
    docker build --tag=cetrax env/dockers/cetrax
}

run_docker() {
    echo "*** running cetrax in docker container"
    docker run -d --publish=7443:7443 --user 7447:7447 --name=cetrax cetrax
}

kill_docker() {
    echo "*** killing cetrax docker container"
    docker kill cetrax ; docker rm -v cetrax
}

if [ "$#" = 0 ]
then
    install_skip_tests
    run_jar
    exit
fi

for todo in "$@"
do
    $todo
done
