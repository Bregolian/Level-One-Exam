import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
   	 // 3. ask the user what color they would like the Robot to draw

   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)

   	 // 2. set the pen width to 10

   	 // 1. make the Robot draw a shape
   String color=JOptionPane.showInputDialog("What color would you like Johnny5 to draw in?");
    	Robot Johnny5= new Robot();
   	 Johnny5.penDown();
   	 Johnny5.setPenWidth(10);
   	 if (color.equalsIgnoreCase("red")) {
		Johnny5.setPenColor(Color.RED);
	}
   	 if (color.equalsIgnoreCase("green")) {
   		Johnny5.setPenColor(Color.GREEN);
	}
   
   	 for (int i = 0; i < 4; i++) {
		Johnny5.move(100);
		Johnny5.turn(90);
	}
    }

}

