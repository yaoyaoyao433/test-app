package com.sankuai.waimai.platform.widget.tag.virtualview.render;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends c<List<c>> {
    public static ChangeQuickRedirect h;
    private static final Pools.Pool<d> k = new Pools.SynchronizedPool(64);
    public com.sankuai.waimai.platform.widget.tag.api.c i;
    public Map<String, String> j;

    private d(@NonNull b bVar, @NonNull f fVar, @NonNull g gVar, @Nullable List<c> list, @Nullable com.sankuai.waimai.platform.widget.tag.api.c cVar, @Nullable Map<String, String> map) {
        super(bVar, fVar, gVar, list);
        Object[] objArr = {bVar, fVar, gVar, list, cVar, map};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c335f2f4214055507e1f9afd7cf797f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c335f2f4214055507e1f9afd7cf797f");
            return;
        }
        this.i = cVar;
        this.j = map;
    }

    @Override // com.sankuai.waimai.platform.widget.tag.virtualview.render.c
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abd99c4b5c3f9b4414605cd598cb9d3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abd99c4b5c3f9b4414605cd598cb9d3a");
            return;
        }
        if (this.g != 0) {
            for (c cVar : (List) this.g) {
                if (cVar != null) {
                    cVar.c();
                }
            }
            this.g = null;
        }
        this.i = null;
        this.j = null;
    }

    @Override // com.sankuai.waimai.platform.widget.tag.virtualview.render.c, com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "069f1432d2eb91c65a741ce0a0a78e84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "069f1432d2eb91c65a741ce0a0a78e84");
        } else {
            k.release(this);
        }
    }

    public static d a(@NonNull b bVar, @NonNull f fVar, @NonNull g gVar, @Nullable List<c> list, @Nullable com.sankuai.waimai.platform.widget.tag.api.c cVar, @Nullable Map<String, String> map) {
        Object[] objArr = {bVar, fVar, gVar, list, cVar, map};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c00e938c7a5136955a1abc1efdbaafe", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c00e938c7a5136955a1abc1efdbaafe");
        }
        d acquire = k.acquire();
        if (acquire == null) {
            acquire = new d(bVar, fVar, gVar, list, cVar, map);
        } else {
            acquire.d = bVar;
            acquire.e = fVar;
            acquire.f = gVar;
            acquire.g = list;
            acquire.i = cVar;
            acquire.j = map;
        }
        acquire.b = false;
        return acquire;
    }
}
