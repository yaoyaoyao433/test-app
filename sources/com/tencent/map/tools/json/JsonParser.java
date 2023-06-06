package com.tencent.map.tools.json;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface JsonParser {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface Deserializer<T> {
        T deserialize(Object obj, String str, Object obj2) throws JSONException;
    }

    void parse(JSONObject jSONObject);
}
