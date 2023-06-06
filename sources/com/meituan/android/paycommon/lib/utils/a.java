package com.meituan.android.paycommon.lib.utils;

import android.app.Activity;
import com.meituan.android.paybase.activity.BaseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48b2641680681749e1ef246e485da25e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48b2641680681749e1ef246e485da25e")).booleanValue() : activity == null || activity.isFinishing() || ((activity instanceof BaseActivity) && ((BaseActivity) activity).m());
    }
}
