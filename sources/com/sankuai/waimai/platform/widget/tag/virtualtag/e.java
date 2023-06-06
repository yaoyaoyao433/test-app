package com.sankuai.waimai.platform.widget.tag.virtualtag;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends i<com.sankuai.waimai.platform.widget.tag.virtualview.render.e> {
    public static ChangeQuickRedirect c;
    private static final Pools.Pool<e> d = new Pools.SynchronizedPool(128);

    private e(@NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.f fVar, @NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.g gVar, @Nullable com.sankuai.waimai.platform.widget.tag.virtualview.render.e eVar) {
        super(fVar, gVar, eVar);
        Object[] objArr = {fVar, gVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13efc247d7031828fd0d70f88213baa4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13efc247d7031828fd0d70f88213baa4");
        }
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eae0c0a7a1698acbfd2db1c0cc0fc537", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eae0c0a7a1698acbfd2db1c0cc0fc537");
        } else {
            d.release(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e a(@NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.f fVar, @NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.g gVar, @Nullable com.sankuai.waimai.platform.widget.tag.virtualview.render.e eVar) {
        Object[] objArr = {fVar, gVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b0258bae321f9b8a2f3db5014821c36", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b0258bae321f9b8a2f3db5014821c36");
        }
        e acquire = d.acquire();
        if (acquire == null) {
            acquire = new e(fVar.d(), gVar.d(), eVar != null ? eVar.d() : null);
        } else {
            acquire.i = fVar.d();
            acquire.j = gVar.d();
            acquire.k = eVar != null ? eVar.d() : 0;
        }
        acquire.b = false;
        return acquire;
    }
}
