package com.dianping.titans.js.jshandler;

import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GetResultJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d236d83916eed1a9161fbcd9ce8bcf60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d236d83916eed1a9161fbcd9ce8bcf60");
            return;
        }
        JSONObject result = jsHost().getResult();
        if (result != null) {
            jsCallback(result);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", BaseRaptorUploader.ERROR_UNLOAD_SCRIPT);
            jSONObject.put("status", "fail");
            jSONObject.put("errorMsg", StringUtil.NULL);
        } catch (JSONException unused) {
        }
        jsCallback(jSONObject);
    }
}
