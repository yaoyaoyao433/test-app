package com.meituan.android.mrn.component.map.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect a;
    CopyOnWriteArraySet<com.meituan.android.mrn.component.map.view.childview.f> b;
    public Runnable c;
    public volatile ScheduledExecutorService d;
    public volatile ScheduledFuture e;
    private final long f;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50763f4c319106577f30144dd2f4d57c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50763f4c319106577f30144dd2f4d57c");
            return;
        }
        this.b = new CopyOnWriteArraySet<>();
        this.f = 40L;
        ScheduledExecutorService c = com.sankuai.android.jarvis.c.c("trackViewChanges");
        Runnable runnable = new Runnable() { // from class: com.meituan.android.mrn.component.map.utils.g.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1758b5668a5cf41d0b00719362da155f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1758b5668a5cf41d0b00719362da155f");
                } else if (g.this.b.isEmpty()) {
                } else {
                    Iterator<com.meituan.android.mrn.component.map.view.childview.f> it = g.this.b.iterator();
                    while (it.hasNext()) {
                        com.meituan.android.mrn.component.map.view.childview.f next = it.next();
                        if (next != null) {
                            next.b();
                        }
                    }
                }
            }
        };
        this.e = c.scheduleAtFixedRate(runnable, 0L, 25L, TimeUnit.MILLISECONDS);
        this.c = runnable;
        this.d = c;
    }

    public final void a(com.meituan.android.mrn.component.map.view.childview.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bab8c984dc65d86324b17797c2b8091", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bab8c984dc65d86324b17797c2b8091");
        } else {
            this.b.add(fVar);
        }
    }

    public final void b(com.meituan.android.mrn.component.map.view.childview.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb6f97cfa0bd7edef11f2d48f0f21ad1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb6f97cfa0bd7edef11f2d48f0f21ad1");
        } else {
            this.b.remove(fVar);
        }
    }
}
