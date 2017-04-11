package edu.asu.stratego.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.asu.stratego.game.BattleOutcome;
import edu.asu.stratego.game.Piece;
import edu.asu.stratego.game.PieceColor;
import edu.asu.stratego.game.PieceType;

/**
 * Testing all Non-special unit combat
 * @author Bryan Parrish
 * @version 4/8/2017
 */
public class NormalUnitTest {

	//SCOUT
	Piece testScoutBlue, testScoutRed;
	//SERGEANT
	Piece testSergentBlue, testSergentRed;
	//LIEUTENANT
	Piece testLieutenantBlue, testLieutenantRed;
	//CAPTAIN
	Piece testCaptainBlue, testCaptianRed;
	//MAJOR
	Piece testMajorBlue, testMajorRed;
	//COLONEL
	Piece testColonelBlue, testColonelRed;
	//GENERAL
	Piece testGeneralBlue, testGeneralRed;
	//MARSHAL
	Piece testMarshalBlue, testMarshalRed;
	
	BattleOutcome outcome;
	
	@Before
	public void setUp() throws Exception {
		
		testScoutBlue = new Piece(PieceType.SCOUT, PieceColor.BLUE, false);
		testScoutRed = new Piece(PieceType.SCOUT, PieceColor.RED, true);
		
		testSergentBlue = new Piece(PieceType.SERGEANT, PieceColor.BLUE, false);
		testSergentRed = new Piece(PieceType.SERGEANT, PieceColor.RED, true);
		
		testLieutenantBlue = new Piece(PieceType.LIEUTENANT, PieceColor.BLUE, false);
		testLieutenantRed = new Piece(PieceType.LIEUTENANT, PieceColor.RED, true);
		
		testCaptainBlue = new Piece(PieceType.CAPTAIN, PieceColor.BLUE, false);
		testCaptianRed = new Piece(PieceType.CAPTAIN, PieceColor.RED, true);
		
		testMajorBlue = new Piece(PieceType.MAJOR, PieceColor.BLUE, false);
		testMajorRed = new Piece(PieceType.MAJOR, PieceColor.RED, true);
		
		testColonelBlue = new Piece(PieceType.COLONEL, PieceColor.BLUE, false);
		testColonelRed = new Piece(PieceType.COLONEL, PieceColor.RED, true);
		
		testGeneralBlue = new Piece(PieceType.GENERAL, PieceColor.BLUE, false);
		testGeneralRed = new Piece(PieceType.GENERAL, PieceColor.RED, true);
		
		testMarshalBlue = new Piece(PieceType.MARSHAL, PieceColor.BLUE, false);
		testMarshalRed = new Piece(PieceType.MARSHAL, PieceColor.RED, true);
	}

	@After
	public void tearDown() throws Exception {
		
		testScoutBlue = null;
		testScoutRed = null;
		testSergentBlue = null;
		testSergentRed = null;
		testLieutenantBlue = null;
		testLieutenantRed = null;		
		testCaptainBlue = null;
		testCaptianRed = null;
		testMajorBlue = null;
		testMajorRed = null;
		testColonelBlue = null;
		testColonelRed = null;
		testGeneralBlue = null;
		testGeneralRed = null;
		testMarshalBlue = null;
		testMarshalRed = null;
	}
	
	@Test
	public void scoutTest() {
		
		//Scout attacking enemy Scout
		outcome = testScoutBlue.getPieceType().attack(testScoutRed.getPieceType());
		assertTrue(outcome == BattleOutcome.DRAW);
		//Scout attacking player
		outcome = testScoutRed.getPieceType().attack(testScoutBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.DRAW);
		
		//Scout attacking enemy Sergent
		outcome = testScoutBlue.getPieceType().attack(testSergentRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Sergeant attacking player
		outcome = testSergentRed.getPieceType().attack(testScoutBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Sergeant attacking enemy Lieutenant
		outcome = testScoutBlue.getPieceType().attack(testLieutenantRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Lieutenant attacking player 
		outcome = testLieutenantRed.getPieceType().attack(testScoutBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Sergeant attacking enemy Captain
		outcome = testScoutBlue.getPieceType().attack(testCaptianRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Captain attacking player 
		outcome = testCaptianRed.getPieceType().attack(testScoutBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Sergeant attacking enemy Major
		outcome = testScoutBlue.getPieceType().attack(testMajorRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Major attacking player 
		outcome = testMajorRed.getPieceType().attack(testScoutBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Sergeant attacking enemy Colonel
		outcome = testScoutBlue.getPieceType().attack(testColonelRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Colonel attacking player 
		outcome = testColonelRed.getPieceType().attack(testScoutBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Sergeant attacking enemy General
		outcome = testScoutBlue.getPieceType().attack(testGeneralRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//General attacking player 
		outcome = testGeneralRed.getPieceType().attack(testScoutBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Sergeant attacking enemy Marshal
		outcome = testScoutBlue.getPieceType().attack(testMarshalRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Marshal attacking player 
		outcome = testMarshalRed.getPieceType().attack(testScoutBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
	}

	@Test
	public void sergentTest() {
		
		//Scout attacking enemy Sergent
		outcome = testSergentBlue.getPieceType().attack(testScoutRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Scout attacking player
		outcome = testScoutRed.getPieceType().attack(testSergentBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Sergeant attacking enemy Sergent
		outcome = testSergentBlue.getPieceType().attack(testSergentRed.getPieceType());
		assertTrue(outcome == BattleOutcome.DRAW);
		//Sergeant attacking player
		outcome = testSergentRed.getPieceType().attack(testSergentBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.DRAW);
		
		//Sergeant attacking enemy Lieutenant
		outcome = testSergentBlue.getPieceType().attack(testLieutenantRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Lieutenant attacking player 
		outcome = testLieutenantRed.getPieceType().attack(testSergentBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Sergeant attacking enemy Captain
		outcome = testSergentBlue.getPieceType().attack(testCaptianRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Captain attacking player 
		outcome = testCaptianRed.getPieceType().attack(testSergentBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Sergeant attacking enemy Major
		outcome = testSergentBlue.getPieceType().attack(testMajorRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Major attacking player 
		outcome = testMajorRed.getPieceType().attack(testSergentBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Sergeant attacking enemy Colonel
		outcome = testSergentBlue.getPieceType().attack(testColonelRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Colonel attacking player 
		outcome = testColonelRed.getPieceType().attack(testSergentBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Sergeant attacking enemy General
		outcome = testSergentBlue.getPieceType().attack(testGeneralRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//General attacking player 
		outcome = testGeneralRed.getPieceType().attack(testSergentBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Sergeant attacking enemy Marshal
		outcome = testSergentBlue.getPieceType().attack(testMarshalRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Marshal attacking player 
		outcome = testMarshalRed.getPieceType().attack(testSergentBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
	}
	
	@Test
	public void lieutenantTest() {
		
		//Lieutenant attacking enemy Sergent
		outcome = testLieutenantBlue.getPieceType().attack(testScoutRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Scout attacking player
		outcome = testScoutRed.getPieceType().attack(testLieutenantBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Lieutenant attacking enemy Sergent
		outcome = testLieutenantBlue.getPieceType().attack(testSergentRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Lieutenant attacking player
		outcome = testSergentRed.getPieceType().attack(testLieutenantBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Lieutenant attacking enemy Lieutenant
		outcome = testLieutenantBlue.getPieceType().attack(testLieutenantRed.getPieceType());
		assertTrue(outcome == BattleOutcome.DRAW);
		//Lieutenant attacking player 
		outcome = testLieutenantRed.getPieceType().attack(testLieutenantBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.DRAW);
		
		//Lieutenant attacking enemy Captain
		outcome = testLieutenantBlue.getPieceType().attack(testCaptianRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Captain attacking player 
		outcome = testCaptianRed.getPieceType().attack(testLieutenantBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Lieutenant attacking enemy Major
		outcome = testLieutenantBlue.getPieceType().attack(testMajorRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Major attacking player 
		outcome = testMajorRed.getPieceType().attack(testLieutenantBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Lieutenant attacking enemy Colonel
		outcome = testLieutenantBlue.getPieceType().attack(testColonelRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Colonel attacking player 
		outcome = testColonelRed.getPieceType().attack(testLieutenantBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Lieutenant attacking enemy General
		outcome = testLieutenantBlue.getPieceType().attack(testGeneralRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//General attacking player 
		outcome = testGeneralRed.getPieceType().attack(testLieutenantBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Lieutenant attacking enemy Marshal
		outcome = testLieutenantBlue.getPieceType().attack(testMarshalRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Marshal attacking player 
		outcome = testMarshalRed.getPieceType().attack(testLieutenantBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
	}

	@Test
	public void captainTest() {
		
		//Lieutenant attacking enemy Sergent
		outcome = testCaptainBlue.getPieceType().attack(testScoutRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Scout attacking player
		outcome = testScoutRed.getPieceType().attack(testCaptainBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Captain attacking enemy Sergent
		outcome = testCaptainBlue.getPieceType().attack(testSergentRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Sergeny attacking player
		outcome = testSergentRed.getPieceType().attack(testCaptainBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Captain attacking enemy Lieutenant
		outcome = testCaptainBlue.getPieceType().attack(testLieutenantRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Lieutenant attacking player 
		outcome = testLieutenantRed.getPieceType().attack(testCaptainBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Captain attacking enemy Captain
		outcome = testCaptainBlue.getPieceType().attack(testCaptianRed.getPieceType());
		assertTrue(outcome == BattleOutcome.DRAW);
		//Captain attacking player 
		outcome = testCaptianRed.getPieceType().attack(testCaptainBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.DRAW);
		
		//Captain attacking enemy Major
		outcome = testCaptainBlue.getPieceType().attack(testMajorRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Major attacking player 
		outcome = testMajorRed.getPieceType().attack(testCaptainBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Captain attacking enemy Colonel
		outcome = testCaptainBlue.getPieceType().attack(testColonelRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Colonel attacking player 
		outcome = testColonelRed.getPieceType().attack(testCaptainBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Captain attacking enemy General
		outcome = testCaptainBlue.getPieceType().attack(testGeneralRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//General attacking player 
		outcome = testGeneralRed.getPieceType().attack(testCaptainBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Captain attacking enemy Marshal
		outcome = testCaptainBlue.getPieceType().attack(testMarshalRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Marshal attacking player 
		outcome = testMarshalRed.getPieceType().attack(testCaptainBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
	}
	
	@Test
	public void majorTest() {
		
		//Major attacking enemy Sergent
		outcome = testMajorBlue.getPieceType().attack(testScoutRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Scout attacking player
		outcome = testScoutRed.getPieceType().attack(testMajorBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Major attacking enemy Sergent
		outcome = testMajorBlue.getPieceType().attack(testSergentRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Sergeny attacking player
		outcome = testSergentRed.getPieceType().attack(testMajorBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Major attacking enemy Lieutenant
		outcome = testMajorBlue.getPieceType().attack(testLieutenantRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Lieutenant attacking player 
		outcome = testLieutenantRed.getPieceType().attack(testMajorBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Major attacking enemy Captain
		outcome = testMajorBlue.getPieceType().attack(testCaptianRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Captain attacking player 
		outcome = testCaptianRed.getPieceType().attack(testMajorBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Major attacking enemy Major
		outcome = testMajorBlue.getPieceType().attack(testMajorRed.getPieceType());
		assertTrue(outcome == BattleOutcome.DRAW);
		//Major attacking player 
		outcome = testMajorRed.getPieceType().attack(testMajorBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.DRAW);
		
		//Major attacking enemy Colonel
		outcome = testMajorBlue.getPieceType().attack(testColonelRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Colonel attacking player 
		outcome = testColonelRed.getPieceType().attack(testMajorBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Major attacking enemy General
		outcome = testMajorBlue.getPieceType().attack(testGeneralRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//General attacking player 
		outcome = testGeneralRed.getPieceType().attack(testMajorBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Major attacking enemy Marshal
		outcome = testMajorBlue.getPieceType().attack(testMarshalRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Marshal attacking player 
		outcome = testMarshalRed.getPieceType().attack(testMajorBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
	}
	
	@Test
	public void colonelTest() {
		
		//Colonel attacking enemy Sergent
		outcome = testColonelBlue.getPieceType().attack(testScoutRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Scout attacking player
		outcome = testScoutRed.getPieceType().attack(testColonelBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Colonel attacking enemy Sergent
		outcome = testColonelBlue.getPieceType().attack(testSergentRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Sergeny attacking player
		outcome = testSergentRed.getPieceType().attack(testColonelBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Colonel attacking enemy Lieutenant
		outcome = testColonelBlue.getPieceType().attack(testLieutenantRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Lieutenant attacking player 
		outcome = testLieutenantRed.getPieceType().attack(testColonelBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Colonel attacking enemy Captain
		outcome = testColonelBlue.getPieceType().attack(testCaptianRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Captain attacking player 
		outcome = testCaptianRed.getPieceType().attack(testColonelBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Colonel attacking enemy Major
		outcome = testColonelBlue.getPieceType().attack(testMajorRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Major attacking player 
		outcome = testMajorRed.getPieceType().attack(testColonelBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Colonel attacking enemy Colonel
		outcome = testColonelBlue.getPieceType().attack(testColonelRed.getPieceType());
		assertTrue(outcome == BattleOutcome.DRAW);
		//Colonel attacking player 
		outcome = testColonelRed.getPieceType().attack(testColonelBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.DRAW);
		
		//Colonel attacking enemy General
		outcome = testColonelBlue.getPieceType().attack(testGeneralRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//General attacking player 
		outcome = testGeneralRed.getPieceType().attack(testColonelBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		
		//Colonel attacking enemy Marshal
		outcome = testColonelBlue.getPieceType().attack(testMarshalRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Marshal attacking player 
		outcome = testMarshalRed.getPieceType().attack(testColonelBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
	}
	
	@Test
	public void generalTest() {
		
		//General attacking enemy Sergent
		outcome = testGeneralBlue.getPieceType().attack(testScoutRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Scout attacking player
		outcome = testScoutRed.getPieceType().attack(testGeneralBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//General attacking enemy Sergent
		outcome = testGeneralBlue.getPieceType().attack(testSergentRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Sergeny attacking player
		outcome = testSergentRed.getPieceType().attack(testGeneralBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//General attacking enemy Lieutenant
		outcome = testGeneralBlue.getPieceType().attack(testLieutenantRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Lieutenant attacking player 
		outcome = testLieutenantRed.getPieceType().attack(testGeneralBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//General attacking enemy Captain
		outcome = testGeneralBlue.getPieceType().attack(testCaptianRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Captain attacking player 
		outcome = testCaptianRed.getPieceType().attack(testGeneralBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//General attacking enemy Major
		outcome = testGeneralBlue.getPieceType().attack(testMajorRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Major attacking player 
		outcome = testMajorRed.getPieceType().attack(testGeneralBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//General attacking enemy Colonel
		outcome = testGeneralBlue.getPieceType().attack(testColonelRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Colonel attacking player 
		outcome = testColonelRed.getPieceType().attack(testGeneralBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//General attacking enemy General
		outcome = testGeneralBlue.getPieceType().attack(testGeneralRed.getPieceType());
		assertTrue(outcome == BattleOutcome.DRAW);
		//General attacking player 
		outcome = testGeneralRed.getPieceType().attack(testGeneralBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.DRAW);
		
		//General attacking enemy Marshal
		outcome = testGeneralBlue.getPieceType().attack(testMarshalRed.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		//Marshal attacking player 
		outcome = testMarshalRed.getPieceType().attack(testGeneralBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
	}
	
	@Test
	public void marshalTest() {
		
		//Marshal attacking enemy Sergent
		outcome = testMarshalBlue.getPieceType().attack(testScoutRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Scout attacking player
		outcome = testScoutRed.getPieceType().attack(testMarshalBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Marshal attacking enemy Sergent
		outcome = testMarshalBlue.getPieceType().attack(testSergentRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Sergeny attacking player
		outcome = testSergentRed.getPieceType().attack(testMarshalBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Marshal attacking enemy Lieutenant
		outcome = testMarshalBlue.getPieceType().attack(testLieutenantRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Lieutenant attacking player 
		outcome = testLieutenantRed.getPieceType().attack(testMarshalBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Marshal attacking enemy Captain
		outcome = testMarshalBlue.getPieceType().attack(testCaptianRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Captain attacking player 
		outcome = testCaptianRed.getPieceType().attack(testMarshalBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Marshal attacking enemy Major
		outcome = testMarshalBlue.getPieceType().attack(testMajorRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Major attacking player 
		outcome = testMajorRed.getPieceType().attack(testMarshalBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Marshal attacking enemy Colonel
		outcome = testMarshalBlue.getPieceType().attack(testColonelRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//Colonel attacking player 
		outcome = testColonelRed.getPieceType().attack(testMarshalBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Marshal attacking enemy General
		outcome = testMarshalBlue.getPieceType().attack(testGeneralRed.getPieceType());
		assertTrue(outcome == BattleOutcome.WIN);
		//General attacking player 
		outcome = testGeneralRed.getPieceType().attack(testMarshalBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.LOSE);
		
		//Marshal attacking enemy Marshal
		outcome = testMarshalBlue.getPieceType().attack(testMarshalRed.getPieceType());
		assertTrue(outcome == BattleOutcome.DRAW);
		//Marshal attacking player 
		outcome = testMarshalRed.getPieceType().attack(testMarshalBlue.getPieceType());
		assertTrue(outcome == BattleOutcome.DRAW);
	}	
}
