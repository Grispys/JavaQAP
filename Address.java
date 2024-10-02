public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String zip, String street, String city, String state){
        this.zip = zip;
        this.street = street;
        this.city = city;
        this.state = state;
    }
    
    public String toString(){
        return (zip + ", " +street +", " +city +", "+state);
    }
}
