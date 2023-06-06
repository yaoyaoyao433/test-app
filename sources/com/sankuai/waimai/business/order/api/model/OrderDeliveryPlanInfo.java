package com.sankuai.waimai.business.order.api.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderDeliveryPlanInfo implements Serializable {
    public static final int DEFAULT_INFINITE_PAUSE_COUNT = -1;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3021560299317726536L;
    @SerializedName("detail_button")
    public DeliverButton deliverButton;
    @SerializedName("plan_title")
    public String planTitle;
    @SerializedName("rest_pause_count")
    public int restPauseCount;
    @SerializedName("rest_pause_count_toast")
    public String restPauseCountToast;
    @SerializedName("sub_delivery_list")
    public List<SubDeliveryList> subDeliveryLists;
    @SerializedName("total")
    public String total;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class DeliverButton implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = 2804231343871096684L;
        @SerializedName("code")
        public int code;
        @SerializedName("title")
        public String title;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class SubDeliveryList implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = -1061513581706389636L;
        @SerializedName("delivery_cycle")
        public String deliveryCycle;
        @SerializedName("delivery_date")
        public String deliveryDate;
        @SerializedName("delivery_day_in_week")
        public String deliveryDayInWeek;
        @SerializedName("delivery_status_desc")
        public String deliveryStatusDesc;
        @SerializedName("delivery_times")
        public String deliveryTimes;
        @SerializedName("highlight_status")
        public String highLightStatus;
    }

    public OrderDeliveryPlanInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ad19361699c13cb74d7e43712ee2826", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ad19361699c13cb74d7e43712ee2826");
        } else {
            this.restPauseCount = -1;
        }
    }

    public static OrderDeliveryPlanInfo parseDeliverPlan(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "72ab44c2fb3a6ba4f4c32c5454394202", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderDeliveryPlanInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "72ab44c2fb3a6ba4f4c32c5454394202");
        }
        if (aa.a(str)) {
            return null;
        }
        try {
            return (OrderDeliveryPlanInfo) com.sankuai.waimai.mach.utils.b.a().fromJson(str, (Class<Object>) OrderDeliveryPlanInfo.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
