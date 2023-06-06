package com.sankuai.waimai.touchmatrix.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"ApplySharedPref"})
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static long a(Context context, String str, long j) {
        Object[] objArr = {context, str, -1L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "062ca030b3a41c762b29561778a3a698", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "062ca030b3a41c762b29561778a3a698")).longValue();
        }
        if (context == null) {
            return -1L;
        }
        try {
            return q.a(context, "t_matrix_sp", 1).b(str, -1L);
        } catch (ClassCastException unused) {
            return -1L;
        }
    }

    public static boolean a(Context context, String str, boolean z) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5225c947ad31f8f6622f8c52a4c585b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5225c947ad31f8f6622f8c52a4c585b")).booleanValue();
        }
        if (context == null) {
            return z;
        }
        try {
            return q.a(context, "t_matrix_sp", 1).b(str, z);
        } catch (ClassCastException unused) {
            return z;
        }
    }

    public static int a(Context context, String str, int i) {
        Object[] objArr = {context, str, -1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "213a0766d55fcb1352c0efd1353cd728", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "213a0766d55fcb1352c0efd1353cd728")).intValue();
        }
        if (context == null) {
            return -1;
        }
        try {
            return q.a(context, "t_matrix_sp", 1).b(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }
}
