package com.gupao;

public class LenonFactory implements Factory {

    public Computer getComputer() {
        return new Lenon();
    }
}
