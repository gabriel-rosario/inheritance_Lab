package interfaces;

import orderedStructures.Progression;

public interface Combineable extends OrderedNumberStructure{
	//method to add two progressions together
	public abstract Progression add(Progression p2);
	public abstract Progression subtract(Progression p2);
	
}
