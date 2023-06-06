package com.sankuai.xm.integration.knb.handler;

import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.session.entry.a;
import com.sankuai.xm.integration.knb.result.b;
import java.util.ArrayList;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DeleteSessionJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "SZEoB37m2rCISnFo1AcJO0ViED7WwWIWFdjjpcbyWcUuPR6nBA1DkS2+46jKH/AN1aU9CrUGS46tu7nRmktrzA==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "497fe3526f5a39049cdcc28e4fb855c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "497fe3526f5a39049cdcc28e4fb855c1");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        final b bVar = new b(this);
        final IMClient.f fVar = (IMClient.f) createCallback(IMClient.f.class, "dxsdk.sessionsChange");
        Object[] objArr2 = {jSONObject, bVar, fVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "9ce076114214038145adaa3c6d89d9b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "9ce076114214038145adaa3c6d89d9b9");
            return;
        }
        try {
            final boolean optBoolean = jSONObject.optBoolean("shouldDeleteMessage", false);
            final SessionId d = c.d(jSONObject);
            if (d == null) {
                bVar.a(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_WEB_EVENT, "param error");
            } else {
                IMClient.a().a(d, new IMClient.g<a>() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.im.IMClient.g
                    public final /* synthetic */ void a(com.sankuai.xm.im.session.entry.a aVar) {
                        final com.sankuai.xm.im.session.entry.a aVar2 = aVar;
                        Object[] objArr3 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "f71babb5309beea685158fb4fa23fb7a", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "f71babb5309beea685158fb4fa23fb7a");
                        } else if (aVar2 != null) {
                            IMClient.a().a(d, optBoolean, new com.sankuai.xm.im.a<Void>() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.1.1
                                public static ChangeQuickRedirect a;

                                {
                                    AnonymousClass1.this = this;
                                }

                                @Override // com.sankuai.xm.base.callback.Callback
                                public final /* synthetic */ void onSuccess(Object obj) {
                                    Object[] objArr4 = {(Void) obj};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "6b0c1796528cb27992c44d32d18ff8c9", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "6b0c1796528cb27992c44d32d18ff8c9");
                                        return;
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(aVar2);
                                    if (fVar != null) {
                                        fVar.b(arrayList);
                                    }
                                    bVar.a(new JSONObject());
                                }

                                @Override // com.sankuai.xm.base.callback.Callback
                                public final void onFailure(int i, String str) {
                                    Object[] objArr4 = {Integer.valueOf(i), str};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "f8e720fee928fce6c0df713bf3db2cec", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "f8e720fee928fce6c0df713bf3db2cec");
                                    } else {
                                        bVar.a(i, str);
                                    }
                                }
                            });
                        } else {
                            bVar.a(new JSONObject());
                        }
                    }
                });
            }
        } catch (Throwable th) {
            com.sankuai.xm.im.bridge.base.util.a.c("deleteSession exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
