package com.sankuai.waimai.platform.domain.core.goods;

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
public class GoodsLogField implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("fixedprice")
    private int fixedPrice;
    @SerializedName("product_label_type_list")
    private List<Integer> labelTypeList;
    @SerializedName("recommend_label_type")
    private int recommendLabelType;
    @SerializedName("reduce_price")
    private double reducePrice;
    @SerializedName("tag_type")
    private int tagType;
    @SerializedName("word_type")
    private int wordType;

    public GoodsLogField() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a16b649eec556e628563e9addf67319c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a16b649eec556e628563e9addf67319c");
            return;
        }
        this.labelTypeList = new ArrayList();
        this.reducePrice = 0.0d;
        this.wordType = -1;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85f51925aee6e5ce00bcac328fff0102", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85f51925aee6e5ce00bcac328fff0102");
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("product_label_type_list");
            for (int i = 0; optJSONArray != null && i < optJSONArray.length(); i++) {
                this.labelTypeList.add(Integer.valueOf(optJSONArray.optInt(i)));
            }
            this.recommendLabelType = jSONObject.optInt("recommend_label_type");
            this.reducePrice = jSONObject.optDouble("reduce_price", 0.0d);
            this.tagType = jSONObject.optInt("tag_type");
            this.fixedPrice = jSONObject.optInt("fixedprice");
            if (jSONObject.has("word_type")) {
                this.wordType = jSONObject.optInt("word_type");
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    public String getLabelTypeList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3f7106408bdb91098b5aa83109a6f32", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3f7106408bdb91098b5aa83109a6f32") : this.labelTypeList.toString();
    }

    public int getRecommendLabelType() {
        return this.recommendLabelType;
    }

    public double getReducePrice() {
        return this.reducePrice;
    }

    public int getTagType() {
        return this.tagType;
    }

    public int getFixedPrice() {
        return this.fixedPrice;
    }

    public int getWordType() {
        return this.wordType;
    }
}
