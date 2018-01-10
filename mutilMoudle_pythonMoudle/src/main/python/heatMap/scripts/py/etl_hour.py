from pyspark import SparkContext, SparkConf
import os
os.environ['JAVA_HOME']='D:\Program Files\Java\jdk1.8.0_60'

# logFile = 'C:\\Python\\Python 36\\Lib\\site-packages\\README.txt'
conf = SparkConf().setMaster("local[*]").setAppName("Fisrt")
sc = SparkContext(conf=conf)
# logData = sc.textFile(logFile).cache()
# numAs = logData.filter(lambda s: 'a' in s).count()
# numBs = logData.filter(lambda s: 'b' in s).count()
# print('Lines with a :%i, lines with b: %i' % (numAs, numBs))