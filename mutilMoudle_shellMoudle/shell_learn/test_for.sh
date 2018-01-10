#!/bin/bash

for x in $(seq 1 3)
#for x in `seq 1 3`
do
    echo $x
done

echo "*****************************"

for(( i=1;i<=3;i++ ))
do
    echo $i
done