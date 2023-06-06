package io.agora.rtc.internal;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.DhcpInfo;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.meituan.android.privacy.aop.d;
import com.meituan.android.privacy.aop.e;
import com.meituan.robust.common.CommonConstant;
import io.agora.rtc.internal.RtcEngineMessage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class CommonUtility {
    private static final String TAG = "CommonUtility";
    private static final int VIDEO_SOURCE_TYPE_CUSTOMIZED = 2;
    private static final int VIDEO_SOURCE_TYPE_DEFAULT = 1;
    private static final int VIDEO_SOURCE_TYPE_EXTERNAL_DEPRECATED = 3;
    private static final int VIDEO_SOURCE_TYPE_NULL = 0;
    private static WeakReference<Application> mApplication;
    private volatile boolean mAccessible;
    private long mBridgeHandle;
    private WeakReference<Context> mContext;
    private AgoraPhoneStateListener mPhoneStateListener;
    private ConnectionChangeBroadcastReceiver mConnectionBroadcastReceiver = null;
    private BroadcastReceiver mOrientationObserver = null;
    private PowerConnectionReceiver mPowerConnectionReceiver = null;
    private int mMobileType = -1;
    private int batteryPercentage = 255;
    private int mOrientation = -1;
    private boolean mLocalVideoEnabled = false;
    private int mVideoSourceType = 1;
    private OrientationEventListener mOrientationListener = null;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class MobileType {
        public static final int Cdma = 1;
        public static final int Gsm = 0;
        public static final int Lte = 3;
        public static final int Unknown = -1;
        public static final int Wcdma = 2;
    }

    private static String getAndroidID(Context context) {
        return "";
    }

    private native void nativeAudioRoutingPhoneChanged(long j, boolean z, int i, int i2);

    private native int nativeNotifyNetworkChange(long j, byte[] bArr);

    private native int nativeNotifyOrientationChange(long j, int i);

    public CommonUtility(Context context, long j) {
        this.mAccessible = false;
        this.mPhoneStateListener = null;
        this.mBridgeHandle = 0L;
        this.mContext = new WeakReference<>(context);
        this.mBridgeHandle = j;
        try {
            this.mPhoneStateListener = new AgoraPhoneStateListener();
            ((TelephonyManager) context.getSystemService("phone")).listen(this.mPhoneStateListener, 288);
        } catch (Exception e) {
            Logging.e(TAG, "Unable to create PhoneStateListener, ", e);
        }
        monitorConnectionEvent(true);
        monitorPowerChange(true);
        monitorOrientationChange(context, true);
        this.mAccessible = true;
        Logging.i(TAG, "[init] done!");
    }

    public void destroy() {
        this.mAccessible = false;
        Context context = this.mContext.get();
        if (this.mPhoneStateListener != null && context != null) {
            ((TelephonyManager) context.getSystemService("phone")).listen(this.mPhoneStateListener, 0);
            this.mPhoneStateListener = null;
        }
        monitorConnectionEvent(false);
        monitorPowerChange(false);
        monitorOrientationChange(context, false);
        this.mContext.clear();
        Logging.i(TAG, "[destroy] done!");
    }

    public int getNetworkType() {
        Context context = this.mContext.get();
        if (context != null && this.mAccessible && checkAccessNetworkState(context)) {
            return Connectivity.getNetworkType(context);
        }
        return -1;
    }

    public byte[] getNetworkInfo() {
        RtcEngineMessage.MediaNetworkInfo doGetNetworkInfo;
        Context context = this.mContext.get();
        if (context == null || !this.mAccessible || (doGetNetworkInfo = doGetNetworkInfo(context)) == null) {
            return null;
        }
        return doGetNetworkInfo.marshall();
    }

    public int getBatteryLifePercent() {
        if (this.mContext.get() == null || !this.mAccessible) {
            return 255;
        }
        return this.batteryPercentage;
    }

    public void onPhoneStateChanged(boolean z, int i, int i2) {
        if (this.mBridgeHandle == 0 || !this.mAccessible) {
            return;
        }
        nativeAudioRoutingPhoneChanged(this.mBridgeHandle, z, i, i2);
    }

    public void monitorConnectionEvent(boolean z) {
        if (z) {
            if (this.mConnectionBroadcastReceiver == null) {
                try {
                    this.mConnectionBroadcastReceiver = new ConnectionChangeBroadcastReceiver(this);
                    Context context = this.mContext.get();
                    if (context == null || this.mConnectionBroadcastReceiver == null) {
                        return;
                    }
                    context.registerReceiver(this.mConnectionBroadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    return;
                } catch (Exception e) {
                    Logging.e(TAG, "Unable to create ConnectionChangeBroadcastReceiver, ", e);
                    return;
                }
            }
            return;
        }
        try {
            Context context2 = this.mContext.get();
            if (context2 != null && this.mConnectionBroadcastReceiver != null) {
                context2.unregisterReceiver(this.mConnectionBroadcastReceiver);
            }
        } catch (IllegalArgumentException unused) {
        }
        this.mConnectionBroadcastReceiver = null;
    }

    public void monitorPowerChange(boolean z) {
        if (z) {
            if (this.mPowerConnectionReceiver == null) {
                try {
                    this.mPowerConnectionReceiver = new PowerConnectionReceiver(this);
                    Context context = this.mContext.get();
                    if (context == null || this.mPowerConnectionReceiver == null) {
                        return;
                    }
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                    context.registerReceiver(this.mPowerConnectionReceiver, intentFilter);
                    return;
                } catch (Exception e) {
                    Logging.e(TAG, "Unable to create PowerConnectionReceiver, ", e);
                    return;
                }
            }
            return;
        }
        try {
            Context context2 = this.mContext.get();
            if (context2 != null && this.mPowerConnectionReceiver != null) {
                context2.unregisterReceiver(this.mPowerConnectionReceiver);
            }
        } catch (IllegalArgumentException unused) {
        }
        this.mPowerConnectionReceiver = null;
    }

    public void notifyNetworkChange() {
        byte[] networkInfo;
        if (this.mContext.get() == null || !this.mAccessible || (networkInfo = getNetworkInfo()) == null || !this.mAccessible) {
            return;
        }
        nativeNotifyNetworkChange(this.mBridgeHandle, networkInfo);
    }

    public void onPowerChange(int i) {
        if (this.mContext.get() == null || !this.mAccessible) {
            return;
        }
        this.batteryPercentage = i;
    }

    public int getFrontCameraIndex() {
        return DeviceUtils.selectFrontCamera();
    }

    public int getNumberOfCameras() {
        return DeviceUtils.getNumberOfCameras();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|2|3|(1:5)(15:53|(1:55)|7|(3:46|47|48)(1:9)|10|11|12|13|(1:15)|16|17|(1:19)|20|(2:22|(1:33))(2:35|(1:40))|34)|6|7|(0)(0)|10|11|12|13|(0)|16|17|(0)|20|(0)(0)|34|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
        io.agora.rtc.internal.Logging.e(io.agora.rtc.internal.CommonUtility.TAG, "get manufacturer info fail.");
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[Catch: Exception -> 0x0072, TryCatch #1 {Exception -> 0x0072, blocks: (B:19:0x004f, B:21:0x005b, B:22:0x005d), top: B:52:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int isSimulator() {
        /*
            r9 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = ""
            r2 = 28
            r3 = 0
            r4 = 1
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L45
            r6 = 26
            if (r5 >= r6) goto L12
            java.lang.String r5 = android.os.Build.SERIAL     // Catch: java.lang.Exception -> L45
        L10:
            r0 = r5
            goto L1b
        L12:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L45
            if (r5 > r2) goto L1b
            java.lang.String r5 = com.meituan.android.privacy.aop.d.a()     // Catch: java.lang.Exception -> L45
            goto L10
        L1b:
            java.lang.String r5 = r0.toLowerCase()     // Catch: java.lang.Exception -> L45
            java.lang.String r6 = "unknown"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Exception -> L45
            if (r5 == 0) goto L43
            java.lang.String r5 = io.agora.rtc.internal.CommonUtility.TAG     // Catch: java.lang.Exception -> L41
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L41
            java.lang.String r7 = "serial = "
            r6.<init>(r7)     // Catch: java.lang.Exception -> L41
            r6.append(r0)     // Catch: java.lang.Exception -> L41
            java.lang.String r7 = ", suspectCount = 1"
            r6.append(r7)     // Catch: java.lang.Exception -> L41
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L41
            io.agora.rtc.internal.Logging.i(r5, r6)     // Catch: java.lang.Exception -> L41
            r5 = 1
            goto L4d
        L41:
            r5 = 1
            goto L46
        L43:
            r5 = 0
            goto L4d
        L45:
            r5 = 0
        L46:
            java.lang.String r6 = io.agora.rtc.internal.CommonUtility.TAG
            java.lang.String r7 = "get serial info fail."
            io.agora.rtc.internal.Logging.e(r6, r7)
        L4d:
            java.lang.String r6 = android.os.Build.MANUFACTURER     // Catch: java.lang.Exception -> L71
            java.lang.String r1 = r6.toLowerCase()     // Catch: java.lang.Exception -> L72
            java.lang.String r7 = "netease"
            boolean r1 = r1.contains(r7)     // Catch: java.lang.Exception -> L72
            if (r1 == 0) goto L5d
            int r5 = r5 + 1
        L5d:
            java.lang.String r1 = io.agora.rtc.internal.CommonUtility.TAG     // Catch: java.lang.Exception -> L72
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L72
            java.lang.String r8 = "manufacturer = "
            r7.<init>(r8)     // Catch: java.lang.Exception -> L72
            r7.append(r6)     // Catch: java.lang.Exception -> L72
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L72
            io.agora.rtc.internal.Logging.i(r1, r7)     // Catch: java.lang.Exception -> L72
            goto L79
        L71:
            r6 = r1
        L72:
            java.lang.String r1 = io.agora.rtc.internal.CommonUtility.TAG
            java.lang.String r7 = "get manufacturer info fail."
            io.agora.rtc.internal.Logging.e(r1, r7)
        L79:
            boolean r1 = r9.isSimulatorProperty()
            if (r1 == 0) goto L81
            int r5 = r5 + 1
        L81:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 <= r2) goto Lb1
            java.lang.String r0 = "nokia"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto La2
            java.lang.String r0 = "Nokia_N1"
            java.lang.String r1 = android.os.Build.DEVICE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto La1
            java.lang.String r0 = "N1"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto La2
        La1:
            return r3
        La2:
            if (r5 <= 0) goto Lcc
            java.lang.String r0 = r6.toLowerCase()
            java.lang.String r1 = "welldo"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Lcc
            return r4
        Lb1:
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "unknown"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lbf
            if (r5 <= 0) goto Lcc
        Lbf:
            java.lang.String r0 = r6.toLowerCase()
            java.lang.String r1 = "welldo"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Lcc
            return r4
        Lcc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.internal.CommonUtility.isSimulator():int");
    }

    public int getAndroidVersion() {
        return Build.VERSION.SDK_INT;
    }

    public int isSpeakerphoneEnabled(Context context) {
        return (context != null && getAudioManager(context).isSpeakerphoneOn()) ? 1 : 0;
    }

    public static boolean canGetDefaultContext() {
        return Looper.myLooper() == Looper.getMainLooper() || Build.VERSION.SDK_INT >= 18;
    }

    private static String getAppPrivateStorageDir(Context context) {
        File externalFilesDir;
        if ("mounted".equals(Environment.getExternalStorageState()) && (externalFilesDir = context.getExternalFilesDir(null)) != null) {
            return externalFilesDir.getAbsolutePath();
        }
        return context.getFilesDir().getAbsolutePath();
    }

    public static byte[] getContextInfo(Context context) {
        if (context == null) {
            return null;
        }
        RtcEngineMessage.PAndroidContextInfo pAndroidContextInfo = new RtcEngineMessage.PAndroidContextInfo();
        pAndroidContextInfo.device = DeviceUtils.getDeviceId();
        pAndroidContextInfo.deviceInfo = DeviceUtils.getDeviceInfo();
        pAndroidContextInfo.systemInfo = DeviceUtils.getSystemInfo();
        pAndroidContextInfo.configDir = getAppPrivateStorageDir(context);
        pAndroidContextInfo.dataDir = context.getCacheDir().getAbsolutePath();
        pAndroidContextInfo.pluginDir = context.getApplicationInfo().nativeLibraryDir;
        pAndroidContextInfo.androidID = "";
        if (TextUtils.isEmpty(pAndroidContextInfo.device)) {
            pAndroidContextInfo.device = "";
        }
        if (TextUtils.isEmpty(pAndroidContextInfo.deviceInfo)) {
            pAndroidContextInfo.deviceInfo = "";
        }
        if (TextUtils.isEmpty(pAndroidContextInfo.systemInfo)) {
            pAndroidContextInfo.systemInfo = "";
        }
        if (TextUtils.isEmpty(pAndroidContextInfo.configDir)) {
            pAndroidContextInfo.configDir = "";
        }
        if (TextUtils.isEmpty(pAndroidContextInfo.dataDir)) {
            pAndroidContextInfo.dataDir = "";
        }
        if (TextUtils.isEmpty(pAndroidContextInfo.pluginDir)) {
            pAndroidContextInfo.pluginDir = "";
        }
        if (TextUtils.isEmpty(pAndroidContextInfo.androidID)) {
            pAndroidContextInfo.androidID = "";
        }
        return pAndroidContextInfo.marshall();
    }

    public static String[] getLocalHostList() {
        try {
            ArrayList<NetworkInterface> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            ArrayList<String> arrayList = new ArrayList();
            for (NetworkInterface networkInterface : list) {
                if (!networkInterface.getName().startsWith("usb")) {
                    for (InetAddress inetAddress : Collections.list(networkInterface.getInetAddresses())) {
                        String inetAddressToIpAddress = inetAddressToIpAddress(inetAddress);
                        if (inetAddressToIpAddress != null) {
                            arrayList.add(inetAddressToIpAddress);
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            String[] strArr = new String[arrayList.size()];
            int i = 0;
            for (String str : arrayList) {
                strArr[i] = str;
                i++;
            }
            return strArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getLocalHost() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (!networkInterface.getName().startsWith("usb")) {
                    for (InetAddress inetAddress : Collections.list(networkInterface.getInetAddresses())) {
                        String inetAddressToIpAddress = inetAddressToIpAddress(inetAddress);
                        if (inetAddressToIpAddress != null && !inetAddressToIpAddress.isEmpty()) {
                            return inetAddressToIpAddress;
                        }
                    }
                    continue;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getRandomUUID() {
        return UUID.randomUUID().toString().replace(CommonConstant.Symbol.MINUS, "").toUpperCase();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r4.toLowerCase().equals("intel") != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0159 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean isSimulatorProperty() {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.internal.CommonUtility.isSimulatorProperty():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateViewOrientation() {
        if (this.mContext.get() == null || !this.mAccessible) {
            Logging.e(TAG, "[updateViewOrientation] mContext is null or mAccessible is false!");
            return;
        }
        Display defaultDisplay = ((WindowManager) this.mContext.get().getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay == null) {
            Logging.e(TAG, "[updateViewOrientation] display is null!");
            return;
        }
        int rotation = defaultDisplay.getRotation();
        if (rotation == this.mOrientation) {
            return;
        }
        switch (rotation) {
            case 0:
                this.mOrientation = 0;
                nativeNotifyOrientationChange(this.mBridgeHandle, this.mOrientation);
                return;
            case 1:
                this.mOrientation = 1;
                nativeNotifyOrientationChange(this.mBridgeHandle, this.mOrientation);
                return;
            case 2:
                this.mOrientation = 2;
                nativeNotifyOrientationChange(this.mBridgeHandle, this.mOrientation);
                return;
            case 3:
                this.mOrientation = 3;
                nativeNotifyOrientationChange(this.mBridgeHandle, this.mOrientation);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkOrientation(int i) {
        if (i == -1 || !this.mAccessible) {
            return;
        }
        if (i > 340 || i < 20 || ((i > 70 && i < 110) || ((i > 160 && i < 200) || (i > 250 && i < 290)))) {
            updateViewOrientation();
        }
    }

    private void monitorOrientationChange(Context context, boolean z) {
        if (z) {
            enableOrientationListener(context);
            regiseterBroadcaster(context);
            return;
        }
        disableOrientationListener();
        unregisterBroadcaster(context);
    }

    private void enableOrientationListener(Context context) {
        try {
            if (this.mOrientationListener == null) {
                this.mOrientationListener = new OrientationEventListener(context, 2) { // from class: io.agora.rtc.internal.CommonUtility.1
                    @Override // android.view.OrientationEventListener
                    public void onOrientationChanged(int i) {
                        if (i == -1) {
                            return;
                        }
                        CommonUtility.this.checkOrientation(i);
                    }
                };
            }
            this.mOrientationListener.enable();
            Logging.i(TAG, "[enableOrientationListener] done!");
        } catch (Exception e) {
            Logging.e(TAG, "Unable to create OrientationEventListener, ", e);
        }
    }

    private void disableOrientationListener() {
        if (this.mOrientationListener != null) {
            this.mOrientationListener.disable();
            this.mOrientationListener = null;
            Logging.i(TAG, "[disableOrientationListener] done!");
            return;
        }
        Logging.e(TAG, "[disableOrientationListener] mOrientationListener is null!");
    }

    private void regiseterBroadcaster(Context context) {
        if (context == null) {
            return;
        }
        this.mOrientationObserver = new BroadcastReceiver() { // from class: io.agora.rtc.internal.CommonUtility.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent.getAction().equals("android.intent.action.CONFIGURATION_CHANGED") && CommonUtility.this.mAccessible) {
                    CommonUtility.this.updateViewOrientation();
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
        context.registerReceiver(this.mOrientationObserver, intentFilter);
        Logging.i(TAG, "[regiseterBroadcaster] done!");
    }

    private void unregisterBroadcaster(Context context) {
        if (context == null || this.mOrientationObserver == null) {
            return;
        }
        context.unregisterReceiver(this.mOrientationObserver);
        Logging.i(TAG, "[unregisterBroadcaster] done!");
    }

    private AudioManager getAudioManager(Context context) {
        if (context == null) {
            return null;
        }
        return (AudioManager) context.getSystemService("audio");
    }

    private static String getSystemProperty(String str) throws Exception {
        Class<?> cls = Class.forName("android.os.SystemProperties");
        return (String) cls.getMethod("get", String.class).invoke(cls, str);
    }

    private static boolean checkAccessNetworkState(Context context) {
        return context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
    }

    private RtcEngineMessage.MediaNetworkInfo doGetNetworkInfo(Context context) {
        InetAddress intToInetAddress;
        if (context == null || !this.mAccessible) {
            return null;
        }
        RtcEngineMessage.MediaNetworkInfo mediaNetworkInfo = new RtcEngineMessage.MediaNetworkInfo();
        if (!checkAccessNetworkState(context)) {
            mediaNetworkInfo.ssid = "";
            mediaNetworkInfo.bssid = "";
            mediaNetworkInfo.rssi = 0;
            mediaNetworkInfo.signalLevel = 0;
            mediaNetworkInfo.frequency = 0;
            mediaNetworkInfo.linkspeed = 0;
            return mediaNetworkInfo;
        }
        String localHost = getLocalHost();
        if (localHost != null) {
            mediaNetworkInfo.localIp4 = localHost;
        }
        NetworkInfo networkInfo = Connectivity.getNetworkInfo(context);
        mediaNetworkInfo.networkType = Connectivity.getNetworkType(networkInfo);
        if (networkInfo != null) {
            mediaNetworkInfo.networkSubtype = networkInfo.getSubtype();
        }
        mediaNetworkInfo.dnsList = Connectivity.getDnsList();
        if (mediaNetworkInfo.networkType == 2) {
            if (!checkAccessWifiState(context)) {
                mediaNetworkInfo.ssid = "";
                mediaNetworkInfo.bssid = "";
                mediaNetworkInfo.rssi = 0;
                mediaNetworkInfo.signalLevel = 0;
                mediaNetworkInfo.frequency = 0;
                mediaNetworkInfo.linkspeed = 0;
                return mediaNetworkInfo;
            }
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
            if (dhcpInfo != null && (intToInetAddress = intToInetAddress(dhcpInfo.gateway)) != null) {
                mediaNetworkInfo.gatewayIp4 = intToInetAddress.getHostAddress();
            }
            WifiInfo c = e.c(wifiManager);
            if (c != null) {
                mediaNetworkInfo.ssid = "";
                mediaNetworkInfo.bssid = "";
                mediaNetworkInfo.rssi = c.getRssi();
                mediaNetworkInfo.signalLevel = WifiManager.calculateSignalLevel(mediaNetworkInfo.rssi, 5);
                mediaNetworkInfo.linkspeed = c.getLinkSpeed();
                if (Build.VERSION.SDK_INT >= 21) {
                    int frequency = c.getFrequency();
                    mediaNetworkInfo.frequency = frequency;
                    if (frequency >= 5000) {
                        mediaNetworkInfo.networkSubtype = 101;
                    } else if (frequency >= 2400) {
                        mediaNetworkInfo.networkSubtype = 100;
                    }
                }
            }
        } else if (this.mPhoneStateListener != null) {
            mediaNetworkInfo.rssi = this.mPhoneStateListener.getRssi();
            mediaNetworkInfo.signalLevel = this.mPhoneStateListener.getLevel();
            mediaNetworkInfo.asu = this.mPhoneStateListener.getAsuLevel();
        } else {
            if (context.checkCallingOrSelfPermission(Build.VERSION.SDK_INT >= 29 ? "android.permission.ACCESS_FINE_LOCATION" : "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                getSignalStrength(context, mediaNetworkInfo);
            }
        }
        return mediaNetworkInfo;
    }

    private static String inetAddressToIpAddress(InetAddress inetAddress) {
        if (inetAddress.isLoopbackAddress() || !(inetAddress instanceof Inet4Address)) {
            return null;
        }
        return ((Inet4Address) inetAddress).getHostAddress();
    }

    private static boolean checkAccessWifiState(Context context) {
        return context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_WIFI_STATE") == 0;
    }

    private static InetAddress intToInetAddress(int i) {
        try {
            return InetAddress.getByAddress(new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)});
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    @TargetApi(17)
    private boolean getSignalStrength(Context context, RtcEngineMessage.MediaNetworkInfo mediaNetworkInfo) {
        CellInfo cellInfo;
        CellSignalStrengthLte cellSignalStrength;
        CellSignalStrengthCdma cellSignalStrength2;
        CellSignalStrengthGsm cellSignalStrength3;
        if (context == null || Build.VERSION.SDK_INT < 17) {
            this.mMobileType = -1;
            return false;
        }
        List<CellInfo> i = d.i((TelephonyManager) context.getSystemService("phone"));
        if (i == null || i.isEmpty() || (cellInfo = i.get(0)) == null) {
            return false;
        }
        try {
            if ((this.mMobileType == -1 || this.mMobileType == 0) && (cellSignalStrength3 = ((CellInfoGsm) cellInfo).getCellSignalStrength()) != null) {
                this.mMobileType = 0;
                mediaNetworkInfo.rssi = cellSignalStrength3.getDbm();
                mediaNetworkInfo.signalLevel = cellSignalStrength3.getLevel();
                mediaNetworkInfo.asu = cellSignalStrength3.getAsuLevel();
                return true;
            }
        } catch (Exception unused) {
            this.mMobileType = -1;
        }
        try {
            if ((this.mMobileType == -1 || this.mMobileType == 1) && (cellSignalStrength2 = ((CellInfoCdma) cellInfo).getCellSignalStrength()) != null) {
                this.mMobileType = 1;
                mediaNetworkInfo.rssi = cellSignalStrength2.getDbm();
                mediaNetworkInfo.signalLevel = cellSignalStrength2.getLevel();
                mediaNetworkInfo.asu = cellSignalStrength2.getAsuLevel();
                return true;
            }
        } catch (Exception unused2) {
            this.mMobileType = -1;
        }
        try {
            if (this.mMobileType == -1 || this.mMobileType == 2) {
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                CellSignalStrengthWcdma cellSignalStrength4 = ((CellInfoWcdma) cellInfo).getCellSignalStrength();
                if (cellSignalStrength4 != null) {
                    this.mMobileType = 2;
                    mediaNetworkInfo.rssi = cellSignalStrength4.getDbm();
                    mediaNetworkInfo.signalLevel = cellSignalStrength4.getLevel();
                    mediaNetworkInfo.asu = cellSignalStrength4.getAsuLevel();
                    return true;
                }
            }
        } catch (Exception unused3) {
            this.mMobileType = -1;
        }
        try {
            if ((this.mMobileType == -1 || this.mMobileType == 3) && (cellSignalStrength = ((CellInfoLte) cellInfo).getCellSignalStrength()) != null) {
                this.mMobileType = 3;
                mediaNetworkInfo.rssi = cellSignalStrength.getDbm();
                mediaNetworkInfo.signalLevel = cellSignalStrength.getLevel();
                mediaNetworkInfo.asu = cellSignalStrength.getAsuLevel();
                return true;
            }
        } catch (Exception unused4) {
            this.mMobileType = -1;
        }
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public class AgoraPhoneStateListener extends PhoneStateListener {
        private SignalStrength mSignalStrenth;
        private boolean phoneStatusNeedResume = false;

        public AgoraPhoneStateListener() {
        }

        public int getRssi() {
            if (Build.VERSION.SDK_INT <= 28) {
                return invokeMethod("getDbm");
            }
            return 0;
        }

        public int getLevel() {
            return invokeMethod("getLevel");
        }

        public int getAsuLevel() {
            if (Build.VERSION.SDK_INT <= 28) {
                return invokeMethod("getAsuLevel");
            }
            return 0;
        }

        private int invokeMethod(String str) {
            Method declaredMethod;
            try {
                if (this.mSignalStrenth != null && (declaredMethod = this.mSignalStrenth.getClass().getDeclaredMethod(str, new Class[0])) != null) {
                    return ((Integer) declaredMethod.invoke(this.mSignalStrenth, new Object[0])).intValue();
                }
            } catch (Exception unused) {
            }
            return 0;
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            if (((Context) CommonUtility.this.mContext.get()) == null || !CommonUtility.this.mAccessible) {
                return;
            }
            super.onSignalStrengthsChanged(signalStrength);
            this.mSignalStrenth = signalStrength;
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            if (((Context) CommonUtility.this.mContext.get()) == null || !CommonUtility.this.mAccessible) {
                return;
            }
            super.onCallStateChanged(i, str);
            switch (i) {
                case 0:
                    if (this.phoneStatusNeedResume) {
                        this.phoneStatusNeedResume = false;
                        Logging.i(CommonUtility.TAG, "system phone call end delay 1000ms");
                        new Handler().postDelayed(new Runnable() { // from class: io.agora.rtc.internal.CommonUtility.AgoraPhoneStateListener.1
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    CommonUtility.this.onPhoneStateChanged(true, 22, 0);
                                } catch (Exception e) {
                                    Logging.e(CommonUtility.TAG, "fail to resume ", e);
                                }
                            }
                        }, 1000L);
                        return;
                    }
                    return;
                case 1:
                    Logging.i(CommonUtility.TAG, "system phone call ring");
                    this.phoneStatusNeedResume = true;
                    CommonUtility.this.onPhoneStateChanged(false, 22, 1);
                    return;
                case 2:
                    Logging.i(CommonUtility.TAG, "system phone call start");
                    this.phoneStatusNeedResume = true;
                    CommonUtility.this.onPhoneStateChanged(false, 22, 2);
                    return;
                default:
                    return;
            }
        }
    }

    private static String getAppStorageDir(Context context) {
        if (context != null) {
            if (context.checkCallingOrSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                return "/sdcard/" + context.getApplicationInfo().packageName;
            }
            Logging.w(TAG, "read external storage is not granted");
            return null;
        }
        return null;
    }

    private void checkVoipPermissions(Context context, String str) throws SecurityException {
        if (context == null || context.checkCallingOrSelfPermission(str) != 0) {
            throw new SecurityException(str + " is not granted");
        }
    }

    private void checkVoipPermissions(Context context) throws SecurityException {
        checkVoipPermissions(context, "android.permission.INTERNET");
        checkVoipPermissions(context, "android.permission.RECORD_AUDIO");
        checkVoipPermissions(context, "android.permission.MODIFY_AUDIO_SETTINGS");
        if (this.mVideoSourceType == 1 && this.mLocalVideoEnabled) {
            checkVoipPermissions(context, "android.permission.CAMERA");
        }
    }

    private int checkVoipPermissions(Context context, int i) {
        switch (i) {
            case 1:
                try {
                    checkVoipPermissions(context);
                    return 0;
                } catch (SecurityException e) {
                    Logging.e(TAG, "Do not have enough permission! ", e);
                    return -9;
                }
            case 2:
                try {
                    checkVoipPermissions(context, "android.permission.INTERNET");
                    return 0;
                } catch (SecurityException unused) {
                    Logging.e(TAG, "Do not have Internet permission!");
                    return -9;
                }
            default:
                return -2;
        }
    }

    private String getAssetsCacheFile(Context context, String str) {
        String str2 = TAG;
        Logging.i(str2, "getAssetsCacheFile filePath: " + str);
        try {
            File file = new File(context.getCacheDir(), "wm_" + str.replace(File.separator, CommonConstant.Symbol.UNDERLINE));
            if (file.exists()) {
                file.delete();
            }
            InputStream open = context.getAssets().open(str);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    open.close();
                    return file.getAbsolutePath();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void updateLocalVideoEnableState(boolean z) {
        String str = TAG;
        Logging.d(str, "updateLocalVideoEnableState: " + z);
        this.mLocalVideoEnabled = z;
    }

    public void updateVideoSourceType(int i) {
        String str = TAG;
        Logging.d(str, "updateVideoSourceType: " + i);
        this.mVideoSourceType = i;
    }
}
