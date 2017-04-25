package edu.asu.stratego;

import java.awt.BorderLayout;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import edu.asu.stratego.game.Player;
import edu.asu.stratego.game.ServerGameManager;

//
import edu.asu.stratego.gui.ClientOutcome;
//
/**
 * The Stratego Server creates a socket and listens for connections from every 
 * two players to form a game session. Each session is handled by a thread, 
 * ServerGameManager, that communicates with the two players and determines the 
 * status of the game.
 */
public class Server extends JFrame{
	
	public static void main(String[] args) throws IOException{
		
		Server frame = new Server();
		
	}
	
    public Server() throws IOException {
    	
    	JTextArea jtaLog = new JTextArea();

        // Create a scroll pane to hold text area
        JScrollPane scrollPane = new JScrollPane(jtaLog);

        // Add the scroll pane to the frame
        add(scrollPane, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setTitle("Stratego Server");
        setVisible(true);
        
        String hostAddress    = InetAddress.getLocalHost().getHostAddress();
        ServerSocket listener = null;
        int sessionNumber     = 1;
        
        try {
            listener = new ServerSocket(4212);
            jtaLog.append("Server started @ " + hostAddress + "\n");
            jtaLog.append("Waiting for incoming connections...\n");
            
            while (true) {
                Socket playerOne = listener.accept();
                jtaLog.append("Session " + sessionNumber + 
                                   ": Player 1 has joined the session at port " + playerOne.getPort() + "\n");
                
                Socket playerTwo = listener.accept();
                jtaLog.append("Session " + sessionNumber + 
                                   ": Player 2 has joined the session at port " + playerTwo.getPort() + "\n");
                
                jtaLog.append("Starting session " + sessionNumber + "\n");
                
                Thread session = new Thread(new ServerGameManager(
                        playerOne, playerTwo, sessionNumber++));
                session.setDaemon(true);
                session.start();
                sessionNumber++;
            }
        }
        
        finally { listener.close(); }
    }
}