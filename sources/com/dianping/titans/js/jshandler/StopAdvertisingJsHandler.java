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
public class StopAdvertisingJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49c283a28b192c5b139835b25713a7fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49c283a28b192c5b139835b25713a7fb");
        } else if (Build.VERSION.SDK_INT < 21 || !BluetoothUtils.hasBLESystemFeature(jsHost().getContext())) {
            jsCallbackError(KNBJsErrorInfo.Error_7_Api_Not_Support);
        } else {
            final String sceneToken = getSceneToken();
            if (!BluetoothUtils.isLocationServiceEnable(jsHost().getContext(), sceneToken)) {
                jsCallbackError(TitansBleConstants.ERROR_CODE_LOCATION_SERVICE_OFF, "location service not enable");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("Locate.once");
            arrayList.add(PermissionGuard.PERMISSION_BLUETOOTH);
            arrayList.add(PermissionGuard.PERMISSION_BLUETOOTH_ADMIN);
            TitansPermissionUtil.checkSelfPermission(jsHost().getActivity(), arrayList, sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.StopAdvertisingJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ccd4b9da90d910d934ea5a9e538b9618", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ccd4b9da90d910d934ea5a9e538b9618");
                    } else if (!z) {
                        StopAdvertisingJsHandler stopAdvertisingJsHandler = StopAdvertisingJsHandler.this;
                        stopAdvertisingJsHandler.jsCallbackError(i, "permission not granted sceneToken is " + sceneToken);
                    } else if (!BluetoothUtils.isBluetoothServiceEnable(sceneToken)) {
                        StopAdvertisingJsHandler.this.jsCallbackError(TitansBleConstants.ERROR_CODE_BLUETOOTH_SERVICE_OFF, "bluetooth not enable");
                    } else if (!BluetoothUtils.isSupportBleAdvertising(sceneToken)) {
                        StopAdvertisingJsHandler.this.jsCallbackError(TitansBleConstants.ERROR_CODE_BLUETOOTH_ADVERTISING_NOT_SUPPORT, "bluetooth advertising not support");
                    } else {
                        AdvertisingInfo advertisingInfo = new AdvertisingInfo(null, (StopAdvertisingJsHandler.this.jsBean().argsJson == null ? new JSONObject() : StopAdvertisingJsHandler.this.jsBean().argsJson).optString("serviceId"), 0);
                        if (!advertisingInfo.isValid(false)) {
                            StopAdvertisingJsHandler.this.jsCallbackError(KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid);
                            return;
                        }
                        TitansBleManager.getInstance().stopAdvertisingInfo(StopAdvertisingJsHandler.this.jsHost().getContext(), advertisingInfo, sceneToken);
                        StopAdvertisingJsHandler.this.jsCallback();
                    }
                }
            });
        }
    }
}
