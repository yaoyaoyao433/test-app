package com.meituan.mmp.lib.utils.permission;

import android.text.TextUtils;
import com.meituan.mmp.lib.utils.as;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends a {
    public static ChangeQuickRedirect b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e81fcd2a8cd58e2392297f83b30ecfc0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e81fcd2a8cd58e2392297f83b30ecfc0")).doubleValue();
        }
        try {
            String f = as.f();
            if (TextUtils.isEmpty(f)) {
                return 4.0d;
            }
            return Double.parseDouble(f.substring(f.indexOf(CommonConstant.Symbol.UNDERLINE) + 1));
        } catch (Exception unused) {
            return 4.0d;
        }
    }
}
