package com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.waimai.business.order.submit.model.AdditionalBargain;
import com.sankuai.waimai.platform.domain.core.shop.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class AdditionalBargainInput implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_extra")
    public String activityExtra;
    @SerializedName("activity_tag")
    public String activityTag;
    @SerializedName("attrs")
    public List<Long> attrs;
    @SerializedName("count")
    public int count;
    @SerializedName("sku_id")
    public long skuId;

    public AdditionalBargainInput() {
    }

    public AdditionalBargainInput(@NonNull AdditionalBargain.AdditionalBargainDetail additionalBargainDetail) {
        this.skuId = additionalBargainDetail.skuId;
        this.activityTag = additionalBargainDetail.activityTag;
        this.activityExtra = additionalBargainDetail.activityExtra;
        this.count = additionalBargainDetail.count;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new a("wm_plus_discount", additionalBargainDetail.count).a());
        if (jSONArray.length() > 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(PushConstants.INTENT_ACTIVITY_NAME, jSONArray);
            } catch (JSONException unused) {
            }
            this.activityExtra = jSONObject.toString();
        }
        if (additionalBargainDetail.attrs != null) {
            this.attrs = new ArrayList();
            for (int i = 0; i < additionalBargainDetail.attrs.size(); i++) {
                if (additionalBargainDetail.attrs.get(i) != null) {
                    this.attrs.add(Long.valueOf(additionalBargainDetail.attrs.get(i).id));
                }
            }
        }
    }
}
