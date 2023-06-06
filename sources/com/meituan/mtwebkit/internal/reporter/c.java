package com.meituan.mtwebkit.internal.reporter;

import android.support.annotation.NonNull;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.mtwebkit.MTWebViewFactory;
import com.meituan.mtwebkit.internal.f;
import com.meituan.mtwebkit.internal.h;
import com.meituan.mtwebkit.internal.j;
import com.meituan.mtwebkit.internal.k;
import com.meituan.mtwebkit.internal.l;
import com.meituan.mtwebkit.internal.task.a;
import com.meituan.mtwebkit.internal.update.tasks.DDVersionInfoTask;
import com.meituan.mtwebkit.internal.update.tasks.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.data.Constant;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static com.meituan.mtwebkit.internal.reporter.a b = new com.meituan.mtwebkit.internal.reporter.b();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public long a;
        public long b;
        public long c;
        public String d;
        public String e;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public boolean a;
        public boolean b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;
        public int j;
        public int k;
        public int l;
        public String m;
    }

    public static /* synthetic */ Map b(b bVar) {
        boolean z;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "088efe493243549ce505bd272fdb9cc1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "088efe493243549ce505bd272fdb9cc1");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("startUpTime", Long.valueOf(bVar.d - bVar.c));
        hashMap.put("dynamicLoadTime", Long.valueOf(bVar.e - bVar.c));
        hashMap.put("createTime", Long.valueOf(bVar.f - bVar.e));
        hashMap.put("initTime", Long.valueOf(bVar.d - bVar.g));
        hashMap.put("systemWebViewInstanceTime", Long.valueOf(bVar.i - bVar.h));
        hashMap.put("kernelVersion", Integer.valueOf(bVar.j));
        hashMap.put(JsBridgeResult.ARG_KEY_LOCATION_MODE, Integer.valueOf(bVar.k));
        hashMap.put("preloadStatus", Boolean.valueOf(bVar.b));
        hashMap.put("firstStartUpFlag", Boolean.valueOf(bVar.a));
        hashMap.put("multiProcessState", Integer.valueOf(bVar.l));
        hashMap.put("businessName", bVar.m);
        hashMap.put(LogMonitor.EXCEPTION_TAG, b(l.d()));
        hashMap.put("systemWebViewStatus", Integer.valueOf(c()));
        hashMap.put("systemWebViewKernelVersion", d());
        hashMap.put("multiProcessName", com.meituan.mtwebkit.internal.a.c());
        hashMap.put("odexSize", Long.valueOf(j.b()));
        hashMap.put("compilerFilter", j.c());
        hashMap.put("currentMode", Integer.valueOf(h.v()));
        hashMap.put("cityId", Long.valueOf(a()));
        if (bVar.k == 2) {
            hashMap.put("dex2oatMethodStatus", h.g() + h.h());
            hashMap.put("renderMultiProcessEnable", Boolean.valueOf(MTWebViewFactory.isMultiProcessEnabled()));
        } else {
            hashMap.put("dex2oatMethodStatus", Constant.DEFAULT_CVN2);
            hashMap.put("renderMultiProcessEnable", Boolean.FALSE);
        }
        HashMap hashMap2 = new HashMap();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "36122dfd4a9f507a253426deb21c0ae0", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "36122dfd4a9f507a253426deb21c0ae0")).booleanValue();
        } else {
            long currentTimeMillis = System.currentTimeMillis() / 86400000;
            z = currentTimeMillis == h.m();
            if (!z) {
                h.c(currentTimeMillis);
            }
        }
        hashMap2.put("firstStartUpInOneDayFlay", Boolean.valueOf(z ? false : true));
        hashMap2.put("spHookEnable", Boolean.valueOf(h.p()));
        hashMap.put("optionData", hashMap2);
        return hashMap;
    }

    public static void a(int i, long j, int i2) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8648ef765d11ebd5a45e395fca8c7dde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8648ef765d11ebd5a45e395fca8c7dde");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("preloadTime", Long.valueOf(j));
        hashMap.put(JsBridgeResult.ARG_KEY_LOCATION_MODE, Integer.valueOf(i));
        hashMap.put("preloadOpportunity", Integer.valueOf(i2));
        b.a("mtwebview_preload", b(hashMap));
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea1626794a2157bc4d174ad9f118af4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea1626794a2157bc4d174ad9f118af4d");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(LogMonitor.EXCEPTION_TAG, b(th));
        b.a("mtwebview_cached_exception", b(hashMap));
    }

    public static void a(LinkedList<a.c> linkedList, int i, @NonNull com.meituan.mtwebkit.internal.update.model.a aVar) {
        Object[] objArr = {linkedList, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c1f47ed989d467e47c837f3eaa23aa0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c1f47ed989d467e47c837f3eaa23aa0a");
        } else if (linkedList == null) {
        } else {
            Map<String, Object> a2 = a(linkedList);
            a2.put("kernelVersion", Integer.valueOf(i));
            a2.put("checkUpdateOpportunity", Integer.valueOf(aVar != null ? aVar.b : -1));
            a2.put("cityId", Long.valueOf(a()));
            a a3 = j.a();
            if (a3 != null) {
                a2.put("dex2oatTime", Long.valueOf(a3.a));
                a2.put("createOdexTime", Long.valueOf(a3.b));
                a2.put("odexSize", Long.valueOf(a3.c));
                a2.put("compilerFilter", a3.d);
            }
            a2.put("dex2oatMethodStatus", h.g() + h.h());
            b.a("mtwebview_checkupdate", b(a2));
        }
    }

    public static void a(String str, int i, @NonNull com.meituan.mtwebkit.internal.update.model.a aVar) {
        Object[] objArr = {str, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbf059a9e9ee7d265ea730adf46b1ba6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbf059a9e9ee7d265ea730adf46b1ba6");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("checkUpdateOpportunity", Integer.valueOf(aVar != null ? aVar.b : -1));
        hashMap.put("cityId", Long.valueOf(a()));
        hashMap.put("taskcode", Integer.valueOf((int) MapConstant.LayerPropertyFlag_RasterOpacity));
        hashMap.put("checkUpdateTime", str);
        hashMap.put("downloadCode", Integer.valueOf(i));
        hashMap.put("kernelVersion", 99999);
        b.a("mtwebview_checkupdate", b(hashMap));
    }

    public static void a(Boolean bool) {
        Object[] objArr = {bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c84e3aaab19a21a0d675de53d9a5cb9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c84e3aaab19a21a0d675de53d9a5cb9b");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("renderProcessDidCrash", bool);
        hashMap.put("multiProcessState", Integer.valueOf(f.a.a.b));
        b.a("mtwebview_renderProcessGone", b(hashMap));
    }

    private static Map<String, Object> a(LinkedList<a.c> linkedList) {
        Object[] objArr = {linkedList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c29b6e0b41ccccb40fbd7564666b9a96", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c29b6e0b41ccccb40fbd7564666b9a96");
        }
        HashMap hashMap = new HashMap();
        Iterator<a.c> it = linkedList.iterator();
        int i = 1;
        while (it.hasNext()) {
            a.c next = it.next();
            if (next.d != null) {
                Throwable th = next.d;
                int a2 = l.a(th);
                hashMap.put(LogMonitor.EXCEPTION_TAG, b(th));
                i = a2;
            }
            long j = next.c - next.b;
            if (next.a instanceof e) {
                hashMap.put("checkUpdateTime", Long.valueOf(j));
            } else if (next.a instanceof DDVersionInfoTask) {
                hashMap.put("ddVersionInfoTime", Long.valueOf(j));
            } else if (next.a instanceof com.meituan.mtwebkit.internal.update.tasks.h) {
                hashMap.put("downloadTime", Long.valueOf(j));
                if (next.d != null) {
                    hashMap.put("downloadCode", -1);
                } else {
                    hashMap.put("downloadCode", 1);
                }
            }
        }
        hashMap.put("taskcode", Integer.valueOf(i));
        if (!hashMap.containsKey("downloadCode")) {
            hashMap.put("downloadCode", 0);
            hashMap.put("downloadTime", Integer.toString(0));
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Object> b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86051be574f6e051e228713bb8190d7c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86051be574f6e051e228713bb8190d7c");
        }
        Map map2 = (Map) map.get("optionData");
        if (map2 == null) {
            map2 = new HashMap();
        }
        map2.put("is64Bit", Boolean.valueOf(com.meituan.mtwebkit.internal.a.b()));
        map.put("optionData", map2);
        return map;
    }

    private static synchronized int c() {
        int i;
        synchronized (c.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d4185245a8323e34b70b50f1dee5f23", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d4185245a8323e34b70b50f1dee5f23")).intValue();
            }
            try {
                i = com.meituan.mtwebkit.internal.d.a("android.webkit.WebViewFactory").b("sProviderInstance").a();
            } catch (Throwable unused) {
                i = -1;
            }
            return i;
        }
    }

    private static synchronized String d() {
        String str;
        synchronized (c.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "027815b0b8dcbc7d7970a1293c296dd9", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "027815b0b8dcbc7d7970a1293c296dd9");
            }
            try {
                str = com.meituan.mtwebkit.internal.a.a().getPackageManager().getPackageInfo("com.google.android.webview", 0).versionName;
            } catch (Throwable unused) {
                str = "";
            }
            return str;
        }
    }

    private static String b(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b6d029611132d21cd9f9f76fa759f0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b6d029611132d21cd9f9f76fa759f0d");
        }
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91cf745604f3c933bada4f2eda0fa8f2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91cf745604f3c933bada4f2eda0fa8f2")).longValue();
        }
        com.sankuai.meituan.city.a a2 = com.meituan.android.singleton.a.a();
        if (a2 == null || a2.b() < 0) {
            return -1L;
        }
        return a2.b();
    }

    public static void a(final b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a597314d99701d1f21e5c3200c4b1de2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a597314d99701d1f21e5c3200c4b1de2");
        } else {
            k.a.a.a(new Runnable() { // from class: com.meituan.mtwebkit.internal.reporter.c.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ca6bcc63430db58b602685fde1f3ee3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ca6bcc63430db58b602685fde1f3ee3");
                    } else {
                        c.b.a("mtwebview_startup", c.b(c.b(b.this)));
                    }
                }
            });
        }
    }
}
