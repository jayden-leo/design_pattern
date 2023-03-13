package com.jayden.a2_structurer.a6_composite.a2_list_files;

/**
 * Entry抽象类,表示目录条目(文件+文件夹)的抽象类
 **/
public abstract class Entry {

    public abstract String getName(); //获取文件名

    public abstract int getSize(); //获取文件大小

    //添加文件夹或文件
    public abstract Entry add(Entry entry);

    //显示指定目录下的所有信息
    public abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "(" +getSize() + ")";
    }
}