package com.sankuai.waimai.store.order.detail.blockview;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.store.order.prescription.model.mach.OrderConfirmMachTemplate;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    private com.sankuai.waimai.store.order.prescription.view.c e;

    public h(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e0605d8ca4d339310e8a848ada6aafe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e0605d8ca4d339310e8a848ada6aafe");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final View c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47bf76174d776bcb8f59c245e04c1d48", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47bf76174d776bcb8f59c245e04c1d48");
        }
        this.e = new com.sankuai.waimai.store.order.prescription.view.c((Activity) this.c, this.c instanceof BaseActivity ? ((BaseActivity) this.c).w() : "");
        return this.e.a();
    }

    public final void a(String str, Long l, String str2, String str3, com.sankuai.waimai.business.order.api.detail.model.a aVar) {
        Object[] objArr = {str, l, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e66fc07b78d5d9e0f0c087d87109838", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e66fc07b78d5d9e0f0c087d87109838");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str3);
        hashMap.put("poi_id", l);
        hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str2);
        if (aVar != null) {
            hashMap.put("order_status", Integer.valueOf(aVar.e));
        }
        this.e.a((List) com.sankuai.waimai.store.util.i.a(str, new TypeToken<List<OrderConfirmMachTemplate>>() { // from class: com.sankuai.waimai.store.order.detail.blockview.h.1
        }.getType()), hashMap, "c_hgowsqb");
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11f535dd5a7a10eb2f40177231e0735d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11f535dd5a7a10eb2f40177231e0735d");
        } else if (this.e != null) {
            this.e.f();
        }
    }
}
