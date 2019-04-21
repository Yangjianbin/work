package com.gupao.homework_1;

public class Test {

    public static void main(String[] args) {
//        Computer mac = new SimpleFactory().getComputer("mac");
//        Factory factory = new MacFactory();
//        Computer computer = factory.getComputer();


        ComputerFactory computerFactory = new ComputerFactory();
        Computer lenon = computerFactory.getLenon();
        Computer mac = computerFactory.getMac();

    }
}
