package threads;
// Below is a completed program that uses brute force to crack a 9-digit password. 
// On average, the program takes about 0.125 seconds to find the password.
// Your goal is to re-write the algorithm using Threads. Try to shorten the time it takes 
// to find the code to be as little as possible.
// Let's see who can crack the code the fastest!

// Pro-tip: Do not include the creation of the threads as part of the time. 

import java.util.Random;

public class BruteForceCracker {
	static Double  j = new Random().nextDouble();
	static long code = (long)( j * 1_000_000_000) +1;
	
	static long startTime;
	static long endTime;
	static float elapsedTime;
	
	public static void main(String[] args) {
		System.out.println("Starting Brute Force Checker");
		startTime = System.currentTimeMillis();
		
		int ctr = 0;
	

	new Thread(()-> checkCode((long) (j*10_000_000))).start();
	new Thread(()-> checkCode((long) (j*10_000_000+ 10_000_000))).start();
	new Thread(()-> checkCode((long) (j*10_000_000+ 20_000_000))).start();
	new Thread(()-> checkCode((long) (j*10_000_000+ 30_000_000))).start();
	new Thread(()-> checkCode((long) (j*10_000_000+ 40_000_000))).start();
	new Thread(()-> checkCode((long) (j*10_000_000+ 50_000_000))).start();
	new Thread(()-> checkCode((long) (j*10_000_000+ 60_000_000))).start();
	new Thread(()-> checkCode((long) (j*10_000_000+ 70_000_000))).start();
	new Thread(()-> checkCode((long) (j*10_000_000+ 80_000_000))).start();
	new Thread(()-> checkCode((long) (j*10_000_000+ 90_000_000))).start();

		endTime = System.currentTimeMillis();
		elapsedTime = (float)(endTime - startTime);
		elapsedTime /= 1000.f;
		System.out.println("Total time taken: " + elapsedTime + " seconds");
	}
	
	public static boolean checkCode(long p){
		if(p == code){
			return true;
		}else{
			return false;
		}
	}
}
