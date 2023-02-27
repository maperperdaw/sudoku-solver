package test;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationTargetException;

import org.junit.jupiter.api.Test;

import sudokusolver.Sudoku;

class TestSudoku {

	public Sudoku sudoku;

	public void init() {
		int[][] board = {
				  { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
				  { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
				  { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
				  { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
				  { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
				  { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
				  { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
				  { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
				  { 0, 9, 0, 0, 0, 0, 4, 0, 0 } 
				};
		sudoku = new Sudoku(board);
	}
	
	@Test
	public void testCanNumberBeAddedRow() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		init();
		assertTrue(sudoku.canNumberBeAddedRow(7, 8, 0));
	}

}
