package com.meituan.msc.modules.reporter.memory;

import android.os.Build;
import android.os.Debug;
import android.support.annotation.UiThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static final d d = new d();
    @Deprecated
    private static long i;
    public final List<a> b;
    public boolean c;
    private final ExecutorService e;
    private int f;
    private long g;
    private final Runnable h;

    public static /* synthetic */ int a(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "744fab09becbd31471d67b9d371d7223", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "744fab09becbd31471d67b9d371d7223")).intValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        int intValue = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9bafb975fa731ee859f61a32973d9b3d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9bafb975fa731ee859f61a32973d9b3d")).intValue() : (int) (Debug.getPss() / 1024);
        com.meituan.msc.modules.reporter.g.b("MemoryMonitor", "Get process memory size: ", Integer.valueOf(intValue));
        dVar.f = intValue;
        if (dVar.c) {
            for (a aVar : dVar.b) {
                aVar.a(intValue);
            }
        }
        return intValue;
    }

    public static /* synthetic */ void c(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "bd7ae8576341469f99abad11dd2722de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "bd7ae8576341469f99abad11dd2722de");
            return;
        }
        com.meituan.msc.common.executor.a.f(dVar.h);
        com.meituan.msc.common.executor.a.b(dVar.h, 1000L);
    }

    public static d a() {
        return d;
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caff19bf7b2580cae8cf0e1022fc8b83", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caff19bf7b2580cae8cf0e1022fc8b83");
            return;
        }
        this.e = com.sankuai.android.jarvis.c.a("MSC-MemoryMonitor", 0, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.b = new CopyOnWriteArrayList();
        this.c = false;
        this.f = -1;
        this.g = -1L;
        this.h = new Runnable() { // from class: com.meituan.msc.modules.reporter.memory.d.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            @UiThread
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "155be6a179d1af0d15ce1dad60a93306", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "155be6a179d1af0d15ce1dad60a93306");
                } else {
                    d.this.a((com.meituan.msc.common.support.java.util.concurrent.a<Integer>) null);
                }
            }
        };
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77c964cd98d091a2c683efc3edcedd77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77c964cd98d091a2c683efc3edcedd77");
            return;
        }
        this.b.remove(aVar);
        if (this.b.isEmpty()) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0688266dc2429d31f9214ee043007167", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0688266dc2429d31f9214ee043007167");
            } else if (this.c) {
                com.meituan.msc.common.executor.a.f(this.h);
                this.c = false;
            }
        }
    }

    public void a(final com.meituan.msc.common.support.java.util.concurrent.a<Integer> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96987ad642b5668984a40eb283bcb9e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96987ad642b5668984a40eb283bcb9e3");
            return;
        }
        com.meituan.msc.common.executor.a.f(this.h);
        this.e.submit(new Runnable() { // from class: com.meituan.msc.modules.reporter.memory.d.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e56ddfe078fcb92ba77eb0bc92b516a4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e56ddfe078fcb92ba77eb0bc92b516a4");
                    return;
                }
                int a2 = d.a(d.this);
                if (aVar != null) {
                    aVar.d((com.meituan.msc.common.support.java.util.concurrent.a) Integer.valueOf(a2));
                }
                if (d.this.c) {
                    d.c(d.this);
                }
            }
        });
    }

    public final com.meituan.msc.common.support.java.util.concurrent.a<Integer> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ee4ec97535d57efc92f54e3304b87cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ee4ec97535d57efc92f54e3304b87cf");
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.meituan.msc.common.support.java.util.concurrent.a<Integer> aVar = new com.meituan.msc.common.support.java.util.concurrent.a<>();
        if (currentTimeMillis - this.g < 5) {
            aVar.d((com.meituan.msc.common.support.java.util.concurrent.a<Integer>) Integer.valueOf(this.f));
            com.meituan.msc.modules.reporter.g.b("MemoryMonitor", "调用速度过快");
        } else {
            a(aVar);
            this.g = currentTimeMillis;
        }
        return aVar;
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff23dff081d400c7f32ebf8a4ee8f77b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff23dff081d400c7f32ebf8a4ee8f77b");
        } else if (Build.VERSION.SDK_INT >= 23) {
            try {
                i = Long.parseLong(Debug.getRuntimeStat("art.gc.gc-time"));
            } catch (Throwable th) {
                com.meituan.msc.modules.reporter.g.a("MemoryMonitor", th);
            }
        }
    }

    public static long d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2849e2a984d4cd649e00a7ac4de33bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2849e2a984d4cd649e00a7ac4de33bb")).longValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                return Math.max(0L, Long.parseLong(Debug.getRuntimeStat("art.gc.gc-time")) - i);
            } catch (Throwable th) {
                com.meituan.msc.modules.reporter.g.a("MemoryMonitor", th);
            }
        }
        return 0L;
    }
}
