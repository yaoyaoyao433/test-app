package com.meituan.mmp.lib;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.mmp.lib.utils.ak;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class z {
    public static ChangeQuickRedirect a;
    private static WeakReference<com.meituan.mmp.lib.a> c;
    private static final ExecutorService b = com.sankuai.android.jarvis.c.a("MMP-MemoryMonitor", 0, 1, 5, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private static final Map<Integer, Map<Integer, a>> d = new ConcurrentHashMap();
    private static final Map<com.meituan.mmp.lib.web.b, String> e = Collections.synchronizedMap(new WeakHashMap());
    private static final Runnable f = new Runnable() { // from class: com.meituan.mmp.lib.z.1
        public static ChangeQuickRedirect a;

        @Override // java.lang.Runnable
        @UiThread
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f156f0e3dc57370874add62fa6df7530", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f156f0e3dc57370874add62fa6df7530");
                return;
            }
            z.b("MemoryMonitor", "timed sample");
            z.b(b.TIMING);
        }
    };

    public static /* synthetic */ void a(b bVar, a aVar, a aVar2) {
        Object[] objArr = {bVar, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7af92ad0a74031c2d91826d5bb07c67f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7af92ad0a74031c2d91826d5bb07c67f");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("env", MMPEnvHelper.getEnvInfo().isProdEnv() ? "prod" : "test");
        if (com.meituan.mmp.lib.config.a.c != null) {
            hashMap.put("webViewType", com.meituan.mmp.lib.config.a.c);
        }
        if (!TextUtils.isEmpty(com.meituan.mmp.lib.config.a.d)) {
            hashMap.put("chrome", com.meituan.mmp.lib.config.a.d);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("diff - appId: " + aVar2.b);
        hashMap.put("mmp.id", aVar2.b);
        hashMap.put("mmpVersion", aVar2.c);
        com.meituan.mmp.lib.mp.a e2 = com.meituan.mmp.lib.mp.a.e();
        hashMap.put("process", e2 == null ? "" : e2.b());
        if (!TextUtils.isEmpty(aVar2.d)) {
            hashMap.put("path", aVar2.d);
            sb.append("\ncurr page: " + aVar2.d);
        }
        sb.append("\nscene: " + bVar.name());
        hashMap.put(KnbConstants.PARAMS_SCENE, bVar.name());
        sb.append("\npage depth: " + aVar2.e);
        hashMap.put("page depth", Integer.valueOf(aVar2.e));
        sb.append("\nWebView count: " + aVar2.f);
        hashMap.put("webViewCount", Integer.valueOf(aVar2.f));
        sb.append("\nsince page start: " + (aVar2.g - aVar.g));
        hashMap.put("sincePageStart", Long.valueOf(aVar2.g - aVar.g));
        for (Map.Entry<String, Long> entry : aVar2.a.entrySet()) {
            Long l = aVar.a.get(entry.getKey());
            if (l == null) {
                l = 0L;
            }
            long longValue = entry.getValue().longValue();
            long longValue2 = longValue - l.longValue();
            String key = entry.getKey();
            hashMap.put(key + ".start", Long.valueOf(l.longValue() / 1048576));
            hashMap.put(key + ".curr", Long.valueOf(longValue / 1048576));
            hashMap.put(key + ".diff", Long.valueOf(longValue2 / 1048576));
            StringBuilder sb2 = new StringBuilder("\n");
            sb2.append(key);
            sb2.append(": ");
            sb2.append(a(l.longValue()));
            sb2.append(" -> ");
            sb2.append(a(longValue));
            sb2.append(" (");
            sb2.append(longValue2 > 0 ? "+" : "");
            sb2.append(a(longValue2));
            sb2.append(CommonConstant.Symbol.BRACKET_RIGHT);
            sb.append(sb2.toString());
        }
        b("MemoryMonitor", sb.toString());
        MMPEnvHelper.getLogger().log("mmp.memory", null, hashMap);
    }

    public static /* synthetic */ Map c() {
        return e();
    }

    public static /* synthetic */ void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2510c7c422c4fb2d1824c8d7b3d3490", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2510c7c422c4fb2d1824c8d7b3d3490");
            return;
        }
        com.meituan.mmp.lib.executor.a.f(f);
        com.meituan.mmp.lib.executor.a.b(f, MetricsAnrManager.ANR_THRESHOLD);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum b {
        PAGE_START,
        PAGE_LEAVE,
        TIMING;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77047de32e7dff1af3c1fe2462e319c2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77047de32e7dff1af3c1fe2462e319c2");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f0651d985dabbdc175a6f4fa9a875b7", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f0651d985dabbdc175a6f4fa9a875b7") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0880ad5d3cd80bec9ac39b7e591f7d22", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0880ad5d3cd80bec9ac39b7e591f7d22") : (b[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public Map<String, Long> a;
        public String b;
        public String c;
        public String d;
        public int e;
        public int f;
        public long g;
        public int h;
        public int i;

        public a(String str, String str2, String str3, int i, int i2, int i3) {
            int i4;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = i;
            this.h = i2;
            this.i = i3;
            synchronized (z.e) {
                i4 = 0;
                for (Map.Entry entry : z.e.entrySet()) {
                    if (TextUtils.equals(str, (CharSequence) entry.getValue())) {
                        i4++;
                    }
                }
            }
            this.f = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00a0b60c1d12715a43810b65c5649ca3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00a0b60c1d12715a43810b65c5649ca3");
        } else {
            com.meituan.mmp.lib.trace.b.a(str, str2);
        }
    }

    public static void a(com.meituan.mmp.lib.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b098bfec93852ddc97eaadcad47a1ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b098bfec93852ddc97eaadcad47a1ba");
            return;
        }
        b("MemoryMonitor", "activity resume: " + aVar.A());
        c = new WeakReference<>(aVar);
        if (d.containsKey(Integer.valueOf(aVar.hashCode()))) {
            return;
        }
        d.put(Integer.valueOf(aVar.hashCode()), new HashMap());
    }

    public static void b(com.meituan.mmp.lib.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db7116b32c53a88f06747409e57ea00a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db7116b32c53a88f06747409e57ea00a");
            return;
        }
        b("MemoryMonitor", "activity pause: " + aVar.A());
        b(b.PAGE_LEAVE);
    }

    public static void c(com.meituan.mmp.lib.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a83c43fed4c7a1609b60fa28c2fed194", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a83c43fed4c7a1609b60fa28c2fed194");
        } else {
            d.remove(Integer.valueOf(aVar.hashCode()));
        }
    }

    public static void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45f051a7d4f88bd783b2beaf42d1f121", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45f051a7d4f88bd783b2beaf42d1f121");
            return;
        }
        b("MemoryMonitor", "onPageStart: " + aVar.b + " - " + aVar.d);
        a(b.PAGE_START, aVar);
    }

    public static void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "019c29b2e312d96f6fd5957150d8af86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "019c29b2e312d96f6fd5957150d8af86");
            return;
        }
        b("MemoryMonitor", "onPageCancel: " + aVar.b + " - " + aVar.d);
        Map<Integer, a> map = d.get(Integer.valueOf(aVar.h));
        if (map != null) {
            a(b.PAGE_LEAVE, aVar);
            map.remove(Integer.valueOf(aVar.i));
        }
    }

    public static void a(com.meituan.mmp.lib.web.b bVar, String str) {
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77de1d176079084c4887e22b44a7ea9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77de1d176079084c4887e22b44a7ea9b");
        } else {
            e.put(bVar, str);
        }
    }

    public static void a(com.meituan.mmp.lib.web.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7278e3c57880fd2b712abd11d902bf90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7278e3c57880fd2b712abd11d902bf90");
        } else {
            e.remove(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d35190555b1433710f23eac04fadffb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d35190555b1433710f23eac04fadffb9");
        } else if (c == null) {
            b("MemoryMonitor", "no current activity, cancel");
        } else {
            com.meituan.mmp.lib.a aVar = c.get();
            if (aVar == null) {
                b("MemoryMonitor", "no current activity, cancel");
            } else if (bVar == b.TIMING && !aVar.f()) {
                b("MemoryMonitor", "current activity not resumed, cancel");
            } else {
                com.meituan.mmp.lib.page.e e2 = aVar.y().e();
                if (e2 == null) {
                    b("MemoryMonitor", "no current page, cancel");
                } else {
                    a(bVar, e2.p());
                }
            }
        }
    }

    private static void a(final b bVar, final a aVar) {
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b78c66de5c7bd4d7ea92012c134f5cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b78c66de5c7bd4d7ea92012c134f5cc");
            return;
        }
        com.meituan.mmp.lib.executor.a.f(f);
        if (!com.meituan.mmp.lib.config.b.m()) {
            b("MemoryMonitor", "memory report disabled by config");
            return;
        }
        final Map<Integer, a> map = d.get(Integer.valueOf(aVar.h));
        if (map == null) {
            b("MemoryMonitor", "sample: pages of current activity not found");
            return;
        }
        final a aVar2 = map.get(Integer.valueOf(aVar.i));
        if (bVar != b.PAGE_START && aVar2 == null) {
            b("MemoryMonitor", "sample: start record not found");
        } else {
            b.submit(new Runnable() { // from class: com.meituan.mmp.lib.z.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5144b4b097f017536d5659c92a0de87", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5144b4b097f017536d5659c92a0de87");
                        return;
                    }
                    a.this.a = z.c();
                    a.this.g = SystemClock.elapsedRealtime();
                    if (bVar == b.PAGE_START) {
                        map.put(Integer.valueOf(a.this.i), a.this);
                    } else {
                        z.a(bVar, aVar2, a.this);
                    }
                    if (bVar == b.PAGE_START) {
                        z.d();
                    }
                }
            });
        }
    }

    @WorkerThread
    private static Map<String, Long> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5cc5af3bbf0d17cde2fc58d607d23fa3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5cc5af3bbf0d17cde2fc58d607d23fa3");
        }
        try {
            com.meituan.mmp.main.ab.a("MemoryMonitor parseMemInfo");
            Map<String, Long> a2 = a();
            com.meituan.mmp.main.ab.a();
            if (com.meituan.mmp.lib.config.b.n()) {
                com.meituan.mmp.lib.trace.b.b("MemoryMonitor", "parsing nativeHeap memory info");
                com.meituan.mmp.main.ab.a("MemoryMonitor parse from /proc/pid/maps");
                for (Map.Entry<String, Long> entry : ak.a().entrySet()) {
                    a2.put("maps." + entry.getKey(), entry.getValue());
                }
                com.meituan.mmp.main.ab.a();
            }
            ak.b = false;
            return a2;
        } catch (Exception e2) {
            com.meituan.mmp.lib.trace.b.a("MemoryMonitor", e2);
            return new LinkedHashMap();
        }
    }

    public static Map<String, Long> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd591f8c7e8e988110f27537ec0a31ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd591f8c7e8e988110f27537ec0a31ea");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ActivityManager activityManager = (ActivityManager) MMPEnvHelper.getContext().getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        linkedHashMap.put("Global.total", Long.valueOf(memoryInfo.totalMem));
        linkedHashMap.put("Global.avail", Long.valueOf(memoryInfo.availMem));
        Debug.MemoryInfo memoryInfo2 = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0];
        linkedHashMap.put("Debug.totalPss", Long.valueOf(memoryInfo2.getTotalPss() * 1024));
        linkedHashMap.put("Debug.dalvikPss", Long.valueOf(memoryInfo2.dalvikPss * 1024));
        linkedHashMap.put("Debug.nativePss", Long.valueOf(memoryInfo2.nativePss * 1024));
        linkedHashMap.put("Debug.otherPss", Long.valueOf(memoryInfo2.otherPss * 1024));
        linkedHashMap.put("Debug.nativePrivateDirty", Long.valueOf(memoryInfo2.nativePrivateDirty * 1024));
        linkedHashMap.put("Debug.otherPrivateDirty", Long.valueOf(memoryInfo2.otherPrivateDirty * 1024));
        return linkedHashMap;
    }

    @SuppressLint({"DefaultLocale"})
    private static String a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce2503c15a916a65c89931de1503b28a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce2503c15a916a65c89931de1503b28a");
        }
        long abs = Math.abs(j);
        return abs > 1073741824 ? String.format("%.3fGB", Double.valueOf(j / 1.073741824E9d)) : abs > 1048576 ? String.format("%.3fMB", Double.valueOf(j / 1048576.0d)) : String.format("%.3fKB", Double.valueOf(j / 1024.0d));
    }
}
