package com.gupao.homework_2;

import java.lang.reflect.Constructor;

/**
 * @author yangjianbin
 * @description TODO
 * @date 2019/4/22
 */
public class Test {

    public static void main(String[] args) throws Exception {
//        Singleton.INSTANCE.system();
//        SingletonOne instance = SingletonOne.instance;

//        Class<SingletonOne> singletonOneClass = SingletonOne.class;
//        Constructor<?> constructors = singletonOneClass.getDeclaredConstructor();
//        constructors.setAccessible(true);
//        Object o = constructors.newInstance(null);
//        SingletonOne singletonOne = singletonOneClass.newInstance();
//        System.out.println(instance.hashCode() + ":" + o.hashCode());

        SingletonInner singletonInner = SingletonInner.noGetInstance();

        System.out.println("============");

        //在不需要获取单例对象的时候不会去调用构造器
        SingletonInner instance = SingletonInner.getInstance();



    }


}
