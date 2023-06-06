package com.sankuai.waimai.ad.interact.irmo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.interact.a;
import com.sankuai.waimai.irmo.render.WMIrmoView;
import com.sankuai.waimai.irmo.render.c;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IrmoZoneCheckPlugin extends com.sankuai.waimai.ad.interact.a<c> {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.ad.interact.a
    public final /* synthetic */ a.AbstractC0678a a(c cVar) {
        c cVar2 = cVar;
        Object[] objArr = {cVar2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f003282489336e0f73eae372eb5fb246", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.AbstractC0678a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f003282489336e0f73eae372eb5fb246");
        }
        if (cVar2 == null) {
            return null;
        }
        return new com.sankuai.waimai.ad.interact.a<c>.AbstractC0678a<c>(cVar2) { // from class: com.sankuai.waimai.ad.interact.irmo.IrmoZoneCheckPlugin.1
            public static ChangeQuickRedirect h;

            @Override // com.sankuai.waimai.ad.interact.a.AbstractC0678a
            public final Map a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23956f33c0fff75baf957d826f50c639", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23956f33c0fff75baf957d826f50c639");
                }
                WMIrmoView wMIrmoView = (WMIrmoView) ((c) this.b).o;
                if (wMIrmoView == null || wMIrmoView.getMachAttr() == null) {
                    return null;
                }
                return wMIrmoView.getMachAttr().d;
            }

            @Override // com.sankuai.waimai.ad.interact.a.AbstractC0678a
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e35a5abdb612dd6b9ed005b648e8973", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e35a5abdb612dd6b9ed005b648e8973");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("view_id", this.e);
                if (this.c) {
                    hashMap.put("state", "satisfied");
                } else {
                    hashMap.put("state", "unsatisfied");
                }
                IrmoZoneCheckPlugin.this.a("irmo-zone-satisfied", hashMap);
            }
        };
    }

    public IrmoZoneCheckPlugin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb2e4710f33b909aa1d1fb9f115d9c61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb2e4710f33b909aa1d1fb9f115d9c61");
        } else {
            this.capabilityID = "irmo-zone-check";
        }
    }
}
