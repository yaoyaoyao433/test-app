package com.dianping.titans.ble;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelUuid;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.networklog.c;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.dianping.titans.utils.EventReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TitansBleManager {
    public static final int DEFAULT_ADVERTISING_TIMEOUT = 60000;
    public static final int DEFAULT_SCAN_TIME_OUT = 5000;
    public static final int MAX_ADVERTISING_TIMEOUT = 180000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile TitansBleManager sInstance;
    private final Map<AdvertisingInfo, AdvertiseCallback> advertiseCallbacks;
    private BluetoothLeAdvertiser bluetoothLeAdvertiser;
    private Handler mainHandler;
    private final Map<ScanParam, ScanCallback> scanCallbackMap;
    private final Map<AdvertisingInfo, TitansStopAdvertisingInfoRunnable> stopAdvertisingInfoRunnableMap;
    private final Map<ScanParam, TitansStopScanRunnable> stopScanRunnableMap;

    @RequiresApi(api = 21)
    public void startScan(ScanParam scanParam, BaseJsHandler baseJsHandler, final String str) throws Exception {
        Object[] objArr = {scanParam, baseJsHandler, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "628ab18096b2cd2bb7f4c7b87177621e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "628ab18096b2cd2bb7f4c7b87177621e");
            return;
        }
        stopScan(scanParam, str);
        c.a("startScan", 35, TitansBleConstants.LOGAN_BLE_TAG);
        Log.e(TitansBleConstants.TAG, "startScan");
        final WeakReference weakReference = new WeakReference(baseJsHandler);
        ScanCallback scanCallback = new ScanCallback() { // from class: com.dianping.titans.ble.TitansBleManager.1
            public static ChangeQuickRedirect changeQuickRedirect;
            private final Map<String, String> resultData = new HashMap();

            @Override // android.bluetooth.le.ScanCallback
            public void onScanFailed(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6ab7899dc2b56f1cc29d45b843b1cb76", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6ab7899dc2b56f1cc29d45b843b1cb76");
                    return;
                }
                super.onScanFailed(i);
                Log.e(TitansBleConstants.TAG, "onScanFailed: " + i);
                BlueToothProvider.stopScan(this, str);
                actionCallback(i, "scan failed: " + i);
            }

            @Override // android.bluetooth.le.ScanCallback
            @RequiresApi(api = 21)
            public void onScanResult(int i, ScanResult scanResult) {
                Object[] objArr2 = {Integer.valueOf(i), scanResult};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "54a2a60e178d1c9650a3ff96f7887225", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "54a2a60e178d1c9650a3ff96f7887225");
                    return;
                }
                Log.e(TitansBleConstants.TAG, "onScanResult");
                String address = scanResult.getDevice().getAddress();
                if (this.resultData.containsKey(address)) {
                    return;
                }
                List<ParcelUuid> serviceUuids = scanResult.getScanRecord() == null ? null : scanResult.getScanRecord().getServiceUuids();
                if (serviceUuids == null || serviceUuids.size() != 4) {
                    return;
                }
                String verifyUuid = BluetoothUtils.verifyUuid(serviceUuids);
                if (TextUtils.isEmpty(verifyUuid)) {
                    Log.e(TitansBleConstants.TAG, "verifyUuid null");
                    return;
                }
                this.resultData.put(address, verifyUuid);
                actionCallback(0, null);
            }

            public void actionCallback(int i, String str2) {
                Object[] objArr2 = {Integer.valueOf(i), str2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d2fbb25239594d564531e4cfc9443416", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d2fbb25239594d564531e4cfc9443416");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", "action");
                    jSONObject.put("errorCode", i);
                    jSONObject.put("errMsg", str2);
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, String> entry : this.resultData.entrySet()) {
                        jSONArray.put(entry.getValue());
                    }
                    jSONObject.put("datas", jSONArray);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                BaseJsHandler baseJsHandler2 = (BaseJsHandler) weakReference.get();
                if (baseJsHandler2 != null) {
                    baseJsHandler2.jsCallback(jSONObject);
                }
            }
        };
        BlueToothProvider.startScan(scanCallback, str);
        this.scanCallbackMap.put(scanParam, scanCallback);
        TitansStopScanRunnable titansStopScanRunnable = new TitansStopScanRunnable(scanParam, str);
        this.stopScanRunnableMap.put(scanParam, titansStopScanRunnable);
        getMainHandler().postDelayed(titansStopScanRunnable, scanParam.getTimeout());
    }

    @RequiresApi(api = 21)
    public void stopScan(ScanParam scanParam, String str) throws Exception {
        Object[] objArr = {scanParam, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "643891a43debb303e7c0f64573950f87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "643891a43debb303e7c0f64573950f87");
            return;
        }
        c.a("stopScan", 35, TitansBleConstants.LOGAN_BLE_TAG);
        Log.e(TitansBleConstants.TAG, "stopScan");
        TitansStopScanRunnable remove = this.stopScanRunnableMap.remove(scanParam);
        if (remove != null) {
            getMainHandler().removeCallbacks(remove);
        }
        ScanCallback remove2 = this.scanCallbackMap.remove(scanParam);
        if (remove2 != null) {
            BlueToothProvider.stopScan(remove2, str);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class TitansStopScanRunnable implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final ScanParam scanParam;
        private final String sceneToken;

        public TitansStopScanRunnable(ScanParam scanParam, String str) {
            Object[] objArr = {TitansBleManager.this, scanParam, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27af6ec8eec1d28a05dcdec8550dd83a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27af6ec8eec1d28a05dcdec8550dd83a");
                return;
            }
            this.scanParam = scanParam;
            this.sceneToken = str;
        }

        @Override // java.lang.Runnable
        @RequiresApi(api = 21)
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1a7e2db261736962d56b974ed40d1a5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1a7e2db261736962d56b974ed40d1a5");
                return;
            }
            c.a("Titans StopScanRunnable", 35, TitansBleConstants.LOGAN_BLE_TAG);
            Log.e(TitansBleConstants.TAG, "Titans StopScanRunnable");
            try {
                TitansBleManager.this.stopScan(this.scanParam, this.sceneToken);
            } catch (Exception e) {
                EventReporter.reportException("TitansStopScanRunnable", "", e);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class TitansStopAdvertisingInfoRunnable implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final AdvertisingInfo advertisingInfo;
        private final Context context;
        private final String sceneToken;

        public TitansStopAdvertisingInfoRunnable(@NonNull Context context, @NonNull AdvertisingInfo advertisingInfo, String str) {
            Object[] objArr = {TitansBleManager.this, context, advertisingInfo, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d47aace8e90b70fa81e16b95765f1b6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d47aace8e90b70fa81e16b95765f1b6");
                return;
            }
            this.context = context;
            this.advertisingInfo = advertisingInfo;
            this.sceneToken = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8504e8e5bf2927a91b5235c1fe68bcc6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8504e8e5bf2927a91b5235c1fe68bcc6");
                return;
            }
            c.a("Titans StopAdvertisingInfoRunnable", 35, TitansBleConstants.LOGAN_BLE_TAG);
            Log.e(TitansBleConstants.TAG, "Titans StopAdvertisingInfoRunnable");
            if (Build.VERSION.SDK_INT < 21) {
                return;
            }
            TitansBleManager.this.stopAdvertisingInfo(this.context, this.advertisingInfo, this.sceneToken);
        }
    }

    @RequiresApi(api = 21)
    public void startAdvertising(@NonNull Context context, AdvertisingInfo advertisingInfo, BaseJsHandler baseJsHandler, String str) {
        Object[] objArr = {context, advertisingInfo, baseJsHandler, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19159a01a1a7ca8f0b91a70a4ec568f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19159a01a1a7ca8f0b91a70a4ec568f7");
            return;
        }
        c.a("startAdvertising", 35, TitansBleConstants.LOGAN_BLE_TAG);
        Log.e(TitansBleConstants.TAG, "startAdvertising");
        BluetoothLeAdvertiser bluetoothLeAdvertiser = getBluetoothLeAdvertiser(context, str);
        if (bluetoothLeAdvertiser == null) {
            baseJsHandler.jsCallbackError(8, "bluetoothLeAdvertiser is null");
            return;
        }
        AdvertiseData createAdvertiseData = createAdvertiseData(advertisingInfo);
        if (createAdvertiseData == null) {
            baseJsHandler.jsCallbackError(KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid.getErrorCode(), "generateUUid failed");
            return;
        }
        stopAdvertisingInfo(context, advertisingInfo, str);
        final WeakReference weakReference = new WeakReference(baseJsHandler);
        AdvertiseCallback advertiseCallback = new AdvertiseCallback() { // from class: com.dianping.titans.ble.TitansBleManager.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.bluetooth.le.AdvertiseCallback
            public void onStartSuccess(AdvertiseSettings advertiseSettings) {
                Object[] objArr2 = {advertiseSettings};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d49e513b4d901c2f7c987add654e119b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d49e513b4d901c2f7c987add654e119b");
                    return;
                }
                super.onStartSuccess(advertiseSettings);
                c.a("onStartSuccess", 35, TitansBleConstants.LOGAN_BLE_TAG);
                Log.e(TitansBleConstants.TAG, "onStartSuccess");
                BaseJsHandler baseJsHandler2 = (BaseJsHandler) weakReference.get();
                if (baseJsHandler2 != null) {
                    baseJsHandler2.jsCallback();
                }
            }

            @Override // android.bluetooth.le.AdvertiseCallback
            public void onStartFailure(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "43991d1b0ebc5c45bf4a7d7d56ad1a9b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "43991d1b0ebc5c45bf4a7d7d56ad1a9b");
                    return;
                }
                String str2 = "";
                switch (i) {
                    case 1:
                        str2 = "Failed to start advertising as the advertise data to be broadcasted is larger than 31 bytes.";
                        break;
                    case 2:
                        str2 = "Failed to start advertising because no advertising instance is available.";
                        break;
                    case 3:
                        str2 = "Failed to start advertising as the advertising is already started";
                        break;
                    case 4:
                        str2 = "Operation failed due to an internal error";
                        break;
                    case 5:
                        str2 = "This feature is not supported on this platform";
                        break;
                }
                c.a("onStartFailure: " + str2, 35, TitansBleConstants.LOGAN_BLE_TAG);
                Log.e(TitansBleConstants.TAG, "onStartFailure: " + str2);
                BaseJsHandler baseJsHandler2 = (BaseJsHandler) weakReference.get();
                if (baseJsHandler2 != null) {
                    int errorCode = KNBJsErrorInfo.Error_8_System_Api.getErrorCode();
                    baseJsHandler2.jsCallbackError(errorCode, "code: " + i + " msg: " + str2);
                }
            }
        };
        bluetoothLeAdvertiser.startAdvertising(createAdvSettings(advertisingInfo.getTimeout()), createAdvertiseData, advertiseCallback);
        this.advertiseCallbacks.put(advertisingInfo, advertiseCallback);
        TitansStopAdvertisingInfoRunnable titansStopAdvertisingInfoRunnable = new TitansStopAdvertisingInfoRunnable(context.getApplicationContext(), advertisingInfo, str);
        this.stopAdvertisingInfoRunnableMap.put(advertisingInfo, titansStopAdvertisingInfoRunnable);
        getMainHandler().postDelayed(titansStopAdvertisingInfoRunnable, advertisingInfo.getTimeout());
    }

    @RequiresApi(api = 21)
    public void stopAdvertisingInfo(Context context, AdvertisingInfo advertisingInfo, String str) {
        Object[] objArr = {context, advertisingInfo, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fda0288dfb6b699d2aefefe359745d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fda0288dfb6b699d2aefefe359745d7");
            return;
        }
        c.a("stopAdvertisingInfo", 35, TitansBleConstants.LOGAN_BLE_TAG);
        Log.e(TitansBleConstants.TAG, "stopAdvertisingInfo");
        BluetoothLeAdvertiser bluetoothLeAdvertiser = getBluetoothLeAdvertiser(context, str);
        if (bluetoothLeAdvertiser == null) {
            return;
        }
        TitansStopAdvertisingInfoRunnable remove = this.stopAdvertisingInfoRunnableMap.remove(advertisingInfo);
        if (remove != null) {
            getMainHandler().removeCallbacks(remove);
        }
        AdvertiseCallback remove2 = this.advertiseCallbacks.remove(advertisingInfo);
        if (remove2 != null) {
            bluetoothLeAdvertiser.stopAdvertising(remove2);
        }
    }

    @RequiresApi(api = 21)
    private synchronized BluetoothLeAdvertiser getBluetoothLeAdvertiser(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b28fb156274adb1758fb2d52beab102", RobustBitConfig.DEFAULT_VALUE)) {
            return (BluetoothLeAdvertiser) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b28fb156274adb1758fb2d52beab102");
        }
        this.bluetoothLeAdvertiser = BlueToothProvider.getBluetoothLeAdvertiser(context, str);
        return this.bluetoothLeAdvertiser;
    }

    @RequiresApi(api = 21)
    private AdvertiseSettings createAdvSettings(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0880a7516a6f7896bd58759791aef8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (AdvertiseSettings) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0880a7516a6f7896bd58759791aef8a");
        }
        AdvertiseSettings.Builder builder = new AdvertiseSettings.Builder();
        builder.setConnectable(false);
        builder.setAdvertiseMode(2);
        builder.setTxPowerLevel(3);
        builder.setTimeout(i);
        return builder.build();
    }

    @RequiresApi(api = 21)
    public AdvertiseData createAdvertiseData(AdvertisingInfo advertisingInfo) {
        Object[] objArr = {advertisingInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f39df783636f0311b716c8c7eca2327f", RobustBitConfig.DEFAULT_VALUE)) {
            return (AdvertiseData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f39df783636f0311b716c8c7eca2327f");
        }
        List<ParcelUuid> generateUUid = BluetoothUtils.generateUUid(advertisingInfo.getData());
        if (generateUUid.size() != 4) {
            return null;
        }
        AdvertiseData.Builder includeDeviceName = new AdvertiseData.Builder().setIncludeDeviceName(false);
        for (ParcelUuid parcelUuid : generateUUid) {
            includeDeviceName.addServiceUuid(parcelUuid);
        }
        return includeDeviceName.build();
    }

    private synchronized Handler getMainHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01d8b6e7f0d523ffe09a09387af754ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (Handler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01d8b6e7f0d523ffe09a09387af754ba");
        }
        if (this.mainHandler == null) {
            this.mainHandler = new Handler(Looper.getMainLooper());
        }
        return this.mainHandler;
    }

    public static TitansBleManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "14afe80e09ec95a24344394eae195a19", RobustBitConfig.DEFAULT_VALUE)) {
            return (TitansBleManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "14afe80e09ec95a24344394eae195a19");
        }
        if (sInstance == null) {
            synchronized (TitansBleManager.class) {
                if (sInstance == null) {
                    sInstance = new TitansBleManager();
                }
            }
        }
        return sInstance;
    }

    public TitansBleManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23711212af0e78aae7c89ae8e52dc512", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23711212af0e78aae7c89ae8e52dc512");
            return;
        }
        this.advertiseCallbacks = new ConcurrentHashMap();
        this.stopAdvertisingInfoRunnableMap = new ConcurrentHashMap();
        this.scanCallbackMap = new ConcurrentHashMap();
        this.stopScanRunnableMap = new ConcurrentHashMap();
    }
}
