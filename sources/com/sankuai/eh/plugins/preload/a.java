package com.sankuai.eh.plugins.preload;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.f;
import com.sankuai.eh.component.service.utils.thread.a;
import com.sankuai.meituan.android.knb.TitansXWebView;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    TitansXWebView b;
    boolean c;
    public JsonElement d;
    private boolean e;
    private boolean f;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79a073b1234adbacbfd8b7be16fc50bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79a073b1234adbacbfd8b7be16fc50bb");
            return;
        }
        this.e = false;
        this.f = false;
        this.c = false;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.eh.plugins.preload.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0563a {
        private static a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23035808a8e73bf7dc4641bca0f9bb9f", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23035808a8e73bf7dc4641bca0f9bb9f") : C0563a.a;
    }

    public final void a(String str, JsonElement jsonElement, int i) {
        Object[] objArr = {str, jsonElement, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa3ba4cafd8b805c9754e2e7a2f99ccf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa3ba4cafd8b805c9754e2e7a2f99ccf");
        } else if (!d() || this.c || a(jsonElement) || com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST)).size() <= 0 || TextUtils.isEmpty(e())) {
        } else {
            if (c() != 1 || this.e) {
                com.sankuai.eh.component.service.tools.d.b("bizPrefetch", new d.b().a("url", str).b, null);
                if (i == com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(jsonElement, "timing"), 1)) {
                    if (c() == 1) {
                        if (this.b != null && this.e) {
                            a(a(this.b), com.sankuai.eh.component.service.utils.b.a(jsonElement, "pattern", new JsonPrimitive(str)));
                            return;
                        } else if (this.b == null) {
                            a(jsonElement, com.sankuai.eh.plugins.preload.b.a(this, jsonElement, str));
                            return;
                        } else {
                            return;
                        }
                    }
                    a(jsonElement, com.sankuai.eh.plugins.preload.c.a(this, jsonElement, str));
                }
            }
        }
    }

    void a(WebView webView, JsonElement jsonElement) {
        Object[] objArr = {webView, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19f3470d752e6c75aaf2e6e7de19f521", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19f3470d752e6c75aaf2e6e7de19f521");
        } else if (jsonElement == null || webView == null) {
        } else {
            webView.evaluateJavascript("javascript:prefetch(" + com.sankuai.eh.component.service.utils.b.a(jsonElement) + CommonConstant.Symbol.BRACKET_RIGHT, null);
        }
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd8559d4b7e04f3370a216b1b34f1a08", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd8559d4b7e04f3370a216b1b34f1a08")).booleanValue() : this.d != null && com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(this.d, "enabled"), true).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TitansXWebView b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b5d76c01e6ace7cedbd23f789764f63", RobustBitConfig.DEFAULT_VALUE)) {
            return (TitansXWebView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b5d76c01e6ace7cedbd23f789764f63");
        }
        TitansXWebView titansXWebView = new TitansXWebView(com.sankuai.eh.component.service.a.b());
        Object[] objArr2 = {titansXWebView};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "573be489fb374ae5e1fe69aec8019bff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "573be489fb374ae5e1fe69aec8019bff");
        } else {
            if (titansXWebView.getSettings() != null) {
                String userAgentString = titansXWebView.getSettings().getUserAgentString();
                WebSettings settings = titansXWebView.getSettings();
                settings.setUserAgentString(userAgentString + StringUtil.SPACE + com.sankuai.eh.component.service.env.a.b + " android/" + Build.VERSION.SDK_INT);
            }
            if (a(titansXWebView) != null) {
                a(titansXWebView).addJavascriptInterface(new b(), "ehloader");
            }
        }
        titansXWebView.loadUrl(e());
        if (c() == 2) {
            Object[] objArr3 = {titansXWebView};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3ca5808853c769ffd4c6035a4c9f81e3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3ca5808853c769ffd4c6035a4c9f81e3");
            } else {
                int a2 = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(this.d, "delayDestroy"), 10000);
                Handler handler = new Handler(Looper.myLooper());
                Object[] objArr4 = {titansXWebView};
                ChangeQuickRedirect changeQuickRedirect4 = d.a;
                handler.postDelayed(new com.sankuai.eh.component.service.utils.thread.a(PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "71de9d3293b807bba781aa2db7eea913", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "71de9d3293b807bba781aa2db7eea913") : new d(titansXWebView)), a2);
            }
        }
        return titansXWebView;
    }

    int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7064c411719a3c3f1fe17ae330da16bb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7064c411719a3c3f1fe17ae330da16bb")).intValue() : com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(this.d, JsBridgeResult.ARG_KEY_LOCATION_MODE), 2);
    }

    private String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d855d660ba246f497a1601ae262ee973", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d855d660ba246f497a1601ae262ee973") : com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(this.d, "path"), "");
    }

    WebView a(TitansXWebView titansXWebView) {
        Object[] objArr = {titansXWebView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbddf3c3be5d922639ef52b62c5ce564", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbddf3c3be5d922639ef52b62c5ce564");
        }
        if (titansXWebView == null || titansXWebView.getmKnbWebCompat() == null) {
            return null;
        }
        return titansXWebView.getmKnbWebCompat().getWebView();
    }

    private boolean a(JsonElement jsonElement) {
        boolean z;
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94a3c57744540330d54f85a1cdc73b57", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94a3c57744540330d54f85a1cdc73b57")).booleanValue();
        }
        if (f.a(jsonElement)) {
            JsonArray b2 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "osAndroid"));
            JsonArray b3 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "sdkAndroid"));
            for (int i = 0; b2 != null && i < b2.size(); i++) {
                if (com.sankuai.eh.component.service.utils.a.c().equals(com.sankuai.eh.component.service.utils.b.b(b2.get(i), ""))) {
                    z = true;
                    break;
                }
            }
            z = false;
            for (int i2 = 0; b3 != null && i2 < b3.size(); i2++) {
                if (Build.VERSION.SDK_INT == com.sankuai.eh.component.service.utils.b.a(b3.get(i2), -1)) {
                    return true;
                }
            }
            return z;
        }
        return true;
    }

    private void a(JsonElement jsonElement, a.InterfaceC0552a interfaceC0552a) {
        Object[] objArr = {jsonElement, interfaceC0552a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "173c5f4c36804617795cd8ec3d91c6ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "173c5f4c36804617795cd8ec3d91c6ca");
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new com.sankuai.eh.component.service.utils.thread.a(interfaceC0552a), com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(jsonElement, "delay"), 5000));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class b {
        public static ChangeQuickRedirect a;

        public b() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "233f3585f2d92c5369a56b47c831a27e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "233f3585f2d92c5369a56b47c831a27e");
            }
        }

        @JavascriptInterface
        public final void log(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c635358374ce5c58078aa8e2e53a1516", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c635358374ce5c58078aa8e2e53a1516");
            } else {
                com.sankuai.eh.component.service.tools.d.a("prefetch_log", str);
            }
        }

        @JavascriptInterface
        public final void jsCallBack(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36caf28cc170901c0a685039f17d36f2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36caf28cc170901c0a685039f17d36f2");
                return;
            }
            com.sankuai.eh.component.service.tools.d.a("prefetch_callback", str);
            if (TextUtils.isEmpty(com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.utils.b.a(str), "event"), ""))) {
                return;
            }
            com.sankuai.eh.component.service.tools.d.b("res_fetch", new d.b().a((Map) com.sankuai.eh.component.service.utils.b.a(str, new TypeToken<Map<String, Object>>() { // from class: com.sankuai.eh.plugins.preload.a.b.1
            }.getType())).b, null);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class c extends WebViewClient {
        public static ChangeQuickRedirect f;
        private TitansXWebView a;

        public c(TitansXWebView titansXWebView) {
            Object[] objArr = {a.this, titansXWebView};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e9db05a925fe8a38bf3efb7b6fa2399", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e9db05a925fe8a38bf3efb7b6fa2399");
            } else {
                this.a = titansXWebView;
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Object[] objArr = {webView, renderProcessGoneDetail};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "141ed7fb3bbb58baa52d31c34acfb175", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "141ed7fb3bbb58baa52d31c34acfb175")).booleanValue();
            }
            if (!renderProcessGoneDetail.didCrash() && a.this.c() == 1) {
                if (this.a != null) {
                    this.a.destroy();
                    this.a = null;
                }
                new Handler(Looper.getMainLooper()).post(e.a(this));
            }
            if (renderProcessGoneDetail.didCrash()) {
                if (this.a != null) {
                    this.a.destroy();
                }
                a.this.c = true;
            }
            com.sankuai.eh.component.service.tools.d.b("renderCrash", new d.b().a("didCrash", Boolean.valueOf(renderProcessGoneDetail.didCrash())).b, null);
            return true;
        }

        public static /* synthetic */ void a(c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e99d6f3e788740d9b9d9f7d3cf5ef659", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e99d6f3e788740d9b9d9f7d3cf5ef659");
            } else {
                cVar.a = a.this.b();
            }
        }
    }
}
