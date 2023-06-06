package com.sankuai.waimai.ad.interact.irmo;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.interact.a;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.irmo.mach.vap.e;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class VapZoneCheckPlugin extends com.sankuai.waimai.ad.interact.a<com.sankuai.waimai.irmo.mach.vap.a> {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.ad.interact.a
    public final /* synthetic */ a.AbstractC0678a a(com.sankuai.waimai.irmo.mach.vap.a aVar) {
        com.sankuai.waimai.irmo.mach.vap.a aVar2 = aVar;
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "093a1bf39acfb2950e2190fa2893be15", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.AbstractC0678a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "093a1bf39acfb2950e2190fa2893be15");
        }
        if (aVar2 == null) {
            return null;
        }
        return new com.sankuai.waimai.ad.interact.a<com.sankuai.waimai.irmo.mach.vap.a>.AbstractC0678a<com.sankuai.waimai.irmo.mach.vap.a>(aVar2) { // from class: com.sankuai.waimai.ad.interact.irmo.VapZoneCheckPlugin.1
            public static ChangeQuickRedirect h;

            @Override // com.sankuai.waimai.ad.interact.a.AbstractC0678a
            public final Map a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dff890af38786c50788ea9540bc14a6a", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dff890af38786c50788ea9540bc14a6a");
                }
                e eVar = ((com.sankuai.waimai.irmo.mach.vap.a) this.b).b;
                if (eVar == null || TextUtils.isEmpty(eVar.d)) {
                    return null;
                }
                try {
                    return (Map) k.a().fromJson(eVar.d, (Class<Object>) Map.class);
                } catch (Exception unused) {
                    return null;
                }
            }

            @Override // com.sankuai.waimai.ad.interact.a.AbstractC0678a
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "266fbba1bb1274761377bdc23b6d9850", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "266fbba1bb1274761377bdc23b6d9850");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("view_id", this.e);
                if (this.c) {
                    hashMap.put("state", "satisfied");
                } else {
                    hashMap.put("state", "unsatisfied");
                }
                VapZoneCheckPlugin.this.a("irmo-vap-zone-satisfied", hashMap);
            }
        };
    }

    public VapZoneCheckPlugin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c89c2948d93ae2f0e26eb92955e877b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c89c2948d93ae2f0e26eb92955e877b");
        } else {
            this.capabilityID = "irmo-vap-zone-check";
        }
    }
}
