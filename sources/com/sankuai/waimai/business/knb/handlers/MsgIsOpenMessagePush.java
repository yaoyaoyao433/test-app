package com.sankuai.waimai.business.knb.handlers;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.utils.d;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MsgIsOpenMessagePush extends TakeoutBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de0101c6446d3956acc26c860350b149", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de0101c6446d3956acc26c860350b149");
            return;
        }
        boolean a = d.a(jsHost().getActivity());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isOpen", a);
            jsCallback(jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
