package com.sankuai.waimai.store.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public final class SGGoodAttrValue implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("id")
    public long id;
    @SerializedName(JsBridgeResult.ARG_KEY_LOCATION_MODE)
    private int mode;
    @SerializedName("picture")
    public String picture;
    @SerializedName("sku_ids")
    public List<Long> skuIds;
    @SerializedName("status")
    private int status;
    @SerializedName("value")
    public String value;

    public final boolean isSoldableSpu() {
        return this.status == 1;
    }

    public final boolean isNonSaleAttr() {
        return this.mode == 1;
    }

    public final GoodsAttr convertToServerAttr(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d21b4ac0e02fb51ac346c51e6947c0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsAttr) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d21b4ac0e02fb51ac346c51e6947c0f");
        }
        GoodsAttr goodsAttr = new GoodsAttr();
        goodsAttr.id = this.id;
        goodsAttr.value = this.value;
        goodsAttr.setName(str);
        return goodsAttr;
    }
}
