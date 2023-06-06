package com.meituan.android.common.statistics.mock;

import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class StatisticsJsHandler extends BaseJsHandler {
    public static final String METHOD = "lxlog";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94adc98f119dc93f9adc62bb766238b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94adc98f119dc93f9adc62bb766238b3");
            return;
        }
        try {
            String JsToNative = Statistics.JsToNative(jsBean().argsJson.optString("data").toString());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", JsToNative);
            jsCallback(jSONObject);
        } catch (Exception e) {
            jsCallbackErrorMsg(e.getMessage());
            LogUtil.e("statistics", "StatisticsJsHandler - exec for jsToNative: " + e.getMessage(), e);
        }
    }
}
