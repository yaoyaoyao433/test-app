package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.tencent.map.tools.json.JsonParser;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.mapsdk.internal.ed;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ea implements JsonParser.Deserializer<ed.a.C1476a.AbstractC1477a> {
    private static ed.a.C1476a.AbstractC1477a a(Object obj) throws JSONException {
        if (obj != null && (obj instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            String string = jSONObject.getString("type");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            if ("Point".equalsIgnoreCase(string)) {
                return (ed.a.C1476a.AbstractC1477a) JsonUtils.parseToModel(jSONObject, ed.a.C1476a.c.class, new Object[0]);
            }
            if ("Points".equalsIgnoreCase(string)) {
                return (ed.a.C1476a.AbstractC1477a) JsonUtils.parseToModel(jSONObject, ed.a.C1476a.d.class, new Object[0]);
            }
            if ("Line".equalsIgnoreCase(string)) {
                return (ed.a.C1476a.AbstractC1477a) JsonUtils.parseToModel(jSONObject, ed.a.C1476a.b.class, new Object[0]);
            }
            return null;
        }
        return null;
    }

    @Override // com.tencent.map.tools.json.JsonParser.Deserializer
    public final /* synthetic */ ed.a.C1476a.AbstractC1477a deserialize(Object obj, String str, Object obj2) throws JSONException {
        if (obj2 != null && (obj2 instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj2;
            String string = jSONObject.getString("type");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            if ("Point".equalsIgnoreCase(string)) {
                return (ed.a.C1476a.AbstractC1477a) JsonUtils.parseToModel(jSONObject, ed.a.C1476a.c.class, new Object[0]);
            }
            if ("Points".equalsIgnoreCase(string)) {
                return (ed.a.C1476a.AbstractC1477a) JsonUtils.parseToModel(jSONObject, ed.a.C1476a.d.class, new Object[0]);
            }
            if ("Line".equalsIgnoreCase(string)) {
                return (ed.a.C1476a.AbstractC1477a) JsonUtils.parseToModel(jSONObject, ed.a.C1476a.b.class, new Object[0]);
            }
            return null;
        }
        return null;
    }
}
