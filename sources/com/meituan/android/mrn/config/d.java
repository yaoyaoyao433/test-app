package com.meituan.android.mrn.config;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static com.meituan.android.mrn.config.city.a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e53806695566c5805cc9bc373d46d1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mrn.config.city.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e53806695566c5805cc9bc373d46d1a");
        }
        if (y.a().g == null) {
            return z.a().c(context);
        }
        return y.a().g;
    }
}
