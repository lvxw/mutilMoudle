package com.test.mutilMoudle_javaMoudle;

/**
 *Auther:      吕学文<lvxw@fun.tv>
 *Date:        20180205
 *Description: 这是一个实体类：
 *                  1、用于封装前端传递的参数
 *                  2、数据库记录映射
 */
public class Person {
    private String name;
    private int age;
    private double score;

    /**
     *Auther:      吕学文<lvxw@fun.tv>
     *Date:        20180205
     *该方法用于计算整的年龄
     * @param deviation 年龄的偏移量。负数表示,年龄向下取整数；正数表示年龄向上取整
     * @return  返回的是取整后的年龄
     */
    public int getNeatAge(int deviation){
        //。。。。。。（假如这块逻辑比较复杂）
        int neatAge = this.getAge()+deviation;
        return neatAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
