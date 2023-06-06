package com.meituan.android.base.util;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8df0c138c1b2c3d27d20f1670aaf1401", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8df0c138c1b2c3d27d20f1670aaf1401");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String replace = str.replace("/w.h/", "/");
        Object[] objArr2 = {replace};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "298556057cdd4eb1593d1a9d0956758b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "298556057cdd4eb1593d1a9d0956758b");
        }
        if (Build.VERSION.SDK_INT >= 18 && !"Nokia_X".equals(Build.MODEL)) {
            if (TextUtils.isEmpty(replace)) {
                return "";
            }
            if (replace.toLowerCase().endsWith(".webp")) {
                return replace;
            }
            String host = Uri.parse(replace).getHost();
            if (TextUtils.isEmpty(host) || !(host.contains("p0.meituan.net") || host.contains("p1.meituan.net") || host.contains("img.meituan.net"))) {
                return replace;
            }
            return replace + ".webp";
        }
        return replace;
    }
}
