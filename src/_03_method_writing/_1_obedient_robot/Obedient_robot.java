package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_robot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot rob = new Robot();
		//drawSquare(rob);
		//rob.setX(100);
		//rob.setY(400);
		//drawTriangle(rob);
		//rob.setX(300);
		//rob.setY(250);
		//drawCircle(rob);
		String shape =  JOptionPane.showInputDialog("What shape do you want? Circle, Square, or Triangle");
		String color =  JOptionPane.showInputDialog("What color do you want? Blue, Green, or Orange");
		if(shape .equalsIgnoreCase("circle")) {
			setColor(rob,color);
			drawCircle(rob);
			
		}
		else if(shape .equalsIgnoreCase("square")) {
			setColor(rob,color);
			drawSquare(rob);
			
		}
		else if(shape .equalsIgnoreCase("triangle")) {
			setColor(rob, color);
			drawTriangle(rob);
			
		}

	}
	private static void setColor(Robot rob, String color) {
		if(color .equalsIgnoreCase("blue")) {
			rob.setPenColor(0,187,255);}
		else if(color .equalsIgnoreCase("green")) {
			rob.setPenColor(82,240,10);
		}
		else if(color .equalsIgnoreCase("orange")) {
			rob.setPenColor(240,109,10);
		}
		
		
	}

	private static void drawCircle(Robot rob) {
		rob.penDown();
		rob.setSpeed(100);
		for(int k = 0; k<360;k++) {
			rob.move(3);
			rob.turn(1);
		}
	}

	private static void drawTriangle(Robot rob) {
		rob.penDown();
		rob.setSpeed(100);
		for(int j = 0; j < 3; j++) {
			rob.move(50);
			rob.turn(120);
		}
	}

	private static void drawSquare(Robot rob) {
		rob.penDown();
		rob.setSpeed(100);
		for(int i = 0; i<4; i++) {
			rob.move(50);
			rob.turn(90);
		}
	}

}
