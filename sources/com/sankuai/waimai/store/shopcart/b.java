package com.sankuai.waimai.store.shopcart;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.base.net.l;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCartAndPoi;
import com.sankuai.waimai.store.util.ae;
import com.sankuai.waimai.store.util.i;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends l<PoiShoppingCartAndPoi> {
    public static ChangeQuickRedirect b;
    private long c;
    private String d;

    @Override // com.sankuai.waimai.store.base.net.l, com.sankuai.waimai.store.base.net.j
    public final /* synthetic */ void a(Object obj) {
        PoiShoppingCartAndPoi poiShoppingCartAndPoi = (PoiShoppingCartAndPoi) obj;
        Object[] objArr = {poiShoppingCartAndPoi};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b2e530bd96b802a3cb908164998cc7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b2e530bd96b802a3cb908164998cc7e");
            return;
        }
        if (poiShoppingCartAndPoi != null && poiShoppingCartAndPoi.poi != null && poiShoppingCartAndPoi.poi.getLongPoiId() != 0 && this.c != poiShoppingCartAndPoi.poi.getLongPoiId()) {
            com.sankuai.waimai.store.order.a.e().a(this.c, this.d, poiShoppingCartAndPoi.poi.getLongPoiId(), poiShoppingCartAndPoi.poi.getStringPoiId());
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.b k = com.sankuai.waimai.store.order.a.e().k(com.sankuai.waimai.store.platform.domain.manager.poi.a.a(this.c, this.d));
        Map<String, Object> map = k.y;
        Map<String, Object> map2 = k.z;
        if (map == null || map.keySet().size() <= 0 || map2 == null || map2.keySet().size() <= 0) {
            k.y = (Map) i.a(poiShoppingCartAndPoi.shoppingCartString, Map.class);
            k.z = (Map) i.a(poiShoppingCartAndPoi.poiString, Map.class);
        }
        if (k.z == null) {
            String str = ae.b;
            ae.a(str, "cart/info poiInfoString = null;" + poiShoppingCartAndPoi.poiString);
        }
        String str2 = ae.b;
        StringBuilder sb = new StringBuilder("PoiAndShoppingCartCallbackWrapper.onSuccess cartData=");
        sb.append(k != null ? Integer.valueOf(k.hashCode()) : "-1");
        ae.a(str2, sb.toString());
        super.a((b) poiShoppingCartAndPoi);
    }

    public b(long j, String str, j<PoiShoppingCartAndPoi> jVar) {
        super(jVar);
        Object[] objArr = {new Long(j), str, jVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba5606e52d1eed37cf5f1fa5766f2a00", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba5606e52d1eed37cf5f1fa5766f2a00");
            return;
        }
        this.c = j;
        this.d = str;
    }
}
