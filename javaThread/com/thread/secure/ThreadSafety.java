package com.thread.secure;
/*
 * 
    线程同步是最简单和常用的方法来确保线程安全
    通过使用java.util.concurrent.atomic包中的原子类，可以确保操作的原子性
    通过使用java.util.concurrent.locks包中的锁可以确保线程安全
    使用线程安全的并发集合，比如ConcurrentHashMap来确保线程安全
    通过volatile关键字来确保每次的变量使用都从内存中访问数据，而非访问线程缓存

 * 
 * 
 */
public class ThreadSafety {

    public static void main(String[] args) throws InterruptedException {

        ProcessingThread pt = new ProcessingThread();
        Thread t1 = new Thread(pt, "t1");
        t1.start();
        Thread t2 = new Thread(pt, "t2");
        t2.start();
        //wait for threads to finish processing
        t1.join();
        t2.join();
        System.out.println("Processing count="+pt.getCount());
    }
}