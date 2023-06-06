package com.dianping.titans.js.jshandler;

import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.util.Log;
import com.dianping.titans.js.JsHost;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import com.sankuai.meituan.android.knb.util.WifiManagerProvider;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GetWifiInfoJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7741bd62e571b102510958c99a342ed2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7741bd62e571b102510958c99a342ed2");
            return;
        }
        try {
            JsHost jsHost = jsHost();
            if (jsHost == null) {
                jsCallbackErrorMsg("no host");
                return;
            }
            final String sceneToken = getSceneToken();
            TitansPermissionUtil.checkSelfPermission(jsHost.getActivity(), "Locate.once", sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.GetWifiInfoJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cae822da91889935e5a1a08dd62fe6e8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cae822da91889935e5a1a08dd62fe6e8");
                    } else if (!z) {
                        GetWifiInfoJsHandler getWifiInfoJsHandler = GetWifiInfoJsHandler.this;
                        getWifiInfoJsHandler.jsCallbackError(i, "no permission for Locate.once，sceneToken:" + sceneToken);
                    } else {
                        WifiInfo connectionInfo = new WifiManagerProvider(GetWifiInfoJsHandler.this.jsHost().getActivity().getApplicationContext(), sceneToken).getConnectionInfo();
                        if (connectionInfo == null) {
                            GetWifiInfoJsHandler.this.jsCallbackErrorMsg("no wifi connected");
                        } else if (connectionInfo.getSupplicantState() != SupplicantState.COMPLETED) {
                            GetWifiInfoJsHandler.this.jsCallbackErrorMsg("no valid wifi");
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put(Constants.PRIVACY.KEY_SSID, connectionInfo.getSSID());
                                jSONObject.put("mac", connectionInfo.getBSSID());
                                jSONObject.put("strength", connectionInfo.getRssi());
                                GetWifiInfoJsHandler.this.jsCallback(jSONObject);
                            } catch (Exception e) {
                                GetWifiInfoJsHandler.this.jsCallbackError(KNBJsErrorInfo.Error_8_System_Api.getErrorCode(), Log.getStackTraceString(e));
                            }
                        }
                    }
                }
            });
        } catch (Throwable th) {
            jsCallbackErrorMsg("inner err: " + th.getMessage());
        }
    }
}
