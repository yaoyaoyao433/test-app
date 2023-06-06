package com.sankuai.xm.base.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class r {
    public static ChangeQuickRedirect a;

    private static JSONObject b(Map<String, ? extends Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94ec49b96967349e45cf2290af58b0a1", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94ec49b96967349e45cf2290af58b0a1");
        }
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
        } catch (JSONException e) {
            com.sankuai.xm.log.a.a(e);
        }
        return jSONObject;
    }

    public static String a(Map<String, ? extends Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d39ce52b01894de890e620bca3c530b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d39ce52b01894de890e620bca3c530b");
        }
        JSONObject b = b(map);
        if (b != null) {
            return b.toString();
        }
        return null;
    }
}
