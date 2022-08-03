package com.company;

public class Start6 extends Thread {
    static int share;


    public static void main(String[] args) {
        Start6 t1 = new Start6();
        Start6 t2 = new Start6();

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            editShare();
        }
    }

    private void editShare() {
        synchronized (Start6.class) {
            System.out.println("share = " + share++);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
    }

}
