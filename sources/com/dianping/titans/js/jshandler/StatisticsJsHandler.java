package com.dianping.titans.js.jshandler;

import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class StatisticsJsHandler extends BaseJsHandler {
    public static final String METHOD = "lxlog";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "151f8091be5936322c118ae82c25500a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "151f8091be5936322c118ae82c25500a");
            return;
        }
        try {
            String JsToNative = Statistics.JsToNative(jsBean().argsJson.optString("data"));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", JsToNative);
            jsCallback(jSONObject);
        } catch (Exception e) {
            jsCallbackErrorMsg(e.getMessage());
        }
    }
}
