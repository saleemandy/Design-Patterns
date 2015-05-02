package iteratorPattern;

public class FirstName {
	private Person person;
    private String firstName;

    public FirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
