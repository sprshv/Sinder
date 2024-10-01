package asset.src.main.java.com.code;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Family> entries = new ArrayList<Family>();

    public static void main(String[] args) {
        // Example usage
    addFamilyEntry() 

    public static void addFamilyEntry(String familyName, String city, String bio) {
        Family family = new Family(familyName, city, bio);
        entries.add(family);
    }
}