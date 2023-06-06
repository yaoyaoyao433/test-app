package com.meituan.android.pike.bean;

import android.text.TextUtils;
import com.meituan.android.log.a;
import com.meituan.android.pike.manager.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class PikeLog extends a {
    public static final Boolean ENABLE = Boolean.TRUE;
    public static final String TAG = "pike_sdk_";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void i(Class<?> cls, String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f1019274edac161929a4593e93064d38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f1019274edac161929a4593e93064d38");
        } else {
            i(cls.getSimpleName(), str);
        }
    }

    public static void i(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e9b624816d2ddc89a4a902e0b3823cdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e9b624816d2ddc89a4a902e0b3823cdc");
        } else if (ENABLE.booleanValue() && !TextUtils.isEmpty(str2)) {
            a.i(TAG, str + CommonConstant.Symbol.COLON + str2);
        }
    }

    public static void d(Class<?> cls, String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7db1a3d65c93c736b2ba89c80282409b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7db1a3d65c93c736b2ba89c80282409b");
        } else {
            d(cls.getSimpleName(), str);
        }
    }

    public static void d(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "74c2ea01c8dbcaab10e67600d2cad587", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "74c2ea01c8dbcaab10e67600d2cad587");
        } else if (ENABLE.booleanValue() && !TextUtils.isEmpty(str2)) {
            a.d(TAG, str + CommonConstant.Symbol.COLON + str2);
        }
    }

    public static void e(Class<?> cls, String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "527e105f25c44caf2eaedd689f254290", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "527e105f25c44caf2eaedd689f254290");
        } else {
            e(cls.getSimpleName(), str);
        }
    }

    public static void e(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b0af4b2b4983f5e03c8f093e491dba85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b0af4b2b4983f5e03c8f093e491dba85");
        } else if (ENABLE.booleanValue() && !TextUtils.isEmpty(str2)) {
            a.e(TAG, str + CommonConstant.Symbol.COLON + str2);
        }
    }

    public static void e(Class<?> cls, String str, Throwable th) {
        Object[] objArr = {cls, str, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "44296b911d7c0d51a82a5031b172876d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "44296b911d7c0d51a82a5031b172876d");
        } else if (ENABLE.booleanValue()) {
            a.e(TAG, cls.getSimpleName() + CommonConstant.Symbol.COLON + str + " exception: " + th.getMessage());
        }
    }

    public static void debug(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d4cdab520fbc0343183dfc385e3f61cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d4cdab520fbc0343183dfc385e3f61cf");
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            if (a.C0344a.a.f != com.meituan.android.pike.a.ENV_PROD) {
                com.meituan.android.log.a.i(TAG, str + CommonConstant.Symbol.COLON + str2);
            }
        }
    }
}
