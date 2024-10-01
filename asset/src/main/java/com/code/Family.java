package asset.src.main.java.com.code;

public class Family {
    private String familyName;
    private String city;
    private String bio;

    public Family(String familyName, String city, String bio) {
        this.familyName = familyName;
        this.city = city;
        this.bio = bio;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}