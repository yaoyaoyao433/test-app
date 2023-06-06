package com.meituan.mtwebkit.internal.system;

import android.content.Intent;
import android.webkit.WebChromeClient;
import com.meituan.mtwebkit.MTWebChromeClient;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends MTWebChromeClient.FileChooserParams {
    public static ChangeQuickRedirect a;
    public WebChromeClient.FileChooserParams b;

    public c(WebChromeClient.FileChooserParams fileChooserParams) {
        Object[] objArr = {fileChooserParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9337f7020fed29a9aa0a2ec8511382dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9337f7020fed29a9aa0a2ec8511382dc");
        } else {
            this.b = fileChooserParams;
        }
    }

    @Override // com.meituan.mtwebkit.MTWebChromeClient.FileChooserParams
    public final int getMode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a88cddfbd36b4a30b38a5feb1bf36846", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a88cddfbd36b4a30b38a5feb1bf36846")).intValue() : this.b.getMode();
    }

    @Override // com.meituan.mtwebkit.MTWebChromeClient.FileChooserParams
    public final String[] getAcceptTypes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "487eccfccacf2623a0150ddfd357037f", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "487eccfccacf2623a0150ddfd357037f") : this.b.getAcceptTypes();
    }

    @Override // com.meituan.mtwebkit.MTWebChromeClient.FileChooserParams
    public final boolean isCaptureEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5d6ce91a434e702982bae7cad6555cf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5d6ce91a434e702982bae7cad6555cf")).booleanValue() : this.b.isCaptureEnabled();
    }

    @Override // com.meituan.mtwebkit.MTWebChromeClient.FileChooserParams
    public final CharSequence getTitle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "690e22009abe748d7bff81881044f71c", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "690e22009abe748d7bff81881044f71c") : this.b.getTitle();
    }

    @Override // com.meituan.mtwebkit.MTWebChromeClient.FileChooserParams
    public final String getFilenameHint() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa4c5c1659b08dcc7709f66fa61e5ad9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa4c5c1659b08dcc7709f66fa61e5ad9") : this.b.getFilenameHint();
    }

    @Override // com.meituan.mtwebkit.MTWebChromeClient.FileChooserParams
    public final Intent createIntent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1f8a005045ffce0e40e0cbd41cc6d9a", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1f8a005045ffce0e40e0cbd41cc6d9a") : this.b.createIntent();
    }
}
