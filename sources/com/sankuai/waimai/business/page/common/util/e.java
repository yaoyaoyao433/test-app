package com.sankuai.waimai.business.page.common.util;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static String a(Uri uri, String str, String str2) {
        Object[] objArr = {uri, str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84bd77ab2f8dcd7dd28b2b354b5c75df", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84bd77ab2f8dcd7dd28b2b354b5c75df") : b(uri, str, (String) null);
    }

    private static String b(Uri uri, String str, String str2) {
        Object[] objArr = {uri, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "233a89f298e8e55b38f0de3ff73dc8ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "233a89f298e8e55b38f0de3ff73dc8ac");
        }
        if (uri != null) {
            String queryParameter = uri.getQueryParameter(str);
            if (!TextUtils.isEmpty(queryParameter)) {
                return queryParameter;
            }
        }
        return str2;
    }

    public static int a(Uri uri, String str, int i) {
        Object[] objArr = {uri, str, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82fa1f6821bff951d1582db02355ae3c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82fa1f6821bff951d1582db02355ae3c")).intValue() : b(uri, str, 0);
    }

    private static int b(Uri uri, String str, int i) {
        Object[] objArr = {uri, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b34a829e128c7caa4e9d32a3a34e23af", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b34a829e128c7caa4e9d32a3a34e23af")).intValue();
        }
        if (uri != null) {
            String queryParameter = uri.getQueryParameter(str);
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    return Integer.parseInt(queryParameter);
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                }
            }
        }
        return i;
    }

    public static long a(Uri uri, String str, long j) {
        Object[] objArr = {uri, str, 0L};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eaeb1abcc9caa4cd3e946dcb7ec59da8", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eaeb1abcc9caa4cd3e946dcb7ec59da8")).longValue() : b(uri, str, 0L);
    }

    private static long b(@NonNull Uri uri, String str, long j) {
        Object[] objArr = {uri, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a5b78a5efff89a82b1a434b9faa74fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a5b78a5efff89a82b1a434b9faa74fa")).longValue();
        }
        if (uri != null) {
            String queryParameter = uri.getQueryParameter(str);
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    return Long.parseLong(queryParameter);
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                }
            }
        }
        return j;
    }
}
