package com.meituan.android.uptodate.util;

import com.meituan.android.common.babel.Babel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "933790b969f28ab2d2fad39cf1b3aed1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "933790b969f28ab2d2fad39cf1b3aed1");
        }
    }

    public static void a(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8cf21edef0ea2ceb94df2c99381f0358", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8cf21edef0ea2ceb94df2c99381f0358");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Integer.valueOf(i));
        hashMap.put("cause", str);
        hashMap.put("reportType", str2);
        Babel.log("meituan-update", "meituan-update", hashMap);
    }
}
