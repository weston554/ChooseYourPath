package path.view;

import javax.swing.JOptionPane;

public class View
{
	public void displayMessage(String text)
	{
		JOptionPane.showMessageDialog(null,  text);
	}
	
	
	public String askQuestion(String text)
	{
		String answer = "";
		
		answer += JOptionPane.showInputDialog(null, text);
		return answer;
	}
}
