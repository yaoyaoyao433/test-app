package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttrList;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class RecommendProductItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String activityTag;
    public ArrayList<GoodsAttrList> attrList;
    public long id;
    public double minSkuPrice;
    public String name;
    public ArrayList<com.sankuai.waimai.platform.domain.core.goods.e> productMedia;
    public String promotionInfo;
    public String recommendReason;
    public String scheme;
    public String skuLabel;
    public ArrayList<GoodsSku> skuList;
    public String skuUnit;
    public String tag;

    public void parseJson(JSONObject jSONObject) {
        JSONArray optJSONArray;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "daf820f4f8fe87c44f05b29d850ce23d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "daf820f4f8fe87c44f05b29d850ce23d");
        } else if (jSONObject != null) {
            this.id = jSONObject.optLong("spu_id");
            this.name = jSONObject.optString("name");
            JSONObject optJSONObject = jSONObject.optJSONObject("product_media");
            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("media_info")) != null) {
                this.productMedia = new ArrayList<>();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    com.sankuai.waimai.platform.domain.core.goods.e eVar = new com.sankuai.waimai.platform.domain.core.goods.e();
                    eVar.b = optJSONObject2.optInt("type");
                    eVar.c = optJSONObject2.optString("url");
                    eVar.d = optJSONObject2.optString("video_cover");
                    eVar.e = optJSONObject2.optInt("video_duration");
                    eVar.f = optJSONObject2.optString("video_size");
                    eVar.g = optJSONObject2.optInt("video_height");
                    eVar.h = optJSONObject2.optInt("video_width");
                    this.productMedia.add(eVar);
                }
            }
            this.recommendReason = jSONObject.optString("recommend_reason");
            this.minSkuPrice = jSONObject.optDouble("min_sku_price");
            this.skuUnit = jSONObject.optString("sku_unit");
            JSONArray optJSONArray2 = jSONObject.optJSONArray("attr_list");
            if (optJSONArray2 != null) {
                this.attrList = new ArrayList<>();
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i2);
                    GoodsAttrList goodsAttrList = new GoodsAttrList();
                    goodsAttrList.parseJson(optJSONObject3);
                    this.attrList.add(goodsAttrList);
                }
            }
            this.skuLabel = jSONObject.optString("sku_label");
            this.scheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
            this.activityTag = jSONObject.optString("activity_tag");
            this.tag = jSONObject.optString("tag");
            this.promotionInfo = jSONObject.optString("promotion_info");
            JSONArray optJSONArray3 = jSONObject.optJSONArray("sku_list");
            if (optJSONArray3 != null) {
                this.skuList = new ArrayList<>();
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    JSONObject optJSONObject4 = optJSONArray3.optJSONObject(i3);
                    GoodsSku goodsSku = new GoodsSku();
                    goodsSku.parseJson(optJSONObject4);
                    this.skuList.add(goodsSku);
                }
            }
        }
    }
}
