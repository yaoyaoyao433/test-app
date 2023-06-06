package com.sankuai.waimai.platform.modular.block.offline;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.platform.modular.block.offline.a {
    public static ChangeQuickRedirect d = null;
    private static boolean g = false;
    public boolean e;
    a f;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(ConsoleMessage consoleMessage);
    }

    public static void a(boolean z) {
        g = z;
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d5e8931f435efd70403b6b81e735bda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d5e8931f435efd70403b6b81e735bda");
        } else {
            this.e = true;
        }
    }

    @SuppressLint({"SetJavaScriptEnabled", "ClickableViewAccessibility"})
    public final void a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c799fef4dd8213cfaa943d9fcc19f791", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c799fef4dd8213cfaa943d9fcc19f791");
            return;
        }
        WebView webView = new WebView(this.b);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setWebChromeClient(new WebChromeClient() { // from class: com.sankuai.waimai.platform.modular.block.offline.b.1
            public static ChangeQuickRedirect a;

            @Override // android.webkit.WebChromeClient
            public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                Object[] objArr2 = {consoleMessage};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "861668e8c97460b0cef5cf52d4a144d6", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "861668e8c97460b0cef5cf52d4a144d6")).booleanValue();
                }
                com.sankuai.waimai.imbase.log.a.b("KNBOfflineModule", consoleMessage.message(), new Object[0]);
                if (b.this.f != null) {
                    b.this.f.a(consoleMessage);
                }
                return false;
            }
        });
        webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.platform.modular.block.offline.b.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "923269254f1a806bc10e5d733fd10e61", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "923269254f1a806bc10e5d733fd10e61")).booleanValue();
                }
                int action = motionEvent.getAction();
                if (action == 0 && b.this.e && action == 0) {
                    b.this.b();
                }
                return false;
            }
        });
        this.c = webView;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a91707d7223d64ecd6ed1f3515c8184", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a91707d7223d64ecd6ed1f3515c8184");
        } else if (TextUtils.isEmpty(str) || this.c == null) {
        } else {
            ((WebView) this.c).onResume();
            ((WebView) this.c).loadUrl(str);
            this.e = false;
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d0e3b21affe86f2fc875964a86e3211", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d0e3b21affe86f2fc875964a86e3211");
        } else if (this.c != null) {
            ((WebView) this.c).onResume();
            this.e = false;
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d514884661c3f2f3660675e2d72abd74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d514884661c3f2f3660675e2d72abd74");
            return;
        }
        if (this.c != null) {
            ((WebView) this.c).onPause();
        }
        this.e = true;
    }
}
