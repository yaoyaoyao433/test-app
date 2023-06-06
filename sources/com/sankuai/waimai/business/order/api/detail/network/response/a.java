package com.sankuai.waimai.business.order.api.detail.network.response;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("is_pop_up")
    public int b;
    @SerializedName("order_view_id")
    public long c;
    @SerializedName("wm_poi_id")
    public long d;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String e;
    @SerializedName("title")
    public String f;
    @SerializedName("wm_poi_logo")
    public String g;
    @SerializedName("wm_poi_name")
    public String h;
    @SerializedName("order_complete_time")
    public String i;
    @SerializedName("button_text")
    public String j;
    @SerializedName("stimulate_type")
    public int k;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f9e69baa129e471f3a3f4149bca0fd4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f9e69baa129e471f3a3f4149bca0fd4");
        } else {
            this.e = "";
        }
    }
}
