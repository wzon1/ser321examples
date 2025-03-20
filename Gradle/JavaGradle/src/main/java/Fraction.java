import java.io.*;
/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 *
 * Ser321 Foundations of Distributed Applications
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version January 2020
 */
public class Fraction {

   private int numerator, denominator;

   public Fraction(){
      numerator = denominator = 0;
   }

   public void print() {
    System.out.print(numerator + "/" + denominator );
   }

   public void setNumerator (int n ){
      numerator = n;
   }

   public void setDenominator (int d) {
      denominator = d;
   }

   public int getDenominator() {
      return denominator;
   }

   public int getNumerator() {
      return numerator;
   }

   public static void main(String args[]) {
    int num = 1, denom = 2; // Default values
    if (args.length == 2) {
        try {
            num = Integer.parseInt(args[0]);
            denom = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid arguments! Please enter two integers.");
            System.exit(1);
        }
    } else if (args.length == 1) {
        try {
            num = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid argument! Please enter an integer.");
            System.exit(1);
        }
    }
    
    Fraction frac = new Fraction();
    frac.setNumerator(num);
    frac.setDenominator(denom);
    
    System.out.print("The fraction is: ");
    frac.print();
    System.out.println("");
 }
}


