package com.meituan.android.common.weaver.impl.blank;

import android.os.Looper;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AutoLooper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private CountDownLatch latch;
    @GuardedBy("this")
    private Looper looper;
    private final Runnable mkLooper;
    private int ref;
    private final ScheduledExecutorService scheduledExecutorService;

    public AutoLooper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85ccaf5ff20e2ea79c6beee6c8e3d698", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85ccaf5ff20e2ea79c6beee6c8e3d698");
            return;
        }
        this.scheduledExecutorService = c.c("weaver-looper");
        this.mkLooper = new Runnable() { // from class: com.meituan.android.common.weaver.impl.blank.AutoLooper.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "84e9cfef37a8c19ac19dedddb310cb65", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "84e9cfef37a8c19ac19dedddb310cb65");
                    return;
                }
                if (Looper.myLooper() == null) {
                    Looper.prepare();
                }
                AutoLooper.this.looper = Looper.myLooper();
                AutoLooper.this.latch.countDown();
                Looper.loop();
            }
        };
    }

    @NonNull
    public synchronized Looper acquireLooper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd482e7cc5d090858bdca3255393da5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Looper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd482e7cc5d090858bdca3255393da5b");
        }
        if (this.looper == null) {
            this.latch = new CountDownLatch(1);
            this.ref = 0;
            c.a("weaver-loop", this.mkLooper).start();
            while (this.looper == null) {
                try {
                    this.latch.await();
                    break;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        this.ref++;
        return this.looper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void releaseLooperInner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94b2a8a787284e2ef5b7f414301e1628", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94b2a8a787284e2ef5b7f414301e1628");
            return;
        }
        this.ref--;
        if (this.ref < 0) {
            this.ref = 0;
        }
        if (this.ref == 0 && this.looper != null) {
            this.looper.quit();
            this.latch = null;
            this.looper = null;
        }
    }

    public void releaseLooper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b7dab2b75a80f96a8ccf2c334d0f9aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b7dab2b75a80f96a8ccf2c334d0f9aa");
        } else {
            this.scheduledExecutorService.schedule(new Runnable() { // from class: com.meituan.android.common.weaver.impl.blank.AutoLooper.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "739691e511b04895025a9b380b197e64", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "739691e511b04895025a9b380b197e64");
                    } else {
                        AutoLooper.this.releaseLooperInner();
                    }
                }
            }, 5L, TimeUnit.SECONDS);
        }
    }
}
