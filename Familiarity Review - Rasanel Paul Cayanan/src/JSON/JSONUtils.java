/*
 * File Prologue
 * Name: Rasanel Paul Cayanan 
 * Assignment : Familiarity Review
 * Instructor: Brad Lawrence
 * Class : CIT 360-03
 * Date : 02/8/2020
 * Description: 
 * --------------------------------------------------------------------------
 * Supportive class for Main.java
 * ---------------------------------------------------------------------------
 */

package JSON;

import java.util.Scanner;
import java.io.InputStream;
import org.json.JSONObject;

public class JSONUtils {

    public static String getJSONStringFromFile(String path) {
        Scanner scanner;
        InputStream in = FileHandle.inputStreamFromFile(path);
        scanner = new Scanner( in );
        String json = scanner.useDelimiter("\\Z").next();
        scanner.close();
        return json;


    }

    public static JSONObject getJSONObjectFromFile(String path)

    {
        return new JSONObject(getJSONStringFromFile(path));


    }

    public static boolean objectExists(JSONObject jsonObject, String key) {

        Object o;

        try {

            o = jsonObject.get(key);
        } catch (Exception e) {

            return false;
        }
        return o != null;

    }


}