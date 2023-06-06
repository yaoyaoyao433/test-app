package com.meituan.android.common.statistics.InnerDataBuilder;

import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.android.common.statistics.flowmanager.client.HighFlowBidManager;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HighFlowBuilder extends BaseBuilder {
    private static final String BID_BLACKLIST = "bid_blacklist";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Holder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static HighFlowBuilder instance = new HighFlowBuilder();
    }

    public static HighFlowBuilder getInstance() {
        return Holder.instance;
    }

    @Override // com.meituan.android.common.statistics.InnerDataBuilder.BaseBuilder
    public boolean checkIfNeedReport() {
        return this.mNeedReport;
    }

    @Override // com.meituan.android.common.statistics.InnerDataBuilder.BaseBuilder
    public JSONObject onProcessData(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, long j) {
        Map<String, Integer> blackMap;
        Object[] objArr = {jSONObject, jSONObject2, jSONObject3, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b63f7589b3250bd96285c4cc6f11de2", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b63f7589b3250bd96285c4cc6f11de2");
        }
        if (jSONObject2 == null) {
            return null;
        }
        if ("8".equals(jSONObject.optString("nt")) || (blackMap = HighFlowBidManager.getInstance().getBlackMap()) == null) {
            return jSONObject2;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, Integer> entry : blackMap.entrySet()) {
                if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                    String key = entry.getKey();
                    int intValue = entry.getValue().intValue();
                    LogUtil.log("HighFlowBidManager", "bid = " + key + ", num= " + intValue);
                    if (intValue > 0) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("bid", key);
                        jSONObject4.put(RaptorConstants.JS_BATCH_NUM, intValue);
                        jSONArray.put(jSONObject4);
                    }
                }
            }
            jSONObject2.put("bid_blacklist", jSONArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject2;
    }
}
