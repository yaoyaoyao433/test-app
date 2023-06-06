package com.dianping.titans.js.jshandler;

import android.util.Log;
import com.dianping.titans.utils.WifiTools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import com.sankuai.meituan.android.knb.util.WifiManagerProvider;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ConnectWifiJsHandler extends BaseJsHandler {
    private static final String KEY_FORCE_CONNECT = "forceConnect";
    private static final String KEY_WIFI_NAME = "SSID";
    private static final String KEY_WIFI_PASSWORD = "password";
    public static ChangeQuickRedirect changeQuickRedirect;
    private WifiTools mWifiTools;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ab5ec8bf51b4b7ab02d4d8a96d51290", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ab5ec8bf51b4b7ab02d4d8a96d51290");
            return;
        }
        final String sceneToken = getSceneToken();
        this.mWifiTools = new WifiTools(new WifiManagerProvider(jsHost().getActivity(), sceneToken));
        if (!this.mWifiTools.isOpenLocation(sceneToken)) {
            jsCallbackError(new KNBJsErrorInfo(KNBJsErrorInfo.CODE_NO_PERMISSION, WifiTools.ERROR_INFO_WIFI_CLOSED));
        } else {
            TitansPermissionUtil.checkSelfPermission(jsHost().getActivity(), "Locate.once", sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.ConnectWifiJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4c050bf00bb5df0e97d3b2d5d2ec1475", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4c050bf00bb5df0e97d3b2d5d2ec1475");
                    } else if (z) {
                        try {
                            ConnectWifiJsHandler.this.mWifiTools.connectWifi(ConnectWifiJsHandler.this.jsBean().argsJson.isNull(ConnectWifiJsHandler.KEY_WIFI_NAME) ? null : ConnectWifiJsHandler.this.jsBean().argsJson.optString(ConnectWifiJsHandler.KEY_WIFI_NAME), ConnectWifiJsHandler.this.jsBean().argsJson.optString(ConnectWifiJsHandler.KEY_WIFI_PASSWORD), ConnectWifiJsHandler.this.jsBean().argsJson.optBoolean(ConnectWifiJsHandler.KEY_FORCE_CONNECT, false), new WifiTools.IConnectListener() { // from class: com.dianping.titans.js.jshandler.ConnectWifiJsHandler.1.1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // com.dianping.titans.utils.WifiTools.IConnectListener
                                public void onConnectSuccess() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "1111e2219d6ab5d427c96d99a9615085", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "1111e2219d6ab5d427c96d99a9615085");
                                    } else {
                                        ConnectWifiJsHandler.this.jsCallback();
                                    }
                                }

                                @Override // com.dianping.titans.utils.WifiTools.IConnectListener
                                public void onConnectFail(KNBJsErrorInfo kNBJsErrorInfo) {
                                    Object[] objArr3 = {kNBJsErrorInfo};
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "4566b508960fb2401633b661cca89c4e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "4566b508960fb2401633b661cca89c4e");
                                    } else {
                                        ConnectWifiJsHandler.this.jsCallbackError(kNBJsErrorInfo);
                                    }
                                }
                            });
                        } catch (Throwable th) {
                            ConnectWifiJsHandler connectWifiJsHandler = ConnectWifiJsHandler.this;
                            connectWifiJsHandler.jsCallbackErrorMsg("inner err: " + Log.getStackTraceString(th));
                        }
                    } else {
                        ConnectWifiJsHandler connectWifiJsHandler2 = ConnectWifiJsHandler.this;
                        connectWifiJsHandler2.jsCallbackError(i, "no permission for Location.once，sceneToken:" + sceneToken);
                    }
                }
            });
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb690db300d4aef6e0940d526e66c9cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb690db300d4aef6e0940d526e66c9cb");
            return;
        }
        super.onDestroy();
        if (this.mWifiTools != null) {
            this.mWifiTools.onDestroy();
        }
    }
}
