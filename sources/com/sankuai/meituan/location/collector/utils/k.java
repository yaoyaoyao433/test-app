package com.sankuai.meituan.location.collector.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes4.dex */
public final class k {
    public static ChangeQuickRedirect a;
    public Runnable b;
    public Runnable c;
    public long d;
    public Handler e;
    public boolean f;
    public long g;
    public long h;
    public boolean i;

    public k() {
        this(Looper.myLooper());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0916bf3dd8fe448172d1fb8839da2349", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0916bf3dd8fe448172d1fb8839da2349");
        }
    }

    private k(Looper looper) {
        Object[] objArr = {looper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04dda8e9979664f70d7a10f126a97e68", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04dda8e9979664f70d7a10f126a97e68");
            return;
        }
        this.f = false;
        this.g = 0L;
        this.h = 0L;
        this.i = false;
        this.e = new Handler(looper) { // from class: com.sankuai.meituan.location.collector.utils.k.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7d7f2f4818e49383ae40450c7c7267a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7d7f2f4818e49383ae40450c7c7267a");
                } else if (message.what != 1) {
                } else {
                    try {
                        k.this.b.run();
                    } catch (Throwable th) {
                        LogUtils.a(th.getMessage());
                    }
                    k kVar = k.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = k.a;
                    if (PatchProxy.isSupport(objArr3, kVar, changeQuickRedirect3, false, "5da5b0692824674576a4e5abc69816ce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, kVar, changeQuickRedirect3, false, "5da5b0692824674576a4e5abc69816ce");
                        return;
                    }
                    if (kVar.f) {
                        kVar.h++;
                        if (kVar.h >= kVar.g) {
                            kVar.a();
                            return;
                        }
                    }
                    if (kVar.i) {
                        kVar.e.sendEmptyMessageDelayed(1, kVar.d);
                    }
                }
            }
        };
    }

    public final k a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d87f61202abaaae458348267cac69e42", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d87f61202abaaae458348267cac69e42");
        }
        this.d = j;
        return this;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dbd2cd01c0d933e2930998edd2af995", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dbd2cd01c0d933e2930998edd2af995");
            return;
        }
        this.i = false;
        this.e.removeMessages(1);
        if (this.c != null) {
            this.c.run();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de50099310651fab35282a2fb0429911", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de50099310651fab35282a2fb0429911");
            return;
        }
        this.i = true;
        if (this.e.hasMessages(1)) {
            this.e.removeMessages(1);
        }
        this.e.sendEmptyMessageDelayed(1, 0L);
    }
}
