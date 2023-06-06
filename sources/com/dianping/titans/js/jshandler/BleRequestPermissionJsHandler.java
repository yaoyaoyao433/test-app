package com.dianping.titans.js.jshandler;

import android.app.Activity;
import android.os.Build;
import com.dianping.titans.ble.BluetoothUtils;
import com.dianping.titans.ble.TitansBleConstants;
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
public class BleRequestPermissionJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean readonly;
    private String sceneToken;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c249cafd1f3fc827ad280767eaa68a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c249cafd1f3fc827ad280767eaa68a0");
            return;
        }
        Activity activity = jsHost().getActivity();
        if (activity == null || activity.isFinishing()) {
            jsCallbackError(KNBJsErrorInfo.Error_5_Container_Type_Not_Support);
        } else if (Build.VERSION.SDK_INT < 21 || !BluetoothUtils.hasBLESystemFeature(jsHost().getContext())) {
            jsCallbackError(KNBJsErrorInfo.Error_7_Api_Not_Support);
        } else {
            this.readonly = (jsBean().argsJson == null ? new JSONObject() : jsBean().argsJson).optBoolean("readonly", false);
            this.sceneToken = getSceneToken();
            ArrayList arrayList = new ArrayList();
            arrayList.add("Locate.once");
            arrayList.add(PermissionGuard.PERMISSION_BLUETOOTH);
            arrayList.add(PermissionGuard.PERMISSION_BLUETOOTH_ADMIN);
            if (!BluetoothUtils.isLocationServiceEnable(activity, this.sceneToken)) {
                jsCallbackError(TitansBleConstants.ERROR_CODE_LOCATION_SERVICE_OFF, "location service not enable");
            } else if (this.readonly) {
                TitansPermissionUtil.checkSelfPermission(activity, arrayList, this.sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.BleRequestPermissionJsHandler.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.result.IRequestPermissionCallback
                    public void onResult(boolean z, int i) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4033eb8e11dde09b04a5153cd6f59c22", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4033eb8e11dde09b04a5153cd6f59c22");
                        } else if (z) {
                            if (!BluetoothUtils.isBluetoothServiceEnable(BleRequestPermissionJsHandler.this.sceneToken)) {
                                BleRequestPermissionJsHandler.this.jsCallbackError(TitansBleConstants.ERROR_CODE_BLUETOOTH_SERVICE_OFF, "bluetooth not enable");
                            } else {
                                BleRequestPermissionJsHandler.this.jsCallback();
                            }
                        } else {
                            BleRequestPermissionJsHandler bleRequestPermissionJsHandler = BleRequestPermissionJsHandler.this;
                            bleRequestPermissionJsHandler.jsCallbackError(i, "permission not granted code is " + i + "sceneToken is " + BleRequestPermissionJsHandler.this.sceneToken);
                        }
                    }
                });
            } else {
                TitansPermissionUtil.requestPermissions(activity, arrayList, this.sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.BleRequestPermissionJsHandler.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.result.IRequestPermissionCallback
                    public void onResult(boolean z, int i) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2f40f026583420e1b5f02d084cb10589", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2f40f026583420e1b5f02d084cb10589");
                        } else if (z) {
                            if (!BluetoothUtils.isBluetoothServiceEnable(BleRequestPermissionJsHandler.this.sceneToken)) {
                                BleRequestPermissionJsHandler.this.jsCallbackError(TitansBleConstants.ERROR_CODE_BLUETOOTH_SERVICE_OFF, "bluetooth not enable");
                            } else {
                                BleRequestPermissionJsHandler.this.jsCallback();
                            }
                        } else {
                            BleRequestPermissionJsHandler bleRequestPermissionJsHandler = BleRequestPermissionJsHandler.this;
                            bleRequestPermissionJsHandler.jsCallbackError(i, "permission not granted code is " + i + "sceneToken is " + BleRequestPermissionJsHandler.this.sceneToken);
                        }
                    }
                });
            }
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void jsCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bc548e3f78259963f6359429a459725", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bc548e3f78259963f6359429a459725");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                String sceneToken = getSceneToken();
                jSONObject.put("isSupportBleAdvertising", BluetoothUtils.isSupportBleAdvertising(sceneToken));
                jSONObject.put("isSupportBleScan", BluetoothUtils.isSupportBleScan(sceneToken));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        jsCallback(jSONObject);
    }
}
