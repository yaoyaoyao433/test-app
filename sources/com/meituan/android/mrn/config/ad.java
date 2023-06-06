package com.meituan.android.mrn.config;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ad {
    public static ChangeQuickRedirect a;

    public static a.InterfaceC0637a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3007a2f5907ab45e169dc1e68c9e57a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3007a2f5907ab45e169dc1e68c9e57a3");
        }
        if (y.a().e == null) {
            return z.a().a(context);
        }
        return y.a().e;
    }
}
