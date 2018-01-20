#!/bin/bash
###############################################################################
#Script:        base_day.sh
#Author:        lvxw <2622478542@qq.com>
#Reference:
#Date:          2018-01-19
#ModifyDate:
#Description:   shell 脚本头部
#Jira:
###############################################################################

if (( $# == 0 ))
then
    data_date=`date -d "-1 days" +%Y%m%d`
elif [[ $1 == [1-3][0-9][0-9][0-9][0-1][0-9][0-3][0-9] ]]
then
    data_date=$1
else
#    echo "Usage:$(dirname $0)/$(basename $0) [yyyymmdd]" >&2
    echo "Default data_date is last day." >&2
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
    year=${data_date:0:4}                       #年
    month=${data_date:4:2}                      #月
    day=${data_date:6:2}                        #日
    week_day=`date -d $data_date +%w`           #星期

    echo "#########################################################################"
    echo '#' date_date=$data_date
    echo '#' year=$year
    echo '#' month=$month
    echo '#' day=$day
    echo '#' week_day=$week_day
    echo "#########################################################################"
}

set_env
init
