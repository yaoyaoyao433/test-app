package com.meituan.msc.modules.api.msi.webview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.webkit.WebView;
import com.meituan.msi.bean.BroadcastEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class b extends WebView implements c, e, com.meituan.msi.view.e {
    public static ChangeQuickRedirect a;
    public com.meituan.msi.dispather.e b;
    private final String c;
    private f d;

    @Override // com.meituan.msi.view.e
    public final boolean b() {
        return false;
    }

    @Override // com.meituan.msi.view.e
    public final boolean c(String str) {
        return false;
    }

    public b(Context context, @NonNull d dVar, com.meituan.msi.dispather.e eVar) {
        super(context);
        Object[] objArr = {context, dVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93624d45e8b568f27b550e4e90791e23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93624d45e8b568f27b550e4e90791e23");
            return;
        }
        this.c = "__msc__plugin_webview";
        this.d = new f((Activity) context, dVar);
        this.b = eVar;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "710215adae0ca3f3cb6d373f24913435", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "710215adae0ca3f3cb6d373f24913435");
            return;
        }
        super.onAttachedToWindow();
        addJavascriptInterface(this.d, "__msc__plugin_webview");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc4c9ed1146b207df6c4bd9d5ecec689", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc4c9ed1146b207df6c4bd9d5ecec689");
            return;
        }
        super.onDetachedFromWindow();
        removeJavascriptInterface("__msc__plugin_webview");
    }

    @Override // com.meituan.msi.view.e
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64dc342c26be8c5d713d7b01900024aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64dc342c26be8c5d713d7b01900024aa");
            return;
        }
        onPause();
        a.a(false, (e) this);
    }

    @Override // com.meituan.msi.view.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "910e88cddf8d7d2af4cad61701acf2dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "910e88cddf8d7d2af4cad61701acf2dc");
            return;
        }
        onResume();
        a.a(true, (e) this);
    }

    @Override // com.meituan.msc.modules.api.msi.webview.e
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a83af8e78a89f73441c2712a7227f853", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a83af8e78a89f73441c2712a7227f853");
        } else if (Build.VERSION.SDK_INT >= 19) {
            evaluateJavascript(str, null);
        } else {
            loadUrl(str);
        }
    }

    @Override // com.meituan.msc.modules.api.msi.webview.e
    public final void a(String str, Object obj, int i, String str2) {
        Object[] objArr = {str, obj, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c79dbe33260536a9d3a95c93bda22252", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c79dbe33260536a9d3a95c93bda22252");
            return;
        }
        BroadcastEvent broadcastEvent = new BroadcastEvent(str, obj);
        HashMap hashMap = new HashMap();
        hashMap.put("pageId", String.valueOf(i));
        hashMap.put("viewId", String.valueOf(str2));
        broadcastEvent.setUiData(hashMap);
        this.b.a(broadcastEvent);
    }

    @Override // com.meituan.msc.modules.api.msi.webview.c
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b3e3bc9329ce6023785294ec52514a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b3e3bc9329ce6023785294ec52514a5")).booleanValue();
        }
        if (canGoBack()) {
            goBack();
            return true;
        }
        return false;
    }
}
