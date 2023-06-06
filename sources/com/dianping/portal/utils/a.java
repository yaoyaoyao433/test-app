package com.dianping.portal.utils;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a(Intent intent, String str) {
        Object[] objArr = {intent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c5ed81b39c0e35c92bbe5ab19f0e5df", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c5ed81b39c0e35c92bbe5ab19f0e5df");
        }
        try {
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter(str);
                if (queryParameter != null) {
                    return queryParameter;
                }
            }
        } catch (Exception unused) {
        }
        return f.a(intent, str);
    }

    public static int a(Intent intent, String str, int i) {
        Object[] objArr = {intent, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "428f46ab057ea0ebab32316d5b583cb9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "428f46ab057ea0ebab32316d5b583cb9")).intValue();
        }
        try {
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter(str);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return Integer.parseInt(queryParameter);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f.a(intent, str, i);
    }

    public static double a(Intent intent, String str, double d) {
        Object[] objArr = {intent, str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ce33f7f6b45f7db4e9b99c20616390b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ce33f7f6b45f7db4e9b99c20616390b")).doubleValue();
        }
        try {
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter(str);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return Double.parseDouble(queryParameter);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return intent.getDoubleExtra(str, d);
    }

    public static boolean a(Intent intent, String str, boolean z) {
        Object[] objArr = {intent, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc38900a954bcbb996d63fae6f031d7e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc38900a954bcbb996d63fae6f031d7e")).booleanValue();
        }
        try {
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter(str);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return Boolean.parseBoolean(queryParameter);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f.a(intent, str, z);
    }

    public static long a(Intent intent, String str, long j) {
        Object[] objArr = {intent, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5630c5a25d6d414754909b76f40a1f83", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5630c5a25d6d414754909b76f40a1f83")).longValue();
        }
        try {
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter(str);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return Long.parseLong(queryParameter);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f.a(intent, str, j);
    }

    public static byte a(Intent intent, String str, byte b) {
        Object[] objArr = {intent, str, Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a459f86f52f93e09bc30c2a7299d1736", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Byte) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a459f86f52f93e09bc30c2a7299d1736")).byteValue();
        }
        try {
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter(str);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return Byte.parseByte(queryParameter);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return intent.getByteExtra(str, b);
    }

    public static float a(Intent intent, String str, float f) {
        Object[] objArr = {intent, str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46357e69cef1f3c3eaf5f772d126aae8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46357e69cef1f3c3eaf5f772d126aae8")).floatValue();
        }
        try {
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter(str);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return Float.parseFloat(queryParameter);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return intent.getFloatExtra(str, f);
    }

    public static short a(Intent intent, String str, short s) {
        Object[] objArr = {intent, str, Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bc65393e4df55d82ac8fc8551e6a306", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Short) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bc65393e4df55d82ac8fc8551e6a306")).shortValue();
        }
        try {
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter(str);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return Short.parseShort(queryParameter);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return intent.getShortExtra(str, s);
    }

    public static char a(Intent intent, String str, char c) {
        Object[] objArr = {intent, str, Character.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55ff6ca01f17360e1d250ee6c9a55e9d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Character) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55ff6ca01f17360e1d250ee6c9a55e9d")).charValue();
        }
        try {
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter(str);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return queryParameter.charAt(0);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return intent.getCharExtra(str, c);
    }
}
