package com.sankuai.waimai.landing.state;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.landing.state.a;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends a<com.sankuai.waimai.landing.a> {
    public static ChangeQuickRedirect d;
    public com.sankuai.waimai.landing.report.a e;

    @Override // com.sankuai.waimai.landing.state.a
    public final /* synthetic */ a.EnumC0985a b(b bVar, com.sankuai.waimai.landing.a aVar) {
        com.sankuai.waimai.landing.a aVar2 = aVar;
        Object[] objArr = {bVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bae24d5691a49a042d98f31041620488", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.EnumC0985a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bae24d5691a49a042d98f31041620488");
        }
        if (aVar2 == null || !aVar2.c()) {
            return a.EnumC0985a.ABANDON;
        }
        if (!aVar2.equals(this.c) && bVar != b.ROUTE_START) {
            return a.EnumC0985a.ABANDON;
        }
        if (bVar == b.ROUTE_START && this.b.k > b.IDLE.k) {
            com.sankuai.waimai.foundation.utils.log.a.e("LandingStateMachine", "interrupt another.", new Object[0]);
            aVar2.i = true;
            a();
        }
        if (bVar == b.ROUTE_START) {
            aVar2.a(System.currentTimeMillis());
        } else {
            aVar2.a(((com.sankuai.waimai.landing.a) this.c).g);
            long currentTimeMillis = aVar2.g > 0 ? System.currentTimeMillis() - aVar2.g : 0L;
            Object[] objArr2 = {new Long(currentTimeMillis)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.landing.a.a;
            if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "ff0b94495c56eb347353ed8d57b542e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "ff0b94495c56eb347353ed8d57b542e9");
            } else {
                aVar2.h = currentTimeMillis;
            }
        }
        a.EnumC0985a b = super.b(bVar, aVar2);
        if (b == a.EnumC0985a.RESET) {
            com.sankuai.waimai.report.c.a().a("LandingRateReset", Collections.singletonList(Float.valueOf(1.0f))).a("slot", aVar2.b).a("channel", aVar2.c).a("page_type", aVar2.a().name()).a("reset_by", bVar.name()).a("current_state", this.b.name()).a();
        }
        return b;
    }

    @Override // com.sankuai.waimai.landing.state.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2464795b7f9cc976fb9f5c80eb2838b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2464795b7f9cc976fb9f5c80eb2838b");
        } else if (this.b == null || this.e == null) {
        } else {
            switch (this.b) {
                case ROUTE_START:
                    this.e.a((com.sankuai.waimai.landing.a) this.c);
                    return;
                case ROUTE_SUCCESS:
                    this.e.a((com.sankuai.waimai.landing.a) this.c, true);
                    return;
                case ROUTE_FAILED:
                    this.e.a((com.sankuai.waimai.landing.a) this.c, false);
                    break;
                case PAGE_CREATED:
                    this.e.b((com.sankuai.waimai.landing.a) this.c);
                    return;
                case PAGE_DATA_SUCCESS:
                    this.e.b((com.sankuai.waimai.landing.a) this.c, true);
                    return;
                case PAGE_DATA_FAILED:
                    this.e.b((com.sankuai.waimai.landing.a) this.c, false);
                    break;
                case PAGE_SHOWN:
                    this.e.c((com.sankuai.waimai.landing.a) this.c);
                    break;
            }
            a();
        }
    }
}
