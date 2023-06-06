package com.dianping.titans.js.jshandler;

import android.net.wifi.ScanResult;
import android.util.Log;
import com.dianping.titans.utils.WifiTools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import com.sankuai.meituan.android.knb.util.WifiManagerProvider;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GetWifiListJsHandler extends BaseJsHandler {
    private static final String KEY_FORCE_SCAN = "forceScan";
    public static ChangeQuickRedirect changeQuickRedirect;
    private WifiTools mWifiTools;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f26935f1dbcd0640ffd53f939811f9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f26935f1dbcd0640ffd53f939811f9a");
            return;
        }
        final String sceneToken = getSceneToken();
        this.mWifiTools = new WifiTools(new WifiManagerProvider(jsHost().getActivity(), sceneToken));
        if (!this.mWifiTools.isOpenLocation(sceneToken)) {
            jsCallbackError(new KNBJsErrorInfo(KNBJsErrorInfo.CODE_NO_PERMISSION, WifiTools.ERROR_INFO_WIFI_CLOSED));
        } else {
            TitansPermissionUtil.checkSelfPermission(jsHost().getActivity(), "Locate.once", sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.GetWifiListJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bf5d5cde0956d15d33cd1c8a13c465d1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bf5d5cde0956d15d33cd1c8a13c465d1");
                    } else if (z) {
                        GetWifiListJsHandler.this.mWifiTools.getWifiList(GetWifiListJsHandler.this.jsBean().argsJson.optBoolean(GetWifiListJsHandler.KEY_FORCE_SCAN, false), new WifiTools.IScanListener() { // from class: com.dianping.titans.js.jshandler.GetWifiListJsHandler.1.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // com.dianping.titans.utils.WifiTools.IScanListener
                            public void onScanResult(boolean z2, List<ScanResult> list) {
                                Object[] objArr3 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), list};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "5048d6e344ba97a2baa59990b6291f3b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "5048d6e344ba97a2baa59990b6291f3b");
                                    return;
                                }
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    JSONArray jSONArray = new JSONArray();
                                    for (ScanResult scanResult : list) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("SSID", scanResult.SSID);
                                        jSONObject2.put("signalStrength", scanResult.level);
                                        jSONArray.put(jSONObject2);
                                    }
                                    jSONObject.put("wifiList", jSONArray);
                                    GetWifiListJsHandler.this.jsCallback(jSONObject);
                                } catch (JSONException e) {
                                    GetWifiListJsHandler.this.jsCallbackErrorMsg(Log.getStackTraceString(e));
                                }
                            }
                        });
                    } else {
                        GetWifiListJsHandler getWifiListJsHandler = GetWifiListJsHandler.this;
                        getWifiListJsHandler.jsCallbackError(i, "no permission for Location.once，sceneToken:" + sceneToken);
                    }
                }
            });
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0667c447d688a2ea1a804851f4caa2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0667c447d688a2ea1a804851f4caa2a");
            return;
        }
        super.onDestroy();
        if (this.mWifiTools != null) {
            this.mWifiTools.onDestroy();
        }
    }
}
