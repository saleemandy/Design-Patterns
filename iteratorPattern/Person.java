package iteratorPattern;

public class Person {
	private int id;
    private FirstName firstName;
    private LastName lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FirstName getFirstName() {
        return firstName;
    }

    public void setFirstName(FirstName firstName) {
        firstName.setPerson(this);
        this.firstName = firstName;
    }

    public LastName getLastName() {
        return lastName;
    }

    public void setLastName(LastName lastName) {
        lastName.setPerson(this);
        this.lastName = lastName;
    }
    
}
