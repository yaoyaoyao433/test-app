package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.tencent.map.tools.json.JsonUtils;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class cj extends cd {
    static final String f = "name";
    static final String g = "host";
    static final String h = "host_test";
    static final String i = "https";
    static final String j = "status";

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(JSONObject jSONObject) {
        dg dgVar;
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("name", null);
        if (TextUtils.isEmpty(optString) || (dgVar = (dg) b(optString)) == null) {
            return;
        }
        int optInt = jSONObject.optInt("status", 1);
        String optString2 = jSONObject.optString("host", null);
        String optString3 = jSONObject.optString(h, null);
        boolean optBoolean = jSONObject.optBoolean(i, true);
        dgVar.c = optInt != 0;
        dgVar.b = optBoolean;
        if (!TextUtils.isEmpty(optString2)) {
            dgVar.d = optString2;
        }
        if (!TextUtils.isEmpty(optString3)) {
            dgVar.e = optString3;
        }
        dgVar.a = optInt == 2;
    }

    private void b(JSONObject jSONObject) {
        cl clVar = (cl) JsonUtils.parseToModel(jSONObject, cl.class, new Object[0]);
        cn cnVar = this.b;
        cnVar.a = clVar.a;
        cnVar.b = clVar.b;
    }
}
