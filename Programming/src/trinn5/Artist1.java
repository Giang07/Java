package trinn5;

import java.time.LocalDate;

public class Artist1 {
    private int id;
    private String artistName;
    private LocalDate dateOfBirth;
    private String city;
    private String country;


    public Artist1(int id, String artistName, LocalDate dateOfBirth, String city, String country) {
        this.id = id;
        this.artistName = artistName;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String printState() {
        String s =  "Artist{" +
                "artistName='" + artistName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
        System.out.println(s);
        return s;
    }
}

