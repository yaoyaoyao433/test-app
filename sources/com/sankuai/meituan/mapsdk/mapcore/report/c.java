package com.sankuai.meituan.mapsdk.mapcore.report;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public d b;
    public e c;

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51762429d88fd3f7df96064af0c2d0a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51762429d88fd3f7df96064af0c2d0a7");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ocean", this.b == null ? "" : this.b.a());
            jSONObject.put("raptor", this.c == null ? "" : this.c.a());
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
