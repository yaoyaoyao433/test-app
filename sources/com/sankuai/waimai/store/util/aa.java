package com.sankuai.waimai.store.util;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class aa {
    public static ChangeQuickRedirect a;

    public static long a(Intent intent, String str, long j) {
        Object[] objArr = {intent, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57f6ddc7de78f824b5f4088ac46b4373", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57f6ddc7de78f824b5f4088ac46b4373")).longValue();
        }
        if (intent == null) {
            return j;
        }
        if (com.sankuai.waimai.store.config.k.a()) {
            return com.sankuai.waimai.platform.utils.f.a(intent, str, j);
        }
        try {
            return com.sankuai.waimai.platform.utils.f.a(intent, str, j);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return j;
        }
    }

    public static int a(Intent intent, String str, int i) {
        Object[] objArr = {intent, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48e444cbbf5646cfef9c63eb01665ce9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48e444cbbf5646cfef9c63eb01665ce9")).intValue();
        }
        if (intent == null) {
            return i;
        }
        if (com.sankuai.waimai.store.config.k.a()) {
            return com.sankuai.waimai.platform.utils.f.a(intent, str, i);
        }
        try {
            return com.sankuai.waimai.platform.utils.f.a(intent, str, i);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return i;
        }
    }

    public static String a(Intent intent, String str) {
        Object[] objArr = {intent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb692cef1b81df128a6146a9a5b083e6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb692cef1b81df128a6146a9a5b083e6") : a(intent, str, "");
    }

    public static String a(Intent intent, String str, String str2) {
        Object[] objArr = {intent, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "087749d620e2f35ae5be086980ab0090", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "087749d620e2f35ae5be086980ab0090");
        }
        if (intent == null) {
            return str2;
        }
        if (com.sankuai.waimai.store.config.k.a()) {
            return com.sankuai.waimai.platform.utils.f.a(intent, str);
        }
        try {
            String a2 = com.sankuai.waimai.platform.utils.f.a(intent, str);
            return a2 == null ? str2 : a2;
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return str2;
        }
    }

    public static boolean a(Intent intent, String str, boolean z) {
        Object[] objArr = {intent, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f72b9c49f03abd08053f3fd6ca6dd470", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f72b9c49f03abd08053f3fd6ca6dd470")).booleanValue();
        }
        if (intent == null) {
            return z;
        }
        if (com.sankuai.waimai.store.config.k.a()) {
            return com.sankuai.waimai.platform.utils.f.a(intent, str, z);
        }
        try {
            return com.sankuai.waimai.platform.utils.f.a(intent, str, z);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return z;
        }
    }

    public static <T extends Serializable> T a(Intent intent, String str, T t) {
        Object[] objArr = {intent, str, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "983326ee3201de9688a5827a89293b39", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "983326ee3201de9688a5827a89293b39");
        }
        if (intent == null) {
            return t;
        }
        try {
            return (T) com.sankuai.waimai.platform.utils.f.c(intent, str);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return t;
        }
    }

    public static long b(Intent intent, String str, String str2) {
        Object[] objArr = {intent, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a40b9a3c5212cc4c541c5b5e17db7206", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a40b9a3c5212cc4c541c5b5e17db7206")).longValue() : a(intent, str, str2, -1L);
    }

    public static long a(Intent intent, String str, String str2, long j) {
        Uri data;
        Object[] objArr = {intent, str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "993ea2d3ef2b363956716a4b7e864517", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "993ea2d3ef2b363956716a4b7e864517")).longValue();
        }
        if (intent == null) {
            return j;
        }
        if (str == null) {
            str = "";
        }
        long a2 = com.sankuai.waimai.platform.utils.f.a(intent, str, j);
        if (a2 != j || str2 == null || (data = intent.getData()) == null) {
            return a2;
        }
        String queryParameter = data.getQueryParameter(str2);
        return (TextUtils.isEmpty(queryParameter) || !TextUtils.isDigitsOnly(queryParameter)) ? a2 : com.sankuai.shangou.stone.util.f.a((Object) queryParameter, 0L);
    }

    public static int a(Intent intent, String str, String str2, int i) {
        Uri data;
        Object[] objArr = {intent, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "febd76ae8df421271ffa8b39d81f9bdf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "febd76ae8df421271ffa8b39d81f9bdf")).intValue();
        }
        if (intent == null) {
            return i;
        }
        if (str == null) {
            str = "";
        }
        int a2 = com.sankuai.waimai.platform.utils.f.a(intent, str, i);
        if (a2 != i || str2 == null || (data = intent.getData()) == null) {
            return a2;
        }
        String queryParameter = data.getQueryParameter(str2);
        return (TextUtils.isEmpty(queryParameter) || !TextUtils.isDigitsOnly(queryParameter)) ? a2 : a(queryParameter, 0);
    }

    private static int a(String str, int i) {
        Object[] objArr = {str, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4777204571330eaacffbf8e7d1ba97b7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4777204571330eaacffbf8e7d1ba97b7")).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            String trim = str.trim();
            try {
                if (TextUtils.isEmpty(trim)) {
                    return 0;
                }
                return Integer.parseInt(trim);
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
        return 0;
    }

    public static boolean a(Intent intent, String str, String str2, boolean z) {
        Uri data;
        Object[] objArr = {intent, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f05690cff168cb8822730eaeb5196b8e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f05690cff168cb8822730eaeb5196b8e")).booleanValue();
        }
        if (intent == null) {
            return z;
        }
        boolean a2 = com.sankuai.waimai.platform.utils.f.a(intent, str, z);
        if (a2 != z || (data = intent.getData()) == null) {
            return a2;
        }
        String queryParameter = data.getQueryParameter(str2);
        return !TextUtils.isEmpty(queryParameter) ? Boolean.parseBoolean(queryParameter) : a2;
    }

    public static String c(Intent intent, String str, String str2) {
        Uri data;
        Object[] objArr = {intent, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54cbda6113337f9db22ce6926d28fafc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54cbda6113337f9db22ce6926d28fafc");
        }
        if (intent == null) {
            return "";
        }
        if (str == null) {
            str = "";
        }
        String a2 = com.sankuai.waimai.platform.utils.f.a(intent, str);
        return (!TextUtils.isEmpty(a2) || str2 == null || (data = intent.getData()) == null) ? a2 : data.getQueryParameter(str2);
    }
}
