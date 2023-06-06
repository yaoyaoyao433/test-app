package com.dianping.monitor.metric;

import android.text.TextUtils;
import com.dianping.logreportswitcher.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static volatile c b;
    private volatile String c;
    private volatile HashMap<String, Integer> d;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a23a3816db4209a64c7645416b95885e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a23a3816db4209a64c7645416b95885e");
        } else {
            this.c = "";
        }
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38b9845bd40afd5071806cfeb60e8768", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38b9845bd40afd5071806cfeb60e8768");
        }
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c();
                }
            }
        }
        return b;
    }

    public final int a(String str) {
        Integer num;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60ee56e970004f98c0e0bb0098aeefd3", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60ee56e970004f98c0e0bb0098aeefd3")).intValue();
        }
        if (str == null) {
            return -1;
        }
        HashMap<String, Integer> hashMap = this.d;
        if (hashMap == null) {
            b();
            hashMap = this.d;
        }
        if (hashMap == null || (num = hashMap.get(str.toLowerCase())) == null) {
            return -1;
        }
        return num.intValue();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94040f79f23ee2533c79936b3919aaf3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94040f79f23ee2533c79936b3919aaf3");
            return;
        }
        String c = c.b.a.c();
        if (TextUtils.isEmpty(c) || this.c.equals(c)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(c);
            HashMap<String, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    String optString = jSONObject.optString("id");
                    int optDouble = (int) (jSONObject.optDouble("sample") * 1000.0d);
                    if (!TextUtils.isEmpty(optString)) {
                        hashMap.put(optString.toLowerCase(), Integer.valueOf(optDouble));
                    }
                }
            }
            this.d = hashMap;
            this.c = c;
        } catch (Throwable unused) {
        }
    }
}
