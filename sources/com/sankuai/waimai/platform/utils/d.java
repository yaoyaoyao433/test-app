package com.sankuai.waimai.platform.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(Context context, String str, boolean z) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c774c34d06c941ead76a18513f9f6f52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c774c34d06c941ead76a18513f9f6f52");
        } else {
            com.meituan.android.cipstorage.q.a(context, "waimai_run_env_store", 1).a(str, z);
        }
    }

    public static boolean b(Context context, String str, boolean z) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1ddfc43c005cffb0ab7ad28f6d25a6b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1ddfc43c005cffb0ab7ad28f6d25a6b")).booleanValue() : com.meituan.android.cipstorage.q.a(context, "waimai_run_env_store", 1).b(str, z);
    }

    public static double a(Context context, String str, double d) {
        Object[] objArr = {context, str, Double.valueOf(0.0d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "483859209fb426e04b483fa53d01ace3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "483859209fb426e04b483fa53d01ace3")).doubleValue();
        }
        try {
            return Double.longBitsToDouble(com.meituan.android.cipstorage.q.a(context, "waimai_run_env_store", 1).b(str, Double.doubleToLongBits(0.0d)));
        } catch (ClassCastException unused) {
            return 0.0d;
        }
    }

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ece926b94aa0ed70c123ef8e9d1fae1e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ece926b94aa0ed70c123ef8e9d1fae1e")).booleanValue() : com.sankuai.waimai.foundation.core.a.b() && b(context, "page_block_debug", false);
    }
}
