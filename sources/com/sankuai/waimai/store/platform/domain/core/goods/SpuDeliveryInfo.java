package com.sankuai.waimai.store.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SpuDeliveryInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("color_texts")
    public List<String> colorTexts;
    @SerializedName("delivery_content")
    public String deliveryContent;
    @SerializedName("delivery_tag")
    public String deliveryIcon;

    public void parseJson(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd3be471c147a326743b76b0b2ed47b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd3be471c147a326743b76b0b2ed47b7");
        } else if (!t.a(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.deliveryIcon = jSONObject.optString("delivery_tag");
                this.deliveryContent = jSONObject.optString("delivery_content");
                JSONArray optJSONArray = jSONObject.optJSONArray("color_texts");
                if (optJSONArray == null || optJSONArray.length() <= 0) {
                    return;
                }
                this.colorTexts = new ArrayList();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    this.colorTexts.add(optJSONArray.optString(i));
                }
            } catch (JSONException unused) {
            }
        }
    }
}
