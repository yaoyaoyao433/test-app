package com.sankuai.waimai.platform.domain.core.goods;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SpuDeliveryInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("delivery_content")
    @Expose
    public String deliveryContent;
    @SerializedName("delivery_tag")
    @Expose
    public String deliveryIcon;

    public void parseJson(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ff1dffd34899e56857f4225ca078b47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ff1dffd34899e56857f4225ca078b47");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.deliveryIcon = jSONObject.optString("delivery_tag");
                this.deliveryContent = jSONObject.optString("delivery_content");
            } catch (JSONException unused) {
            }
        }
    }
}
