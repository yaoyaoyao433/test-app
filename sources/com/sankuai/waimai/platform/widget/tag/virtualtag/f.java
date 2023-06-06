package com.sankuai.waimai.platform.widget.tag.virtualtag;

import android.support.annotation.NonNull;
import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends i<Void> {
    public static ChangeQuickRedirect c;
    private static final Pools.Pool<f> d = new Pools.SynchronizedPool(128);

    private f(@NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.f fVar, @NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.g gVar) {
        super(fVar, gVar, null);
        Object[] objArr = {fVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3eeb3fdeb241dd484d879dd81a8e87e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3eeb3fdeb241dd484d879dd81a8e87e");
        }
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf473afe145e7ee64e8b65562f675e13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf473afe145e7ee64e8b65562f675e13");
        } else {
            d.release(this);
        }
    }

    public static f a(@NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.f fVar, @NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.g gVar) {
        Object[] objArr = {fVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4035feb0442cffeecbae037fb7fbf60", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4035feb0442cffeecbae037fb7fbf60");
        }
        f acquire = d.acquire();
        if (acquire == null) {
            acquire = new f(fVar.d(), gVar.d());
        } else {
            acquire.i = fVar.d();
            acquire.j = gVar.d();
        }
        acquire.b = false;
        return acquire;
    }
}
