package com.fuhao.java.sellticket;

public class SellTicketDemo {

    public static void main(String[] args) {
        SellTicket sellTicket = new SellTicket();

        Thread thread1 = new Thread(sellTicket, "Win1");
        Thread thread2 = new Thread(sellTicket, "Win2");
        Thread thread3 = new Thread(sellTicket, "Win3");

        thread1.start();
        thread2.start();
        thread3.start();
    }

}
