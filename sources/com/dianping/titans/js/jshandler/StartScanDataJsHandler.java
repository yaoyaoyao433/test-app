package com.dianping.titans.js.jshandler;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;
import com.dianping.titans.ble.BluetoothUtils;
import com.dianping.titans.ble.ScanParam;
import com.dianping.titans.ble.TitansBleConstants;
import com.dianping.titans.ble.TitansBleManager;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import java.util.ArrayList;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class StartScanDataJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ScanParam mScanParam;

    public StartScanDataJsHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6199985d6e864fe515fb5d1492a1210", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6199985d6e864fe515fb5d1492a1210");
        } else {
            this.mScanParam = null;
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    @RequiresApi(api = 21)
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d09ad7e34f754a8fe810e757bfc3fdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d09ad7e34f754a8fe810e757bfc3fdb");
        } else if (Build.VERSION.SDK_INT < 21 || !BluetoothUtils.hasBLESystemFeature(jsHost().getContext())) {
            jsCallbackError(KNBJsErrorInfo.Error_7_Api_Not_Support);
        } else {
            final String sceneToken = getSceneToken();
            if (!BluetoothUtils.isLocationServiceEnable(jsHost().getContext(), getSceneToken())) {
                jsCallbackError(TitansBleConstants.ERROR_CODE_LOCATION_SERVICE_OFF, "location service not enable");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("Locate.once");
            arrayList.add(PermissionGuard.PERMISSION_BLUETOOTH);
            arrayList.add(PermissionGuard.PERMISSION_BLUETOOTH_ADMIN);
            TitansPermissionUtil.checkSelfPermission(jsHost().getActivity(), arrayList, getSceneToken(), new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.StartScanDataJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9131d3e74577444cfbd268bcd947b3d6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9131d3e74577444cfbd268bcd947b3d6");
                    } else if (!z) {
                        StartScanDataJsHandler startScanDataJsHandler = StartScanDataJsHandler.this;
                        startScanDataJsHandler.jsCallbackError(i, "permission not granted sceneToken is " + sceneToken);
                    } else if (!BluetoothUtils.isBluetoothServiceEnable(sceneToken)) {
                        StartScanDataJsHandler.this.jsCallbackError(TitansBleConstants.ERROR_CODE_BLUETOOTH_SERVICE_OFF, "bluetooth not enable");
                    } else if (!BluetoothUtils.isSupportBleScan(sceneToken)) {
                        StartScanDataJsHandler.this.jsCallbackError(TitansBleConstants.ERROR_CODE_BLUETOOTH_SCAN_NOT_SUPPORT, "bluetooth scan not support");
                    } else {
                        JSONObject jSONObject = StartScanDataJsHandler.this.jsBean().argsJson == null ? new JSONObject() : StartScanDataJsHandler.this.jsBean().argsJson;
                        ScanParam scanParam = new ScanParam(jSONObject.optString("serviceId"), jSONObject.optInt("timeout"));
                        if (scanParam.isInValid()) {
                            StartScanDataJsHandler.this.mScanParam = scanParam;
                            try {
                                TitansBleManager.getInstance().startScan(StartScanDataJsHandler.this.mScanParam, StartScanDataJsHandler.this, StartScanDataJsHandler.this.getSceneToken());
                                StartScanDataJsHandler.this.jsCallback();
                                return;
                            } catch (Exception e) {
                                StartScanDataJsHandler.this.jsCallbackError(8, Log.getStackTraceString(e));
                                return;
                            }
                        }
                        StartScanDataJsHandler.this.jsCallbackError(KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid.getErrorCode(), "serviceId is empty");
                    }
                }
            });
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    @RequiresApi(api = 21)
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "315046d3cbc6f6f3f3c8905bce0d1938", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "315046d3cbc6f6f3f3c8905bce0d1938");
        } else if (this.mScanParam == null) {
        } else {
            try {
                TitansBleManager.getInstance().stopScan(this.mScanParam, getSceneToken());
            } catch (Exception unused) {
            }
        }
    }
}
