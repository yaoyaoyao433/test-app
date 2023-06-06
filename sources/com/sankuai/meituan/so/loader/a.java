package com.sankuai.meituan.so.loader;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String[] a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82ae6440640b9e38b2e41cd56fccd734", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82ae6440640b9e38b2e41cd56fccd734");
        }
        try {
            r3 = Build.VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS : null;
        } catch (Throwable unused) {
        }
        if (r3 != null) {
            if (r3.length <= 0) {
            }
            return r3;
        }
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }
}
