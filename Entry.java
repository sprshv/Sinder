import java.util.List;
import java.util.ArrayList;

public class Entry {
    private String familyName;
    private String city;
    private List<FamilyMember> familyMembers;

    public Entry(String familyName, String city) {
        this.familyName = familyName;
        this.city = city;
        this.familyMembers = new ArrayList<>();
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

    public List<FamilyMember> getFamilyMembers() {
        return familyMembers;
    }

    public void addFamilyMember(FamilyMember familyMember) {
        familyMembers.add(familyMember);
    }

    public void removeFamilyMember(FamilyMember familyMember) {
        familyMembers.remove(familyMember);
    }
}

class FamilyMember {
    private String name;
    private int age;

    public FamilyMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}