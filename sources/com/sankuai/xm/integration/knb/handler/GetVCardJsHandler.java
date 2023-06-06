package com.sankuai.xm.integration.knb.handler;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.a;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.vcard.d;
import com.sankuai.xm.im.vcard.db.VCard;
import com.sankuai.xm.im.vcard.h;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GetVCardJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "MnBQlfkbfw1tL25CpvMx9pvspDx4mXPO7YpBy4d8BiAEj2JU1KK+Rqksl4VCZr1yEBFLMTFRmcPDXKonzBWo2Q==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24cb0af670dfcc13f6dfb5312d1691a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24cb0af670dfcc13f6dfb5312d1691a6");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        final b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "fd3e53e4eb954b16067d4c363409da1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "fd3e53e4eb954b16067d4c363409da1a");
            return;
        }
        try {
            long a = ac.a(jSONObject.optString("uid"), 0L);
            ac.a(jSONObject.optString(Message.PEER_UID), 0L);
            short optInt = (short) jSONObject.optInt(RemoteMessageConst.Notification.CHANNEL_ID, -1);
            final String optString = jSONObject.optString("type");
            short b = c.b(optString);
            String optString2 = jSONObject.optString("uuid");
            String optString3 = jSONObject.optString(Message.SID, "");
            d a2 = d.a(a, b, optInt, optString2, b);
            a2.e = optString3;
            h.a().a(a2, new a<com.sankuai.xm.im.vcard.entity.a>() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.9
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Object obj) {
                    com.sankuai.xm.im.vcard.entity.a aVar = (com.sankuai.xm.im.vcard.entity.a) obj;
                    Object[] objArr3 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b782b427a11e635faa45a28574896f69", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b782b427a11e635faa45a28574896f69");
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(VCard.TABLE_NAME, c.a(aVar, optString));
                        bVar.a(jSONObject2);
                    } catch (Throwable th) {
                        com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b bVar2 = bVar;
                        bVar2.a(-1, "queryUIInfo exception:" + th);
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str) {
                    Object[] objArr3 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "336370b27ff1e64af686057fe3fad719", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "336370b27ff1e64af686057fe3fad719");
                    } else {
                        bVar.a(i, str);
                    }
                }
            });
        } catch (Throwable th) {
            com.sankuai.xm.im.bridge.base.util.a.c("getVCard exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
