package com.meituan.android.preload.config;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b {
    public static ChangeQuickRedirect a;
    public static volatile boolean b;
    public static volatile e e;
    private static volatile b g;
    private static volatile String h;
    private static volatile Map<String, a> i;
    public String d;
    public static volatile List<c> c = new ArrayList();
    public static volatile List<String> f = new ArrayList();
    private static CopyOnWriteArrayList<String> j = new CopyOnWriteArrayList<>();

    public static /* synthetic */ void a(b bVar, boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "bc2a5b8f88d02fea2d9801038fefd974", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "bc2a5b8f88d02fea2d9801038fefd974");
        } else if (z) {
            try {
                com.meituan.android.preload.util.a.a("Enlight/ConfigCenter", "result: " + str);
                if (TextUtils.equals(h, str)) {
                    return;
                }
                h = str;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "819328096eb62c95e75c54a7c77b4942", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "819328096eb62c95e75c54a7c77b4942");
                } else {
                    try {
                        e = (e) com.meituan.android.preload.util.b.a().fromJson(new JSONObject(h).optJSONObject("global").toString(), (Class<Object>) e.class);
                        com.meituan.android.preload.util.a.a("Enlight/ConfigCenter", "globalConfig: " + e);
                    } catch (Exception unused) {
                    }
                }
                bVar.e();
                bVar.f();
                for (c cVar : c) {
                    cVar.a();
                }
            } catch (Exception e2) {
                com.meituan.android.preload.util.c a2 = com.meituan.android.preload.util.c.a();
                a2.c("拉取Horn配置错误 ---------" + e2.getMessage());
            }
        }
    }

    public static CopyOnWriteArrayList<String> a() {
        return j;
    }

    public static b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9a4b96ca3b354893fe20f63eb1f6367", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9a4b96ca3b354893fe20f63eb1f6367");
        }
        if (g == null) {
            synchronized (b.class) {
                if (g == null) {
                    g = new b();
                }
            }
        }
        return g;
    }

    public static e c() {
        return e;
    }

    public static a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42e73d72a3dc4b3d3d13e40f0347f119", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42e73d72a3dc4b3d3d13e40f0347f119");
        }
        if (i == null || i.size() == 0) {
            return null;
        }
        return i.get(str);
    }

    private static boolean d() {
        if (e == null) {
            return false;
        }
        return e.b;
    }

    public static boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa68edf511c2447804b63469d13d5398", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa68edf511c2447804b63469d13d5398")).booleanValue();
        }
        if (!d()) {
            com.meituan.android.preload.util.c.a().b(str, str2, "30065");
            return false;
        }
        a a2 = a(str);
        if (a2 == null) {
            com.meituan.android.preload.util.c.a().b(str, str2, "30065");
            return false;
        }
        if (!f.contains(str)) {
            com.meituan.android.preload.util.c.a().b(str, str2, "30074");
        }
        if (!b) {
            com.meituan.android.preload.util.c.a().a(str, str2, "30061");
        }
        return a2.b && com.meituan.android.preload.util.d.c(a2.c);
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d667116215b8d267ae6249f1823cb0d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d667116215b8d267ae6249f1823cb0d")).booleanValue() : d() && d(str);
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a3439053191f8345e26b710a33db248", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a3439053191f8345e26b710a33db248");
        } else if (!TextUtils.isEmpty(h) && f != null && f.size() != 0) {
            if (i == null) {
                i = new ConcurrentHashMap();
            }
            try {
                JSONObject jSONObject = new JSONObject(h);
                for (String str : f) {
                    a aVar = (a) com.meituan.android.preload.util.b.a().fromJson(jSONObject.getJSONObject(str).toString(), (Class<Object>) a.class);
                    if (aVar == null) {
                        return;
                    }
                    if (aVar.b) {
                        i.put(str, aVar);
                    } else {
                        i.remove(str);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95187a14a9a5c7482f92898354418dbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95187a14a9a5c7482f92898354418dbd");
        } else if (!TextUtils.isEmpty(h)) {
            try {
                JSONArray optJSONArray = new JSONObject(h).optJSONArray("blackListPages");
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    j.add(String.valueOf(optJSONArray.get(i2)));
                }
            } catch (Exception e2) {
                com.meituan.android.preload.util.c a2 = com.meituan.android.preload.util.c.a();
                a2.c("更新黑名单配置错误 ---------" + e2.getMessage());
            }
        }
    }

    public boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "281b43d620d8c18313b266a2867b6d66", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "281b43d620d8c18313b266a2867b6d66")).booleanValue();
        }
        if (TextUtils.isEmpty(h)) {
            return false;
        }
        if (i == null) {
            i = new ConcurrentHashMap();
        }
        try {
            a aVar = (a) com.meituan.android.preload.util.b.a().fromJson(new JSONObject(h).getJSONObject(str).toString(), (Class<Object>) a.class);
            if (aVar == null) {
                return false;
            }
            if (aVar.b) {
                aVar.i = str;
                i.put(str, aVar);
                return true;
            }
            i.remove(str);
            return false;
        } catch (Exception e2) {
            com.meituan.android.preload.util.c a2 = com.meituan.android.preload.util.c.a();
            a2.c("更新可用biz配置错误 ---------" + e2.getMessage());
            return false;
        }
    }

    private static boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2dd0620d2d92b162482a7f3fbc468088", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2dd0620d2d92b162482a7f3fbc468088")).booleanValue();
        }
        if (TextUtils.isEmpty(h)) {
            return false;
        }
        try {
            a aVar = (a) com.meituan.android.preload.util.b.a().fromJson(new JSONObject(h).getJSONObject(str).toString(), (Class<Object>) a.class);
            if (aVar != null && aVar.b) {
                if (com.meituan.android.preload.util.d.c(aVar.c)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
