package com.java.interfaces;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Jump");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Goes into the hole");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		//System.out.println("Move back");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Move forward");
	}

}
