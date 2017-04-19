package com.thread.synchronize;
/*
 * 以下两个方法相同，在获取该方法时会锁定整个对象
 */
public class Sync {
   public synchronized void syncMethod() {
      System.out.println("Sync Method Executed");
   }

   public void syncThis() {
      synchronized (this) {
         System.out.println("Sync This Executed");
      }
   }
}