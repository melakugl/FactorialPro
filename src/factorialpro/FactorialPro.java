/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialpro;
import java.util.Scanner;

/**
 *
 * @author Melaku
 */
public class FactorialPro {

    /**
     * @param args the command line arguments
     */
    public static int factorial(int num)
    {
        if (num==0)
            return 1;
        else if (num==1)
            return 1;
        else 
            return num*factorial(--num);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);
        System.out.println("please enter an integer to calculate its factorial");
        //int num=input.nextInt();
        System.out.println(5 +"!="+ factorial(5));
    }
    
}
