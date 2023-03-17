package com.jayden.a3_behavior.a6_iterator.a1_theory;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("lisi");
        names.add("zhangsan");
        names.add("wangwu");

        Iterator<String> iterator = new ConcreteIterator(names);
        while(iterator.hasNext()){
            System.out.println(iterator.currentItem());
            iterator.next();
        }

        /**
         * 使用ArrayList集合中的iterator()方法获取迭代器
         * 将创建迭代器的方法放入集合容器中,这样做的好处是对客户端封装了迭代器的实现细节.
         */
        java.util.Iterator<String> iterator1 = names.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
            iterator.next();
        }
    }
}
