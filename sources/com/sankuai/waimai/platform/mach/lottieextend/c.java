package com.sankuai.waimai.platform.mach.lottieextend;

import android.os.SystemClock;
import com.meituan.android.cipstorage.q;
import com.meituan.android.singleton.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.lottie.DownloadService;
import com.sankuai.waimai.platform.mach.lottieextend.a;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static volatile c c = new c();
    q b;
    private Map<String, String> d;
    private DownloadService e;
    private ThreadPoolExecutor f;

    public static c a() {
        return c;
    }

    public final void a(String str, g gVar) {
        Object[] objArr = {str, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba5a02a97e537c44ce2c9d3f9f9ea61a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba5a02a97e537c44ce2c9d3f9f9ea61a");
            return;
        }
        String str2 = a.a().a(str).d;
        if (this.d.containsKey(str2)) {
            if (aa.a(str) || str.equals(this.d.get(str2))) {
                return;
            }
            a.C1055a a2 = a.a().a(str);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.C1055a.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "07fa8c1dae9fa3cf1851ad18b145bc59", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "07fa8c1dae9fa3cf1851ad18b145bc59");
            } else {
                a.b(a2.c);
            }
        }
        a(str, this.b, gVar);
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c604ee3b89a3cb652a87e4a4ba7b1ac", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c604ee3b89a3cb652a87e4a4ba7b1ac")).booleanValue() : this.b.a(str);
    }

    private void a(String str, final q qVar, final g gVar) {
        Object[] objArr = {str, qVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2c52019d70c480ef7ab58fe46f60e23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2c52019d70c480ef7ab58fe46f60e23");
        } else if (str == null) {
        } else {
            final a.C1055a a2 = a.a().a(str);
            rx.d.a(new j<a.C1055a>() { // from class: com.sankuai.waimai.platform.mach.lottieextend.c.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                }

                @Override // rx.e
                public final void onCompleted() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68b6e2f3d155d571a5b3a4b0b7d454e7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68b6e2f3d155d571a5b3a4b0b7d454e7");
                    } else {
                        com.sankuai.waimai.platform.capacity.log.c.a().a(0, "mach-lottie/download", SystemClock.elapsedRealtime());
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9843784d84157743ed99370fcd8e050", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9843784d84157743ed99370fcd8e050");
                    } else if (gVar != null) {
                        gVar.b();
                    }
                }
            }, this.e.downloadFile(str).b(rx.schedulers.a.a(this.f)).d(new rx.functions.g<ap, a.C1055a>() { // from class: com.sankuai.waimai.platform.mach.lottieextend.c.2
                public static ChangeQuickRedirect a;

                @Override // rx.functions.g
                public final /* synthetic */ a.C1055a call(ap apVar) {
                    ap apVar2 = apVar;
                    Object[] objArr2 = {apVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa65220783494c4e70df5ebb15c6ef7a", RobustBitConfig.DEFAULT_VALUE)) {
                        return (a.C1055a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa65220783494c4e70df5ebb15c6ef7a");
                    }
                    if (apVar2 == null) {
                        return null;
                    }
                    a2.e = qVar;
                    if (a2.a(apVar2.source())) {
                        gVar.a();
                    } else {
                        gVar.b();
                    }
                    return a2;
                }
            }));
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dfc62f8c7f17c80a950dcf7a7c54f7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dfc62f8c7f17c80a950dcf7a7c54f7b");
            return;
        }
        this.b = q.a(com.meituan.android.singleton.b.a, "wm-lottie", 1);
        this.d = this.b.b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.e = (DownloadService) (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b810752b6ae33ab2267ff75afd60ac9", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b810752b6ae33ab2267ff75afd60ac9") : new ar.a().a("http://msstestdn.sankuai.com/").a(i.a("defaultokhttp")).a(com.sankuai.meituan.retrofit2.adapter.rxjava.f.a()).a()).a(DownloadService.class);
        this.f = com.sankuai.android.jarvis.c.a("machLottie", 0, 4, 60L, TimeUnit.SECONDS, new SynchronousQueue());
    }
}
