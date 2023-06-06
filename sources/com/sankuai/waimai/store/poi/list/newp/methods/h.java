package com.sankuai.waimai.store.poi.list.newp.methods;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.poi.list.newp.sg.ChannelNavMachViewBlock;
import com.sankuai.waimai.store.widgets.filterbar.home.couponFilter.CouponFilterMachViewBlock;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h implements com.sankuai.waimai.store.mach.event.b {
    public static ChangeQuickRedirect a;
    private ChannelNavMachViewBlock.a b;
    private CouponFilterMachViewBlock.b c;

    public h(ChannelNavMachViewBlock.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44864b66a447e24042b63ec6ad5ff88f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44864b66a447e24042b63ec6ad5ff88f");
        } else {
            this.b = aVar;
        }
    }

    public h(CouponFilterMachViewBlock.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ea9091634c6f03e036bfe1be3b376d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ea9091634c6f03e036bfe1be3b376d0");
        } else {
            this.c = bVar;
        }
    }

    @Override // com.sankuai.waimai.store.mach.event.b
    public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13327da58783ee2430793f5afd3f78ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13327da58783ee2430793f5afd3f78ea");
        } else if ("home_nav_location_click".equals(str)) {
            com.sankuai.waimai.store.router.d.a(aVar.a(), com.sankuai.waimai.store.router.c.j);
        } else if ("home_nav_click_more".equals(str)) {
            if (this.b != null) {
                this.b.a();
            }
        } else if ("home_nav_click_share".equals(str)) {
            if (this.b != null) {
                this.b.b();
            }
        } else if (!"selectActivityFilter".equals(str) || this.c == null) {
        } else {
            this.c.a(map);
        }
    }
}
