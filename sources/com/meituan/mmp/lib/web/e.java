package com.meituan.mmp.lib.web;

import android.webkit.JavascriptInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private com.meituan.mmp.lib.interfaces.b b;

    public e(com.meituan.mmp.lib.interfaces.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1223c7d97867e9dec3bc0cdaa3d9765", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1223c7d97867e9dec3bc0cdaa3d9765");
        } else {
            this.b = bVar;
        }
    }

    @JavascriptInterface
    public final String syncInvoke(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f14b26c81c4883d3e1d25a85081585ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f14b26c81c4883d3e1d25a85081585ba");
        }
        if (this.b != null) {
            return this.b.c(str);
        }
        return null;
    }

    @JavascriptInterface
    public final String asyncInvoke(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c8270c1cc2b4cfca23ce075a03d36d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c8270c1cc2b4cfca23ce075a03d36d5");
        }
        if (this.b != null) {
            return this.b.d(str);
        }
        return null;
    }
}
