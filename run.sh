#!/bin/bash

[ "$#" -eq 1 ] || { echo "Please provide a filename to test. i.e: sh run.sh tiny-grid.txt"; exit 1; }

java -Xmx8192M -jar target/sunspot-assembly-1.0.jar $1
