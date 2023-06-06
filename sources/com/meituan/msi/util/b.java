package com.meituan.msi.util;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static boolean a(PackageManager packageManager, Intent intent) {
        ResolveInfo resolveActivity;
        Object[] objArr = {packageManager, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "832b78042adefe26d4501d1adfad0b50", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "832b78042adefe26d4501d1adfad0b50")).booleanValue() : (packageManager == null || (resolveActivity = packageManager.resolveActivity(intent, 65536)) == null || resolveActivity.activityInfo == null) ? false : true;
    }
}
