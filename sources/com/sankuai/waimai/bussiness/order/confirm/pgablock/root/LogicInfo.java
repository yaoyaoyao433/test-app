package com.sankuai.waimai.bussiness.order.confirm.pgablock.root;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.order.api.submit.model.BusinessType;
import com.sankuai.waimai.business.order.api.submit.model.ExpInfo;
import com.sankuai.waimai.business.order.api.submit.model.OrderTagInfo;
import com.sankuai.waimai.business.order.submit.model.CyclePurchaseInfo;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class LogicInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("exp_infos")
    public List<ExpInfo> abExpInfoList;
    @SerializedName("biz_line")
    public String bizLine;
    @SerializedName("biz_type")
    public int bizType;
    @SerializedName("business_type_list")
    public List<BusinessType> businessTypeList;
    @SerializedName("cycle_purchase_info")
    public CyclePurchaseInfo cyclePurchaseInfo;
    @SerializedName("delivery_skin")
    public String deliverySkin;
    @SerializedName("delivery_skin_title_color")
    public String deliverySkinTitleColor;
    @SerializedName("callback_info")
    public CallbackInfo extendsInfo;
    @SerializedName("order_tag_infos")
    public List<OrderTagInfo> orderTagInfos;
    @SerializedName("original_price")
    public double originalPrice;
    @SerializedName("poi_icon")
    public String poiIcon;
    @SerializedName(AgainManager.EXTRA_POI_NAME)
    public String poiName;
    @SerializedName("pre_order")
    public int preOrder;
    @SerializedName("token")
    public String token;
    @SerializedName("total")
    public double total;

    public int getOrderTagMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "217b26bbe8dc85994f24c2293c5b65ff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "217b26bbe8dc85994f24c2293c5b65ff")).intValue();
        }
        if (com.sankuai.waimai.foundation.utils.b.b(this.orderTagInfos)) {
            return -1;
        }
        for (OrderTagInfo orderTagInfo : this.orderTagInfos) {
            if (orderTagInfo != null && orderTagInfo.orderTagType == i) {
                return orderTagInfo.orderTagMode;
            }
        }
        return -1;
    }

    public int isLargeOrderTag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86cd0f1c6d2312a5be0158f2af89cec9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86cd0f1c6d2312a5be0158f2af89cec9")).intValue();
        }
        if (com.sankuai.waimai.foundation.utils.b.b(this.orderTagInfos)) {
            return 0;
        }
        for (OrderTagInfo orderTagInfo : this.orderTagInfos) {
            if (orderTagInfo != null && orderTagInfo.orderTagType == 3) {
                return 1;
            }
        }
        return 0;
    }
}
