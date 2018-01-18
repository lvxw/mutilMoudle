#!/bin/bash
###############################################################################
#Script:        test_normalization.sh
#Author:        lvxw <2622478542@qq.com>
#Reference:
#Date:          2018-01-11
#ModifyDate:
#Description:   shell 脚本书写规范
#Jira:
###############################################################################

if (( $# == 0 ))
then
    data_date=`date -d "-1 days" +%Y%m%d`
elif [[ $1 == [1-3][0-9][0-9][0-9][0-1][0-9][0-3][0-9] ]]
then
    data_date=$1
else
    echo "Usage:$(dirname $0)/$(basename $0) [yyyymmdd]" >&2
    echo "Default data_date is last day." >&2
    exit 1
fi

function set_env(){
    base_dir=$(cd $(dirname $0)/../../ && pwd)
    cd $base_dir

    #. etc/xxx
}

function init(){
    year=${data_date:0:4}
    month=${data_date:4:2}
    day=${data_date:6:2}
}

set_env
echo `pwd`
