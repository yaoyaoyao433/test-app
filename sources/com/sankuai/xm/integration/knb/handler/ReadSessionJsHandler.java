package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.base.util.a;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ReadSessionJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "oWCIRxOKLAGW18ImfcONdNJ0Z41cgRmraorK+iopzud4Kg0+W12SyxHOnTQENsKgWcaA2VYm7i3ovYZs8EPEAQ==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    @Trace(action = "send", name = "start_knb", traceName = "sync_read")
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13cf2b7c1a1b8e16121c652be38ed47f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13cf2b7c1a1b8e16121c652be38ed47f");
            return;
        }
        try {
            j.a(i.begin, "start_knb", "sync_read", 0L, "send", new Object[0]);
            JSONObject jSONObject = jsBean().argsJson;
            final b bVar = new b(this);
            Object[] objArr2 = {jSONObject, bVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "90b62a51acd4e01f37c6e345d5c56f74", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "90b62a51acd4e01f37c6e345d5c56f74");
            } else {
                SessionId d = c.d(jSONObject);
                a.a("ReadSessionJsHandler::innerExe sessionid:" + d, new Object[0]);
                IMClient.a().a(com.sankuai.xm.base.util.b.a(d), new com.sankuai.xm.im.a<String>() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.19
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final /* synthetic */ void onSuccess(Object obj) {
                        Object[] objArr3 = {(String) obj};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "8fecd140be941a1a2c8e248820714041", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "8fecd140be941a1a2c8e248820714041");
                        } else {
                            bVar.a(new JSONObject());
                        }
                    }

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final void onFailure(int i, String str) {
                        Object[] objArr3 = {Integer.valueOf(i), str};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "1ef9409bef8fb413148d537da78dc80a", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "1ef9409bef8fb413148d537da78dc80a");
                        } else {
                            bVar.a(i, str);
                        }
                    }
                });
            }
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }
}
