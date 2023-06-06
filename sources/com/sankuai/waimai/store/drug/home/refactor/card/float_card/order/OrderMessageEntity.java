package com.sankuai.waimai.store.drug.home.refactor.card.float_card.order;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class OrderMessageEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("last_order")
    public LastOrderEntity lastOrder;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class LastOrderEntity {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String icon;
        @SerializedName("order_message_type")
        public int orderMessageType;
        @SerializedName("order_type")
        public int orderType;
        @SerializedName("order_view_id")
        public String orderViewId;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String scheme;
        @SerializedName("sub_text_after_time")
        public String subTextAfterTime;
        @SerializedName("sub_text_before_time")
        public String subTextBeforeTime;
        @SerializedName("text")
        public String text;
        @SerializedName("time")
        public long time;
        @SerializedName("time_type")
        public int timeType;
    }
}
