package com.sankuai.android.jarvis;

import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.m;
import java.lang.reflect.Field;
import java.util.concurrent.ScheduledFuture;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class h implements Runnable {
    public static ChangeQuickRedirect a;
    private final Runnable b;
    private final String c;
    private final m.b d;
    private final n e;

    public h(Runnable runnable, String str) {
        this(runnable, str, null);
        Object[] objArr = {runnable, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e08867842f1990f2ba29359cb768d5de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e08867842f1990f2ba29359cb768d5de");
        }
    }

    public h(Runnable runnable, String str, n nVar) {
        this(runnable, str, null, nVar);
        Object[] objArr = {runnable, str, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91018986caeafa2f15837390953c46c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91018986caeafa2f15837390953c46c0");
        }
    }

    public h(Runnable runnable, String str, m.b bVar, n nVar) {
        Object[] objArr = {runnable, str, bVar, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91fc37912be903214b8ece75dd09c4f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91fc37912be903214b8ece75dd09c4f7");
            return;
        }
        this.b = runnable;
        this.c = str;
        this.d = bVar;
        this.e = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "686b99a51719cc1ac86fb2556f2317da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "686b99a51719cc1ac86fb2556f2317da");
            return;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int priority = currentThread.getPriority();
        int threadPriority = Process.getThreadPriority(Process.myTid());
        ScheduledFuture<?> a2 = g.a(120, this.c);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            currentThread.setName(this.c);
            if (f.a().b && Build.VERSION.SDK_INT >= 18) {
                Trace.beginSection(name + "#" + this.c);
            }
            if (this.e != null) {
                Process.setThreadPriority(this.e.e);
            }
            if (this.b != null) {
                this.b.run();
            }
            if (f.a().b && Build.VERSION.SDK_INT >= 18) {
                Trace.endSection();
            }
        } finally {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (a2 != null) {
                a2.cancel(true);
            }
            if (elapsedRealtime2 > 20000) {
                if (f.a().c()) {
                    g.a(this.c, elapsedRealtime2, 3);
                }
                g.a(this.c, elapsedRealtime2);
            }
            a();
            if (this.d != null) {
                this.d.a();
            }
            currentThread.setPriority(priority);
            Process.setThreadPriority(threadPriority);
            currentThread.setName(name);
        }
    }

    private static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8db4fde4d78d5362c57c42b2800f201", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8db4fde4d78d5362c57c42b2800f201");
        } else if (Looper.myLooper() == null || Looper.myLooper() == Looper.getMainLooper()) {
        } else {
            try {
                Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
                declaredField.setAccessible(true);
                ((ThreadLocal) declaredField.get(null)).set(null);
            } catch (Throwable unused) {
            }
        }
    }
}
