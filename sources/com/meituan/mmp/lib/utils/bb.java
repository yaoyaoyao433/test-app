package com.meituan.mmp.lib.utils;

import android.app.Activity;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.UnknownFormatConversionException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class bb {
    public static ChangeQuickRedirect a;

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "bbb6c02adff1d221a9ac9e7130c3e46b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "bbb6c02adff1d221a9ac9e7130c3e46b");
            return;
        }
        a(-1, 2, str);
        com.meituan.mmp.lib.trace.b.b("toast", str);
    }

    public static void a(String str, int i) {
        Object[] objArr = {str, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7cd8f433e76bfbda754b60344a7e36d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7cd8f433e76bfbda754b60344a7e36d3");
            return;
        }
        a(0, 2, str);
        com.meituan.mmp.lib.trace.b.b("toastWithDuration", str);
    }

    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "4ae770f8d90551dd0e9bfe3b405fdc0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "4ae770f8d90551dd0e9bfe3b405fdc0e");
            return;
        }
        try {
            if (objArr.length > 0) {
                str = String.format(str, objArr);
            }
        } catch (UnknownFormatConversionException unused) {
            str = str + Arrays.toString(objArr);
        }
        if (DebugHelper.b()) {
            a(-1, 1, str);
        }
        com.meituan.mmp.lib.trace.b.b("toastIfDebug", str);
    }

    private static void a(final int i, final int i2, final String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "271fa722be0d3c96186f60c35c1362f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "271fa722be0d3c96186f60c35c1362f7");
        } else {
            com.meituan.mmp.lib.executor.a.c(new Runnable() { // from class: com.meituan.mmp.lib.utils.bb.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "66d2d73204a20a1d1f2a2192a3b70573", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "66d2d73204a20a1d1f2a2192a3b70573");
                        return;
                    }
                    Activity b = com.meituan.mmp.a.b.b();
                    if (b == null) {
                        return;
                    }
                    com.sankuai.meituan.android.ui.widget.a.a(b, str, i).e(81).a(i2).a();
                }
            });
        }
    }
}
