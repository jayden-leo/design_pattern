package com.jayden.a2_structurer.a6_composite.a1_example;

import java.util.ArrayList;

/**
 * 树枝节点
 *      容器对象,可以包含子节点
 **/
public class Composite extends Component {

    private ArrayList<Component> list = new ArrayList<>();

    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return (Component) list.get(i);
    }

    @Override
    public void operation() {
        //在树枝节点中的业务方法,将递归调用其他节点中的operation() 方法
        for (Component component : list) {
            component.operation();
        }
    }
}