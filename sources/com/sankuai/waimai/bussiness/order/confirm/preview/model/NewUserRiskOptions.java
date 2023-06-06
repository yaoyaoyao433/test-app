package com.sankuai.waimai.bussiness.order.confirm.preview.model;

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
public class NewUserRiskOptions implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("code")
    public int code;
    @SerializedName("desc")
    public String desc;

    public static NewUserRiskOptions fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e2624d4945ac7203965e2b6adeafec57", RobustBitConfig.DEFAULT_VALUE)) {
            return (NewUserRiskOptions) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e2624d4945ac7203965e2b6adeafec57");
        }
        if (jSONObject == null) {
            return null;
        }
        NewUserRiskOptions newUserRiskOptions = new NewUserRiskOptions();
        newUserRiskOptions.code = jSONObject.optInt("code");
        newUserRiskOptions.desc = jSONObject.optString("desc");
        return newUserRiskOptions;
    }

    public static List<NewUserRiskOptions> fromJsonArray(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c712061aa18e05f6e2b9635332f012f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c712061aa18e05f6e2b9635332f012f7");
        }
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            NewUserRiskOptions fromJson = fromJson(jSONArray.optJSONObject(i));
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
