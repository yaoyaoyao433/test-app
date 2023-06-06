package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.a;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.im.vcard.d;
import com.sankuai.xm.im.vcard.h;
import com.sankuai.xm.integration.knb.result.b;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GetVCardsJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "IedTKCkNrGeVBfnijqx3RoCGsi6Bf/wELTwx9yxfKOTCXr+Xq6BieuejDssRQXm07ioZxxaL/HwqVLD3Uq7sLQ==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "750ea86df1322a55bbf83b658905c4fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "750ea86df1322a55bbf83b658905c4fe");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        final b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "53ccb41bca101323109c34d9d5b7c5ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "53ccb41bca101323109c34d9d5b7c5ff");
            return;
        }
        try {
            short c = c.c(jSONObject);
            final String optString = jSONObject.optString("type");
            JSONArray optJSONArray = jSONObject.optJSONArray("uids");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(Long.valueOf(optJSONArray.optLong(i)));
                }
            }
            h.a().b(d.a(arrayList, c.b(optString), c, 0L), new a<com.sankuai.xm.base.entity.a<com.sankuai.xm.im.vcard.entity.a, Long>>() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.15
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Object obj) {
                    com.sankuai.xm.base.entity.a aVar = (com.sankuai.xm.base.entity.a) obj;
                    Object[] objArr3 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b4de8df6844a30fa10f2b3c958d87043", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b4de8df6844a30fa10f2b3c958d87043");
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("vcards", c.a(aVar.a(), optString));
                        bVar.a(jSONObject2);
                    } catch (JSONException e) {
                        bVar.a(-1, e.getMessage());
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i2, String str) {
                    Object[] objArr3 = {Integer.valueOf(i2), str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "d649d0219de05ffa87d6cdd824d943ef", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "d649d0219de05ffa87d6cdd824d943ef");
                    } else {
                        bVar.a(i2, str);
                    }
                }
            });
        } catch (Throwable th) {
            com.sankuai.xm.im.bridge.base.util.a.c("getMessageByUUID exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
