package com.sankuai.meituan.so.loader;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;

    public static void b(String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "0a3bfc8a8d3fa1ac102c0b9fe77cea1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "0a3bfc8a8d3fa1ac102c0b9fe77cea1d");
        }
    }

    public static void a(String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "7f564e987b8d8491aebc8aa7d89b895b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "7f564e987b8d8491aebc8aa7d89b895b");
        } else if (b) {
            if (objArr.length != 0) {
                str2 = String.format(str2, objArr);
            }
            Log.e(str, str2);
        }
    }
}
