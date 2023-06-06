package com.meituan.android.common.badge.util;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.f;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class PermissionUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean isPermissionGranted(String str, Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9e2329d6881d8c525a56da5b0d00f3fc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9e2329d6881d8c525a56da5b0d00f3fc")).booleanValue() : f.a(context.getPackageManager(), str, context.getPackageName()) == 0;
    }
}
