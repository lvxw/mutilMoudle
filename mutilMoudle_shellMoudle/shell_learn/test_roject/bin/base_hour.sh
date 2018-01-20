#!/bin/bash
###############################################################################
#Script:        base_hour.sh
#Author:        lvxw <2622478542@qq.com>
#Reference:
#Date:          2018-01-19
#ModifyDate:
#Description:   shell 脚本头部
#Jira:
###############################################################################

if (( $# == 0 ))
then
    data_time=`date -d "-1 hours" +%Y%m%d%H`
elif [[ $1 == [1-3][0-9][0-9][0-9][0-1][0-9][0-3][0-9][0-2][0-3] ]]
then
    data_time=$1
else
    echo "Default data_time is last hour." >&2
    exit 1
fi

function set_env(){
    base_dir=$(cd $(dirname $0)/.. && pwd)
    cd $base_dir

    tail=${base_dir: -4}
    if [ "$tail" = "/bin" ]
    then
        base_dir=$base_dir/../
        cd $base_dir
    fi

    echo `pwd`
    source etc/stat.conf
}

function init(){
    year=${data_time:0:4}                       #年
    month=${data_time:4:2}                      #月
    day=${data_time:6:2}                        #日
    hour=${data_time:8:2}                       #时
    week_day=`date -d ${data_time:0:8} +%w`           #星期
    echo "#########################################################################"
    echo '#' data_time=$data_time
    echo '#' year=$year
    echo '#' month=$month
    echo '#' day=$day
    echo '#' hour=$hour
    echo '#' week_day=$week_day
    echo "#########################################################################"
}

set_env
init
