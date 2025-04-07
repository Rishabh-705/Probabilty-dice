import java.util.Scanner;
import java.util.Random;

public class dice{
    public static void main(String[] args) {
        
    		Scanner input = new Scanner(System.in);
    		
    		Random dice = new Random();
    		
    		// ask the player for number of rolls
    		System.out.println("Enter the number of rolls you want: ");
    		int rolls = input.nextInt();
    		
    		// an array for storing frequency of each face value
    		int[] freq = new int[7];     
     		
    		// frequency of each face value
    		for(int i=1; i<rolls; i++) {
    			++freq[1+dice.nextInt(6)]; 
    		}
    		System.out.printf("\n");
    		
    		// creation of table and storing the value
    		System.out.println("Face \t freq");
    		
    		for(int face=1; face<7; face++) {
    			System.out.println(face+"\t"+freq[face]);
    		}
    		// ask the user for which number they want to know the likeness for
    		System.out.println("Probability for face value: ");
    		int face = input.nextInt();
    		int obs = freq[face];
    		
    		double N = (double) rolls;
    		
    		double probs =  obs / N;
    		System.out.println("The probability of "+face+" is "+probs); 
    		
    		input.close();   
        
    } 
}