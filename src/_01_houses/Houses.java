package _01_houses;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot luca = new Robot();
	public void run() {
		luca.moveTo(0,600 );
		for(int i = 0; i < 9; i ++) {
			house();
		}
	}
	public void squareroof() {
		luca.turn(90);
		luca.move(75);
		luca.turn(90);
	}
	public void pointyroof() {
		luca.turn(60);
		luca.move(75);
		luca.turn(60);
		luca.move(75);
		luca.turn(60);
	}
	public void house() {
		String height = JOptionPane.showInputDialog("what would you like the height to be?");
		if (height.contentEquals("small")) {
			height = "60";
		}
		if (height.contentEquals("medium")) {
			height = "120";
		}
		if (height.contentEquals("large")) {
			height = "250";
		}
		String color = JOptionPane.showInputDialog("What color would you like the house to be?");
		int heightint = Integer.parseInt(height);
		if( color.contentEquals("red")) {
			luca.setPenColor(Color.red);	
		}
		if( color.contentEquals("blue")) {
			luca.setPenColor(Color.blue);	
		}
		if( color.contentEquals("green")) {
			luca.setPenColor(Color.green);	
		}
		if( color.contentEquals("black")) {
			luca.setPenColor(Color.black);	
		}
		if( color.contentEquals("orange")) {
			luca.setPenColor(Color.orange);	
		}
		if( color.contentEquals("white")) {
			luca.setPenColor(Color.white);	
		}
		luca.setSpeed(100);
		luca.penDown();
		luca.setPenWidth(10);
		luca.move(heightint);
		if(heightint == 250) {
			squareroof();
		}
		if(heightint == 60 || heightint == 120) {
			pointyroof();
		}
		luca.move(heightint);
		luca.turn(-90);
		luca.setPenColor(Color.green);
		luca.move(100);
		luca.turn(-90);
	}
}
