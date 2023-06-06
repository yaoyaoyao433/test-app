package com.sankuai.meituan.city;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public Handler b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a {
        public static c a = new c();
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "896181778bb8d740f06cd27a3298b3c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "896181778bb8d740f06cd27a3298b3c9");
        } else {
            this.b = new Handler(Looper.getMainLooper());
        }
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d786bf2a8e58ffc9ef77e54425538bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d786bf2a8e58ffc9ef77e54425538bf");
            return;
        }
        if (this.b == null) {
            this.b = new Handler(Looper.getMainLooper());
        }
        this.b.post(runnable);
    }
}
