package io.socket.parser;

import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class a {
    private static final Logger a = Logger.getLogger(a.class.getName());

    /* compiled from: ProGuard */
    /* renamed from: io.socket.parser.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C1531a {
        public b a;
        public byte[][] b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public static C1531a a(b bVar) {
        ArrayList arrayList = new ArrayList();
        bVar.d = a(bVar.d, arrayList);
        bVar.e = arrayList.size();
        C1531a c1531a = new C1531a();
        c1531a.a = bVar;
        c1531a.b = (byte[][]) arrayList.toArray(new byte[arrayList.size()]);
        return c1531a;
    }

    private static Object a(Object obj, List<byte[]> list) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_placeholder", true);
                jSONObject.put(RaptorConstants.JS_BATCH_NUM, list.size());
                list.add((byte[]) obj);
                return jSONObject;
            } catch (JSONException e) {
                a.log(Level.WARNING, "An error occured while putting data to JSONObject", (Throwable) e);
                return null;
            }
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = (JSONArray) obj;
            int length = jSONArray2.length();
            for (int i = 0; i < length; i++) {
                try {
                    jSONArray.put(i, a(jSONArray2.get(i), list));
                } catch (JSONException e2) {
                    a.log(Level.WARNING, "An error occured while putting packet data to JSONObject", (Throwable) e2);
                    return null;
                }
            }
            return jSONArray;
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = (JSONObject) obj;
            Iterator<String> keys = jSONObject3.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    jSONObject2.put(next, a(jSONObject3.get(next), list));
                } catch (JSONException e3) {
                    a.log(Level.WARNING, "An error occured while putting data to JSONObject", (Throwable) e3);
                    return null;
                }
            }
            return jSONObject2;
        } else {
            return obj;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    public static b a(b bVar, byte[][] bArr) {
        bVar.d = a(bVar.d, bArr);
        bVar.e = -1;
        return bVar;
    }

    private static Object a(Object obj, byte[][] bArr) {
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    jSONArray.put(i, a(jSONArray.get(i), bArr));
                } catch (JSONException e) {
                    a.log(Level.WARNING, "An error occured while putting packet data to JSONObject", (Throwable) e);
                    return null;
                }
            }
            return jSONArray;
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.optBoolean("_placeholder")) {
                int optInt = jSONObject.optInt(RaptorConstants.JS_BATCH_NUM, -1);
                if (optInt < 0 || optInt >= bArr.length) {
                    return null;
                }
                return bArr[optInt];
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    jSONObject.put(next, a(jSONObject.get(next), bArr));
                } catch (JSONException e2) {
                    a.log(Level.WARNING, "An error occured while putting data to JSONObject", (Throwable) e2);
                    return null;
                }
            }
            return jSONObject;
        } else {
            return obj;
        }
    }
}
