package com.sankuai.waimai.store.order.prescription.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class OrderFoodInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("combo_products")
    public List<ComboProduct> comboProducts;
    @SerializedName("count")
    public int count;
    @SerializedName("id")
    public long id;
    @SerializedName("rx_flag")
    public boolean isRx;
    @SerializedName("name")
    public String name;
    @SerializedName("spu_id")
    public long spuId;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ComboProduct implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("count")
        public int count;
        @SerializedName("rx_flag")
        public boolean isRx;
        @SerializedName("sku_id")
        public long skuId;
        @SerializedName("spu_id")
        public long spuId;
    }
}
