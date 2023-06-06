package com.sankuai.xm.integration.emotion.entity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d {
    public static ChangeQuickRedirect a;
    public String b;

    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da66d5da3ed16ec8f7757fe7ab33bf28", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da66d5da3ed16ec8f7757fe7ab33bf28");
        } else if (jSONObject == null) {
            com.sankuai.xm.log.c.d(d.class, "parse:: json is null", new Object[0]);
        } else {
            this.b = jSONObject.optString("params");
        }
    }
}
