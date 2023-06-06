package com.meituan.android.quickpass.uptsm.common.utils;

import android.content.Context;
import android.preference.PreferenceManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;

    public static synchronized String a(Context context, String str, String str2) {
        synchronized (i.class) {
            Object[] objArr = {context, str, null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f303c5073e399c0d0ddde73f8c7d530a", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f303c5073e399c0d0ddde73f8c7d530a");
            }
            return PreferenceManager.getDefaultSharedPreferences(context).getString(str, null);
        }
    }

    public static synchronized void b(Context context, String str, String str2) {
        synchronized (i.class) {
            Object[] objArr = {context, str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29251f4ccb9f4a0c7630c6fe824ce084", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29251f4ccb9f4a0c7630c6fe824ce084");
            } else {
                PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, str2).apply();
            }
        }
    }

    public static synchronized boolean a(Context context, String str, boolean z) {
        synchronized (i.class) {
            Object[] objArr = {context, str, (byte) 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7553f01517a119f56a737831cec72ab0", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7553f01517a119f56a737831cec72ab0")).booleanValue();
            }
            return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(str, false);
        }
    }

    public static synchronized void b(Context context, String str, boolean z) {
        synchronized (i.class) {
            Object[] objArr = {context, str, (byte) 1};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "05ee2ddb9d8bba9c0644383450175977", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "05ee2ddb9d8bba9c0644383450175977");
            } else {
                PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(str, true).apply();
            }
        }
    }
}
