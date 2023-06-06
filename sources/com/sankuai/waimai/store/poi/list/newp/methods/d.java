package com.sankuai.waimai.store.poi.list.newp.methods;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements com.sankuai.waimai.store.mach.event.b {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.param.a b;

    public d(com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db24cc4575b1117d8b00029bc85bb706", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db24cc4575b1117d8b00029bc85bb706");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.mach.event.b
    public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8ad4266ab330f1c82d7f4417fc1aa5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8ad4266ab330f1c82d7f4417fc1aa5e");
        } else if (p.a(map) || map.get("index") == null) {
        } else {
            int intValue = ((Long) map.get("index")).intValue();
            Object[] objArr2 = {Integer.valueOf(intValue)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e4b0f9a4e33c25b1da0c9c3e0d1b5dc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e4b0f9a4e33c25b1da0c9c3e0d1b5dc");
            } else {
                com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poi.list.refactor.card.background.a(intValue));
            }
        }
    }
}
