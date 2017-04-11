package edu.asu.stratego.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.asu.stratego.game.BattleOutcome;
import edu.asu.stratego.game.Piece;
import edu.asu.stratego.game.PieceColor;
import edu.asu.stratego.game.PieceType;

public class TestMinerAndBomb {
	
		
		//Piece Bomb
		Piece bomb;
		
		//Blue pieces
		Piece blueSpy;
		Piece blueScout;
		Piece blueMiner;
		Piece blueSergeant;
		Piece blueLieutenant;
		Piece blueCaptain;
		Piece blueMajor;
		Piece blueColonel;
		Piece blueGeneral;
		Piece blueMarshal;
		
		//Red pieces
		Piece redSpy;
		Piece redScout;
		Piece redMiner;
		Piece redSergeant;
		Piece redLieutenant;
		Piece redCaptain;
		Piece redMajor;
		Piece redColonel;
		Piece redGeneral;
		Piece redMarshal;
		
		BattleOutcome outcome;


	@Before
	public void setUp() throws Exception {
		
		//Create blue pieces
		blueSpy = new Piece(PieceType.SPY, PieceColor.BLUE, true);
		blueScout = new Piece(PieceType.SCOUT, PieceColor.BLUE, true);
		blueMiner = new Piece(PieceType.MINER, PieceColor.BLUE, true);
		blueSergeant = new Piece(PieceType.SERGEANT, PieceColor.BLUE, true);
		blueLieutenant = new Piece(PieceType.LIEUTENANT, PieceColor.BLUE, true);
		blueCaptain = new Piece(PieceType.CAPTAIN, PieceColor.BLUE, true);
		blueMajor = new Piece(PieceType.MAJOR, PieceColor.BLUE, true);
		blueColonel = new Piece(PieceType.COLONEL, PieceColor.BLUE, true);
		blueGeneral = new Piece(PieceType.GENERAL, PieceColor.BLUE, true);
		blueMarshal = new Piece(PieceType.MARSHAL, PieceColor.BLUE, true);
		
		//Create red pieces
		redSpy = new Piece(PieceType.SPY, PieceColor.RED, false);
		redScout = new Piece(PieceType.SCOUT, PieceColor.RED, true);
		redMiner = new Piece(PieceType.MINER, PieceColor.RED, true);
		redSergeant = new Piece(PieceType.SERGEANT, PieceColor.RED, true);
		redLieutenant = new Piece(PieceType.LIEUTENANT, PieceColor.RED, true);
		redCaptain = new Piece(PieceType.CAPTAIN, PieceColor.RED, true);
		redMajor = new Piece(PieceType.MAJOR, PieceColor.RED, true);
		redColonel = new Piece(PieceType.COLONEL, PieceColor.RED, true);
		redGeneral = new Piece(PieceType.GENERAL, PieceColor.RED, true);
		redMarshal = new Piece(PieceType.MARSHAL, PieceColor.RED, true);
		
		//Create Bomb piece
		bomb = new Piece(PieceType.BOMB, PieceColor.BLUE, true);
		
	}

	@After
	public void tearDown() throws Exception {
		redSpy = null;
		blueSpy = null;
		blueMiner = null;
		blueSergeant = null;
		blueLieutenant = null;
		blueCaptain = null;
		blueMajor = null;
		blueColonel = null;
		blueGeneral = null;
		blueMarshal = null;
		redScout = null;
		redMiner = null;
		redSergeant = null;
		redLieutenant = null;
		redCaptain = null;
		redMajor = null;
		redColonel = null;
		redGeneral = null;
		redMarshal = null;
		
	}

	@Test
	public void test() {
		
		//Spy attacks bomb and loses
		outcome = redSpy.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Scout attacks bomb and loses
		outcome = redScout.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Sergeant attacks bomb and loses
		outcome = redSergeant.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Lieutenant attacks bomb and loses
		outcome = redLieutenant.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Captain
		outcome = redCaptain.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Major
		outcome = redMajor.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Colonel
		outcome = redColonel.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//General
		outcome = redGeneral.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Marshal
		outcome = redMarshal.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Miner attacks bomb and wins
		outcome = redMiner.getPieceType().attack(bomb.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Blue pieces
		
		bomb = new Piece(PieceType.BOMB, PieceColor.RED, true);

		
		//Spy attacks bomb and loses
		outcome = blueSpy.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Scout attacks bomb and loses
		outcome = blueScout.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Sergeant attacks bomb and loses
		outcome = blueSergeant.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Lieutenant attacks bomb and loses
		outcome = blueLieutenant.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Captain
		outcome = blueCaptain.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Major
		outcome = blueMajor.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Colonel
		outcome = blueColonel.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//General
		outcome = blueGeneral.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Marshal
		outcome = blueMarshal.getPieceType().attack(bomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Miner attacks bomb and wins
		outcome = blueMiner.getPieceType().attack(bomb.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		
	}

}
