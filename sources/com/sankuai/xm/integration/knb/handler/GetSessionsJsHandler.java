package com.sankuai.xm.integration.knb.handler;

import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.base.util.a;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.integration.knb.result.b;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GetSessionsJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "ZScOMNrbPWkCnZw/++vj1Tm1uyCietxtF0S8Rn3naMQHgxTvHFTQeqjM2bCPj28UGRpQDY7heLhFuoM2IDgwPA==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14b8fad132935eabdbcc7db62a0b5eac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14b8fad132935eabdbcc7db62a0b5eac");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        final b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "eefa24b80c3927f1e04a4381e396bd2e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "eefa24b80c3927f1e04a4381e396bd2e");
            return;
        }
        try {
            final short c = c.c(jSONObject);
            final int a = c.a(jSONObject);
            final int optInt = jSONObject.optInt(Message.PEER_APPID, 0);
            final JSONArray optJSONArray = jSONObject.optJSONArray("tagIds");
            final int optInt2 = jSONObject.optInt("offset", 0);
            int optInt3 = jSONObject.optInt("limit", 0);
            final boolean z = optInt3 <= 0 && optInt2 <= 0;
            int i = 30;
            if (optInt3 > 0 && optInt3 <= 30) {
                i = optInt3;
            }
            final int b = c.b(jSONObject);
            a.a("GetSessionsJsHandler::innerExe channel:" + ((int) c) + " category:" + a + " offset:" + optInt2 + " limit:" + i + " subCategory:" + b + " bGetAllSession:" + z, new Object[0]);
            if (optJSONArray == null) {
                final boolean z2 = z;
                final int i2 = i;
                IMClient.a().a(c, new IMClient.g<List<com.sankuai.xm.im.session.entry.a>>() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.17
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.im.IMClient.g
                    public final /* synthetic */ void a(List<com.sankuai.xm.im.session.entry.a> list) {
                        List<com.sankuai.xm.im.session.entry.a> list2 = list;
                        Object[] objArr3 = {list2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e85da1c7038f8974a6dc53047d25d80d", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e85da1c7038f8974a6dc53047d25d80d");
                        } else {
                            b.a(bVar, z2, list2, a, b, optInt, optInt2, i2);
                        }
                    }
                });
                return;
            }
            final com.sankuai.xm.imextra.service.chatpresent.b bVar2 = (com.sankuai.xm.imextra.service.chatpresent.b) m.a(com.sankuai.xm.imextra.service.chatpresent.b.class);
            if (bVar2 == null) {
                bVar.a(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_WEB_EVENT, "exception:SessionPresentService not available.");
                return;
            }
            final int i3 = i;
            com.sankuai.xm.threadpool.scheduler.a.b().b(new Runnable() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.18
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "474835049db7d3c704b0fa92da03c452", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "474835049db7d3c704b0fa92da03c452");
                        return;
                    }
                    HashSet hashSet = new HashSet(optJSONArray.length());
                    for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                        hashSet.add(optJSONArray.optString(i4));
                    }
                    b.a(bVar, z, bVar2.a(0L, c, hashSet), a, b, optInt, optInt2, i3);
                }
            });
        } catch (Throwable th) {
            a.c("getSessionList exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
