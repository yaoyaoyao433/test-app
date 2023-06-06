package com.dianping.titans.js.jshandler;

import android.os.Build;
import com.dianping.titans.ble.AdvertisingInfo;
import com.dianping.titans.ble.BluetoothUtils;
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
public class StartAdvertisingJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private AdvertisingInfo args;

    public StartAdvertisingJsHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84f7df104cdfbb2eb37a2baa77d6892d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84f7df104cdfbb2eb37a2baa77d6892d");
        } else {
            this.args = null;
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afca1b31fe64e1c99cad5f920871f594", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afca1b31fe64e1c99cad5f920871f594");
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
            TitansPermissionUtil.checkSelfPermission(jsHost().getActivity(), arrayList, sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.StartAdvertisingJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1ce39e24569e01b8db76aa4528f1ef41", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1ce39e24569e01b8db76aa4528f1ef41");
                    } else if (!z) {
                        StartAdvertisingJsHandler startAdvertisingJsHandler = StartAdvertisingJsHandler.this;
                        startAdvertisingJsHandler.jsCallbackError(i, "permission not granted sceneToken is " + sceneToken);
                    } else if (!BluetoothUtils.isBluetoothServiceEnable(sceneToken)) {
                        StartAdvertisingJsHandler startAdvertisingJsHandler2 = StartAdvertisingJsHandler.this;
                        startAdvertisingJsHandler2.jsCallbackError(TitansBleConstants.ERROR_CODE_BLUETOOTH_SERVICE_OFF, "bluetooth not enable sceneToken is " + sceneToken);
                    } else if (!BluetoothUtils.isSupportBleAdvertising(sceneToken)) {
                        StartAdvertisingJsHandler startAdvertisingJsHandler3 = StartAdvertisingJsHandler.this;
                        startAdvertisingJsHandler3.jsCallbackError(TitansBleConstants.ERROR_CODE_BLUETOOTH_ADVERTISING_NOT_SUPPORT, "bluetooth advertising not support sceneToken is " + sceneToken);
                    } else {
                        JSONObject jSONObject = StartAdvertisingJsHandler.this.jsBean().argsJson == null ? new JSONObject() : StartAdvertisingJsHandler.this.jsBean().argsJson;
                        StartAdvertisingJsHandler.this.args = new AdvertisingInfo(jSONObject.optString("data"), jSONObject.optString("serviceId"), jSONObject.optInt("timeout"));
                        if (StartAdvertisingJsHandler.this.args.isValid(true)) {
                            TitansBleManager.getInstance().startAdvertising(StartAdvertisingJsHandler.this.jsHost().getContext(), StartAdvertisingJsHandler.this.args, StartAdvertisingJsHandler.this, sceneToken);
                        } else {
                            StartAdvertisingJsHandler.this.jsCallbackError(KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid);
                        }
                    }
                }
            });
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6a687a2c67c40354a3eb09ed15684d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6a687a2c67c40354a3eb09ed15684d0");
        } else if (Build.VERSION.SDK_INT >= 21 && this.args != null && this.args.isValid(true)) {
            TitansBleManager.getInstance().stopAdvertisingInfo(jsHost().getContext(), this.args, getSceneToken());
        }
    }
}
