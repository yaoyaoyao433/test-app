package com.sankuai.waimai.business.im.common.utils;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class c {
    public static ChangeQuickRedirect a;
    long b;
    boolean c;
    private long d;
    private Handler e;

    public abstract void b();

    public c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d6c4800d08593769f713971bd809286", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d6c4800d08593769f713971bd809286");
            return;
        }
        this.c = false;
        this.e = new Handler() { // from class: com.sankuai.waimai.business.im.common.utils.c.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3dcbde24fbb1bf444890bf0daa5bf83e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3dcbde24fbb1bf444890bf0daa5bf83e");
                    return;
                }
                synchronized (c.this) {
                    if (c.this.c) {
                        return;
                    }
                    long elapsedRealtime = c.this.b - SystemClock.elapsedRealtime();
                    if (elapsedRealtime <= 0) {
                        c.this.b();
                    } else {
                        sendMessageDelayed(obtainMessage(1), elapsedRealtime);
                    }
                }
            }
        };
        this.d = j;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79abac1f980eaaf8ea9d8c284d3e0fb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79abac1f980eaaf8ea9d8c284d3e0fb1");
        } else {
            this.d = j;
        }
    }

    public final synchronized void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79cad987ab83c53f5b644a0a11a6dafe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79cad987ab83c53f5b644a0a11a6dafe");
            return;
        }
        this.c = true;
        this.e.removeMessages(1);
    }

    public final synchronized c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4a1c87369bd2ac512e84f4242411e4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4a1c87369bd2ac512e84f4242411e4e");
        }
        this.c = false;
        if (this.d <= 0) {
            b();
            return this;
        }
        this.b = SystemClock.elapsedRealtime() + this.d;
        this.e.sendMessage(this.e.obtainMessage(1));
        return this;
    }
}
