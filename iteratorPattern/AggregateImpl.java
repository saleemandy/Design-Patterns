package iteratorPattern;

import java.util.HashMap;
import java.util.Map;

public class AggregateImpl implements Aggregate {
	 private Map<String,Person> personMap = new HashMap();
	    
	    public void add(Person person){
	    	personMap.put(person.getFirstName().getFirstName(), person);
	    	personMap.put(person.getLastName().getLastName(), person);
	    }
@Override
public Iterator getIterator() {
	return new IteratorImplem(personMap);
}
}
