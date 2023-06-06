package com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.business.order.submit.model.BottomModelInfo;
import com.sankuai.waimai.business.order.submit.model.CouponInfo;
import com.sankuai.waimai.business.order.submit.model.CouponPackage;
import com.sankuai.waimai.business.order.submit.model.PreDecision;
import com.sankuai.waimai.bussiness.order.confirm.model.ap.ApDataWrapper;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class SubmitInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("actual_pay_total")
    public double actualPayTotal;
    @SerializedName("bottom_module_info")
    public BottomModelInfo bottomModelInfo;
    @SerializedName("native_bottom_tip")
    public com.sankuai.waimai.business.order.submit.model.a bottomTipModel;
    @SerializedName("coupon_info_list")
    public List<CouponInfo> couponInfoList;
    @SerializedName("coupon_package")
    public CouponPackage couponPackage;
    @SerializedName("default_pay_type")
    public int defaultPayType;
    @SerializedName("enhance_pay_by_friend")
    public boolean enhancePayByFriend;
    @SerializedName("support_pay_by_friend")
    public boolean isSupportPayByFriend;
    @SerializedName("business_mach_template")
    public ApDataWrapper machTemplateData;
    @SerializedName("member_template")
    public com.sankuai.waimai.bussiness.order.confirm.model.c memberTemplate;
    @SerializedName("original_price")
    public double originalPrice;
    @SerializedName("pre_decision")
    public PreDecision preDecision;
    @SerializedName("reduced_shipping_fee")
    public double reducedShippingFee;
    @SerializedName("submit_btn_text")
    public String submitBtnText;
    @SerializedName("total")
    public double total;
    @SerializedName("total_discount_price")
    public double totalDiscountPrice;
    @SerializedName("delivery_pack_fee_desc")
    public String totalDiscountPriceDes;

    public SubmitInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69298e7a63d52f2774064e1f58398b10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69298e7a63d52f2774064e1f58398b10");
        } else {
            this.defaultPayType = 1;
        }
    }

    public String getBottomTipText() {
        return this.bottomTipModel != null ? this.bottomTipModel.b : "";
    }
}
