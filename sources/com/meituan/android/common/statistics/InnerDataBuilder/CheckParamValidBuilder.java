package com.meituan.android.common.statistics.InnerDataBuilder;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CheckParamValidBuilder extends BaseBuilder {
    private static final String CID_QUALITY_VALID_STATICS_NAME = "cid_quality";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Holder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static CheckParamValidBuilder instance = new CheckParamValidBuilder();
    }

    public static CheckParamValidBuilder getInstance() {
        return Holder.instance;
    }

    @Override // com.meituan.android.common.statistics.InnerDataBuilder.BaseBuilder
    public boolean checkIfNeedReport() {
        return this.mNeedReport;
    }

    @Override // com.meituan.android.common.statistics.InnerDataBuilder.BaseBuilder
    public JSONObject onProcessData(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, long j) {
        Object[] objArr = {jSONObject, jSONObject2, jSONObject3, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19e7ff0d7a8dd739669c43ea157cda6e", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19e7ff0d7a8dd739669c43ea157cda6e");
        }
        if (jSONObject2 == null) {
            return null;
        }
        if (jSONObject != null) {
            try {
                jSONObject2.put("cid_quality", jSONObject.optInt("cid_quality"));
                jSONObject.remove("cid_quality");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject2;
    }
}
