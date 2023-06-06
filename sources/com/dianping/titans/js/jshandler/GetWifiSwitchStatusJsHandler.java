package com.dianping.titans.js.jshandler;

import android.util.Log;
import com.dianping.titans.utils.WifiTools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.util.WifiManagerProvider;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GetWifiSwitchStatusJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53029822aee02ae4d71e31eee676c3ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53029822aee02ae4d71e31eee676c3ea");
            return;
        }
        try {
            boolean wifiState = new WifiTools(new WifiManagerProvider(jsHost().getActivity(), getSceneToken())).getWifiState();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wifiStatus", wifiState);
            jsCallback(jSONObject);
        } catch (JSONException e) {
            jsCallbackErrorMsg(Log.getStackTraceString(e));
        }
    }
}
