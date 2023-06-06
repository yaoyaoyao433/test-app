package com.sankuai.xm.data;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.d;
import com.sankuai.xm.log.c;
import com.unionpay.tsmservice.data.Constant;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends d {
    public static ChangeQuickRedirect b;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public int a;
        public int b;
        public String c;
        public int d;
        public String e;
        public int f;
    }

    public b(String str, com.sankuai.xm.network.httpurlconnection.d dVar) {
        super(str, null);
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dbcce03f2a86a65ee472dc8163d886a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dbcce03f2a86a65ee472dc8163d886a");
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daf61e1f39f4b10a768c02ba3d5b7109", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daf61e1f39f4b10a768c02ba3d5b7109");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("insId", aVar.a);
            jSONObject.put(Constant.KEY_RESULT_CODE, aVar.b);
            jSONObject.put("msg", aVar.c);
            int i = aVar.f;
            if (i == 2) {
                jSONObject.put("curLevel", aVar.d);
            } else if (i == 4) {
                jSONObject.put("zipUrl", aVar.e);
            }
        } catch (JSONException e) {
            c.a("DataNotifyRequest", e);
        }
        a(jSONObject);
    }
}
