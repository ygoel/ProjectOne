import java.awt.Color;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 * This class creates a panel displaying a name and a counter which increments per second.
 * @author Yathartha Goel
 * @version 1.0
 *
 */
public class P033_Goel_Panel {
	Color lightBlue=new Color(0,0,182,155);
	private JFrame frame;
	private JPanel panel;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	int counter=0;
	Timer timer=new Timer();
	
	/**
	 * This constructor sets the text for all the labels and initializes the panel.
	 */
	public P033_Goel_Panel(){
		label3= new JLabel();
		
		/*
		 * This is a time class which displays a number that increments every second 
		 * using threads.
		 */
		try{
		TimerTask task=new TimerTask(){
			public void run(){
				if(counter==9){
					counter=-1;
				}
				++counter;
				label3.setText(Integer.toString(counter));
				label3.setAlignmentX(JLabel.CENTER_ALIGNMENT);
			}
		};
		timer.scheduleAtFixedRate(task, 1000, 1000);
		
		}catch(Exception e){
			System.out.println("There was an exception thrown at the timer class : "+e);
		}		
		
		Box box=Box.createVerticalBox();
		frame=new JFrame();
		frame.setVisible(true);
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new JPanel();
		panel.setBackground(lightBlue);
		
		label1=new JLabel("Yathartha");
		label1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		label2=new JLabel("Goel");
		label2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		
		box.add(label1);
		box.add(label2);
		box.add(label3);
		
		panel.add(box);
		frame.add(panel);
	}
	
	/**
	 * This constructor sets the text for all the labels and initializes the panel.
	 * It also sets the background color of the panel in accordance to the parameter value.
	 * @param value if value is even then background is White otherwise it is Light Blue.
	 */
	public P033_Goel_Panel(int value){
		label3= new JLabel();
		
		/*
		 * This is a time class which displays a number that increments every second 
		 * using threads.
		 */
		try{
			TimerTask task=new TimerTask(){
				public void run(){
					if(counter==9){
						counter=-1;
					}
					++counter;
					label3.setText(Integer.toString(counter));
					label3.setAlignmentX(JLabel.CENTER_ALIGNMENT);
				}
			};
			timer.scheduleAtFixedRate(task, 1000, 1000);
			
			}catch(Exception e){
				System.out.println("There was an exception thrown at the timer class : "+e);
			}
		
		Box box=Box.createVerticalBox();
		frame=new JFrame();
		frame.setVisible(true);
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new JPanel();
		
		/*
		 * Sets the background of the panel depending on whether the value passed is
		 * even or odd. If even, the background is set to White color.
		 */
		try{
		if(value%2==0){
			panel.setBackground(Color.WHITE);
		}
		else{
			panel.setBackground(lightBlue);
		}
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		
		label1=new JLabel("Yathartha");
		label1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		label2=new JLabel("Goel");
		label2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		
		box.add(label1);
		box.add(label2);
		box.add(label3);
		
		panel.add(box);
		frame.add(panel);
	}
	
	/**
	 * This function initializes the class and its constructor.
	 * @param args
	 */
	public static void main(String args[]){
		new P033_Goel_Panel(2);
	}

}
