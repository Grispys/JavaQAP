public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    // assigns each variable to given argument
    public Person(String lastName, String firstname, Address home){
        this.lastName = lastName;
        this.firstName = firstname;
        this.home = home;
    }

    public String toString(){
        return ("This person is: " + firstName + " " +lastName + ". Residence: " + home);
    }
}
