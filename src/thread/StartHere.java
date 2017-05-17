/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import static java.lang.Thread.sleep;

/**
 *
 * @author Ejer
 */
public class StartHere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                for (int i = 0; i < 10;
                        i++) {
                    System.out.println("This is thread t");
                    try {
                        // Allows the thread a break, i.e. makes it
                        // execute at a specific time interval.
                        sleep(100);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        };
        t.start();
        
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 10;
                        i++) {
                    System.out.println("This is thread t2");
                    try {
                        sleep(100);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        };
        t2.start();
    }

}
