package com.sankuai.xm.integration.knb.handler;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.integration.knb.result.b;
import com.sankuai.xm.threadpool.scheduler.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GetSessionByTagJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "s+qJxhobSEHeme+3oF7XbsP2QWVJJukEFXOAxbJYQt+Y6Kgn8NpNBPor8zdSM5gdih3NPGebUE4adf9WxasvRQ==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c58168badffb960b3d2904e2389eb2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c58168badffb960b3d2904e2389eb2d");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        final b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "9c090b80abe2a33168a0e008015de991", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "9c090b80abe2a33168a0e008015de991");
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("sessionIds");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                final ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    arrayList.add(SessionId.a(optJSONObject.optLong("uid"), optJSONObject.optLong(Message.PEER_UID), MessageUtils.pushChatTypeToCategory(optJSONObject.optString("sessionType")), (short) optJSONObject.optInt(Message.PEER_APPID), (short) optJSONObject.optInt(RemoteMessageConst.Notification.CHANNEL_ID), optJSONObject.optString(Message.SID)));
                }
                final com.sankuai.xm.imextra.service.chatpresent.b bVar2 = (com.sankuai.xm.imextra.service.chatpresent.b) m.a(com.sankuai.xm.imextra.service.chatpresent.b.class);
                if (bVar2 == null) {
                    bVar.a(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_WEB_EVENT, "SessionPresentService is not available.");
                    return;
                } else {
                    a.b().b(new Runnable() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.8
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "05f87694b34b1ad682e251f076411a93", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "05f87694b34b1ad682e251f076411a93");
                                return;
                            }
                            Map<SessionId, List<com.sankuai.xm.imextra.service.chatpresent.a<SessionId>>> a2 = bVar2.a(0L, arrayList);
                            if (a2 == null || a2.isEmpty()) {
                                bVar.a(new JSONObject());
                                return;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (List<com.sankuai.xm.imextra.service.chatpresent.a<SessionId>> list : a2.values()) {
                                if (list != null) {
                                    arrayList2.addAll(list);
                                }
                            }
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("specialTags", c.f(arrayList2));
                                bVar.a(jSONObject2);
                            } catch (JSONException unused) {
                                bVar.a(10100, "GetSessionByTagJsHandler::result convert error");
                            }
                        }
                    });
                    return;
                }
            }
            bVar.a(10011, "GetSessionByTagJsHandler::sessionIds is empty");
        } catch (Throwable th) {
            bVar.a(10100, "getSessionsByTag: exception: " + th);
        }
    }
}
