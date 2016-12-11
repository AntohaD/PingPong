package com.dzherdzh.anton.games;

public class Games {
	
	int state = 0;
	public static final  int PING = 1;
	public static final  int PONG = 0;
	
	public synchronized void ping() throws InterruptedException {
		while(true){
		if( state == PING){
			wait();
		}
		state = PING;
		System.out.println("Ping");
		notify();
		}
	}
		
	public synchronized void pong() throws InterruptedException {
		while(true){
		if(state == PONG){
			wait();
		}
		state = PONG;
		System.out.println("Pong");
		notify();
		}
	}

}
