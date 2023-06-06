package com.sankuai.waimai.router.utils;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c {
    public static ChangeQuickRedirect c;
    private final String a;
    private boolean b;

    public abstract void a();

    public c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4f1209200a4dc33ceece65d0a01b928", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4f1209200a4dc33ceece65d0a01b928");
            return;
        }
        this.b = false;
        this.a = str;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5112dc94f52b9ad78e92492797974210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5112dc94f52b9ad78e92492797974210");
        } else {
            c();
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fb3ea2d437a63a4f0ea7d15f44e7e30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fb3ea2d437a63a4f0ea7d15f44e7e30");
        } else if (this.b) {
        } else {
            synchronized (this) {
                if (!this.b) {
                    boolean b = com.sankuai.waimai.router.core.d.b();
                    long uptimeMillis = b ? SystemClock.uptimeMillis() : 0L;
                    a();
                    this.b = true;
                    if (b) {
                        com.sankuai.waimai.router.core.d.a("%s init cost %s ms", this.a, Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                    }
                }
            }
        }
    }
}
