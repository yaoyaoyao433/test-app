package com.sankuai.waimai.business.restaurant.poicontainer.pga;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.viewmodel.a {
    public static ChangeQuickRedirect o;
    public g p;
    public RestaurantSchemeParams q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    private Activity v;
    private String w;

    public c(Activity activity, g gVar) {
        super((Context) activity);
        Object[] objArr = {activity, gVar};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70a18e0ef826f982dfff7e1e553d2184", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70a18e0ef826f982dfff7e1e553d2184");
            return;
        }
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = -1;
        this.v = activity;
        this.p = gVar;
    }

    public final void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "005c2585cb11ac7a19883706d0b1fbaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "005c2585cb11ac7a19883706d0b1fbaf");
            return;
        }
        this.q = RestaurantSchemeParams.readIntentData(this.v.getIntent(), null);
        this.t = this.q.mChosenSpuNeedAdd;
        o();
        a(this.q.mRanListId);
        this.s = this.q.mNeedOpenShopCart;
        this.u = this.q.previewProcessResponseCode;
        if (this.p.o() == 3 || this.p.a()) {
            this.s = false;
        }
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7023cb75257189e23f90ecc7c23b54d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7023cb75257189e23f90ecc7c23b54d2");
            return;
        }
        String str = this.q.unpl;
        if (!TextUtils.isEmpty(str) && str.length() < 256) {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a.getApplicationContext(), "unpl", str);
        }
        if (!TextUtils.isEmpty(this.q.unFoodListArray)) {
            this.r = true;
        }
        List<OrderedFood> list = this.q.foodList;
        String str2 = this.q.mPoiIdStr;
        if (TextUtils.isEmpty(str2)) {
            str2 = com.sankuai.waimai.platform.domain.core.poi.b.a(this.q.mPoiId);
        }
        if (!com.sankuai.waimai.foundation.utils.d.a(list)) {
            k.a().f(str2, list);
            k.a().e(str2);
        }
        String str3 = this.q.orderAgainFoodList;
        if (!TextUtils.isEmpty(str3)) {
            try {
                k.a().f(str2, OrderedFood.fromOrderAgain(new JSONArray(str3)));
                k.a().e(str2);
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
        this.w = this.q.mFrom;
        if ("from poi list".equals(this.w) || "from poi list after sort".equals(this.w) || "from king kong poi list".equals(this.w)) {
            com.sankuai.waimai.ai.uat.b.a().b();
        }
        com.sankuai.waimai.business.restaurant.poicontainer.c.a().b().a(this.v.getIntent());
        this.p.r = this.q.spuTagId;
        this.p.s = this.q.anchorTagId;
        this.p.a(this.q.mPoiId, this.q.mPoiIdStr);
        this.p.k = false;
        this.p.o = this.q.mBusinessType;
        this.p.q = this.q.mBusinessScene;
        this.p.m = com.sankuai.waimai.restaurant.shopcart.utils.c.a(this.v.getIntent());
        this.p.y = this.q.linkIdentifierInfo;
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4fa3bead3bd03cb8f5fdb587cf65179", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4fa3bead3bd03cb8f5fdb587cf65179");
        } else {
            super.d();
        }
    }
}
