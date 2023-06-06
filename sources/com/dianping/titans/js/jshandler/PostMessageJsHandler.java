package com.dianping.titans.js.jshandler;

import com.dianping.titans.js.KNBJsHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PostMessageJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1132959cc19300ba8243ae1c298aa2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1132959cc19300ba8243ae1c298aa2d");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        if (jSONObject == null) {
            jsCallbackErrorMsg("no args");
            return;
        }
        String optString = jSONObject.optString("type");
        if (jsHost() instanceof KNBJsHost) {
            ((KNBJsHost) jsHost()).onMessageReceive(optString, jSONObject.optJSONObject("data"));
            return;
        }
        jsCallbackErrorMsg("illegal type [" + optString + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
    }
}
