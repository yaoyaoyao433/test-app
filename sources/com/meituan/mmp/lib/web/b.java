package com.meituan.mmp.lib.web;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.mmp.lib.engine.m;
import com.meituan.mmp.lib.z;
import com.meituan.mmp.main.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class b extends LinearLayout implements com.meituan.mmp.lib.page.view.b {
    public static ChangeQuickRedirect a;
    public com.meituan.mmp.lib.interfaces.b b;
    public f c;
    private com.meituan.mmp.lib.page.view.b d;
    private final int e;
    private final com.meituan.mmp.lib.config.f f;
    private boolean g;
    private volatile boolean h;
    private final Handler i;
    private com.meituan.mmp.lib.page.d j;
    private i k;
    private g l;

    @Override // com.meituan.mmp.lib.page.view.b
    public final long getWebViewInitializationDuration() {
        return 0L;
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setOnRenderProcessGoneListener(h hVar) {
    }

    public b(Context context, m mVar, int i) {
        super(context);
        Object[] objArr = {context, mVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5789f9dad767fb5cd04f93c8e03cd3cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5789f9dad767fb5cd04f93c8e03cd3cb");
            return;
        }
        this.g = false;
        this.h = false;
        this.i = new Handler(Looper.getMainLooper());
        this.f = mVar.j;
        this.e = i;
    }

    public final void setEventPublisher(com.meituan.mmp.lib.page.d dVar) {
        this.j = dVar;
    }

    public final com.meituan.mmp.lib.page.view.b getIWebView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8372a2f9d6baaa7fbb995cfd6ccef7dd", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.mmp.lib.page.view.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8372a2f9d6baaa7fbb995cfd6ccef7dd") : getInnerWebView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.meituan.mmp.lib.page.view.b getInnerWebView() {
        com.meituan.mmp.lib.page.view.b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de050b9963a08c43eb520782e12bba72", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.page.view.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de050b9963a08c43eb520782e12bba72");
        }
        if (this.d == null) {
            try {
                ab.a("getInnerWebView.init");
                if (this.e == 1) {
                    com.meituan.mmp.lib.config.f fVar = this.f;
                    Context context = getContext();
                    Object[] objArr2 = {context};
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.config.f.a;
                    if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "5184733ea7357d93637af2eed068f4cf", RobustBitConfig.DEFAULT_VALUE)) {
                        bVar = (com.meituan.mmp.lib.page.view.b) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "5184733ea7357d93637af2eed068f4cf");
                    } else {
                        bVar = fVar.d;
                        fVar.d = null;
                        if (bVar == null) {
                            bVar = fVar.a(context);
                        }
                    }
                    this.d = bVar;
                } else {
                    this.d = this.f.a(getContext(), "mmp_service");
                }
                this.d.a(new d(this.b), "HeraJSCore");
                this.d.a(new e(this.b), "MMPBridge");
                if (this.k != null) {
                    this.d.setOnWebScrollChangeListener(this.k);
                }
                if (this.l != null) {
                    this.d.setOnPageFinishedListener(this.l);
                }
                addView(this.d.getWebView(), -1, -1);
                ab.a();
            } catch (Exception e) {
                e.printStackTrace();
                TextView textView = new TextView(getContext());
                textView.setText(R.string.mmp_no_webview_install);
                addView(textView, -1, -1);
                if (this.c != null) {
                    this.c.a(e);
                }
                this.d = new com.meituan.mmp.lib.page.view.a();
            }
        }
        return this.d;
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(final String str, @Nullable final ValueCallback<String> valueCallback) {
        Object[] objArr = {str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab4d8035f05c49759d958112d6d2f437", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab4d8035f05c49759d958112d6d2f437");
        } else if (this.h) {
        } else {
            this.i.post(new Runnable() { // from class: com.meituan.mmp.lib.web.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e939e8a73523c0bac44ad533f920abd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e939e8a73523c0bac44ad533f920abd");
                    } else {
                        b.this.getInnerWebView().a(str, valueCallback);
                    }
                }
            });
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae8db4daf98e4a358df9b5e36630801b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae8db4daf98e4a358df9b5e36630801b");
        } else if (this.h) {
        } else {
            this.h = true;
            this.i.removeCallbacksAndMessages(null);
            if (this.d != null) {
                this.d.setOnRenderProcessGoneListener(null);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    removeView(this.d.getWebView());
                    this.d.a();
                } else {
                    this.i.post(new Runnable() { // from class: com.meituan.mmp.lib.web.b.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2297ebcf4f6621bc582406dbc3915a0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2297ebcf4f6621bc582406dbc3915a0");
                                return;
                            }
                            b.this.removeView(b.this.d.getWebView());
                            b.this.d.a();
                        }
                    });
                }
            }
            z.a(this);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f37dd5b238af241e33ab7887698f60a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f37dd5b238af241e33ab7887698f60a2");
            return;
        }
        getInnerWebView().a(str);
        this.g = true;
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3af399e231fac7bf6a54bc37fb04297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3af399e231fac7bf6a54bc37fb04297");
            return;
        }
        getInnerWebView().a(str, str2, str3, str4, str5);
        this.g = true;
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b1a669301962643697616cc73136ebb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b1a669301962643697616cc73136ebb") : getInnerWebView().getUrl();
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f09c6ea046f82ebbc1b15652399aed6", RobustBitConfig.DEFAULT_VALUE)) {
            throw new RuntimeException("not support");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f09c6ea046f82ebbc1b15652399aed6");
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final View getWebView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21e7b78823370e2f67f9ec26e3664053", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21e7b78823370e2f67f9ec26e3664053");
        }
        throw new RuntimeException("not support");
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4070d439adc247b633f1dfb83ef4af4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4070d439adc247b633f1dfb83ef4af4b");
            return;
        }
        if (this.g) {
            getInnerWebView().b();
        }
        this.g = false;
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98b28f01a9fb4e552c1c6687385fa172", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98b28f01a9fb4e552c1c6687385fa172");
        } else {
            getInnerWebView().c();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "764ebfda234b52b95172df57d3734e26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "764ebfda234b52b95172df57d3734e26");
        } else {
            getInnerWebView().a(i);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setOnWebScrollChangeListener(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "313b5321962bf42688a39379e4b1ad10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "313b5321962bf42688a39379e4b1ad10");
            return;
        }
        this.k = iVar;
        if (this.d != null) {
            this.d.setOnWebScrollChangeListener(this.k);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final String getUserAgentString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "574ef2a2ce673e3ae1c743056f21c7e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "574ef2a2ce673e3ae1c743056f21c7e2");
        }
        throw new RuntimeException("not support");
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setUserAgentString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f5c3fbd7c66cce30dc4977b4a17e374", RobustBitConfig.DEFAULT_VALUE)) {
            throw new RuntimeException("not support");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f5c3fbd7c66cce30dc4977b4a17e374");
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final int getWebPageHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9c015a3c1c4edfcfa2da1a77aa4a4a7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9c015a3c1c4edfcfa2da1a77aa4a4a7")).intValue() : this.d.getWebPageHeight();
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final int getWebScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06565db47277b7a80d1421f43bc0cdfa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06565db47277b7a80d1421f43bc0cdfa")).intValue() : this.d.getWebScrollY();
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setOnPageFinishedListener(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "139863c97cc4dc9837d9d37611c17baa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "139863c97cc4dc9837d9d37611c17baa");
            return;
        }
        this.l = gVar;
        if (this.d != null) {
            this.d.setOnPageFinishedListener(gVar);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc8365f7ab9ada4123361d851f68d658", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc8365f7ab9ada4123361d851f68d658");
        } else {
            getInnerWebView().d();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff384bf2d9d9dc82c83c823b174149d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff384bf2d9d9dc82c83c823b174149d1");
        } else {
            getInnerWebView().e();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "534f3e1f523fb34b51289d19ecefa071", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "534f3e1f523fb34b51289d19ecefa071");
        } else {
            getInnerWebView().f();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1577e7b8fed21343d8b816565244000d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1577e7b8fed21343d8b816565244000d");
        } else if (this.d != null) {
            this.d.b(i);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setOnFullScreenListener(com.meituan.mmp.lib.page.view.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "304e378e761d35a9ed9084c871ef348b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "304e378e761d35a9ed9084c871ef348b");
        } else {
            this.d.setOnFullScreenListener(eVar);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setWidgetBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34ebb79294067bf685028456efa0d857", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34ebb79294067bf685028456efa0d857");
        } else if (this.d != null) {
            this.d.setWidgetBackgroundColor(i);
        }
    }
}
