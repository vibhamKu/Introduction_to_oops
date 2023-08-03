package com.java.interfaces;

import java.io.CharArrayWriter;

public class GameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GamingConsole game = new ChessGame();
		//ChessGame game = new ChessGame();
		
		game.up();
		game.down();
		game.left();
		game.right();

	}

}
