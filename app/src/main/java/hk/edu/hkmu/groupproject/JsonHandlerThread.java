//package hk.edu.hkmu.groupproject;
//
//import android.util.Log;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import java.io.BufferedInputStream;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.ProtocolException;
//import java.net.URL;
//
//
//    public class JsonHandlerThread extends Thread {
//        private static final String TAG = "JsonHandlerThread";
//        // URL to get contacts JSON file
//        private static String jsonUrl = "https://www.lcsd.gov.hk/datagovhk/facility/facility-fw.json";
//
//        public static String makeRequest() {
//            String response = null;
//            try {
//                URL url = new URL(jsonUrl);
//                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//                conn.setRequestMethod("GET");
//
//                // Read the response
//                InputStream in = new BufferedInputStream(conn.getInputStream());
//                response = inputStreamToString(in);
//            } catch (MalformedURLException e) {
//                Log.e(TAG, "MalformedURLException: " + e.getMessage());
//            } catch (ProtocolException e) {
//                Log.e(TAG, "ProtocolException: " + e.getMessage());
//            } catch (IOException e) {
//                Log.e(TAG, "IOException: " + e.getMessage());
//            } catch (Exception e) {
//                Log.e(TAG, "Exception: " + e.getMessage());
//            }
//            return response;
//        }
//
//        private static String inputStreamToString(InputStream is) {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
//            StringBuilder sb = new StringBuilder();
//
//            String line = "";
//            try {
//                while ((line = reader.readLine()) != null) {
//                    sb.append(line).append('\n');
//                }
//            } catch (IOException e) {
//                Log.e(TAG, "IOException: " + e.getMessage());
//            } finally {
//                try {
//                    is.close();
//                } catch (IOException e) {
//                    Log.e(TAG, "IOException: " + e.getMessage());
//                }
//            }
//            return sb.toString();
//        }
//
//        public void run() {
//            String contactStr = makeRequest();
//            Log.e(TAG, "Response from url: " + contactStr);
//
//            if (contactStr != null) {
//                try {
//                    JSONObject jsonObj = new JSONObject(contactStr);
//
//                    // Getting JSON Array node
//                    JSONArray contacts = jsonObj.getJSONArray("contacts");
//
//                    // looping through All Contacts
//                    for (int i = 0; i < contacts.length(); i++) {
//                        JSONObject c = contacts.getJSONObject(i);
//
//                        String Title_en = c.getString("Title_en");
//                        String Title_tc = c.getString("Title_tc");
//                        String Title_sn = c.getString("Title_sn");
//                        String District_en = c.getString("District_en");
//                        String District_tc = c.getString("District_tc");
//                        String District_sn = c.getString("District_sn");
//                        String Route_en = c.getString("Route_en");
//                        String Route_tn = c.getString("Route_tn");
//                        String Route_sn = c.getString("Route_sn");
//                        String HowToAccess_en = c.getString("HowToAccess_en");
//                        String HowToAccess_tn = c.getString("HowToAccess_tn");
//                        String HowToAccess_sn = c.getString("HowToAccess_sn");
//                        String MapURL_en = c.getString("MapURL_en");
//                        String MapURL_tn = c.getString("MapURL_tn");
//                        String MapURL_sn = c.getString("MapURL_sn");
//                        String Latitude = c.getString("Latitude");
//                        String Longitude = c.getString("Longitude");
//
//                        // Add contact (name, email, address) to contact list
//                        ResultInfo.addContact(Title_en, District_en, Route_en, HowToAccess_en, MapURL_en,
//                                Latitude, Longitude);
//                    }
//                } catch (final JSONException e) {
//                    Log.e(TAG, "Json parsing error: " + e.getMessage());
//                }
//            } else {
//                Log.e(TAG, "Couldn't get json from server.");
//            }
//        }
//    }
