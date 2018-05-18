//======================================================================
//
// Title:      <Readability Ravens>
// Course:     CSC 3020
// Homework:   <1>
// Author:     <Michael Heredia>
// Date:       <2-6-2018>
// Description:
//   <This program gets 3 integers for snow fall for three different months through the arguments string.
//	  It loops though the argument array and prints out the amount of snow for each month. As well
//    the total amount of snow and the average amount snow.>
//
//======================================================================
//package wsu.JavaTemplates;

// Import classes
import java.util.Scanner;
import java.util.StringTokenizer;
import java.text.DecimalFormat;
import java.text.NumberFormat;

//======================================================================
// class JavaTemplateMainClass
//======================================================================
public class Spherical
{
   public static void main(String args[])
   {
	   //A scanner to get input from the user
       Scanner para = new Scanner(System.in);
       //Printing out to the user
       System.out.println("Enter the paragraph : ");
       //Reads in input from the user
       String strpara = para.nextLine();
       //Declaring the variables
       int word = 0;
       int chars = 0;
       int spaces = 0;
       int nonSpace = 0;
       int sents = 0;
       int wordsLet = 0;
    
       //number formatter to format output to 2 decimal places
       NumberFormat formatter = new DecimalFormat("#0.00");
       
       //Code to count characters
       chars += strpara.length();                 
       //Code to count Words
       word += new StringTokenizer(strpara, " ,.-?").countTokens();
       for(char cr : strpara.toCharArray())
       {
           if(cr==' ')
               //Code to count spaces
        	   spaces++;                 
           if((cr>='A' && cr<='Z')||(cr>='a' && cr<='z'))
               //Code to count word letters
        	   wordsLet++;              
       }
       //Code to count non spaces
       nonSpace = strpara.length() - spaces;    
      
       //Code to count sentences
       sents = strpara.split("[.]").length;
      
       //Code to calculate L
       double L = ((double)wordsLet / (double)word)*100;
       //Code to calculate S
       double S = ((double)sents / (double)word) * 100;
       //Code to calculate CLI
       double CLI = 0.0588 * L - 0.296 * S - 15.8;

       //Code to display the result
       System.out.println("Characters      : "+chars);
       System.out.println("Whitespaces     : "+spaces);
       System.out.println("Non-Whitespaces : "+nonSpace);
       System.out.println("Sentences       : "+sents);
       System.out.println("Words           : "+word);
       System.out.println("Word Letters    : "+wordsLet);
       System.out.println("L               : "+formatter.format(L));
       System.out.println("S               : "+formatter.format(S));
       System.out.println("CLI             : "+formatter.format(CLI));
   }
}