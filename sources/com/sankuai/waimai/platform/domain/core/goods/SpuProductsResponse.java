package com.sankuai.waimai.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SpuProductsResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_info")
    public ActivityInfo activityInfo;
    @SerializedName("current_page")
    public int currentPage;
    @SerializedName("has_next_page")
    public boolean hasNextPage;
    @SerializedName("product_count")
    public int productCount;
    @SerializedName("product_spu_list")
    public ArrayList<GoodsSpu> productSpuList;
    @SerializedName("product_tag_id")
    public String productTagId;
    @SerializedName("allSortedSpuId")
    public List<Long> spuIds;

    public SpuProductsResponse() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64bb6182c371dd507048152bff9eee4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64bb6182c371dd507048152bff9eee4d");
        } else {
            this.productSpuList = new ArrayList<>();
        }
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02f28d56ee7df329bd51939fa4fbec68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02f28d56ee7df329bd51939fa4fbec68");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("activity_info");
        if (optJSONObject != null) {
            this.activityInfo = new ActivityInfo();
            this.activityInfo.parseJson(optJSONObject);
        }
    }
}
