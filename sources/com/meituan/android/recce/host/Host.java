package com.meituan.android.recce.host;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class Host {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void launch(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "800d4c2c939592b7bdda4c98a9154030", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "800d4c2c939592b7bdda4c98a9154030");
        } else {
            HostImplement.launch(context);
        }
    }
}
