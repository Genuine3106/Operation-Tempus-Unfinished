import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// !!! SORRY FOR MY MESSY CODE !!!
		
		// W.I.P
		// This project will start once Chez_Poofz is done learning Java.
		// NOT FINISHED

		// The main class.

		// CREDITS TO BRO CODE FOR HELPING ME LEARN JAVA(https://www.youtube.com/c/BroCodez)
		
		String[] options = {"Ummm.. Okay???","I don't care","fuck off lol"};
		
		
		
		int intro = JOptionPane.showOptionDialog(null, "Made by EpicGamer45#9027, idea by Chez_Poofz#7899", "Welcome to Operation T.E.M.P.U.S",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, 0);
		
		if(intro == 2) {
			// if you choose the "fuck off lol" choice
			
			JOptionPane.showMessageDialog(null, "wow man okay.", "fuck you bruh", JOptionPane.ERROR_MESSAGE);
		}
		
		
		
		// If you choose the "I don't care" choice
		else if(intro == 1) {
			JOptionPane.showMessageDialog(null, "chill tf out.", "why u so hostile?", JOptionPane.ERROR_MESSAGE);
			int angy = JOptionPane.showOptionDialog(null, "You still wanna play? You sound angry.", "*madddddddd*", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, null, 0);
			
			if(angy == 0) {
				Frame frame = new Frame();
			}
		}
		
		
		
		// If you choose the "uhh... okay" choice
		else if(intro == 0) {
			Frame frame = new Frame();
		}
		else {
			JOptionPane.showMessageDialog(null, "If you got this, screen shot it and send it to me.", "TF!!! HOWWW!!!",JOptionPane.PLAIN_MESSAGE);
		}
		
		
	}

}
