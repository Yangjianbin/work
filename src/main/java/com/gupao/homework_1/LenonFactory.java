package com.gupao.homework_1;

public class LenonFactory implements Factory {

    public Computer getComputer() {
        return new Lenon();
    }
}
