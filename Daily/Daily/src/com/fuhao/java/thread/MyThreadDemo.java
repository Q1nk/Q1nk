package com.fuhao.java.thread;

public class MyThreadDemo {
    public static void main(String[] args) {

        MyThread myThread1 = new MyThread("train");
        MyThread myThread2 = new MyThread("plane");
        MyThread myThread = new MyThread("car");

        myThread.setPriority(6);

        myThread1.setDaemon(true);
        myThread2.setDaemon(true);

        myThread1.start();
        myThread2.start();
        myThread.start();

    }
}
