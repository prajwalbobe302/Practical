package LabWork8May;

public class Question1 {
	//public class ContinuousPrinting {
	    public static void main(String[] args) {
	        // Create two thread objects
	        Thread thread1 = new Thread(new GoodMorning());
	        Thread thread2 = new Thread(new Welcome());

	        // Start both threads
	        thread1.start();
	        thread2.start();
	    }
	}

	class GoodMorning implements Runnable {
	    public void run() {
	        while (true) {
	            System.out.println("Good morning");
	            try {
	                Thread.sleep(2000); // Wait for 2 second
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

	class Welcome implements Runnable {
	    public void run() {
	        while (true) {
	            System.out.println("Welcome");
	            try {
	                Thread.sleep(2000); // Wait for 2 second
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

