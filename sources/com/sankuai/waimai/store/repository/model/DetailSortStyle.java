package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DetailSortStyle {
    public static final int STYLE_ACTION_BAR_SEARCH_COUPON = 3;
    public static final int STYLE_ACTION_BAR_SEARCH_STYLE = 2;
    public static final int STYLE_IMG_NAME_PRICE = 0;
    public static final int STYLE_IMG_NAME_PRICE_COUPON = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("header_style")
    public int headerStyle;
    @SerializedName("sort_list")
    public List<Integer> sortList;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a5ad48e8a65fb7ebf0222ed202607a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a5ad48e8a65fb7ebf0222ed202607a8");
        } else if (jSONObject != null) {
            this.headerStyle = jSONObject.optInt("header_style", 0);
            JSONArray optJSONArray = jSONObject.optJSONArray("sort_list");
            if (optJSONArray != null) {
                this.sortList = new ArrayList();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    this.sortList.add(Integer.valueOf(optJSONArray.optInt(i)));
                }
            }
        }
    }

    public boolean isActionBarSearchStyle() {
        return this.headerStyle == 2;
    }
}
