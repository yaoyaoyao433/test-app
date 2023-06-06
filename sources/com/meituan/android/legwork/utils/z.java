package com.meituan.android.legwork.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class z {
    public static ChangeQuickRedirect a;
    public static com.meituan.android.cipstorage.q b;

    public static com.meituan.android.cipstorage.q a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f6ad67deca6cce11263e081cbe59975", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cipstorage.q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f6ad67deca6cce11263e081cbe59975");
        }
        if (b == null) {
            b = com.meituan.android.cipstorage.q.a(context, "banma");
        }
        return b;
    }

    public static void a(Context context, String str, long j) {
        Object[] objArr = {context, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69f61fa0f1bf01543663c4253e22ef8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69f61fa0f1bf01543663c4253e22ef8b");
        } else if (context == null) {
        } else {
            com.meituan.android.cipstorage.q.a(context, "banma").a(str, j);
        }
    }

    public static long b(Context context, String str, long j) {
        Object[] objArr = {context, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "237f88db1fa273bf7cb054ae399e7848", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "237f88db1fa273bf7cb054ae399e7848")).longValue() : context == null ? j : com.meituan.android.cipstorage.q.a(context, "banma").b(str, j);
    }

    public static void a(Context context, String str, boolean z) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "791d1f2103d6770c344f917e8f2f41e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "791d1f2103d6770c344f917e8f2f41e0");
        } else if (context == null) {
        } else {
            com.meituan.android.cipstorage.q.a(context, "banma").a(str, z);
        }
    }

    public static boolean b(Context context, String str, boolean z) {
        Object[] objArr = {context, str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf85896409b151891afdba3d9b1ca009", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf85896409b151891afdba3d9b1ca009")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return com.meituan.android.cipstorage.q.a(context, "banma").b(str, false);
    }

    public static boolean a(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2017ca6ef870d67c4c920f76a889504", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2017ca6ef870d67c4c920f76a889504")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return com.meituan.android.cipstorage.q.a(context, "banma").a(str, str2);
    }

    public static String b(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f714a53f46e4617e6a0068a6bf2e213", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f714a53f46e4617e6a0068a6bf2e213") : context == null ? str2 : com.meituan.android.cipstorage.q.a(context, "banma").b(str, str2);
    }

    public static void a(Context context, String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cb7adc982776e32474a574309219b0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cb7adc982776e32474a574309219b0f");
        } else if (context == null) {
        } else {
            com.meituan.android.cipstorage.q.a(context, "banma").a(str, i);
        }
    }

    public static int b(Context context, String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16c2d5df54e7a4eb02578afc3ebdcb6d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16c2d5df54e7a4eb02578afc3ebdcb6d")).intValue() : context == null ? i : com.meituan.android.cipstorage.q.a(context, "banma").b(str, i);
    }

    public static boolean a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41212139534e5a7b8030847e7cc43f87", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41212139534e5a7b8030847e7cc43f87")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return com.meituan.android.cipstorage.q.a(context, "banma").b(str);
    }

    public static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15a34405850393f7f60aa5c629bb78bd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15a34405850393f7f60aa5c629bb78bd")).booleanValue() : com.meituan.android.cipstorage.q.a(context, "banma").c();
    }

    public static long a(String str, long j) {
        Object[] objArr = {str, 180L};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6d6a857dd6cbee1e342268653eb6abd", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6d6a857dd6cbee1e342268653eb6abd")).longValue() : b(com.meituan.android.legwork.a.a(), str, 180L);
    }

    public static void b(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa549e4a01ecd9cc85a81640e041dd2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa549e4a01ecd9cc85a81640e041dd2d");
        } else {
            a(com.meituan.android.legwork.a.a(), str, j);
        }
    }

    public static void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7de90a350aed1d3351cf8b1f75a3ee51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7de90a350aed1d3351cf8b1f75a3ee51");
        } else {
            a(com.meituan.android.legwork.a.a(), str, i);
        }
    }

    public static int b(String str, int i) {
        Object[] objArr = {str, 3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3038c5c7e94b389ce16a31923672d43", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3038c5c7e94b389ce16a31923672d43")).intValue() : b(com.meituan.android.legwork.a.a(), str, 3);
    }
}
