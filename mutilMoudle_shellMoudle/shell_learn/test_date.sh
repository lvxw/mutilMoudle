#!/bin/bash
###############################################################################
#Script:        test_date.sh
#Author:        lvxw <2622478542@qq.com>
#Reference:
#Date:          2018-01-11
#ModifyDate:
#Description:
#               1）日期转字符串
#               2）字符串转日期
#               3）日期转毫秒
#               4）毫秒转日期
#               5）字符串转毫秒
#               6）毫秒转字符串
#Jira:
###############################################################################

#日期转字符串
function str_to_date(){
    str=`date +%Y%m%d`
    echo $str
}

#字符串转日期
function date_to_str(){
    date=`date -d $1`
    echo $date
}

#日期转毫秒
function date_to_seconds(){
    seconds=`date +%s`
    echo $seconds
}

#毫秒转日期
function seconds_to_date(){
    date=`date -d @$1`
    echo $date
}

#字符串转毫秒
function str_to_seconds(){
    seconds=`date -d $1 +%s`
    echo $seconds
}

#毫秒转字符串
function seconds_to_str(){
    str=`date -d @$1 +%Y%m%d`
    echo $str
}

str_to_date
date_to_str 20180101
date_to_seconds
seconds_to_date 1514736000
str_to_seconds 20180101
seconds_to_str 1514736000
