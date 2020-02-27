package _01_robot_color_chooser;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

class RobotColorChooser {
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
public static void main(String[] args) {
	


		//1. Create a new Robot
		Robot Oreo=new Robot();
		//3. Ask the user what color they would like the robot to draw
		String color=JOptionPane.showInputDialog("What color do you want,so the robot can draw");
		//5. Use an if/else statement to set the pen color that the user requested
if(color.equalsIgnoreCase("blue")) {
        //6. If the user doesn’t enter anything, choose a random color
Oreo.setPenColor(Color.blue);
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		for (int i=0;i<10;i++) 
		//4. Set the pen width to 10
		Oreo.setPenWidth(20);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		Oreo.setSpeed(10000);
		Oreo.move(200);
        Oreo.move(90);

}
}
}
