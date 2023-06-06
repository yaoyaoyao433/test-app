package com.meituan.metrics.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class JSONUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static JSONObject buildLogUnit(String str, Object obj, JSONObject jSONObject, long j) throws JSONException {
        Object[] objArr = {str, obj, jSONObject, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c1c1de0ac25dc3c0c585be85b6ed1adf", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c1c1de0ac25dc3c0c585be85b6ed1adf");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", str);
        jSONObject2.put("value", obj);
        jSONObject2.put("tags", jSONObject);
        jSONObject2.put("ts", j);
        return jSONObject2;
    }

    public static JSONObject buildTrafficLogUnit(String str, Object obj, JSONObject jSONObject, JSONObject jSONObject2, long j) throws JSONException {
        Object[] objArr = {str, obj, jSONObject, jSONObject2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "623b677fd10c366f207035f80a94b25b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "623b677fd10c366f207035f80a94b25b");
        }
        JSONObject buildLogUnit = buildLogUnit(str, obj, jSONObject2, j);
        buildLogUnit.put("details", jSONObject);
        return buildLogUnit;
    }
}
