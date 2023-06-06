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
public class DrugInstructions implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("name")
    public String key;
    @SerializedName("cn_name")
    public String name;
    @SerializedName("value")
    public String value;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e712b9534135b2ffcf66fd54a203eaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e712b9534135b2ffcf66fd54a203eaf");
            return;
        }
        this.key = jSONObject.optString("name");
        this.name = jSONObject.optString("cn_name");
        this.value = jSONObject.optString("value");
    }
}
