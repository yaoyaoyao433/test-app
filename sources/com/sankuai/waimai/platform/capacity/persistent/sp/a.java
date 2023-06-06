package com.sankuai.waimai.platform.capacity.persistent.sp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Set;
/* compiled from: ProGuard */
@SuppressLint({"ApplySharedPref"})
@Deprecated
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(Context context, String str, double d) {
        Object[] objArr = {context, str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f13fdada5dac2e49ad900f8a7718ae76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f13fdada5dac2e49ad900f8a7718ae76");
        } else if (context == null) {
        } else {
            q.a(context, "waimai_takeout", 1).a(str, Double.doubleToLongBits(d));
        }
    }

    public static double b(Context context, String str, double d) {
        Object[] objArr = {context, str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6759969320479987f2866816bd3fbe7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6759969320479987f2866816bd3fbe7")).doubleValue();
        }
        if (context == null) {
            return d;
        }
        try {
            return Double.longBitsToDouble(q.a(context, "waimai_takeout", 1).b(str, Double.doubleToLongBits(d)));
        } catch (ClassCastException unused) {
            return d;
        }
    }

    public static void a(Context context, String str, long j) {
        Object[] objArr = {context, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2bfe7bdc7152c63ce2c394f8f26b2e17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2bfe7bdc7152c63ce2c394f8f26b2e17");
        } else if (context == null) {
        } else {
            q.a(context, "waimai_takeout", 1).a(str, j);
        }
    }

    public static float a(Context context, String str, float f) {
        Object[] objArr = {context, str, Float.valueOf(-1.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0291f79aaf17025363b7cd6ee5533801", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0291f79aaf17025363b7cd6ee5533801")).floatValue();
        }
        if (context == null) {
            return -1.0f;
        }
        try {
            return q.a(context, "waimai_takeout", 1).b(str, -1.0f);
        } catch (ClassCastException unused) {
            return -1.0f;
        }
    }

    public static long b(Context context, String str, long j) {
        Object[] objArr = {context, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "885786b963513299bd6850292f90fc22", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "885786b963513299bd6850292f90fc22")).longValue();
        }
        if (context == null) {
            return j;
        }
        try {
            return q.a(context, "waimai_takeout", 1).b(str, j);
        } catch (ClassCastException unused) {
            return j;
        }
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ff3d238fbc4da9480ec32f60ad1b7d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ff3d238fbc4da9480ec32f60ad1b7d8");
        } else if (context == null) {
        } else {
            q.a(context, "waimai_takeout", 1).b(str);
        }
    }

    public static void a(Context context, String str, boolean z) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a5c39453df0613c22a46456eddf5e5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a5c39453df0613c22a46456eddf5e5f");
        } else if (context == null) {
        } else {
            q.a(context, "waimai_takeout", 1).a(str, z);
        }
    }

    public static boolean b(Context context, String str, boolean z) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b2550c540f24129f50a9345b92d9acf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b2550c540f24129f50a9345b92d9acf")).booleanValue();
        }
        if (context == null) {
            return z;
        }
        try {
            return q.a(context, "waimai_takeout", 1).b(str, z);
        } catch (ClassCastException unused) {
            return z;
        }
    }

    public static boolean c(Context context, String str, boolean z) {
        Object[] objArr = {context, str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a520ebc24532478c4a79bdfa996cb647", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a520ebc24532478c4a79bdfa996cb647")).booleanValue();
        }
        if (context == null) {
            return true;
        }
        try {
            return q.a(context, "waimai_takeout", 2).b(str, true);
        } catch (ClassCastException unused) {
            return true;
        }
    }

    public static void a(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5df4da79c74a32b9c97911f5035ea223", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5df4da79c74a32b9c97911f5035ea223");
        } else if (context == null) {
        } else {
            q.a(context, "waimai_takeout", 1).a(str, str2);
        }
    }

    public static String b(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3279914c6eb22add05237f9f839d2a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3279914c6eb22add05237f9f839d2a2");
        }
        if (context == null) {
            return str2;
        }
        try {
            return q.a(context, "waimai_takeout", 1).b(str, str2);
        } catch (ClassCastException unused) {
            return str2;
        }
    }

    public static void a(Context context, String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "663609d3d66221f61dc19b2f2244c483", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "663609d3d66221f61dc19b2f2244c483");
        } else if (context == null) {
        } else {
            q.a(context, "waimai_takeout", 1).a(str, i);
        }
    }

    public static int b(Context context, String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bff39cbd80a748938fd8b30e4b51b36a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bff39cbd80a748938fd8b30e4b51b36a")).intValue();
        }
        if (context == null) {
            return i;
        }
        try {
            return q.a(context, "waimai_takeout", 1).b(str, i);
        } catch (ClassCastException unused) {
            return i;
        }
    }

    public static Set<String> a(Context context, String str, Set<String> set) {
        Object[] objArr = {context, str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63136490884eca1fd250dc81692afd58", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63136490884eca1fd250dc81692afd58");
        }
        if (context == null) {
            return null;
        }
        try {
            return q.a(context, "waimai_takeout", 1).b(str, (Set<String>) null);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public static void b(Context context, String str, Set<String> set) {
        Object[] objArr = {context, str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7efcfea4297846d7090dba7aea995f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7efcfea4297846d7090dba7aea995f9");
        } else if (context == null) {
        } else {
            q.a(context, "waimai_takeout", 1).a(str, set);
        }
    }

    public static <T> T a(Context context, String str, Class<T> cls) {
        q a2;
        Object[] objArr = {context, str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3cc591084197169b88c7a6a2182ff3eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3cc591084197169b88c7a6a2182ff3eb");
        }
        if (context != null && (a2 = q.a(context, "waimai_takeout", 1)) != null) {
            String b = a2.b(str, (String) null);
            if (!TextUtils.isEmpty(b)) {
                try {
                    return (T) new Gson().fromJson(b, (Class<Object>) cls);
                } catch (Exception unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public static <T> void a(Context context, String str, T t) {
        Object[] objArr = {context, str, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a1b34a3cfceca088b2cae6b65b3cca9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a1b34a3cfceca088b2cae6b65b3cca9");
        } else if (context == null) {
        } else {
            q a2 = q.a(context, "waimai_takeout", 1);
            String json = new Gson().toJson(t);
            if (TextUtils.isEmpty(json)) {
                return;
            }
            a2.a(str, json);
        }
    }
}
