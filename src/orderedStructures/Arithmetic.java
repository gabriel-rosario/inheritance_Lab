package orderedStructures;

import interfaces.Combineable;

public class Arithmetic extends Progression implements Combineable{
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
	


	@Override
	public boolean Equals(Progression p2) {
		if(this.firstValue() == p2.firstValue() && this.nextValue() == p2.nextValue()) {
			return true;
		}
		return false;
	}



	@Override
	public Progression add(Progression p2) {
		Progression ptr;
		double firstTerm = this.firstValue() + p2.firstValue();
		double difference = (this.nextValue() + p2.nextValue())-firstTerm;
		
		ptr = new Arithmetic (firstTerm,difference);
		return ptr;
		
	}
	
	@Override
	public Progression subtract(Progression p2) {
		Progression ptr;
		double firstTerm = this.firstValue() - p2.firstValue();
		double difference = (this.nextValue() - p2.nextValue()-firstTerm);
		
		ptr = new Arithmetic(firstTerm, difference);
		return ptr;
	}

}
