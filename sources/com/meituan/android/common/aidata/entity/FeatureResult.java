package com.meituan.android.common.aidata.entity;

import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FeatureResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Map<String, List<ResultRow>> mData;

    public FeatureResult(Map<String, List<ResultRow>> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b17e9823235513e9d88c106bce6f259a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b17e9823235513e9d88c106bce6f259a");
        } else {
            this.mData = map;
        }
    }

    public Map<String, List<ResultRow>> getData() {
        return this.mData;
    }

    public synchronized String getJsonString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "596fad9fdb06bfa8cca0fd188da76de1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "596fad9fdb06bfa8cca0fd188da76de1");
        }
        JSONObject jsonObject = toJsonObject();
        if (jsonObject != null) {
            return jsonObject.toString();
        }
        return "{}";
    }

    public synchronized JSONObject toJsonObject() {
        JSONObject jSONObject;
        JSONArray jSONArray;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f733aecf81dfb4d75ca7f3fdbae05c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f733aecf81dfb4d75ca7f3fdbae05c4");
        }
        if (this.mData == null || this.mData.size() <= 0) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            for (Map.Entry<String, List<ResultRow>> entry : this.mData.entrySet()) {
                List<ResultRow> list = this.mData.get(entry.getKey());
                if (list != null) {
                    if (list.size() > 0) {
                        jSONArray = new JSONArray();
                        for (ResultRow resultRow : list) {
                            jSONArray.put(resultRow.toJSONObject());
                        }
                        jSONObject.put(entry.getKey(), jSONArray);
                    }
                }
                jSONArray = null;
                jSONObject.put(entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }
}
