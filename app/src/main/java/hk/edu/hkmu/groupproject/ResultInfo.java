package hk.edu.hkmu.groupproject;

import java.util.ArrayList;
import java.util.HashMap;

public class ResultInfo {
    public static String title_en = "Title_en"; // used in "new String []..." in MainActivity program
    public static String district_en = "District_en"; // used in "new String []..." in MainActivity program
    public static String route_en = "Route_en"; // used in "new String []..." in MainActivity program
    public static String howToAccess_en = "HowToAccess_en"; // used in "new String []..." in MainActivity program
    public static String mapURL_en = "MapURL_en"; // used in "new String []..." in MainActivity program
    public static String latitude = "Latitude"; // used in "new String []..." in MainActivity program
    public static String longitude = "Longitude"; // used in "new String []..." in MainActivity program

    // "contactList" variable used for storing all contact that retrieved from JSON
    // it is used in JsonHandlerThread and also MainActivity program
    public static ArrayList<HashMap<String, String>> contactList = new ArrayList<>();

    // addContact is a function
    // Creates and add contact to contact list
    // x4 input, representing name, email, address and mobile
    public static void addContact(String Title_en, String District_en, String Route_en, String HowToAccess_en
            , String MapURL_en, String Latitude, String Longitude) {
        // Create contact
        HashMap<String, String> contact = new HashMap<>();
        contact.put(title_en, Title_en);
        contact.put(district_en, District_en);
        contact.put(route_en, Route_en);
        contact.put(howToAccess_en, HowToAccess_en);
        contact.put(mapURL_en, MapURL_en);
        contact.put(latitude, Latitude);
        contact.put(longitude, Longitude);

        // Add contact to contact list
        contactList.add(contact);
    }

}
