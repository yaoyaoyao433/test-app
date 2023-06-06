package com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.store.IOrderBusinessService;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k {
    public static ChangeQuickRedirect a;
    private final Context b;
    private final com.sankuai.waimai.bussiness.order.rocks.d c;

    public k(@NonNull Context context, @NonNull com.sankuai.waimai.bussiness.order.rocks.d dVar) {
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6b94180a7ff7f89c08894db2956db0d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6b94180a7ff7f89c08894db2956db0d");
            return;
        }
        this.b = context;
        this.c = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4596262d9784a5d64eb9c9d0fe71c9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4596262d9784a5d64eb9c9d0fe71c9a");
            return;
        }
        try {
            Map<String, Object> map2 = this.c.aL.a().b;
            if (map2 != null && !map2.isEmpty()) {
                HashMap hashMap = new HashMap();
                hashMap.put("foodlist", map2.get("foodlist"));
                HashMap<String, String> hashMap2 = new HashMap<>();
                hashMap2.put("poi_id", String.valueOf(this.c.D.a()));
                hashMap2.put(FoodDetailNetWorkPreLoader.URI_POI_STR, com.sankuai.waimai.bussiness.order.base.utils.i.b(this.c.E.a()));
                hashMap2.put("cid", "c_hgowsqb");
                hashMap2.put("params", URLEncoder.encode(com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(hashMap), "UTF-8"));
                IOrderBusinessService iOrderBusinessService = (IOrderBusinessService) com.sankuai.waimai.router.a.a(IOrderBusinessService.class, IOrderBusinessService.KEY_STORE_BUSINESS);
                if (iOrderBusinessService != null) {
                    iOrderBusinessService.showSGMrnDialog(this.b, hashMap2, 0, "sgc", IOrderBusinessService.COMPONENT_DETAIL_STOCK_OUT_STATUS, IOrderBusinessService.ENTRY_FLOAT_STOCK_OUT);
                }
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }
}
