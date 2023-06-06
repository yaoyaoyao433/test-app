package com.sankuai.waimai.store.repository.model;

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
public class StandardProductInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("fieldName")
    public String mFieldName;
    @SerializedName("value")
    public String mValue;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0593ff28df2e192a237264681b103da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0593ff28df2e192a237264681b103da");
            return;
        }
        try {
            this.mFieldName = jSONObject.optString("fieldName");
            this.mValue = jSONObject.optString("value");
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
    }
}
