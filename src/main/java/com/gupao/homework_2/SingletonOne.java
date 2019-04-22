package com.gupao.homework_2;

/**
 * @author yangjianbin
 * @description TODO
 * @date 2019/4/22
 */
public class SingletonOne {

    private static boolean isInit;

    private SingletonOne() {
        if (isInit) {
            throw new RuntimeException("have init.");
        }
        isInit = true;
        System.out.println("run");
    }

    public final static SingletonOne instance = new SingletonOne();


    public Object readResolve() {
        return instance;
    }




}
