import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonFrame extends JFrame{
 JButton button1;
 JButton button2;
 JButton button3;
 JButton button4;
 JButton button5;
 JButton button6;
 JButton button7;
 JButton button8;
 JButton button9;
 JLabel label;
 
 boolean isTrue;
 
 ButtonFrame(){
  super("small keyboard");
  isTrue=true;
  
  label = new JLabel();
  button1 = new JButton("1");
  button2 = new JButton("2");
  button3 = new JButton("3");
  button4 = new JButton("4");
  button5 = new JButton("5");
  button6 = new JButton("6");
  button7 = new JButton("7");
  button8 = new JButton("8");
  button9 = new JButton("9");
  
  
  
  button1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent arg0) {
    if(isTrue){
     label.setText("String 1");
     isTrue=!isTrue;
   
    }
   }
  });
  button2.addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent arg0) {
	    if(isTrue){
	     label.setText("String 2");
	     isTrue=!isTrue;
	    
	    }
  
	   }
  });
  
  button3.addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent arg0) {
	    if(isTrue){
	     label.setText("String 3");
	     isTrue=!isTrue;
	    
	    }
 
	   }
 });
  
  button4.addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent arg0) {
	    if(isTrue){
	     label.setText("String 5");
	     isTrue=!isTrue;
	    } else
	    {isTrue=!isTrue;}
	   }
 });  
  
  button5.addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent arg0) {
	    if(isTrue){
	     label.setText("String 5");
	     isTrue=!isTrue;
	    
	    }
 
	   }
 });
  
  button6.addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent arg0) {
	    if(isTrue){
	     label.setText("String 6");
	     isTrue=!isTrue;
	    
	    }
 
	   }
 });
  
  button7.addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent arg0) {
	    if(isTrue){
	     label.setText("String 7");
	     isTrue=!isTrue;
	    
	    }
 
	   }
 });
  
  button8.addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent arg0) {
	    if(isTrue){
	     label.setText("String 8");
	     isTrue=!isTrue;
	    
	    }
 
	   }
 });
  
  button9.addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent arg0) {
	    if(isTrue){
	     label.setText("String 9");
	     isTrue=!isTrue;
	    
	    }
 
	   }
 });
  
  
  button1.setBounds(106,001,100,30);
  this.add(button1);
  button2.setBounds(211,001,100,30);
  this.add(button2);
  button3.setBounds(316,001,100,30);
  this.add(button3);
  button4.setBounds(106,106,100,30);
  this.add(button4);
  button5.setBounds(211,106,100,30);
  this.add(button5);
  button6.setBounds(316,106,100,30);
  this.add(button6);
  button7.setBounds(106,211,100,30);
  this.add(button7);
  button8.setBounds(211,211,100,30);
  this.add(button8);
  button9.setBounds(316,211,100,30);
  this.add(button9);
  
  this.add(label,BorderLayout.WEST);
  
  this.setSize(700, 400);
  this.setVisible(true);
  this.pack();
 }
 public static void main(String[]args){
  new ButtonFrame();
 }
}