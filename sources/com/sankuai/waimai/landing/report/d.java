package com.sankuai.waimai.landing.report;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements a {
    public static ChangeQuickRedirect a;
    private List<a> b;

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94f4a751d747b2505456aee57505b244", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94f4a751d747b2505456aee57505b244");
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(aVar);
    }

    @Override // com.sankuai.waimai.landing.report.a
    public final void a(com.sankuai.waimai.landing.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa1ed6aa14201d9db13c5d379d03a4bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa1ed6aa14201d9db13c5d379d03a4bc");
        } else if (aVar != null) {
            com.sankuai.waimai.foundation.utils.log.a.b("LandReporter", "route start. %s", aVar.toString());
            if (this.b == null || this.b.isEmpty()) {
                return;
            }
            for (a aVar2 : this.b) {
                aVar2.a(aVar);
            }
        }
    }

    @Override // com.sankuai.waimai.landing.report.a
    public final void a(com.sankuai.waimai.landing.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b75434da0c94298aaba6fe8b5ca6aea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b75434da0c94298aaba6fe8b5ca6aea");
        } else if (aVar != null) {
            com.sankuai.waimai.foundation.utils.log.a.b("LandReporter", "route result: %b， %s", Boolean.valueOf(z), aVar.toString());
            if (this.b == null || this.b.isEmpty()) {
                return;
            }
            for (a aVar2 : this.b) {
                aVar2.a(aVar, z);
            }
        }
    }

    @Override // com.sankuai.waimai.landing.report.a
    public final void b(com.sankuai.waimai.landing.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0fc3ed59c88c53968be9cc69f4c9660", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0fc3ed59c88c53968be9cc69f4c9660");
        } else if (aVar != null) {
            com.sankuai.waimai.foundation.utils.log.a.b("LandReporter", "page create. %s", aVar.toString());
            if (this.b == null || this.b.isEmpty()) {
                return;
            }
            for (a aVar2 : this.b) {
                aVar2.b(aVar);
            }
        }
    }

    @Override // com.sankuai.waimai.landing.report.a
    public final void b(com.sankuai.waimai.landing.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0d32aedd55cbbb5d163afa27a5bc319", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0d32aedd55cbbb5d163afa27a5bc319");
        } else if (aVar != null) {
            com.sankuai.waimai.foundation.utils.log.a.b("LandReporter", "page data: : %b， %s", Boolean.valueOf(z), aVar.toString());
            if (this.b == null || this.b.isEmpty()) {
                return;
            }
            for (a aVar2 : this.b) {
                aVar2.b(aVar, z);
            }
        }
    }

    @Override // com.sankuai.waimai.landing.report.a
    public final void c(com.sankuai.waimai.landing.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "426a1e1c8c7ce8cfa9f0b9c7a44e8693", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "426a1e1c8c7ce8cfa9f0b9c7a44e8693");
        } else if (aVar != null) {
            com.sankuai.waimai.foundation.utils.log.a.b("LandReporter", "page shown: %s", aVar.toString());
            if (this.b == null || this.b.isEmpty()) {
                return;
            }
            for (a aVar2 : this.b) {
                aVar2.c(aVar);
            }
        }
    }
}
