package com.meituan.android.mrn.utils;

import android.support.annotation.Nullable;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class p {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;

    private static String a(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "3c199acaa527d6d5b089d43f0c2ba0d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "3c199acaa527d6d5b089d43f0c2ba0d5");
        }
        if (objArr == null) {
            return StringUtil.NULL;
        }
        int length = objArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(objArr[0]);
        for (int i = 1; i < length; i++) {
            sb.append(StringUtil.SPACE);
            sb.append(objArr[i]);
        }
        return sb.toString();
    }

    @Deprecated
    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "77ba65dc514439eefd5c293f17eb7abc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "77ba65dc514439eefd5c293f17eb7abc");
            return;
        }
        try {
            String a2 = a(objArr);
            com.dianping.networklog.c.a(str + " : " + a2, 33);
            if (b) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" : ");
                sb.append(a2);
            }
        } catch (Throwable unused) {
        }
    }

    @Deprecated
    public static void a(String str, Throwable th, Object... objArr) {
        Object[] objArr2 = {str, th, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "7b6e63d63af9443dcfbaea1fb4ffaa65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "7b6e63d63af9443dcfbaea1fb4ffaa65");
            return;
        }
        try {
            String a2 = a(objArr);
            com.dianping.networklog.c.a(str + " : " + a2 + StringUtil.CRLF_STRING + Log.getStackTraceString(th), 33);
            if (b) {
                Log.e("MRNLogan", str + " : " + a2, th);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(int i, @Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        Object[] objArr = {Integer.valueOf(i), str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9fb7788a18c08621d1b578f86a1a908b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9fb7788a18c08621d1b578f86a1a908b");
        } else {
            com.dianping.networklog.c.a(LogUtils.a(str, str2, th), 33);
        }
    }
}
