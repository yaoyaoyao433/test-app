package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.base.util.a;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DeleteLocalMsgJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "QehTho1XeEBiyxTSewaAi5PjrVCB1NncZr8HFYpTItWd9w3jpWUt95EMPrn4i+IJ8+AjCBcdsr7mP1tsgeECPA==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa7c96cd2c20308744a55748a2e9b428", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa7c96cd2c20308744a55748a2e9b428");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        final b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "4a8aa9732f1b7ea89e03cc58e27b87d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "4a8aa9732f1b7ea89e03cc58e27b87d0");
            return;
        }
        try {
            IMMessage e = c.e(jSONObject);
            if (e == null) {
                bVar.a(10011, "cannot obtain IMMessage from json.");
                return;
            }
            a.a("DeleteLocalMsgJsHandler::innerExe message:" + e.keyParamToString(), new Object[0]);
            IMClient.a().a(e, new com.sankuai.xm.im.a<IMMessage>() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Object obj) {
                    IMMessage iMMessage = (IMMessage) obj;
                    Object[] objArr3 = {iMMessage};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "1ab0294fc2e56f1f004096e2a6f4b28f", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "1ab0294fc2e56f1f004096e2a6f4b28f");
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("message", c.a(iMMessage));
                        bVar.a(jSONObject2);
                    } catch (Throwable th) {
                        com.sankuai.xm.im.bridge.base.util.a.c("DeleteLocalMsgJsHandler::exception info: " + th, new Object[0]);
                        com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b bVar2 = bVar;
                        bVar2.a(-1, "DeleteLocalMsgJsHandler::exception info: " + th.getMessage());
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str) {
                    Object[] objArr3 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "6f7ec723870dba16356b945787fb829e", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "6f7ec723870dba16356b945787fb829e");
                    } else {
                        bVar.a(-1, "failed in inserting local message.");
                    }
                }
            });
        } catch (Throwable th) {
            a.c("deleteLocalMessage exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
