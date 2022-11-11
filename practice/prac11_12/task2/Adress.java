package practice.prac11_12.task2;

public class Adress {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String housing;
    private String flat;

    public Adress(String country, String region, String city, String street, String house, String housing, String flat){
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.housing = housing;
        this.flat = flat;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", housing='" + housing + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}
