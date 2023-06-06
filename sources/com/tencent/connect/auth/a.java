package com.tencent.connect.auth;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.huawei.hms.api.ConnectionResult;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.tencent.connect.auth.b;
import com.tencent.connect.common.Constants;
import com.tencent.mapsdk.internal.y;
import com.tencent.open.b.h;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.i;
import com.tencent.open.utils.k;
import com.tencent.open.web.security.JniInterface;
import com.tencent.open.web.security.SecureJsInterface;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a extends Dialog {
    private String a;
    private b b;
    private IUiListener c;
    private Handler d;
    private FrameLayout e;
    private LinearLayout f;
    private FrameLayout g;
    private ProgressBar h;
    private String i;
    private com.tencent.open.c.c j;
    private Context k;
    private com.tencent.open.web.security.b l;
    private boolean m;
    private int n;
    private String o;
    private String p;
    private long q;
    private long r;
    private HashMap<String, Runnable> s;

    static /* synthetic */ int m(a aVar) {
        int i = aVar.n;
        aVar.n = i + 1;
        return i;
    }

    public a(Context context, String str, String str2, IUiListener iUiListener, QQToken qQToken) {
        super(context, 16973840);
        this.m = false;
        this.q = 0L;
        this.r = 30000L;
        this.k = context;
        this.a = str2;
        this.b = new b(str, str2, qQToken.getAppId(), iUiListener);
        this.d = new c(this.b, context.getMainLooper());
        this.c = iUiListener;
        this.i = str;
        this.l = new com.tencent.open.web.security.b();
        getWindow().setSoftInputMode(32);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setFlags(1024, 1024);
        }
        super.onCreate(bundle);
        if (window != null) {
            View decorView = window.getDecorView();
            if (Build.VERSION.SDK_INT >= 16) {
                decorView.setSystemUiVisibility(1280);
            }
        }
        b();
        d();
        this.s = new HashMap<>();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        if (!this.m) {
            this.b.onCancel();
        }
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class c extends Handler {
        private b b;

        public c(b bVar, Looper looper) {
            super(looper);
            this.b = bVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.b.a((String) message.obj);
                    return;
                case 2:
                    this.b.onCancel();
                    return;
                case 3:
                    a.b(a.this.k, (String) message.obj);
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    class b extends DefaultUiListener {
        String a;
        String b;
        private String d;
        private IUiListener e;

        public b(String str, String str2, String str3, IUiListener iUiListener) {
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
            h a = h.a();
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
            h.a().a(this.d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, uiError.errorCode, str, false);
            a.this.a(str);
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

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isEmpty(this.p) && this.p.length() >= 4) {
            String substring = this.p.substring(this.p.length() - 4);
            sb.append("_u_");
            sb.append(substring);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.tencent.connect.auth.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class C1438a extends WebViewClient {
        private C1438a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri parse;
            SLog.v("openSDK_LOG.AuthDialog", "-->Redirect URL: " + str);
            if (str.startsWith("auth://browser")) {
                JSONObject c = k.c(str);
                a.this.m = a.this.e();
                if (!a.this.m) {
                    if (c.optString("fail_cb", null) != null) {
                        a.this.a(c.optString("fail_cb"), "");
                    } else if (c.optInt("fall_to_wv") == 1) {
                        a aVar = a.this;
                        StringBuilder sb = new StringBuilder();
                        sb.append(a.this.a);
                        sb.append(a.this.a.indexOf(CommonConstant.Symbol.QUESTION_MARK) >= 0 ? "&" : CommonConstant.Symbol.QUESTION_MARK);
                        aVar.a = sb.toString();
                        a aVar2 = a.this;
                        aVar2.a = a.this.a + "browser_error=1";
                        a.this.j.loadUrl(a.this.a);
                    } else {
                        String optString = c.optString("redir", null);
                        if (optString != null) {
                            a.this.j.loadUrl(optString);
                        }
                    }
                }
                return true;
            } else if (str.startsWith("auth://tauth.qq.com/")) {
                a.this.b.onComplete(k.c(str));
                a.this.dismiss();
                return true;
            } else if (str.startsWith(Constants.CANCEL_URI)) {
                a.this.b.onCancel();
                a.this.dismiss();
                return true;
            } else if (str.startsWith(Constants.CLOSE_URI)) {
                a.this.dismiss();
                return true;
            } else if (str.startsWith(Constants.DOWNLOAD_URI) || str.endsWith(".apk")) {
                try {
                    if (str.startsWith(Constants.DOWNLOAD_URI)) {
                        parse = Uri.parse(Uri.decode(str.substring(11)));
                    } else {
                        parse = Uri.parse(Uri.decode(str));
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    intent.addFlags(y.a);
                    a.this.k.startActivity(intent);
                } catch (Exception e) {
                    SLog.e("openSDK_LOG.AuthDialog", "-->start download activity exception, e: ", e);
                }
                return true;
            } else if (str.startsWith("auth://progress")) {
                try {
                    List<String> pathSegments = Uri.parse(str).getPathSegments();
                    if (pathSegments.isEmpty()) {
                        return true;
                    }
                    int intValue = Integer.valueOf(pathSegments.get(0)).intValue();
                    if (intValue == 0) {
                        a.this.g.setVisibility(8);
                        a.this.j.setVisibility(0);
                    } else if (intValue == 1) {
                        a.this.g.setVisibility(0);
                    }
                    return true;
                } catch (Exception unused) {
                    return true;
                }
            } else if (!str.startsWith("auth://onLoginSubmit")) {
                if (a.this.l.a(a.this.j, str)) {
                    return true;
                }
                SLog.i("openSDK_LOG.AuthDialog", "-->Redirect URL: return false");
                return false;
            } else {
                try {
                    List<String> pathSegments2 = Uri.parse(str).getPathSegments();
                    if (!pathSegments2.isEmpty()) {
                        a.this.p = pathSegments2.get(0);
                    }
                } catch (Exception unused2) {
                }
                return true;
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            SLog.i("openSDK_LOG.AuthDialog", "-->onReceivedError, errorCode: " + i + " | description: " + str);
            if (!k.b(a.this.k)) {
                a.this.b.onError(new UiError(ConnectionResult.RESOLUTION_REQUIRED, "当前网络不可用，请稍后重试！", str2));
                a.this.dismiss();
            } else if (!a.this.o.startsWith("https://imgcache.qq.com/ptlogin/static/qzsjump.html?")) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - a.this.q;
                if (a.this.n > 0 || elapsedRealtime >= a.this.r) {
                    a.this.j.loadUrl(a.this.a());
                    return;
                }
                a.m(a.this);
                a.this.d.postDelayed(new Runnable() { // from class: com.tencent.connect.auth.a.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.j.loadUrl(a.this.o);
                    }
                }, 500L);
            } else {
                a.this.b.onError(new UiError(i, str, str2));
                a.this.dismiss();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            SLog.v("openSDK_LOG.AuthDialog", "-->onPageStarted, url: " + str);
            super.onPageStarted(webView, str, bitmap);
            a.this.g.setVisibility(0);
            a.this.q = SystemClock.elapsedRealtime();
            if (!TextUtils.isEmpty(a.this.o)) {
                a.this.d.removeCallbacks((Runnable) a.this.s.remove(a.this.o));
            }
            a.this.o = str;
            d dVar = new d(a.this.o);
            a.this.s.put(str, dVar);
            a.this.d.postDelayed(dVar, 120000L);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            SLog.v("openSDK_LOG.AuthDialog", "-->onPageFinished, url: " + str);
            a.this.g.setVisibility(8);
            if (a.this.j != null) {
                a.this.j.setVisibility(0);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            a.this.d.removeCallbacks((Runnable) a.this.s.remove(str));
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(8)
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            SLog.e("openSDK_LOG.AuthDialog", "-->onReceivedSslError " + sslError.getPrimaryError() + "请求不合法，请检查手机安全设置，如系统时间、代理等");
            sslErrorHandler.cancel();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class d implements Runnable {
        String a;

        public d(String str) {
            this.a = "";
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SLog.v("openSDK_LOG.AuthDialog", "-->timeoutUrl: " + this.a + " | mRetryUrl: " + a.this.o);
            if (this.a.equals(a.this.o)) {
                a.this.b.onError(new UiError(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, "请求页面超时，请稍后重试！", a.this.o));
                a.this.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a() {
        String str = "https://imgcache.qq.com/ptlogin/static/qzsjump.html?" + this.a.substring(this.a.indexOf(CommonConstant.Symbol.QUESTION_MARK) + 1);
        SLog.i("openSDK_LOG.AuthDialog", "-->generateDownloadUrl, url: https://imgcache.qq.com/ptlogin/static/qzsjump.html?");
        return str;
    }

    private void b() {
        c();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.j = new com.tencent.open.c.c(this.k);
        if (Build.VERSION.SDK_INT >= 11) {
            this.j.setLayerType(1, null);
        }
        this.j.setLayoutParams(layoutParams);
        this.e = new FrameLayout(this.k);
        layoutParams.gravity = 17;
        this.e.setLayoutParams(layoutParams);
        this.e.addView(this.j);
        this.e.addView(this.g);
        String string = k.b(this.a).getString("style");
        if (string != null && "qr".equals(string)) {
            a(this.e);
        }
        setContentView(this.e);
    }

    private void a(ViewGroup viewGroup) {
        ImageView imageView = new ImageView(this.k);
        int a = com.tencent.connect.avatar.a.a(this.k, 15.6f);
        int a2 = com.tencent.connect.avatar.a.a(this.k, 25.2f);
        int a3 = com.tencent.connect.avatar.a.a(this.k, 10.0f);
        int i = a3 * 2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a + i, a2 + i);
        layoutParams.leftMargin = a3;
        imageView.setLayoutParams(layoutParams);
        imageView.setPadding(a3, a3, a3, a3);
        imageView.setImageDrawable(k.a("h5_qr_back.png", this.k));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.tencent.connect.auth.a.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a.this.dismiss();
                if (a.this.m || a.this.b == null) {
                    return;
                }
                a.this.b.onCancel();
            }
        });
        viewGroup.addView(imageView);
    }

    private void c() {
        TextView textView;
        this.h = new ProgressBar(this.k);
        this.h.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f = new LinearLayout(this.k);
        if (this.i.equals("action_login")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            layoutParams.leftMargin = 5;
            textView = new TextView(this.k);
            if (Locale.getDefault().getLanguage().equals("zh")) {
                textView.setText("登录中...");
            } else {
                textView.setText("Logging in...");
            }
            textView.setTextColor(Color.rgb(255, 255, 255));
            textView.setTextSize(18.0f);
            textView.setLayoutParams(layoutParams);
        } else {
            textView = null;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        this.f.setLayoutParams(layoutParams2);
        this.f.addView(this.h);
        if (textView != null) {
            this.f.addView(textView);
        }
        this.g = new FrameLayout(this.k);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        this.g.setLayoutParams(layoutParams3);
        this.g.setBackgroundColor(Color.parseColor("#B3000000"));
        this.g.addView(this.f);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void d() {
        this.j.setVerticalScrollBarEnabled(false);
        this.j.setHorizontalScrollBarEnabled(false);
        this.j.setWebViewClient(new C1438a());
        this.j.setWebChromeClient(new WebChromeClient());
        this.j.clearFormData();
        this.j.clearSslPreferences();
        this.j.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.tencent.connect.auth.a.2
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                return true;
            }
        });
        this.j.setOnTouchListener(new View.OnTouchListener() { // from class: com.tencent.connect.auth.a.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                    case 1:
                        if (view.hasFocus()) {
                            return false;
                        }
                        view.requestFocus();
                        return false;
                    default:
                        return false;
                }
            }
        });
        WebSettings settings = this.j.getSettings();
        i.a(settings);
        settings.setSaveFormData(false);
        settings.setCacheMode(-1);
        settings.setNeedInitialFocus(false);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setJavaScriptEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setDatabasePath(this.k.getDir("databases", 0).getPath());
        settings.setDomStorageEnabled(true);
        SLog.v("openSDK_LOG.AuthDialog", "-->mUrl : " + this.a);
        this.o = this.a;
        this.j.loadUrl(this.a);
        this.j.setVisibility(4);
        this.l.a(new SecureJsInterface(), "SecureJsInterface");
        SecureJsInterface.isPWDEdit = false;
        super.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.tencent.connect.auth.a.4
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                try {
                    if (JniInterface.isJniOk) {
                        JniInterface.clearAllPWD();
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        com.tencent.connect.auth.b a = com.tencent.connect.auth.b.a();
        String c2 = a.c();
        b.a aVar = new b.a();
        aVar.a = this.c;
        aVar.b = this;
        aVar.c = c2;
        String a2 = a.a(aVar);
        String substring = this.a.substring(0, this.a.indexOf(CommonConstant.Symbol.QUESTION_MARK));
        Bundle b2 = k.b(this.a);
        b2.putString("token_key", c2);
        b2.putString(AppUtil.CacheKey.SERIAL, a2);
        b2.putString("browser", "1");
        this.a = substring + CommonConstant.Symbol.QUESTION_MARK + HttpUtils.encodeUrl(b2);
        return k.a(this.k, this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str) {
        try {
            JSONObject d2 = k.d(str);
            int i = d2.getInt("type");
            Toast.makeText(context.getApplicationContext(), d2.getString("msg"), i).show();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void a(String str, String str2) {
        this.j.loadUrl(TitansConstants.JAVASCRIPT_PREFIX + str + CommonConstant.Symbol.BRACKET_LEFT + str2 + ");void(" + System.currentTimeMillis() + ");");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.s.clear();
        this.d.removeCallbacksAndMessages(null);
        try {
            if ((this.k instanceof Activity) && !((Activity) this.k).isFinishing() && isShowing()) {
                super.dismiss();
                SLog.i("openSDK_LOG.AuthDialog", "-->dismiss dialog");
            }
        } catch (Exception e) {
            SLog.e("openSDK_LOG.AuthDialog", "-->dismiss dialog exception:", e);
        }
        if (this.j != null) {
            this.j.destroy();
            this.j = null;
        }
    }
}
