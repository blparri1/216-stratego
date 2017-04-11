package edu.asu.stratego.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.asu.stratego.game.BattleOutcome;
import edu.asu.stratego.game.Piece;
import edu.asu.stratego.game.PieceColor;
import edu.asu.stratego.game.PieceType;

public class SpyTest {
	

	//Spies
	Piece redSpy;
	Piece blueSpy;
	
	//Blue pieces
	Piece blueScout;
	Piece blueMiner;
	Piece blueSergeant;
	Piece blueLieutenant;
	Piece blueCaptain;
	Piece blueMajor;
	Piece blueColonel;
	Piece blueGeneral;
	Piece blueMarshal;
	Piece blueBomb;
	
	//Red pieces
	Piece redScout;
	Piece redMiner;
	Piece redSergeant;
	Piece redLieutenant;
	Piece redCaptain;
	Piece redMajor;
	Piece redColonel;
	Piece redGeneral;
	Piece redMarshal;
	Piece redBomb;

	
	BattleOutcome outcome;

	@Before
	public void setUp() throws Exception {
		redSpy = new Piece(PieceType.SPY, PieceColor.RED, false);
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
		blueBomb = new Piece(PieceType.BOMB, PieceColor.BLUE, true);
		
		redScout = new Piece(PieceType.SCOUT, PieceColor.RED, true);
		redMiner = new Piece(PieceType.MINER, PieceColor.RED, true);
		redSergeant = new Piece(PieceType.SERGEANT, PieceColor.RED, true);
		redLieutenant = new Piece(PieceType.LIEUTENANT, PieceColor.RED, true);
		redCaptain = new Piece(PieceType.CAPTAIN, PieceColor.RED, true);
		redMajor = new Piece(PieceType.MAJOR, PieceColor.RED, true);
		redColonel = new Piece(PieceType.COLONEL, PieceColor.RED, true);
		redGeneral = new Piece(PieceType.GENERAL, PieceColor.RED, true);
		redMarshal = new Piece(PieceType.MARSHAL, PieceColor.RED, true);
		redBomb = new Piece(PieceType.BOMB, PieceColor.RED, true);
		
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
		blueBomb = null;
		
		redScout = null;
		redMiner = null;
		redSergeant = null;
		redLieutenant = null;
		redCaptain = null;
		redMajor = null;
		redColonel = null;
		redGeneral = null;
		redMarshal = null;
		redBomb = null;
		
	}

	@Test
	public void test() {
		
		//Testing for Blue Spy attacking any red piece. Spy should lose
		
		//Spy attacks spy
		outcome = redSpy.getPieceType().attack(blueSpy.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Spy attacks Scout
		outcome = redSpy.getPieceType().attack(blueScout.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Spy attacks Miner
		outcome = redSpy.getPieceType().attack(blueMiner.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Spy attacks Sergeant
		outcome = redSpy.getPieceType().attack(blueSergeant.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Spy attacks Lieutenant
		outcome = redSpy.getPieceType().attack(blueLieutenant.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Spy attacks Captain
		outcome = redSpy.getPieceType().attack(blueCaptain.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Spy attacks Major
		outcome = redSpy.getPieceType().attack(blueMajor.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Spy attacks Colonel
		outcome = redSpy.getPieceType().attack(blueColonel.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Spy attacks bomb
		outcome = redSpy.getPieceType().attack(blueBomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		
		//Testing for Red Spy to attack any blue piece. Spy should lose.
		
		//Spy attacks Spy
		outcome = blueSpy.getPieceType().attack(redSpy.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Spy attacks Scout
		outcome = blueSpy.getPieceType().attack(redScout.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Spy attacks Miner
		outcome = blueSpy.getPieceType().attack(redMiner.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Spy attacks Sergeant
		outcome = blueSpy.getPieceType().attack(redSergeant.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Spy attacks Lieutenant
		outcome = blueSpy.getPieceType().attack(redLieutenant.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Spy attacks Captain
		outcome = blueSpy.getPieceType().attack(redCaptain.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Spy attacks Major
		outcome = blueSpy.getPieceType().attack(redMajor.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Spy attacks Colonel
		outcome = blueSpy.getPieceType().attack(redColonel.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		
		//Spy attacks bomb
		outcome = blueSpy.getPieceType().attack(redBomb.getPieceType());
		assertFalse(outcome == BattleOutcome.WIN);
		 
		//Spy attacking the Marshal. Spy should win this battle.
		
		//Spy attacks Marshal
		outcome = blueSpy.getPieceType().attack(redMarshal.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		outcome = redSpy.getPieceType().attack(blueMarshal.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		
	}

}
