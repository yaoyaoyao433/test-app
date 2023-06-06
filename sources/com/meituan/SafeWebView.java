package com.meituan;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SafeWebView extends WebView {
    public static ChangeQuickRedirect a;

    public SafeWebView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ca98af0cbcdfb4a7b979e3b97520bf8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ca98af0cbcdfb4a7b979e3b97520bf8");
        } else {
            a();
        }
    }

    public SafeWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47961a81a45c936be98122f12a671eb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47961a81a45c936be98122f12a671eb0");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec87b0da56a1e114fafb3051a3115064", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec87b0da56a1e114fafb3051a3115064");
            return;
        }
        b();
        getSettings().setAllowFileAccess(false);
        getSettings().setSavePassword(false);
    }

    @SuppressLint({"NewApi"})
    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "126a458f6cfbf65cf5795f49ea29c213", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "126a458f6cfbf65cf5795f49ea29c213");
        } else if (Build.VERSION.SDK_INT < 11 || Build.VERSION.SDK_INT >= 17) {
        } else {
            removeJavascriptInterface("searchBoxJavaBridge_");
        }
    }

    @Override // android.webkit.WebView
    @SuppressLint({"JavascriptInterface"})
    public void addJavascriptInterface(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59fce96316ac0867d1a91af6741203ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59fce96316ac0867d1a91af6741203ac");
        } else if (Build.VERSION.SDK_INT >= 17) {
            super.addJavascriptInterface(obj, str);
        }
    }
}
