package com.meituan.android.paybase.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class aj {
    public static ChangeQuickRedirect a;

    public static int a(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbfa2e5cf4f01c77ede8ee7cc52e3a50", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbfa2e5cf4f01c77ede8ee7cc52e3a50")).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
