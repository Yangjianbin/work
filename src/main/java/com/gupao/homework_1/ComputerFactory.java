package com.gupao.homework_1;

public class ComputerFactory extends AbstractFactory {
    public Computer getMac() {
        return new Mac();
    }

    public Computer getLenon() {
        return new Lenon();
    }

}
