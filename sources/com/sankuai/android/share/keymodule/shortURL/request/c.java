package com.sankuai.android.share.keymodule.shortURL.request;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10d5f08981fa1df9e52f831a7d1ad8a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10d5f08981fa1df9e52f831a7d1ad8a9");
        } else {
            this.b = new ar.a().a("https://i.meituan.com").a(a.a(context)).a(b.a()).a();
        }
    }

    public static c a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d439735c5579a415544279d59b6c84d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d439735c5579a415544279d59b6c84d3");
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
