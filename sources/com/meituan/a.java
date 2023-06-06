package com.meituan;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public volatile boolean d;

    @SuppressLint({"WebViewApiAvailability"})
    public PackageInfo a(Context context) {
        String str;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7643588690dc7c3224502fd4468c3c19", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7643588690dc7c3224502fd4468c3c19");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return WebView.getCurrentWebViewPackage();
            } catch (NullPointerException unused) {
                return null;
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            PackageInfo c = c();
            if (c != null) {
                return c;
            }
            if (Build.VERSION.SDK_INT <= 23) {
                str = a();
            } else {
                str = b();
            }
        } else {
            str = null;
        }
        if (str != null) {
            try {
                return context.getPackageManager().getPackageInfo(str, 0);
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1da84a52a24d7b73db5901b8f2817fb1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1da84a52a24d7b73db5901b8f2817fb1");
        }
        try {
            return (String) Class.forName("android.webkit.WebViewFactory").getMethod("getWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    @SuppressLint({"PrivateApi"})
    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f3c21d2a8432c247096ff8a933fb4df", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f3c21d2a8432c247096ff8a933fb4df");
        }
        try {
            return (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    @SuppressLint({"PrivateApi"})
    private PackageInfo c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4914c32b660d79cd515aa5a91d25c4bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4914c32b660d79cd515aa5a91d25c4bb");
        }
        try {
            return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
