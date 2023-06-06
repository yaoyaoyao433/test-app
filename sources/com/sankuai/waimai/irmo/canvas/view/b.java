package com.sankuai.waimai.irmo.canvas.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.canvas.data.d;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    private static JSONObject a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b3d7aace908f21901c4aa97315f8e9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b3d7aace908f21901c4aa97315f8e9b");
        }
        JSONObject jSONObject = new JSONObject();
        if (dVar == null || dVar.getJavaMap() == null || dVar.getJavaMap().size() == 0) {
            return jSONObject;
        }
        try {
            for (Map.Entry<String, Object> entry : dVar.getJavaMap().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof d) {
                    jSONObject.put(key, a((d) value));
                } else if (value instanceof com.sankuai.waimai.irmo.canvas.data.b) {
                    jSONObject.put(key, a((com.sankuai.waimai.irmo.canvas.data.b) value));
                } else if (value == null) {
                    jSONObject.put(key, StringUtil.NULL);
                } else {
                    jSONObject.put(key, value);
                }
            }
        } catch (Exception e) {
            com.sankuai.waimai.irmo.canvas.util.a.a(6, "infeMap2Json异常-->" + e.getMessage(), new Object[0]);
        }
        return jSONObject;
    }

    public static JSONArray a(com.sankuai.waimai.irmo.canvas.data.b bVar) throws Exception {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c51fae90100b39c3828169e0a1ffe1e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c51fae90100b39c3828169e0a1ffe1e2");
        }
        JSONArray jSONArray = new JSONArray();
        if (bVar == null || bVar.size() == 0) {
            return jSONArray;
        }
        for (int i = 0; i < bVar.size(); i++) {
            Object obj = bVar.get(i);
            if (obj instanceof d) {
                jSONArray.put(a((d) obj));
            } else if (obj instanceof com.sankuai.waimai.irmo.canvas.data.b) {
                jSONArray.put(a((com.sankuai.waimai.irmo.canvas.data.b) obj));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }
}
