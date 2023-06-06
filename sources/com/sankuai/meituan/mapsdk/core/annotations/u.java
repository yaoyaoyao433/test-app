package com.sankuai.meituan.mapsdk.core.annotations;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class u {
    public static ChangeQuickRedirect a;
    public MTMap.InfoWindowAdapter b;
    public MTMap.OnInfoWindowClickListener c;
    public boolean d;
    com.sankuai.meituan.mapsdk.core.d e;
    private Map<com.sankuai.meituan.mapsdk.core.interfaces.e, r> f;
    private Map<com.sankuai.meituan.mapsdk.core.interfaces.e, r> g;

    public u(com.sankuai.meituan.mapsdk.core.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6616417831bb196c334d17441b2653ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6616417831bb196c334d17441b2653ef");
            return;
        }
        this.f = new HashMap();
        this.g = new HashMap();
        this.d = false;
        this.e = dVar;
    }

    public final r a(com.sankuai.meituan.mapsdk.core.interfaces.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "150db52d62bcfe1648941f4e6691c642", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "150db52d62bcfe1648941f4e6691c642");
        }
        if (eVar.h()) {
            r rVar = this.f.get(eVar);
            if (rVar == null) {
                y yVar = new y(eVar, this);
                this.f.put(eVar, yVar);
                return yVar;
            }
            return rVar;
        }
        r rVar2 = this.g.get(eVar);
        if (rVar2 == null) {
            aa aaVar = new aa(eVar, this);
            this.g.put(eVar, aaVar);
            return aaVar;
        }
        return rVar2;
    }

    public final void b(com.sankuai.meituan.mapsdk.core.interfaces.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c359513a9c916b8c79c5de302f89242d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c359513a9c916b8c79c5de302f89242d");
        } else if (eVar.h()) {
            this.f.remove(eVar);
        } else {
            this.g.remove(eVar);
        }
    }

    public final void c(com.sankuai.meituan.mapsdk.core.interfaces.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1747c5362d6af676b151df9f0e3b9a26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1747c5362d6af676b151df9f0e3b9a26");
        } else if (!this.d) {
            for (com.sankuai.meituan.mapsdk.core.interfaces.e eVar2 : this.f.keySet()) {
                if (eVar != eVar2 && !eVar2.j()) {
                    eVar2.hideInfoWindow();
                }
            }
            for (com.sankuai.meituan.mapsdk.core.interfaces.e eVar3 : this.g.keySet()) {
                if (eVar != eVar3 && !eVar3.j()) {
                    eVar3.hideInfoWindow();
                }
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "075e78c4ee46ba3e3bf0eefbfabce966", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "075e78c4ee46ba3e3bf0eefbfabce966");
        } else if (this.g.isEmpty()) {
        } else {
            Iterator<com.sankuai.meituan.mapsdk.core.interfaces.e> it = this.g.keySet().iterator();
            while (it.hasNext()) {
                ((x) it.next()).k();
            }
        }
    }
}
