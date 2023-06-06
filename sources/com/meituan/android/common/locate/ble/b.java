package com.meituan.android.common.locate.ble;

import android.os.Looper;
import android.os.Process;
import android.support.annotation.RequiresApi;
import android.support.annotation.WorkerThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class b extends Thread {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int a;
    public int b;
    public Looper c;

    public b(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33da7542245030eb4ba933b68d7638c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33da7542245030eb4ba933b68d7638c7");
            return;
        }
        this.b = -1;
        this.a = 0;
    }

    public void a() {
    }

    public Looper b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f61e009d80b44fc0948e2f2f4006e5d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Looper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f61e009d80b44fc0948e2f2f4006e5d9");
        }
        if (isAlive()) {
            synchronized (this) {
                while (isAlive() && this.c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
            return this.c;
        }
        return null;
    }

    @RequiresApi(api = 18)
    public boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a745dff87737fa25e5d850a93aff7c0d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a745dff87737fa25e5d850a93aff7c0d")).booleanValue();
        }
        Looper b = b();
        if (b != null) {
            b.quitSafely();
            return true;
        }
        return false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    @WorkerThread
    public void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6838cbc420c6cb43a245102180bd98f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6838cbc420c6cb43a245102180bd98f");
            return;
        }
        this.b = Process.myTid();
        Looper.prepare();
        synchronized (this) {
            this.c = Looper.myLooper();
            notifyAll();
        }
        Process.setThreadPriority(this.a);
        a();
        Looper.loop();
        this.b = -1;
    }
}
