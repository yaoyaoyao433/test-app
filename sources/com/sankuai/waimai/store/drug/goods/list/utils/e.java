package com.sankuai.waimai.store.drug.goods.list.utils;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.aa;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static String a(Intent intent, String str, String str2, String str3) {
        Object[] objArr = {intent, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ee42779e6d3d1d2356a0f435439756f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ee42779e6d3d1d2356a0f435439756f");
        }
        if (intent == null) {
            return str3;
        }
        if (a(intent, str)) {
            return com.sankuai.waimai.store.router.d.a(intent, str, str3);
        }
        return aa.a(intent, str2, str3);
    }

    public static int a(Intent intent, String str, String str2, int i) {
        Object[] objArr = {intent, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8bf0a1c491fa1212feb40e116ee5f59d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8bf0a1c491fa1212feb40e116ee5f59d")).intValue();
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53b76c7bc71665efecf253ba376e0788", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53b76c7bc71665efecf253ba376e0788")).longValue();
        }
        if (intent == null) {
            return j;
        }
        if (a(intent, str)) {
            return com.sankuai.waimai.store.router.d.a(intent, str, j);
        }
        return aa.a(intent, str2, j);
    }

    public static boolean a(Intent intent, String str) {
        Uri data;
        Object[] objArr = {intent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ecd525954d075951d93714f9474283d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ecd525954d075951d93714f9474283d")).booleanValue() : (!com.sankuai.waimai.store.router.d.a(intent) || (data = intent.getData()) == null || TextUtils.isEmpty(data.getQueryParameter(str))) ? false : true;
    }
}
