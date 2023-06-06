package com.sankuai.waimai.business.order.submit.model;

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
public class CautionInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("caution")
    public String caution;
    @SerializedName("id")
    public long cautionId;

    public static CautionInfo fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "077144e6a54e12a387a61c0844863b58", RobustBitConfig.DEFAULT_VALUE)) {
            return (CautionInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "077144e6a54e12a387a61c0844863b58");
        }
        if (jSONObject == null) {
            return null;
        }
        CautionInfo cautionInfo = new CautionInfo();
        cautionInfo.cautionId = jSONObject.optLong("id", 0L);
        cautionInfo.caution = jSONObject.optString("caution");
        return cautionInfo;
    }

    public static List<CautionInfo> fromJsonArray(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "880020ebe50cb17c4add6314af99503b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "880020ebe50cb17c4add6314af99503b");
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            CautionInfo fromJson = fromJson(jSONArray.optJSONObject(i));
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        return arrayList;
    }

    public long getCautionId() {
        return this.cautionId;
    }

    public String getCaution() {
        return this.caution;
    }
}
