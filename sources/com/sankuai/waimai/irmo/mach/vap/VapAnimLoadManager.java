package com.sankuai.waimai.irmo.mach.vap;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.singleton.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Url;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class VapAnimLoadManager {
    public static ChangeQuickRedirect a;
    d b;
    String c;
    private ResDownloadService d;
    private ThreadPoolExecutor e;
    private WeakReference<a> f;
    private Long g;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface ResDownloadService {
        @GET
        rx.d<ap> downloadFile(@Url String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(@NonNull File file);

        void f();
    }

    public VapAnimLoadManager(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27bfdaf50779c3c509b2fcfdac8d77fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27bfdaf50779c3c509b2fcfdac8d77fc");
            return;
        }
        this.c = str;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.d = (ResDownloadService) (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "849a6aa23225c9f6a049d0b413149568", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "849a6aa23225c9f6a049d0b413149568") : new ar.a().a("https://msstest.sankuai.com/").a(i.a("oknv")).a(com.sankuai.meituan.retrofit2.adapter.rxjava.f.a()).a()).a(ResDownloadService.class);
        this.e = com.sankuai.android.jarvis.c.a("MachVapAnim", 0, 4, 60L, TimeUnit.SECONDS, new SynchronousQueue());
        this.b = new d(str);
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27e4a85009473aa1476ee6d00668a084", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27e4a85009473aa1476ee6d00668a084");
        } else {
            this.f = new WeakReference<>(aVar);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5af8448df9de50df5e957d751a40f041", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5af8448df9de50df5e957d751a40f041");
            return;
        }
        this.c = str;
        if (TextUtils.isEmpty(str)) {
            b();
        } else if (!this.b.a()) {
            this.g = Long.valueOf(SystemClock.elapsedRealtime());
            b(str);
        } else {
            a();
        }
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d451249813183c11956d11202f7232af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d451249813183c11956d11202f7232af");
        } else {
            c(str);
        }
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39d0a75be1bcb6350c13f4795a74f8a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39d0a75be1bcb6350c13f4795a74f8a9");
        } else if (str == null) {
            b();
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            this.d.downloadFile(str).b(rx.schedulers.a.a(this.e)).a(rx.android.schedulers.a.a()).a(new rx.e<ap>() { // from class: com.sankuai.waimai.irmo.mach.vap.VapAnimLoadManager.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final void onCompleted() {
                }

                @Override // rx.e
                public final /* synthetic */ void onNext(ap apVar) {
                    ap apVar2 = apVar;
                    Object[] objArr2 = {apVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e695033e991e0d105e8843aeab037117", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e695033e991e0d105e8843aeab037117");
                        return;
                    }
                    if (apVar2 == null) {
                        VapAnimLoadManager.this.b();
                    }
                    d dVar = VapAnimLoadManager.this.b;
                    InputStream source = apVar2.source();
                    Object[] objArr3 = {source};
                    ChangeQuickRedirect changeQuickRedirect3 = d.a;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "f581b09ecdfcd4f8c2c3f86ed1e83c94", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "f581b09ecdfcd4f8c2c3f86ed1e83c94")).booleanValue() : dVar.b.a(source)) {
                        VapAnimLoadManager vapAnimLoadManager = VapAnimLoadManager.this;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = VapAnimLoadManager.a;
                        if (PatchProxy.isSupport(objArr4, vapAnimLoadManager, changeQuickRedirect4, false, "b60234c4cac3173aa9f4177d62d4c023", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, vapAnimLoadManager, changeQuickRedirect4, false, "b60234c4cac3173aa9f4177d62d4c023");
                        } else {
                            vapAnimLoadManager.a(true);
                            vapAnimLoadManager.a();
                        }
                    } else {
                        VapAnimLoadManager.this.b();
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    com.sankuai.waimai.irmo.utils.d.e(" Url 加载耗时: " + currentTimeMillis2, new Object[0]);
                    float f = (float) currentTimeMillis2;
                    String str2 = VapAnimLoadManager.this.c;
                    Object[] objArr5 = {Float.valueOf(f), str2, "1000"};
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.irmo.mach.c.a;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "4b87027fee5d0ea4a751eaf554a5cba5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "4b87027fee5d0ea4a751eaf554a5cba5");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("EffectUrlLoadTime", Float.valueOf(f));
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("url", str2);
                    hashMap2.put("effectType", "1000");
                    com.sankuai.waimai.irmo.mach.c.a(hashMap, hashMap2);
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1acf84ad0d8df43620a420abf4ffff6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1acf84ad0d8df43620a420abf4ffff6");
                    } else {
                        VapAnimLoadManager.this.b();
                    }
                }
            });
        }
    }

    void a() {
        a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2827b331c85e4d3d934dc59636d222ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2827b331c85e4d3d934dc59636d222ec");
        } else if (this.f == null || (aVar = this.f.get()) == null) {
        } else {
            aVar.a(this.b.b());
        }
    }

    void b() {
        a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "845532505aaa4d036106e7d9d5986de3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "845532505aaa4d036106e7d9d5986de3");
            return;
        }
        a(false);
        if (this.f == null || (aVar = this.f.get()) == null) {
            return;
        }
        aVar.f();
    }

    void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9fbac5b35cd0e5940aae2a68c095d7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9fbac5b35cd0e5940aae2a68c095d7c");
        } else {
            com.sankuai.waimai.irmo.mach.c.a(this.g != null ? ((float) (SystemClock.elapsedRealtime() - this.g.longValue())) / 1000.0f : 0.0f, this.c, z);
        }
    }
}
