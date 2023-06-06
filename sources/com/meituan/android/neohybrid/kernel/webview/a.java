package com.meituan.android.neohybrid.kernel.webview;

import android.support.annotation.Nullable;
import android.webkit.WebSettings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements com.meituan.android.neohybrid.protocol.kernel.b {
    public static ChangeQuickRedirect a;
    private WebSettings b;

    public a(WebSettings webSettings) {
        Object[] objArr = {webSettings};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec8e89df89a7c76081bb91e8c00d105a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec8e89df89a7c76081bb91e8c00d105a");
        } else {
            this.b = webSettings;
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.b
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4afa6306046aaf037cdc72fbe004e403", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4afa6306046aaf037cdc72fbe004e403") : this.b.getUserAgentString();
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.b
    public final void a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abc17fc7e63b7a5d9887583c82c26987", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abc17fc7e63b7a5d9887583c82c26987");
        } else {
            this.b.setUserAgentString(str);
        }
    }
}
