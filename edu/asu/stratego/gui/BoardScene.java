package edu.asu.stratego.gui;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import edu.asu.stratego.game.Game;
import edu.asu.stratego.gui.board.BoardTurnIndicator;
import edu.asu.stratego.gui.board.setup.SetupPanel;
import edu.asu.stratego.media.ImageConstants;



/**
 * Wrapper class for a JavaFX scene. Contains a scene UI and its associated 
 * event handlers for playing a game of Stratego.
 */
public class BoardScene {
    
    private final double UNIT = ClientStage.getUnit();
    private final int    SIDE = ClientStage.getSide();
    
    private static StackPane root       = new StackPane();
    private static GridPane  setupPanel = new GridPane();
    
    
    Scene scene;
    
    /**
     * Creates a new instance of BoardScene.
     */
    public BoardScene() {
                
        /* ================ Board Design ================
         * 
         * The scene is divided into a 12 x 12 grid.
         * Each unit represents a 1 x 1 area.
         * 
         * The scene should be about roughly 85% of the 
         * square of the height of the player's screen 
         * resolution.
         * 
         *          = = = = = = = = = = = =
         *          = + + + + + + + + + + =
         *          = + + + + + + + + + + =
         *          = + + + + + + + + + + =
         *          = + + + + + + + + + + =
         *          = + + + + + + + + + + =
         *          = + + + + + + + + + + =
         *          = + + + + + + + + + + =
         *          = + + + + + + + + + + =
         *          = + + + + + + + + + + =
         *          = + + + + + + + + + + =
         *          = = = = = = = = = = = =
         * 
         * Each '=' indicates part of the board border.
         * Each '+' indicates an individual board square.
         * 
         * Part of the border image is semi-transparent so
         * that the scene background color can come through 
         * to indicate which player's turn it is.
         */
        
        // Set the background color (turn indicator).
        BoardTurnIndicator indicator = new BoardTurnIndicator();
        Rectangle background = BoardTurnIndicator.getTurnIndicator();
        
        
        // TODO Sound test here
        //PlaySound.playMusic("cornfield", 1);
        
        // Resize the board.
        final int size = 10;
        for (int row = 0; row < size; ++row) {
            for (int col = 0; col < size; ++col) {
                Game.getBoard().getSquare(row, col).getPiecePane().getPiece().setFitHeight(UNIT);
                Game.getBoard().getSquare(row, col).getPiecePane().getPiece().setFitWidth(UNIT);
                Game.getBoard().getSquare(row, col).getEventPane().getHover().setFitHeight(UNIT);
                Game.getBoard().getSquare(row, col).getEventPane().getHover().setFitWidth(UNIT);
            }
        }
        
        // Create the setup panel.
        new SetupPanel();
        setupPanel = SetupPanel.getSetupPanel();
        StackPane.setMargin(setupPanel, new Insets(UNIT, 0, 0, 0));
        StackPane.setAlignment(setupPanel, Pos.TOP_CENTER);
             
        
        // Create the border.
        ImageView border = new ImageView(ImageConstants.BORDER);
        StackPane.setAlignment(border, Pos.CENTER);
        border.setFitHeight(SIDE);
        border.setFitWidth(SIDE);
        
        // Show Board GUI.
        root = new StackPane(background, Game.getBoard().getPiecePane(), 
                             Game.getBoard().getEventPane(), setupPanel, border);
        root.setMaxSize(SIDE, SIDE);
        Game.getBoard().getPiecePane().setAlignment(Pos.CENTER);
        Game.getBoard().getEventPane().setAlignment(Pos.CENTER);
        
               
        scene = new Scene(root, SIDE, SIDE); 
        
       
        ////////////////////////////////////////////////////////

        MenuBar menuBar = new MenuBar();
        
        // --- Menu File
        Menu menuFile = new Menu("Menu");
        // --- Menu Items
        MenuItem help = new MenuItem("Help");
        MenuItem exit = new MenuItem("Quit Game");

        
        
        // Action that quits game 
        exit.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                System.exit(0);
            }
        });
        
        //Opens the help page
        help.setOnAction(new EventHandler<ActionEvent>() {
        	public void handle(ActionEvent t) {
        		Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Help");
				alert.setHeaderText("Click on 'Show Details' to read the rules of the game");

				String rules ="Stratego is a game in which you need to capture the flag of your opponent while"+
					" defending your own flag. To capture the flag you use your army of 40 pieces. Pieces have a rank"+
					" and represent individual officers and soldiers in an army. In addition to those ranked pieces you "+
					"can use bombs to protect your flag.Pieces move 1 square per turn, horizontally or vertically. Only the scout"+
					"can move over multiple empty squares per turn. Pieces cannot jump over another piece."+
					"If a piece is moved onto a square occupied by an opposing piece, their identities are revealed. The weaker piece "+
					"is removed from the board, and the stronger piece is moved into the place formerly occupied by the weaker" +""
					+ "piece. If the engaging pieces are of equal rank, they are both removed. Pieces may not move onto a square already "+
					"occupied by another piece without attacking. Exception to the rule of the higher rank winning is the spy. When the spy"+
					"attacks the marshal, the spy defeats the higher ranked marshal. However, when the marshal attacks the spy, the spy loses. Bombs lose when they are defused by a miner."+
					"The bombs and the flag cannot be moved. A bomb defeats every piece that tries to attack it, except the miner. The flag loses from every"+
					" other piece. When you capture the flag of your opponent you win the game.The Stratego board consists of 10 x 10 squares. Within the board "+
					"there are two obstacles of 2 x 2 squares each. Pieces are not allowed to move there.\n" +
					
					"\nRanks of Stratego Pieces: \nF. Flag \nB. Bomb \nS. Spy \n2. Scout \n3. Miner \n4. Sergeants \n5. Lieutenents \n6. Captain \n7. Major \n8. Colonel \n9. General \n10. Marshal "; 
				

				Label label = new Label("The Rules of Stratego:");

				TextArea textArea = new TextArea(rules);
				textArea.setEditable(false);
				textArea.setWrapText(true);

				textArea.setMaxWidth(Double.MAX_VALUE);
				textArea.setMaxHeight(Double.MAX_VALUE);
				GridPane.setVgrow(textArea, Priority.ALWAYS);
				GridPane.setHgrow(textArea, Priority.ALWAYS);

				GridPane expContent = new GridPane();
				expContent.setMaxWidth(Double.MAX_VALUE);
				expContent.add(label, 0, 0);
				expContent.add(textArea, 0, 1);

				// Set expandable Exception into the dialog pane.
				alert.getDialogPane().setExpandableContent(expContent);
				 
				 
				 
				alert.showAndWait();	 
        	}
        });

        menuFile.getItems().addAll(help, exit);
        menuBar.getMenus().addAll(menuFile);
        menuBar.prefWidthProperty().bind(border.fitWidthProperty());
               
        root.getChildren().add(menuBar);
        StackPane.setAlignment(menuBar, Pos.TOP_CENTER);
        
        ////////////////////////////////////////////////////////  

        
    }
    
    public static StackPane getRootPane() {
        return root;
    }
    
    public static GridPane getSetupPanel() {
        return setupPanel;
    }
}