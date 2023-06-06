package com.sankuai.waimai.business.restaurant.base.domain.moneyoff;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class MoneyOffSpu {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("count")
    public int count;
    @SerializedName("food_spu")
    public GoodsSpu goodsSpu;
    @SerializedName("in_cart_text")
    public String inCartText;
    @SerializedName("in_cart_url")
    public String inCartUrl;
    @SerializedName("name")
    public String name;
    @SerializedName("pic_url")
    public String picUrl;
    @SerializedName("price")
    public double price;
    @SerializedName("sku_id")
    public long skuId;
    @SerializedName("sku_type_icon_url")
    public String skuTypeIconUrl;
    @SerializedName("sku_type_text")
    public String skuTypeText;
    @SerializedName("spu_id")
    public long spuId;
    @SerializedName("stock")
    public int stock;

    public GoodsSku getTargetSku() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5255b2b924cc5cc79aaa9c842f8d726", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSku) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5255b2b924cc5cc79aaa9c842f8d726");
        }
        if (this.goodsSpu == null || d.a(this.goodsSpu.getSkuList())) {
            return null;
        }
        List<GoodsSku> skuList = this.goodsSpu.getSkuList();
        GoodsSku goodsSku = skuList.get(0);
        for (GoodsSku goodsSku2 : skuList) {
            if (goodsSku2.id == this.skuId) {
                return goodsSku2;
            }
        }
        return goodsSku;
    }
}
