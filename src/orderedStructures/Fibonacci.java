package orderedStructures;

public class Fibonacci extends Progression {

	private double prev; 
	
	public Fibonacci() { 
		this(1); 
		prev = 0; 
		firstValueCalled = false;

	}
	private Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() throws IllegalStateException {
		if(!firstValueCalled){
			throw new IllegalStateException("nextValue: InvalidStateException. Call the 'firstValue()' method first.");
		}
		current = current + this.prev;
		prev = current - prev;
		return current;
	}
	
	@Override	
	public double firstValue() { 
		double value = super.firstValue(); 
		prev = 0; 
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
