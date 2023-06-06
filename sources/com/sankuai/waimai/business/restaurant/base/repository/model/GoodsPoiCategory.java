package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.poi.IPoiItem;
import com.sankuai.waimai.platform.domain.core.shop.PoiCategory;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class GoodsPoiCategory extends PoiCategory implements Serializable {
    public static final int CATEGORY_COMBO = 2;
    public static final int CATEGORY_COMMON = 1;
    public static final int CATEGORY_SALES_VOLUME = 3;
    public static final String CATEGORY_SALES_VOLUME_STR = "3";
    public static final int SORT_TYPE_DEFAULT = 1;
    public static final int SORT_TYPE_PRICE_DEC = 3;
    public static final int SORT_TYPE_PRICE_INC = 2;
    public static final int SORT_TYPE_SOLD_DEC = 5;
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean anchorHighLine;
    @SerializedName("boughtSmallPicUrl")
    public String boughtSmallPicUrl;
    @SerializedName("tags")
    public ArrayList<GoodsPoiCategory> childGoodPoiCategory;
    public Map<String, GoodsPoiCategory> childGoodPoiCategoryMap;
    @SerializedName("current_page")
    public int currentPage;
    @SerializedName("floorBgPicUrl")
    public String floorBgPicUrl;
    @SerializedName("floorId")
    public int floorId;
    @SerializedName("fold_dynamic_spus_text")
    public String foodDynamicSpusText;
    public ArrayList<e> foodTagPackageList;
    @SerializedName("has_next_page")
    public boolean hasNextPage;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("ifShowOriginPrice")
    public boolean ifShowOriginPrice;
    private String mParentCategoryName;
    @SerializedName("name")
    public String name;
    @SerializedName("product_count")
    public int productCount;
    @SerializedName("productShowType")
    public int productShowType;
    @SerializedName("recentlyBoughtSubTitle")
    public String recentlyBoughtSubTitle;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("sequence")
    public int sequence;
    public int sortType;
    @SerializedName("allSortedSpuId")
    public List<Long> spuIds;
    @SerializedName("spus")
    public List<GoodsSpu> spus;
    @SerializedName("tag")
    public String tag;
    @SerializedName("tag_category_pic")
    public String tagCategoryPic;
    public int tagOrderdNum;
    private List<GoodsSpu> totalSpus;
    @SerializedName("type")
    public int type;
    @SerializedName("no_sale_spus")
    public List<GoodsSpu> unsalableSpus;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface SortType {
    }

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    public int getTagSequence() {
        return 0;
    }

    @NonNull
    public List<GoodsSpu> getGoodsList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc5361a50a11d46cc7d031b69108e6a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc5361a50a11d46cc7d031b69108e6a8");
        }
        if (this.spus == null) {
            this.spus = new ArrayList();
        }
        return this.spus;
    }

    @NonNull
    public List<GoodsSpu> getUnsalableSpus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36f6dca0c4b421cae817af4f4ec2ee8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36f6dca0c4b421cae817af4f4ec2ee8d");
        }
        if (this.unsalableSpus == null) {
            this.unsalableSpus = new ArrayList();
        }
        return this.unsalableSpus;
    }

    @NonNull
    public List<GoodsSpu> getTotalSpus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bf452a12c893bd60185b41f2c0189b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bf452a12c893bd60185b41f2c0189b3");
        }
        if (this.totalSpus == null) {
            this.totalSpus = new ArrayList();
        }
        return this.totalSpus;
    }

    public void setParentCategoryName(String str) {
        this.mParentCategoryName = str;
    }

    public String getParentCategoryName() {
        return this.mParentCategoryName;
    }

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    public boolean isEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dac9edbca668b2d829df025eac0f4cd7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dac9edbca668b2d829df025eac0f4cd7")).booleanValue() : com.sankuai.waimai.foundation.utils.b.b(this.spus) && com.sankuai.waimai.foundation.utils.b.b(this.unsalableSpus);
    }

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    public String getTagName() {
        return this.name;
    }

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    public String getTagIcon() {
        return this.icon;
    }

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    public String getTagCode() {
        return this.tag;
    }

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    @Deprecated
    public List<? extends IPoiItem> getItemList() {
        return this.spus;
    }

    public GoodsPoiCategory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a747fb0b8c2c95ca62ccc411043dd3da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a747fb0b8c2c95ca62ccc411043dd3da");
            return;
        }
        this.sortType = 1;
        this.anchorHighLine = false;
    }

    public GoodsPoiCategory(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c94dc58f257c85519d6731bfc749741d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c94dc58f257c85519d6731bfc749741d");
            return;
        }
        this.sortType = 1;
        this.anchorHighLine = false;
        this.tag = str;
    }

    public String getTagCategoryPic() {
        return this.tagCategoryPic;
    }

    public void parseJson(JSONObject jSONObject, boolean z) {
        Object[] objArr = {jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6e19b64adfafa90b29bfe8fe8d4f6a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6e19b64adfafa90b29bfe8fe8d4f6a8");
            return;
        }
        this.name = jSONObject.optString("name");
        this.icon = jSONObject.optString(RemoteMessageConst.Notification.ICON);
        this.sequence = jSONObject.optInt("sequence");
        this.tag = jSONObject.optString("tag");
        this.type = jSONObject.optInt("type");
        this.selected = jSONObject.optInt(DMKeys.KEY_SELECTED);
        this.tagOrderdNum = 0;
        this.tagDescription = jSONObject.optString("tag_description", "");
        this.description = jSONObject.optString("description", "");
        this.currentPage = jSONObject.optInt("current_page");
        this.hasNextPage = jSONObject.optBoolean("has_next_page");
        this.productCount = jSONObject.optInt("product_count");
        this.activityTag = jSONObject.optString("activity_tag");
        this.bigPicUrl = jSONObject.optString("big_pic_url");
        this.activityInfo = jSONObject.optString("activity_info");
        this.floorId = jSONObject.optInt("floorId");
        this.productShowType = jSONObject.optInt("productShowType");
        this.floorBgPicUrl = jSONObject.optString("floorBgPicUrl");
        this.boughtSmallPicUrl = jSONObject.optString("boughtSmallPicUrl");
        this.ifShowOriginPrice = jSONObject.optBoolean("ifShowOriginPrice");
        this.scheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
        this.recentlyBoughtSubTitle = jSONObject.optString("recentlyBoughtSubTitle");
        this.foodDynamicSpusText = jSONObject.optString("fold_dynamic_spus_text");
        JSONArray optJSONArray = jSONObject.optJSONArray("allSortedSpuId");
        if (optJSONArray != null) {
            this.spuIds = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.spuIds.add(Long.valueOf(optJSONArray.optLong(i, -1L)));
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("activity_tag_list");
        if (optJSONArray2 != null) {
            this.activityTagList = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                this.activityTagList.add(optJSONArray2.optString(i2));
            }
        }
        this.spus = parseSpuList(jSONObject, z);
        this.unsalableSpus = parseUnsalableSpuList(jSONObject, z);
        this.totalSpus = new ArrayList();
        this.totalSpus.addAll(this.spus);
        this.totalSpus.addAll(this.unsalableSpus);
        this.childGoodPoiCategory = parseChildGoodPoiCategory(jSONObject, z);
        this.childGoodPoiCategoryMap = new HashMap();
        if (!com.sankuai.waimai.foundation.utils.b.b(this.childGoodPoiCategory)) {
            Iterator<GoodsPoiCategory> it = this.childGoodPoiCategory.iterator();
            while (it.hasNext()) {
                GoodsPoiCategory next = it.next();
                if (next != null) {
                    this.childGoodPoiCategoryMap.put(next.getTagCode(), next);
                }
            }
        }
        this.foodTagPackageList = e.a(jSONObject.optJSONArray("product_package"), this.tag, z);
        this.tagCategoryPic = jSONObject.optString("tag_category_pic");
    }

    @NonNull
    private ArrayList<GoodsSpu> parseSpuList(JSONObject jSONObject, boolean z) {
        Object[] objArr = {jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "800d9bf8d323bd37dd865dee535fb4bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "800d9bf8d323bd37dd865dee535fb4bd");
        }
        ArrayList<GoodsSpu> arrayList = new ArrayList<>();
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(z ? "dynamic_spus" : "spus");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    GoodsSpu goodsSpu = new GoodsSpu();
                    goodsSpu.parseJson(optJSONObject);
                    goodsSpu.setTag(this.tag);
                    goodsSpu.setSecondFilterTag(jSONObject.optString("tag"));
                    arrayList.add(goodsSpu);
                }
            }
        } catch (Exception e) {
            String simpleName = getClass().getSimpleName();
            com.sankuai.waimai.foundation.utils.log.a.e(simpleName, e.getMessage(), new Object[0]);
        }
        return arrayList;
    }

    @NonNull
    private ArrayList<GoodsSpu> parseUnsalableSpuList(JSONObject jSONObject, boolean z) {
        Object[] objArr = {jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ceb589985b381bb4697f573056d209a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ceb589985b381bb4697f573056d209a");
        }
        ArrayList<GoodsSpu> arrayList = new ArrayList<>();
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(z ? "no_sale_dynamic_spus" : "no_sale_spus");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    GoodsSpu goodsSpu = new GoodsSpu();
                    goodsSpu.parseJson(optJSONObject);
                    goodsSpu.setTag(this.tag);
                    arrayList.add(goodsSpu);
                }
            }
        } catch (Exception e) {
            String simpleName = getClass().getSimpleName();
            com.sankuai.waimai.foundation.utils.log.a.e(simpleName, e.getMessage(), new Object[0]);
        }
        return arrayList;
    }

    private ArrayList<GoodsPoiCategory> parseChildGoodPoiCategory(JSONObject jSONObject, boolean z) {
        JSONArray optJSONArray;
        Object[] objArr = {jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49dd3749ebbe7409f4729cafdb7a2464", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49dd3749ebbe7409f4729cafdb7a2464");
        }
        ArrayList<GoodsPoiCategory> arrayList = new ArrayList<>();
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("tags")) == null || optJSONArray.length() <= 0) {
            return arrayList;
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                GoodsPoiCategory goodsPoiCategory = new GoodsPoiCategory();
                this.spus.addAll(parseSpuList(optJSONObject, z));
                goodsPoiCategory.parseJson(optJSONObject, z);
                arrayList.add(goodsPoiCategory);
            }
        }
        return arrayList;
    }
}
