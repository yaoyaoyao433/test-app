package com.sankuai.waimai.store.platform.shop.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SaleCampaignGather implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_tag_id")
    public String activityTagId;
    @SerializedName("activity_type")
    public String activityType;
    @SerializedName("activity_block_color")
    public ComplexColor blockColor;
    @SerializedName("activity_products")
    public List<DrugFactoryProcuct> mDrugFactoryProcuctList;
    @SerializedName("main_title")
    public String mainTitle;
    @SerializedName("pictures")
    public List<String> pictures;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("small_title")
    public String smallTitle;

    public static SaleCampaignGather parseJson(JSONObject jSONObject) {
        DrugFactoryProcuct parseJson;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9d605b903e1fa1a7de58b9f9014b098f", RobustBitConfig.DEFAULT_VALUE)) {
            return (SaleCampaignGather) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9d605b903e1fa1a7de58b9f9014b098f");
        }
        if (jSONObject == null) {
            return null;
        }
        SaleCampaignGather saleCampaignGather = new SaleCampaignGather();
        saleCampaignGather.activityTagId = jSONObject.optString("activity_tag_id");
        saleCampaignGather.mainTitle = jSONObject.optString("main_title");
        saleCampaignGather.smallTitle = jSONObject.optString("small_title");
        JSONArray optJSONArray = jSONObject.optJSONArray("pictures");
        if (optJSONArray != null) {
            saleCampaignGather.pictures = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                saleCampaignGather.pictures.add(optJSONArray.optString(i));
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("activity_products");
        saleCampaignGather.mDrugFactoryProcuctList = new ArrayList();
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                JSONObject optJSONObject = optJSONArray2.optJSONObject(i2);
                if (optJSONObject != null && (parseJson = DrugFactoryProcuct.parseJson(optJSONObject)) != null) {
                    saleCampaignGather.mDrugFactoryProcuctList.add(parseJson);
                }
            }
        }
        saleCampaignGather.scheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
        saleCampaignGather.blockColor = ComplexColor.fromJson(jSONObject.optJSONObject("activity_block_color"));
        saleCampaignGather.activityType = jSONObject.optString("activity_type");
        return saleCampaignGather;
    }
}
