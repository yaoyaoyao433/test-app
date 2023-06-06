package com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.order.ComboProduct;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class UnAvailableFood implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("premium_attrs")
    public List<GoodsAttr> addPriceAttrs;
    @SerializedName("attrs")
    public List<GoodsAttr> attrs;
    @SerializedName("attr_list")
    public List<GoodsAttr> attrsList;
    @SerializedName("available")
    public boolean available = true;
    @SerializedName("canNotBuyCount")
    public int canNotBuyCount;
    @SerializedName("combo_products")
    public List<ComboProduct> comboProducts;
    @SerializedName("name")
    public String name;
    @SerializedName("picture")
    public String picture;
    @SerializedName("reason")
    public String reason;
    @SerializedName("simple_error_reason")
    public String simpleErrorReason;
    @SerializedName("id")
    public long skuId;
    @SerializedName("spec")
    public String spec;
    @SerializedName("spu_id")
    public long spuId;
    @SerializedName("stock")
    public int stock;
    @SerializedName("unavailable_count")
    public int unavailableCount;
}
