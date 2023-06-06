package com.meituan.msc.modules.page.render.webview.impl;

import android.support.annotation.Nullable;
import android.view.View;
import android.webkit.ValueCallback;
import com.meituan.msc.modules.page.render.webview.f;
import com.meituan.msc.modules.page.render.webview.h;
import com.meituan.msc.modules.page.render.webview.i;
import com.meituan.msc.modules.page.render.webview.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements com.meituan.msc.modules.page.render.webview.c {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.modules.page.render.e
    public final void a() {
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final void a(int i) {
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void a(Object obj, String str) {
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void a(String str, @Nullable ValueCallback<String> valueCallback) {
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void a(String str, String str2, String str3, String str4, String str5) {
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void b(int i) {
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final int getContentHeight() {
        return 0;
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final int getContentScrollY() {
        return 0;
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final String getUrl() {
        return null;
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final String getUserAgentString() {
        return null;
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final View getWebView() {
        return null;
    }

    @Override // com.meituan.msc.modules.page.render.g
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24f3edba56aadcc7ffd9f5e169d9dece", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24f3edba56aadcc7ffd9f5e169d9dece");
        }
    }

    @Override // com.meituan.msc.modules.page.render.g
    public final void l() {
    }

    @Override // com.meituan.msc.modules.page.render.g
    public final void q() {
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final void setOnContentScrollChangeListener(f fVar) {
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setOnFullScreenListener(j jVar) {
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setOnPageFinishedListener(h hVar) {
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setOnRenderProcessGoneListener(i iVar) {
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setUserAgentString(String str) {
    }
}
