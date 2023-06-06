package com.meituan.android.yoda.util;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        return Build.VERSION.SDK_INT < 22;
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab1a7c5133e5292760f169546adf53d7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab1a7c5133e5292760f169546adf53d7")).booleanValue();
        }
        String str = Build.MODEL;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equalsIgnoreCase("RLI-AN00") || str.equalsIgnoreCase("RLI-N29") || str.equalsIgnoreCase("TAH-AN00") || str.equalsIgnoreCase("TAH-N29") || str.equalsIgnoreCase("TAH-AN00m") || str.equalsIgnoreCase("RHA-AN00m");
    }
}
