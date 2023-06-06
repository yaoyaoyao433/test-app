package com.sankuai.waimai.bussiness.order.confirm.pgablock.serviceguarantee;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.model.FoodInsurance;
import com.sankuai.waimai.business.order.submit.model.PrivacyService;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ServiceGuaranteeInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int businessType;
    private FoodInsurance food_insurance;
    public boolean hasShowNewTag;
    public String poi_project_description;
    public String poi_project_description_url;
    public String poi_project_icon;
    public PrivacyService privacy_service;
    public String token;

    public String getPrivacyGuideDesc() {
        if (this.privacy_service != null) {
            return this.privacy_service.privacy_new_feature__guide_desc;
        }
        return null;
    }

    public boolean isValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "312b75b62e48ac8d3dc903bae7315444", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "312b75b62e48ac8d3dc903bae7315444")).booleanValue();
        }
        return (this.privacy_service != null && this.privacy_service.show == 1) || (this.food_insurance != null) || (TextUtils.isEmpty(this.poi_project_description) ^ true);
    }
}
