package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GoodDetailPoiInformation implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("deliveryScore")
    public double deliveryScore;
    @SerializedName("distance")
    public String distance;
    @SerializedName("express_delivery_icon")
    public B2CDeliveryInfo mB2CDeliveryInfo;
    @SerializedName("buz_type")
    public int mBuzType;
    @SerializedName("purchased_type")
    public int mPurchasedType;
    @SerializedName("month_sales_tip")
    public String monthSales;
    @SerializedName("name")
    public String name;
    @SerializedName("packingScore")
    public double packingScore;
    @SerializedName("pic_url")
    public String picUrl;
    @SerializedName("quality_assurance_info")
    public DetailQualityAssurance poiAssuranceInfo;
    @SerializedName("deliver_type_info")
    public PoiDeliveryInfo poiDeliveryInfo;
    @SerializedName("poi_head_server_icon")
    public PoiServerIcon poiServerIcon;
    @SerializedName("poi_type_icon")
    public String poiTypeIcon;
    @SerializedName("poi_type_icon_type")
    public String poiTypeIconType;
    @SerializedName("qualityScore")
    public double qualityScore;
    @SerializedName("sale_count")
    public String saleCount;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("show_poi_entry")
    public boolean showPoiEntry;
    @SerializedName("sub_desc")
    public List<PoiSubDescription> subDesc;
    @SerializedName("wm_poi_score")
    public double wmPoiScore;

    public boolean isCaiDaQuan() {
        return this.mPurchasedType == 1;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public class PoiSubDescription {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String icon;
        @SerializedName("text")
        public String text;

        public PoiSubDescription() {
        }
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "599877358d5364fcc25002db51da8229", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "599877358d5364fcc25002db51da8229");
        } else if (jSONObject != null) {
            try {
                this.name = jSONObject.optString("name");
                this.distance = jSONObject.optString("distance");
                this.scheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
                this.saleCount = jSONObject.optString("sale_count");
                this.picUrl = jSONObject.optString("pic_url");
                this.wmPoiScore = jSONObject.optDouble("wm_poi_score");
                this.qualityScore = jSONObject.optDouble("qualityScore", 0.0d);
                this.packingScore = jSONObject.optDouble("packingScore", 0.0d);
                this.deliveryScore = jSONObject.optDouble("deliveryScore", 0.0d);
                this.monthSales = jSONObject.optString("month_sales_tip");
                this.poiTypeIcon = jSONObject.optString("poi_type_icon");
                this.poiTypeIconType = jSONObject.optString("poi_type_icon_type");
                this.poiServerIcon = (PoiServerIcon) com.sankuai.waimai.store.util.i.a(jSONObject.optString("poi_head_server_icon"), new TypeToken<PoiServerIcon>() { // from class: com.sankuai.waimai.store.repository.model.GoodDetailPoiInformation.1
                }.getType());
                this.poiDeliveryInfo = (PoiDeliveryInfo) com.sankuai.waimai.store.util.i.a(jSONObject.optString("deliver_type_info"), new TypeToken<PoiDeliveryInfo>() { // from class: com.sankuai.waimai.store.repository.model.GoodDetailPoiInformation.2
                }.getType());
                this.mB2CDeliveryInfo = (B2CDeliveryInfo) com.sankuai.waimai.store.util.i.a(jSONObject.optString("express_delivery_icon"), new TypeToken<B2CDeliveryInfo>() { // from class: com.sankuai.waimai.store.repository.model.GoodDetailPoiInformation.3
                }.getType());
                this.poiAssuranceInfo = (DetailQualityAssurance) com.sankuai.waimai.store.util.i.a(jSONObject.optString("quality_assurance_info"), new TypeToken<DetailQualityAssurance>() { // from class: com.sankuai.waimai.store.repository.model.GoodDetailPoiInformation.4
                }.getType());
                this.subDesc = (List) com.sankuai.waimai.store.util.i.a(jSONObject.optString("sub_desc"), new TypeToken<List<PoiSubDescription>>() { // from class: com.sankuai.waimai.store.repository.model.GoodDetailPoiInformation.5
                }.getType());
                this.showPoiEntry = jSONObject.optBoolean("show_poi_entry");
                this.mBuzType = jSONObject.optInt("buz_type");
                this.mPurchasedType = jSONObject.optInt("purchased_type");
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public class PoiServerIcon {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("server_icon")
        public String icon;
        @SerializedName("server_icon_id")
        public String serverIconId;

        public PoiServerIcon() {
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public class PoiDeliveryInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("delivery_time_icon")
        public String deliveryIcon;
        @SerializedName("deliver_type_text")
        public String deliveryText;
        @SerializedName("delivery_time_tip")
        public String deliveryTip;
        @SerializedName("deliver_type")
        public int deliveryType;

        public PoiDeliveryInfo() {
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public class B2CDeliveryInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("backgroundColor")
        public String deliveryBgColor;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String deliveryIcon;
        @SerializedName("text")
        public String deliveryText;
        @SerializedName("textColor")
        public String deliveryTextColor;

        public B2CDeliveryInfo() {
        }
    }
}
