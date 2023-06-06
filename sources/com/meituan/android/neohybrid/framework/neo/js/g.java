package com.meituan.android.neohybrid.framework.neo.js;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.dianping.titans.ui.TitansUIManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect a;
    TitansUIManager b;

    public final String a(Context context) {
        PackageInfo packageInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c548fa5677647d7a31934baa0f29aa8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c548fa5677647d7a31934baa0f29aa8a");
        }
        if (context == null) {
            return "";
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "";
    }
}
