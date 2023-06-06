package com.sankuai.waimai.platform.widget.tag.virtualview.render;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c<T> extends com.sankuai.waimai.platform.widget.tag.b {
    public static ChangeQuickRedirect c;
    private static final Pools.Pool<c<?>> h = new Pools.SynchronizedPool(128);
    @NonNull
    public b d;
    @NonNull
    public f e;
    @Nullable
    public g f;
    @Nullable
    public T g;

    public c(@NonNull b bVar, @NonNull f fVar, @NonNull g gVar, @Nullable T t) {
        Object[] objArr = {bVar, fVar, gVar, t};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db2cf90ed70b58aeaf7025ffe3d79537", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db2cf90ed70b58aeaf7025ffe3d79537");
            return;
        }
        this.d = bVar;
        this.e = fVar;
        this.f = gVar;
        this.g = t;
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f99aaf5712ec36eb76309ffa3b711268", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f99aaf5712ec36eb76309ffa3b711268");
            return;
        }
        this.d.c();
        this.d = b.d;
        this.e.c();
        this.e = f.d;
        if (this.f != null) {
            this.f.c();
            this.f = null;
        }
        d();
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f594473edc94bc38cfa69a0f845a045", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f594473edc94bc38cfa69a0f845a045");
        } else if (this.g instanceof com.sankuai.waimai.platform.widget.tag.b) {
            ((com.sankuai.waimai.platform.widget.tag.b) this.g).c();
            this.g = null;
        }
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03893f25d735b1aa068848bd2bdb6eb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03893f25d735b1aa068848bd2bdb6eb3");
        } else {
            h.release(this);
        }
    }

    public static <T> c<T> a(b bVar, f fVar, g gVar, T t) {
        Object[] objArr = {bVar, fVar, gVar, t};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73985d5bea66667f8903e719be87c8ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73985d5bea66667f8903e719be87c8ca");
        }
        c<T> cVar = (c<T>) h.acquire();
        if (cVar == null) {
            cVar = new c<>(bVar, fVar, gVar, t);
        } else {
            cVar.d = bVar;
            cVar.e = fVar;
            cVar.f = gVar;
            cVar.g = t;
        }
        cVar.b = false;
        return cVar;
    }
}
