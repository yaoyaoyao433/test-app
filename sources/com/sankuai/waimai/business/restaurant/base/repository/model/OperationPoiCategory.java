package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.poi.IPoiItem;
import com.sankuai.waimai.platform.domain.core.poi.PoiItem;
import com.sankuai.waimai.platform.domain.core.shop.PoiCategory;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OperationPoiCategory extends PoiCategory {
    public static final String TAGCODE = "OperationPoiCategory";
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<? extends IPoiItem> mOperationPoiItemsList;
    private List<PoiItem> mPoiItems;
    @SerializedName("operation_source_list")
    public List<PoiOperationItem> operationSourceList;
    public String tag;
    @SerializedName("tag_icon")
    public String tagIcon;
    @SerializedName("tag_name")
    public String tagName;
    @SerializedName("tag_sequence")
    public int tagSequence;

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    public String getTagName() {
        return this.tagName;
    }

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    public String getTagIcon() {
        return this.tagIcon;
    }

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    public int getTagSequence() {
        return this.tagSequence;
    }

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    public String getTagCode() {
        return this.tag;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    @Deprecated
    public List<? extends IPoiItem> getItemList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abeddf1afd3cd9e8f59db8e7d4a93c58", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abeddf1afd3cd9e8f59db8e7d4a93c58");
        }
        if (this.mOperationPoiItemsList == null) {
            this.mOperationPoiItemsList = new ArrayList();
            getOperationPoiItems(this.mOperationPoiItemsList);
        }
        return this.mOperationPoiItemsList;
    }

    public List<PoiItem> getPoiItemsForMarket() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1aaff9809917e038f2f83871f2469036", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1aaff9809917e038f2f83871f2469036");
        }
        if (this.mPoiItems == null) {
            this.mPoiItems = new ArrayList();
            if (!com.sankuai.waimai.foundation.utils.b.b(this.operationSourceList)) {
                for (PoiOperationItem poiOperationItem : this.operationSourceList) {
                    poiOperationItem.setTag(this.tag);
                    this.mPoiItems.add(poiOperationItem);
                }
            }
        }
        return this.mPoiItems;
    }

    public void getOperationPoiItems(List<IPoiItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4520f7fbbcfae4103168e5d44e7a35b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4520f7fbbcfae4103168e5d44e7a35b0");
        } else if (!com.sankuai.waimai.foundation.utils.b.b(this.operationSourceList)) {
            for (PoiOperationItem poiOperationItem : this.operationSourceList) {
                poiOperationItem.setTag(this.tag);
                list.add(poiOperationItem);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    public boolean isEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4db97706dee688830cfeed6bd7ff995", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4db97706dee688830cfeed6bd7ff995")).booleanValue() : com.sankuai.waimai.foundation.utils.b.b(this.operationSourceList);
    }

    public boolean isOperationEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a50a76139db95646a12a8e3e038ee0d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a50a76139db95646a12a8e3e038ee0d")).booleanValue() : com.sankuai.waimai.foundation.utils.b.b(this.operationSourceList);
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "682ffa588c95b18871f1d9d41a17d186", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "682ffa588c95b18871f1d9d41a17d186");
            return;
        }
        this.tag = jSONObject.optString("tag");
        if (TextUtils.isEmpty(this.tag)) {
            this.tag = "OperationPoiCategory";
        }
        this.tagName = jSONObject.optString("tag_name");
        this.tagIcon = jSONObject.optString("tag_icon");
        this.tagSequence = jSONObject.optInt("tag_sequence");
        this.operationSourceList = parseOperationList(jSONObject);
    }

    private List<PoiOperationItem> parseOperationList(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "101a6bb8e18d3335c9b8cefd6d3db0d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "101a6bb8e18d3335c9b8cefd6d3db0d1");
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
            String simpleName = getClass().getSimpleName();
            com.sankuai.waimai.foundation.utils.log.a.e(simpleName, e.getMessage(), new Object[0]);
        }
        return arrayList;
    }

    public List<PoiOperationItem> getOperationList() {
        return this.operationSourceList;
    }
}
