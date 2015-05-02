package iteratorPattern;

public class LastName {
	private Person person	;
    private String lastName;

    public LastName(String lastName) {
        this.lastName = lastName;
    }
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
