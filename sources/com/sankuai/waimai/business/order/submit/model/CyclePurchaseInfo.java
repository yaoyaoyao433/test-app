package com.sankuai.waimai.business.order.submit.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.msi.api.component.picker.bean.DatePickerParam;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CyclePurchaseInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5206507347846270113L;
    @SerializedName("cycle_purchase_order")
    public int mCyclePurchaseOrder;
    @SerializedName("delivery_info")
    public DeliveryInfo mDeliveryInfo;
    @SerializedName("nper_count")
    public int mNperCount;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class DeliveryInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = -3384353279985973112L;
        @SerializedName(DatePickerParam.FIELD_DAY)
        public List<Integer> mDays;
        @SerializedName("type")
        public int mType;
    }
}
