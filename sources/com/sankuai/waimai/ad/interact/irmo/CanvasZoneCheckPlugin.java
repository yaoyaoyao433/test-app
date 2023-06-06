package com.sankuai.waimai.ad.interact.irmo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.interact.a;
import com.sankuai.waimai.irmo.canvas.mach.b;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CanvasZoneCheckPlugin extends com.sankuai.waimai.ad.interact.a<b> {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.ad.interact.a
    public final /* synthetic */ a.AbstractC0678a a(b bVar) {
        b bVar2 = bVar;
        Object[] objArr = {bVar2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05a1c342412d0245baabd49f91e5fb3d", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.AbstractC0678a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05a1c342412d0245baabd49f91e5fb3d");
        }
        if (bVar2 == null) {
            return null;
        }
        return new com.sankuai.waimai.ad.interact.a<b>.AbstractC0678a<b>(bVar2) { // from class: com.sankuai.waimai.ad.interact.irmo.CanvasZoneCheckPlugin.1
            public static ChangeQuickRedirect h;

            @Override // com.sankuai.waimai.ad.interact.a.AbstractC0678a
            public final Map a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01df855951480b3980a757676cef4d32", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01df855951480b3980a757676cef4d32");
                }
                if (this.b != 0) {
                    return ((b) this.b).i();
                }
                return null;
            }

            @Override // com.sankuai.waimai.ad.interact.a.AbstractC0678a
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "77e7017d8215dda3168a45082534be08", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "77e7017d8215dda3168a45082534be08");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("view_id", this.e);
                if (this.c) {
                    hashMap.put("state", "satisfied");
                } else {
                    hashMap.put("state", "unsatisfied");
                }
                CanvasZoneCheckPlugin.this.a("infinite-canvas-zone-satisfied", hashMap);
            }
        };
    }

    public CanvasZoneCheckPlugin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ac07ee23f99df175f63f0a55afbc20f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ac07ee23f99df175f63f0a55afbc20f");
        } else {
            this.capabilityID = "infinite-canvas-zone-check";
        }
    }
}
