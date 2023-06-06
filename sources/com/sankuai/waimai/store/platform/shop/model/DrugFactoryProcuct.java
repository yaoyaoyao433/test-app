package com.sankuai.waimai.store.platform.shop.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DrugFactoryProcuct {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("picture")
    private String pictureUrl;
    @SerializedName("promotion_text")
    private String promotionText;

    public static DrugFactoryProcuct parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5914d0b80076a20fc2c5155237bde3d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (DrugFactoryProcuct) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5914d0b80076a20fc2c5155237bde3d4");
        }
        DrugFactoryProcuct drugFactoryProcuct = new DrugFactoryProcuct();
        try {
            drugFactoryProcuct.pictureUrl = jSONObject.optString("picture");
            drugFactoryProcuct.promotionText = jSONObject.optString("promotion_text");
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
        return drugFactoryProcuct;
    }

    public void setPictureUrl(String str) {
        this.pictureUrl = str;
    }

    public String getPictureUrl() {
        return this.pictureUrl;
    }

    public void setPromotionText(String str) {
        this.promotionText = str;
    }

    public String getPromotionText() {
        return this.promotionText;
    }
}
