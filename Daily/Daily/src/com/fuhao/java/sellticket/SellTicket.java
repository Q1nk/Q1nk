package com.fuhao.java.sellticket;

public class SellTicket implements Runnable {

    private int tickets = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (tickets > 0) {
                    try {
                    Thread.sleep(50);
                    } catch (InterruptedException e) {
                    e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "--selling:" + tickets );
                    tickets--;

                }
            }
        }

    }
}
