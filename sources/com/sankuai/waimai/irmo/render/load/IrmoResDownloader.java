package com.sankuai.waimai.irmo.render.load;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.singleton.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.meituan.retrofit2.adapter.rxjava.f;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Url;
import java.io.File;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import rx.d;
import rx.e;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class IrmoResDownloader {
    public static ChangeQuickRedirect a;
    private ResDownloadService b;
    private ThreadPoolExecutor c;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface ResDownloadService {
        @GET
        d<ap> downloadFile(@Url String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(@NonNull File file);
    }

    public IrmoResDownloader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79c6f26b202d471739b40b0228095b69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79c6f26b202d471739b40b0228095b69");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.b = (ResDownloadService) (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fd4fb84b719e2cb5dfbf5b437d57a97e", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fd4fb84b719e2cb5dfbf5b437d57a97e") : new ar.a().a("https://msstest.sankuai.com/").a(i.a("oknv")).a(f.a()).a()).a(ResDownloadService.class);
        this.c = c.a("IrmoResDownloader", 0, 4, 20L, TimeUnit.SECONDS, new SynchronousQueue());
    }

    public final void a(@Nullable String str, int i, @Nullable a aVar) {
        Object[] objArr = {str, 0, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6697516ba896f00a3fcb6bb20a62fae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6697516ba896f00a3fcb6bb20a62fae");
        } else if (TextUtils.isEmpty(str)) {
            a(aVar);
        } else {
            com.sankuai.waimai.irmo.render.cache.a a2 = com.sankuai.waimai.irmo.render.cache.a.a(str, 0);
            if (a2 == null) {
                a(aVar);
            } else if (a2.a()) {
                a(a2.b(), aVar);
            } else {
                a(str, a2, aVar);
            }
        }
    }

    private void a(@NonNull String str, @Nullable final com.sankuai.waimai.irmo.render.cache.a aVar, @Nullable final a aVar2) {
        Object[] objArr = {str, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7197ccd51935edd3c65147abca41877", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7197ccd51935edd3c65147abca41877");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("IrmoResDownloader_Irmo", "downloadInternal url: " + str, new Object[0]);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.b.downloadFile(str).b(rx.schedulers.a.a(this.c)).a(new e<ap>() { // from class: com.sankuai.waimai.irmo.render.load.IrmoResDownloader.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final void onCompleted() {
            }

            @Override // rx.e
            public final /* synthetic */ void onNext(ap apVar) {
                ap apVar2 = apVar;
                Object[] objArr2 = {apVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0494f354e2cc1221d25a7cd836b59a37", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0494f354e2cc1221d25a7cd836b59a37");
                    return;
                }
                if (apVar2 != null) {
                    boolean a2 = aVar.a(apVar2);
                    com.sankuai.waimai.foundation.utils.log.a.c("IrmoResDownloader_Irmo", "downloadInternal onNext isSaved: " + a2, new Object[0]);
                    if (a2) {
                        IrmoResDownloader.this.a(aVar.b(), aVar2);
                        return;
                    }
                }
                IrmoResDownloader.this.a(aVar2);
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0fd7b325c18092c92b70901ab2453a91", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0fd7b325c18092c92b70901ab2453a91");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.c("IrmoResDownloader_Irmo", "downloadInternal onError consume: " + (SystemClock.elapsedRealtime() - elapsedRealtime), new Object[0]);
                IrmoResDownloader.this.a(aVar2);
            }
        });
    }

    void a(@NonNull File file, @Nullable a aVar) {
        Object[] objArr = {file, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c43d731a3b3b060ab2bdd15fd86e964", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c43d731a3b3b060ab2bdd15fd86e964");
        } else if (aVar != null) {
            aVar.a(file);
        }
    }

    void a(@Nullable a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12b14fc94941fc3dfe7cb89822eb52d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12b14fc94941fc3dfe7cb89822eb52d1");
        } else if (aVar != null) {
            aVar.a();
        }
    }
}
