package com.meituan.android.neohybrid.kernel.webview;

import android.annotation.SuppressLint;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.meituan.android.neohybrid.protocol.kernel.c;
import com.meituan.android.neohybrid.protocol.kernel.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements c<WebView> {
    public static ChangeQuickRedirect a;
    private final WebView b;
    private d c;
    private com.meituan.android.neohybrid.protocol.kernel.b d;

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void f() {
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void g() {
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void h() {
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void i() {
    }

    public b(WebView webView) {
        Object[] objArr = {webView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46181f7411e1e9b9a0ae6744225de582", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46181f7411e1e9b9a0ae6744225de582");
            return;
        }
        this.b = webView;
        this.d = new a(this.b.getSettings());
        WebSettings settings = this.b.getSettings();
        Object[] objArr2 = {settings};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "993ce4ee6939d6945932a8e9a3aa418a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "993ce4ee6939d6945932a8e9a3aa418a");
        } else {
            settings.setJavaScriptEnabled(true);
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28d87e7c51bb7eafc8ca3f8f768e5f6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28d87e7c51bb7eafc8ca3f8f768e5f6a");
        } else {
            this.b.loadUrl(str);
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void a(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09b5f5023298195d608e137f58aeba43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09b5f5023298195d608e137f58aeba43");
        } else {
            this.b.loadUrl(str, map);
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4becd04311cf38134c7869c20b196b92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4becd04311cf38134c7869c20b196b92");
        } else {
            this.b.reload();
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f1324a69be4c8b6eafbaa76a4cebc28", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f1324a69be4c8b6eafbaa76a4cebc28") : this.b.getUrl();
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    @SuppressLint({"JavascriptInterface"})
    public final void a(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c913c8de2e119e25ee5593410c1ece1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c913c8de2e119e25ee5593410c1ece1");
        } else {
            this.b.addJavascriptInterface(obj, str);
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void a(String str, ValueCallback<String> valueCallback) {
        Object[] objArr = {str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a04b7dca1d12c9547a07b1668171fe07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a04b7dca1d12c9547a07b1668171fe07");
        } else {
            this.b.evaluateJavascript(str, valueCallback);
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1098116c31d933eea81d7a36d20370d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1098116c31d933eea81d7a36d20370d");
        } else {
            a(dVar, true);
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void a(d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3fc51bdc85b38e35671325b9082db4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3fc51bdc85b38e35671325b9082db4e");
            return;
        }
        this.c = dVar;
        if (z) {
            this.b.setWebViewClient(new com.meituan.android.neohybrid.kernel.webview.adapter.a(this, this.c));
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final d c() {
        return this.c;
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final com.meituan.android.neohybrid.protocol.kernel.b d() {
        return this.d;
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be253e240d8dd35890ea94b204b50b63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be253e240d8dd35890ea94b204b50b63");
        } else {
            this.b.destroy();
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.c
    public final /* bridge */ /* synthetic */ WebView j() {
        return this.b;
    }
}
