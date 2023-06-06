package com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.detail.model.RiderInfo;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.AttentionInfo;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.CityDeliveryArea;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.LotteryInfo;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.n;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.o;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.p;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.r;
import com.sankuai.waimai.bussiness.order.detailnew.util.d;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderFixAreaInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("animation_info")
    public AnimationInfo animationInfo;
    @SerializedName("attention_info")
    @Deprecated
    public AttentionInfo attentionInfo;
    @SerializedName("city_delivery_area")
    public CityDeliveryArea cityDeliveryArea;
    @SerializedName("lottery_info")
    public LotteryInfo mLotteryInfo;
    @SerializedName("order_common_info")
    public com.sankuai.waimai.business.order.api.detail.model.a orderCommonInfo;
    @SerializedName("id")
    public String orderId;
    @SerializedName("order_status_desc")
    public n orderStatusDesc;
    @SerializedName("poi_info")
    public com.sankuai.waimai.business.order.api.detail.model.b poiInfo;
    @SerializedName("progress_bar_info")
    public CityDeliveryArea progressBarInfo;
    @SerializedName("rider_info")
    public RiderInfo riderInfo;
    @SerializedName("rx_status_info_area")
    public o rxAreaStatus;
    @SerializedName("self_delivery_area")
    public p selfDeliveryArea;
    @SerializedName("tracking_info")
    public String trackingInfo;
    @SerializedName("user_info")
    public r userInfo;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public class AnimationInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("animation_url")
        public String animationUrl;
        @SerializedName("type")
        public int type;

        public AnimationInfo() {
        }
    }

    public static OrderFixAreaInfo convert(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e751c996c022ee7b8d97757e477e4ea0", RobustBitConfig.DEFAULT_VALUE) ? (OrderFixAreaInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e751c996c022ee7b8d97757e477e4ea0") : (OrderFixAreaInfo) d.a().fromJson(d.a().toJson(map), (Class<Object>) OrderFixAreaInfo.class);
    }
}
