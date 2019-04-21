package com.gupao.homework_1;

public class SimpleFactory {

    public Computer getComputer(String name) {
        if ("lenon".equalsIgnoreCase(name)) {
            return new Lenon();
        } else if ("apple".equalsIgnoreCase(name)) {
            return new Mac();
        }
        return null;
    }

}
