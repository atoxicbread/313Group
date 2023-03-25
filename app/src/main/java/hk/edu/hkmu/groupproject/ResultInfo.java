package hk.edu.hkmu.groupproject;

import java.util.ArrayList;
import java.util.HashMap;

public class ResultInfo {
    public static String Title_en = "Title_en";
    public static String District_en = "District_en";
    public static String Route_en = "Route_en";
    public static String HowToAccess_en = "HowToAccess_en";
    public static String MapURL_en = "MapURL_en";
    public static String Latitude = "Latitude";
    public static String Longitude = "Longitude";


    public static ArrayList<HashMap<String, String>> resultList = new ArrayList<>();

    // Creates and add contact to contact list
    public static void addContact(String title, String district, String route, String howToAccess, String mapURL,
                                  String latitude, String longitude) {
        // Create contact
        HashMap<String, String> contact = new HashMap<>();
        contact.put(Title_en, title);
        contact.put(District_en, district);
        contact.put(Route_en, route);
        contact.put(HowToAccess_en, howToAccess);
        contact.put(MapURL_en, mapURL);
        contact.put(Latitude, latitude);
        contact.put(Longitude, longitude);

        // Add contact to contact list
        resultList.add(contact);
    }

}
