package com.meituan.android.mrn.config;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class w {
    public static ChangeQuickRedirect a;

    public static com.dianping.dataservice.mapi.g a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ad7703852150f9d67616fe4166ec93e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.dataservice.mapi.g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ad7703852150f9d67616fe4166ec93e");
        }
        if (y.a().h == null) {
            return z.a().b(context);
        }
        return y.a().h;
    }
}
