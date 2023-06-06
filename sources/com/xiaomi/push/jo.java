package com.xiaomi.push;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public class jo {
    private static volatile jo a;
    private Context b;
    private Handler c = new Handler(Looper.getMainLooper());
    private Map<String, Map<String, String>> d = new HashMap();

    private jo(Context context) {
        this.b = context;
    }

    public static jo a(Context context) {
        if (a == null) {
            synchronized (jo.class) {
                if (a == null) {
                    a = new jo(context);
                }
            }
        }
        return a;
    }

    private synchronized String a(String str, String str2) {
        if (this.d != null && !TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    Map<String, String> map = this.d.get(str);
                    if (map != null) {
                        return map.get(str2);
                    }
                    return "";
                } catch (Throwable unused) {
                    return "";
                }
            }
        }
        return "";
    }

    private synchronized void c(String str, String str2, String str3) {
        if (this.d == null) {
            this.d = new HashMap();
        }
        Map<String, String> map = this.d.get(str);
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(str2, str3);
        this.d.put(str, map);
    }

    public final synchronized void a(String str, String str2, String str3) {
        c(str, str2, str3);
        this.c.post(new jp(this, str, str2, str3));
    }

    public final synchronized String b(String str, String str2, String str3) {
        String a2 = a(str, str2);
        if (TextUtils.isEmpty(a2)) {
            return this.b.getSharedPreferences(str, 4).getString(str2, str3);
        }
        return a2;
    }
}
