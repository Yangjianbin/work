package com.gupao.homework_1;

public class MacFactory implements Factory {
    public Computer getComputer() {
        return new Mac();
    }
}
