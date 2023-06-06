package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class LastBoughtPoi extends PoiVerticality implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("back_pic_url")
    public String backPicUrl;
    @SerializedName("lately_bought_product")
    public List<LastBoughtProduct> lastBoughtProduct;
    @SerializedName("poi_recommend")
    public String poiRecommend;
    @SerializedName("poi_recommend_code")
    public int poiRecommendCode;
    @SerializedName("position")
    public int position;
    @SerializedName("simple_shipping_fee_tip")
    public String simpleShippingFeeTip;
    @SerializedName("style_maps")
    public PoiStyle stylesMaps;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiStyle implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("back_ground_pic_url")
        public String backGroundPicUrl;
        @SerializedName("down_shading_color")
        public String downShaingColor;
        @SerializedName("up_shading_color")
        public String upShadingColor;
    }

    public LastBoughtPoi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f623f81b0edcde103d7a4ff67fcda5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f623f81b0edcde103d7a4ff67fcda5e");
        } else {
            this.position = 0;
        }
    }

    public List<LastBoughtProduct> getLastBoughtProduct() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e8d8776ca0b414242e4acf3322f898d", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e8d8776ca0b414242e4acf3322f898d");
        }
        int a = com.sankuai.shangou.stone.util.a.a((List) this.lastBoughtProduct);
        if (this.position != 2 || a <= 2) {
            if (a < 2) {
                return null;
            }
            if (a >= 2 && a <= 4) {
                return this.lastBoughtProduct;
            }
            return com.sankuai.shangou.stone.util.a.a(this.lastBoughtProduct, 0, 4);
        }
        return com.sankuai.shangou.stone.util.a.a(this.lastBoughtProduct, 0, 2);
    }
}
