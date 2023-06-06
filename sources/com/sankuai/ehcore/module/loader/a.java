package com.sankuai.ehcore.module.loader;

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
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.thread.a;
import com.sankuai.meituan.android.knb.TitansXWebView;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    boolean b;
    boolean c;
    TitansXWebView d;
    boolean e;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a32fe5c969868c1910fb9124626c3f10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a32fe5c969868c1910fb9124626c3f10");
            return;
        }
        this.b = false;
        this.c = false;
        this.e = false;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.ehcore.module.loader.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0570a {
        private static a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38f18f86f8e4b4effafef510eae7740c", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38f18f86f8e4b4effafef510eae7740c") : C0570a.a;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2993e4d159fcadbae7169baf548764cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2993e4d159fcadbae7169baf548764cd");
        } else if (this.c || this.e || f() != i || !e() || a(com.sankuai.ehcore.horn.e.d())) {
        } else {
            this.c = true;
            a(com.sankuai.ehcore.horn.e.d(), com.sankuai.ehcore.module.loader.b.a(this));
        }
    }

    public final void a(String str, JsonElement jsonElement, int i) {
        Object[] objArr = {str, jsonElement, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ffc9311b55e97aee4d46665f32e4be7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ffc9311b55e97aee4d46665f32e4be7");
        } else if (!e() || this.e || a(jsonElement) || com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST)).size() <= 0) {
        } else {
            if (c() != 1 || this.b) {
                com.sankuai.ehcore.util.a.a("eh_report", new d.b().a("name", "eh.report").a("event", "bizPrefetch").a("url", str).b);
                if (i == com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(jsonElement, "timing"), -1)) {
                    if (c() == 1) {
                        if (this.d != null && this.b) {
                            a(a(this.d), com.sankuai.eh.component.service.utils.b.a(jsonElement, "pattern", new JsonPrimitive(str)));
                            return;
                        } else if (this.d == null) {
                            a(jsonElement, com.sankuai.ehcore.module.loader.c.a(this, jsonElement, str));
                            return;
                        } else {
                            return;
                        }
                    }
                    a(jsonElement, d.a(this, jsonElement, str));
                }
            }
        }
    }

    void a(WebView webView, JsonElement jsonElement) {
        Object[] objArr = {webView, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbad6f75dbe6c68e24c3c26e8d2bac2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbad6f75dbe6c68e24c3c26e8d2bac2d");
        } else if (jsonElement == null || webView == null) {
        } else {
            webView.evaluateJavascript("javascript:prefetch(" + com.sankuai.eh.component.service.utils.b.a(jsonElement) + CommonConstant.Symbol.BRACKET_RIGHT, null);
        }
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d01e645ab46ebcb9c26aba6f0ddf4fa5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d01e645ab46ebcb9c26aba6f0ddf4fa5")).booleanValue() : com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(com.sankuai.ehcore.horn.e.d(), "enabled"), false).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TitansXWebView b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "782ef09349f67c96d972fd02e1a956ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (TitansXWebView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "782ef09349f67c96d972fd02e1a956ab");
        }
        TitansXWebView titansXWebView = new TitansXWebView(com.sankuai.ehcore.b.a());
        c(titansXWebView);
        titansXWebView.loadUrl("https://portal-portm.meituan.com/eh/files/" + d());
        if (c() == 2) {
            b(titansXWebView);
        }
        return titansXWebView;
    }

    private void b(TitansXWebView titansXWebView) {
        Object[] objArr = {titansXWebView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72234e8878533f01fc9852b0778ab832", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72234e8878533f01fc9852b0778ab832");
        } else {
            new Handler(Looper.myLooper()).postDelayed(new com.sankuai.eh.component.service.utils.thread.a(e.a(titansXWebView)), com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(com.sankuai.ehcore.horn.e.d(), "delayDestroy"), 10000));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1333de597622f8a12de54e89f2dbae20", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1333de597622f8a12de54e89f2dbae20")).intValue() : com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(com.sankuai.ehcore.horn.e.d(), JsBridgeResult.ARG_KEY_LOCATION_MODE), 2);
    }

    private int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7719470c3a20672d5e3d54dff776473", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7719470c3a20672d5e3d54dff776473")).intValue() : com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(com.sankuai.ehcore.horn.e.d(), "timing"), 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54060c0e4eaf19785ce73ceea0543065", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54060c0e4eaf19785ce73ceea0543065") : com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(com.sankuai.ehcore.horn.e.d(), "path"), "");
    }

    WebView a(TitansXWebView titansXWebView) {
        Object[] objArr = {titansXWebView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "018acbbb90cddda00c5826680c66347a", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "018acbbb90cddda00c5826680c66347a");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c20c2b49dd8752478676654c5701c80c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c20c2b49dd8752478676654c5701c80c")).booleanValue();
        }
        if (com.sankuai.eh.component.service.utils.f.a(jsonElement)) {
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

    private void c(TitansXWebView titansXWebView) {
        Object[] objArr = {titansXWebView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0558267fc9a51a0411accff4e74b06c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0558267fc9a51a0411accff4e74b06c1");
            return;
        }
        if (titansXWebView.getSettings() != null) {
            String userAgentString = titansXWebView.getSettings().getUserAgentString();
            WebSettings settings = titansXWebView.getSettings();
            settings.setUserAgentString(userAgentString + " EH/8.1.0 android/" + Build.VERSION.SDK_INT);
        }
        if (a(titansXWebView) != null) {
            a(titansXWebView).addJavascriptInterface(new b(), "ehloader");
        }
    }

    private void a(JsonElement jsonElement, a.InterfaceC0552a interfaceC0552a) {
        Object[] objArr = {jsonElement, interfaceC0552a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31fa57303a71934d78c577b999b0056f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31fa57303a71934d78c577b999b0056f");
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new com.sankuai.eh.component.service.utils.thread.a(interfaceC0552a), com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(jsonElement, "delay"), 5000));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class b {
        public static ChangeQuickRedirect a;

        public b() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edf551296d03bc5960c94f019ecefa40", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edf551296d03bc5960c94f019ecefa40");
            }
        }

        @JavascriptInterface
        public final void log(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d445086f51a4e93515607750300196c1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d445086f51a4e93515607750300196c1");
            } else {
                com.sankuai.eh.component.service.tools.d.a("prefetch_log", str);
            }
        }

        @JavascriptInterface
        public final void jsCallBack(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffe3b9995d75039a29329064660fcdf9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffe3b9995d75039a29329064660fcdf9");
                return;
            }
            com.sankuai.eh.component.service.tools.d.a("prefetch_callback", str);
            if (TextUtils.isEmpty(com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.utils.b.a(str), "event"), ""))) {
                return;
            }
            com.sankuai.ehcore.util.a.a("eh_report", new d.b().a("name", "eh.report").a((Map) com.sankuai.eh.component.service.utils.b.a(str, new TypeToken<Map<String, Object>>() { // from class: com.sankuai.ehcore.module.loader.a.b.1
            }.getType())).b);
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "225ae0340a6df928e26114738e0359d4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "225ae0340a6df928e26114738e0359d4");
            } else {
                this.a = titansXWebView;
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Object[] objArr = {webView, renderProcessGoneDetail};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8166e45d266f518b0c031a688bdf889", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8166e45d266f518b0c031a688bdf889")).booleanValue();
            }
            if (!renderProcessGoneDetail.didCrash() && a.this.c() == 1) {
                if (this.a != null) {
                    this.a.destroy();
                    this.a = null;
                }
                new Handler(Looper.getMainLooper()).post(f.a(this));
            }
            if (renderProcessGoneDetail.didCrash()) {
                if (this.a != null) {
                    this.a.destroy();
                }
                a.this.e = true;
            }
            com.sankuai.ehcore.util.a.a("eh_report", new d.b().a("name", "eh.report").a("event", "renderCrash").a("didCrash", Boolean.valueOf(renderProcessGoneDetail.didCrash())).b);
            return true;
        }

        public static /* synthetic */ void a(c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a1918a4e3188570abfc12dab30a4a5f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a1918a4e3188570abfc12dab30a4a5f");
            } else {
                cVar.a = a.this.b();
            }
        }
    }
}
