package com.sankuai.xm.integration.knb.handler;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.api.a;
import com.sankuai.xm.im.message.bean.MsgAddition;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.integration.knb.result.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class QueryMsgAdditionJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "HiLpCtU8ojIisFXYKssJfd6hFReVVE+xPFH0537KB+jx0YUmlgeVyBPj3nv6QruDyv9rWDuuzi1IONHno5cKtA==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4cf04a06334b2fb84f8f2825b00ddb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4cf04a06334b2fb84f8f2825b00ddb9");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        final b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "51868dee88c4770792179192b4ffb6f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "51868dee88c4770792179192b4ffb6f5");
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("mids");
            String optString = jSONObject.optString("sessionType");
            short optInt = (short) jSONObject.optInt(RemoteMessageConst.Notification.CHANNEL_ID, 0);
            if (optJSONArray != null && optJSONArray.length() > 0 && !ac.a(optString)) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString2 = optJSONArray.optString(i);
                    if (!ac.a(optString2)) {
                        arrayList.add(Long.valueOf(Long.parseLong(optString2)));
                    }
                }
                ((a) IMClient.a().a(a.class)).a(arrayList, optInt, MessageUtils.pushChatTypeToCategory(optString), 0, new com.sankuai.xm.im.a<List<MsgAddition>>() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.14
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final /* synthetic */ void onSuccess(Object obj) {
                        List list = (List) obj;
                        Object[] objArr3 = {list};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "78fa4262047510b6a7619bb38ed0f1ac", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "78fa4262047510b6a7619bb38ed0f1ac");
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("additions", c.e(list));
                            bVar.a(jSONObject2);
                        } catch (JSONException e) {
                            bVar.a(-1, e.getMessage());
                        }
                    }

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final void onFailure(int i2, String str) {
                        Object[] objArr3 = {Integer.valueOf(i2), str};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "06a7cbf15d4b69c016c1443ba9cfc261", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "06a7cbf15d4b69c016c1443ba9cfc261");
                            return;
                        }
                        com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b bVar2 = bVar;
                        bVar2.a(i2, "QueryMsgAdditionJsHandler::exception info: message=" + str);
                    }
                });
                return;
            }
            bVar.a(10011, "messages param error");
        } catch (Throwable th) {
            com.sankuai.xm.im.bridge.base.util.a.c("getMessageByUUID exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
