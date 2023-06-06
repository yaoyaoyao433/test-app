package com.dianping.titans.utils;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBRuntime;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import com.sankuai.meituan.android.knb.util.LocationManagerProvider;
import com.sankuai.meituan.android.knb.util.WifiManagerProvider;
import com.sankuai.waimai.platform.utils.f;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class WifiTools {
    public static final int CODE_CONNECT_ERROR = 552;
    public static final int CODE_USER_DENIED = 550;
    public static final int CODE_WIFI_CLOSED = 553;
    public static final int CODE_WIFI_NOT_FIND = 551;
    public static final int CODE_WIFI_TIMEOUT = 554;
    public static final String ERROR_INFO_CONNECT_ERROR = "连接失败";
    public static final String ERROR_INFO_DENIED = "用户拒绝授权链接 Wi-Fi";
    public static final String ERROR_INFO_NO_PERMISSION = "location permission not granted";
    public static final String ERROR_INFO_PARAMS_INVALID = "参数无效";
    public static final String ERROR_INFO_WIFI_CLOSED = "wifi开关已关闭";
    public static final String ERROR_INFO_WIFI_NOT_FIND = "无效 SSID";
    public static final String ERROR_INFO_WIFI_TIMEOUT = "wifi连接超时";
    private static final String HARMONY_OS = "harmony";
    public static ChangeQuickRedirect changeQuickRedirect;
    private IConnectListener connectListener;
    private final Runnable connectTimeOutRunnable;
    private ConnectivityManager connectivityManager;
    private final WifiManagerProvider mWifiManagerProvider;
    private Handler mainHandler;
    private ConnectivityManager.NetworkCallback networkCallback;
    private WifiChangeReceiver wifiChangeReceiver;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface IConnectListener {
        void onConnectFail(KNBJsErrorInfo kNBJsErrorInfo);

        void onConnectSuccess();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface IConnectWifi {
        void onConnectWifi(String str, String str2, IConnectListener iConnectListener);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface IScanListener {
        void onScanResult(boolean z, List<ScanResult> list);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    interface WifiCapability {
        public static final int WIFI_CIPHER_NO_PASS = 3;
        public static final int WIFI_CIPHER_WEP = 1;
        public static final int WIFI_CIPHER_WPA = 2;
    }

    public WifiTools(WifiManagerProvider wifiManagerProvider) {
        Object[] objArr = {wifiManagerProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba959fd9c67437f0514de475772d948c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba959fd9c67437f0514de475772d948c");
            return;
        }
        this.connectTimeOutRunnable = new Runnable() { // from class: com.dianping.titans.utils.WifiTools.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c1b958f70613ba0c6c52854db668cff9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c1b958f70613ba0c6c52854db668cff9");
                } else if (WifiTools.this.connectListener != null) {
                    if (WifiTools.this.mainHandler != null) {
                        WifiTools.this.mainHandler.removeCallbacks(WifiTools.this.connectTimeOutRunnable);
                    }
                    WifiTools.this.connectListener.onConnectFail(new KNBJsErrorInfo(WifiTools.CODE_WIFI_TIMEOUT, WifiTools.ERROR_INFO_WIFI_TIMEOUT));
                    WifiTools.this.connectListener = null;
                }
            }
        };
        this.mWifiManagerProvider = wifiManagerProvider;
    }

    public Context getApp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a14e1eeed1130bfc116460c6539ecc87", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a14e1eeed1130bfc116460c6539ecc87") : this.mWifiManagerProvider.getContext();
    }

    public void connectWifi(String str, String str2, boolean z, IConnectListener iConnectListener) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), iConnectListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d3a4247a04c22c95927a650eee78c43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d3a4247a04c22c95927a650eee78c43");
        } else if (TextUtils.isEmpty(str)) {
            iConnectListener.onConnectFail(new KNBJsErrorInfo(521, ERROR_INFO_PARAMS_INVALID));
        } else {
            (z ? new ConnectASync() : new ConnectSync()).onConnectWifi(str, str2, iConnectListener);
        }
    }

    public void getWifiList(boolean z, IScanListener iScanListener) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), iScanListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7155d7bdec3b91400dd62930443b91e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7155d7bdec3b91400dd62930443b91e");
        } else if (z && Build.VERSION.SDK_INT >= 23) {
            getWifiListForceScan(iScanListener);
        } else {
            iScanListener.onScanResult(false, realGetWifiList());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class ConnectSync implements IConnectWifi {
        public static ChangeQuickRedirect changeQuickRedirect;

        public ConnectSync() {
            Object[] objArr = {WifiTools.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6492f72970ab5a3d25c14984a52e90cf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6492f72970ab5a3d25c14984a52e90cf");
            }
        }

        @Override // com.dianping.titans.utils.WifiTools.IConnectWifi
        public void onConnectWifi(String str, String str2, IConnectListener iConnectListener) {
            Object[] objArr = {str, str2, iConnectListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1847508d8fd3fe1615f47fca5bc741b6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1847508d8fd3fe1615f47fca5bc741b6");
            } else if (WifiTools.this.connectedIsCurrent(str)) {
                if (iConnectListener != null) {
                    iConnectListener.onConnectSuccess();
                }
            } else if (WifiTools.this.getWifiState()) {
                WifiTools.this.doConnectWifi(str, str2, WifiTools.this.realGetWifiList(), iConnectListener);
            } else {
                iConnectListener.onConnectFail(new KNBJsErrorInfo(553, WifiTools.ERROR_INFO_WIFI_CLOSED));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean connectedIsCurrent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52cdc1b83bd6fdb776332e12ca058cc4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52cdc1b83bd6fdb776332e12ca058cc4")).booleanValue();
        }
        try {
            WifiInfo connectionInfo = this.mWifiManagerProvider.getConnectionInfo();
            if (connectionInfo != null && SupplicantState.COMPLETED == connectionInfo.getSupplicantState()) {
                String ssid = connectionInfo.getSSID();
                if (!TextUtils.isEmpty(ssid) && !TextUtils.isEmpty(str)) {
                    if (str.equals(ssid.replace(CommonConstant.Symbol.DOUBLE_QUOTES, ""))) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class ConnectASync implements IConnectWifi {
        public static ChangeQuickRedirect changeQuickRedirect;

        public ConnectASync() {
            Object[] objArr = {WifiTools.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cda14e5835d0038d6b7d14d2f61fbec", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cda14e5835d0038d6b7d14d2f61fbec");
            }
        }

        @Override // com.dianping.titans.utils.WifiTools.IConnectWifi
        public void onConnectWifi(final String str, final String str2, final IConnectListener iConnectListener) {
            Object[] objArr = {str, str2, iConnectListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c4f5e92360e0a88b2858fa64feff6d0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c4f5e92360e0a88b2858fa64feff6d0");
            } else if (WifiTools.this.connectedIsCurrent(str)) {
                if (iConnectListener != null) {
                    iConnectListener.onConnectSuccess();
                }
            } else if (!WifiTools.this.openWifi()) {
                iConnectListener.onConnectFail(new KNBJsErrorInfo(550, WifiTools.ERROR_INFO_DENIED));
            } else {
                KNBRuntime.getRuntime().executeOnUIThread(new Runnable() { // from class: com.dianping.titans.utils.WifiTools.ConnectASync.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "576ab8ef9f8efa35e5151f286f97f295", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "576ab8ef9f8efa35e5151f286f97f295");
                        } else {
                            WifiTools.this.getWifiList(true, new IScanListener() { // from class: com.dianping.titans.utils.WifiTools.ConnectASync.1.1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // com.dianping.titans.utils.WifiTools.IScanListener
                                public void onScanResult(boolean z, List<ScanResult> list) {
                                    Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), list};
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "ea3f3c1e60b19a5574c73fdae8c3abeb", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "ea3f3c1e60b19a5574c73fdae8c3abeb");
                                    } else {
                                        WifiTools.this.doConnectWifi(str, str2, list, iConnectListener);
                                    }
                                }
                            });
                        }
                    }
                }, 100L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public void doConnectWifi(String str, String str2, List<ScanResult> list, IConnectListener iConnectListener) {
        Object[] objArr = {str, str2, list, iConnectListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0da4db4a98d9328694a8441061dfe054", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0da4db4a98d9328694a8441061dfe054");
            return;
        }
        ScanResult scanResult = null;
        try {
            Iterator<ScanResult> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ScanResult next = it.next();
                if (!TextUtils.isEmpty(str) && next != null && str.equals(next.SSID)) {
                    scanResult = next;
                    break;
                }
            }
            connectWifi(str, str2, iConnectListener, scanResult);
        } catch (Throwable th) {
            iConnectListener.onConnectFail(new KNBJsErrorInfo(-1, "connect error " + Log.getStackTraceString(th)));
        }
    }

    @SuppressLint({"MissingPermission"})
    private void connectWifi(String str, String str2, IConnectListener iConnectListener, ScanResult scanResult) {
        Object[] objArr = {str, str2, iConnectListener, scanResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f352d3ad90199782c4fbfa29097ecf32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f352d3ad90199782c4fbfa29097ecf32");
            return;
        }
        List<WifiConfiguration> configuredNetworks = this.mWifiManagerProvider.getConfiguredNetworks();
        if (configuredNetworks != null && !configuredNetworks.isEmpty()) {
            for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                if (wifiConfiguration != null && wifiConfiguration.SSID != null && str.equals(wifiConfiguration.SSID.replace(CommonConstant.Symbol.DOUBLE_QUOTES, ""))) {
                    if (this.mWifiManagerProvider.enableNetwork(wifiConfiguration.networkId, true)) {
                        connectStarted(iConnectListener);
                        return;
                    } else {
                        iConnectListener.onConnectFail(new KNBJsErrorInfo(552, ERROR_INFO_CONNECT_ERROR));
                        return;
                    }
                }
            }
        }
        if (scanResult == null) {
            iConnectListener.onConnectFail(new KNBJsErrorInfo(551, ERROR_INFO_WIFI_NOT_FIND));
            return;
        }
        int addNetwork = this.mWifiManagerProvider.addNetwork(createWifiConfig(str, scanResult.BSSID, str2, getWifiCipherType(scanResult.capabilities)));
        if (-1 != addNetwork) {
            if (this.mWifiManagerProvider.enableNetwork(addNetwork, true)) {
                connectStarted(iConnectListener);
                return;
            } else {
                iConnectListener.onConnectFail(new KNBJsErrorInfo(552, ERROR_INFO_CONNECT_ERROR));
                return;
            }
        }
        iConnectListener.onConnectFail(new KNBJsErrorInfo(552, ERROR_INFO_CONNECT_ERROR));
    }

    private void connectStarted(IConnectListener iConnectListener) {
        Object[] objArr = {iConnectListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30705960b4855e1943f2a7975eccd06c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30705960b4855e1943f2a7975eccd06c");
            return;
        }
        this.connectListener = iConnectListener;
        if (this.mainHandler == null) {
            this.mainHandler = new Handler(Looper.getMainLooper());
        }
        this.mainHandler.removeCallbacks(this.connectTimeOutRunnable);
        this.mainHandler.postDelayed(this.connectTimeOutRunnable, 10000L);
        registerWifiChangeReceiver();
    }

    private void registerWifiChangeReceiver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce45b8d2f123c32d7b4d3dc334ef50fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce45b8d2f123c32d7b4d3dc334ef50fd");
        } else if (this.wifiChangeReceiver == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            this.wifiChangeReceiver = new WifiChangeReceiver();
            getApp().registerReceiver(this.wifiChangeReceiver, intentFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class WifiChangeReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        public WifiChangeReceiver() {
            Object[] objArr = {WifiTools.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "997930b32416c0efcf88b2743696ae81", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "997930b32416c0efcf88b2743696ae81");
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetworkInfo networkInfo;
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52f895dca0f41c5c23b8abc60ab028e6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52f895dca0f41c5c23b8abc60ab028e6");
            } else if ("android.net.wifi.STATE_CHANGE".equals(intent.getAction()) && (networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo")) != null && networkInfo.getType() == 1 && networkInfo.isConnected() && WifiTools.this.connectListener != null) {
                if (WifiTools.this.mainHandler != null) {
                    WifiTools.this.mainHandler.removeCallbacks(WifiTools.this.connectTimeOutRunnable);
                }
                WifiTools.this.connectListener.onConnectSuccess();
                WifiTools.this.connectListener = null;
            }
        }
    }

    @RequiresApi(23)
    private void getWifiListForceScan(IScanListener iScanListener) {
        Object[] objArr = {iScanListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acbe204a1b93861e64b5b01447acd454", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acbe204a1b93861e64b5b01447acd454");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
        getApp().registerReceiver(new WifiScanResultListener(iScanListener), intentFilter);
        if (this.mWifiManagerProvider.startScan()) {
            return;
        }
        iScanListener.onScanResult(false, realGetWifiList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<ScanResult> realGetWifiList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49c3133d819b50b70f7621ae73ac69d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49c3133d819b50b70f7621ae73ac69d8");
        }
        HashSet hashSet = new HashSet();
        List<ScanResult> scanResults = this.mWifiManagerProvider.getScanResults();
        ArrayList arrayList = new ArrayList();
        if (scanResults != null && scanResults.size() > 0) {
            Collections.sort(scanResults, new Comparator<ScanResult>() { // from class: com.dianping.titans.utils.WifiTools.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.Comparator
                public int compare(ScanResult scanResult, ScanResult scanResult2) {
                    Object[] objArr2 = {scanResult, scanResult2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8107f8f13e0938672e4f5cfb2aeef991", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8107f8f13e0938672e4f5cfb2aeef991")).intValue();
                    }
                    if (scanResult == null && scanResult2 == null) {
                        return 0;
                    }
                    if (scanResult == null) {
                        return 1;
                    }
                    if (scanResult2 == null) {
                        return -1;
                    }
                    return scanResult2.level - scanResult.level;
                }
            });
            for (ScanResult scanResult : scanResults) {
                if (!TextUtils.isEmpty(scanResult.SSID) && !TextUtils.isEmpty(scanResult.BSSID) && !hashSet.contains(scanResult.BSSID)) {
                    hashSet.add(scanResult.BSSID);
                    arrayList.add(scanResult);
                }
            }
        }
        return arrayList;
    }

    @SuppressLint({"MissingPermission"})
    public WifiConfiguration createWifiConfig(String str, String str2, String str3, int i) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2069895854e1fe7da25a8c93b45cbf95", RobustBitConfig.DEFAULT_VALUE)) {
            return (WifiConfiguration) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2069895854e1fe7da25a8c93b45cbf95");
        }
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.allowedAuthAlgorithms.clear();
        wifiConfiguration.allowedGroupCiphers.clear();
        wifiConfiguration.allowedKeyManagement.clear();
        wifiConfiguration.allowedPairwiseCiphers.clear();
        wifiConfiguration.allowedProtocols.clear();
        wifiConfiguration.SSID = CommonConstant.Symbol.DOUBLE_QUOTES + str + CommonConstant.Symbol.DOUBLE_QUOTES;
        WifiConfiguration wifiConfiguration2 = null;
        List<WifiConfiguration> configurationList = this.mWifiManagerProvider.configurationList();
        if (configurationList != null) {
            Iterator<WifiConfiguration> it = configurationList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WifiConfiguration next = it.next();
                if (next != null && !TextUtils.isEmpty(next.SSID) && str.equals(next.SSID.replace(CommonConstant.Symbol.DOUBLE_QUOTES, ""))) {
                    wifiConfiguration2 = next;
                    break;
                }
            }
        }
        if (wifiConfiguration2 != null) {
            this.mWifiManagerProvider.removeNetwork(wifiConfiguration2.networkId);
            this.mWifiManagerProvider.saveConfiguration();
        }
        if (i == 3) {
            wifiConfiguration.allowedKeyManagement.set(0);
        } else if (i == 1) {
            wifiConfiguration.hiddenSSID = true;
            String[] strArr = wifiConfiguration.wepKeys;
            strArr[0] = CommonConstant.Symbol.DOUBLE_QUOTES + str3 + CommonConstant.Symbol.DOUBLE_QUOTES;
            wifiConfiguration.allowedAuthAlgorithms.set(1);
            wifiConfiguration.allowedGroupCiphers.set(3);
            wifiConfiguration.allowedGroupCiphers.set(2);
            wifiConfiguration.allowedGroupCiphers.set(0);
            wifiConfiguration.allowedGroupCiphers.set(1);
            wifiConfiguration.allowedKeyManagement.set(0);
            wifiConfiguration.wepTxKeyIndex = 0;
        } else if (i == 2) {
            wifiConfiguration.preSharedKey = CommonConstant.Symbol.DOUBLE_QUOTES + str3 + CommonConstant.Symbol.DOUBLE_QUOTES;
            wifiConfiguration.hiddenSSID = true;
            wifiConfiguration.allowedAuthAlgorithms.set(0);
            wifiConfiguration.allowedGroupCiphers.set(2);
            wifiConfiguration.allowedKeyManagement.set(1);
            wifiConfiguration.allowedPairwiseCiphers.set(1);
            wifiConfiguration.allowedGroupCiphers.set(3);
            wifiConfiguration.allowedPairwiseCiphers.set(2);
            wifiConfiguration.status = 2;
        }
        return wifiConfiguration;
    }

    public boolean openWifi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8f2f440d44003c44299f422ba259e90", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8f2f440d44003c44299f422ba259e90")).booleanValue();
        }
        if (!this.mWifiManagerProvider.isWifiEnabled()) {
            return this.mWifiManagerProvider.setWifiEnabled(true);
        }
        return this.mWifiManagerProvider.isWifiEnabled();
    }

    public boolean getWifiState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71ab7d9682a42bc6f6d8250ff9cc109c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71ab7d9682a42bc6f6d8250ff9cc109c")).booleanValue() : this.mWifiManagerProvider.isWifiEnabled();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class WifiScanResultListener extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;
        private IScanListener listener;

        public WifiScanResultListener(IScanListener iScanListener) {
            Object[] objArr = {WifiTools.this, iScanListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07d1207607613bf8d54f9e7384e50257", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07d1207607613bf8d54f9e7384e50257");
            } else {
                this.listener = iScanListener;
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ae7a9eccfaab8f1156480c9e7d44d5a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ae7a9eccfaab8f1156480c9e7d44d5a");
                return;
            }
            boolean a = f.a(intent, "resultsUpdated", false);
            if (this.listener != null) {
                this.listener.onScanResult(a, WifiTools.this.realGetWifiList());
                this.listener = null;
            }
            WifiTools.this.getApp().unregisterReceiver(this);
        }
    }

    public int getWifiCipherType(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "098fe83ac56784c40836c3dd68b2da12", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "098fe83ac56784c40836c3dd68b2da12")).intValue();
        }
        if (str.contains("WEP")) {
            return 1;
        }
        if (str.contains("PSK")) {
            return 2;
        }
        str.contains("WPS");
        return 3;
    }

    public boolean isOpenLocation(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3745668b722c677c271e2c93232bc6c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3745668b722c677c271e2c93232bc6c")).booleanValue() : LocationManagerProvider.isLocationServiceEnable(getApp(), str, false);
    }

    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "edf7d0ff64ec6bac3534452918564293", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "edf7d0ff64ec6bac3534452918564293");
            return;
        }
        if (this.wifiChangeReceiver != null) {
            try {
                getApp().unregisterReceiver(this.wifiChangeReceiver);
            } catch (Exception unused) {
            }
            this.wifiChangeReceiver = null;
        }
        if (Build.VERSION.SDK_INT < 21 || this.connectivityManager == null || this.networkCallback == null) {
            return;
        }
        this.connectivityManager.unregisterNetworkCallback(this.networkCallback);
    }

    public static boolean isHarmonyOS() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5adbc5639194606cd722a9dfdd41e492", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5adbc5639194606cd722a9dfdd41e492")).booleanValue();
        }
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            Method method = cls.getMethod("getOsBrand", new Class[0]);
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null && classLoader.getParent() == null) {
                return HARMONY_OS.equals(method.invoke(cls, new Object[0]));
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
