package com.meituan.android.common.aidata.utils;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SP {
    private static String AIDATA_SP_FILE_NAME = "aidata_sp_file_name";
    public static final String SP_KEY_DDD_ENV = "sp_key_ddd_env";
    public static final String SP_KEY_HORN_ENV = "sp_key_horn_env";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void putBoolean(Context context, String str, boolean z) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2345003aea34d559b5dad3691e7197af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2345003aea34d559b5dad3691e7197af");
        } else {
            q.a(context, AIDATA_SP_FILE_NAME, 1).a(str, z);
        }
    }

    public static boolean getBoolean(Context context, String str, boolean z) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f9bce82030e0a979c1b87ba78300c758", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f9bce82030e0a979c1b87ba78300c758")).booleanValue();
        }
        if (context == null) {
            return z;
        }
        try {
            return q.a(context, AIDATA_SP_FILE_NAME, 1).b(str, z);
        } catch (ClassCastException unused) {
            return z;
        }
    }

    public static void putInt(Context context, String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2adda87fe0a6fd112fbaab92b9cd33dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2adda87fe0a6fd112fbaab92b9cd33dd");
        } else {
            q.a(context, AIDATA_SP_FILE_NAME, 1).a(str, i);
        }
    }

    public static int getInt(Context context, String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "14a62f8b3e6e2f69dafc5e26a4670ad8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "14a62f8b3e6e2f69dafc5e26a4670ad8")).intValue();
        }
        if (context == null) {
            return i;
        }
        try {
            return q.a(context, AIDATA_SP_FILE_NAME, 1).b(str, i);
        } catch (ClassCastException unused) {
            return i;
        }
    }

    public static void putString(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7e11cd33ab8a716f3c5d1647fd90507a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7e11cd33ab8a716f3c5d1647fd90507a");
        } else {
            q.a(context, AIDATA_SP_FILE_NAME, 1).a(str, str2);
        }
    }

    public static String getString(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a3d58b752374683f70b8ffc39ac05656", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a3d58b752374683f70b8ffc39ac05656");
        }
        if (context == null) {
            return str2;
        }
        try {
            return q.a(context, AIDATA_SP_FILE_NAME, 1).b(str, str2);
        } catch (ClassCastException unused) {
            return str2;
        }
    }
}
