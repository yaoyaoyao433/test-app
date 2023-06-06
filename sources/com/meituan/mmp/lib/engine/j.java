package com.meituan.mmp.lib.engine;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.LruCache;
import com.meituan.mmp.lib.mp.GlobalEngineMonitor;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private static final LruCache<String, m> b = new LruCache<>(3);
    private static final Map<Integer, m> c = new HashMap();
    private static final Map<Integer, h> d = new HashMap();

    public static m a(int i, String str) {
        m mVar;
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57aa50a30bb64f2012bca78692f8339e", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57aa50a30bb64f2012bca78692f8339e");
        }
        synchronized (c) {
            mVar = c.get(Integer.valueOf(i));
            if (mVar == null || (mVar.b != null && !TextUtils.equals(mVar.b, str))) {
                mVar = null;
            }
        }
        if (mVar != null) {
            o.a(str, mVar.g, true);
        }
        return mVar;
    }

    public static h a(int i, String str, boolean z) {
        h hVar;
        Object[] objArr = {Integer.valueOf(i), str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d609cd638dc420410704923249adc55c", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d609cd638dc420410704923249adc55c");
        }
        synchronized (d) {
            hVar = d.get(Integer.valueOf(i));
            if (hVar == null || (hVar.f() != null && !TextUtils.equals(hVar.f(), str))) {
                hVar = null;
            }
        }
        return hVar;
    }

    private static m c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29b6394ce13385ca50d8caa49d388701", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29b6394ce13385ca50d8caa49d388701");
        }
        synchronized (c) {
            for (m mVar : c.values()) {
                if (TextUtils.equals(mVar.b, str)) {
                    return mVar;
                }
            }
            return null;
        }
    }

    public static f a(String str) {
        f fVar;
        f fVar2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9f155f877cab5813ce74aad6f115bcd", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9f155f877cab5813ce74aad6f115bcd");
        }
        m c2 = c(str);
        if (c2 != null) {
            fVar2 = c2.g;
        } else {
            synchronized (d) {
                fVar = null;
                for (f fVar3 : d.values()) {
                    if (TextUtils.equals(fVar3.f(), str)) {
                        fVar = fVar3;
                    }
                }
            }
            fVar2 = fVar;
        }
        if (fVar2 != null) {
            o.a(str, fVar2, true);
            if (fVar2.w) {
                com.meituan.mmp.lib.trace.b.b("EngineManager", String.format("UpdateManager can't use cur appLoader because widget applyUpdate, appId:%s", str));
                return null;
            }
            return fVar2;
        }
        return fVar2;
    }

    @Nullable
    public static m b(String str) {
        m mVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f40251d1d31f704f7bd06d90e8065c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f40251d1d31f704f7bd06d90e8065c6");
        }
        synchronized (b) {
            mVar = b.get(str);
        }
        return mVar;
    }

    public static f a(String str, boolean z, boolean z2) {
        h hVar;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb5baf4c9c1544840d2864f52bfb7e5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb5baf4c9c1544840d2864f52bfb7e5b");
        }
        if (!z2 && com.meituan.mmp.lib.mp.a.f() && com.meituan.mmp.lib.config.b.c(str)) {
            com.meituan.mmp.lib.trace.b.b("EngineManager", "create DownloadOnlyAppEngine, isMainProcess: " + com.meituan.mmp.lib.mp.a.f());
            h a2 = new a(str).a();
            synchronized (d) {
                d.put(Integer.valueOf(a2.g()), a2);
                hVar = a2;
            }
        } else {
            com.meituan.mmp.lib.trace.b.b("EngineManager", "create executable AppEngine, isMainProcess: " + com.meituan.mmp.lib.mp.a.f());
            b b2 = new a(str).b();
            m a3 = b2.a();
            synchronized (c) {
                c.put(Integer.valueOf(a3.c), a3);
            }
            GlobalEngineMonitor a4 = GlobalEngineMonitor.a();
            Object[] objArr2 = {a3};
            ChangeQuickRedirect changeQuickRedirect2 = GlobalEngineMonitor.a;
            if (PatchProxy.isSupport(objArr2, a4, changeQuickRedirect2, false, "08140e12357ae7e32c86b120c90a6e17", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a4, changeQuickRedirect2, false, "08140e12357ae7e32c86b120c90a6e17");
                hVar = b2;
            } else {
                a4.b(a3, false);
                hVar = b2;
            }
        }
        b bVar = hVar;
        if (z) {
            bVar.b(true);
        }
        return bVar;
    }

    public static void a(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15c7104590eebcc03ba614a192d2d318", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15c7104590eebcc03ba614a192d2d318");
            return;
        }
        synchronized (b) {
            b.remove(mVar.b);
        }
        synchronized (c) {
            c.remove(Integer.valueOf(mVar.c));
        }
        GlobalEngineMonitor.a().a(mVar.c);
    }

    public static void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f232903c9839de241b1092c328fad967", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f232903c9839de241b1092c328fad967");
            return;
        }
        synchronized (d) {
            d.remove(Integer.valueOf(hVar.g()));
        }
    }

    public static void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1286b29216201bd21e6f053ba72b8f12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1286b29216201bd21e6f053ba72b8f12");
            return;
        }
        synchronized (c) {
            for (m mVar : c.values()) {
                if (TextUtils.equals(mVar.b, bVar.f()) && mVar.g != bVar) {
                    b.a.a("EngineManager", "destroy running engine：" + mVar);
                    mVar.f.e();
                }
            }
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5672aaa05c292e4272e6b27ec613d17a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5672aaa05c292e4272e6b27ec613d17a");
        } else if (com.meituan.mmp.lib.config.b.J()) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "03e038bba88aa7126a449889bd5916ac", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "03e038bba88aa7126a449889bd5916ac");
            } else {
                synchronized (b) {
                    if (b.size() > 0) {
                        for (Map.Entry<String, m> entry : b.snapshot().entrySet()) {
                            c(entry.getValue());
                        }
                        b.evictAll();
                    }
                }
            }
            o.b();
        }
    }

    public static void b(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cfd76114d65455d247f0bcf874037bd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cfd76114d65455d247f0bcf874037bd3");
        } else if (mVar == null) {
        } else {
            synchronized (b) {
                if (b.size() == 3) {
                    try {
                        if (b.snapshot() != null) {
                            LruCache<String, m> lruCache = b;
                            c(lruCache.remove(lruCache.snapshot().entrySet().iterator().next().getKey()));
                        }
                    } catch (Throwable unused) {
                    }
                }
                b.put(mVar.b, mVar);
                GlobalEngineMonitor.a().a(mVar, true);
                bb.b("引擎进入保活状态", new Object[0]);
                b.a.a("EngineManager", "addKeepAliveEngine");
            }
        }
    }

    public static void c(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f680e2fae0721676a4e585f1d3ee5b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f680e2fae0721676a4e585f1d3ee5b7");
        } else if (mVar != null) {
            bb.b("销毁保活的引擎", new Object[0]);
            b.a.a("EngineManager destroyKeepAliveEngine");
            mVar.f.e();
        }
    }

    public static void d(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "772a41e96e821c46015dfc74f5d11c1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "772a41e96e821c46015dfc74f5d11c1f");
        } else if (mVar == null) {
        } else {
            synchronized (b) {
                b.remove(mVar.b);
            }
            GlobalEngineMonitor.a().a(mVar, false);
        }
    }

    public static Map<String, m> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c5dfd67570667ae231306cdd874aba4", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c5dfd67570667ae231306cdd874aba4") : b.snapshot();
    }

    public static Map<Integer, m> c() {
        HashMap hashMap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8011a1416513c6a45e5c6c3cae38dfbd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8011a1416513c6a45e5c6c3cae38dfbd");
        }
        synchronized (c) {
            hashMap = new HashMap(c);
        }
        return hashMap;
    }

    public static Map<Integer, f> d() {
        HashMap hashMap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2aabd7ef87a10cff142bd156a9cd5fbf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2aabd7ef87a10cff142bd156a9cd5fbf");
        }
        synchronized (d) {
            hashMap = new HashMap(d);
        }
        synchronized (c) {
            for (Map.Entry<Integer, m> entry : c.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue().g);
            }
        }
        return hashMap;
    }
}
