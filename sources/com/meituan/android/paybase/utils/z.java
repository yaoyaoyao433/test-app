package com.meituan.android.paybase.utils;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class z {
    public static ChangeQuickRedirect a;

    private static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14c05707d9b55492abb3f50d3e6bf6f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14c05707d9b55492abb3f50d3e6bf6f0")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Build.DEVICE.toLowerCase().contains(str.toLowerCase());
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bc4fe43aacb5f9c7827388d54c100c4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bc4fe43aacb5f9c7827388d54c100c4")).booleanValue() : a("ABR-Al00") || a("JAD-AL50") || a("TET-AN00") || a("JAD-AL00");
    }
}
