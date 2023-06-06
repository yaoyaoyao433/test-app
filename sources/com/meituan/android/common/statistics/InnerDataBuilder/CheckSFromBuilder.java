package com.meituan.android.common.statistics.InnerDataBuilder;

import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CheckSFromBuilder extends BaseBuilder {
    private static final String SFROM_NAME = "use_sfrom";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Holder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static CheckSFromBuilder instance = new CheckSFromBuilder();
    }

    public static CheckSFromBuilder getInstance() {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e7200daaf12c98f6f0b2cda6f4e411b", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e7200daaf12c98f6f0b2cda6f4e411b");
        }
        if (jSONObject2 == null) {
            return null;
        }
        try {
            if (jSONObject.optBoolean(Constants.EventInfoConsts.KEY_SF, false)) {
                jSONObject2.put(SFROM_NAME, 1);
            }
            if (jSONObject.optJSONObject("val_lab") != null) {
                Object remove = jSONObject.optJSONObject("val_lab").remove(CommonDataBuilder.FLOW_FROM_SUB_PROCESS);
                if (remove != null && (remove instanceof Integer)) {
                    jSONObject2.put(CommonDataBuilder.FLOW_FROM_SUB_PROCESS, remove);
                }
                Object remove2 = jSONObject.optJSONObject("val_lab").remove("process");
                if (remove2 != null && (remove2 instanceof String)) {
                    jSONObject2.put("pn", remove2);
                }
                Object remove3 = jSONObject.optJSONObject("val_lab").remove("mreq_id");
                if (remove3 != null && (remove3 instanceof String)) {
                    jSONObject.put("mreq_id", remove3);
                }
            }
            if (!jSONObject2.has("pn")) {
                jSONObject2.put("pn", ProcessUtils.getCurrentProcessName(Statistics.getContext()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject2;
    }
}
