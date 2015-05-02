package iteratorPattern;

import java.util.Map;
import java.util.Set;

public class IteratorImplem implements Iterator {
	private Map<String,Person> personMap;
    int index;
    private Set<String> keys;
    private java.util.Iterator<String> itKeys;
    public IteratorImplem(Map<String,Person> personMap) {
            this.personMap = personMap;
            keys = personMap.keySet();
            itKeys = keys.iterator();
    }
    
    
    @Override
    public boolean hasNext() {
        return index<personMap.size();
    }

    @Override
    public Person next() {
        Person user = null;
        if(index<personMap.size()){
            user = personMap.get(itKeys.next());
            index++;
        }else{
            throw new IndexOutOfBoundsException();
        }
        return user;
    }
}
