package com.sankuai.waimai.store.drug.goods.list.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.base.net.l;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.ae;
import com.sankuai.waimai.store.util.i;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends l<RestMenuResponse> {
    public static ChangeQuickRedirect b;
    private final long c;
    private long d;
    private String e;

    @Override // com.sankuai.waimai.store.base.net.l, com.sankuai.waimai.store.base.net.j
    public final /* synthetic */ void a(Object obj) {
        RestMenuResponse restMenuResponse = (RestMenuResponse) obj;
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd9d584c19dd1e43cf59788283bacebe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd9d584c19dd1e43cf59788283bacebe");
            return;
        }
        com.sankuai.waimai.store.order.a.e().a(this.d, this.e, restMenuResponse.getLongPoiId(), restMenuResponse.getStringPoiId());
        com.sankuai.waimai.store.platform.domain.core.shopcart.b k = com.sankuai.waimai.store.order.a.e().k(restMenuResponse.getOfficialPoiId());
        k.y = (Map) i.a(restMenuResponse.shoppingCartString, Map.class);
        k.z = (Map) i.a(restMenuResponse.poiString, Map.class);
        if (k.z == null) {
            String str = ae.b;
            ae.a(str, "shopmenurequestcallbackwrapper poiInfoString = null;" + restMenuResponse.poiString);
        }
        super.a((d) restMenuResponse);
    }

    public d(long j, String str, j<RestMenuResponse> jVar) {
        super(jVar);
        Object[] objArr = {new Long(j), str, jVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "575de899daea1a585225037e5a75e69c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "575de899daea1a585225037e5a75e69c");
            return;
        }
        this.c = -999L;
        this.d = -999L;
        this.d = j;
        this.e = str;
    }
}
