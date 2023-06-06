package com.sankuai.waimai.bussiness.order.confirm.model.preview.param;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.model.CyclePurchaseInfo;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.confirm.coupon.model.f;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.AdditionalBargainInput;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.OrderFoodInput;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    @SerializedName("coupon_view_id")
    public String A;
    @SerializedName("poicoupon_view_id")
    public String B;
    @SerializedName("goods_coupon_view_id")
    public String C;
    @SerializedName("sg_item_coupon_view_id")
    public String D;
    @SerializedName("cart_id")
    public String E;
    @SerializedName("business_type")
    public int F;
    @SerializedName("insurance_selected")
    public int G;
    @SerializedName("allowance_alliance_scenes")
    public String H;
    @SerializedName("ad_activity_flag")
    public String I;
    @SerializedName("prescription_info")
    public Map<String, Object> J;
    @SerializedName("original_price")
    public double K;
    @SerializedName("client_cache_status")
    public int L;
    @SerializedName("recommend_coupon_info")
    public String M;
    @SerializedName("preview_order_callback_info")
    public String N;
    @SerializedName("addr_biz_page")
    public String O;
    @SerializedName("ap_params")
    public List<Map<String, Object>> P;
    @SerializedName("cycle_purchase_info")
    public CyclePurchaseInfo Q;
    @SerializedName("address_districts")
    public List<AddressItem.District> R;
    @SerializedName("ignore_address_recommend")
    public boolean S;
    @SerializedName("additional_bargain_list")
    public List<AdditionalBargainInput> T;
    @SerializedName("need_recommend_pickup_cabinet")
    public int U;
    @SerializedName("medical_recommend")
    public int V;
    @SerializedName("act_page_code")
    public String W;
    @SerializedName("pay_sdk_version")
    public String X;
    @SerializedName("ext_param")
    public Map<String, Object> Y;
    @SerializedName("selected_coupons")
    public List<f> Z;
    @SerializedName("user_select_term")
    public Map<String, Object> aa;
    @SerializedName("wm_poi_id")
    public long b;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String c;
    @SerializedName("user_id")
    @Deprecated
    public long d;
    @SerializedName("digest")
    public String e;
    @SerializedName("foodlist")
    public ArrayList<OrderFoodInput> f;
    @SerializedName("addr_id")
    public long g;
    @SerializedName("recipient_phone")
    public String h;
    @SerializedName("recipient_name")
    public String i;
    @SerializedName("recipient_address")
    public String j;
    @SerializedName("house_number")
    public String k;
    @SerializedName("recipient_gender")
    public String l;
    @SerializedName("addr_latitude")
    public int m;
    @SerializedName("addr_longitude")
    public int n;
    @SerializedName("address_category")
    public int o;
    @SerializedName("bind_type")
    public long p;
    @SerializedName("address_info")
    public Map<String, Object> q;
    @SerializedName("caution")
    public String r;
    @SerializedName("token")
    public String s;
    @SerializedName("coupon_code")
    public String t;
    @SerializedName("wm_order_pay_type")
    public int u;
    @SerializedName("expected_arrival_time")
    public int v;
    @SerializedName("invoice_title")
    public String w;
    @SerializedName("invoice_type")
    public int x;
    @SerializedName("hash_id")
    public String y;
    @SerializedName("submit_once_again")
    public int z;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "142b7a9ea8799a8c98ac10656bea1026", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "142b7a9ea8799a8c98ac10656bea1026");
        } else {
            this.c = "";
        }
    }

    public String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a00497372d72042124c15fe7f75e07bd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a00497372d72042124c15fe7f75e07bd") : new Gson().toJson(this);
    }

    public static int a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ea1044ee59293d61d6bd1c445efd3e8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ea1044ee59293d61d6bd1c445efd3e8")).intValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(CommonConstant.Symbol.COLON);
        sb.append(i2);
        return com.sankuai.waimai.platform.capacity.persistent.sp.a.b(b.a, sb.toString(), 0) >= 2 ? 0 : 1;
    }

    public static int a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92c074194aafe59fd5cb191c29768903", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92c074194aafe59fd5cb191c29768903")).intValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(com.sankuai.waimai.platform.domain.manager.user.a.i().d());
        sb.append(CommonConstant.Symbol.UNDERLINE);
        sb.append(j);
        sb.append("_aoi_addr_tip");
        return com.sankuai.waimai.platform.capacity.persistent.sp.a.b(b.a, sb.toString(), 0L) > 0 ? 1 : 0;
    }
}
