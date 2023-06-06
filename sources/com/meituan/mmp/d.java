package com.meituan.mmp;

import android.support.annotation.NonNull;
import com.meituan.android.downloadmanager.model.DownloadInfo;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.main.Downloader;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.annotation.NeedDependency;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@NeedDependency({com.meituan.android.downloadmanager.b.class})
/* loaded from: classes3.dex */
public class d implements Downloader {
    public static ChangeQuickRedirect a;
    protected com.meituan.android.downloadmanager.b b;

    public d() throws NoClassDefFoundError {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bc5d04d9f68fc2e2ed47e76f18cfda4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bc5d04d9f68fc2e2ed47e76f18cfda4");
        } else {
            this.b = com.meituan.android.downloadmanager.b.a(MMPEnvHelper.getContext());
        }
    }

    @Override // com.meituan.mmp.main.Downloader
    public void download(final String str, final String str2, final Downloader.Callback callback) {
        Object[] objArr = {str, str2, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2afa8b6dcfb95c6d030cb479fd6c367", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2afa8b6dcfb95c6d030cb479fd6c367");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("MTDownloader", "MTDownloader url::" + str);
        com.meituan.mmp.lib.trace.b.b("MTDownloader", "MTDownloader destDir::" + str2);
        com.meituan.android.downloadmanager.b.a(MMPEnvHelper.getContext()).a(str, str2, MMPEnvHelper.getEnvInfo().getUUID(), "meituan_mmp", new com.meituan.android.downloadmanager.callback.b() { // from class: com.meituan.mmp.d.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.downloadmanager.callback.b
            public final void a(@NonNull DownloadInfo downloadInfo) {
                Object[] objArr2 = {downloadInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b33164397e8926d8303037d79a87e866", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b33164397e8926d8303037d79a87e866");
                } else {
                    com.meituan.mmp.lib.trace.b.b("MTDownloader", "MTDownloader onLoadStart");
                }
            }

            @Override // com.meituan.android.downloadmanager.callback.b
            public final void b(@NonNull DownloadInfo downloadInfo) {
                Object[] objArr2 = {downloadInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe464b01b7d545a5b022f3fb611b8395", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe464b01b7d545a5b022f3fb611b8395");
                    return;
                }
                com.meituan.mmp.lib.trace.b.b("MTDownloader", "MTDownloader onLoadProgress info current::" + downloadInfo.c + ", info total::" + downloadInfo.b);
                StringBuilder sb = new StringBuilder("MTDownloader onLoadProgress callback::");
                sb.append(callback);
                com.meituan.mmp.lib.trace.b.b("MTDownloader", sb.toString());
                if (callback != null) {
                    callback.onProgress(downloadInfo.c, downloadInfo.b);
                }
            }

            @Override // com.meituan.android.downloadmanager.callback.b
            public final void c(@NonNull DownloadInfo downloadInfo) {
                Object[] objArr2 = {downloadInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84bc3b69503259d6e3a209473c7623e3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84bc3b69503259d6e3a209473c7623e3");
                    return;
                }
                com.meituan.mmp.lib.trace.b.b("MTDownloader", "MTDownloader onLoadComplete");
                com.meituan.mmp.lib.trace.b.b("MTDownloader", "MTDownloader onLoadComplete callback::" + callback);
                if (callback != null) {
                    callback.onSuccess(downloadInfo.d, downloadInfo.b);
                }
            }

            @Override // com.meituan.android.downloadmanager.callback.b
            public final void a(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e65d3384913c112efbfd48ecb1c88f6d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e65d3384913c112efbfd48ecb1c88f6d");
                    return;
                }
                com.meituan.mmp.lib.trace.b.b("MTDownloader", "MTDownloader onLoadFailure" + exc);
                com.meituan.mmp.lib.trace.b.b("MTDownloader", "MTDownloader onLoadFailure callback::" + callback);
                s.a(com.meituan.android.downloadmanager.b.a(MMPEnvHelper.getContext()).a(str2, str));
                if (callback != null) {
                    callback.onFail(exc.getLocalizedMessage());
                }
                com.meituan.mmp.lib.trace.b.a("onLoadFailure", exc);
            }

            @Override // com.meituan.android.downloadmanager.callback.b
            public final void b(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a98f1c7588131dab8edccea6a52d3de", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a98f1c7588131dab8edccea6a52d3de");
                    return;
                }
                com.meituan.mmp.lib.trace.b.b("MTDownloader", "MTDownloader onLoadTimeOut" + exc);
                com.meituan.mmp.lib.trace.b.b("MTDownloader", "MTDownloader onLoadTimeOut callback::" + callback);
                s.a(com.meituan.android.downloadmanager.b.a(MMPEnvHelper.getContext()).a(str2, str));
                if (callback != null) {
                    callback.onTimeout();
                }
            }
        });
    }

    @Override // com.meituan.mmp.main.Downloader
    public void cancel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6365b66e4b9d11cfda65229a02c76085", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6365b66e4b9d11cfda65229a02c76085");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("MTDownloader", "MTDownloader cancel url::" + str);
        com.meituan.android.downloadmanager.b.a(MMPEnvHelper.getContext()).cancel(str, (com.meituan.android.downloadmanager.callback.b) null);
    }
}
