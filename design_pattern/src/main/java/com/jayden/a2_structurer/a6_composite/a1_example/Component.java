package com.jayden.a2_structurer.a6_composite.a1_example;

/**
 * 抽象根节点
 *      对于客户端而言将针对抽象编程,无需关心其具体子类是容器构件还是叶子构件.
 **/
public abstract class Component {

    public abstract void add(Component c); //增加成员
    public abstract void remove(Component c); //删除成员
    public abstract Component getChild(int i); //获取成员
    public abstract void operation(); //业务方法

}