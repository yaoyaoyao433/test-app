package com.sankuai.waimai.mach.manager_new.ioq;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
import java.util.concurrent.PriorityBlockingQueue;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private i b;
    private d c;

    public c(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e644fe834d8b75f4da2df7a75f83b21", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e644fe834d8b75f4da2df7a75f83b21");
            return;
        }
        this.b = new i(new PriorityBlockingQueue());
        this.c = dVar;
    }

    public void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0affe64ef678e14d7a08428c5fb9be0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0affe64ef678e14d7a08428c5fb9be0f");
            return;
        }
        bVar.c = this.c;
        this.b.a(bVar.d);
    }

    public final void a(BundleInfo bundleInfo) {
        b gVar;
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54cd166ce5766d194d52d3f0603c6dca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54cd166ce5766d194d52d3f0603c6dca");
            return;
        }
        j jVar = new j();
        jVar.b = bundleInfo;
        if (com.sankuai.waimai.mach.manager_new.common.a.c(bundleInfo)) {
            gVar = new com.sankuai.waimai.machpro.bundle.b(jVar);
        } else {
            gVar = new g(jVar);
        }
        a(gVar);
    }

    public final b a(BundleInfo bundleInfo, boolean z) {
        b gVar;
        Object[] objArr = {bundleInfo, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c040ef0b49913b9d00ac788e0e74523e", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c040ef0b49913b9d00ac788e0e74523e");
        }
        j jVar = new j();
        jVar.b = bundleInfo;
        jVar.a("load_for_future", true);
        if (com.sankuai.waimai.mach.manager_new.common.a.c(bundleInfo)) {
            gVar = new com.sankuai.waimai.machpro.bundle.b(jVar);
        } else {
            gVar = new g(jVar);
        }
        a(gVar);
        return gVar;
    }

    public final h a(BundleInfo bundleInfo, String str, String str2) {
        Object[] objArr = {bundleInfo, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a8863d9f4588c7f54d5f0e546c3fd11", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a8863d9f4588c7f54d5f0e546c3fd11");
        }
        j jVar = new j();
        jVar.a(h.h, str);
        jVar.a(h.i, str2);
        jVar.b = bundleInfo;
        h hVar = new h(jVar);
        a(hVar);
        return hVar;
    }

    public final void a(BundleInfo bundleInfo, int i) {
        Object[] objArr = {bundleInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91070ad757b9a2d2c43154827f0939fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91070ad757b9a2d2c43154827f0939fd");
            return;
        }
        j jVar = new j();
        jVar.a(f.h, i);
        jVar.b = bundleInfo;
        a(new f(jVar));
    }
}
