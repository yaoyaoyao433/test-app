package com.meituan.android.neohybrid.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class p {
    public static ChangeQuickRedirect a;
    public static String b;
    public static String c;

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a34150f5773acdd5c5833820a5f9cae", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a34150f5773acdd5c5833820a5f9cae");
        }
        if (TextUtils.isEmpty(c)) {
            if (context == null) {
                return "-1";
            }
            String b2 = b(context);
            if (TextUtils.isEmpty(b2) || b2.equals("-1")) {
                return "-1";
            }
            try {
                String str = b2.split("\\.")[0];
                c = str;
                return str;
            } catch (Exception unused) {
                return "-1";
            }
        }
        return c;
    }

    public static String b(Context context) {
        PackageInfo currentWebViewPackage;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "803cdf97af01f3e4d6c8c5f6cf251733", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "803cdf97af01f3e4d6c8c5f6cf251733");
        }
        if (TextUtils.isEmpty(b)) {
            if (context == null) {
                return "-1";
            }
            if (Build.VERSION.SDK_INT >= 26 && (currentWebViewPackage = WebView.getCurrentWebViewPackage()) != null) {
                b = currentWebViewPackage.versionName;
            }
            if (TextUtils.isEmpty(b)) {
                b = "-1";
            }
            return b;
        }
        return b;
    }
}
