package com.sankuai.waimai.store.platform.domain.core.goods;

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
    @SerializedName("product_label_type_list")
    private List<Integer> labelTypeList;
    @SerializedName("recommend_label_type")
    private int recommendLabelType;

    public GoodsLogField() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e71f8f47c25d3768a4d773b817cdf5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e71f8f47c25d3768a4d773b817cdf5a");
        } else {
            this.labelTypeList = new ArrayList();
        }
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efdfee3a7258adc99a9e6f49cd8c34e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efdfee3a7258adc99a9e6f49cd8c34e0");
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("product_label_type_list");
        for (int i = 0; optJSONArray != null && i < optJSONArray.length(); i++) {
            this.labelTypeList.add(Integer.valueOf(optJSONArray.optInt(i)));
        }
        this.recommendLabelType = jSONObject.optInt("recommend_label_type");
    }

    public String getLabelTypeList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "647225d88844d1a4d87df60f79935ee5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "647225d88844d1a4d87df60f79935ee5") : this.labelTypeList.toString();
    }

    public List<Integer> getLabelTypeArrayList() {
        return this.labelTypeList;
    }

    public int getRecommendLabelType() {
        return this.recommendLabelType;
    }
}
