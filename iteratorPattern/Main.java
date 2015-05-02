package iteratorPattern;



public class Main {
	public static void main(String[] args) {
		AggregateImpl agg = new AggregateImpl();
        Person Saleeman = new Person();
        Saleeman.setFirstName(new FirstName("Saleeman"));
        Saleeman.setLastName(new LastName("Saleeman"));
        Person Putin = new Person();
        Putin.setFirstName(new FirstName("Vladmir"));
        Putin.setLastName(new LastName("Putin"));
       
        agg.add(Saleeman);
        agg.add(Putin);
       
        
        Iterator<Person> it = agg.getIterator();
        while(it.hasNext()){
            System.out.println(it.next().getFirstName().getFirstName());
        }
    
    }
}
	