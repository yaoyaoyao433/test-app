package com.sankuai.meituan.mapsdk.core.render.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.TileCacheType;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends h {
    public static ChangeQuickRedirect a;
    public i b;
    private boolean i;

    public d(com.sankuai.meituan.mapsdk.core.render.a aVar, String str, boolean z) {
        this(aVar, null, z, i.RenderThread);
        Object[] objArr = {aVar, null, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "078748bf359b5f1277da02c7cd6faf65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "078748bf359b5f1277da02c7cd6faf65");
        }
    }

    public d(com.sankuai.meituan.mapsdk.core.render.a aVar, String str, boolean z, i iVar) {
        super(aVar, str);
        Object[] objArr = {aVar, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45af38de2e3e3171150698172bda302d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45af38de2e3e3171150698172bda302d");
            return;
        }
        this.i = z;
        this.b = iVar;
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.model.h
    public final boolean a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20d99f6473da1b21bcae0610c0ccb60f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20d99f6473da1b21bcae0610c0ccb60f")).booleanValue();
        }
        if (this.d != null && !com.sankuai.meituan.mapsdk.mapcore.utils.h.a(this.e)) {
            this.e = this.d.createGeoJsonSource(this.f, this.i, this.b);
            this.d.addGeoJsonSource(this.e);
            if (!z) {
                this.d.a(this.f, TileCacheType.NoCache.value());
            }
        }
        return com.sankuai.meituan.mapsdk.mapcore.utils.h.a(this.e);
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.model.h
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02833059b79303e3b93f841e602dbbe7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02833059b79303e3b93f841e602dbbe7");
        } else if (this.d != null) {
            this.d.removeAndDestroyGeoJsonSource(this.e);
        }
    }

    public final void a(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8620f7925e699c04145b856bb848c919", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8620f7925e699c04145b856bb848c919");
        } else if (this.d != null) {
            this.d.setGeoJsonSourceThreadMode(this.e, iVar);
        }
    }
}
