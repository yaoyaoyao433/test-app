package com.sankuai.waimai.business.restaurant.poicontainer.utils;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static String a(Intent intent, String str, String str2, String str3) {
        Object[] objArr = {intent, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cfb39dcd5c123a6a9be49f006eb51f88", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cfb39dcd5c123a6a9be49f006eb51f88");
        }
        if (intent == null) {
            return str3;
        }
        if (a(intent, str)) {
            return com.sankuai.waimai.foundation.router.a.a(intent, str, str3);
        }
        return com.sankuai.waimai.platform.utils.f.a(intent, str2, str3);
    }

    public static boolean a(Intent intent, String str, String str2, boolean z) {
        Object[] objArr = {intent, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "34434657d9dae459f4d1ac4dc7552c40", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "34434657d9dae459f4d1ac4dc7552c40")).booleanValue();
        }
        if (intent == null) {
            return z;
        }
        if (a(intent, str)) {
            return com.sankuai.waimai.foundation.router.a.a(intent, str, z);
        }
        return com.sankuai.waimai.platform.utils.f.a(intent, str2, z);
    }

    public static int a(Intent intent, String str, String str2, int i) {
        Object[] objArr = {intent, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cea697166ba76783ea3f68353d617cf1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cea697166ba76783ea3f68353d617cf1")).intValue();
        }
        if (intent == null) {
            return i;
        }
        if (a(intent, str)) {
            return com.sankuai.waimai.foundation.router.a.a(intent, str, i);
        }
        return com.sankuai.waimai.platform.utils.f.a(intent, str2, i);
    }

    public static long a(Intent intent, String str, String str2, long j) {
        Object[] objArr = {intent, str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fe98c8691cf6b1f6747bc913b3f9de6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fe98c8691cf6b1f6747bc913b3f9de6")).longValue();
        }
        if (intent == null) {
            return j;
        }
        if (a(intent, str)) {
            return com.sankuai.waimai.foundation.router.a.a(intent, str, j);
        }
        return com.sankuai.waimai.platform.utils.f.a(intent, str2, j);
    }

    public static long a(Intent intent, String str, long j) {
        Uri data;
        Object[] objArr = {intent, str, 0L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f40dc299ee3261a47b02e991433a4fbd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f40dc299ee3261a47b02e991433a4fbd")).longValue();
        }
        if (intent != null && (data = intent.getData()) != null) {
            String queryParameter = data.getQueryParameter(str);
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    return Long.parseLong(queryParameter);
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                }
            }
        }
        return 0L;
    }

    private static boolean a(Intent intent, String str) {
        Uri data;
        Object[] objArr = {intent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb184898000d26bd9e0e5723324fe9b8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb184898000d26bd9e0e5723324fe9b8")).booleanValue() : (!com.sankuai.waimai.foundation.router.a.a(intent) || (data = intent.getData()) == null || TextUtils.isEmpty(data.getQueryParameter(str))) ? false : true;
    }
}
