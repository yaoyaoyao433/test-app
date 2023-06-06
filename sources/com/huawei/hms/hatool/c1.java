package com.huawei.hms.hatool;

import com.meituan.android.common.statistics.Constants;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c1 extends n {
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g;

    @Override // com.huawei.hms.hatool.s
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("androidid", this.a);
        jSONObject.put("oaid", this.g);
        jSONObject.put("uuid", this.f);
        jSONObject.put("upid", this.e);
        jSONObject.put("imei", this.b);
        jSONObject.put(Constants.Environment.KEY_SERIAL_NUMBER, this.c);
        jSONObject.put(Constants.Environment.KEY_UDID, this.d);
        return jSONObject;
    }

    public void b(String str) {
        this.b = str;
    }

    public void c(String str) {
        this.g = str;
    }

    public void d(String str) {
        this.c = str;
    }

    public void e(String str) {
        this.d = str;
    }

    public void f(String str) {
        this.e = str;
    }

    public void g(String str) {
        this.f = str;
    }
}
