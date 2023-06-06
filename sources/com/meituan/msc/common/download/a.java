package com.meituan.msc.common.download;

import android.support.annotation.NonNull;
import com.meituan.android.downloadmanager.model.DownloadInfo;
import com.meituan.msc.common.annotation.NeedDependency;
import com.meituan.msc.common.utils.r;
import com.meituan.msc.extern.Downloader;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@NeedDependency({com.meituan.android.downloadmanager.b.class})
/* loaded from: classes3.dex */
public class a implements Downloader {
    public static ChangeQuickRedirect a;
    protected com.meituan.android.downloadmanager.b b;

    public a() throws NoClassDefFoundError {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d68639fa6cb1126153cb7105f08853a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d68639fa6cb1126153cb7105f08853a0");
        } else {
            this.b = com.meituan.android.downloadmanager.b.a(MSCEnvHelper.getContext());
        }
    }

    @Override // com.meituan.msc.extern.Downloader
    public void download(final String str, final String str2, final Downloader.Callback callback) {
        Object[] objArr = {str, str2, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f420ee4b651c8b7288ee98fe192932d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f420ee4b651c8b7288ee98fe192932d4");
            return;
        }
        g.b("MTDownloader", "MTDownloader url::", str);
        g.b("MTDownloader", "MTDownloader destDir::", str2);
        com.meituan.android.downloadmanager.b.a(MSCEnvHelper.getContext()).a(str, str2, MSCEnvHelper.getEnvInfo().getUUID(), "meituan_mmp", new com.meituan.android.downloadmanager.callback.b() { // from class: com.meituan.msc.common.download.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.downloadmanager.callback.b
            public final void a(@NonNull DownloadInfo downloadInfo) {
                Object[] objArr2 = {downloadInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca1c5e304b65ebfd45dce836c81300a8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca1c5e304b65ebfd45dce836c81300a8");
                } else {
                    g.b("MTDownloader", "MTDownloader onLoadStart");
                }
            }

            @Override // com.meituan.android.downloadmanager.callback.b
            public final void b(@NonNull DownloadInfo downloadInfo) {
                Object[] objArr2 = {downloadInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1690e148754a405ee798d6eaa03242d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1690e148754a405ee798d6eaa03242d");
                    return;
                }
                g.b("MTDownloader", "MTDownloader onLoadProgress info current::", Long.valueOf(downloadInfo.c), ", info total::", Long.valueOf(downloadInfo.b));
                g.b("MTDownloader", "MTDownloader onLoadProgress callback::", callback);
                if (callback != null) {
                    callback.onProgress(downloadInfo.c, downloadInfo.b);
                }
            }

            @Override // com.meituan.android.downloadmanager.callback.b
            public final void c(@NonNull DownloadInfo downloadInfo) {
                Object[] objArr2 = {downloadInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62b1f18044da793b4742eda58d658f4d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62b1f18044da793b4742eda58d658f4d");
                    return;
                }
                g.b("MTDownloader", "MTDownloader onLoadComplete");
                g.b("MTDownloader", "MTDownloader onLoadComplete callback::", callback);
                if (callback != null) {
                    callback.onSuccess(downloadInfo.d);
                }
            }

            @Override // com.meituan.android.downloadmanager.callback.b
            public final void a(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "88b8c9cefa581a2059e3cfccef8eb9f6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "88b8c9cefa581a2059e3cfccef8eb9f6");
                    return;
                }
                g.b("MTDownloader", "MTDownloader onLoadFailure", exc);
                g.b("MTDownloader", "MTDownloader onLoadFailure callback::", callback);
                r.a(com.meituan.android.downloadmanager.b.a(MSCEnvHelper.getContext()).a(str2, str));
                if (callback != null) {
                    callback.onFail(exc.getLocalizedMessage());
                }
                g.a("onLoadFailure", exc);
            }

            @Override // com.meituan.android.downloadmanager.callback.b
            public final void b(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "add26909376cfa26ed11f6953d4c0da8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "add26909376cfa26ed11f6953d4c0da8");
                    return;
                }
                g.b("MTDownloader", "MTDownloader onLoadTimeOut", exc);
                g.b("MTDownloader", "MTDownloader onLoadTimeOut callback::", callback);
                r.a(com.meituan.android.downloadmanager.b.a(MSCEnvHelper.getContext()).a(str2, str));
                if (callback != null) {
                    callback.onTimeout();
                }
            }
        });
    }

    @Override // com.meituan.msc.extern.Downloader
    public void cancel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03122fd8a72d686eee19e86c08ac8d52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03122fd8a72d686eee19e86c08ac8d52");
            return;
        }
        g.b("MTDownloader", "MTDownloader cancel url::", str);
        com.meituan.android.downloadmanager.b.a(MSCEnvHelper.getContext()).cancel(str, (com.meituan.android.downloadmanager.callback.b) null);
    }
}
