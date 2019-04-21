package com.gupao;

public class ComputerFactory extends AbstractFactory {
    public Computer getMac() {
        return new Mac();
    }

    public Computer getLenon() {
        return new Lenon();
    }

}
