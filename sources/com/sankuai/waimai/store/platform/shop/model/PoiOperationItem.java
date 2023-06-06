package com.sankuai.waimai.store.platform.shop.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiItem;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiOperationItem extends PoiItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("banner_id")
    public long bannerId;
    @SerializedName("content")
    public String content;
    @SerializedName("pic_url")
    public String picUrl;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    private String tag;
    @SerializedName("type")
    public int type;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70a1a7c25e5ccf859c517fed13238825", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70a1a7c25e5ccf859c517fed13238825");
            return;
        }
        this.tag = "OperationPoiCategory";
        this.scheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
        this.picUrl = jSONObject.optString("pic_url");
        this.content = jSONObject.optString("content");
        this.type = jSONObject.optInt("type");
        this.bannerId = jSONObject.optLong("banner_id");
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.poi.PoiItem, com.sankuai.waimai.store.platform.domain.core.poi.IPoiItem
    public String getTag() {
        return this.tag;
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.poi.PoiItem
    public void setTag(String str) {
        this.tag = str;
    }
}
