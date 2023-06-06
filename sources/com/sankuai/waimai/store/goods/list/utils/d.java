package com.sankuai.waimai.store.goods.list.utils;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.aa;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static String a(Intent intent, String str, String str2, String str3) {
        Object[] objArr = {intent, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0bb999b6beed3b778dc98cf9db2c291c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0bb999b6beed3b778dc98cf9db2c291c");
        }
        if (intent == null) {
            return str3;
        }
        if (a(intent, str)) {
            return com.sankuai.waimai.store.router.d.a(intent, str, str3);
        }
        return aa.a(intent, str2, str3);
    }

    public static boolean a(Intent intent, String str, String str2, boolean z) {
        Object[] objArr = {intent, str, str2, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbf3e8a06077faa285c6c3abcdffb827", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbf3e8a06077faa285c6c3abcdffb827")).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        if (a(intent, str)) {
            return com.sankuai.waimai.store.router.d.a(intent, str, false);
        }
        return aa.a(intent, str2, false);
    }

    public static int a(Intent intent, String str, String str2, int i) {
        Object[] objArr = {intent, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20aec2813db0d23e74e96024672a5365", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20aec2813db0d23e74e96024672a5365")).intValue();
        }
        if (intent == null) {
            return i;
        }
        if (a(intent, str)) {
            return com.sankuai.waimai.store.router.d.a(intent, str, i);
        }
        return aa.a(intent, str2, i);
    }

    public static long a(Intent intent, String str, String str2, long j) {
        Object[] objArr = {intent, str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8c4e98637ba4acfe79357d25d65bfa9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8c4e98637ba4acfe79357d25d65bfa9")).longValue();
        }
        if (intent == null) {
            return j;
        }
        if (a(intent, str)) {
            return com.sankuai.waimai.store.router.d.a(intent, str, j);
        }
        return aa.a(intent, str2, j);
    }

    private static boolean a(Intent intent, String str) {
        Uri data;
        Object[] objArr = {intent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "239ad50325b29c9f3e8a0b50ebd8db67", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "239ad50325b29c9f3e8a0b50ebd8db67")).booleanValue() : (!com.sankuai.waimai.store.router.d.a(intent) || (data = intent.getData()) == null || TextUtils.isEmpty(data.getQueryParameter(str))) ? false : true;
    }
}
