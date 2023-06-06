package com.meituan.android.common.locate.fusionlocation.controller;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import com.meituan.android.common.locate.locator.SystemLocator;
import com.meituan.android.common.locate.platform.logs.c;
import com.meituan.android.common.locate.provider.g;
import com.meituan.android.common.locate.provider.i;
import com.meituan.android.common.locate.reporter.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class a {
    private static a a;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean b;
    private Handler c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12b8ce4d734d6fcb709a0e99ce500caf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12b8ce4d734d6fcb709a0e99ce500caf");
        } else {
            this.c = new Handler(Looper.getMainLooper()) { // from class: com.meituan.android.common.locate.fusionlocation.controller.a.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.os.Handler
                public void handleMessage(@NonNull Message message) {
                    Object[] objArr2 = {message};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e8f7fc576323b5ff3c2080c1061bfcd4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e8f7fc576323b5ff3c2080c1061bfcd4");
                        return;
                    }
                    super.handleMessage(message);
                    SystemLocator systemLocator = SystemLocator.getInstance();
                    if (systemLocator == null || !systemLocator.isGpsRunning()) {
                        return;
                    }
                    systemLocator.stopGnnsEventListen();
                }
            };
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7f63a981bad6a2264126bf5662db05d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7f63a981bad6a2264126bf5662db05d0");
        }
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    public synchronized void a(boolean z) {
        int i = 1;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c20ab2c7f326889b698cbab7bef42e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c20ab2c7f326889b698cbab7bef42e6");
            return;
        }
        SystemLocator systemLocator = SystemLocator.getInstance();
        if (systemLocator != null && systemLocator.isGpsRunning()) {
            if (z && !this.b) {
                systemLocator.startGnnsEventListen();
            } else if (!z && this.b) {
                systemLocator.stopGnnsEventListen();
                i = 2;
            }
            c.a("fusion::setGpsListenerState isRunStartState:" + i + " isOpen:" + z);
        }
        i = 0;
        c.a("fusion::setGpsListenerState isRunStartState:" + i + " isOpen:" + z);
    }

    public synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9edd7828abd71ec8f14dc782d62f41e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9edd7828abd71ec8f14dc782d62f41e");
            return;
        }
        this.b = false;
        this.c.removeMessages(1);
        c.a("fusion::stopGnnsEventListen");
        i.a(g.a()).b();
    }

    public synchronized void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad989be6eaceb86115d1b90f17b98449", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad989be6eaceb86115d1b90f17b98449");
        } else if (this.b && this.c.hasMessages(1)) {
        } else {
            i.a(g.a()).a();
            c.a("fusion::startGnnsEventListen");
            this.b = true;
            this.c.removeMessages(1);
            this.c.sendEmptyMessageDelayed(1, h.a(g.a()).c());
        }
    }

    public boolean d() {
        return this.b;
    }
}
