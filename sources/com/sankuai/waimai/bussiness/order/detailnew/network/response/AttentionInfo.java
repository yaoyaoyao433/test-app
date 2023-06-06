package com.sankuai.waimai.bussiness.order.detailnew.network.response;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class AttentionInfo implements Serializable {
    public static final int CLICK_TYPE_DIALOG = 2;
    public static final int CLICK_TYPE_H5 = 1;
    public static final int DELIVERY_NEW_ETA = 7;
    public static final int DELIVERY_WEATHER_TYPE = 1;
    public static final int MODIFY_ADDRESS_TYPE = 2;
    public static final int NO_RIDER_TIP_TYPE = 3;
    public static final int SECOND_DELIVERY_TYPE = 5;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("abnormal_statistics")
    public AbnormalStatistics abnormalStatistics;
    @SerializedName("click_code")
    public int clickCode;
    @SerializedName("click_color")
    public String clickColor;
    @SerializedName("click_text")
    public String clickText;
    @SerializedName("click_type")
    public int clickType;
    @SerializedName("click_url")
    public String clickUrl;
    @SerializedName("desc")
    public String desc;
    @SerializedName("desc_pro")
    public List<DescPro> descProList;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("second_delivery_tip")
    public SecondDeliveryTip secondDeliveryTip;
    @SerializedName("type")
    public int type;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class AbnormalStatistics implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("delivery_ab_group")
        public String deliveryAbGroup;
        @SerializedName("delivery_reason_code")
        public int deliveryReasonCode;
        @SerializedName("weather_code")
        public int weatherCode;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class DescPro implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("color")
        public String color;
        @SerializedName("desc")
        public String desc;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class SecondDeliveryTip implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("button_remark")
        public String buttonRemark;
        @SerializedName("desc")
        public String desc;
        @SerializedName("scene_pic")
        public String scenePic;
        @SerializedName("title")
        public String title;
    }
}
