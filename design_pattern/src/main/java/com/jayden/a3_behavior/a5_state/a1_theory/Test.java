package com.jayden.a3_behavior.a5_state.a1_theory;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();

        State state1 = new ConcreteStateA();
        state1.handle(context);
        System.out.println(context.getCurrentState().toString());

        System.out.println("========================");

        State state2 = new ConcreteStateB();
        state2.handle(context);
        System.out.println(context.getCurrentState().toString());
    }
}
