package ashleyashley;
import java.util.*;
public class Ashley extends Thread
{
    public static void main(String[] args) {
        Ashley thread1 = new Ashley();
        Ashley thread2 = new Ashley();
        Scanner input = new Scanner (System.in);
       String keys, keys1;
        System.out.print("Name your first thread: ");
        String userName = input.nextLine();
        System.out.print("Name your second thread: ");
        String userName1 = input.nextLine();
                thread1.setName("keys");
                thread2.setName ("keys1");
             
                thread1.getName();
             
                thread2.getState();
             
                System.out.println(thread1.getName() + " " + thread1.getState());
             System.out.println(thread2.getName() + " " + thread2.getState());
             System.out.println(" ");
             System.out.println(" Starting the threads.... ");
             
             thread1.start();
             thread2.start();
             
             try {
             Thread.sleep(500);
             Thread.sleep(500);
             System.out.println(" ");
             System.out.println( " after sleep " );
             
             System.out.println(thread1.getName() + " " + Thread.State.TERMINATED );
             System.out.println(thread2.getName() + " " + Thread.State.TERMINATED );        
             }
  catch (InterruptedException e) {
    System.out.println(Thread.State.TERMINATED);
  }
    }
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " RUNNABLE ");
    }
}