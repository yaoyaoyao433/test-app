package com.sankuai.waimai.business.user.base;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.net.e;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class BaseWebViewActivity extends BaseActivity {
    private static final List<String> a = Arrays.asList("tel", "geo", "mailto", "imeituan", "meituanpayment", UserCenter.OAUTH_TYPE_WEIXIN, "mqqapi", "meituanwaimai");
    public static ChangeQuickRedirect b;
    protected ProgressBar c;
    protected WebView d;
    protected View e;
    protected LinearLayout f;
    protected LinearLayout g;
    protected ImageView h;
    protected ImageView i;
    protected ImageView j;
    protected String k;
    File l;
    private ValueCallback<Uri> m;

    public boolean a(WebView webView, String str) {
        return true;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e10ecc5dd33be87050fd73cc5644320b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e10ecc5dd33be87050fd73cc5644320b");
            return;
        }
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(null);
        getWindow().setFormat(1);
        setContentView(R.layout.takeout_activity_webview);
        this.f = (LinearLayout) findViewById(R.id.ll_webview_container);
        this.c = (ProgressBar) findViewById(R.id.top_progress);
        this.d = new WebView(this);
        this.d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f.addView(this.d);
        this.e = findViewById(R.id.center_progress);
        this.g = (LinearLayout) findViewById(R.id.ll_toolbar);
        this.h = (ImageView) findViewById(R.id.img_back);
        this.i = (ImageView) findViewById(R.id.img_forward);
        this.j = (ImageView) findViewById(R.id.img_refresh);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.user.base.BaseWebViewActivity.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2635942e4ec1880867078d72c134e183", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2635942e4ec1880867078d72c134e183");
                } else if (BaseWebViewActivity.this.d == null || !BaseWebViewActivity.this.d.canGoBack()) {
                } else {
                    BaseWebViewActivity.this.b();
                    BaseWebViewActivity.this.d.goBack();
                }
            }
        });
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.user.base.BaseWebViewActivity.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e3b38374147b123d88aa2a21c6657b9", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e3b38374147b123d88aa2a21c6657b9");
                } else if (BaseWebViewActivity.this.d == null || !BaseWebViewActivity.this.d.canGoForward()) {
                } else {
                    BaseWebViewActivity.this.b();
                    BaseWebViewActivity.this.d.goForward();
                }
            }
        });
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.user.base.BaseWebViewActivity.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16197b676cded5def34dbe5be13fb9e7", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16197b676cded5def34dbe5be13fb9e7");
                } else if (BaseWebViewActivity.this.d != null) {
                    BaseWebViewActivity.this.b();
                    BaseWebViewActivity.this.d.reload();
                }
            }
        });
        this.d.setHorizontalScrollBarEnabled(false);
        this.d.getSettings().setJavaScriptEnabled(true);
        this.d.setWebChromeClient(new b());
        this.d.setWebViewClient(new c());
        this.d.setDownloadListener(new a());
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d9635f7e64a63d76113b0080fbb2a48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d9635f7e64a63d76113b0080fbb2a48");
        } else {
            super.onStart();
        }
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d7cc7e49e4ff88a7feb187aa6a468ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d7cc7e49e4ff88a7feb187aa6a468ae");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        try {
            if (parse.getScheme() != null && "http".equalsIgnoreCase(parse.getScheme())) {
                if (!"android".equals(parse.getQueryParameter("f"))) {
                    buildUpon.appendQueryParameter("f", "android");
                }
                com.sankuai.waimai.platform.domain.manager.user.a i = com.sankuai.waimai.platform.domain.manager.user.a.i();
                if (i.a()) {
                    if (TextUtils.isEmpty(parse.getQueryParameter("token"))) {
                        buildUpon.appendQueryParameter("token", i.e());
                    }
                    if (TextUtils.isEmpty(parse.getQueryParameter("userid"))) {
                        buildUpon.appendQueryParameter("userid", String.valueOf(i.d()));
                    }
                }
                if (TextUtils.isEmpty(parse.getQueryParameter("version"))) {
                    buildUpon.appendQueryParameter("version", String.valueOf(com.sankuai.waimai.platform.b.A().j()));
                }
            }
            Map<String, String> b2 = e.b();
            if (b2 != null) {
                for (String str2 : b2.keySet()) {
                    if (TextUtils.isEmpty(parse.getQueryParameter(str2))) {
                        buildUpon.appendQueryParameter(str2, b2.get(str2));
                    }
                }
            }
        } catch (Exception unused) {
        }
        return buildUpon.toString();
    }

    public final void b(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f392d1417a762dc8c9bde3d8f17b5e01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f392d1417a762dc8c9bde3d8f17b5e01");
        } else {
            this.d.post(new Runnable() { // from class: com.sankuai.waimai.business.user.base.BaseWebViewActivity.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c9df14c2ddfb3d39d98e6ebbd02d616", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c9df14c2ddfb3d39d98e6ebbd02d616");
                    } else if (BaseWebViewActivity.this.d == null || str == null) {
                    } else {
                        BaseWebViewActivity.this.b();
                        BaseWebViewActivity.this.d.loadUrl(BaseWebViewActivity.this.a(str));
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b91e4f54adb6a5e1b7325bbee747dde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b91e4f54adb6a5e1b7325bbee747dde");
            return;
        }
        super.onDestroy();
        if (this.d != null) {
            this.f.removeView(this.d);
            this.d.removeAllViews();
            this.d.destroy();
        }
    }

    public void a(WebView webView, String str, Bitmap bitmap) {
        Object[] objArr = {webView, str, bitmap};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19e8924216a266712575874869f1add9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19e8924216a266712575874869f1add9");
        } else {
            com.sankuai.waimai.foundation.utils.log.a.b("webview", "onPageStarted", new Object[0]);
        }
    }

    public void b(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4695690091c4016f32ea996c5d6e4996", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4695690091c4016f32ea996c5d6e4996");
        } else {
            com.sankuai.waimai.foundation.utils.log.a.b("webview", "onPageFinished", new Object[0]);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ae61833a32bf1d4b53617acae0984d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ae61833a32bf1d4b53617acae0984d1");
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle.putString("url", this.k);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "685d7eb53922a7217bbe85caaafca140", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "685d7eb53922a7217bbe85caaafca140");
            return;
        }
        super.onRestoreInstanceState(bundle);
        b();
        b(bundle.getString("url"));
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f99b58df285f72092840c7f1d5a238e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f99b58df285f72092840c7f1d5a238e2");
            return;
        }
        if (this.c != null) {
            this.c.setVisibility(0);
        }
        if (this.e != null) {
            this.e.setVisibility(0);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d584664d02249761eced2d7ce46a8dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d584664d02249761eced2d7ce46a8dc");
            return;
        }
        if (this.c != null) {
            this.c.setVisibility(8);
        }
        if (this.e != null) {
            this.e.setVisibility(8);
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e672593685bba7ec6cf02c436ce9faa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e672593685bba7ec6cf02c436ce9faa");
        } else if (this.d.canGoBack()) {
            this.g.setVisibility(0);
            if (this.d.canGoBack()) {
                this.h.setEnabled(true);
            } else {
                this.h.setEnabled(false);
            }
            if (this.d.canGoForward()) {
                this.i.setEnabled(true);
            } else {
                this.i.setEnabled(false);
            }
        } else {
            this.g.setVisibility(8);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "183ea93e3e2d8c0fab14b91b5f8be29a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "183ea93e3e2d8c0fab14b91b5f8be29a");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        if (this.m == null) {
            b_(getString(R.string.wm_main_get_pic_failed));
            com.meituan.android.privacy.aop.a.b();
            return;
        }
        if (i == 12343 && i2 == -1) {
            com.sankuai.waimai.foundation.utils.log.a.b("webview", "onActivityResult ok", new Object[0]);
            Uri data = intent == null ? null : intent.getData();
            if (data != null) {
                String[] strArr = {"_data"};
                Cursor query = getContentResolver().query(data, strArr, null, null, null);
                if (query == null) {
                    b_(getString(R.string.wm_main_get_pic_failed));
                    this.m.onReceiveValue(null);
                    this.m = null;
                    com.meituan.android.privacy.aop.a.b();
                    return;
                }
                query.moveToFirst();
                String string = query.getString(query.getColumnIndex(strArr[0]));
                com.sankuai.waimai.foundation.utils.log.a.b("WebView", "imgPath = " + string, new Object[0]);
                if (string == null) {
                    b_(getString(R.string.wm_main_get_pic_failed));
                    this.m.onReceiveValue(null);
                    this.m = null;
                    com.meituan.android.privacy.aop.a.b();
                    return;
                }
                this.l = new File(string);
            }
            if (this.l == null) {
                b_(getString(R.string.wm_main_get_pic_failed));
                this.m.onReceiveValue(null);
                this.m = null;
                com.meituan.android.privacy.aop.a.b();
                return;
            }
            Uri fromFile = Uri.fromFile(this.l);
            if (fromFile == null || this.m == null) {
                b_(getString(R.string.wm_main_get_pic_failed));
            }
            this.m.onReceiveValue(fromFile);
            this.m = null;
            super.onActivityResult(i, i2, intent);
            com.meituan.android.privacy.aop.a.b();
        }
        this.m.onReceiveValue(null);
        this.m = null;
        super.onActivityResult(i, i2, intent);
        com.meituan.android.privacy.aop.a.b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a implements DownloadListener {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {BaseWebViewActivity.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6881adcce2042ca4dda81ad4c6dc946a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6881adcce2042ca4dda81ad4c6dc946a");
            }
        }

        @Override // android.webkit.DownloadListener
        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            Object[] objArr = {str, str2, str3, str4, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afbb90f0d4b567aa4c387e198a4ec66c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afbb90f0d4b567aa4c387e198a4ec66c");
                return;
            }
            try {
                BaseWebViewActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class c extends WebViewClient {
        public static ChangeQuickRedirect a;

        private c() {
            Object[] objArr = {BaseWebViewActivity.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d1058301fac99667b50705ab60b6675", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d1058301fac99667b50705ab60b6675");
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Object[] objArr = {webView, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8a4bd75e0bb3d5efda2bdb3c7aa9b7c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8a4bd75e0bb3d5efda2bdb3c7aa9b7c")).booleanValue();
            }
            super.shouldOverrideUrlLoading(webView, str);
            Locale locale = Locale.getDefault();
            BaseWebViewActivity.this.k = str;
            try {
                Uri parse = Uri.parse(str);
                if (!TextUtils.isEmpty(parse.getScheme())) {
                    if (BaseWebViewActivity.a.contains(parse.getScheme().toLowerCase(locale))) {
                        BaseWebViewActivity.this.startActivity(new Intent("android.intent.action.VIEW", parse));
                        return true;
                    }
                    BaseWebViewActivity.this.b(str);
                }
            } catch (Exception unused) {
            }
            return BaseWebViewActivity.this.a(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Object[] objArr = {webView, str, bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "822b0f113541ab34b7306f00b6cfb19f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "822b0f113541ab34b7306f00b6cfb19f");
                return;
            }
            super.onPageStarted(webView, str, bitmap);
            BaseWebViewActivity.this.k = str;
            if (BaseWebViewActivity.this.c != null) {
                BaseWebViewActivity.this.c.setVisibility(0);
            }
            BaseWebViewActivity.this.a(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            Object[] objArr = {webView, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6b5dee1ec76cdd2bc2b02d18a2d6ca5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6b5dee1ec76cdd2bc2b02d18a2d6ca5");
                return;
            }
            super.onPageFinished(webView, str);
            BaseWebViewActivity.this.k = str;
            BaseWebViewActivity.this.d();
            BaseWebViewActivity.this.f();
            BaseWebViewActivity.this.b(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            Object[] objArr = {webView, Integer.valueOf(i), str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12756dbbe7b2989d2d28663ae8b77c79", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12756dbbe7b2989d2d28663ae8b77c79");
            } else {
                super.onReceivedError(webView, i, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            Object[] objArr = {webView, sslErrorHandler, sslError};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01d6c281849a5e69929c9ea720af6863", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01d6c281849a5e69929c9ea720af6863");
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class b extends WebChromeClient {
        public static ChangeQuickRedirect a;

        private b() {
            Object[] objArr = {BaseWebViewActivity.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3857808c0873670c1da54282ebb10e2f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3857808c0873670c1da54282ebb10e2f");
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            Object[] objArr = {webView, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f08ca52939b4ccd729795c2b4e0f7d0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f08ca52939b4ccd729795c2b4e0f7d0");
            } else if (i == 100) {
                BaseWebViewActivity.this.d();
                BaseWebViewActivity.this.f();
            } else if (BaseWebViewActivity.this.c != null) {
                BaseWebViewActivity.this.c.setProgress(i);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
            Object[] objArr = {webView, str, str2, jsResult};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99bb61ef57bd01419082e4e17330f727", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99bb61ef57bd01419082e4e17330f727")).booleanValue();
            }
            new RooAlertDialog.a(new ContextThemeWrapper(webView.getContext(), 2131558627)).a(R.string.takeout_dialog_title_tips).b(str2).a(17039370, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.user.base.BaseWebViewActivity.b.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7a8388b2b73eebacad073fad06e3b1b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7a8388b2b73eebacad073fad06e3b1b");
                    } else {
                        jsResult.confirm();
                    }
                }
            }).a(false).b();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
            Object[] objArr = {webView, str, str2, jsResult};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa8eac59b983aca23d61bcbc6e4f244c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa8eac59b983aca23d61bcbc6e4f244c")).booleanValue();
            }
            new RooAlertDialog.a(new ContextThemeWrapper(webView.getContext(), 2131558627)).a(R.string.takeout_dialog_title_tips).b(str2).a(17039370, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.user.base.BaseWebViewActivity.b.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41b572d7510f7492ddb2fa702bac45b0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41b572d7510f7492ddb2fa702bac45b0");
                    } else {
                        jsResult.confirm();
                    }
                }
            }).b(17039360, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.user.base.BaseWebViewActivity.b.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4df7823c01a9feb9972c71818e8800b0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4df7823c01a9feb9972c71818e8800b0");
                    } else {
                        jsResult.cancel();
                    }
                }
            }).a(false).b();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
            Object[] objArr = {webView, str, str2, str3, jsPromptResult};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48c15b7d4d8b8a66d09930b87b4c462c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48c15b7d4d8b8a66d09930b87b4c462c")).booleanValue();
            }
            try {
                CustomDialog.a b = new CustomDialog.a(webView.getContext()).c(R.string.takeout_dialog_title_tips).b(str2);
                Object[] objArr2 = {str3, null};
                ChangeQuickRedirect changeQuickRedirect2 = CustomDialog.a.b;
                if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "57674add02dca69a6e296d24240134c3", RobustBitConfig.DEFAULT_VALUE)) {
                    b = (CustomDialog.a) PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "57674add02dca69a6e296d24240134c3");
                } else {
                    b.c.J = str3;
                    b.c.K = null;
                    b.c.L = true;
                }
                b.a(17039370, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.user.base.BaseWebViewActivity.b.5
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        String obj;
                        Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3735e099a518632f95893567784e9896", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3735e099a518632f95893567784e9896");
                        } else if (dialogInterface == null || !(dialogInterface instanceof CustomDialog)) {
                        } else {
                            JsPromptResult jsPromptResult2 = jsPromptResult;
                            CustomDialog customDialog = (CustomDialog) dialogInterface;
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = CustomDialog.a;
                            if (PatchProxy.isSupport(objArr4, customDialog, changeQuickRedirect4, false, "b2b67632deeb7ea8d0c4da767acfaaf1", RobustBitConfig.DEFAULT_VALUE)) {
                                obj = (String) PatchProxy.accessDispatch(objArr4, customDialog, changeQuickRedirect4, false, "b2b67632deeb7ea8d0c4da767acfaaf1");
                            } else {
                                obj = (customDialog.b == null || customDialog.b.getText() == null) ? null : customDialog.b.getText().toString();
                            }
                            jsPromptResult2.confirm(obj);
                        }
                    }
                }).b(17039360, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.user.base.BaseWebViewActivity.b.4
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6162373af257f4338883e797f1f754ff", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6162373af257f4338883e797f1f754ff");
                        } else {
                            jsPromptResult.cancel();
                        }
                    }
                }).a(false).b();
                return true;
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.e(LogMonitor.EXCEPTION_TAG, e.getLocalizedMessage(), new Object[0]);
                com.sankuai.waimai.foundation.utils.log.a.b(getClass().getSimpleName(), e.getLocalizedMessage(), e);
                return true;
            }
        }

        public final void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
            Object[] objArr = {valueCallback, str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4b1ccafe0ea3ac36d86ba6e9689eeac", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4b1ccafe0ea3ac36d86ba6e9689eeac");
            } else {
                openFileChooser(valueCallback);
            }
        }

        public final void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
            Object[] objArr = {valueCallback, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ebec936cfe22b73b4c81bd558135312", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ebec936cfe22b73b4c81bd558135312");
            } else {
                openFileChooser(valueCallback);
            }
        }

        public final void openFileChooser(ValueCallback<Uri> valueCallback) {
            Object[] objArr = {valueCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f918f37b4db9ff129c76109ee94adbf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f918f37b4db9ff129c76109ee94adbf");
                return;
            }
            BaseWebViewActivity.this.m = valueCallback;
            BaseWebViewActivity baseWebViewActivity = BaseWebViewActivity.this;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = BaseWebViewActivity.b;
            if (PatchProxy.isSupport(objArr2, baseWebViewActivity, changeQuickRedirect2, false, "b55d7142d60d4843ca505dbdad6c2530", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, baseWebViewActivity, changeQuickRedirect2, false, "b55d7142d60d4843ca505dbdad6c2530");
            } else if (!Environment.getExternalStorageState().equals("mounted")) {
                baseWebViewActivity.b_(baseWebViewActivity.getString(R.string.wm_main_can_not_read_sd_card));
            } else {
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "waimai");
                if (!file.exists()) {
                    file.mkdirs();
                }
                baseWebViewActivity.l = new File(file + File.separator + "IMG_" + String.valueOf(System.currentTimeMillis()) + ".jpg");
                Uri fromFile = Uri.fromFile(baseWebViewActivity.l);
                ArrayList arrayList = new ArrayList();
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                for (ResolveInfo resolveInfo : baseWebViewActivity.getPackageManager().queryIntentActivities(intent, 0)) {
                    String str = resolveInfo.activityInfo.packageName;
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
                    intent2.setPackage(str);
                    intent2.putExtra("output", fromFile);
                    arrayList.add(intent2);
                }
                try {
                    Intent intent3 = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    intent3.setType("image/*");
                    Intent createChooser = Intent.createChooser(intent3, baseWebViewActivity.getString(R.string.wm_main_select_pic));
                    createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
                    baseWebViewActivity.startActivityForResult(createChooser, 12343);
                } catch (ActivityNotFoundException unused) {
                    ae.a((Activity) baseWebViewActivity, (int) R.string.wm_main_system_album_not_unavailable);
                } catch (Exception e) {
                    e.getMessage();
                    com.sankuai.waimai.foundation.utils.log.a.b(baseWebViewActivity.getClass().getSimpleName(), e.getMessage(), e);
                }
            }
        }
    }
}
