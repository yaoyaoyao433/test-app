package com.huawei.hms.framework.network.grs.c.b;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.tencent.mapsdk.internal.ch;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c {
    private GrsBaseInfo a;
    private Context b;
    private Set<String> c = new HashSet();

    public c(GrsBaseInfo grsBaseInfo, Context context) {
        this.a = grsBaseInfo;
        this.b = context;
    }

    private String e() {
        Set<String> b = com.huawei.hms.framework.network.grs.b.b.a(this.b.getPackageName(), this.a).b();
        if (b.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (String str : b) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put(ch.a_, jSONArray);
            Logger.i("GrsRequestInfo", "post service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    private String f() {
        Logger.v("GrsRequestInfo", "getGeoipService enter");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (String str : this.c) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put(ch.a_, jSONArray);
            Logger.v("GrsRequestInfo", "post query service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public Context a() {
        return this.b;
    }

    public void a(String str) {
        this.c.add(str);
    }

    public GrsBaseInfo b() {
        return this.a;
    }

    public String c() {
        return this.c.size() == 0 ? e() : f();
    }

    public Set<String> d() {
        return this.c;
    }
}
