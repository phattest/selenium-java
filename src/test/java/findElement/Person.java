package findElement;

public class Person {
    private String  firstName;
    private String lastName;
    private String email;
    private String website;
    private Float due;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setDue(Float due) {
        this.due = due;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getWebsite() {
        return website;
    }

    public Float getDue() {
        return due;
    }

    public Person(String firstName, String lastName, String email, String website, Float due) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.website = website;
        this.due = due;
    }

}
