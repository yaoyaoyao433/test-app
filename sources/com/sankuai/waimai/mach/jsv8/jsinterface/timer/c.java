package com.sankuai.waimai.mach.jsv8.jsinterface.timer;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.mach.lifecycle.d implements com.sankuai.waimai.mach.lifecycle.a {
    public static ChangeQuickRedirect a;
    private static Handler i = new Handler(Looper.getMainLooper());
    a b;
    public Mach c;
    private long d;
    private long e;
    private final ScheduledExecutorService f;
    private ScheduledFuture<?> g;
    private ScheduledFuture<?> h;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    public c(Mach mach, long j, long j2) {
        Object[] objArr = {mach, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e759138b0240ef09acb08df1f7eab4e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e759138b0240ef09acb08df1f7eab4e");
            return;
        }
        this.f = com.sankuai.android.jarvis.c.c("machTimer");
        this.d = j;
        this.e = j2;
        this.c = mach;
        if (mach != null) {
            mach.registerLifecycleObserver(this);
        }
        com.sankuai.waimai.mach.lifecycle.e.a().a(this);
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b2bdf59af19a6462705ef3e41687869", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b2bdf59af19a6462705ef3e41687869");
            return;
        }
        synchronized (this) {
            if (this.e != 0) {
                this.g = this.f.scheduleAtFixedRate(new Runnable() { // from class: com.sankuai.waimai.mach.jsv8.jsinterface.timer.c.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8b8489f52ad1fb3b329ca26b3121393b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8b8489f52ad1fb3b329ca26b3121393b");
                        } else {
                            c.this.b.a();
                        }
                    }
                }, this.d, this.e, TimeUnit.MILLISECONDS);
            } else if (this.h == null) {
                this.h = this.f.schedule(new Runnable() { // from class: com.sankuai.waimai.mach.jsv8.jsinterface.timer.c.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e9a4778e24825798d4ca233e88f135e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e9a4778e24825798d4ca233e88f135e");
                        } else {
                            c.this.b.a();
                        }
                    }
                }, this.d, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8400a5bddbe89caf3602309a2c35b7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8400a5bddbe89caf3602309a2c35b7c");
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            i.post(new Runnable() { // from class: com.sankuai.waimai.mach.jsv8.jsinterface.timer.c.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af35056a82ad4249f7d3bf5a4f060c35", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af35056a82ad4249f7d3bf5a4f060c35");
                    } else {
                        c.this.e();
                    }
                }
            });
        } else {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ef46bd8f75700326e615a6e7cfef8bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ef46bd8f75700326e615a6e7cfef8bb");
            return;
        }
        if (this.c != null) {
            this.c.unregisterLifecycleObserver(this);
            this.c = null;
        }
        com.sankuai.waimai.mach.lifecycle.e.a().b(this);
        if (this.g != null) {
            this.g.cancel(true);
        }
        if (this.h != null) {
            this.h.cancel(true);
        }
        if (this.f != null) {
            this.f.shutdown();
        }
        this.b = null;
    }

    @Override // com.sankuai.waimai.mach.lifecycle.d, com.sankuai.waimai.mach.lifecycle.b
    public final void onActivityDestroyed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c34cb955db1a703200e806001ce33fae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c34cb955db1a703200e806001ce33fae");
            return;
        }
        super.onActivityDestroyed();
        d();
    }

    @Override // com.sankuai.waimai.mach.lifecycle.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcef06821c20d7246ff3fe8c6eae66ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcef06821c20d7246ff3fe8c6eae66ae");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fce56f75fa961d7fdb630c9bbc6548eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fce56f75fa961d7fdb630c9bbc6548eb");
            return;
        }
        try {
            c();
        } catch (Exception e) {
            com.sankuai.waimai.mach.log.b.b("Mach定时器恢复失败 message = " + e.getMessage(), new String[0]);
        }
    }

    @Override // com.sankuai.waimai.mach.lifecycle.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8724a6a0d64c6ef49acabe5ca5f3ec20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8724a6a0d64c6ef49acabe5ca5f3ec20");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70648f07bfd577120bc741e6322b9c8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70648f07bfd577120bc741e6322b9c8d");
            return;
        }
        synchronized (this) {
            if (this.g != null) {
                this.g.cancel(true);
            }
        }
    }
}
