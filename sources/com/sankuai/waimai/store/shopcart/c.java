package com.sankuai.waimai.store.shopcart;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.base.net.l;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.ae;
import com.sankuai.waimai.store.util.i;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends l<RestMenuResponse> {
    public static ChangeQuickRedirect b;
    private final long c;
    private long d;
    private String e;

    @Override // com.sankuai.waimai.store.base.net.l, com.sankuai.waimai.store.base.net.j
    public final /* synthetic */ void a(Object obj) {
        String a;
        RestMenuResponse restMenuResponse = (RestMenuResponse) obj;
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5817e03d272d2a35ba1237a2c62b29be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5817e03d272d2a35ba1237a2c62b29be");
            return;
        }
        if (this.d == -999) {
            a = restMenuResponse.getOfficialPoiId();
        } else {
            a = com.sankuai.waimai.store.platform.domain.manager.poi.a.a(this.e, this.d);
            com.sankuai.waimai.store.order.a.e().a(this.d, com.sankuai.waimai.store.platform.domain.manager.poi.a.a(this.e, this.d), restMenuResponse.getPoiId(), restMenuResponse.getOfficialPoiId());
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.b k = com.sankuai.waimai.store.order.a.e().k(a);
        k.y = (Map) i.a(restMenuResponse.shoppingCartString, Map.class);
        k.z = (Map) i.a(restMenuResponse.poiString, Map.class);
        if (k.z == null) {
            String str = ae.b;
            ae.a(str, "shopmenurequestcallbackwrapper poiInfoString = null;" + restMenuResponse.poiString);
        }
        String str2 = ae.b;
        ae.a(str2, "shopmenurequestcallbackwrapper cartData=" + k.hashCode() + "; appId=[" + this.d + CommonConstant.Symbol.COMMA + com.sankuai.waimai.store.platform.domain.manager.poi.a.a(this.e, this.d) + CommonConstant.Symbol.COMMA + restMenuResponse.getPoiId() + CommonConstant.Symbol.COMMA + restMenuResponse.getOfficialPoiId() + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        super.a((c) restMenuResponse);
    }

    public c(long j, String str, j<RestMenuResponse> jVar) {
        super(jVar);
        Object[] objArr = {new Long(j), str, jVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2163c6cafca22f372bb12b2506b145c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2163c6cafca22f372bb12b2506b145c");
            return;
        }
        this.c = -999L;
        this.d = -999L;
        this.d = j;
        this.e = str;
    }
}
