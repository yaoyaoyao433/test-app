package com.sankuai.meituan.mapsdk.mapcore.report;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public Map<String, String> b;
    public Map<String, Float> c;

    public e(Map<String, String> map, Map<String, Float> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd122628e3b96356fa96609875501b2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd122628e3b96356fa96609875501b2d");
            return;
        }
        this.b = map;
        this.c = map2;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24df52c58cc53b19fa9afbf88ece7bde", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24df52c58cc53b19fa9afbf88ece7bde");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tags", this.b);
            jSONObject.put("values", this.c);
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
