 import javax.swing.*;
 class gui
 {
	 public static void main(string[]args)
	 {
		 JFrame frame=new JFrame("My First GUI");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 frame.setSize(300,300);
		 JButton button=new JButton("press");
		 frame.getContentPane().add(button);
		 frame.setVisible(true);
	 }
 }
 