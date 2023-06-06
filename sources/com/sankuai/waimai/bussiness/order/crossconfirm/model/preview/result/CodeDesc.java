package com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CodeDesc implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("code")
    public int code;
    @SerializedName("codes")
    public String codes;
    @SerializedName("desc")
    public String desc;

    @Deprecated
    public static CodeDesc fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "64bd81fc3b2cc79c6f0b88beabf2baf6", RobustBitConfig.DEFAULT_VALUE)) {
            return (CodeDesc) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "64bd81fc3b2cc79c6f0b88beabf2baf6");
        }
        if (jSONObject == null) {
            return null;
        }
        CodeDesc codeDesc = new CodeDesc();
        codeDesc.code = jSONObject.optInt("code");
        codeDesc.desc = jSONObject.optString("desc");
        return codeDesc;
    }

    @Deprecated
    public static List<CodeDesc> fromJsonArray(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "79fd4cab02d282cd6e2336fb9e467d27", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "79fd4cab02d282cd6e2336fb9e467d27");
        }
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            CodeDesc fromJson = fromJson(jSONArray.optJSONObject(i));
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }
}
