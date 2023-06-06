package com.sankuai.waimai.bussiness.order.detailnew.pgablock.root;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.order.api.detail.model.RiderInfo;
import com.sankuai.waimai.business.order.api.submit.model.ExpInfo;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.OrderExtInfo;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.n;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.o;
import com.sankuai.waimai.foundation.utils.aa;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("id")
    public String b;
    @SerializedName("wm_poi_id")
    public long c;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String d;
    @SerializedName(AgainManager.EXTRA_POI_NAME)
    public String e;
    @SerializedName("poi_icon")
    public String f;
    @SerializedName("wm_poi_valid")
    public int g;
    @SerializedName("business_type")
    public int h;
    @SerializedName("recipient_phone")
    public String i;
    @SerializedName("poi_info")
    public com.sankuai.waimai.business.order.api.detail.model.b j;
    @SerializedName("rider_info")
    public RiderInfo k;
    @SerializedName("order_common_info")
    public com.sankuai.waimai.business.order.api.detail.model.a l;
    @SerializedName("order_status_desc")
    public n m;
    @SerializedName("address_modify_info")
    public com.sankuai.waimai.bussiness.order.detailnew.network.response.a n;
    @SerializedName("rx_status_info_area")
    public o o;
    @SerializedName("exp_infos")
    public List<ExpInfo> p;
    @SerializedName("order_ext_info")
    public OrderExtInfo q;
    @SerializedName("ap_coupon_tag")
    public int r;
    @SerializedName("template_type")
    public int s;
    @SerializedName("biz_line")
    public String t;
    public String[] u;
    public String[] v;
    public String[] w;
    public String[] x;
    public transient JsonObject y;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "415a259a4e1b95d72fd3d38f18fa4489", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "415a259a4e1b95d72fd3d38f18fa4489");
        } else {
            this.d = "";
        }
    }

    public final int a() {
        if (this.l != null) {
            return this.l.w;
        }
        return 0;
    }

    public final boolean b() {
        return this.l != null && this.l.b == 2;
    }

    public final int c() {
        if (this.j != null) {
            return this.j.b;
        }
        return 0;
    }

    public final boolean d() {
        return this.l != null && this.l.p == 1;
    }

    public final boolean e() {
        return this.l != null && this.l.p == 0 && this.l.q == 1;
    }

    public final void a(Map<String, Object> map, Map<String, Object> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93bdc5014b6b15ca998e9dae8257f515", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93bdc5014b6b15ca998e9dae8257f515");
            return;
        }
        JsonObject jsonObject = new JsonObject();
        try {
            Gson a2 = com.sankuai.waimai.mach.utils.b.a();
            jsonObject.add(Constants.EventConstants.KEY_ORDER_ID, a2.toJsonTree(String.valueOf(map.get("id"))));
            jsonObject.add("poiId", a2.toJsonTree(String.valueOf(map.get("wm_poi_id"))));
            String valueOf = String.valueOf(map.get(FoodDetailNetWorkPreLoader.URI_POI_STR));
            if (aa.a(valueOf)) {
                valueOf = "";
            }
            jsonObject.add(FoodDetailNetWorkPreLoader.URI_POI_STR, a2.toJsonTree(valueOf));
            if (this.l != null) {
                jsonObject.add("biz_type", a2.toJsonTree(Integer.valueOf(this.l.z)));
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jsonObject.add(entry.getKey(), a2.toJsonTree(entry.getValue()));
            }
            for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                jsonObject.add(entry2.getKey(), a2.toJsonTree(entry2.getValue()));
            }
        } catch (Exception unused) {
        }
        this.y = jsonObject;
    }
}
