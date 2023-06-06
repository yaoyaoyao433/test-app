package com.sankuai.xm.threadpool.scheduler;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.android.jarvis.c;
import com.sankuai.xm.threadpool.b;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a extends b {
    public static ChangeQuickRedirect b;
    private static volatile a d;
    private Handler c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf25a563d129920374b02a14d99e89d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf25a563d129920374b02a14d99e89d5");
        } else {
            this.c = new Handler(Looper.getMainLooper());
        }
    }

    public static a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f7f9aebc73442db6b05551682f287523", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f7f9aebc73442db6b05551682f287523");
        }
        if (d == null) {
            synchronized (a.class) {
                if (d == null) {
                    d = new a();
                }
            }
        }
        return d;
    }

    @Override // com.sankuai.xm.threadpool.b
    public final String b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "179bf4ac32055d9e870a84698ef98f61", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "179bf4ac32055d9e870a84698ef98f61") : b(c(i));
    }

    @Override // com.sankuai.xm.threadpool.b
    public final ScheduledExecutorService a(String str, int i, ThreadFactory threadFactory) {
        Object[] objArr = {str, Integer.valueOf(i), threadFactory};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ab8bddf7e7ed5b0ed2382bbe1466e82", 6917529027641081856L)) {
            return (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ab8bddf7e7ed5b0ed2382bbe1466e82");
        }
        String b2 = b(str);
        if (threadFactory == null) {
            return c.b(b2, i);
        }
        return c.b(b2, i, threadFactory);
    }

    @Override // com.sankuai.xm.threadpool.b, com.sankuai.xm.threadpool.a
    public final void a(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56ccee35813e8d27903f3cb754c2400c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56ccee35813e8d27903f3cb754c2400c");
        } else {
            this.c.postDelayed(runnable, j);
        }
    }

    @Override // com.sankuai.xm.threadpool.b
    public final ScheduledExecutorService a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4519256b195ad147448cf90361c2342", 6917529027641081856L) ? (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4519256b195ad147448cf90361c2342") : a("io", 4, (ThreadFactory) null);
    }

    @Override // com.sankuai.xm.threadpool.a
    public final Thread a(String str, Runnable runnable) {
        Object[] objArr = {str, runnable};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "520083ced895028e3159b3b4b97055e5", 6917529027641081856L) ? (Thread) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "520083ced895028e3159b3b4b97055e5") : c.a(a(str), runnable);
    }

    @Override // com.sankuai.xm.threadpool.a
    public final void a(int i) {
        Object[] objArr = {-19};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "962fe21f10e057ad77b2c78379824e66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "962fe21f10e057ad77b2c78379824e66");
        } else {
            Process.setThreadPriority(-19);
        }
    }
}
