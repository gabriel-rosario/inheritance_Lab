package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
		firstValueCalled = false;
	}
	
	
	@Override
	public double nextValue() throws IllegalStateException {
		if(!firstValueCalled){
			throw new IllegalStateException("nextValue: InvalidStateException. Call the 'firstValue()' method first.");
		}
		current = current + commonDifference; 
		return current;
	}
	
	@Override
	public String toString(){
		return "Arith("+this.firstValue()+", "+this.commonDifference+")";
	}
	
	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

		double value = this.firstValue() + this.commonDifference*(n-1); 
		return value; 
	}

}
