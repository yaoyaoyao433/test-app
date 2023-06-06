package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.statistics.StatisticsEntity;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SearchResultBanner extends StatisticsEntity implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("business_scheme_url")
    public String bannerPicScheme;
    @SerializedName("business_desc_pic")
    public String bannerPicUrl;
    @SerializedName("card_type_icon")
    public String cardTypeIcon;
    @SerializedName("channel_icon")
    public String channelIconUrl;
    @SerializedName("channel_name")
    public String channelName;
    @SerializedName("channel_scheme")
    public String channelScheme;
    @SerializedName("channel_text")
    public String channelSchemeDesc;
    @SerializedName("coupon_component")
    public CouponComponent couponComponent;
    @SerializedName("high_risk_category_bg_color")
    public String highRiskBackgroundColor;
    @SerializedName("high_risk_category")
    public String highRiskCategory;
    @SerializedName("high_risk_drug_desc")
    public String highRiskDrugDesc;
    @SerializedName("high_risk_category_color")
    public String highRiskTextColor;
    @SerializedName("high_risk_drug_name")
    public String hightRiskDurgName;
    @SerializedName("hit_result_type")
    public String hitResultType;
    public boolean isExposed;
    @SerializedName("pic_element_list")
    public List<PicElement> picElementList;
    @SerializedName("platform_stid_map")
    public SearchPlatformStid searchPlatformStid;
    @SerializedName("subscript_icon")
    public String subscriptIcon;

    public SearchResultBanner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bc3a26245a349295b6035720410e675", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bc3a26245a349295b6035720410e675");
        } else {
            this.isExposed = false;
        }
    }

    public boolean searchNoResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91f105f631eaf306feba816ae7fab04a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91f105f631eaf306feba816ae7fab04a")).booleanValue();
        }
        try {
            return Integer.parseInt(this.hitResultType) < 100;
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return false;
        }
    }
}
