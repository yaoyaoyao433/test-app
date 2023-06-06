package com.sankuai.waimai.store.platform.shop.model;

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
public class PriceOptAB implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("price_update_group")
    public String priceExpInfo;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c09b32f89f88ca45aeb82b136b3d49f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c09b32f89f88ca45aeb82b136b3d49f1");
        } else {
            this.priceExpInfo = jSONObject.optString("price_update_group");
        }
    }
}
