package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework;

import com.meituan.android.singleton.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.waimai.mach.manager.download.service.FileDownloadService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public static final Executor b;
    private static final int d;
    private static final int e;
    private static final int f;
    private static final BlockingQueue<Runnable> g;
    FileDownloadService c;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    interface a {
        void a(int i);

        void a(String str);
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        d = availableProcessors;
        e = availableProcessors == 1 ? d : Math.max(2, Math.min(d - 1, 4));
        f = (d * 2) + 1;
        g = new LinkedBlockingQueue(128);
        b = com.sankuai.android.jarvis.c.a("Restaurant-DynamicLayoutDownloader", e, f, 30L, TimeUnit.SECONDS, g);
    }

    public d() {
        ar a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cf342817ead61b9a23d706250664a7b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cf342817ead61b9a23d706250664a7b");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2d16989b04532e07880af0355d49c5d", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (ar) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2d16989b04532e07880af0355d49c5d");
        } else {
            a2 = new ar.a().a(b).b(b).a("https://s3plus.sankuai.com").a(i.a(new com.sankuai.meituan.kernel.net.d() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework.d.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.kernel.net.d
                public final boolean a() {
                    return false;
                }

                @Override // com.sankuai.meituan.kernel.net.d
                public final void a(OkHttpClient.Builder builder) {
                    Object[] objArr3 = {builder};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7eef567c0b7d5c115b9432d49961f94a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7eef567c0b7d5c115b9432d49961f94a");
                    } else {
                        builder.connectTimeout(30L, TimeUnit.SECONDS).writeTimeout(30L, TimeUnit.SECONDS).readTimeout(30L, TimeUnit.SECONDS);
                    }
                }
            })).a();
        }
        this.c = (FileDownloadService) a2.a(FileDownloadService.class);
    }
}
