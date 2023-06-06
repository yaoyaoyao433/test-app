package com.meituan.msc.modules.api.msi.webview;

import android.webkit.DownloadListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements DownloadListener {
    public static ChangeQuickRedirect a;
    private static final l b = new l();

    public static DownloadListener a() {
        return b;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        Object[] objArr = {str, str2, str3, str4, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83a73076b499097799c59146ecd8aa14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83a73076b499097799c59146ecd8aa14");
        } else {
            k.a(str, str2, str3, str4, j);
        }
    }
}
