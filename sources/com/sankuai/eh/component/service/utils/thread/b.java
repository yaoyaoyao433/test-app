package com.sankuai.eh.component.service.utils.thread;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.eh.component.service.utils.thread.a;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b c;
    public ExecutorService b;
    private Handler d;
    private ExecutorService e;
    private ExecutorService f;
    private ExecutorService g;
    private ExecutorService h;
    private ExecutorService i;
    private volatile boolean j;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2fc93acc61f0a13d3cba491b9e15bae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2fc93acc61f0a13d3cba491b9e15bae");
        } else {
            this.j = false;
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d5135980e1278803a139f1af091394f", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d5135980e1278803a139f1af091394f");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b();
                }
            }
        }
        if (!c.j) {
            b bVar = c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "8bd0e6fce006652c9a7520feeba48147", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "8bd0e6fce006652c9a7520feeba48147");
            } else {
                bVar.e = c.a("eh-singleThreadPool");
                bVar.f = c.b("eh-netThreadPool");
                bVar.h = c.b("eh-commonThreadPool");
                bVar.g = c.b("eh-ioThreadPool");
                bVar.d = new Handler(Looper.getMainLooper());
                bVar.b = c.a("eh-temp-one");
                bVar.i = c.a("eh-temp-two");
                bVar.j = true;
            }
        }
        return c;
    }

    public final void a(a.InterfaceC0552a interfaceC0552a) {
        Object[] objArr = {interfaceC0552a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ea41bedfc30bcf3d69ca81a3846223b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ea41bedfc30bcf3d69ca81a3846223b");
        } else {
            a(this.e, interfaceC0552a);
        }
    }

    public final void b(a.InterfaceC0552a interfaceC0552a) {
        Object[] objArr = {interfaceC0552a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04f3e1de78382e59f5f1b59e1c6f0f16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04f3e1de78382e59f5f1b59e1c6f0f16");
        } else {
            a(this.f, interfaceC0552a);
        }
    }

    public final void c(a.InterfaceC0552a interfaceC0552a) {
        Object[] objArr = {interfaceC0552a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57b44e3f4e79b4df92a1be9be51f13a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57b44e3f4e79b4df92a1be9be51f13a2");
        } else {
            a(this.h, interfaceC0552a);
        }
    }

    public final void d(a.InterfaceC0552a interfaceC0552a) {
        Object[] objArr = {interfaceC0552a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93521fd220967bfc8888717d823e842a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93521fd220967bfc8888717d823e842a");
        } else {
            a(this.g, interfaceC0552a);
        }
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4821ff094bce845d91d6efac33bd16a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4821ff094bce845d91d6efac33bd16a4");
        } else {
            this.d.post(runnable);
        }
    }

    public final void a(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8547caaa5f4e6d1cba6903af0dd03b3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8547caaa5f4e6d1cba6903af0dd03b3f");
        } else {
            this.d.postDelayed(runnable, j);
        }
    }

    public final void e(a.InterfaceC0552a interfaceC0552a) {
        Object[] objArr = {interfaceC0552a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af2dee57af540d3db387dae8bb69c345", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af2dee57af540d3db387dae8bb69c345");
        } else {
            a(this.i, interfaceC0552a);
        }
    }

    public void a(ExecutorService executorService, a.InterfaceC0552a interfaceC0552a) {
        Object[] objArr = {executorService, interfaceC0552a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81fa7b2fe77b76c64c7f16022c423ba8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81fa7b2fe77b76c64c7f16022c423ba8");
        } else if (!this.j || executorService == null || executorService.isShutdown()) {
        } else {
            try {
                executorService.execute(new a(interfaceC0552a));
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
            }
        }
    }
}
