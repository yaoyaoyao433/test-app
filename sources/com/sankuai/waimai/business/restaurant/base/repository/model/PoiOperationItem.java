package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.poi.PoiItem;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PoiOperationItem extends PoiItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_type")
    public int activityType;
    @SerializedName("ad_mark")
    public boolean adMark;
    @SerializedName("ad_type")
    public int adType;
    @SerializedName("charge_info")
    public String chargeInfo;
    @SerializedName("content")
    public String content;
    @SerializedName("pic_url")
    public String picUrl;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("sequence")
    public int sequence;
    private String tag;
    @SerializedName("type")
    public int type;

    public boolean isDpRecommend() {
        return this.type == 2;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a024e024a9d0deaa386951b7ffcad3c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a024e024a9d0deaa386951b7ffcad3c0");
            return;
        }
        this.tag = "OperationPoiCategory";
        this.scheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
        this.picUrl = jSONObject.optString("pic_url");
        this.content = jSONObject.optString("content");
        this.activityType = jSONObject.optInt("activity_type");
        this.adMark = jSONObject.optBoolean("ad_mark");
        this.adType = jSONObject.optInt("ad_type");
        this.chargeInfo = jSONObject.optString("charge_info");
    }

    @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem, com.sankuai.waimai.platform.domain.core.poi.IPoiItem
    public String getTag() {
        return this.tag;
    }

    @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem
    public void setTag(String str) {
        this.tag = str;
    }
}
