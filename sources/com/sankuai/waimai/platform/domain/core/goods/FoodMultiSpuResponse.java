package com.sankuai.waimai.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class FoodMultiSpuResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("spu_attrs")
    public List<GoodsAttrList> multiAttrsList;
    @SerializedName("sku_attrs_map")
    public Map<Long, List<g>> skuAttrsMap;
}
