package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ProductPicContent implements b, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("contents")
    public List<String> contents;
    @SerializedName("drug_desc_module_pack_list")
    public List<GoodDetailResponse.DrugDescModulePackage> drugDescList;
    @SerializedName("drug_desc_module_title")
    public String drugDescListTitle;
    @SerializedName("type")
    public int type;

    @Override // com.sankuai.waimai.store.repository.model.b
    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "015ef8e45c95423db7ad304e96323c9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "015ef8e45c95423db7ad304e96323c9a");
        } else if (jSONObject != null) {
            try {
                this.type = jSONObject.optInt("type");
                JSONArray optJSONArray = jSONObject.optJSONArray("contents");
                if (optJSONArray != null) {
                    this.contents = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        this.contents.add(optJSONArray.optString(i));
                    }
                }
                this.drugDescListTitle = jSONObject.optString("drug_desc_module_title");
                this.drugDescList = (List) com.sankuai.waimai.store.util.i.a(jSONObject.optString("drug_desc_module_pack_list"), new TypeToken<List<GoodDetailResponse.DrugDescModulePackage>>() { // from class: com.sankuai.waimai.store.repository.model.ProductPicContent.1
                }.getType());
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }
}
