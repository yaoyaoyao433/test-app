package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.base.util.a;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class UpdateLocalMsgJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "Zys1OBRc00akDdD312amlHy9HabZJlm7bsL3JXremNC1/3oqbkiLvXXk6Yb8ejGoGCLKZjuGw2r/X8kW0M+h6w==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4265b9472d21767797b2781ff401e86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4265b9472d21767797b2781ff401e86");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        final b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "754ec02a94443f5241c2f2dbb716bb74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "754ec02a94443f5241c2f2dbb716bb74");
            return;
        }
        try {
            IMMessage e = c.e(jSONObject);
            if (e != null && !ac.a(e.getMsgUuid())) {
                a.a("UpdateLocalMsgJsHandler::innerExe message:" + e, new Object[0]);
                IMClient a = IMClient.a();
                IMClient.g<IMMessage> gVar = new IMClient.g<IMMessage>() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.13
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.im.IMClient.g
                    public final /* synthetic */ void a(IMMessage iMMessage) {
                        IMMessage iMMessage2 = iMMessage;
                        Object[] objArr3 = {iMMessage2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "c0716f9f2d000d68cb1f1c2390e8b4fd", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "c0716f9f2d000d68cb1f1c2390e8b4fd");
                        } else if (iMMessage2 == null) {
                            bVar.a(10011, "failed in updateMessage local message.");
                        } else {
                            b.a(bVar, iMMessage2);
                        }
                    }
                };
                Object[] objArr3 = {e, gVar};
                ChangeQuickRedirect changeQuickRedirect4 = IMClient.a;
                if (PatchProxy.isSupport(objArr3, a, changeQuickRedirect4, false, "3a7e9d680d5b5d3ea21b44f675dc5f76", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, a, changeQuickRedirect4, false, "3a7e9d680d5b5d3ea21b44f675dc5f76");
                    return;
                } else {
                    a.a(e, false, gVar);
                    return;
                }
            }
            bVar.a(10011, "cannot obtain IMMessage from json.");
        } catch (Throwable th) {
            a.c("updateLocalMessage exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
