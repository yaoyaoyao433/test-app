package com.sankuai.xm.integration.knb.handler;

import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SendMessageJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "nLW/q03nhilmj70OzpwQFMzZIHdQR/iYPpKeUifwYkBeBXAgp11OLmdz7tFGph+uaAOTDWnw43QL9rivIjNeTA==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    @Trace(action = "send", name = "start_ui", traceName = "send_msg")
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "432b491d2b37ca7a2fdbf58f3bdcca4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "432b491d2b37ca7a2fdbf58f3bdcca4d");
            return;
        }
        try {
            j.a(i.begin, "start_ui", "send_msg", 0L, "send", new Object[0]);
            JSONObject jSONObject = jsBean().argsJson;
            b bVar = new b(this);
            IMClient.m mVar = (IMClient.m) createCallback(IMClient.m.class, "dxsdk.messagesStatusChange");
            Object[] objArr2 = {jSONObject, bVar, mVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "07f39b5ce58ce99f8f0288d70fd183eb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "07f39b5ce58ce99f8f0288d70fd183eb");
            } else {
                IMMessage e = c.e(jSONObject);
                if (e == null) {
                    bVar.a(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_WEB_EVENT, "param error");
                } else {
                    int category = e.getCategory();
                    Object[] objArr3 = {Integer.valueOf(category)};
                    ChangeQuickRedirect changeQuickRedirect4 = c.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "510b2efceaa95de56706bba42225c4e8", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "510b2efceaa95de56706bba42225c4e8")).booleanValue() : MessageUtils.isPubService(category)) {
                        e.setPeerAppId((short) 0);
                        e.setToAppId((short) 0);
                    } else {
                        e.setPeerAppId(e.getToAppId());
                    }
                    com.sankuai.xm.im.bridge.business.proto.im.b.a(bVar, e, false, mVar);
                }
            }
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }
}
