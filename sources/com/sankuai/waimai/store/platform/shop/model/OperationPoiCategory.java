package com.sankuai.waimai.store.platform.shop.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.shop.PoiCategory;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class OperationPoiCategory extends PoiCategory {
    public static final String TAGCODE = "OperationPoiCategory";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("operation_source_list")
    public List<PoiOperationItem> operationSourceList;
    public String tag;
    @SerializedName("tag_icon")
    public String tagIcon;
    @SerializedName("tag_name")
    public String tagName;

    @Override // com.sankuai.waimai.store.platform.domain.core.shop.PoiCategory
    public String getTagName() {
        return this.tagName;
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.shop.PoiCategory
    public String getTagIcon() {
        return this.tagIcon;
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.shop.PoiCategory
    public String getTagCode() {
        return this.tag;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92e9c0815cf48805baa669fdbeb1c10e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92e9c0815cf48805baa669fdbeb1c10e");
            return;
        }
        this.tag = jSONObject.optString("tag");
        if (TextUtils.isEmpty(this.tag)) {
            this.tag = "OperationPoiCategory";
        }
        this.tagName = jSONObject.optString("tag_name");
        this.tagIcon = jSONObject.optString("tag_icon");
        this.operationSourceList = parseOperationList(jSONObject);
    }

    private List<PoiOperationItem> parseOperationList(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3bf9f422c236da8bda5709ae21e4030", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3bf9f422c236da8bda5709ae21e4030");
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("operation_source_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    PoiOperationItem poiOperationItem = new PoiOperationItem();
                    poiOperationItem.parseJson(optJSONObject);
                    poiOperationItem.setTag(getTagCode());
                    arrayList.add(poiOperationItem);
                }
            }
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
        return arrayList;
    }

    public List<PoiOperationItem> getOperationList() {
        return this.operationSourceList;
    }
}
