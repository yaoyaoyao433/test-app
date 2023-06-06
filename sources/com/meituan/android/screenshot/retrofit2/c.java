package com.meituan.android.screenshot.retrofit2;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static volatile c c;
    public ar b;

    private c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb4aa613f55cd3596ac2536e35d0efd3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb4aa613f55cd3596ac2536e35d0efd3");
        } else {
            this.b = new ar.a().a("https://i.meituan.com").a(a.a(context)).a(b.a()).a();
        }
    }

    public static c a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "701968149cd8a03ad212a1c7eefda63a", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "701968149cd8a03ad212a1c7eefda63a");
        }
        if (c == null) {
            synchronized (c.class) {
                if (c == null) {
                    c = new c(context);
                }
            }
        }
        return c;
    }
}
