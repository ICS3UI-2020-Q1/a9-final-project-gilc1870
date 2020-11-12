import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Main implements Runnable, ActionListener{

  // Setting up the buttons
    JPanel mainPanel = new JPanel();

    JPanel gameScreen;

    JLabel picture;

    ImageIcon rpcImage;

    JButton rpcButton;

    JTextField instruc = new JTextField();


   JButton rbutton = new JButton("Rock");
   JButton pbutton = new JButton("Paper");
   JButton sbutton = new JButton("Scissors");

  
  
  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Rock, Paper, Scissors");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);
    // Initializing picture
    gameScreen = new JPanel();
    gameScreen.setLayout(null);

    rpcButton = new JButton("Rock,Paper,Scissors System");
    rpcButton.addActionListener(this);
    rpcButton.setActionCommand("rpc");

    
    rbutton.setBounds(340, 450, 80, 70);
    pbutton.setBounds(433, 233, 80, 70);
    sbutton.setBounds(233,233, 100, 70);
    instruc.setBounds(200, 200, 100, 100);
  
    rpcImage = new ImageIcon("RPS.png");

    picture = new JLabel(rpcImage);
    picture.setBounds(300, 300, 150, 150);

    //Finalize picturn
    gameScreen.add(rpcButton);
    gameScreen.add(picture);

    gameScreen.add(instruc);

gameScreen.add(rbutton);
   gameScreen.add(pbutton);
   gameScreen.add(sbutton);

    frame.add(gameScreen);


  


  

   //Rock beats Scissors. you lose
   // Rock beats Scissors. you win
   // Scissors beat Paper. you lose
  // Scissors beats paper. you win
  // Paper beats Rock. you lose 
  // Paper beats Rock. you win
  // Paper = Paper. Draw
  // Rock = Rock. Draw
  //Scissors = Scissors. Draw


  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();
  
  }
    



  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
