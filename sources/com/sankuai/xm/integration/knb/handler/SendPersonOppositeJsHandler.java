package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.integration.knb.result.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SendPersonOppositeJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "gAOwBNThh7n87e+9SirYe2FlYGa0L773mDN8RYDLaGlm6nPpdO1O++SG3FxwA0hjWeUvuKpY8geabkSpPhI0JQ==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    @Trace(action = "send", name = "start_knb", traceName = "opposite_msg")
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2434b438fe221e01f67f41021f386854", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2434b438fe221e01f67f41021f386854");
            return;
        }
        try {
            j.a(i.begin, "start_knb", "opposite_msg", 0L, "send", new Object[0]);
            JSONObject jSONObject = jsBean().argsJson;
            b bVar = new b(this);
            Object[] objArr2 = {jSONObject, bVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "cb47f93da0bd6c753a702f23a6570c20", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "cb47f93da0bd6c753a702f23a6570c20");
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("messages");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    List<Message> a = c.a(optJSONArray);
                    if (com.sankuai.xm.base.util.b.a(a)) {
                        bVar.a(10011, "messages param error");
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < a.size(); i++) {
                            arrayList.add(Long.valueOf(a.get(i).getMsgId()));
                        }
                        IMClient.a().a(c.d(jSONObject), arrayList);
                        bVar.a(new JSONObject());
                    }
                }
                bVar.a(10011, "messages param error");
            }
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }
}
