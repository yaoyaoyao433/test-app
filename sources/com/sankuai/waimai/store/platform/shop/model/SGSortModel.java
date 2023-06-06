package com.sankuai.waimai.store.platform.shop.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
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
public class SGSortModel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("category")
    public long category;
    @SerializedName("style")
    public int style;
    @SerializedName("subFilterList")
    public List<SGSortModel> subFilterList;
    @SerializedName("text")
    public String text;
    @SerializedName("typeList")
    public List<Long> typeList;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b50461f33ba869aa7b2ef5c36245c72b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b50461f33ba869aa7b2ef5c36245c72b");
            return;
        }
        try {
            this.style = jSONObject.optInt("style");
            this.text = jSONObject.optString("text");
            this.category = jSONObject.optLong("category");
            this.typeList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("typeList");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.typeList.add(Long.valueOf(optJSONArray.optLong(i)));
                }
            }
            this.subFilterList = new ArrayList();
            JSONArray optJSONArray2 = jSONObject.optJSONArray("subFilterList");
            if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                return;
            }
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                JSONObject optJSONObject = optJSONArray2.optJSONObject(i2);
                if (optJSONObject != null) {
                    SGSortModel sGSortModel = new SGSortModel();
                    sGSortModel.parseJson(optJSONObject);
                    this.subFilterList.add(sGSortModel);
                }
            }
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
    }
}
