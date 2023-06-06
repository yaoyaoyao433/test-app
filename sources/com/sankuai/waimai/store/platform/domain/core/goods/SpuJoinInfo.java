package com.sankuai.waimai.store.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SpuJoinInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("join_text")
    public String joinText;
    @SerializedName("schema")
    public String schema;

    public void parseJson(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1ebf8d9e31549b84e753e37547755a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1ebf8d9e31549b84e753e37547755a4");
        } else if (t.a(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.joinText = jSONObject.optString("join_text");
                this.schema = jSONObject.optString("schema");
            } catch (JSONException unused) {
            }
        }
    }
}
