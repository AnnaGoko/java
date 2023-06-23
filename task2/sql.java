import java.util.Scanner;
import org.json.simple.JSONObject;

public class sql {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("WHERE");
        JSONObject obj = new JSONObject(json);
        if (obj.has("grade")) {
            sb.append("grade = '" + obj.getString("grade") + "' AND ");
        }
        if (obj.has("exam")) {
            sb.append("exam = '" + obj.getString("exam") + "' AND ");
        }
        if (obj.has("subject")) {
            sb.append("subject = '" + obj.getString("subject") + "' AND ");
        }
        String filter = sb.toString();
        filter = filter.substring(0, filter.length()-4);
    }
}