package com.gupao;

public class MacFactory implements Factory {
    public Computer getComputer() {
        return new Mac();
    }
}
