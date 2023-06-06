package com.sankuai.waimai.foundation.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class af {
    public static ChangeQuickRedirect a;

    public static boolean a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "672328f0bade7a2db4504df4e588ec4b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "672328f0bade7a2db4504df4e588ec4b")).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String scheme = uri.getScheme();
        return "http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme);
    }

    public static boolean b(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6cf31da3b421f5b37671ba8945b6219c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6cf31da3b421f5b37671ba8945b6219c")).booleanValue() : uri == null || Uri.EMPTY.equals(uri);
    }

    public static void a(Uri.Builder builder, Map<String, String> map) {
        Object[] objArr = {builder, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17dae161f9d6937b475c72fb355b8fbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17dae161f9d6937b475c72fb355b8fbc");
        } else if (builder != null && map != null) {
            for (String str : map.keySet()) {
                builder.appendQueryParameter(str, map.get(str));
            }
        }
    }

    public static Uri a(Uri uri, Map<String, String> map) {
        Object[] objArr = {uri, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c837e7af9ee46321bdc91e86c9c35e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c837e7af9ee46321bdc91e86c9c35e7");
        }
        if (uri == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value) && TextUtils.isEmpty(uri.getQueryParameter(key))) {
                buildUpon.appendQueryParameter(key, value);
            }
        }
        return buildUpon.build();
    }

    public static Uri a(Uri uri, String str, String str2) {
        Object[] objArr = {uri, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db8b1ce91a91ab6a7c55e11aa8d93fca", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db8b1ce91a91ab6a7c55e11aa8d93fca");
        }
        if (uri == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        if (TextUtils.isEmpty(uri.getQueryParameter(str))) {
            buildUpon.appendQueryParameter(str, str2);
            return buildUpon.build();
        }
        return uri;
    }

    public static long a(Uri uri, String str, long j) {
        Object[] objArr = {uri, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26e3e1590c5fd8c29a3a14838481a51e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26e3e1590c5fd8c29a3a14838481a51e")).longValue();
        }
        String queryParameter = uri.getQueryParameter(str);
        if (TextUtils.isEmpty(queryParameter)) {
            return j;
        }
        try {
            return Long.parseLong(queryParameter);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static int a(Uri uri, String str, int i) {
        Object[] objArr = {uri, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b27b7ff75b0327b30e6e393384107db2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b27b7ff75b0327b30e6e393384107db2")).intValue();
        }
        String queryParameter = uri.getQueryParameter(str);
        if (TextUtils.isEmpty(queryParameter)) {
            return i;
        }
        try {
            return Integer.parseInt(queryParameter);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static boolean a(Uri uri, String str, boolean z) {
        Object[] objArr = {uri, str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd0be0069b47ad0533c2355913c3d137", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd0be0069b47ad0533c2355913c3d137")).booleanValue() : uri.getBooleanQueryParameter(str, false);
    }

    public static String b(Uri uri, String str, String str2) {
        Object[] objArr = {uri, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20ad6edf5c529fe4ed2416735b6a7f05", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20ad6edf5c529fe4ed2416735b6a7f05");
        }
        String queryParameter = uri.getQueryParameter(str);
        return TextUtils.isEmpty(queryParameter) ? str2 : queryParameter;
    }

    public static Uri c(Uri uri, String str, String str2) {
        Object[] objArr = {uri, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "203b6c0cee7d08639dece4825dd040e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "203b6c0cee7d08639dece4825dd040e2");
        }
        if (uri == null || Uri.EMPTY.equals(uri) || TextUtils.isEmpty(str)) {
            return uri;
        }
        if (uri.getQueryParameter(str) == null) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        for (String str3 : uri.getQueryParameterNames()) {
            if (str.equals(str3)) {
                buildUpon.appendQueryParameter(str3, str2);
            } else {
                String queryParameter = uri.getQueryParameter(str3);
                if (queryParameter != null) {
                    buildUpon.appendQueryParameter(str3, queryParameter);
                }
            }
        }
        return buildUpon.build();
    }
}
