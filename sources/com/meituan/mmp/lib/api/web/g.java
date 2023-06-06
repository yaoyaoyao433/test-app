package com.meituan.mmp.lib.api.web;

import android.webkit.DownloadListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements DownloadListener {
    public static ChangeQuickRedirect a;
    private static final g b = new g();

    public static DownloadListener a() {
        return b;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        Object[] objArr = {str, str2, str3, str4, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6daca49ab5c53b971607e7ba33fe60e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6daca49ab5c53b971607e7ba33fe60e7");
        } else {
            WebViewModule.a(str, str2, str3, str4, j);
        }
    }
}
