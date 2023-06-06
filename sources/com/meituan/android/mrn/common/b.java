package com.meituan.android.mrn.common;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "465ad0bbe23436ded6f2bb750bd501c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "465ad0bbe23436ded6f2bb750bd501c7");
        } else if (context == null || TextUtils.isEmpty(str)) {
        } else {
            a(context).a(str, str2);
        }
    }

    public static String b(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f3813359cc59e303ae96bf58b6f47be", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f3813359cc59e303ae96bf58b6f47be") : (context == null || TextUtils.isEmpty(str)) ? str2 : a(context).b(str, str2);
    }

    public static Boolean a(Context context, String str, boolean z) {
        Object[] objArr = {context, str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dae94e7fc98cc2269fa6b881ef031167", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dae94e7fc98cc2269fa6b881ef031167");
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(a(context).b(str, false));
    }

    public static void a(Context context, String str, long j) {
        Object[] objArr = {context, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "296c83753368b0eb50d71adeaa6bf87c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "296c83753368b0eb50d71adeaa6bf87c");
        } else if (context == null || TextUtils.isEmpty(str)) {
        } else {
            a(context).a(str, j);
        }
    }

    public static long b(Context context, String str, long j) {
        Object[] objArr = {context, str, 0L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ab93b3ac5660be79b20d857570e9b39", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ab93b3ac5660be79b20d857570e9b39")).longValue();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return 0L;
        }
        return a(context).b(str, 0L);
    }

    public static q a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a0ca8af345f0010616dadad1b5316b0", RobustBitConfig.DEFAULT_VALUE) ? (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a0ca8af345f0010616dadad1b5316b0") : q.a(context, "mrn_default");
    }
}
