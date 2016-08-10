import javax.swing.JOptionPane;

public class CodingExercise2 {
public static void main(String[] args) {
String Age=JOptionPane.showInputDialog("How old are you?");	
int age=Integer.parseInt(Age);
int Current=2016;

int Year=Current-age;
if (age<0) {
	JOptionPane.showMessageDialog(null, "How is the future?");
}
JOptionPane.showMessageDialog(null, "You were born in "+Year);
if (age>30) {
	JOptionPane.showMessageDialog(null, "You are"
			+ " too old to be playing this!");
}

}
}
