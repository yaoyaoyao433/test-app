package com.sankuai.waimai.platform.widget.tag.virtualtag;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends i<com.sankuai.waimai.platform.widget.tag.virtualview.render.h> {
    public static ChangeQuickRedirect c;
    private static final Pools.Pool<h> d = new Pools.SynchronizedPool(128);

    private h(@NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.f fVar, @NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.g gVar, @Nullable com.sankuai.waimai.platform.widget.tag.virtualview.render.h hVar) {
        super(fVar, gVar, hVar);
        Object[] objArr = {fVar, gVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cf34664943b4bf2cab72638f0d66ba1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cf34664943b4bf2cab72638f0d66ba1");
        }
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d8c8da2d9a5b7b92a1a522aa9f8905f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d8c8da2d9a5b7b92a1a522aa9f8905f");
        } else {
            d.release(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h a(@NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.f fVar, @NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.g gVar, @Nullable com.sankuai.waimai.platform.widget.tag.virtualview.render.h hVar) {
        Object[] objArr = {fVar, gVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19bcf4f44ace326f7683b62b632f48bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19bcf4f44ace326f7683b62b632f48bc");
        }
        h acquire = d.acquire();
        if (acquire == null) {
            acquire = new h(fVar.d(), gVar.d(), hVar != null ? hVar.d() : null);
        } else {
            acquire.i = fVar.d();
            acquire.j = gVar.d();
            acquire.k = hVar != null ? hVar.d() : 0;
        }
        acquire.b = false;
        return acquire;
    }
}
