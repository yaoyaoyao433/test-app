package com.dianping.titans.js.jshandler;

import android.os.Build;
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
public class StopScanDataJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3124019b509ace92b5c5a58f69ae3c3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3124019b509ace92b5c5a58f69ae3c3f");
        } else if (Build.VERSION.SDK_INT < 21 || !BluetoothUtils.hasBLESystemFeature(jsHost().getContext())) {
            jsCallbackError(KNBJsErrorInfo.Error_7_Api_Not_Support);
        } else {
            final String sceneToken = getSceneToken();
            if (!BluetoothUtils.isLocationServiceEnable(jsHost().getContext(), sceneToken)) {
                jsCallbackError(TitansBleConstants.ERROR_CODE_LOCATION_SERVICE_OFF, "location service not enable sceneToken is " + sceneToken);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("Locate.once");
            arrayList.add(PermissionGuard.PERMISSION_BLUETOOTH);
            arrayList.add(PermissionGuard.PERMISSION_BLUETOOTH_ADMIN);
            TitansPermissionUtil.checkSelfPermission(jsHost().getActivity(), arrayList, sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.StopScanDataJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "eb7377488a485251f96046ac4a72fac4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "eb7377488a485251f96046ac4a72fac4");
                    } else if (!z) {
                        StopScanDataJsHandler stopScanDataJsHandler = StopScanDataJsHandler.this;
                        stopScanDataJsHandler.jsCallbackError(i, "permission not granted sceneToken is " + sceneToken);
                    } else if (!BluetoothUtils.isBluetoothServiceEnable(sceneToken)) {
                        StopScanDataJsHandler stopScanDataJsHandler2 = StopScanDataJsHandler.this;
                        stopScanDataJsHandler2.jsCallbackError(TitansBleConstants.ERROR_CODE_BLUETOOTH_SERVICE_OFF, "bluetooth not enable sceneToken is " + sceneToken);
                    } else if (!BluetoothUtils.isSupportBleScan(sceneToken)) {
                        StopScanDataJsHandler stopScanDataJsHandler3 = StopScanDataJsHandler.this;
                        stopScanDataJsHandler3.jsCallbackError(TitansBleConstants.ERROR_CODE_BLUETOOTH_SCAN_NOT_SUPPORT, "bluetooth scan not support sceneToken is " + sceneToken);
                    } else {
                        ScanParam scanParam = new ScanParam((StopScanDataJsHandler.this.jsBean().argsJson == null ? new JSONObject() : StopScanDataJsHandler.this.jsBean().argsJson).optString("serviceId"), 0);
                        if (!scanParam.isInValid()) {
                            StopScanDataJsHandler.this.jsCallbackError(KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid);
                            return;
                        }
                        try {
                            TitansBleManager.getInstance().stopScan(scanParam, sceneToken);
                            StopScanDataJsHandler.this.jsCallback();
                        } catch (Exception e) {
                            StopScanDataJsHandler.this.jsCallbackErrorMsg(Log.getStackTraceString(e));
                        }
                    }
                }
            });
        }
    }
}
