package com.sankuai.waimai.store.drug.goods.list;

import android.content.Context;
import com.meituan.android.mrn.engine.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final a b;
    private final j c;

    private b(a aVar, j jVar) {
        this.b = aVar;
        this.c = jVar;
    }

    public static Runnable a(a aVar, j jVar) {
        Object[] objArr = {aVar, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84acbf294745f204e0577ccfc432cdff", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84acbf294745f204e0577ccfc432cdff") : new b(aVar, jVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f71fecdf6f6ef178e333469652b148a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f71fecdf6f6ef178e333469652b148a");
            return;
        }
        a aVar = this.b;
        j jVar = this.c;
        Object[] objArr2 = {aVar, jVar};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2a7bcfd0f3e04d998922a70d7eec687f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2a7bcfd0f3e04d998922a70d7eec687f");
            return;
        }
        Context context = jVar.c;
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "b4024870fc53da4bd9374c67c3f02ce3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "b4024870fc53da4bd9374c67c3f02ce3");
            return;
        }
        try {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.drug.mach.a.a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "dc68ee3d9fe90cb266d477a8d92372cf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "dc68ee3d9fe90cb266d477a8d92372cf");
            } else {
                com.sankuai.waimai.store.drug.mach.a.a("drug-poi");
            }
            u.a(context, "supermarket-poi");
            u.a(context.getApplicationContext(), "rn_supermarket_flashbuy-drug-poi", null, null);
        } catch (Exception e) {
            com.dianping.judas.util.a.a(e);
        }
    }
}
