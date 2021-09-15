package code2;

/**
 * @description:
 * @author: junmo
 * @create: 2021-08-10 16:13
 **/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int  num = 1;//当前正在执行线程的标记
        ABCPrint print = new ABCPrint(num);

        Thread threadA = new Thread(new RunnableA(print));
        Thread threadB = new Thread(new RunnableB(print));
        Thread threadC = new Thread(new RunnableC(print));
        threadA.start();
        Thread.sleep(500);
        threadB.start();
        Thread.sleep(500);
        threadC.start();
    }
}
class RunnableA implements Runnable{

    private ABCPrint print;
    public RunnableA(ABCPrint print) {
        super();
        this.print = print;
    }

    @Override
    public void run() {
        print.PrintA();

    }
}
class RunnableB implements Runnable{

    private ABCPrint print;
    public RunnableB(ABCPrint print) {
        super();
        this.print = print;
    }

    @Override
    public void run() {
        print.PrintB();
    }
}
class RunnableC implements Runnable{

    private ABCPrint print;
    public RunnableC(ABCPrint print) {
        super();
        this.print = print;
    }

    @Override
    public void run() {
        print.PrintC();
    }
}
class ABCPrint {
    private static final Lock lock = new ReentrantLock();//通过JDK5中的Lock锁来保证线程的访问的互斥

    private int num;//当前正在执行线程的标记

    public ABCPrint(int num) {
        super();
        this.num = num;
    }


    public void PrintA() {
        for (int j = 0; j < 2; )//表示 循环打印2轮
            try {
                lock.lock();
                while (num == 1) {
                    for (int i = 0; i < 3; i++) {//表示 打印3次
                        System.out.println("A");
                    }
                    //打印A线程执行完 ，通知打印B线程
                    num = 2;
                    j++;
                }
            } finally {//调用了lock方法后，需在finally（finally确保一定会执行，除非执行了exit方法)语句里调用unlock方法。否则会造成死锁等问题
                lock.unlock();
            }
    }

    public void PrintB() {
        for (int j = 0; j < 2; )//表示 循环打印2轮
            try {
                lock.lock();
                while (num == 2) {
                    for (int i = 0; i < 2; i++) {//表示 打印2次
                        System.out.println("B");
                    }
                    //打印B线程执行完 ，通知打印C线程
                    num = 3;
                    j++;
                }
                }finally{
                    lock.unlock();
                }
            }

        public void PrintC () {
            for (int j = 0; j < 2; )//表示 循环打印2轮
                try {
                    lock.lock();
                    while (num == 3) {
                        System.out.println("C");
                        //打印C线程执行完 ，通知打印A线程
                        num = 1;
                        j++;
                    }
                } finally {
                    lock.unlock();
                }
        }

    }
