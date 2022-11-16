/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.methodsrandomnumbers;

import javax.swing.JOptionPane;

/**
 *
 * @author Erik
 */
public class MethodsRandomNumbers {

    public static void main(String[] args) {
        int limit=Integer.parseInt(JOptionPane.showInputDialog("Enter limit"));
        int number1=Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
        int number2=Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));
        for(int i=0; i<=limit;i++ ){
            JOptionPane.showMessageDialog(null, RanNumber(number1,number2));
        } 
    }
    public static int RanNumber(int num1, int num2){
        int RandomNumber=(int)Math.floor(Math.random()*(num1-num2)+num2);
        return RandomNumber;
    }
}
