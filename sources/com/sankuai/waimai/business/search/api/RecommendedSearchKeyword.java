package com.sankuai.waimai.business.search.api;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class RecommendedSearchKeyword implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    public int exposedIndex;
    public boolean isExposed;
    @SerializedName("is_icon")
    public boolean isIcon;
    public boolean isRefreshRequest;
    @SerializedName("log_data")
    public String logData;
    @SerializedName("scene_type")
    public String sceneType;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("search_keyword")
    public String searchKeyword;
    @SerializedName("text_bg_color")
    public String textBgColor;
    @SerializedName("text_color")
    public String textColor;
    @SerializedName("tgt_stids")
    public String tgt_stids;
    @SerializedName("trace_info")
    public String traceInfo;
    public String triggerPoiIdStr;
    @SerializedName("type")
    public int type;
    @SerializedName("view_keyword")
    public String viewKeyword;
    @SerializedName("word_type")
    public int wordType;

    public RecommendedSearchKeyword() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "778f69a5e18b401ec50e52baad84e9ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "778f69a5e18b401ec50e52baad84e9ba");
            return;
        }
        this.isExposed = false;
        this.exposedIndex = 0;
        this.isRefreshRequest = false;
        this.triggerPoiIdStr = "";
    }

    public static RecommendedSearchKeyword parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1bb0b828cfff6cb262fc37fd30d5c257", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecommendedSearchKeyword) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1bb0b828cfff6cb262fc37fd30d5c257");
        }
        if (jSONObject == null) {
            return null;
        }
        RecommendedSearchKeyword recommendedSearchKeyword = new RecommendedSearchKeyword();
        recommendedSearchKeyword.type = jSONObject.optInt("type");
        recommendedSearchKeyword.viewKeyword = jSONObject.optString("view_keyword");
        recommendedSearchKeyword.searchKeyword = jSONObject.optString("search_keyword");
        recommendedSearchKeyword.tgt_stids = jSONObject.optString("tgt_stids");
        recommendedSearchKeyword.sceneType = jSONObject.optString("scene_type");
        recommendedSearchKeyword.isIcon = jSONObject.optBoolean("is_icon", false);
        recommendedSearchKeyword.scheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
        recommendedSearchKeyword.traceInfo = jSONObject.optString("trace_info");
        return recommendedSearchKeyword;
    }

    public boolean isValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c27c956500fead1b6d1d3ca75971ac0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c27c956500fead1b6d1d3ca75971ac0")).booleanValue() : (TextUtils.isEmpty(this.searchKeyword) || TextUtils.isEmpty(this.viewKeyword)) ? false : true;
    }
}
