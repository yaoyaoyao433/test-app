package com.sankuai.waimai.foundation.router.utils;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.manipulator.annotation.SkipInstrumentation;
/* compiled from: ProGuard */
@SkipInstrumentation
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static int a(Intent intent, String str, int i) {
        Object[] objArr = {intent, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df7bfe929dd8a932089d2560f49264e3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df7bfe929dd8a932089d2560f49264e3")).intValue();
        }
        if (intent == null) {
            return i;
        }
        try {
            return intent.getIntExtra(str, i);
        } catch (Exception unused) {
            return i;
        }
    }

    public static String a(Intent intent, String str, String str2) {
        Object[] objArr = {intent, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35b8dc2bbc67515a760ede00da0b2ea5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35b8dc2bbc67515a760ede00da0b2ea5");
        }
        if (intent == null) {
            return str2;
        }
        try {
            String stringExtra = intent.getStringExtra(str);
            return stringExtra == null ? str2 : stringExtra;
        } catch (Exception unused) {
            return str2;
        }
    }

    public static boolean a(Intent intent, String str, boolean z) {
        Object[] objArr = {intent, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e583c2213154983753cde56a6df5169", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e583c2213154983753cde56a6df5169")).booleanValue();
        }
        if (intent == null) {
            return z;
        }
        try {
            return intent.getBooleanExtra(str, z);
        } catch (Exception unused) {
            return z;
        }
    }

    public static long a(Intent intent, String str, long j) {
        Object[] objArr = {intent, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0e0b1e0f0e0b81cdcc1c0db7d90f7ff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0e0b1e0f0e0b81cdcc1c0db7d90f7ff")).longValue();
        }
        if (intent == null) {
            return j;
        }
        try {
            return intent.getLongExtra(str, j);
        } catch (Exception unused) {
            return j;
        }
    }
}
