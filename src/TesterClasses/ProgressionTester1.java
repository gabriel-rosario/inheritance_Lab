package TesterClasses;

import orderedStructures.Arithmetic;
import orderedStructures.Fibonacci;
import orderedStructures.Geometric;
import orderedStructures.Progression;

public class ProgressionTester1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Progression p; 
		Progression p2;
		
		
		//FIBONACCI
		
		System.out.println("Testing Fibonaci:"); 
		p = new Fibonacci();
		//TESTING ILLEGAL STATE EXCEPTION
		//p.firstValue();
		//p.nextValue();
		p.printAllTerms(20);

		System.out.println("Testing Fibonaci:"); 
		p2 = new Fibonacci();
		p2.printAllTerms(5);
		System.out.println("Fibonacci Progressions Are Equal: "+p2.Equals(p));
		
		
		
		//GEOMETRIC
		
		System.out.println("\n\n\nTesting Geometric:"); 
		p = new Geometric(2, 3);		
		
		//TESTING ILLEGAL STATE EXCEPTION
		//p.firstValue();
		//p.nextValue();
		p.printAllTerms(20);
		
		System.out.println("\n\n\nTesting Geometric:"); 
		p2 = new Geometric(2,3);
		p2.printAllTerms(6);
		System.out.println("Geometric Progressions Are Equal: "+p2.Equals(p));

		
		//ARITHMETIC
		
		System.out.println("\n\n\nTesting Arithmetic:"); 
		p = new Arithmetic(2, 3);
		//TESTING ILLEGAL STATE EXCEPTION
		//p.firstValue();
		//p.nextValue();		
		p.printAllTerms(20);
		
		p2 = new Arithmetic(2,5);
		p2.printAllTerms(20);
		
		System.out.println("Arithmetic Progressions Are Equal: "+p2.Equals(p));
		
		System.out.println("the Sum of p and p2: ");
		((Arithmetic) p2).add(p).printAllTerms(5);
		
		System.out.println("The subtraction of p and p2 are");
		((Arithmetic) p).subtract(p2).printAllTerms(5);

		
		
	}

}
