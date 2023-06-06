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
public class CancelMessageJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "JiRrwct3ISgd2iwnyxYAQRcDsxb+ezCkaXNWiJszeDIJCFXtwrc4jz/+htxqu5MTxeI8GRLxXLR7HxOwgk07rw==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    @Trace(action = "send", name = "start_knb", traceName = "recall_msg")
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4973480120fba5d4c77f83f6348daa5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4973480120fba5d4c77f83f6348daa5b");
            return;
        }
        try {
            j.a(i.begin, "start_knb", "recall_msg", 0L, "send", new Object[0]);
            JSONObject jSONObject = jsBean().argsJson;
            final b bVar = new b(this);
            final IMClient.m mVar = (IMClient.m) createCallback(IMClient.m.class, "dxsdk.messagesStatusChange");
            Object[] objArr2 = {jSONObject, bVar, mVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "37cab02e399003a2053edd88fceff97b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "37cab02e399003a2053edd88fceff97b");
            } else {
                final String optString = jSONObject.optString("uuid");
                if (ac.a(optString)) {
                    a.c("CancelMessageJsHandler,msgUuid cannot be null" + optString, new Object[0]);
                    bVar.a(-1, "msgUuid cannot be null" + optString);
                } else {
                    final boolean optBoolean = jSONObject.optBoolean("isAdminCancel", false);
                    a.a("CancelMessageJsHandler::innerExe category:" + c.a(jSONObject) + " msgUuid:" + optString + " isCancelledByAdmin:" + optBoolean, new Object[0]);
                    IMClient.a().a(c.a(jSONObject), optString, new IMClient.g<IMMessage>() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.21
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.xm.im.IMClient.g
                        public final /* synthetic */ void a(IMMessage iMMessage) {
                            IMMessage iMMessage2 = iMMessage;
                            Object[] objArr3 = {iMMessage2};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "ac377fb6028848da9cbe6a9ba2203937", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "ac377fb6028848da9cbe6a9ba2203937");
                            } else if (iMMessage2 != null) {
                                if (optBoolean) {
                                    iMMessage2.setAdminUid(IMClient.a().k());
                                }
                                int a2 = IMClient.a().a(iMMessage2, mVar);
                                if (a2 != 0) {
                                    bVar.a(a2, "cancel message fail");
                                } else {
                                    bVar.a(new JSONObject());
                                }
                            } else {
                                com.sankuai.xm.im.bridge.base.util.a.c("CancelMessageJsHandler,cannot find msg with msgUuid" + optString, new Object[0]);
                                com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b bVar2 = bVar;
                                bVar2.a(-1, "cannot find msg with msgUuid " + optString);
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
