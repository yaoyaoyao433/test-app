package com.sankuai.waimai.bussiness.order.confirm.pgablock.timeinsurance.rock;

import android.support.annotation.Keep;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class TimeInsuranceRockViewData {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("products")
    public a[] products;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a {
        @SerializedName(DMKeys.KEY_SELECTED)
        public boolean a;
        @SerializedName("biz_product_data")
        public C0901a b;

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.bussiness.order.confirm.pgablock.timeinsurance.rock.TimeInsuranceRockViewData$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C0901a {
            @SerializedName("insurance_reason_code")
            public int a;
            @SerializedName("insurance_gift_type")
            public int b;
        }
    }
}
