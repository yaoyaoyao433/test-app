package com.meituan.msc.modules.page.render.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.msc.modules.devtools.DebugHelper;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class d extends LinearLayout implements com.meituan.msc.modules.page.render.h, c {
    public static ChangeQuickRedirect a;
    g b;
    private final String c;
    private c d;
    private final int e;
    private final o f;
    private volatile boolean g;
    private final Handler h;
    private f i;
    private h j;

    @Override // com.meituan.msc.modules.page.render.h
    public final View b() {
        return this;
    }

    public d(Context context, com.meituan.msc.modules.engine.h hVar, int i) {
        super(context);
        Object[] objArr = {context, hVar, 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dac5b4d30d6aa44a0636aada6333caec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dac5b4d30d6aa44a0636aada6333caec");
            return;
        }
        this.c = "MSCWebView@" + Integer.toHexString(hashCode());
        this.g = false;
        this.h = new Handler(Looper.getMainLooper());
        this.f = hVar.l;
        this.e = 1;
    }

    public final c getIWebView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6b0bc5b43e2bb480f4b03d83a861ea7", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6b0bc5b43e2bb480f4b03d83a861ea7") : getInnerWebView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c getInnerWebView() {
        c eVar;
        c cVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fff6bcf1ad1e80f945a3115b05a550a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fff6bcf1ad1e80f945a3115b05a550a9");
        }
        if (this.d == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9845ec93c2698f6741653512a9e3dfc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9845ec93c2698f6741653512a9e3dfc");
            } else {
                try {
                    if (this.e == 1) {
                        o oVar = this.f;
                        Context context = getContext();
                        Object[] objArr3 = {context};
                        ChangeQuickRedirect changeQuickRedirect3 = o.a;
                        if (PatchProxy.isSupport(objArr3, oVar, changeQuickRedirect3, false, "978ab5d8e1e29664214a3d6526de019f", RobustBitConfig.DEFAULT_VALUE)) {
                            cVar = (c) PatchProxy.accessDispatch(objArr3, oVar, changeQuickRedirect3, false, "978ab5d8e1e29664214a3d6526de019f");
                        } else {
                            com.meituan.msc.modules.reporter.g.d("WebViewCacheManager", "getWebViewThroughCache");
                            cVar = oVar.b;
                            oVar.b = null;
                            if (cVar == null) {
                                cVar = oVar.a(context);
                            }
                        }
                        this.d = cVar;
                    } else {
                        o oVar2 = this.f;
                        Context context2 = getContext();
                        Object[] objArr4 = {context2, "mmp_service"};
                        ChangeQuickRedirect changeQuickRedirect4 = o.a;
                        if (PatchProxy.isSupport(objArr4, oVar2, changeQuickRedirect4, false, "1c9a5d95ecb2fce08a52f95c50a7e9fc", RobustBitConfig.DEFAULT_VALUE)) {
                            eVar = (c) PatchProxy.accessDispatch(objArr4, oVar2, changeQuickRedirect4, false, "1c9a5d95ecb2fce08a52f95c50a7e9fc");
                        } else if (oVar2.a()) {
                            eVar = new com.meituan.msc.modules.page.render.webview.impl.d(context2, "mmp_service");
                            if (DebugHelper.b()) {
                                MTWebView.setWebContentsDebuggingEnabled(true);
                            }
                        } else {
                            a.a(context2);
                            eVar = new com.meituan.msc.modules.page.render.webview.impl.e(context2);
                            if (DebugHelper.b()) {
                                WebView.setWebContentsDebuggingEnabled(true);
                            }
                        }
                        this.d = eVar;
                    }
                    if (this.i != null) {
                        this.d.setOnContentScrollChangeListener(this.i);
                    }
                    if (this.j != null) {
                        this.d.setOnPageFinishedListener(this.j);
                    }
                    addView(this.d.getWebView(), -1, -1);
                } catch (Exception e) {
                    e.printStackTrace();
                    TextView textView = new TextView(getContext());
                    textView.setText(R.string.msc_no_webview_install);
                    addView(textView, -1, -1);
                    if (this.b != null) {
                        this.b.a(e);
                    }
                    this.d = new com.meituan.msc.modules.page.render.webview.impl.a();
                }
            }
        }
        return this.d;
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void a(final String str, @Nullable final ValueCallback<String> valueCallback) {
        Object[] objArr = {str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb0df30efadf25608b676b41ab05445e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb0df30efadf25608b676b41ab05445e");
        } else if (this.g) {
        } else {
            this.h.post(new Runnable() { // from class: com.meituan.msc.modules.page.render.webview.d.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c9e01dd03c898d0c6c94c630e8bf142", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c9e01dd03c898d0c6c94c630e8bf142");
                    } else {
                        d.this.getInnerWebView().a(str, valueCallback);
                    }
                }
            });
        }
    }

    @Override // com.meituan.msc.modules.page.render.g
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8eeda4dd7350d8c6eade582b28f9fd55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8eeda4dd7350d8c6eade582b28f9fd55");
        } else if (this.g) {
        } else {
            this.g = true;
            this.h.removeCallbacksAndMessages(null);
            if (this.d != null) {
                this.d.setOnRenderProcessGoneListener(null);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    removeView(this.d.getWebView());
                    this.d.k();
                    return;
                }
                this.h.post(new Runnable() { // from class: com.meituan.msc.modules.page.render.webview.d.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54a4f68cb401375db596fda8f63c21ed", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54a4f68cb401375db596fda8f63c21ed");
                            return;
                        }
                        d.this.removeView(d.this.d.getWebView());
                        d.this.d.k();
                    }
                });
            }
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void a(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02f930d044c6c3d2f3715eaec9a64223", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02f930d044c6c3d2f3715eaec9a64223");
        } else {
            getInnerWebView().a(str, str2, str3, str4, str5);
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2352104445d59f7187e4db1a304d6f11", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2352104445d59f7187e4db1a304d6f11") : getInnerWebView().getUrl();
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void a(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29b5788a2dff7388d1b38ae49b7da234", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29b5788a2dff7388d1b38ae49b7da234");
        } else {
            getInnerWebView().a(obj, str);
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final View getWebView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79131d6afdd02b3839325fb19e19702a", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79131d6afdd02b3839325fb19e19702a") : getInnerWebView().getWebView();
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8adfe9f9fcc6e4ed7567326955a0adb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8adfe9f9fcc6e4ed7567326955a0adb");
        } else {
            getInnerWebView().a();
        }
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f92d680f9b9194d8246fe189491251b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f92d680f9b9194d8246fe189491251b6");
        } else {
            getInnerWebView().a(i);
        }
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final void setOnContentScrollChangeListener(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a35f889a69562afc9abb355c29148e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a35f889a69562afc9abb355c29148e5");
            return;
        }
        this.i = fVar;
        if (this.d != null) {
            this.d.setOnContentScrollChangeListener(this.i);
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final String getUserAgentString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b767d92ca478a8bc68e174bfaa03b18", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b767d92ca478a8bc68e174bfaa03b18") : this.d.getUserAgentString();
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setUserAgentString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "502a4a4f518037b4757c99b77ea73909", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "502a4a4f518037b4757c99b77ea73909");
        } else {
            this.d.setUserAgentString(str);
        }
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final int getContentHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fd1b0ee8b5bd8d2c087fd0244b42601", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fd1b0ee8b5bd8d2c087fd0244b42601")).intValue() : this.d.getContentHeight();
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final int getContentScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1a581546a754ba7e1b5c1531c6e786d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1a581546a754ba7e1b5c1531c6e786d")).intValue() : this.d.getContentScrollY();
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setOnPageFinishedListener(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcc64629086feb04d95285610c4911d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcc64629086feb04d95285610c4911d8");
            return;
        }
        this.j = hVar;
        if (this.d != null) {
            this.d.setOnPageFinishedListener(hVar);
        }
    }

    @Override // com.meituan.msc.modules.page.render.g
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aa40c5e0f12d437bd35a3d88d8ea47c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aa40c5e0f12d437bd35a3d88d8ea47c");
        } else {
            getInnerWebView().l();
        }
    }

    @Override // com.meituan.msc.modules.page.render.g
    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc78fa2d01596998ee7c5c9065b4fd89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc78fa2d01596998ee7c5c9065b4fd89");
        } else {
            getInnerWebView().q();
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6cdbe34bf83a6c30b88d957383dd383", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6cdbe34bf83a6c30b88d957383dd383");
        } else if (this.d != null) {
            this.d.b(i);
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setOnFullScreenListener(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "729eb279f98f9725690cdbb6e33de2d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "729eb279f98f9725690cdbb6e33de2d6");
        } else {
            this.d.setOnFullScreenListener(jVar);
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setOnRenderProcessGoneListener(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a25a074dff409e1d0c13095ded2c69e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a25a074dff409e1d0c13095ded2c69e");
        } else {
            this.d.setOnRenderProcessGoneListener(iVar);
        }
    }
}
