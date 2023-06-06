package com.sankuai.android.jarvis;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.Thread;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class o extends Thread {
    public static ChangeQuickRedirect a;
    private boolean b;
    private volatile Thread c;
    private Thread.State d;

    public o(Runnable runnable, String str) {
        super(new h(runnable, str));
        Object[] objArr = {runnable, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7877c52843d72b27cd66fc177ef4de2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7877c52843d72b27cd66fc177ef4de2");
        } else {
            this.d = Thread.State.NEW;
        }
    }

    @Override // java.lang.Thread
    public final synchronized void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cca2ec4acadbb2c4dfde22609480ad7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cca2ec4acadbb2c4dfde22609480ad7a");
        } else if (this.d != Thread.State.NEW) {
        } else {
            this.d = Thread.State.RUNNABLE;
            f.a().e().execute(this);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bd6409a7c4794b0bdf85c78129e1785", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bd6409a7c4794b0bdf85c78129e1785");
        } else if (isInterrupted()) {
        } else {
            this.c = Thread.currentThread();
            super.run();
            this.c = null;
            this.d = Thread.State.TERMINATED;
        }
    }

    @Override // java.lang.Thread
    public final Thread.State getState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b110e0409f5f9cd5184ba93d501d82d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Thread.State) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b110e0409f5f9cd5184ba93d501d82d0");
        }
        Thread thread = this.c;
        if (thread == null) {
            return this.d;
        }
        return thread.getState();
    }

    @Override // java.lang.Thread
    public final void interrupt() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b07799b65b3a1b7b06b4e983143934c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b07799b65b3a1b7b06b4e983143934c4");
            return;
        }
        this.b = true;
        Thread thread = this.c;
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Thread
    public final boolean isInterrupted() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a72ea118c1a045d7d600bbf379fd0987", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a72ea118c1a045d7d600bbf379fd0987")).booleanValue();
        }
        Thread thread = this.c;
        if (thread != null) {
            return thread.isInterrupted();
        }
        return this.b;
    }
}
