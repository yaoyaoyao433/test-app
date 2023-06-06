package io.socket.hasbinary;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class a {
    private static final Logger a = Logger.getLogger(a.class.getName());

    private a() {
    }

    public static boolean a(Object obj) {
        return b(obj);
    }

    private static boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof byte[]) {
            return true;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    if (b(jSONArray.isNull(i) ? null : jSONArray.get(i))) {
                        return true;
                    }
                } catch (JSONException e) {
                    a.log(Level.WARNING, "An error occured while retrieving data from JSONArray", (Throwable) e);
                    return false;
                }
            }
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    if (b(jSONObject.get(keys.next()))) {
                        return true;
                    }
                } catch (JSONException e2) {
                    a.log(Level.WARNING, "An error occured while retrieving data from JSONObject", (Throwable) e2);
                    return false;
                }
            }
        }
        return false;
    }
}
