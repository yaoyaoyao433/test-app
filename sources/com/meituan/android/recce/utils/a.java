package com.meituan.android.recce.utils;

import android.content.Context;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf4a7f741c7926674de61ed47af31e33", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf4a7f741c7926674de61ed47af31e33")).booleanValue();
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                if (!context.getPackageName().contains(KernelConfig.KERNEL_TYPE_RECCE)) {
                    if (context.getPackageName().contains("paydemo")) {
                    }
                }
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
