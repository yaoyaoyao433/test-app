package com.sankuai.waimai.store.base.net.sg;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.i;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCartAndPoi;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.NetPriceCalculatorResult;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d extends com.sankuai.waimai.store.base.net.d<SCPlatformApiService> {
    public static ChangeQuickRedirect a;

    public static d a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9306d2ed8a95fa27c4a3e63f4f3a7108", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9306d2ed8a95fa27c4a3e63f4f3a7108");
        }
        d dVar = (d) com.sankuai.waimai.store.base.net.c.a(obj, d.class);
        if (dVar == null) {
            d dVar2 = new d();
            com.sankuai.waimai.store.base.net.c.a(obj, dVar2);
            return dVar2;
        }
        return dVar;
    }

    public static d c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "641389173669221af178b042c6dc4b98", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "641389173669221af178b042c6dc4b98") : new d();
    }

    @Override // com.sankuai.waimai.store.base.net.d
    @NonNull
    public final i a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ebeafbf96323b740d4c89756eeb56e2", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ebeafbf96323b740d4c89756eeb56e2") : new e();
    }

    public final void a(String str, j<NetPriceCalculatorResult> jVar) {
        Object[] objArr = {str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53701358ed1fdc8512b7e76c8b439936", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53701358ed1fdc8512b7e76c8b439936");
        } else {
            a(jVar, ((SCPlatformApiService) this.d).getNetPriceCalculatorResult(str));
        }
    }

    public final void a(String str, String str2, String str3, j<PoiShoppingCartAndPoi> jVar, int i) {
        Object[] objArr = {str, str2, str3, jVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60ba7675da9f8bf80913cd0e9f42b07e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60ba7675da9f8bf80913cd0e9f42b07e");
        } else {
            a(jVar, ((SCPlatformApiService) this.d).getPoiAndShopcartInfo(str, str2, str3, i));
        }
    }
}
