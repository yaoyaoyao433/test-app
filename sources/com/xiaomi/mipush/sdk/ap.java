package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.fd;
import com.xiaomi.push.hf;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class ap {
    private static volatile ap e;
    Context a;
    public a b;
    Map<String, a> c = new HashMap();
    String d;

    /* loaded from: classes6.dex */
    public static class a {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public boolean i = true;
        public boolean j = false;
        public int k = 1;
        Context l;

        public a(Context context) {
            this.l = context;
        }

        public static String a(a aVar) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appId", aVar.a);
                jSONObject.put("appToken", aVar.b);
                jSONObject.put("regId", aVar.c);
                jSONObject.put("regSec", aVar.d);
                jSONObject.put("devId", aVar.f);
                jSONObject.put("vName", aVar.e);
                jSONObject.put("valid", aVar.i);
                jSONObject.put("paused", aVar.j);
                jSONObject.put("envType", aVar.k);
                jSONObject.put("regResource", aVar.g);
                return jSONObject.toString();
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.c.a(th);
                return null;
            }
        }

        public final void a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.g = str3;
            SharedPreferences.Editor edit = ap.b(this.l).edit();
            edit.putString("appId", this.a);
            edit.putString("appToken", str2);
            edit.putString("regResource", str3);
            edit.commit();
        }

        public final boolean a() {
            return a(this.a, this.b);
        }

        public final boolean a(String str, String str2) {
            boolean equals = TextUtils.equals(this.a, str);
            boolean equals2 = TextUtils.equals(this.b, str2);
            boolean z = !TextUtils.isEmpty(this.c);
            boolean z2 = !TextUtils.isEmpty(this.d);
            boolean z3 = TextUtils.equals(this.f, hf.g(this.l)) || TextUtils.equals(this.f, hf.f(this.l));
            boolean z4 = equals && equals2 && z && z2 && z3;
            if (!z4) {
                com.xiaomi.channel.commonutils.logger.c.f(String.format("register invalid, aid=%s;atn=%s;rid=%s;rse=%s;did=%s", Boolean.valueOf(equals), Boolean.valueOf(equals2), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)));
            }
            return z4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String b() {
            return fd.a(this.l, this.l.getPackageName());
        }

        public final void c() {
            ap.b(this.l).edit().clear().commit();
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.f = null;
            this.e = null;
            this.i = false;
            this.j = false;
            this.h = null;
            this.k = 1;
        }
    }

    public static ap a(Context context) {
        if (e == null) {
            synchronized (ap.class) {
                if (e == null) {
                    e = new ap(context);
                }
            }
        }
        return e;
    }

    public static SharedPreferences b(Context context) {
        return context.getSharedPreferences("mipush", 0);
    }

    public final void a(String str, String str2, String str3) {
        this.b.a(str, str2, str3);
    }

    public final boolean a() {
        if (this.b.a()) {
            return true;
        }
        com.xiaomi.channel.commonutils.logger.c.a("Don't send message before initialization succeeded!");
        return false;
    }

    public final boolean b() {
        return !this.b.i;
    }

    private ap(Context context) {
        this.a = context;
        this.b = new a(this.a);
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("mipush", 0);
        this.b.a = sharedPreferences.getString("appId", null);
        this.b.b = sharedPreferences.getString("appToken", null);
        this.b.c = sharedPreferences.getString("regId", null);
        this.b.d = sharedPreferences.getString("regSec", null);
        this.b.f = sharedPreferences.getString("devId", null);
        if (!TextUtils.isEmpty(this.b.f) && hf.a(this.b.f)) {
            this.b.f = hf.g(this.a);
            sharedPreferences.edit().putString("devId", this.b.f).commit();
        }
        this.b.e = sharedPreferences.getString("vName", null);
        this.b.i = sharedPreferences.getBoolean("valid", true);
        this.b.j = sharedPreferences.getBoolean("paused", false);
        this.b.k = sharedPreferences.getInt("envType", 1);
        this.b.g = sharedPreferences.getString("regResource", null);
        this.b.h = sharedPreferences.getString("appRegion", null);
    }

    public final void a(boolean z) {
        this.b.j = z;
        this.a.getSharedPreferences("mipush", 0).edit().putBoolean("paused", z).commit();
    }

    public final void a(int i) {
        this.b.k = i;
        this.a.getSharedPreferences("mipush", 0).edit().putInt("envType", i).commit();
    }
}
