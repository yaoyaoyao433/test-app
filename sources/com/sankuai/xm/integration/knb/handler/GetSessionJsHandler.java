package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.im.cache.bean.DBSession;
import com.sankuai.xm.im.session.entry.a;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GetSessionJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "Ra5pZmAk1JMvZOnLTTN0eiv5Olcr0q1nDNkw5SQHr/1VKHXs8+jxGFboQjOu7H7xAmk12/qGOa9nhlIR19qpMg==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "442401c4fc89250ce1738007ea034f8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "442401c4fc89250ce1738007ea034f8d");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        final b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "21192f88da907a1d587ab04477dad0cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "21192f88da907a1d587ab04477dad0cc");
            return;
        }
        try {
            IMClient.a().a(c.d(jSONObject), new IMClient.g<a>() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.16
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.IMClient.g
                public final /* synthetic */ void a(com.sankuai.xm.im.session.entry.a aVar) {
                    com.sankuai.xm.im.session.entry.a aVar2 = aVar;
                    Object[] objArr3 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a3a4702686e5dc876eadddcc2cb06bcf", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a3a4702686e5dc876eadddcc2cb06bcf");
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(DBSession.TABLE_NAME, c.a(aVar2));
                        bVar.a(jSONObject2);
                    } catch (Throwable th) {
                        com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b bVar2 = bVar;
                        bVar2.a(-1, "exception:" + th);
                    }
                }
            });
        } catch (Throwable th) {
            com.sankuai.xm.im.bridge.base.util.a.c("getSession exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
