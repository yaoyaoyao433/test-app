package com.sankuai.waimai.store.order.detail.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.order.api.detail.model.a;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class RXAreaStatusModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("order_common_info")
    public a orderCommonInfo;
    @SerializedName(Constants.EventConstants.KEY_ORDER_ID)
    public String orderId;
    @SerializedName("poiId")
    public Long poiId;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String poiIdStr;
    @SerializedName("rx_status_info_area")
    public RXAreaStatus rxAreaStatus;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class RXAreaStatus {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("rx_status_info_map")
        public a statusMap;

        /* compiled from: ProGuard */
        /* loaded from: classes5.dex */
        public static class a implements Serializable {
            @SerializedName("mach_model")
            public String a;
            @SerializedName("native_model")
            public String b;
        }
    }
}
