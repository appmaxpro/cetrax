#!/bin/bash

# set x so we can see the actual java command run
set -x

if [[ -n ${MYSQL_SHARDS} ]]; then
    # evaluate referenced environment variables
    mysql_shards=$(eval echo ${MYSQL_SHARDS})
    echo "running cetrax with mysql shards: $mysql_shards"
    export MYSQL_SHARDS="$mysql_shards"
fi

# start the cetrax server with all parameters passed to command line
java -jar -Dlogback.configurationFile=./cetrax-logback.xml cetrax-server.jar $@
