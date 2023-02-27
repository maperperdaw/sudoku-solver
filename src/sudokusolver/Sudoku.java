package sudokusolver;

public class Sudoku {
	public int[][] keyboard;
	public int[][] originalKeyboard;
	public static final int SIZE = 9;

	public Sudoku(int[][] keyboard) {
		assert (keyboard.length == SIZE);
		assert (keyboard[0].length == SIZE);
		this.keyboard = keyboard;

		originalKeyboard = new int[SIZE][SIZE];
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				originalKeyboard[i][j] = this.keyboard[i][j];
			}
		}
	}

//	public boolean canNumberBeAdded(int number, int posX, int posY) {
//		
//	}

	public boolean canNumberBeAddedToColumn(int number, int posX, int posY) {
		if (keyboard[posX][posY] != 0)
			return false;
		for (int i = 0; i < SIZE && i != posX; i++) {
			if (keyboard[i][posY] == number)
				return false;
		}
		return true;
	}

	public boolean canNumberBeAddedRow(int number, int posX, int posY) {
		if (keyboard[posX][posY] != 0)
			return false;
		for (int i = 0; i < SIZE && i != posY; i++) {
			if (keyboard[posX][i] == number)
				return false;
		}
		return true;
	}

	public boolean canNumberBeAddedSquare(int number, int posX, int posY) {
		if (keyboard[posX][posY] != 0)
			return false;
		
		int xPositionCorner = this.getPositionCorner(posX);
		int yPositionCorner = this.getPositionCorner(posY);
		for (int i = xPositionCorner; i < xPositionCorner + 3; i++) {
			for (int j = yPositionCorner; j < yPositionCorner + 3; j++) {
				if (keyboard[i][j] == number) return false;
			}
		}
		return true;
	}

	public int getPositionCorner(int pos) {
		if (pos < 3)
			return 0;
		if (pos == 3 || pos < 6)
			return 3;
		if (pos == 6 || pos < 9)
			return 6;
		return -1;
	}

}
