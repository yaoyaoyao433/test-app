package com.meituan.msc.modules.api.msi.webview;

import android.view.View;
import android.widget.FrameLayout;
import com.google.gson.JsonObject;
import com.meituan.msc.common.utils.ar;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class m extends FrameLayout implements com.meituan.msi.view.e {
    public static ChangeQuickRedirect a;
    public View b;
    protected i c;
    public a d;
    private com.meituan.msi.view.e e;

    public m(com.meituan.msc.modules.engine.h hVar, MsiContext msiContext, JsonObject jsonObject, WebViewComponentParam webViewComponentParam, com.meituan.msc.modules.page.j jVar) {
        super(msiContext.getActivity());
        Object[] objArr = {hVar, msiContext, jsonObject, webViewComponentParam, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d2ce65255bb301800c2a68a5b4026cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d2ce65255bb301800c2a68a5b4026cb");
            return;
        }
        this.e = null;
        if (hVar.l.a()) {
            this.d = new g(msiContext.getActivity(), hVar, jVar);
        } else {
            this.d = new k(msiContext.getActivity(), hVar, jVar);
        }
        View a2 = this.d.a(msiContext, jsonObject, webViewComponentParam);
        com.meituan.msi.view.e a3 = this.d.a();
        Object[] objArr2 = {a2, a3};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c03922c7763a81de58273a15a686ae3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c03922c7763a81de58273a15a686ae3");
            return;
        }
        this.b = a2;
        addView(this.b, new FrameLayout.LayoutParams(-1, -1));
        this.c = new i(getContext());
        addView(this.c, new FrameLayout.LayoutParams(-1, ar.a(4.0f)));
        this.e = a3;
        this.d.k = new j().a(this.c);
    }

    public final View getWebView() {
        return this.b;
    }

    @Override // com.meituan.msi.view.e
    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3dd4edd73c0b4645831b551cc18c061", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3dd4edd73c0b4645831b551cc18c061")).booleanValue();
        }
        if (this.e != null) {
            return this.e.c(str);
        }
        return false;
    }

    @Override // com.meituan.msi.view.e
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2195ea6934f34b0cf5f1641fa4d65091", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2195ea6934f34b0cf5f1641fa4d65091")).booleanValue();
        }
        if (this.e != null) {
            return this.e.b();
        }
        return false;
    }

    @Override // com.meituan.msi.view.e
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f78a81acf617df862f80cdb54926e4c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f78a81acf617df862f80cdb54926e4c4");
        } else if (this.e != null) {
            this.e.b(i);
        }
    }

    @Override // com.meituan.msi.view.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34a4d6bbde05fa5944ebce14eae57e1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34a4d6bbde05fa5944ebce14eae57e1f");
        } else if (this.e != null) {
            this.e.c();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d5c0c1da8b80ba66e626341fdbf2610", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d5c0c1da8b80ba66e626341fdbf2610");
        } else {
            ((c) this.b).destroy();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc3968e78cf2261ce9950eb371d28cc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc3968e78cf2261ce9950eb371d28cc7");
        } else {
            this.b.scrollBy(i, i2);
        }
    }

    public final int getWebHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b44cce6ef8a380c5cf9d2edc3c866440", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b44cce6ef8a380c5cf9d2edc3c866440")).intValue() : this.b.getHeight();
    }

    public final String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91fb5d07a70a98bf0bef5b35fcb2edc2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91fb5d07a70a98bf0bef5b35fcb2edc2") : ((c) this.b).getUrl();
    }
}
