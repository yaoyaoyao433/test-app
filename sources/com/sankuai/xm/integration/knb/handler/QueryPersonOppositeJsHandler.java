package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.base.util.a;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.integration.knb.result.b;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class QueryPersonOppositeJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "Jn8MK9XZmzSh4ZCMmhnvkRxnS7P4AfWpH8OxYnC8YOqjSbdrkbQ9ewxEVfzZDYn8Ra/xQ1HqQR6jdz0PhqaOcg==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b9e5f44179f5103e647709b96199ea3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b9e5f44179f5103e647709b96199ea3");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "3491e9a95df93482753cb84cae9ed7bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "3491e9a95df93482753cb84cae9ed7bc");
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("msgIdsSend");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(Long.valueOf(optJSONArray.getLong(i)));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            JSONArray optJSONArray2 = jSONObject.optJSONArray("msgIdsRecv");
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    arrayList2.add(Long.valueOf(optJSONArray2.getLong(i2)));
                }
            }
            if (com.sankuai.xm.base.util.b.a((Collection<?>) arrayList) && com.sankuai.xm.base.util.b.a((Collection<?>) arrayList2)) {
                bVar.a(10011, "messages param error");
                return;
            }
            IMClient.a().a(c.d(jSONObject), arrayList, arrayList2);
            bVar.a(new JSONObject());
        } catch (Throwable th) {
            a.c("queryPersonOpposite exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
