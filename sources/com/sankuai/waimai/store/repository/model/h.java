package com.sankuai.waimai.store.repository.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h {
    public static ChangeQuickRedirect a;
    @SerializedName("coupon_info_tag")
    public String b;
    @SerializedName("icon_url")
    public String c;
    @SerializedName("coupon_category_list")
    public List<Poi.CouponCategoryList> d;
    @SerializedName("coupon_tab_info")
    public Poi.CouponTabInfo e;
    @SerializedName("poi_member_grade")
    public int f;
    @SerializedName("product_mrn_reform")
    public int g;
    public boolean h;
    public Object i;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d40a958d4096fe2f4ae3f2161193a45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d40a958d4096fe2f4ae3f2161193a45");
        } else {
            this.h = false;
        }
    }

    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dabe6a4181020d132795a04c799fef88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dabe6a4181020d132795a04c799fef88");
            return;
        }
        this.b = jSONObject.optString("coupon_info_tag");
        this.c = jSONObject.optString("icon_url");
        this.f = jSONObject.optInt("poi_member_grade");
        JSONArray optJSONArray = jSONObject.optJSONArray("coupon_category_list");
        this.d = new ArrayList();
        for (int i = 0; optJSONArray != null && i < optJSONArray.length(); i++) {
            this.d.add((Poi.CouponCategoryList) com.sankuai.waimai.store.util.i.a(optJSONArray.optJSONObject(i).toString(), Poi.CouponCategoryList.class));
        }
        this.e = (Poi.CouponTabInfo) com.sankuai.waimai.store.util.i.a(jSONObject.optString("coupon_tab_info"), Poi.CouponTabInfo.class);
        this.g = jSONObject.optInt("product_mrn_reform");
    }
}
