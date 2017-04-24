package com.bridgelabz.Programs;

import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.Util.Game;

class TicTac {
	public static void main(String[] args) {
		char player = 'o';
		int row = 0, column = 0;

		Scanner scanner = new Scanner(System.in);

		Game game = new Game();
		Random random = new Random();

		game.initializeGame();
		System.out.println("Game ready !\n");

		while (true) {
			player = game.changePlayer(player);
			System.out.print("\n" + player
					+ " ,choose your location (row, column):");

			if (player == 'o') {
				row = scanner.nextInt();
				column = scanner.nextInt();
			} else if (player == 'x') {
				row = random.nextInt(3);
				column = random.nextInt(3);
			}

			while (game.checkIfLegal(row, column)) {
				System.out.println("This is filled already please re-enter  ");
				game.displayBoard();
				if (player == 'o') {
					row = scanner.nextInt();
					column = scanner.nextInt();
				} else if (player == 'x') {
					row = random.nextInt(3);
					column = random.nextInt(3);
				}

			}

			game.changeBoard(player, row, column);
			game.displayBoard();

			if (game.checkIfWinner()) {
				System.out.println("\nThe winner is " + player + " !");
				break;

			}

			if (game.checkIfTie()) {
				System.out.println("\nThe game is a tie !");
				break;
			}
		}

	}
}
