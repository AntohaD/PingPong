package com.dzherdzh.anton.games;

public class PingPong {

	public static void main(String[] args) {
		
		Games pp  = new Games();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pp.ping();
				} catch (InterruptedException e) {}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pp.pong();
				} catch (InterruptedException e) {
					
				}
			}
		}).start();

	}

}
