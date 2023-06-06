package com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.jsevent;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.mach.event.b;
import com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.d;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    public d.a b;

    public a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb4d417e97e78e47b958473d7425bce5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb4d417e97e78e47b958473d7425bce5");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.mach.event.b
    public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a92c0dd121a3f01bd5c0369f664533e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a92c0dd121a3f01bd5c0369f664533e8");
        } else if (this.b != null && str.equals("coupon_filter_click_event") && map != null && map.containsKey("coupon_id") && map.containsKey("is_select")) {
            this.b.a(String.valueOf(map.get("coupon_id")), ((Long) map.get("is_select")).longValue() == 1);
        }
    }
}
