package com.gupao.homework_2;

/**
 * @author yangjianbin
 * @description TODO
 * @date 2019/4/22
 */
public class SingletonInner {

    private SingletonInner() {
        System.out.println("SingletonInner init");
    }

    public static SingletonInner noGetInstance() {

        return null;

    }
    public static SingletonInner getInstance() {
        return InnerHolder.lazy;
    }

    private static class InnerHolder {
        public static final SingletonInner lazy = new SingletonInner();
    }

}
