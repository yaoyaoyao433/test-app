package com.sankuai.eh.component.web.module;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebCompat;
import com.sankuai.meituan.android.knb.listener.AbsOnWebChromeClientListener;
import com.sankuai.meituan.android.knb.listener.OnAnalyzeParamsListener;
import com.sankuai.meituan.android.knb.listener.OnWebClientListenerV2;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class f extends i {
    public static ChangeQuickRedirect c;
    public KNBWebCompat d;

    public abstract OnAnalyzeParamsListener a();

    private f(c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd3604527c34da9323fd4de7b0c5a86c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd3604527c34da9323fd4de7b0c5a86c");
        }
    }

    public f(KNBWebCompat kNBWebCompat, c cVar) {
        this(cVar);
        Object[] objArr = {kNBWebCompat, cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bbbf0f0dc0f94d32f6a8ea11093fe2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bbbf0f0dc0f94d32f6a8ea11093fe2f");
        } else {
            this.d = kNBWebCompat;
        }
    }

    @Override // com.sankuai.eh.component.web.module.i, com.sankuai.eh.component.web.module.j
    public final void a(Context context, Bundle bundle) {
        Object[] objArr = {context, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "430925c26b8be2210c125df069a42d1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "430925c26b8be2210c125df069a42d1f");
            return;
        }
        this.d.onCreate(context, bundle);
        this.d.setOnAppendUAListener(g.a());
        if (this.f != null) {
            this.f.n = this.d;
        }
        super.a(context, bundle);
    }

    public static /* synthetic */ String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf0901ed2ae9b939c094a5842bbb9d45", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf0901ed2ae9b939c094a5842bbb9d45") : com.sankuai.eh.component.service.env.a.b;
    }

    @Override // com.sankuai.eh.component.web.module.i, com.sankuai.eh.component.web.module.j
    public final View a(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a33d7ec7e9fed4dad74bdf0ced32ccd1", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a33d7ec7e9fed4dad74bdf0ced32ccd1");
        }
        View view = null;
        try {
            view = this.d.onCreateView(layoutInflater, viewGroup);
        } catch (InflateException | ClassCastException e) {
            com.dianping.codelog.b.b(f.class, "onCreteView exception", e.getMessage());
            com.sankuai.meituan.android.ui.widget.a.a(this.f.i, "手机环境异常,请稍后重试", -1);
            this.f.i.finish();
        }
        this.d.setOnWebViewClientListener(new b());
        this.d.setOnWebChromeClientListener(new a());
        if (this.f != null && ((Boolean) this.f.d("notitlebar", Boolean.FALSE)).booleanValue()) {
            this.d.getWebSettings().invisibleTitleBar();
        }
        super.a(layoutInflater, viewGroup);
        return view;
    }

    @Override // com.sankuai.eh.component.web.module.i, com.sankuai.eh.component.web.module.j
    public final void a(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "debb232bb06c1498c2036f813714d286", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "debb232bb06c1498c2036f813714d286");
        } else {
            super.a(view, bundle);
        }
    }

    @Override // com.sankuai.eh.component.web.module.i, com.sankuai.eh.component.web.module.j
    public final void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53d29e427bdfa513ef727cf9ced0bdf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53d29e427bdfa513ef727cf9ced0bdf9");
            return;
        }
        this.d.setOnAnalyzeParamsListener(a());
        this.d.onActivityCreated(bundle);
        if (this.f != null && this.d.getWebView() != null) {
            this.f.k = this.d.getWebView();
            com.sankuai.eh.component.web.bridge.b bVar = new com.sankuai.eh.component.web.bridge.b(this.f.i);
            bVar.b = this.f;
            this.f.k.addJavascriptInterface(bVar, "__ehc_native__");
            this.f.b("ua", this.d.getWebView().getSettings().getUserAgentString());
        }
        super.a(bundle);
    }

    @Override // com.sankuai.eh.component.web.module.i, com.sankuai.eh.component.web.module.j
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "293fd5d8d51a95dcecfe1e41d1f7cfc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "293fd5d8d51a95dcecfe1e41d1f7cfc4");
            return;
        }
        this.d.onStart();
        super.b();
    }

    @Override // com.sankuai.eh.component.web.module.i, com.sankuai.eh.component.web.module.j
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef2bbec605e628ed9582216b1e561572", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef2bbec605e628ed9582216b1e561572");
            return;
        }
        this.d.onResume();
        super.c();
    }

    @Override // com.sankuai.eh.component.web.module.i, com.sankuai.eh.component.web.module.j
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0851e6a19d49a149a05533da4d5ab60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0851e6a19d49a149a05533da4d5ab60");
            return;
        }
        this.d.onPause();
        super.d();
    }

    @Override // com.sankuai.eh.component.web.module.i, com.sankuai.eh.component.web.module.j
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fc56b4340f552924c6e7b6a88a5e994", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fc56b4340f552924c6e7b6a88a5e994");
            return;
        }
        this.d.onStop();
        super.e();
    }

    @Override // com.sankuai.eh.component.web.module.i, com.sankuai.eh.component.web.module.j
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4229426983df927189e75ea2faa020b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4229426983df927189e75ea2faa020b1");
            return;
        }
        this.d.onDestroy();
        super.f();
    }

    @Override // com.sankuai.eh.component.web.module.i, com.sankuai.eh.component.web.module.j
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "119d64677e05f5f8c21c03576ca83c37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "119d64677e05f5f8c21c03576ca83c37");
            return;
        }
        this.d.onBackPressed();
        super.g();
    }

    @Override // com.sankuai.eh.component.web.module.i, com.sankuai.eh.component.web.module.j
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "181cadf015032c13e43fe12d027847c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "181cadf015032c13e43fe12d027847c6");
            return;
        }
        this.d.onActivityResult(i, i2, intent);
        super.a(i, i, intent);
    }

    @Override // com.sankuai.eh.component.web.module.i, com.sankuai.eh.component.web.module.j
    public final void a(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b764d16d0800b446dab7e1de8fb1b1d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b764d16d0800b446dab7e1de8fb1b1d2");
            return;
        }
        this.d.onRequestPermissionsResult(i, strArr, iArr);
        super.a(i, strArr, iArr);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class b implements OnWebClientListenerV2 {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
        public final void onReceivedError(int i, String str, String str2) {
        }

        @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
        public final void onReceivedSslError(SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        public b() {
        }

        @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListenerV2
        public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            Object[] objArr = {webView, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fac82cf59dad7f721cebb8ccfacc1637", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fac82cf59dad7f721cebb8ccfacc1637");
            } else {
                f.this.a(str, z);
            }
        }

        @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
        public final boolean shouldOverrideUrlLoading(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e89c7465cc3097ae5f348903b9877eab", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e89c7465cc3097ae5f348903b9877eab")).booleanValue() : f.this.a(str);
        }

        @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
        public final void onPageStarted(String str, Bitmap bitmap) {
            int a2;
            boolean z = true;
            Object[] objArr = {str, bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb2e0f1a2789833cdbbf69b89d9adddd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb2e0f1a2789833cdbbf69b89d9adddd");
                return;
            }
            if (f.this.f != null) {
                h hVar = f.this.f.f;
                Object[] objArr2 = {hVar};
                ChangeQuickRedirect changeQuickRedirect2 = e.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a95f8905ecb953cc8d23effa816933ff", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a95f8905ecb953cc8d23effa816933ff")).booleanValue();
                } else if (hVar != null && hVar.d != null && ((a2 = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.a(hVar.e, "data", "ux", "useProgressBar"), 0)) != 0 ? a2 != 1 : hVar.d.a("skeleton"))) {
                    z = false;
                }
                if (!z) {
                    f.this.d.getTitleBarHost().showProgressBar(false);
                }
            }
            f.this.a(str, bitmap);
        }

        @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
        public final void onPageFinished(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e5a0252b25f8f8f340b942e00304a6a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e5a0252b25f8f8f340b942e00304a6a");
            } else {
                f.this.b(str);
            }
        }
    }

    public final WebView h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e12ffbcd419502570840cb3f99b8a151", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e12ffbcd419502570840cb3f99b8a151");
        }
        if (this.d != null) {
            return this.d.getWebView();
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class a extends AbsOnWebChromeClientListener {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // com.sankuai.meituan.android.knb.listener.AbsOnWebChromeClientListener, com.sankuai.meituan.android.knb.listener.OnWebChromeClientListener
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Object[] objArr = {consoleMessage};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f286162e34a5588a712bf63a87e64ee", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f286162e34a5588a712bf63a87e64ee")).booleanValue() : f.this.a(consoleMessage);
        }
    }
}
