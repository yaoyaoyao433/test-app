package com.meituan.android.neohybrid.framework.neo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.LocalBroadcastManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.dianping.titans.js.JsHandlerFactory;
import com.dianping.titans.ui.ITitleBar;
import com.dianping.titans.ui.TitansUIManager;
import com.dianping.titans.widget.DefaultTitleBar;
import com.dianping.titans.widget.TitansWebView;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.android.neohybrid.framework.neo.js.WebKNBInterface;
import com.meituan.android.neohybrid.framework.neo.js.h;
import com.meituan.android.neohybrid.framework.neo.js.i;
import com.meituan.android.neohybrid.framework.neo.js.j;
import com.meituan.android.neohybrid.protocol.kernel.c;
import com.meituan.android.neohybrid.protocol.kernel.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBTitansXSync;
import com.sankuai.meituan.android.knb.listener.OnWebViewInitFailedListener;
import com.sankuai.meituan.android.knb.multiprocess.PublishReceiverManager;
import com.sankuai.titans.base.utils.ProcessUtils;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends com.meituan.android.neohybrid.framework.neo.js.a implements com.meituan.android.neohybrid.framework.webcompat.b {
    public static ChangeQuickRedirect a;
    private final String e;
    private Context f;
    private c<WebView> g;
    private d h;
    private View i;
    private com.meituan.android.neohybrid.framework.webcompat.element.a j;
    private TitansUIManager k;
    private Object l;
    private boolean m;

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void a(int i, int i2, Intent intent) {
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void a(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void a(Activity activity) {
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "916e545e8d1ca4daab6f6a836bd108e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "916e545e8d1ca4daab6f6a836bd108e3");
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void a(OnWebViewInitFailedListener onWebViewInitFailedListener) {
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bd3dfaeeae90f06764c7d24910c71c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bd3dfaeeae90f06764c7d24910c71c5");
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ded27a450505c5d8d52e8fc13ae8f54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ded27a450505c5d8d52e8fc13ae8f54");
        }
    }

    @Override // com.dianping.titans.js.JsHost
    public final void showMask() {
    }

    public b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d6696df5ef86bcd81ce5a1eaaf11a63", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d6696df5ef86bcd81ce5a1eaaf11a63");
            return;
        }
        this.m = false;
        this.e = str;
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void a(@NonNull Context context, @NonNull Bundle bundle) {
        Object[] objArr = {context, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a37be71f7c9c43405c163c214f1d14ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a37be71f7c9c43405c163c214f1d14ce");
        } else {
            this.f = context;
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        c<WebView> cVar;
        Object[] objArr = {layoutInflater, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9cdc33b1d4893a951298b4f8a80498f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9cdc33b1d4893a951298b4f8a80498f");
        }
        this.i = layoutInflater.inflate(R.layout.layout_neo_fragment, (ViewGroup) null, false);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e74cfc31653eaaec1bbfa77c62d032f", RobustBitConfig.DEFAULT_VALUE)) {
            cVar = (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e74cfc31653eaaec1bbfa77c62d032f");
        } else if (KernelConfig.KERNEL_TYPE_RECCE.equals(this.e)) {
            cVar = new com.meituan.android.neohybrid.kernel.wasai.d(this.f, this.l);
            this.h = new com.meituan.android.neohybrid.framework.webcompat.client.a();
            cVar.a(this.h);
        } else {
            TitansWebView titansWebView = new TitansWebView(this.f);
            titansWebView.setOverScrollMode(2);
            com.meituan.android.neohybrid.kernel.webview.b bVar = new com.meituan.android.neohybrid.kernel.webview.b(titansWebView);
            Object[] objArr3 = {titansWebView, this};
            ChangeQuickRedirect changeQuickRedirect3 = h.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f99ffcc3faf992462795573f40b7695a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f99ffcc3faf992462795573f40b7695a");
            } else {
                JsHandlerFactory.addJsHost(this);
                LocalBroadcastManager.getInstance(titansWebView.getContext()).sendBroadcast(new Intent("ACTION_WEBVIEW_INIT"));
                h.a(titansWebView, titansWebView.getSettings());
                if (Build.VERSION.SDK_INT >= 11) {
                    titansWebView.removeJavascriptInterface("searchBoxJavaBridge_");
                }
                titansWebView.addJavascriptInterface(new WebKNBInterface(this), "KNBTitansX");
                titansWebView.addJavascriptInterface(new KNBTitansXSync(this), "KNBTitansXSync");
            }
            this.h = new com.meituan.android.neohybrid.framework.webcompat.client.a();
            titansWebView.setWebViewClient(new com.meituan.android.neohybrid.framework.titans.delegate.c(this.g, this.h, new j(this)));
            bVar.a(this.h, false);
            titansWebView.setWebChromeClient(new i(this));
            cVar = bVar;
        }
        this.g = cVar;
        ((RelativeLayout) this.i.findViewById(R.id.webview_container)).addView(this.g.j(), new ViewGroup.LayoutParams(-1, -1));
        DefaultTitleBar defaultTitleBar = new DefaultTitleBar(this.f);
        ((LinearLayout) this.i.findViewById(R.id.lay_web_parent)).addView(defaultTitleBar, 0, new ViewGroup.LayoutParams(-1, this.f.getResources().getDimensionPixelSize(R.dimen.titlebar_height)));
        this.j = new a(defaultTitleBar, (ImageView) this.i.findViewById(R.id.iv_titleshadow));
        return this.i;
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83b47c21b4b627b4d35c3e7cc6086152", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83b47c21b4b627b4d35c3e7cc6086152");
        } else if (this.g != null) {
            if (this.m) {
                this.g.i();
            } else {
                this.g.f();
            }
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f1c8791b7c7986f1cf0408581eb1c25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f1c8791b7c7986f1cf0408581eb1c25");
        } else if (this.g != null) {
            if (ProcessUtils.isBackground(this.f)) {
                this.g.h();
                this.m = true;
                return;
            }
            this.g.g();
            this.m = false;
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4714682958c2f7b823d3e99f09f56e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4714682958c2f7b823d3e99f09f56e0");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.framework.neo.js.a.b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76495287befebbb5d846f2bbea846097", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76495287befebbb5d846f2bbea846097");
        } else {
            if (getWebView() != null) {
                getWebView().removeAllViews();
                getWebView().destroy();
            }
            if (this.c && getContext() != null) {
                PublishReceiverManager.unregisterReceiver(getContext());
            }
        }
        if (this.g != null) {
            this.g.e();
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81631b67da83e283d38eeb43e67eabd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81631b67da83e283d38eeb43e67eabd6");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.framework.neo.js.a.b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "248dec8692046e4f05e8fff8df4ccef2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "248dec8692046e4f05e8fff8df4ccef2");
        } else {
            getTitleBarHost().performLLClick();
        }
    }

    @Override // com.meituan.android.neohybrid.framework.neo.js.a, com.dianping.titans.js.JsHost
    public final Context getContext() {
        return this.f;
    }

    @Override // com.meituan.android.neohybrid.framework.neo.js.a, com.meituan.android.neohybrid.framework.webcompat.b
    public final c<WebView> g() {
        return this.g;
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final com.meituan.android.neohybrid.framework.webcompat.element.a h() {
        return this.j;
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void a(Object obj) {
        this.l = obj;
    }

    @Override // com.meituan.android.neohybrid.framework.neo.js.a, com.dianping.titans.js.JsHost
    public final void setUIManager(TitansUIManager titansUIManager) {
        this.k = titansUIManager;
    }

    @Override // com.meituan.android.neohybrid.framework.neo.js.a, com.dianping.titans.js.JsHost
    public final ITitleBar getTitleBarHost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed8dff0466402c836d1bf8dfb9279597", RobustBitConfig.DEFAULT_VALUE) ? (ITitleBar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed8dff0466402c836d1bf8dfb9279597") : (ITitleBar) this.j.a();
    }

    @Override // com.dianping.titans.js.JsHost
    public final void setTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68d769e4b93926f40db4f7a81c6dbfe4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68d769e4b93926f40db4f7a81c6dbfe4");
        } else {
            ((DefaultTitleBar) this.j.a()).setWebTitle(str);
        }
    }
}
