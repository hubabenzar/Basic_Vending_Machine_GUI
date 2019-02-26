//Huba Ferenc Benzar

//importing
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

class Vending extends JFrame implements ActionListener{
    //Initiating the pound sign, labels, buttons and setting the total
    private static final String POUND = "\u00A3";
	private final JLabel totalPriceLabel = new JLabel("",JLabel.CENTER);
    private final JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9;
    private int option1 = 4,option2 = 4,option3 = 4,option4 = 4,option5 = 4,option6 = 4,option7 = 4,option8 = 4,option9 = 4;
    private double total = 0;
    //Constructor
	private Vending(){
		super("Vending Machine");													//Title of frame
        setDefaultCloseOperation(EXIT_ON_CLOSE);									//Exit on close
        setPreferredSize(new Dimension(800, 300));									//Setting dimension of 800 300
        ((JPanel) getContentPane()).setBorder(new EmptyBorder(10, 10, 10, 10) );	//Spacing
        setLayout(new GridLayout(0,3));												//Grid Layout
		setLocationRelativeTo(null);												//middle of screen
        setVisible(true);															//make the frame visible
        setResizable(false);														//dissallow resizing

        //Items																		Setting default colour for each item
        JButton btn1 = new JButton("Chocolate Jigglypuffs ("+POUND+"1.30)");		btn1.setBackground(Color.PINK);
        JButton btn2 = new JButton("Chocolate Bombs ("+POUND+"1.00)");				btn2.setBackground(Color.ORANGE);
        JButton btn3 = new JButton("Chocolate Twists ("+POUND+"0.80)"); 			btn3.setBackground(Color.CYAN);
        JButton btn4 = new JButton("Caramel Jigglypuffs ("+POUND+"1.30)");			btn4.setBackground(Color.PINK);
        JButton btn5 = new JButton("Caramle Bombs ("+POUND+"1.00)");				btn5.setBackground(Color.ORANGE);
        JButton btn6 = new JButton("Caramel Twists ("+POUND+"0.80)");				btn6.setBackground(Color.CYAN);
        JButton btn7 = new JButton("French Vanilla Jigglypuffs ("+POUND+"1.30)");	btn7.setBackground(Color.PINK);
        JButton btn8 = new JButton("French Vanilla Bombs ("+POUND+"1.00)");			btn8.setBackground(Color.ORANGE);
        JButton btn9 = new JButton("French Vanilla Twists ("+POUND+"0.80)");		btn9.setBackground(Color.CYAN);
        //Vendor information and reset stock button
        JButton btn10 = new JButton("Vendor Information");

        //Defining buttons					adding an action listener to each button
        btn1.setActionCommand ("ChJ");		btn1.addActionListener(this);
        btn2.setActionCommand ("ChB");		btn2.addActionListener(this);
        btn3.setActionCommand ("ChT");		btn3.addActionListener(this);
        btn4.setActionCommand ("CaJ");		btn4.addActionListener(this);
        btn5.setActionCommand ("CaB");		btn5.addActionListener(this);
        btn6.setActionCommand ("CaT");		btn6.addActionListener(this);
        btn7.setActionCommand ("FrJ");		btn7.addActionListener(this);
        btn8.setActionCommand ("FrB");		btn8.addActionListener(this);
        btn9.setActionCommand ("FrT");		btn9.addActionListener(this);
        btn10.setActionCommand ("Vendor");	btn10.addActionListener(this);

        //Labels initiated and centred
        label1 = new JLabel("Left: "+ option1,JLabel.CENTER);
        label2 = new JLabel("Left: "+ option2,JLabel.CENTER);
        label3 = new JLabel("Left: "+ option3,JLabel.CENTER);
        label4 = new JLabel("Left: "+ option4,JLabel.CENTER);
        label5 = new JLabel("Left: "+ option5,JLabel.CENTER);
        label6 = new JLabel("Left: "+ option6,JLabel.CENTER);
        label7 = new JLabel("Left: "+ option7,JLabel.CENTER);
        label8 = new JLabel("Left: "+ option8,JLabel.CENTER);
        label9 = new JLabel("Left: "+ option9,JLabel.CENTER);

        //Layout of GUI
        add(btn1); add(btn2); add(btn3); add(label1); add(label2); add(label3);
        add(btn4); add(btn5); add(btn6); add(label4); add(label5); add(label6);
        add(btn7); add(btn8); add(btn9); add(label7); add(label8); add(label9);
        add(btn10);
		//Packing the components
		pack();
    }
	//Action button listeners
    public void actionPerformed(ActionEvent e){
	//---For each product button excluding Vendor Information---
		//if button is pressed with the appropriate code
			//if option is bigger or equal to 1
				//total gets the item value added
				//decrements the option
				//if option is smaller or equal to 0
					//set the text to white, background red and make it opaque
			//otherwise show error message
		//update the label
		
        //ChJ
        if(e.getActionCommand().equals("ChJ")){
            if(option1 >= 1){
                total += 1.30;
                option1--;
                if(option1 <= 0){
                    label1.setForeground(Color.white);
                    label1.setBackground(Color.red);
                    label1.setOpaque(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(new JFrame(), "Item is out of stock!", "Chocolate Jigglypuffs", JOptionPane.WARNING_MESSAGE);

            }
            label1.setText("Left: "+option1);
        }
        //ChB
        if(e.getActionCommand().equals("ChB")){
            if(option2 >= 1){
                total += 1.00;
                option2--;
                if(option2 <= 0){
                    label2.setForeground(Color.white);
                    label2.setBackground(Color.red);
                    label2.setOpaque(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(new JFrame(), "Item is out of stock!", "Chocolate Bombs", JOptionPane.WARNING_MESSAGE);
            }
            label2.setText("Left: "+option2);
        }
        //ChT
        if(e.getActionCommand().equals("ChT")){
            if(option3 >= 1){
                total += 1.00;
                option3--;
                if(option3 <= 0){
                    label3.setForeground(Color.white);
                    label3.setBackground(Color.red);
                    label3.setOpaque(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(new JFrame(), "Item is out of stock!", "Chocolate Twists", JOptionPane.WARNING_MESSAGE);
            }
            label3.setText("Left: "+option3);
        }
        //CaJ
        if(e.getActionCommand().equals("CaJ")){
            if(option4 >= 1){
                total += 1.00;
                option4--;
                if(option4 <= 0){
                    label4.setForeground(Color.white);
                    label4.setBackground(Color.red);
                    label4.setOpaque(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(new JFrame(), "Item is out of stock!", "Caramel Jigglypuffs", JOptionPane.WARNING_MESSAGE);
            }
            label4.setText("Left: "+option4);
        }
        //CaB
        if(e.getActionCommand().equals("CaB")){
            if(option5 >= 1){
                total += 1.00;
                option5--;
                if(option5 <= 0){
                    label5.setForeground(Color.white);
                    label5.setBackground(Color.red);
                    label5.setOpaque(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(new JFrame(), "Item is out of stock!", "Caramle Bombs", JOptionPane.WARNING_MESSAGE);
            }
            label5.setText("Left: "+option5);
        }
        //CaT
        if(e.getActionCommand().equals("CaT")){
            if(option6 >= 1){
                total += 1.00;
                option6--;
                if(option6 <= 0){
                    label6.setForeground(Color.white);
                    label6.setBackground(Color.red);
                    label6.setOpaque(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(new JFrame(), "Item is out of stock!", "Caramel Twists", JOptionPane.WARNING_MESSAGE);
            }
            label6.setText("Left: "+option6);
        }
        //FrJ
        if(e.getActionCommand().equals("FrJ")){
            if(option7 >= 1){
                total += 1.00;
                option7--;
                if(option7 <= 0){
                    label7.setForeground(Color.white);
                    label7.setBackground(Color.red);
                    label7.setOpaque(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(new JFrame(), "Item is out of stock!", "French Vanilla Jigglypuffs", JOptionPane.WARNING_MESSAGE);
            }
            label7.setText("Left: "+option7);
        }
        //FrB
        if(e.getActionCommand().equals("FrB")){
            if(option8 >= 1){
                total += 1.00;
                option8--;
                if(option8 <= 0){
                    label8.setForeground(Color.white);
                    label8.setBackground(Color.red);
                    label8.setOpaque(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(new JFrame(), "Item is out of stock!", "French Vanilla Bombs", JOptionPane.WARNING_MESSAGE);
            }
            label8.setText("Left: "+option8);
        }
        //FrT
        if(e.getActionCommand().equals("FrT")){
            if(option9 >= 1){
                total += 1.00;
                option9--;
                if(option9 <= 0){
                    label9.setForeground(Color.white);
                    label9.setBackground(Color.red);
                    label9.setOpaque(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(new JFrame(), "Item is out of stock!", "French Vanilla Twists", JOptionPane.WARNING_MESSAGE);
            }
            label9.setText("Left: "+option9);
        }
        //Vendor
        if(e.getActionCommand().equals("Vendor")){
            //Defining the new frame similar to the first one
			JFrame vendingInformation = new JFrame("Vending Machine Information");	//Title
            vendingInformation.setBounds(0, 0, 200, 100);							//JFrame size
            vendingInformation.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	//Closes only this window
            vendingInformation.setVisible(true);									//set visible
            vendingInformation.setLocationRelativeTo(null);							//set to middle of screen
            vendingInformation.setVisible(true);									//set visible
            vendingInformation.setResizable(false);									//dissalow resizing

            //Label can be set anywhere since its defined in the class
            totalPriceLabel.setBounds(5, 5, 170, 20);								//setting bounds for label instead of grid - less code
            vendingInformation.add(totalPriceLabel);								//adding the button
            totalPriceLabel.setText("Total price is "+POUND+ + total);				//Setting the label's text
			
            JButton button = new JButton("Reset Stock");							//creating new reset stock button
            button.setBounds(5, 35, 170, 20);										//setting bounds for label instead of grid - less code
            vendingInformation.add(button);											//adding the button
			
			//Using lambda I was able to shorten the code down and reset the values as well as the colours of the options and total
				//Setting option back to 4 or 0 for total setting the label
				//setting the foreground and background to null
			button.addActionListener(e1 -> {
                option1 = 4; 	label1.setText("Left: "+option1);
                label1.setForeground(null); label1.setBackground(null);
                option2 = 4; 	label2.setText("Left: "+option2);
                label2.setForeground(null); label2.setBackground(null);
                option3 = 4; 	label3.setText("Left: "+option3);
                label3.setForeground(null); label3.setBackground(null);
                option4 = 4;	label4.setText("Left: "+option4);
                label4.setForeground(null); label4.setBackground(null);
                option5 = 4; 	label5.setText("Left: "+option5);
                label5.setForeground(null); label5.setBackground(null);
                option6 = 4; 	label6.setText("Left: "+option6);
                label6.setForeground(null); label6.setBackground(null);
                option7 = 4; 	label7.setText("Left: "+option7);
                label7.setForeground(null); label7.setBackground(null);
                option8 = 4; 	label8.setText("Left: "+option8);
                label8.setForeground(null); label8.setBackground(null);
                option9 = 4;	label9.setText("Left: "+option9);
                label9.setForeground(null); label9.setBackground(null);
                total = 0;		totalPriceLabel.setText("Total price is "+POUND + total);
            });

            //Bug Fix -- Where the button is overlaid of the label and the button takes up the whole frame and the label is centred on it
            JLabel bugfix = new JLabel("");
            bugfix.setBounds(0, 0, 180, 20);
            vendingInformation.add(bugfix);
        }
    }
	//start if main
    public static void main(String[] args){
        new Vending();
    }
}
