package com.meituan.msc.modules.page.render.rn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;
    private static final LinkedHashMap<Long, String> d = new LinkedHashMap<>();
    final ScheduledExecutorService b;
    ScheduledFuture<?> c;
    private final int e;
    private final int f;
    private final Thread g;

    public static /* synthetic */ void a(i iVar) {
        StackTraceElement[] stackTrace;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, iVar, changeQuickRedirect, false, "3b82b747fe4fe0741f468d5b31b43deb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, iVar, changeQuickRedirect, false, "3b82b747fe4fe0741f468d5b31b43deb");
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (StackTraceElement stackTraceElement : iVar.g.getStackTrace()) {
            if (i < iVar.f) {
                i++;
                sb.append(stackTraceElement.toString());
                sb.append(com.meituan.msc.modules.page.render.rn.lag.d.b);
            }
        }
        synchronized (d) {
            if (d.size() == iVar.e && iVar.e > 0) {
                LinkedHashMap<Long, String> linkedHashMap = d;
                linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
            }
            d.put(Long.valueOf(System.currentTimeMillis()), sb.toString());
        }
    }

    public i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94ae648e903cb732d1ed2185ef8a82e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94ae648e903cb732d1ed2185ef8a82e1");
            return;
        }
        this.e = MSCFpsHornConfig.d().l();
        this.f = MSCFpsHornConfig.d().m();
        this.b = com.sankuai.android.jarvis.c.c("MSCStackSampler");
        this.g = Thread.currentThread();
    }

    public final ArrayList<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c250433c291c99ad0ec0349fcec3530a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c250433c291c99ad0ec0349fcec3530a");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        synchronized (d) {
            for (Long l : d.keySet()) {
                arrayList.add(com.meituan.msc.modules.page.render.rn.lag.d.b + "unixTs:" + l + com.meituan.msc.modules.page.render.rn.lag.d.b + d.get(l));
            }
        }
        return arrayList;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1138818c00f2db931f7ce4a1849af6ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1138818c00f2db931f7ce4a1849af6ab");
        } else if (this.c != null) {
            this.c.cancel(true);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2e8107bc2d714dbdc24ff8a3ba516c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2e8107bc2d714dbdc24ff8a3ba516c2");
            return;
        }
        b();
        this.b.shutdown();
    }
}
