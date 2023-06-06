package com.sankuai.xm.integration.knb.handler;

import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.a;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.imui.controller.group.bean.GroupAnnouncement;
import com.sankuai.xm.integration.knb.result.b;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GetUnreadCountJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "SLM9z3kf0QU2JSbIFolB3cal3s78UKSNhPQsleUby7k6Iw6kuqsQdeXBUPW0Gxi0OZz3y8wT35VnnKuZZH2buQ==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d8ecdc4be46b273ee2ac681ade87c1f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d8ecdc4be46b273ee2ac681ade87c1f");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        final b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "4039d005380c8944c52270c98b53cbd2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "4039d005380c8944c52270c98b53cbd2");
            return;
        }
        try {
            final short c = c.c(jSONObject);
            final JSONArray optJSONArray = jSONObject.optJSONArray("tagIds");
            final a<Integer> aVar = new a<Integer>() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Object obj) {
                    Integer num = (Integer) obj;
                    Object[] objArr3 = {num};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "64aa4f40408b9a91373b20434a950ba4", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "64aa4f40408b9a91373b20434a950ba4");
                        return;
                    }
                    com.sankuai.xm.im.utils.a.b("GetUnreadCountJsHandler::innerExe channel:%d tagIds %s unreadCount:%s", Short.valueOf(c), optJSONArray, num);
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put(GroupAnnouncement.GROUP_ANNOUNCEMENT_UNREAD_COUNT, num);
                        bVar.a(jSONObject2);
                    } catch (JSONException e) {
                        com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b bVar2 = bVar;
                        bVar2.a(-1, "getSessionListUnreadCount exception:" + e);
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str) {
                    Object[] objArr3 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "471ee4c8efa1c9a68de9dc0ec28d0184", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "471ee4c8efa1c9a68de9dc0ec28d0184");
                    } else {
                        bVar.a(i, str);
                    }
                }
            };
            Object[] objArr3 = {bVar, Short.valueOf(c), optJSONArray, aVar};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "90a5aa684227890e8e94eeb3570b7227", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "90a5aa684227890e8e94eeb3570b7227");
            } else if (optJSONArray == null) {
                IMClient.a().a(c, aVar);
            } else {
                final com.sankuai.xm.imextra.service.chatpresent.b bVar2 = (com.sankuai.xm.imextra.service.chatpresent.b) m.a(com.sankuai.xm.imextra.service.chatpresent.b.class);
                if (bVar2 == null) {
                    bVar.a(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_WEB_EVENT, "SessionPresentService is not available.");
                } else {
                    com.sankuai.xm.threadpool.scheduler.a.b().b(new Runnable() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.7
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i = 0;
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "8eca8e57fbc4c0755aa9bf489f5ee629", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "8eca8e57fbc4c0755aa9bf489f5ee629");
                                return;
                            }
                            HashSet hashSet = new HashSet(optJSONArray.length());
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                hashSet.add(optJSONArray.optString(i2));
                            }
                            List<com.sankuai.xm.im.session.entry.a> a2 = bVar2.a(0L, c, hashSet);
                            if (!com.sankuai.xm.base.util.b.a(a2)) {
                                for (com.sankuai.xm.im.session.entry.a aVar2 : a2) {
                                    if (c == -1 || aVar2.c().g == c) {
                                        i += aVar2.d;
                                    }
                                }
                            }
                            com.sankuai.xm.base.callback.a.a(aVar, Integer.valueOf(i));
                        }
                    });
                }
            }
        } catch (Throwable th) {
            com.sankuai.xm.im.bridge.base.util.a.c("getSessionListUnreadCount exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
