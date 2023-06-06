package com.meituan.android.neohybrid.framework.titans.delegate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.dianping.titans.ui.TitansUIManager;
import com.meituan.android.neohybrid.protocol.kernel.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebCompactFactory;
import com.sankuai.meituan.android.knb.KNBWebCompat;
import com.sankuai.meituan.android.knb.listener.OnWebViewInitFailedListener;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements com.meituan.android.neohybrid.framework.webcompat.b {
    public static ChangeQuickRedirect a;
    private final KNBWebCompat b;
    private com.meituan.android.neohybrid.protocol.kernel.c<WebView> c;
    private d d;
    private com.meituan.android.neohybrid.framework.webcompat.element.a e;

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void a(Object obj) {
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "759094364af1bda75c1e601c25afc7de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "759094364af1bda75c1e601c25afc7de");
        } else {
            this.b = KNBWebCompactFactory.getKNBCompact(0);
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void a(@NonNull Context context, @NonNull Bundle bundle) {
        Object[] objArr = {context, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "429c34bf116ff91006170322b63391f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "429c34bf116ff91006170322b63391f5");
        } else {
            this.b.onCreate(context, bundle);
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    @RequiresApi(api = 26)
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99c30078ea022270299246270cbc2e88", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99c30078ea022270299246270cbc2e88");
        }
        View onCreateView = this.b.onCreateView(layoutInflater, null);
        WebView webView = this.b.getWebView();
        this.c = new com.meituan.android.neohybrid.kernel.webview.b(webView);
        this.d = new com.meituan.android.neohybrid.framework.webcompat.client.a();
        WebViewClient webViewClient = webView.getWebViewClient();
        if (webViewClient != null) {
            webView.setWebViewClient(new c(this.c, this.d, webViewClient));
            this.c.a(this.d, false);
        } else {
            this.c.a(this.d, true);
        }
        this.e = new a(this.b, this.b.getTitleBarHost());
        return onCreateView;
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b6f32d76609a8da73c8838812d9044c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b6f32d76609a8da73c8838812d9044c");
        } else {
            this.b.onActivityCreated(bundle);
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcbe9cddce685e28d7b9dee55d659362", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcbe9cddce685e28d7b9dee55d659362");
        } else {
            this.b.onStart();
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3323883016c681b4fdbc03829aade0cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3323883016c681b4fdbc03829aade0cf");
        } else {
            this.b.onResume();
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae1ec196198cb2250f207a5269ce6b80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae1ec196198cb2250f207a5269ce6b80");
        } else {
            this.b.onPause();
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "026261290987e768f01a252c6fc37365", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "026261290987e768f01a252c6fc37365");
        } else {
            this.b.onStop();
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f70112ea91c12f87e4fc81728011fd60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f70112ea91c12f87e4fc81728011fd60");
        } else {
            this.b.onDestroy();
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03e774bc960bcf0eb44829362815bf72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03e774bc960bcf0eb44829362815bf72");
        } else {
            this.b.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ad3ddc920740e61ba046c85da1470e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ad3ddc920740e61ba046c85da1470e4");
        } else {
            this.b.onBackPressed();
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void a(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b71d93df177bc3934bd0d688cfaff91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b71d93df177bc3934bd0d688cfaff91");
        } else {
            this.b.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void a(OnWebViewInitFailedListener onWebViewInitFailedListener) {
        Object[] objArr = {onWebViewInitFailedListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5136674666afad8b30ee6701902453f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5136674666afad8b30ee6701902453f2");
        } else {
            this.b.setOnWebViewInitFailedListener(onWebViewInitFailedListener);
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final com.meituan.android.neohybrid.protocol.kernel.c g() {
        return this.c;
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final com.meituan.android.neohybrid.framework.webcompat.element.a h() {
        return this.e;
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9371247d46d2cbde2852c224a2fdffe9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9371247d46d2cbde2852c224a2fdffe9");
        } else {
            this.b.setActivity(activity);
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void setUIManager(TitansUIManager titansUIManager) {
        Object[] objArr = {titansUIManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06954d4f035863fd97347a3c760acda7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06954d4f035863fd97347a3c760acda7");
        } else {
            this.b.getWebSettings().setUIManager(titansUIManager);
        }
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.b
    public final void loadUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9eee01261b79de1ffa51aa518a9b54f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9eee01261b79de1ffa51aa518a9b54f3");
        } else {
            this.b.getWebHandler().loadUrl(str);
        }
    }
}
