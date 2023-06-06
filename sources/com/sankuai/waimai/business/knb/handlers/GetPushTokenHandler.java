package com.sankuai.waimai.business.knb.handlers;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.services.a;
import com.sankuai.waimai.platform.b;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GetPushTokenHandler extends TakeoutBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3166a1b9a1172f1bc977ac282f4e1c02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3166a1b9a1172f1bc977ac282f4e1c02");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        String D = PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "b4a618addf970b8125189b6ba72e5829", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "b4a618addf970b8125189b6ba72e5829") : b.A().D();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("push_token", D);
            jsCallback(jSONObject);
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }
}
