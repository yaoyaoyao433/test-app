package com.huawei.hms.hatool;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class u {
    public String a;
    public String b;
    public String c;
    public List<q> d;
    public String e;

    public u(String str, String str2, String str3, List<q> list, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
    }

    public final String a(String str, String str2) {
        String str3;
        String f = c.f(str, str2);
        if (TextUtils.isEmpty(f)) {
            y.a("hmsSdk", "No report address,TAG : %s,TYPE: %s ", str, str2);
            return "";
        }
        if ("oper".equals(str2)) {
            str3 = "{url}/common/hmshioperqrt";
        } else if ("maint".equals(str2)) {
            str3 = "{url}/common/hmshimaintqrt";
        } else if (!"diffprivacy".equals(str2)) {
            return "";
        } else {
            str3 = "{url}/common/common2";
        }
        return str3.replace("{url}", f);
    }

    public void a() {
        String a = a(this.a, this.b);
        if (TextUtils.isEmpty(a) && !"preins".equals(this.b)) {
            y.e("hmsSdk", "collectUrl is empty");
            return;
        }
        if (!"_hms_config_tag".equals(this.a) && !"_openness_config_tag".equals(this.a)) {
            b();
        }
        r d = d();
        if (d == null) {
            n0.b().a(new l0(this.d, this.a, this.e, this.b));
            return;
        }
        byte[] a2 = a(d);
        if (a2.length == 0) {
            y.e("hmsSdk", "request body is empty");
            return;
        }
        n0.a().a(new i0(a2, a, this.a, this.b, this.e, this.d));
    }

    public final byte[] a(r rVar) {
        String str;
        String str2;
        try {
            JSONObject a = rVar.a();
            if (a == null) {
                y.e("hmsSdk", "uploadEvents is null");
                return new byte[0];
            }
            return r0.a(a.toString().getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            str = "hmsSdk";
            str2 = "sendData(): getBytes - Unsupported coding format!!";
            y.e(str, str2);
            return new byte[0];
        } catch (JSONException unused2) {
            str = "hmsSdk";
            str2 = "uploadEvents to json error";
            y.e(str, str2);
            return new byte[0];
        }
    }

    public final void b() {
        if (p0.a(b.f(), "backup_event", 5242880)) {
            y.d("hmsSdk", "backup file reach max limited size, discard new event ");
            return;
        }
        JSONArray c = c();
        String a = s0.a(this.a, this.b, this.e);
        y.c("hmsSdk", "Update data cached into backup,spKey: " + a);
        g0.b(b.f(), "backup_event", a, c.toString());
    }

    public final JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        for (q qVar : this.d) {
            try {
                jSONArray.put(qVar.d());
            } catch (JSONException unused) {
                y.c("hmsSdk", "handleEvents: json error,Abandon this data");
            }
        }
        return jSONArray;
    }

    public final r d() {
        return b1.a(this.d, this.a, this.b, this.e, this.c);
    }
}
