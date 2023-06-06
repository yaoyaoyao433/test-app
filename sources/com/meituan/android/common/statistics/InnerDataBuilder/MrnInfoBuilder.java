package com.meituan.android.common.statistics.InnerDataBuilder;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MrnInfoBuilder extends BaseBuilder {
    private static final String MRN_INFO_KEY = "mrnInfo";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Holder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static MrnInfoBuilder instance = new MrnInfoBuilder();
    }

    public static MrnInfoBuilder getInstance() {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b8d6b0b35032bb152ea2b0da31e372d", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b8d6b0b35032bb152ea2b0da31e372d");
        }
        if (jSONObject2 == null) {
            return null;
        }
        if (jSONObject != null) {
            try {
                if (jSONObject.optJSONObject("val_lab") != null) {
                    Object remove = jSONObject.optJSONObject("val_lab").remove(MRN_INFO_KEY);
                    if (remove instanceof JSONObject) {
                        jSONObject2.put("mrn_info", remove);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject2;
    }
}
