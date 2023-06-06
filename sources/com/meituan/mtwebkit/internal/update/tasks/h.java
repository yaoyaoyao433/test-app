package com.meituan.mtwebkit.internal.update.tasks;

import android.support.annotation.NonNull;
import com.meituan.android.downloadmanager.model.DownloadInfo;
import com.meituan.android.downloadmanager.model.Request;
import com.meituan.mtwebkit.internal.task.Depend;
import com.meituan.mtwebkit.internal.update.model.VersionInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.concurrent.TimeoutException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h extends com.meituan.mtwebkit.internal.task.a<String> {
    public static ChangeQuickRedirect a;
    private long b;
    @Depend
    private DDVersionInfoTask k;

    @Override // com.meituan.mtwebkit.internal.task.a
    public final void a(final com.meituan.mtwebkit.internal.task.b<String> bVar) throws com.meituan.mtwebkit.internal.task.c {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "778b3e042610e1ce1e9637641f3b8967", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "778b3e042610e1ce1e9637641f3b8967");
            return;
        }
        VersionInfo c = this.k.c();
        com.meituan.mtwebkit.internal.e.c("DownloadMTWebViewTask", "start download MTWebView APK, VersionCode = " + c.currentVersion);
        Request request = new Request(c.appHttpsUrl);
        request.f = com.meituan.mtwebkit.internal.g.b().getAbsolutePath();
        com.meituan.android.downloadmanager.b.a(com.meituan.mtwebkit.internal.a.a()).a(request, new com.meituan.android.downloadmanager.callback.b() { // from class: com.meituan.mtwebkit.internal.update.tasks.h.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.downloadmanager.callback.b
            public final void a(@NonNull DownloadInfo downloadInfo) {
                Object[] objArr2 = {downloadInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25d9bf9c8215d9c3cbc412ece7333bda", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25d9bf9c8215d9c3cbc412ece7333bda");
                } else {
                    h.this.b = System.currentTimeMillis();
                }
            }

            @Override // com.meituan.android.downloadmanager.callback.b
            public final void b(@NonNull DownloadInfo downloadInfo) {
                Object[] objArr2 = {downloadInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da45f878c18c2d7584de2d678e4af23d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da45f878c18c2d7584de2d678e4af23d");
                    return;
                }
                com.meituan.mtwebkit.internal.e.c("DownloadMTWebViewTask", "progress % = " + String.format("%.1f", Float.valueOf(((float) (downloadInfo.c * 100)) / ((float) downloadInfo.b))));
            }

            @Override // com.meituan.android.downloadmanager.callback.b
            public final void c(@NonNull DownloadInfo downloadInfo) {
                Object[] objArr2 = {downloadInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36dd6c13c128471cc6ea52f8d68b73d5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36dd6c13c128471cc6ea52f8d68b73d5");
                    return;
                }
                com.meituan.mtwebkit.internal.e.c("DownloadMTWebViewTask", "download complete, cost " + (System.currentTimeMillis() - h.this.b) + " ms; exists = " + new File(downloadInfo.d).exists());
                bVar.a((com.meituan.mtwebkit.internal.task.b) downloadInfo.d);
            }

            @Override // com.meituan.android.downloadmanager.callback.b
            public final void a(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ca9199f5720dcffa1497f223f9b07d0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ca9199f5720dcffa1497f223f9b07d0");
                } else {
                    bVar.a((Throwable) exc);
                }
            }

            @Override // com.meituan.android.downloadmanager.callback.b
            public final void b(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91960fd498405774f2de3dea3eacf7bb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91960fd498405774f2de3dea3eacf7bb");
                } else {
                    bVar.a((Throwable) new TimeoutException(exc.getMessage()));
                }
            }
        });
    }
}
