package com.meituan.mmp.lib.api.web;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class c extends MTWebView implements b, com.meituan.msi.view.e {
    public static ChangeQuickRedirect a;
    private final String b;
    private e c;

    @Override // com.meituan.msi.view.e
    public final boolean b() {
        return false;
    }

    @Override // com.meituan.msi.view.e
    public final boolean c(String str) {
        return false;
    }

    public c(Context context, com.meituan.mmp.lib.config.a aVar, @NonNull a aVar2) {
        super(aVar.m(), context);
        Object[] objArr = {context, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46aa425cda2742fdc5fb9eb8fcc9f15e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46aa425cda2742fdc5fb9eb8fcc9f15e");
            return;
        }
        this.b = "__mmp__plugin_webview";
        this.c = new e((Activity) context, aVar2);
    }

    @Override // com.meituan.mtwebkit.MTWebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bc3159048729b659adf66420d5c210a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bc3159048729b659adf66420d5c210a");
            return;
        }
        super.onAttachedToWindow();
        addJavascriptInterface(this.c, "__mmp__plugin_webview");
    }

    @Override // com.meituan.mtwebkit.MTWebView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2418e9e8fc1d5a5ca71004435e19792", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2418e9e8fc1d5a5ca71004435e19792");
            return;
        }
        super.onDetachedFromWindow();
        this.c.b = null;
        this.c.c = null;
        this.c = null;
        removeJavascriptInterface("__mmp__plugin_webview");
    }

    @Override // com.meituan.msi.view.e
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ea31ec98cdae33f54f01fbc876a118f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ea31ec98cdae33f54f01fbc876a118f");
            return;
        }
        onPause();
        BaseWebViewModule.a(false, (b) this);
    }

    @Override // com.meituan.msi.view.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2887b4296c6d40ee9c13f14fe21a3ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2887b4296c6d40ee9c13f14fe21a3ff");
            return;
        }
        onResume();
        BaseWebViewModule.a(true, (b) this);
    }

    @Override // com.meituan.mmp.lib.api.web.b
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec180b62cc9fb60f320faff51ace2d0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec180b62cc9fb60f320faff51ace2d0a");
        } else if (Build.VERSION.SDK_INT >= 19) {
            evaluateJavascript(str, null);
        } else {
            loadUrl(str);
        }
    }
}
