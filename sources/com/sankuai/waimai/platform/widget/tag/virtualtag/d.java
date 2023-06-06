package com.sankuai.waimai.platform.widget.tag.virtualtag;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends i<List<i<?>>> {
    public static ChangeQuickRedirect c;
    private static final Pools.Pool<d> n = new Pools.SynchronizedPool(64);
    public com.sankuai.waimai.platform.widget.tag.api.c d;
    public Map<String, String> e;

    private d(@NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.f fVar, @NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.g gVar, @Nullable List<i<?>> list, @Nullable com.sankuai.waimai.platform.widget.tag.api.c cVar, @Nullable Map<String, String> map) {
        super(fVar, gVar, list);
        Object[] objArr = {fVar, gVar, list, cVar, map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2cfa6921234aa934aee90b99dcfec20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2cfa6921234aa934aee90b99dcfec20");
            return;
        }
        this.d = cVar;
        this.e = map;
    }

    public final List<i<?>> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c16d842d8a515b4001e16f3b1da8a043", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c16d842d8a515b4001e16f3b1da8a043") : this.k == 0 ? Collections.emptyList() : Collections.unmodifiableList((List) this.k);
    }

    @Override // com.sankuai.waimai.platform.widget.tag.virtualtag.i
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7602268145bb3c7e2bc54ecd359d5f3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7602268145bb3c7e2bc54ecd359d5f3e");
            return;
        }
        if (this.k != 0) {
            for (i iVar : (List) this.k) {
                iVar.c();
            }
            this.k = null;
        }
        this.d = null;
        this.e = null;
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bc5b21f9fdbb1cced84de3b4c024c3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bc5b21f9fdbb1cced84de3b4c024c3d");
        } else {
            n.release(this);
        }
    }

    public static d a(@NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.f fVar, @NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.g gVar, @Nullable List<i<?>> list) {
        Object[] objArr = {fVar, gVar, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a0ce72eab871602de72881453866661", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a0ce72eab871602de72881453866661") : a(fVar, gVar, list, null, null);
    }

    public static d a(@NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.f fVar, @NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.g gVar, @Nullable List<i<?>> list, @Nullable com.sankuai.waimai.platform.widget.tag.api.c cVar, @Nullable Map<String, String> map) {
        Object[] objArr = {fVar, gVar, list, cVar, map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1763b09cc13d4534deadd2e4c5d79896", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1763b09cc13d4534deadd2e4c5d79896");
        }
        d acquire = n.acquire();
        if (acquire == null) {
            acquire = new d(fVar.d(), gVar.d(), list, cVar, map);
        } else {
            acquire.i = fVar.d();
            acquire.j = gVar.d();
            acquire.k = list;
            acquire.d = cVar;
            acquire.e = map;
        }
        acquire.b = false;
        return acquire;
    }
}
