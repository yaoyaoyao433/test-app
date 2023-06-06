package com.meituan.mtwebkit.internal.system;

import android.os.Build;
import android.webkit.WebViewDatabase;
import com.meituan.mtwebkit.MTWebViewDatabase;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class r extends MTWebViewDatabase {
    public static ChangeQuickRedirect a;
    private WebViewDatabase b;

    public r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc116f87bbb32726c20734a31a05a3c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc116f87bbb32726c20734a31a05a3c2");
        } else {
            this.b = WebViewDatabase.getInstance(com.meituan.mtwebkit.internal.a.a());
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewDatabase
    public final boolean hasUsernamePassword() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "842e7dcae88cc07a65d43296f90e9774", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "842e7dcae88cc07a65d43296f90e9774")).booleanValue() : this.b.hasUsernamePassword();
    }

    @Override // com.meituan.mtwebkit.MTWebViewDatabase
    public final void clearUsernamePassword() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "750afb58bdc4afc34268cd4e3c084068", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "750afb58bdc4afc34268cd4e3c084068");
        } else {
            this.b.clearUsernamePassword();
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewDatabase
    public final boolean hasHttpAuthUsernamePassword() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6117785e7a91994dfdd9af6c1a3a5173", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6117785e7a91994dfdd9af6c1a3a5173")).booleanValue() : this.b.hasHttpAuthUsernamePassword();
    }

    @Override // com.meituan.mtwebkit.MTWebViewDatabase
    public final void clearHttpAuthUsernamePassword() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9027596c27fb293760e9bd40d31d079", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9027596c27fb293760e9bd40d31d079");
        } else {
            this.b.clearHttpAuthUsernamePassword();
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewDatabase
    public final void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f329004ef1aec267aa7a2f176de16e03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f329004ef1aec267aa7a2f176de16e03");
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.b.setHttpAuthUsernamePassword(str, str2, str3, str4);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewDatabase
    public final String[] getHttpAuthUsernamePassword(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "606a5d8e505bc61f19d68c5f0ef5cb7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "606a5d8e505bc61f19d68c5f0ef5cb7b");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return this.b.getHttpAuthUsernamePassword(str, str2);
        }
        return new String[0];
    }

    @Override // com.meituan.mtwebkit.MTWebViewDatabase
    public final boolean hasFormData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b78114dd3ff9c625dde3667d16d69bd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b78114dd3ff9c625dde3667d16d69bd")).booleanValue() : this.b.hasFormData();
    }

    @Override // com.meituan.mtwebkit.MTWebViewDatabase
    public final void clearFormData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23bc4a7389852002de620edcf59f1271", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23bc4a7389852002de620edcf59f1271");
        } else {
            this.b.clearFormData();
        }
    }
}
