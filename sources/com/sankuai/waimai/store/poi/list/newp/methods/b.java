package com.sankuai.waimai.store.poi.list.newp.methods;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.sankuai.waimai.store.mach.event.b {
    public static ChangeQuickRedirect a;
    private int b;
    private String c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be2f9cefca3ebc4bff18e37d970214a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be2f9cefca3ebc4bff18e37d970214a3");
            return;
        }
        this.b = -99;
        this.c = "";
    }

    @Override // com.sankuai.waimai.store.mach.event.b
    public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67f5ccb2c2b89b2719572452053c2c4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67f5ccb2c2b89b2719572452053c2c4c");
        } else if (p.a(map)) {
        } else {
            if (map.get("sort_type") != null) {
                this.b = ((Long) map.get("sort_type")).intValue();
            }
            if (map.get("activity_filter_codes") != null) {
                this.c = (String) map.get("activity_filter_codes");
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "771666a1ebcc2693fea524a060011deb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "771666a1ebcc2693fea524a060011deb");
            } else {
                com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.convenient.landing.a(this.b, this.c));
            }
        }
    }
}
