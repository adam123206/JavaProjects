package com.thread.join;
/*
 * 由于java单继承的机制，所有一般实现Runnable接口
 */

class MyRunnable implements Runnable{ 

    @Override
    public void run() {
        System.out.println("Thread started:::"+Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended:::"+Thread.currentThread().getName());
    }
}

