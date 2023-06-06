package com.dianping.networklog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ab extends a {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.networklog.a, com.dianping.networklog.b
    public final JSONObject a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aea4337ab66f17f9f613c956fd796f2", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aea4337ab66f17f9f613c956fd796f2");
        }
        try {
            if (aj.a()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("logan_shard_enable", true);
                jSONObject.put("logan_sub_process_enable", true);
                jSONObject.put("logan_enabled_processes", new JSONArray((Collection) Arrays.asList(".MgcProcess", "miniApp0", "miniApp1", "miniApp2", "miniApp3", "dppushservice")));
                return jSONObject;
            }
        } catch (Exception unused) {
        }
        return super.a();
    }
}
