package com.sankuai.waimai.platform.domain.core.comment;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CommentGood implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("keyword")
    public String keyword;
    @SerializedName("scheme_url")
    public String schemeUrl;
    @SerializedName("sku_id")
    public long skuId;
    @SerializedName("spu_id")
    public long spuId;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "548094e30525ae0eb841434b0377487c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "548094e30525ae0eb841434b0377487c");
            return;
        }
        this.keyword = jSONObject.optString("keyword");
        this.spuId = jSONObject.optLong("spu_id");
        this.skuId = jSONObject.optLong("sku_id");
        this.schemeUrl = jSONObject.optString("scheme_url");
    }

    public long getSpuId() {
        return this.spuId;
    }

    public long getSkuId() {
        return this.skuId;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public String getSchemeUrl() {
        return this.schemeUrl;
    }
}
