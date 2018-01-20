#!/bin/bash
###############################################################################
#Script:        deliver_etl.sh
#Author:        lvxw <2622478542@qq.com>
#Reference:
#Date:          2018-01-19
#ModifyDate:
#Description:   shell 脚本头部
#Jira:
###############################################################################

function set_env(){
    source ../base_hour.sh
    source etc/dulication/dulication.conf
}

set_env
