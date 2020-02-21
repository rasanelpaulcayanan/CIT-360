/*
 * File Prologue
 * Name: Rasanel Paul Cayanan 
 * Assignment : Familiarity Review
 * Instructor: Brad Lawrence
 * Class : CIT 360-03
 * Date : 02/14/2020
 * Description: 
 * --------------------------------------------------------------------------
 * This program simulates a money converter application. The View sets the
 * Jpanel and it's components. (Icons, buttons etc)
 * ---------------------------------------------------------------------------
 */
package mvc.familiarity.review;

import java.awt.event.ActionListener;
import javax.swing.*;



public class MoneyChangerView extends JFrame {
	
	private JLabel pesoLabel = new JLabel("Php");
	private JTextField pesoValue = new JTextField(10);
	private JLabel denominationLabel = new JLabel("1 = $ , 2 = ¥");
	private JTextField denomination = new JTextField(10);
    private JButton convertButton = new JButton("Convert");
    private JTextField convertedValue = new JTextField(10);
    
    
          MoneyChangerView(){
        	  
        	   JPanel moneyChangerPanel = new JPanel();
        	   
        	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	   this.setSize(600,200);
        	   
        	   moneyChangerPanel.add(pesoLabel);
        	   moneyChangerPanel.add(pesoValue);
        	   moneyChangerPanel.add(denominationLabel);
        	   moneyChangerPanel.add(denomination);
        	   moneyChangerPanel.add(convertButton);
        	   moneyChangerPanel.add(convertedValue);
        	
        	   this.add(moneyChangerPanel);
          }

          public int getpesoValue() {
        	  
        	  return Integer.parseInt(pesoValue.getText());
        	  
          }
          
          public int getdenomination() {
        	  
        	  return Integer.parseInt(denomination.getText());
        	  
          }
          
           public int convertedValue() {
        	  
        	  return Integer.parseInt(convertedValue.getText());
        	  
          }
           
          public void setConvertion(int solution) {
        	  
        	  convertedValue.setText(Integer.toString(solution));
        	  
          }  
          
          void addConversionListener(ActionListener listenForConversionButton) {
        	  
        	  
        	  convertButton.addActionListener(listenForConversionButton);  
          }
          
          void displayErrorMessage(String errorMessage) {
        	  
        	  JOptionPane.showMessageDialog(this,errorMessage);
        	  
          }

}





















