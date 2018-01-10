#!/bin/bash
##############################################################################
#   []      相当于 test
#   [[]]    多数情况下相当于 []
#   $()     相当于``
#   $(())   算术运算
#   (())    条件判断时算术运算
#   -e      文件存在
#   -f      file 是一个 regular 文件(不是目录或者设备文件)
#   -s      文件长度不为 0
#   -d      文件是个目录
##############################################################################
# 判断目录是否为空
if [ "`ls -A ./tmp1`"  != "" ]
then
    echo true1
fi

if test -d tmp1
then
    echo true
fi

if test -e ./tmp1/b
then
    echo true
fi

if test -f ./tmp1/b
then
    echo true
fi

if test -s ./tmp1/a
then
    echo true
fi

date=`date`
echo $date

date2=$(date)
echo $date2

add=$(( 2+3 ))
echo $add

