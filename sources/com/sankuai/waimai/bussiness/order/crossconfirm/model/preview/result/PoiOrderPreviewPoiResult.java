package com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.order.submit.model.PoiCloseNotification;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.aa;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PoiOrderPreviewPoiResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("biz_type")
    public int bizType;
    @SerializedName("poi_close_notification")
    public PoiCloseNotification poiCloseNotification;
    @SerializedName("poi_first_cate_id")
    public long poiFirstCateId;
    @SerializedName("poi_icon")
    public String poiIcon;
    @SerializedName("wm_poi_id")
    public long poiId;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String poiIdStr;
    @SerializedName(AgainManager.EXTRA_POI_NAME)
    public String poiName;
    @SerializedName("poi_project_description")
    public String poiProjectDescription;
    @SerializedName("poi_project_description_url")
    public String poiProjectDescriptionUrl;
    @SerializedName("poi_project_icon")
    public String poiProjectIcon;
    @SerializedName("pre_order")
    public int preOrder;

    public PoiOrderPreviewPoiResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe97da8ea5afdd4dd715913a3d2da85a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe97da8ea5afdd4dd715913a3d2da85a");
        } else {
            this.poiIdStr = "";
        }
    }

    public String getFormatPoiId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b0ca1b6e44c3c7d2a76ac0613122aed", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b0ca1b6e44c3c7d2a76ac0613122aed");
        }
        if (!aa.a(this.poiIdStr)) {
            return this.poiIdStr;
        }
        return String.valueOf(this.poiId);
    }
}
