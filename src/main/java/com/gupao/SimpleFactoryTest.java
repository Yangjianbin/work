package com.gupao;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        Computer mac = new SimpleFactory().getComputer("mac");

    }
}
