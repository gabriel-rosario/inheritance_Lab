package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
		firstValueCalled = false;

	}
	
	@Override
	public double nextValue() throws IllegalStateException {
		if(!firstValueCalled){
			throw new IllegalStateException("nextValue: InvalidStateException. Call the 'firstValue()' method first.");
		}
		current = current * commonFactor; 
		return current;
	}
	
	@Override
	public String toString(){
		return "Geom("+this.firstValue()+", "+this.commonFactor+")";
	}
	
	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

			double value = this.firstValue() * Math.pow(this.commonFactor,n-1); 
			return value; 
		
	} 

	@Override
	public boolean Equals(Progression p2) {
		if(this.firstValue() == p2.firstValue() && this.nextValue() == p2.nextValue()) {
			return true;
		}
		return false;
	}

}
