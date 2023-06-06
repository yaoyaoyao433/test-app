package com.sankuai.waimai.platform.dynamic.gson;

import com.meituan.android.cube.pga.dynamic.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static List<c> a(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a00299d7493de03f7d227a180eddae22", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a00299d7493de03f7d227a180eddae22");
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = (JSONObject) jSONArray.opt(i);
            c cVar = new c();
            cVar.a = jSONObject.optString("module_id");
            cVar.b = jSONObject.optString("template_id");
            cVar.c = jSONObject.optString("native_id");
            cVar.d = jSONObject.optString("string_data");
            cVar.e = jSONObject.optJSONObject("json_data");
            cVar.f = jSONObject.optInt("data_type");
            cVar.i = jSONObject.optBoolean("isCache", false);
            cVar.h = jSONObject.optString("default_template_id");
            JSONObject optJSONObject = jSONObject.optJSONObject("layout_info");
            if (optJSONObject != null) {
                cVar.g = (com.meituan.android.cube.pga.common.c) b.a().fromJson(optJSONObject.toString(), (Class<Object>) com.meituan.android.cube.pga.common.c.class);
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
