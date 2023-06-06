package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.base.util.a;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ResendMessageJsHandler extends SendMessageJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.xm.integration.knb.handler.SendMessageJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "I5WFWLn22WEpvk/hfK9F1w4UK7zBx80LfxOK2N4efXyXr0+m58B+sc1hlf8/T64krfXsXzPyYtyfJrAbG44MDg==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.SendMessageJsHandler, com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    @Trace(action = "send", name = "start_ui", traceName = "send_msg")
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd0d77cea5864a132776b89af311dc05", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd0d77cea5864a132776b89af311dc05");
            return;
        }
        try {
            j.a(i.begin, "start_ui", "send_msg", 0L, "send", new Object[0]);
            JSONObject jSONObject = jsBean().argsJson;
            final b bVar = new b(this);
            final IMClient.m mVar = (IMClient.m) createCallback(IMClient.m.class, "dxsdk.messagesStatusChange");
            Object[] objArr2 = {jSONObject, bVar, mVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "770264eaea173de6355a2d5c0d88ee0d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "770264eaea173de6355a2d5c0d88ee0d");
            } else {
                final String optString = jSONObject.optString("uuid");
                if (ac.a(optString)) {
                    a.c("ResendMessageJsHandler,msg uuid cannot be null.", new Object[0]);
                    bVar.a(-1, "msg uuid cannot be null.");
                } else {
                    a.a("ResendMessageJsHandler::innerExe category:" + c.a(jSONObject) + " msgUuid:" + optString, new Object[0]);
                    IMClient.a().a(c.a(jSONObject), optString, new IMClient.g<IMMessage>() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.11
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.xm.im.IMClient.g
                        public final /* synthetic */ void a(IMMessage iMMessage) {
                            IMMessage iMMessage2 = iMMessage;
                            Object[] objArr3 = {iMMessage2};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "f1b8895ab8145e9e0856022f4629fb64", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "f1b8895ab8145e9e0856022f4629fb64");
                            } else if (iMMessage2 == null) {
                                com.sankuai.xm.im.bridge.base.util.a.c("ResendMessageJsHandler, cannot find msg with uuid " + optString, new Object[0]);
                                com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b bVar2 = bVar;
                                bVar2.a(-1, "cannot find msg with uuid " + optString);
                            } else {
                                b.a(bVar, iMMessage2, true, mVar);
                            }
                        }
                    });
                }
            }
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }
}
