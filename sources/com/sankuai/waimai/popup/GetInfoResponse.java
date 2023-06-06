package com.sankuai.waimai.popup;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.guidepop.GuidePopInfo;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GetInfoResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("alert_data")
    public AlertInfo alertInfo;
    @SerializedName("guide_pop")
    public List<GuidePopInfo> guidePopInfos;
    @SerializedName("native_data")
    public NativeData nativeData;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class NativeData {
        public static final int SKYFALL_NEW_STYLE = 1;
        public static final int STYLE_TYPE_EMBED = 4;
        public static final int STYLE_TYPE_NORMAL = 0;
        public static final int STYLE_TYPE_SUPER_STYLE = 3;
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_id")
        public int activityId;
        @SerializedName("coupon_result_code")
        public int couponResultCode;
        @SerializedName("coupon_tip")
        public String couponTip;
        @SerializedName("disallow_close_on_back_press")
        public int disallowCloseOnBackPress;
        @SerializedName("discount_coupon_list")
        public List<DiscountCoupon> discountCoupons;
        @SerializedName("dynamic_effect_type")
        public int dynamicEffectType;
        @SerializedName("force_direct_url")
        public String forceDirectUrl;
        @SerializedName("position_count")
        public int positionCount;
        @SerializedName("retract_type")
        public int retractType;
        @SerializedName("style_type")
        public int styleType;
        @SerializedName("styled")
        public String styled;
        @SerializedName("toast")
        public String toast;
        @SerializedName("top_alert_data")
        public AlertInfo topAlertInfo;
        @SerializedName("use_tian_jiang_new_style")
        public int useTianJiangNewStyle;

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes5.dex */
        public static class DiscountCoupon {
            public static ChangeQuickRedirect changeQuickRedirect;
            @SerializedName("wm_act_coupon_channel_config_id")
            public long channelConfigId;
            @SerializedName("coupon_id")
            public long couponId;
            @SerializedName("marketing_activity_id")
            public long marketingActivityId;
        }

        /* compiled from: ProGuard */
        /* loaded from: classes5.dex */
        public enum a {
            NO_ANIMATION(0),
            SKY_FALL_WITH_ALLOWANCE(1);
            
            public static ChangeQuickRedirect a;
            int d;

            public static a valueOf(String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a65d8cb04ed52d1c34da986ab29aedf0", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a65d8cb04ed52d1c34da986ab29aedf0") : (a) Enum.valueOf(a.class, str);
            }

            /* renamed from: values  reason: to resolve conflict with enum method */
            public static a[] valuesCustom() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d5e32d57d06fb2963796a7060e418d8", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d5e32d57d06fb2963796a7060e418d8") : (a[]) values().clone();
            }

            a(int i) {
                Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7338c272b6a60a534c19149d720576f1", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7338c272b6a60a534c19149d720576f1");
                } else {
                    this.d = i;
                }
            }
        }
    }
}
