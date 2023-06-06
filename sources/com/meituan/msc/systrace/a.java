package com.meituan.msc.systrace;

import android.os.Build;
import android.os.Trace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(long j, String str) {
        Object[] objArr = {0L, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66f2942cb751d9f3756dc98e5b8c7657", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66f2942cb751d9f3756dc98e5b8c7657");
        } else if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a(long j) {
        Object[] objArr = {0L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "232dcd622f9bd46357971f1b933e82a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "232dcd622f9bd46357971f1b933e82a1");
        } else if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
