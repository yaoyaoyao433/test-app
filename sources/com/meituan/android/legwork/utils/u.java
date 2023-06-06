package com.meituan.android.legwork.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class u {
    public static ChangeQuickRedirect a;

    public static long a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a92d2fdae9232494f9e7d7b74d53bb2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a92d2fdae9232494f9e7d7b74d53bb2")).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            x.a(e);
            return 0L;
        }
    }

    public static short b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "725b768b862d321fe893be7b04b4d506", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Short) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "725b768b862d321fe893be7b04b4d506")).shortValue();
        }
        if (TextUtils.isEmpty(str)) {
            return (short) 0;
        }
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException e) {
            x.a(e);
            return (short) 0;
        }
    }
}
