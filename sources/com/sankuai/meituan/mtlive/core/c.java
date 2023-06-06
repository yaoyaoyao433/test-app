package com.sankuai.meituan.mtlive.core;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class c {
    public static ChangeQuickRedirect a = null;
    public static String d = "0";
    public static String e = "1";
    public static String f = "2";
    public static String g = "3";
    protected int b;
    protected int c;
    private Map<String, d> h;
    private Map<Integer, List<Integer>> i;
    private Map<Integer, Integer> j;
    private Map<Integer, Integer> k;

    public void a() {
    }

    public abstract int b(int i, int i2);

    public abstract List<Integer> b();

    public abstract Map<Integer, String> c();

    public abstract Map<Integer, String> d();

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a28fc4af5c2a1955bb95b28df3bdcd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a28fc4af5c2a1955bb95b28df3bdcd0");
            return;
        }
        this.b = g.a;
        this.c = g.b;
        this.h = new ConcurrentHashMap();
        this.i = new HashMap();
        this.j = new HashMap();
        this.k = new HashMap();
        a();
    }

    public final String a(int i) {
        int c;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a282bef4b5a241de7de53a243981532", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a282bef4b5a241de7de53a243981532");
        }
        if (d() == null || (c = c(i)) == -1) {
            return null;
        }
        return d().get(Integer.valueOf(c));
    }

    public final boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "142a841cf299ae49893df6b4e7febef8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "142a841cf299ae49893df6b4e7febef8")).booleanValue() : a(i, this.b);
    }

    public final void a(int i, k.a aVar) {
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd91efd37cb49c2d433af21e5ea1b509", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd91efd37cb49c2d433af21e5ea1b509");
        } else {
            a(i, this.b, aVar);
        }
    }

    public final boolean a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a64c112921f16f5a745a6dd688561f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a64c112921f16f5a745a6dd688561f0")).booleanValue();
        }
        int c = c(i, i2);
        d f2 = f(c);
        if (f2 == null) {
            Map<String, String> a2 = a(i, c, (String) null);
            a2.put("isReady", "false");
            a2.put("result", "engine == null");
            a("isEngineReady", a2);
            return false;
        }
        boolean a3 = k.a().a(f2);
        if (a3) {
            this.j.put(Integer.valueOf(i), Integer.valueOf(c));
        } else {
            a3 = this.j.containsKey(Integer.valueOf(i));
        }
        Map<String, String> a4 = a(i, c, f2.getClass().getSimpleName());
        StringBuilder sb = new StringBuilder();
        sb.append(a3);
        a4.put("isReady", sb.toString());
        a4.put("result", "engine != null");
        a("isEngineReady", a4);
        return a3;
    }

    public final void a(int i, int i2, k.a aVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e453e1dfe1b02b6d96b912f36fb8226", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e453e1dfe1b02b6d96b912f36fb8226");
        } else {
            b(i, c(i, i2), aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i, final int i2, final k.a aVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1fd97af3bc09d59f8f3d08d7199a879", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1fd97af3bc09d59f8f3d08d7199a879");
            return;
        }
        d f2 = f(i2);
        final String simpleName = f2 != null ? f2.getClass().getSimpleName() : "";
        Map<String, String> a2 = a(i, i2, simpleName);
        a2.put("state", "start");
        final long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        if (!k.a().a(f2)) {
            k.a aVar2 = new k.a() { // from class: com.sankuai.meituan.mtlive.core.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtlive.core.k.a
                public final void onInitialSucceed() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90c5ce9a8867445e0e3c62262bfdf027", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90c5ce9a8867445e0e3c62262bfdf027");
                        return;
                    }
                    long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis;
                    Map a3 = c.this.a(i, i2, simpleName);
                    a3.put("state", "succeed");
                    StringBuilder sb = new StringBuilder();
                    sb.append(currentThreadTimeMillis2);
                    a3.put("cost", sb.toString());
                    c.this.a(r7, a3);
                    c.this.j.put(Integer.valueOf(i), Integer.valueOf(i2));
                    if (aVar != null) {
                        aVar.onInitialSucceed();
                    }
                }

                @Override // com.sankuai.meituan.mtlive.core.k.a
                public final void onInitialFailed() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35b053cd8496ac8adecc1261143fd5f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35b053cd8496ac8adecc1261143fd5f0");
                        return;
                    }
                    long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis;
                    Map a3 = c.this.a(i, i2, simpleName);
                    a3.put("state", "failed");
                    StringBuilder sb = new StringBuilder();
                    sb.append(currentThreadTimeMillis2);
                    a3.put("cost", sb.toString());
                    c.this.a(r7, a3);
                    List<Integer> list = (List) c.this.i.get(Integer.valueOf(i));
                    if (list == null) {
                        list = new ArrayList<>();
                        c.this.i.put(Integer.valueOf(i), list);
                    }
                    if (!list.contains(Integer.valueOf(i2))) {
                        list.add(Integer.valueOf(i2));
                    }
                    int a4 = c.this.a(list);
                    if (a4 != -1) {
                        c.this.b(i, a4, aVar);
                    } else if (aVar != null) {
                        aVar.onInitialFailed();
                    }
                }
            };
            if (f2 == null) {
                a2.put("result", "engine == null");
                a2.put("isReady", "false");
                a("Engine", a2);
                aVar2.onInitialFailed();
                return;
            }
            k.a().a(f2, aVar2);
            return;
        }
        this.j.put(Integer.valueOf(i), Integer.valueOf(i2));
        a2.put("result", "engine != null");
        a2.put("isReady", "true");
        a("Engine", a2);
        if (aVar != null) {
            aVar.onInitialSucceed();
        }
    }

    public final int c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8efa5a7768f4bde14fc93be50af3a55a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8efa5a7768f4bde14fc93be50af3a55a")).intValue();
        }
        Integer num = this.j.get(Integer.valueOf(i));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    private int c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfb1dff8ae64e6fc7ce47f5731cac271", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfb1dff8ae64e6fc7ce47f5731cac271")).intValue() : d(b(i, i2));
    }

    private int d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf23dfe01e801ed5349a5ce99e75950c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf23dfe01e801ed5349a5ce99e75950c")).intValue();
        }
        if (e(i)) {
            return i;
        }
        for (Map.Entry<Integer, String> entry : c().entrySet()) {
            Integer key = entry.getKey();
            if (key != null && key.intValue() != i && e(key.intValue())) {
                return key.intValue();
            }
        }
        return -1;
    }

    private boolean e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bb324d59b8d02ff046583388223243d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bb324d59b8d02ff046583388223243d")).booleanValue();
        }
        Map<Integer, String> c = c();
        if (c != null) {
            try {
                Class.forName(c.get(Integer.valueOf(i)));
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    private synchronized d f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d87424e831f2fa6a773a134d8f9d6ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d87424e831f2fa6a773a134d8f9d6ea");
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        hashMap.put("engineType", sb.toString());
        if (i == -1) {
            a("getEngineInstance", hashMap);
            return null;
        }
        String str = c().get(Integer.valueOf(i));
        hashMap.put("engineClassName", str);
        if (TextUtils.isEmpty(str)) {
            a("getEngineInstance", hashMap);
            return null;
        } else if (this.h.containsKey(str) && this.h.get(str) != null) {
            hashMap.put(NetLogConstants.Details.CACHED, "true");
            a("getEngineInstance", hashMap);
            return this.h.get(str);
        } else {
            Object a2 = a(str);
            if (a2 != null) {
                this.h.put(str, (d) a2);
            }
            hashMap.put("engineInstance", a2 != null ? "exist" : "gone");
            a("getEngineInstance", hashMap);
            if (a2 == null) {
                return null;
            }
            return (d) a2;
        }
    }

    public final Object a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c062fc39b9e019710addb9e65ab71568", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c062fc39b9e019710addb9e65ab71568");
        }
        if (str != null) {
            try {
                return Class.forName(str).newInstance();
            } catch (Exception e2) {
                e2.printStackTrace();
                Log.e("EngineSelector", "createLivePushConfig: " + e2);
                return null;
            }
        }
        return null;
    }

    public final Object a(Context context, int i, String str) {
        Object[] objArr = {context, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40bd9def032d939462ac26148b2a03a9", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40bd9def032d939462ac26148b2a03a9");
        }
        try {
            return Class.forName(str).getConstructor(Context.class, Integer.TYPE).newInstance(context, Integer.valueOf(i));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final Object a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41d966bd1bca0414992f70b91bc0f62e", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41d966bd1bca0414992f70b91bc0f62e");
        }
        try {
            return Class.forName(str).getConstructor(Context.class).newInstance(context);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final int a(List<Integer> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a76278af1f135df28ed8c8a54529b17", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a76278af1f135df28ed8c8a54529b17")).intValue();
        }
        int i = -1;
        if (b() == null || b().size() == 0) {
            return -1;
        }
        HashMap hashMap = new HashMap();
        if (list == null) {
            i = b().get(0).intValue();
        } else {
            StringBuilder sb = new StringBuilder();
            for (Integer num : list) {
                sb.append(num);
                sb.append(CommonConstant.Symbol.COMMA);
            }
            hashMap.put("usedList", sb.toString());
            Iterator<Integer> it = b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Integer next = it.next();
                if (!list.contains(next)) {
                    i = next.intValue();
                    break;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        hashMap.put("backupEngineType", sb2.toString());
        a("getBackupEngineType", hashMap);
        return i;
    }

    public final int a(int i, String str, int i2) {
        int i3 = 0;
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a539184c2dbe509482901b019345ebd1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a539184c2dbe509482901b019345ebd1")).intValue();
        }
        k a2 = k.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = k.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "1e2b8f9578bc580e3eeb356948631c64", RobustBitConfig.DEFAULT_VALUE)) {
            i3 = ((Integer) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "1e2b8f9578bc580e3eeb356948631c64")).intValue();
        } else if (a2.c != null) {
            j jVar = a2.c;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = j.a;
            if (PatchProxy.isSupport(objArr3, jVar, changeQuickRedirect3, false, "fbf2e3e1177dd019cd692474f1c221ae", RobustBitConfig.DEFAULT_VALUE)) {
                i3 = ((Integer) PatchProxy.accessDispatch(objArr3, jVar, changeQuickRedirect3, false, "fbf2e3e1177dd019cd692474f1c221ae")).intValue();
            } else if (jVar.b != null) {
                i3 = jVar.b.c();
            }
        }
        b a3 = b.a();
        StringBuilder sb = new StringBuilder();
        sb.append(i3);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i);
        return a3.a(sb2, sb3.toString(), str, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eac0780d115e1e6e669e0d71ccfb8c61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eac0780d115e1e6e669e0d71ccfb8c61");
            return;
        }
        com.sankuai.meituan.mtliveqos.a.a(k.a().b, str, new JSONObject(map).toString());
        com.sankuai.meituan.mtliveqos.a.a(k.a().b, map, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(int i, int i2, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b7fdfedb29d8ad2d7ac1386414943b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b7fdfedb29d8ad2d7ac1386414943b5");
        }
        Map<String, String> d2 = d(i, i2);
        d2.put("engineName", str);
        return d2;
    }

    private Map<String, String> d(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "938c89a7584616128445193b68f9353d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "938c89a7584616128445193b68f9353d");
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        hashMap.put("projectID", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i2);
        hashMap.put("engineType", sb2.toString());
        return hashMap;
    }
}
