package com.sankuai.waimai.store.poi.list.newp.methods;

import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.repository.model.PrimaryFilterCondList;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f implements com.sankuai.waimai.store.mach.event.b {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.param.a b;

    public f(com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c665e087d926d1e3947e762db28ebfbd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c665e087d926d1e3947e762db28ebfbd");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.mach.event.b
    public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97d1dcea4a640655e8503c2430b7902a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97d1dcea4a640655e8503c2430b7902a");
        } else if (map == null || map.size() == 0) {
        } else {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 1052324123) {
                if (hashCode == 1257439634 && str.equals("home_kingkong_update_bubble_data")) {
                    c = 0;
                }
            } else if (str.equals("jump_to_search")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = o.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "928ebf762671cfabd1152a10d9a09c36", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "928ebf762671cfabd1152a10d9a09c36")).booleanValue() : com.sankuai.waimai.store.config.i.h().a("optimize/use_mach_kingkong", true)) {
                        com.sankuai.waimai.store.poi.list.newp.bubble.a.a((PrimaryFilterCondList.Bubble) com.sankuai.waimai.store.util.i.a(com.sankuai.waimai.store.util.i.a(map.get("bubble")), PrimaryFilterCondList.Bubble.class));
                        return;
                    }
                    return;
                case 1:
                    if (map.get(NetLogConstants.Details.SCHEME) != null) {
                        String valueOf = String.valueOf(map.get(NetLogConstants.Details.SCHEME));
                        if (t.a(valueOf)) {
                            return;
                        }
                        com.sankuai.waimai.store.router.d.a(aVar.a(), valueOf, com.sankuai.waimai.store.router.g.a(this.b));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
