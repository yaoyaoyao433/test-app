package com.sankuai.meituan.skyeye.library.core;

import android.os.Handler;
import android.os.HandlerThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class g {
    public static ChangeQuickRedirect a;
    private static volatile a b;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31469c64ca8878ae0447231195a4fcf0", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31469c64ca8878ae0447231195a4fcf0");
        }
        if (b == null) {
            synchronized (g.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        if (!b.e && b.f) {
            a aVar = b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.b;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "c3e6015345e82a4907b5b8b65c52388c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "c3e6015345e82a4907b5b8b65c52388c");
            } else {
                aVar.d = new Handler(aVar.c.getLooper());
                aVar.e = true;
            }
        }
        return b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a extends g {
        public static ChangeQuickRedirect b;
        HandlerThread c;
        Handler d;
        public volatile boolean e;
        public boolean f;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02e93b3ba83864ee06fc39695d100707", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02e93b3ba83864ee06fc39695d100707");
                return;
            }
            this.f = false;
            this.e = false;
        }

        public final void a(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e79792f898a557caa3b8292af8ee76eb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e79792f898a557caa3b8292af8ee76eb");
            } else if (this.d != null) {
                this.d.post(runnable);
            }
        }
    }
}
