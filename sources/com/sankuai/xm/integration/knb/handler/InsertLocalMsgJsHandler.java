package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.base.util.a;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.integration.knb.result.b;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class InsertLocalMsgJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "Gf2O2Rm+7KZzOgwqLMAj/RZp+n1yk/ZtsyPzm816GtQl6q566M7MB5udvu0Gq+StsXnIDvUosccSHdy46a4CpA==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85a4562c825dcb5e7b316c229aa97156", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85a4562c825dcb5e7b316c229aa97156");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        final b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "f9178da48ace9f7ad6667317692ab37a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "f9178da48ace9f7ad6667317692ab37a");
            return;
        }
        try {
            final boolean optBoolean = jSONObject.optBoolean("notified");
            final IMMessage e = c.e(jSONObject);
            if (e == null) {
                bVar.a(10011, "cannot obtain IMMessage from json.");
                return;
            }
            a.a("InsertLocalMsgJsHandler::innerExe message:" + e, new Object[0]);
            IMClient.a().a(e.getCategory(), e.getMsgUuid(), new IMClient.g<IMMessage>() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.10
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.IMClient.g
                public final /* synthetic */ void a(IMMessage iMMessage) {
                    IMMessage iMMessage2 = iMMessage;
                    Object[] objArr3 = {iMMessage2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "89777dc3ec067907be8ae30fa560b10b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "89777dc3ec067907be8ae30fa560b10b");
                    } else if (iMMessage2 != null) {
                        IMClient.a().a(e, optBoolean, new IMClient.g<IMMessage>() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.10.1
                            public static ChangeQuickRedirect a;

                            {
                                AnonymousClass10.this = this;
                            }

                            @Override // com.sankuai.xm.im.IMClient.g
                            public final /* synthetic */ void a(IMMessage iMMessage3) {
                                IMMessage iMMessage4 = iMMessage3;
                                Object[] objArr4 = {iMMessage4};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "741209afd3b6af5e24074d0e9cfcf068", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "741209afd3b6af5e24074d0e9cfcf068");
                                } else if (iMMessage4 == null) {
                                    bVar.a(10011, "failed in inserting local message.");
                                } else {
                                    b.a(bVar, iMMessage4);
                                }
                            }
                        });
                    } else {
                        IMClient.a().a(com.sankuai.xm.base.util.b.a(e), optBoolean, new IMClient.g<List<IMMessage>>() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.10.2
                            public static ChangeQuickRedirect a;

                            {
                                AnonymousClass10.this = this;
                            }

                            @Override // com.sankuai.xm.im.IMClient.g
                            public final /* synthetic */ void a(List<IMMessage> list) {
                                List<IMMessage> list2 = list;
                                Object[] objArr4 = {list2};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "0df8a98e0714c6e2db60efcfede98bb4", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "0df8a98e0714c6e2db60efcfede98bb4");
                                } else if (com.sankuai.xm.base.util.b.a(list2)) {
                                    bVar.a(10011, "failed in inserting local message.");
                                } else {
                                    b.a(bVar, list2.get(0));
                                }
                            }
                        });
                    }
                }
            });
        } catch (Throwable th) {
            a.c("insertLocalMessage exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
