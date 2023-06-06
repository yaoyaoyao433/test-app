package com.sankuai.waimai.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.poi.PoiItem;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SpuPackageItem extends PoiItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_tips")
    @Expose
    public String activityTips;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("food_image_list")
    @Expose
    public List<String> foodImageList;
    @SerializedName("group_id")
    @Expose
    public long groupId;
    public int index;
    @SerializedName("main_spu_count")
    @Expose
    public int mainSpuCount;
    @SerializedName("origin_price")
    @Expose
    public double originPrice;
    @SerializedName("price")
    @Expose
    public double price;
    @SerializedName("product_list")
    @Expose
    public List<GoodsSpu> productList;
    @SerializedName("recommend_reason")
    @Expose
    public String recommendReason;
    @SerializedName("spu_type")
    @Expose
    public int spuType;
    private String tag;
    @SerializedName("title")
    @Expose
    public String title;

    public SpuPackageItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4fa60fb076003bca978eddf49baee0d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4fa60fb076003bca978eddf49baee0d");
        } else {
            this.spuType = -1;
        }
    }

    public SpuPackageItem fromJson(JSONObject jSONObject, String str) {
        Object[] objArr = {jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89ff33ab41b2d1960b2f8e89ff251322", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpuPackageItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89ff33ab41b2d1960b2f8e89ff251322");
        }
        if (jSONObject == null) {
            return this;
        }
        setTag(str);
        this.title = jSONObject.optString("title");
        this.recommendReason = jSONObject.optString("recommend_reason");
        this.activityTips = jSONObject.optString("activity_tips");
        this.price = jSONObject.optDouble("price");
        this.originPrice = jSONObject.optDouble("origin_price");
        this.mainSpuCount = jSONObject.optInt("main_spu_count");
        this.spuType = jSONObject.optInt("spu_type", -1);
        this.groupId = jSONObject.optLong("group_id");
        this.description = jSONObject.optString("description");
        this.foodImageList = parseFoodImageList(jSONObject);
        this.productList = parseSpuList(jSONObject, str);
        return this;
    }

    private List<String> parseFoodImageList(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1833a1cafb94a926403477f4bb525105", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1833a1cafb94a926403477f4bb525105");
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("food_image_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    private ArrayList<GoodsSpu> parseSpuList(JSONObject jSONObject, String str) {
        Object[] objArr = {jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbb581f8ad93b7fe631f34b0ae737f6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbb581f8ad93b7fe631f34b0ae737f6b");
        }
        ArrayList<GoodsSpu> arrayList = new ArrayList<>();
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("product_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    GoodsSpu goodsSpu = new GoodsSpu();
                    goodsSpu.parseJson(optJSONObject);
                    goodsSpu.setTag(str);
                    arrayList.add(goodsSpu);
                }
            }
        } catch (Exception e) {
            String simpleName = getClass().getSimpleName();
            com.sankuai.waimai.foundation.utils.log.a.e(simpleName, e.getMessage(), new Object[0]);
        }
        return arrayList;
    }

    public static ArrayList<SpuPackageItem> fromJsonArray(JSONArray jSONArray, String str) {
        Object[] objArr = {jSONArray, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba4ff840b2cd03d1a52a5bd9929c3a72", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba4ff840b2cd03d1a52a5bd9929c3a72");
        }
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList<SpuPackageItem> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            SpuPackageItem fromJson = new SpuPackageItem().fromJson(jSONArray.optJSONObject(i), str);
            fromJson.index = i;
            arrayList.add(fromJson);
        }
        return arrayList;
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
