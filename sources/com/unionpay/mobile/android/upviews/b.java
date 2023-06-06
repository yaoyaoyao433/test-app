package com.unionpay.mobile.android.upviews;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.dianping.titans.utils.Constants;
import java.util.ArrayList;
import java.util.Timer;
/* loaded from: classes6.dex */
public final class b extends WebView implements Handler.Callback {
    private WebSettings a;
    private Handler b;
    private a c;
    private Timer d;
    private boolean e;
    private ArrayList<String> f;

    /* loaded from: classes6.dex */
    public interface a {
        void r();

        void s();
    }

    /* renamed from: com.unionpay.mobile.android.upviews.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC1513b extends a {
        void c(String str);
    }

    /* loaded from: classes6.dex */
    public final class c extends WebChromeClient {
        private c() {
        }

        /* synthetic */ c(b bVar, byte b) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            if (i == 100) {
                b.this.b.sendEmptyMessage(1);
            }
        }
    }

    /* loaded from: classes6.dex */
    final class d extends WebViewClient {
        private d() {
        }

        /* synthetic */ d(b bVar, byte b) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            b.this.d.cancel();
            b.this.d.purge();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            b.this.d = new Timer();
            b.this.d.schedule(new com.unionpay.mobile.android.upviews.c(this), 30000L);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            b.this.a();
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2 = null;
            if (b.this.f != null && b.this.f.size() != 0 && str != null && str.length() > 0) {
                int i = 0;
                while (true) {
                    if (b.this.f == null || i >= b.this.f.size()) {
                        break;
                    } else if (str.startsWith((String) b.this.f.get(i))) {
                        str2 = (String) b.this.f.get(i);
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (str2 == null) {
                webView.loadUrl(str);
                return true;
            }
            Message obtainMessage = b.this.b.obtainMessage(4);
            obtainMessage.obj = str;
            b.this.b.sendMessage(obtainMessage);
            return true;
        }
    }

    public b(Context context, a aVar) {
        super(context);
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = new Timer();
        this.e = false;
        this.f = null;
        this.b = new Handler(this);
        this.c = aVar;
        setScrollBarStyle(33554432);
        this.a = getSettings();
        this.a.setJavaScriptEnabled(true);
        setWebChromeClient(new c(this, (byte) 0));
        setWebViewClient(new d(this, (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        loadData(String.format("<div align=\"center\">%s</div>", "&#x7F51;&#x9875;&#x52A0;&#x8F7D;&#x5931;&#x8D25;&#xFF0C;&#x8BF7;&#x91CD;&#x8BD5;"), Constants.MIME_TYPE_HTML, "utf-8");
    }

    public final void a(String str) {
        if (this.f == null) {
            this.f = new ArrayList<>();
        }
        if (str == null || str.length() <= 0) {
            return;
        }
        this.f.add(str);
    }

    public final void b(String str) {
        Message obtainMessage = this.b.obtainMessage(0);
        obtainMessage.obj = str;
        this.b.sendMessage(obtainMessage);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                if (this.c != null) {
                    this.c.r();
                }
                String str = message.obj != null ? (String) message.obj : "";
                Log.e("uppay", "url = ".concat(String.valueOf(str)));
                loadUrl(str);
                break;
            case 3:
                a();
            case 1:
            case 2:
                if (message.what == 1) {
                    this.e = true;
                }
                if (this.c != null) {
                    this.c.s();
                    break;
                }
                break;
            case 4:
                if (this.c != null && (this.c instanceof InterfaceC1513b)) {
                    ((InterfaceC1513b) this.c).c((String) message.obj);
                    break;
                }
                break;
        }
        return true;
    }
}
