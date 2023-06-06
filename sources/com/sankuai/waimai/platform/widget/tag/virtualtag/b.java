package com.sankuai.waimai.platform.widget.tag.virtualtag;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends i<com.sankuai.waimai.platform.widget.tag.virtualview.render.a> {
    public static ChangeQuickRedirect c;
    private static final Pools.Pool<b> d = new Pools.SynchronizedPool(128);

    private b(@NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.f fVar, @NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.g gVar, @Nullable com.sankuai.waimai.platform.widget.tag.virtualview.render.a aVar) {
        super(fVar, gVar, aVar);
        Object[] objArr = {fVar, gVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "762ae53a193a3a8f0b9817b946b7d36c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "762ae53a193a3a8f0b9817b946b7d36c");
        }
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da4118666255b71d3de15b24dea3d29b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da4118666255b71d3de15b24dea3d29b");
        } else {
            d.release(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b a(@NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.f fVar, @NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.g gVar, @Nullable com.sankuai.waimai.platform.widget.tag.virtualview.render.a aVar) {
        Object[] objArr = {fVar, gVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57ea68fcb0094982153a2440701c3cbf", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57ea68fcb0094982153a2440701c3cbf");
        }
        b acquire = d.acquire();
        if (acquire == null) {
            acquire = new b(fVar.d(), gVar.d(), aVar != null ? aVar.d() : null);
        } else {
            acquire.i = fVar.d();
            acquire.j = gVar.d();
            acquire.k = aVar != null ? aVar.d() : 0;
        }
        acquire.b = false;
        return acquire;
    }
}
