#!/bin/bash
###############################################################################
#Script:        test_array.sh
#Author:        lvxw <2622478542@qq.com>
#Reference:
#Date:          2018-01-11
#ModifyDate:
#Description:   测试shell数组
#Jira:
###############################################################################

echo "************get**************"
arr=(hadoop hive hbase spark)
echo ${arr[@]}
echo ${arr[*]}
echo ${arr[0]}
echo ${arr[1]}
echo ${arr[-3]}

echo "************for**************"
for x in ${arr[@]}
do
    echo $x
done

echo "************get len**************"
echo ${#arr[@]}     #获取数组元素个数
echo ${#arr[*]}     #获取数组元素个数
echo ${#arr[0]}     #获取指定元素长度

echo "************slice**************"
echo ${arr[@]:0:3}
