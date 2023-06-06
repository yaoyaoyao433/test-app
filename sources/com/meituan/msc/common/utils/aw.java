package com.meituan.msc.common.utils;

import android.app.Activity;
import com.meituan.msc.modules.devtools.DebugHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class aw {
    public static ChangeQuickRedirect a;

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "60995d2bda746a2bb4266a3eacc57b6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "60995d2bda746a2bb4266a3eacc57b6e");
            return;
        }
        a(-1, 2, str);
        com.meituan.msc.modules.reporter.g.b("toast", str);
    }

    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "188884c34b3e2e00c3d3401bfb29d8d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "188884c34b3e2e00c3d3401bfb29d8d9");
            return;
        }
        if (DebugHelper.a()) {
            a(-1, 1, str);
        }
        com.meituan.msc.modules.reporter.g.d("toastIfDebug", str);
    }

    public static void a(final int i, final int i2, final String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d60f741c8f8839ae60f6f4c7cba28b79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d60f741c8f8839ae60f6f4c7cba28b79");
        } else {
            com.meituan.msc.common.executor.a.c(new Runnable() { // from class: com.meituan.msc.common.utils.aw.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48ed9ec6f1a4768f037d23c78482379e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48ed9ec6f1a4768f037d23c78482379e");
                        return;
                    }
                    Activity b = com.meituan.msc.modules.container.a.b.b();
                    if (b == null) {
                        return;
                    }
                    com.sankuai.meituan.android.ui.widget.a.a(b, str, i).e(81).a(i2).a();
                }
            });
        }
    }
}
