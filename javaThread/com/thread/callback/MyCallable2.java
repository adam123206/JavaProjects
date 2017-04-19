package com.thread.callback;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/*
 * Java的Callable接口使用了泛型来定义返回的对象的类型。
 * Executors类提供了一些很实用的方法来在线程池中执行Callable的任务。
 * 因为Callable的任务通过并行的方式来运行，所以我们需要等待返回的对象。
 * 
 * Java的Callable对象返回的就是java.util.concurrent.Future对象。通过使用Java Future对象，
 * 我们可以知道Callable任务的执行状态，并且获得返回的对象。
 * Future接口提供get()方法来让开发者可以等待Callable任务的执行，然后获得对应的结果。
 */
public class MyCallable2 implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        //return the thread name executing this callable task
        return Thread.currentThread().getName();
    }

    public static void main(String args[]){
        //Get ExecutorService from Executors utility class, thread pool size is 10
        ExecutorService executor = Executors.newFixedThreadPool(10);
        //create a list to hold the Future object associated with Callable
        List<Future<String>> list = new ArrayList<Future<String>>();
        //Create MyCallable2 instance
        Callable<String> callable = new MyCallable2();
        for(int i=0; i< 100; i++){
            //submit Callable tasks to be executed by thread pool
            Future<String> future = executor.submit(callable);
            //add Future to the list, we can get return value using Future
            list.add(future);
        }
        for(Future<String> fut : list){
            try {
                //print the return value of Future, notice the output delay in console
                // because Future.get() waits for task to get completed
                System.out.println(new Date()+ "::"+fut.get());
            } catch (ExecutionException e) {
                e.printStackTrace();
            }catch(InterruptedException e){
            	
            	e.printStackTrace();
            }
        }
        //shut down the executor service now
        executor.shutdown();
    }
}