package com.tencent.open;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.Constants;
import com.tencent.open.a;
import com.tencent.open.c.a;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.h;
import com.tencent.open.utils.i;
import com.tencent.open.utils.k;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c extends com.tencent.open.b implements a.InterfaceC1490a {
    static Toast c;
    private String d;
    private IUiListener e;
    private C1491c f;
    private Handler g;
    private com.tencent.open.c.a h;
    private com.tencent.open.c.b i;
    private WeakReference<Context> j;
    private int k;

    public c(Context context, String str, String str2, IUiListener iUiListener, QQToken qQToken) {
        super(context, 16973840);
        this.j = new WeakReference<>(context);
        this.d = str2;
        this.f = new C1491c(context, str, str2, qQToken.getAppId(), iUiListener);
        this.g = new d(this.f, context.getMainLooper());
        this.e = iUiListener;
        this.k = Math.round(context.getResources().getDisplayMetrics().density * 185.0f);
        SLog.e("openSDK_LOG.PKDialog", "density=" + context.getResources().getDisplayMetrics().density + "; webviewHeight=" + this.k);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.open.b, android.app.Dialog
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setSoftInputMode(16);
        getWindow().setSoftInputMode(1);
        b();
        c();
    }

    private void b() {
        this.h = new com.tencent.open.c.a(this.j.get());
        this.h.setBackgroundColor(1711276032);
        this.h.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.i = new com.tencent.open.c.b(this.j.get());
        this.i.setBackgroundColor(0);
        this.i.setBackgroundDrawable(null);
        if (Build.VERSION.SDK_INT >= 11) {
            try {
                View.class.getMethod("setLayerType", Integer.TYPE, Paint.class).invoke(this.i, 1, new Paint());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.k);
        layoutParams.addRule(13, -1);
        this.i.setLayoutParams(layoutParams);
        this.h.addView(this.i);
        this.h.a(this);
        setContentView(this.h);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void c() {
        this.i.setVerticalScrollBarEnabled(false);
        this.i.setHorizontalScrollBarEnabled(false);
        this.i.setWebViewClient(new a());
        this.i.setWebChromeClient(this.b);
        this.i.clearFormData();
        WebSettings settings = this.i.getSettings();
        if (settings == null) {
            return;
        }
        i.a(settings);
        settings.setSaveFormData(false);
        settings.setCacheMode(-1);
        settings.setNeedInitialFocus(false);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setJavaScriptEnabled(true);
        if (this.j != null && this.j.get() != null) {
            settings.setDatabaseEnabled(true);
            settings.setDatabasePath(this.j.get().getApplicationContext().getDir("databases", 0).getPath());
        }
        settings.setDomStorageEnabled(true);
        this.a.a(new b(), "sdk_js_if");
        this.i.clearView();
        this.i.loadUrl(this.d);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class b extends a.b {
        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a extends WebViewClient {
        private a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            SLog.v("openSDK_LOG.PKDialog", "Redirect URL: " + str);
            if (str.startsWith(h.a().a((Context) c.this.j.get(), "auth://tauth.qq.com/"))) {
                c.this.f.onComplete(k.c(str));
                c.this.dismiss();
                return true;
            } else if (str.startsWith(Constants.CANCEL_URI)) {
                c.this.f.onCancel();
                c.this.dismiss();
                return true;
            } else if (str.startsWith(Constants.CLOSE_URI)) {
                c.this.dismiss();
                return true;
            } else {
                return false;
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            c.this.f.onError(new UiError(i, str, str2));
            if (c.this.j != null && c.this.j.get() != null) {
                Toast.makeText((Context) c.this.j.get(), "网络连接异常或系统错误", 0).show();
            }
            c.this.dismiss();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            SLog.v("openSDK_LOG.PKDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            c.this.i.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, String str) {
        try {
            JSONObject d2 = k.d(str);
            int i = d2.getInt("type");
            String string = d2.getString("msg");
            if (i == 0) {
                if (c == null) {
                    c = Toast.makeText(context, string, 0);
                } else {
                    Toast toast = c;
                    toast.setView(toast.getView());
                    c.setText(string);
                    c.setDuration(0);
                }
                c.show();
            } else if (i == 1) {
                if (c == null) {
                    c = Toast.makeText(context, string, 1);
                } else {
                    Toast toast2 = c;
                    toast2.setView(toast2.getView());
                    c.setText(string);
                    c.setDuration(1);
                }
                c.show();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            JSONObject d2 = k.d(str);
            d2.getInt("action");
            d2.getString("msg");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class d extends Handler {
        private C1491c b;

        public d(C1491c c1491c, Looper looper) {
            super(looper);
            this.b = c1491c;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            SLog.d("openSDK_LOG.PKDialog", "msg = " + message.what);
            switch (message.what) {
                case 1:
                    this.b.a((String) message.obj);
                    return;
                case 2:
                    this.b.onCancel();
                    return;
                case 3:
                    if (c.this.j == null || c.this.j.get() == null) {
                        return;
                    }
                    c.c((Context) c.this.j.get(), (String) message.obj);
                    return;
                case 4:
                    return;
                case 5:
                    if (c.this.j == null || c.this.j.get() == null) {
                        return;
                    }
                    c.d((Context) c.this.j.get(), (String) message.obj);
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.open.c$c  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static class C1491c extends DefaultUiListener {
        String a;
        String b;
        private WeakReference<Context> c;
        private String d;
        private IUiListener e;

        public C1491c(Context context, String str, String str2, String str3, IUiListener iUiListener) {
            this.c = new WeakReference<>(context);
            this.d = str;
            this.a = str2;
            this.b = str3;
            this.e = iUiListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str) {
            try {
                onComplete(k.d(str));
            } catch (JSONException e) {
                e.printStackTrace();
                onError(new UiError(-4, Constants.MSG_JSON_ERROR, str));
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            com.tencent.open.b.h a = com.tencent.open.b.h.a();
            a.a(this.d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, jSONObject.optInt("ret", -6), this.a, false);
            if (this.e != null) {
                this.e.onComplete(jSONObject);
                this.e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            String str;
            if (uiError.errorMessage != null) {
                str = uiError.errorMessage + this.a;
            } else {
                str = this.a;
            }
            String str2 = str;
            com.tencent.open.b.h.a().a(this.d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, uiError.errorCode, str2, false);
            if (this.e != null) {
                this.e.onError(uiError);
                this.e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            if (this.e != null) {
                this.e.onCancel();
                this.e = null;
            }
        }
    }

    @Override // com.tencent.open.c.a.InterfaceC1490a
    public void a(int i) {
        if (this.j != null && this.j.get() != null) {
            if (i < this.k && 2 == this.j.get().getResources().getConfiguration().orientation) {
                this.i.getLayoutParams().height = i;
            } else {
                this.i.getLayoutParams().height = this.k;
            }
        }
        SLog.e("openSDK_LOG.PKDialog", "onKeyboardShown keyboard show");
    }

    @Override // com.tencent.open.c.a.InterfaceC1490a
    public void a() {
        this.i.getLayoutParams().height = this.k;
        SLog.e("openSDK_LOG.PKDialog", "onKeyboardHidden keyboard hide");
    }

    @Override // com.tencent.open.b
    protected void a(String str) {
        SLog.d("openSDK_LOG.PKDialog", "--onConsoleMessage--");
        try {
            this.a.a(this.i, str);
        } catch (Exception unused) {
        }
    }
}
