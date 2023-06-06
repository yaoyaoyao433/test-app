package org.apache.flink.cep.mlink.stateparser;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import org.apache.flink.cep.mlink.bean.BaseEvent;
import org.apache.flink.cep.mlink.ikexpression.expressionnode.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class b<T extends BaseEvent> {
    public final a<T> a(String str) {
        JSONObject optJSONObject;
        a<T> aVar = new a<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            aVar.d = jSONObject.optString("version");
            aVar.e = jSONObject.optString("identifier");
            aVar.b = b(jSONObject.optString("globalEventNames"));
            aVar.f = jSONObject.optInt("maxTimes", -1);
            aVar.c = jSONObject.optLong("within");
            aVar.a = new d().a(str);
            aVar.g = jSONObject.optString("outputFormat", "Overlap");
            if (jSONObject.has("returnValue") && (optJSONObject = jSONObject.optJSONObject("returnValue")) != null) {
                aVar.h = f.a(optJSONObject);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aVar;
    }

    private static Set b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.optString(i));
            }
            return hashSet;
        } catch (JSONException unused) {
            return hashSet;
        }
    }
}
