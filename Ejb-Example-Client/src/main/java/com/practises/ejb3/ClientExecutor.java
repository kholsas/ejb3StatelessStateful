package com.practises.ejb3;

/**
 * Created by Kholofelo Maloma on 14  October  2015.
 */
public class ClientExecutor implements Runnable {
    private int num;

    public ClientExecutor(final int num) {
        this.num = num;
    }

    @Override
    public void run() {
        HelloWorld bean = EJBClient.doLookup("helloEJBService/stateless");

        System.out.println("Thread# " + this.num + ": First call: Size = " + bean.getNames().size());
        System.out.println("Thread# " + this.num + ": Second Call: adding to remote list");
        bean.addName("Kholofelo");
        System.out.println("Thread# "+this.num+": Third Call: Size = " + bean.getNames().size());
    }
}
