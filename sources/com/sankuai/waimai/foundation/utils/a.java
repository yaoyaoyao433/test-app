package com.sankuai.waimai.foundation.utils;

import android.content.Context;
import android.provider.Settings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "85936467381ad6cb621b5ebe996d6b42", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "85936467381ad6cb621b5ebe996d6b42")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            return Settings.Secure.getInt(context.getApplicationContext().getContentResolver(), "accessibility_enabled") == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f643a11e89f12511871ccd8bcd0081ec", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f643a11e89f12511871ccd8bcd0081ec")).booleanValue() : context != null && com.sankuai.meituan.takeoutnew.util.aop.f.a(context.getPackageManager(), "android.permission.VIBRATE", context.getPackageName()) == 0;
    }
}
