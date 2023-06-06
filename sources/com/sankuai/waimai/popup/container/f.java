package com.sankuai.waimai.popup.container;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class f implements com.sankuai.waimai.mach.d {
    public static ChangeQuickRedirect c;

    public abstract void a(String str, String str2, int i, Map<String, Object> map, JSONObject jSONObject, String str3, JSONObject jSONObject2, com.sankuai.waimai.mach.node.a<?> aVar);

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4499097d2fe698f8ff0d1ca18c00e229", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4499097d2fe698f8ff0d1ca18c00e229");
        } else if (map != null) {
            JSONObject jSONObject = new JSONObject(map);
            String optString = jSONObject.optString("bid");
            if (aa.a(optString)) {
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("lab");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            a(str, str2, i, map, jSONObject, optString, optJSONObject, aVar);
        }
    }
}
