package com.fuhao.java.runnable;

public class MyRunnableDemo {
    public static void main(String[] args) {

        MyRunnable myThread = new MyRunnable();

        Thread thread = new Thread(myThread, "train");
        Thread thread1 = new Thread(myThread, "plane");

        thread.start();
        thread1.start();
    }
}
