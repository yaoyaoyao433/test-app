package com.meizu.cloud.pushsdk.a.a;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class c {
    private final int a;
    private final String b;

    public c(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", this.a);
            jSONObject.put("body", this.b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return "[NetResponse] " + jSONObject.toString();
    }
}
