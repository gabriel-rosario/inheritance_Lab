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

}
