package com.sankuai.waimai.business.knb.bridge;

import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.g;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GetWMPoiAddress extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "TgfYJ7bgGLTi3H83EZqRMkP8ZhIW0fo5oncE3d4a23cXgfOWQspB2OBLYjxxNdg0GseIMUVfiHixU9acAvaVDA==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f4e912964c5a13137d93eb1b4c9e1f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f4e912964c5a13137d93eb1b4c9e1f1");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            WmAddress k = g.a().k();
            jSONObject.put(GearsLocator.ADDRESS, k != null ? k.getAddress() : "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        jsCallback(jSONObject);
    }
}
