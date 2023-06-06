package com.meituan.android.common.unionid.oneid.util;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.common.unionid.oneid.OneIdPrivacyHelper;
import com.meituan.android.common.unionid.oneid.appid.DeviceInfoInvoker;
import com.meituan.android.common.unionid.oneid.cache.OneIdSharePref;
import com.meituan.android.common.unionid.oneid.log.LogManager;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.android.common.unionid.oneid.statstics.StatUtil;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.d;
import com.meituan.android.privacy.interfaces.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AppUtil {
    private static final String CALLTIMES = "calltimes";
    private static final long DAY_OF_TIME_PERIOD = 86400000;
    public static final String DEFAULT_IMEI = "000000000000000";
    private static final long LIMIT_LOG_REPORT_COUNT = 8000;
    private static final String TAG = "AppUtil";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile int currentApiIndex = -1;
    private static final Map<String, String> idCache = new ConcurrentHashMap();
    private static volatile boolean isCheckOncePersmission = false;
    private static volatile boolean isForeGround = false;
    private static volatile boolean isGrantPhonePermission = false;
    private static boolean isOpenTakeTurns = true;
    private static volatile boolean isRegisterPermissionCallback = false;
    private static long lastCollectTime = -1;
    private static volatile String newTransFerInfo = "";
    private static String wlanMac;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class Cache {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        public static volatile String mAndroidId = "";
        public static volatile String mAppCanaryRelease = "";
        public static volatile String mAppChannel = "";
        public static volatile String mAppName = "";
        public static volatile String mAppVersion = "";
        public static volatile String mBootId = "";
        public static volatile String mBootIdRandomTime = "";
        public static volatile String mBootIdTime = "";
        public static volatile String mCtType = "";
        public static volatile long mFirstInstallTime = -1;
        public static volatile String mHarmonyClassLoader = "";
        public static volatile String mHarmonyDeviceType = "";
        public static volatile String mHarmonyEmuiVersion = "";
        public static volatile String mHarmonyOsBrand = "";
        public static volatile long mLastUpdateTime = -1;
        public static volatile String mLocalId = "";
        public static volatile String mPackageName = "";
        public static volatile String mSimulateId = "";
        public static volatile String mUuid = "";
        public static volatile String mWifiIPAddress = "";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class CacheKey {
        public static final String ANDROID_ID = "local_AId";
        public static final String BLUE_MAC = "bluemac";
        public static final String DEVICEID = "deviceid";
        public static final String DPID_TRANSFER_INFO = "dpidTransferInfo";
        public static final String IMEI = "imei";
        public static final String LINE1NUMBER = "line1number";
        public static final String MEID = "meid";
        public static final String P2P_MAC = "p2pmac";
        public static final String SAFESIMOPERATOR = "safeSimOperator";
        public static final String SERIAL = "serial";
        public static final String SIMOPERATOR = "simOperator";
        public static final String SIMSERIALNUMBER = "simSerialNumber";
        public static final String SUBSCRIBERID = "subscriberid";
        public static final String UNIONID_TRANSFER_INFO = "unionidTransferInfo";
        public static final String UUID_TRANSFER_INFO = "uuidTransferInfo";
        public static final String VOICE_MAIL_NUMBER = "voiceMailNumber";
        public static final String WIFI_MAC = "wifimac";
        public static final String WIFI_MAC1 = "wifimac1";
        public static final String WIFI_MAC2 = "wifimac2";
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    @Deprecated
    public static String getAdId(Context context) {
        return "";
    }

    @Deprecated
    public static String getBootId() {
        return "";
    }

    public static String getBootIdRandomTime() {
        return "";
    }

    public static String getBootIdTime() {
        return "";
    }

    public static String getDPID(Context context) {
        return "";
    }

    @Deprecated
    public static String getIPAddress(Context context) {
        return "";
    }

    public static String getLine1Number(Context context) {
        return "";
    }

    public static String getOS(Context context) {
        return "android";
    }

    public static String getSdkVersion(Context context) {
        return "1.20.7";
    }

    @Deprecated
    public static int getSimCount(Context context, StatUtil statUtil) {
        return 0;
    }

    @Deprecated
    public static String getUnionId(Context context) {
        return "";
    }

    public static String getUserId(Context context) {
        return "";
    }

    public static String getVoiceMailNumber(Context context) {
        return "";
    }

    public static boolean isExceedReportCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7ae0601b2431e4bf08dea5f672ae58c7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7ae0601b2431e4bf08dea5f672ae58c7")).booleanValue() : ((long) i) >= LIMIT_LOG_REPORT_COUNT;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class Lock {
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final Object mImeiLock = new Object();
        private static final Object mImei1Lock = new Object();
        private static final Object mImei2Lock = new Object();
        private static final Object mDeviceIdLock = new Object();
        private static final Object mDeviceId1Lock = new Object();
        private static final Object mMeid1Lock = new Object();
        private static final Object mImsiLock = new Object();
        private static final Object mImsi1Lock = new Object();
        private static final Object mIcccidLock = new Object();
        private static final Object mSerialLock = new Object();
        private static final Object mVoiceMailNumberLock = new Object();
        private static final Object mWifiMacLock = new Object();
        private static final Object mP2pMacLock = new Object();
        private static final Object mWifiMac1Lock = new Object();
        private static final Object mWifiMac2Lock = new Object();
        private static final Object mBlueMacLock = new Object();
        private static final Object mNewTransferinfoLock = new Object();
        private static final Object mSimoperatorLock = new Object();
        private static final Object mSaveSimoperatorLock = new Object();
        private static final Object mAndroidIdLock = new Object();
    }

    public static void setIsForeground(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "00a3d042d057177944f04900ba71fc9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "00a3d042d057177944f04900ba71fc9a");
            return;
        }
        isForeGround = z;
        if (!z || OneIdHandler.getContext() == null) {
            return;
        }
        if (ContextCompat.checkSelfPermission(OneIdHandler.getContext(), "android.permission.READ_PHONE_STATE") == 0) {
            isGrantPhonePermission = true;
        } else {
            isGrantPhonePermission = false;
        }
    }

    public static void setIsOpenTakeTurns(boolean z) {
        isOpenTakeTurns = z;
    }

    public static boolean isForeground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d899888d023b7e40b50b65d71692e96e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d899888d023b7e40b50b65d71692e96e")).booleanValue();
        }
        if (LifecycleManager.isRegistered) {
            return LifecycleManager.isForeground();
        }
        return isForeGround;
    }

    public static void initDeviceInfo(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fadea85da56ef2c431e2210d6c07ddc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fadea85da56ef2c431e2210d6c07ddc8");
            return;
        }
        getIMEI1(context);
        getIMEI2(context);
        if (Build.VERSION.SDK_INT >= 26) {
            getMeid(context, 0);
            getMeid(context, 1);
        }
        getIMSI(context, 0);
        getIMSI(context, 1);
        getICCID(context);
        getSerial(context);
        e createPermissionGuard = Privacy.createPermissionGuard();
        if (createPermissionGuard != null) {
            isRegisterPermissionCallback = true;
            createPermissionGuard.a(PermissionGuard.PERMISSION_PHONE_READ, new d() { // from class: com.meituan.android.common.unionid.oneid.util.AppUtil.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str, int i) {
                    Object[] objArr2 = {str, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fd69cee6e7e4f023aec7e3aae8fee1d6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fd69cee6e7e4f023aec7e3aae8fee1d6");
                        return;
                    }
                    LogUtils.i("deviceId", " permissionGuard onResult:" + i);
                    if (i > 0) {
                        boolean unused = AppUtil.isGrantPhonePermission = true;
                    }
                }
            });
        }
        LogManager.getInstance(context).logToken();
    }

    public static synchronized String getLocalId(Context context) {
        synchronized (AppUtil.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e9722802c4bcb25ade47d3507a8f6890", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e9722802c4bcb25ade47d3507a8f6890");
            }
            String localIdWrapped = getLocalIdWrapped(context);
            String localUUID = getLocalUUID(context, null);
            String string = context.getSharedPreferences(context.getPackageName(), 0).getString("dpid", "");
            if (TextUtils.isEmpty(localUUID) && TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(DeviceInfo.LOCAL_ID, localIdWrapped);
                    jSONObject.put("package", getPackageName(context));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                LogMonitor.watch(LogMonitor.LOCALID_ILLEGAL_CALL, "", jSONObject);
            }
            return localIdWrapped;
        }
    }

    public static synchronized String getLocalIdForLX(Context context) {
        synchronized (AppUtil.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "00436dfa8bd95ac19d0a82043b284356", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "00436dfa8bd95ac19d0a82043b284356");
            }
            return getLocalIdWrapped(context);
        }
    }

    public static synchronized String getLocalIdWrapped(Context context) {
        synchronized (AppUtil.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bad5fa876ef7ea352502dbb6cd584743", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bad5fa876ef7ea352502dbb6cd584743");
            }
            return getLocalIdWrapped(context, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x017b A[Catch: all -> 0x01d2, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x001e, B:10:0x0026, B:13:0x0030, B:14:0x0038, B:17:0x003c, B:19:0x0044, B:21:0x004c, B:23:0x0061, B:24:0x0066, B:28:0x0078, B:92:0x01ce, B:27:0x0075, B:22:0x0057, B:68:0x0140, B:70:0x0159, B:71:0x015e, B:75:0x016c, B:77:0x0175, B:79:0x017b, B:81:0x0187, B:83:0x0190, B:85:0x01a5, B:84:0x019b, B:86:0x01ac, B:89:0x01b5, B:91:0x01c6, B:90:0x01bc, B:74:0x0169, B:69:0x014f), top: B:100:0x0004, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.String getLocalIdWrapped(android.content.Context r14, com.meituan.android.common.unionid.oneid.statstics.StatUtil r15) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.unionid.oneid.util.AppUtil.getLocalIdWrapped(android.content.Context, com.meituan.android.common.unionid.oneid.statstics.StatUtil):java.lang.String");
    }

    public static String getApp(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6dfb09f39e452a6d45d408c598a5c912", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6dfb09f39e452a6d45d408c598a5c912") : getApplicationName(context);
    }

    public static String getVersion(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "563739177af8e50e897ba5134578f8c9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "563739177af8e50e897ba5134578f8c9") : getApplicationVersion(context);
    }

    public static String getSimulatedId(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "741a5d6128d84105801ba4f72b92f989", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "741a5d6128d84105801ba4f72b92f989");
        }
        if (!TextUtils.isEmpty(Cache.mSimulateId)) {
            return Cache.mSimulateId;
        }
        String simulatedDeviceId = OneIdSharePref.getInstance(context).getSimulatedDeviceId();
        if (TextUtils.isEmpty(simulatedDeviceId)) {
            simulatedDeviceId = getSimulatedIdFromOs(context);
        }
        if (!TextUtils.isEmpty(simulatedDeviceId)) {
            OneIdSharePref.getInstance(context).setSimulatedDeviceId(simulatedDeviceId);
        }
        Cache.mSimulateId = simulatedDeviceId;
        return simulatedDeviceId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v2, types: [byte[]] */
    public static String getSimulatedIdFromOs(Context context) {
        MessageDigest messageDigest;
        int i;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        byte[] bArr = 0;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d63db6db1c14cf5b66e0a7a876d0fb92", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d63db6db1c14cf5b66e0a7a876d0fb92");
        }
        try {
            if (((TelephonyManager) context.getSystemService("phone")) != null && isForeground() && ActivityCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                return getIMSI(context);
            }
            if (!TextUtils.isEmpty(null)) {
                return bArr.trim();
            }
            String str = "35" + (Build.BOARD.length() % 10) + (Build.BRAND.length() % 10) + (Build.CPU_ABI.length() % 10) + (Build.DEVICE.length() % 10) + (Build.DISPLAY.length() % 10) + (Build.HOST.length() % 10) + (Build.ID.length() % 10) + (Build.MANUFACTURER.length() % 10) + (Build.MODEL.length() % 10) + (Build.PRODUCT.length() % 10) + (Build.TAGS.length() % 10) + (Build.TYPE.length() % 10) + (Build.USER.length() % 10);
            String androidId = getAndroidId(context);
            if (TextUtils.isEmpty(wlanMac)) {
                wlanMac = getWifiMac(context);
            }
            String str2 = ((String) null) + str + androidId + wlanMac + ((String) null);
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (Throwable unused) {
                messageDigest = null;
            }
            if (messageDigest != null) {
                messageDigest.update(str2.getBytes(), 0, str2.length());
                bArr = messageDigest.digest();
            }
            if (bArr != 0) {
                String str3 = "";
                for (char c : bArr) {
                    if ((c & 255) <= 15) {
                        str3 = str3 + "0";
                    }
                    str3 = str3 + Integer.toHexString(i);
                }
                String upperCase = str3.toUpperCase();
                if (upperCase.length() > 15) {
                    upperCase = upperCase.substring(0, 15);
                }
                return upperCase.trim();
            }
            return "";
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String getLocalUUID(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e80df7dcb4513884f02f7beb1562f504", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e80df7dcb4513884f02f7beb1562f504") : getLocalUUID(context, null);
    }

    public static String getLocalUUID(Context context, StatUtil statUtil) {
        Object[] objArr = {context, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bbc8b95c65c1d7077b61f16c706da7b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bbc8b95c65c1d7077b61f16c706da7b8");
        }
        if (UuidHelper.checkUUIDValid(Cache.mUuid)) {
            if (statUtil != null) {
                statUtil.markStat("uuid", 129);
            }
            return Cache.mUuid;
        }
        String uUIDFromLocal = UuidHelper.getUUIDFromLocal(context, statUtil);
        Cache.mUuid = uUIDFromLocal;
        return uUIDFromLocal;
    }

    public static String getOSVersion(Context context) {
        return Build.VERSION.RELEASE == null ? "unknown" : Build.VERSION.RELEASE;
    }

    public static String getOSName(Context context) {
        return Build.DISPLAY == null ? "unknown" : Build.DISPLAY;
    }

    public static String getClientType(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "09b91a71fc8fe8c5713f8040c1c5b2e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "09b91a71fc8fe8c5713f8040c1c5b2e9");
        }
        if (TextUtils.isEmpty(Cache.mCtType)) {
            if (context != null) {
                try {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    double sqrt = Math.sqrt(Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d) + Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d));
                    String valueOf = String.valueOf((int) sqrt);
                    try {
                        Cache.mCtType = valueOf;
                        new StringBuilder("getClientType: inch").append(sqrt);
                        return valueOf;
                    } catch (Throwable unused) {
                        return valueOf;
                    }
                } catch (Throwable unused2) {
                    return "unkonwn";
                }
            }
            return "unkonwn";
        }
        return Cache.mCtType;
    }

    public static String getBootId1() {
        FileInputStream fileInputStream;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        FileInputStream fileInputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8edb7e8325897d9e45a2961fe4a257d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8edb7e8325897d9e45a2961fe4a257d3");
        }
        if (!TextUtils.isEmpty(Cache.mBootId)) {
            LogUtils.i("bootid_test", Cache.mBootId);
            return Cache.mBootId;
        }
        StringBuilder sb = new StringBuilder();
        File file = new File("/proc/sys/kernel/random/boot_id");
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!file.exists()) {
            LogUtils.i("Error", "文件不存在");
            return "";
        }
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
            fileInputStream = fileInputStream2;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                sb.append(new String(bArr, 0, read));
            }
            fileInputStream.close();
            fileInputStream.close();
        } catch (Exception e3) {
            e = e3;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            Cache.mBootId = sb.toString().replace("\n", "");
            return sb.toString().replace("\n", "");
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
        Cache.mBootId = sb.toString().replace("\n", "");
        return sb.toString().replace("\n", "");
    }

    public static String getDeviceModel(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1cbe722ebeb5ead3ae64ed892b56f115", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1cbe722ebeb5ead3ae64ed892b56f115") : TextUtils.isEmpty(Build.MODEL) ? "unknown" : Build.MODEL;
    }

    public static String getBrand(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3dde7b573a68c33f1f79fa9e159a128b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3dde7b573a68c33f1f79fa9e159a128b") : TextUtils.isEmpty(Build.BRAND) ? getManufacture(context) : Build.BRAND;
    }

    public static String getManufacture(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0438cfb6042b5e005e159db4dfcf6d9f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0438cfb6042b5e005e159db4dfcf6d9f") : TextUtils.isEmpty(Build.MANUFACTURER) ? "unknown" : Build.MANUFACTURER;
    }

    public static String getAndroidId(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1914142376705e196d7e7ba9f6a816e8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1914142376705e196d7e7ba9f6a816e8") : getAndroidId(context, null);
    }

    public static String getAndroidId(Context context, StatUtil statUtil) {
        Object[] objArr = {context, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "373b8f470498727218e6c0f8b27fa22b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "373b8f470498727218e6c0f8b27fa22b");
        }
        synchronized (Lock.mAndroidIdLock) {
            if (!TextUtils.isEmpty(Cache.mAndroidId)) {
                if (statUtil != null) {
                    statUtil.markStat(DeviceInfo.ANDROID_ID, 133);
                }
                return Cache.mAndroidId;
            } else if (context == null) {
                if (statUtil != null) {
                    statUtil.markStat(DeviceInfo.ANDROID_ID, 11);
                }
                return "";
            } else {
                String str = "";
                if (OneIdPrivacyHelper.isPrivacyMode(context)) {
                    return "";
                }
                if (OneIdHandler.getInstance(context).isStricMode() && !ProcessUtils.isMainProcess(context)) {
                    try {
                        str = (String) com.android.meituan.multiprocess.e.a(context.getPackageName(), (Object) null, DeviceInfoInvoker.class);
                    } catch (Throwable unused) {
                    }
                    LogUtils.i(TAG, ProcessUtils.getCurrentProcessName(context) + " getAndriodId from ipc:" + str);
                    if (VerifyUtil.verifyAndroidId(str)) {
                        Cache.mAndroidId = str;
                        return str;
                    }
                }
                String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                OneIdSharePref.getInstance(context).setIdCache(CacheKey.ANDROID_ID, string);
                saveCallTimes(context, CacheKey.ANDROID_ID);
                if (TextUtils.isEmpty(string)) {
                    if (statUtil != null) {
                        statUtil.markStat(DeviceInfo.ANDROID_ID, 8);
                    }
                } else if (statUtil != null) {
                    statUtil.markStat(DeviceInfo.ANDROID_ID, 133);
                }
                if (VerifyUtil.verifyAndroidId(string)) {
                    Cache.mAndroidId = string;
                    return string;
                }
                if (statUtil != null) {
                    statUtil.markStat(DeviceInfo.ANDROID_ID, 13);
                }
                return "";
            }
        }
    }

    @SuppressLint({"NewApi"})
    public static String getIMEI1(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "651bea19977094eb566e35ed7425f6f0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "651bea19977094eb566e35ed7425f6f0") : getIMEI1(context, null);
    }

    @SuppressLint({"NewApi"})
    public static String getIMEI1(Context context, StatUtil statUtil) {
        Object[] objArr = {context, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "88f74ce1bccc6659ba5f39cd1ddb33b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "88f74ce1bccc6659ba5f39cd1ddb33b1");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        if (context == null) {
            if (statUtil != null) {
                statUtil.markStat(DeviceInfo.IMEI_1, 11);
                return "";
            }
            return "";
        }
        synchronized (Lock.mImei1Lock) {
            try {
                String imei = Build.VERSION.SDK_INT >= 26 ? getImei(context, 0, statUtil) : "";
                if (Build.VERSION.SDK_INT < 26 && Build.VERSION.SDK_INT >= 23) {
                    imei = getImei(context, 0, statUtil);
                }
                if (Build.VERSION.SDK_INT < 23) {
                    imei = getDeviceId(context, 1, statUtil);
                }
                return TextUtils.isEmpty(imei) ? "" : imei;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public static String getIMEI2(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "da828784d36b162175040d896aa02bf0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "da828784d36b162175040d896aa02bf0") : getIMEI2(context, null);
    }

    @SuppressLint({"NewApi"})
    public static String getIMEI2(Context context, StatUtil statUtil) {
        Object[] objArr = {context, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fb392d4352e7a1f0897e9847029198a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fb392d4352e7a1f0897e9847029198a2");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        if (context == null) {
            if (statUtil != null) {
                statUtil.markStat("imei2", 11);
                return "";
            }
            return "";
        }
        synchronized (Lock.mImei2Lock) {
            try {
                String imei = Build.VERSION.SDK_INT >= 26 ? getImei(context, 1, statUtil) : "";
                if (Build.VERSION.SDK_INT < 26 && Build.VERSION.SDK_INT >= 23) {
                    imei = getImei(context, 1, statUtil);
                }
                if (Build.VERSION.SDK_INT < 23) {
                    imei = getDeviceId(context, 2, statUtil);
                }
                return TextUtils.isEmpty(imei) ? "" : imei;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public static String getMEID(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "71a0c12de708f310a1ca40bf8d0d0c9e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "71a0c12de708f310a1ca40bf8d0d0c9e") : getMEID(context, null);
    }

    @SuppressLint({"NewApi"})
    public static String getMEID(Context context, StatUtil statUtil) {
        Object[] objArr = {context, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "04b4609ac8681df6372bc7811673243a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "04b4609ac8681df6372bc7811673243a");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        if (context == null) {
            if (statUtil != null) {
                statUtil.markStat("meid", 11);
                return "";
            }
            return "";
        }
        try {
            String meid = Build.VERSION.SDK_INT >= 26 ? getMeid(context, 0, statUtil) : "";
            if (Build.VERSION.SDK_INT < 26 && Build.VERSION.SDK_INT >= 23) {
                meid = getDeviceId(context, 2, 3, statUtil);
                if (VerifyUtil.verifyImei(meid)) {
                    meid = getDeviceId(context, 1, 3, statUtil);
                }
            }
            return Build.VERSION.SDK_INT < 23 ? getDeviceId(context, 2, 3, statUtil) : meid;
        } catch (Throwable unused) {
            if (statUtil != null) {
                statUtil.markStat("meid", 12);
                return "";
            }
            return "";
        }
    }

    @RequiresApi(api = 26)
    public static String getImei(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "641c895ea748158d9aecb31610df6b4d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "641c895ea748158d9aecb31610df6b4d") : (Build.VERSION.SDK_INT < 26 || Build.VERSION.SDK_INT >= 29) ? "" : getImei(context, i, null);
    }

    @RequiresApi(api = 26)
    public static String getImei(Context context, int i, StatUtil statUtil) {
        Object[] objArr = {context, Integer.valueOf(i), statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cbd272d0a25b262955cb3d4264b6c111", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cbd272d0a25b262955cb3d4264b6c111");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        synchronized (Lock.mImeiLock) {
            try {
                String str = "imei" + i;
                Pair<Boolean, String> defaultIdValue = getDefaultIdValue(context, str);
                if (((Boolean) defaultIdValue.first).booleanValue()) {
                    return (String) defaultIdValue.second;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (!isForeground() || ActivityCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
                    if (statUtil != null) {
                        statUtil.markStat(i == 0 ? DeviceInfo.IMEI_1 : "imei2", 1);
                    }
                    return "";
                } else if (telephonyManager == null) {
                    return "";
                } else {
                    String imei = telephonyManager.getImei(i);
                    if (TextUtils.isEmpty(imei)) {
                        if (statUtil != null) {
                            statUtil.markStat(i == 0 ? DeviceInfo.IMEI_1 : "imei2", 8);
                        }
                    } else if (statUtil != null) {
                        statUtil.markStat(i == 0 ? DeviceInfo.IMEI_1 : "imei2", 133);
                    }
                    saveIdCache(context, str, imei);
                    return imei;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RequiresApi(api = 26)
    public static String getMeid(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1da69d3943f6f4b83cef7b2a71f0a0c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1da69d3943f6f4b83cef7b2a71f0a0c9");
        }
        if (Build.VERSION.SDK_INT < 26 || Build.VERSION.SDK_INT >= 29) {
            if (Build.VERSION.SDK_INT < 26) {
                saveIdCache(context, "meid" + i, "");
                return "";
            }
            return "";
        }
        return getMeid(context, i, null);
    }

    @RequiresApi(api = 26)
    public static String getMeid(Context context, int i, StatUtil statUtil) {
        Object[] objArr = {context, Integer.valueOf(i), statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dbf383c873a114148bc21e89530dfe74", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dbf383c873a114148bc21e89530dfe74");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        synchronized (Lock.mMeid1Lock) {
            Pair<Boolean, String> defaultIdValue = getDefaultIdValue(context, "meid" + i);
            if (((Boolean) defaultIdValue.first).booleanValue()) {
                return (String) defaultIdValue.second;
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (!isForeground() || ActivityCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0 || telephonyManager == null) {
                    if (statUtil != null) {
                        statUtil.markStat("meid", 1);
                    }
                    return "";
                }
                String meid = telephonyManager.getMeid(i);
                saveIdCache(context, "meid" + i, meid);
                if (TextUtils.isEmpty(meid)) {
                    if (statUtil != null) {
                        statUtil.markStat("meid", 8);
                    }
                } else if (statUtil != null) {
                    statUtil.markStat("meid", 133);
                }
                return meid;
            } catch (Exception e) {
                if (e instanceof SecurityException) {
                    if (statUtil != null) {
                        statUtil.markStat("meid", 1);
                    }
                } else if (statUtil != null) {
                    statUtil.markStat("meid", 12);
                }
                e.printStackTrace();
                return "";
            }
        }
    }

    @RequiresApi(api = 23)
    public static String getDeviceId(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5f86614c88b40d610c0f5c164dbb6525", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5f86614c88b40d610c0f5c164dbb6525") : (Build.VERSION.SDK_INT < 23 || Build.VERSION.SDK_INT >= 29) ? "" : getDeviceId(context, i, 0, null);
    }

    @RequiresApi(api = 23)
    public static String getDeviceId(Context context, int i, int i2, StatUtil statUtil) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c997fa3b8fd1804d232789054ad38553", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c997fa3b8fd1804d232789054ad38553");
        }
        if (Build.VERSION.SDK_INT < 23 || Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        synchronized (Lock.mDeviceId1Lock) {
            String str = CacheKey.DEVICEID + i;
            Pair<Boolean, String> defaultIdValue = getDefaultIdValue(context, str);
            if (((Boolean) defaultIdValue.first).booleanValue()) {
                return (String) defaultIdValue.second;
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (!isForeground() || ActivityCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
                    if (statUtil != null) {
                        statUtil.markStat(StatUtil.Use.getForUse(i2), 1);
                    }
                    return "";
                }
                String deviceId = telephonyManager.getDeviceId(i);
                saveIdCache(context, str, deviceId);
                if (TextUtils.isEmpty(deviceId)) {
                    if (statUtil != null) {
                        statUtil.markStat(StatUtil.Use.getForUse(i2), 8);
                    }
                } else if (statUtil != null) {
                    statUtil.markStat(StatUtil.Use.getForUse(i2), 133);
                }
                return deviceId;
            } catch (Exception e) {
                if (e instanceof SecurityException) {
                    if (statUtil != null) {
                        statUtil.markStat(StatUtil.Use.getForUse(i2), 1);
                    }
                } else if (statUtil != null) {
                    statUtil.markStat(StatUtil.Use.getForUse(i2), 12);
                }
                e.printStackTrace();
                return "";
            }
        }
    }

    public static String getDeviceId(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e4aee72e4a9d26a4888b77a1fa9bbb6f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e4aee72e4a9d26a4888b77a1fa9bbb6f") : getDeviceId(context, 0, null);
    }

    public static String getDeviceId(Context context, int i, StatUtil statUtil) {
        Object[] objArr = {context, Integer.valueOf(i), statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "07b5d9c64ad55572cf479918e0417adc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "07b5d9c64ad55572cf479918e0417adc");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        synchronized (Lock.mDeviceIdLock) {
            Pair<Boolean, String> defaultIdValue = getDefaultIdValue(context, "deviceid0");
            if (((Boolean) defaultIdValue.first).booleanValue()) {
                return (String) defaultIdValue.second;
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (!isForeground() || ActivityCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
                    if (statUtil != null) {
                        statUtil.markStat(StatUtil.Use.getForUse(i), 1);
                    }
                    return "";
                }
                String deviceId = telephonyManager.getDeviceId();
                saveIdCache(context, "deviceid0", deviceId);
                if (TextUtils.isEmpty(deviceId)) {
                    if (statUtil != null) {
                        statUtil.markStat(StatUtil.Use.getForUse(i), 8);
                    }
                } else if (statUtil != null) {
                    statUtil.markStat(StatUtil.Use.getForUse(i), 133);
                }
                return deviceId;
            } catch (Exception e) {
                if (e instanceof SecurityException) {
                    if (statUtil != null) {
                        statUtil.markStat(StatUtil.Use.getForUse(i), 1);
                    }
                } else if (statUtil != null) {
                    statUtil.markStat(StatUtil.Use.getForUse(i), 12);
                }
                e.printStackTrace();
                return "";
            }
        }
    }

    public static String getIMSI(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f5985a7e44abbe3a1be1aace8c894740", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f5985a7e44abbe3a1be1aace8c894740");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        synchronized (Lock.mImsiLock) {
            Pair<Boolean, String> defaultIdValue = getDefaultIdValue(context, CacheKey.SUBSCRIBERID);
            if (((Boolean) defaultIdValue.first).booleanValue()) {
                return (String) defaultIdValue.second;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                if (isForeground() && ActivityCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                    String subscriberId = telephonyManager.getSubscriberId();
                    saveIdCache(context, CacheKey.SUBSCRIBERID, subscriberId);
                    return subscriberId;
                }
                return "";
            }
            return "";
        }
    }

    public static String getIMSI(Context context, int i) {
        String str;
        String imsi;
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e514efcc40d19689dd0f7244bc68c625", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e514efcc40d19689dd0f7244bc68c625");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        synchronized (Lock.mImsi1Lock) {
            if (i == 0) {
                str = CacheKey.SUBSCRIBERID;
            } else {
                try {
                    str = CacheKey.SUBSCRIBERID + i;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Pair<Boolean, String> defaultIdValue = getDefaultIdValue(context, str);
            if (((Boolean) defaultIdValue.first).booleanValue()) {
                return (String) defaultIdValue.second;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                if (isForeground() && ActivityCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                    if (Build.VERSION.SDK_INT == 21) {
                        imsi = (String) TelephonyManager.class.getDeclaredMethod("getSubscriberId", Long.TYPE).invoke(telephonyManager, Long.valueOf(i));
                        saveIdCache(context, str, imsi);
                    } else if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 28) {
                        imsi = (String) TelephonyManager.class.getDeclaredMethod("getSubscriberId", Integer.TYPE).invoke(telephonyManager, Integer.valueOf(i));
                        saveIdCache(context, str, imsi);
                    } else {
                        imsi = getIMSI(context);
                    }
                    return imsi == null ? "" : imsi;
                }
                return "";
            }
            return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r18.equals("imei0") != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void saveIdCache(android.content.Context r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.unionid.oneid.util.AppUtil.saveIdCache(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static boolean isWhiteList(String str) {
        char c;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bacc2caf1b3060fb80d3649a6a9b55ba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bacc2caf1b3060fb80d3649a6a9b55ba")).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            switch (str.hashCode()) {
                case -1339874985:
                    if (str.equals(CacheKey.WIFI_MAC1)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1339874984:
                    if (str.equals(CacheKey.WIFI_MAC2)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1038881887:
                    if (str.equals(CacheKey.P2P_MAC)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -15835467:
                    if (str.equals(CacheKey.BLUE_MAC)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1342251546:
                    if (str.equals(CacheKey.WIFI_MAC)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int convertKeyToApiIndex(String str) {
        char c;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6fbfb3a56757870a7562a54830efb784", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6fbfb3a56757870a7562a54830efb784")).intValue();
        }
        switch (str.hashCode()) {
            case -1642330924:
                if (str.equals(CacheKey.SIMSERIALNUMBER)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -905839116:
                if (str.equals(CacheKey.SERIAL)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 25219167:
                if (str.equals("deviceid0")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 25219168:
                if (str.equals("deviceid1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 100317288:
                if (str.equals("imei0")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 100317289:
                if (str.equals(DeviceInfo.IMEI_1)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 103776733:
                if (str.equals("meid0")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 103776734:
                if (str.equals("meid1")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 327835523:
                if (str.equals(CacheKey.SUBSCRIBERID)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1572966669:
                if (str.equals("subscriberid0")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1572966670:
                if (str.equals("subscriberid1")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 0;
            case 2:
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
            case 7:
                return 4;
            case '\b':
                return 5;
            case '\t':
                return 6;
            case '\n':
                return 7;
            default:
                return -1;
        }
    }

    private static Pair<Boolean, String> getDefaultIdValue(Context context, String str) {
        boolean z = false;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "555dec2eb44a66eee0bd67e9a0bfe3e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "555dec2eb44a66eee0bd67e9a0bfe3e7");
        }
        if (idCache == null) {
            return new Pair<>(Boolean.TRUE, "");
        }
        String encrypt = AESUtils.encrypt(str);
        String str2 = idCache.get(str);
        if (!TextUtils.isEmpty(str2)) {
            if (DEFAULT_IMEI.equals(str2)) {
                return new Pair<>(Boolean.TRUE, "");
            }
            return new Pair<>(Boolean.TRUE, str2);
        } else if (context == null) {
            return new Pair<>(Boolean.TRUE, "");
        } else {
            if (OneIdPrivacyHelper.isPrivacyMode(context)) {
                return new Pair<>(Boolean.TRUE, "");
            }
            if (!isCheckOncePersmission && ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                isGrantPhonePermission = true;
            }
            if (isRegisterPermissionCallback) {
                isCheckOncePersmission = true;
            }
            if (!isWhiteList(str) && !isGrantPhonePermission) {
                return new Pair<>(Boolean.TRUE, "");
            }
            if (currentApiIndex == -1) {
                currentApiIndex = OneIdSharePref.getInstance(context).getCurrentDeviceInfoApiIndex();
            }
            if (lastCollectTime == -1) {
                lastCollectTime = OneIdSharePref.getInstance(context).getLastCollectDeviceInfoApiTime();
            }
            int nextIndex = System.currentTimeMillis() - lastCollectTime > 86400000 ? getNextIndex() : -1;
            int convertKeyToApiIndex = convertKeyToApiIndex(str);
            if (nextIndex != -1 && nextIndex == convertKeyToApiIndex) {
                z = true;
            }
            if ((!isOpenTakeTurns || isWhiteList(str)) ? true : true) {
                if (isNeedRefreshIdCache(context, encrypt + "duration")) {
                    if (!isForeground()) {
                        String decrypt = AESUtils.decrypt(OneIdSharePref.getInstance(context).getIdCache(encrypt, DEFAULT_IMEI));
                        if (DEFAULT_IMEI.equals(decrypt)) {
                            return new Pair<>(Boolean.TRUE, "");
                        }
                        return new Pair<>(Boolean.TRUE, decrypt);
                    }
                    LogUtils.i("deviceId", str + "调用系统接口");
                    return new Pair<>(Boolean.FALSE, "");
                }
            }
            String decrypt2 = AESUtils.decrypt(OneIdSharePref.getInstance(context).getIdCache(encrypt, DEFAULT_IMEI));
            idCache.put(str, decrypt2);
            if (DEFAULT_IMEI.equals(decrypt2)) {
                return new Pair<>(Boolean.TRUE, "");
            }
            return new Pair<>(Boolean.TRUE, decrypt2);
        }
    }

    private static int getNextIndex() {
        return (currentApiIndex + 1) % 8;
    }

    public static String getICCID(Context context) {
        TelephonyManager telephonyManager;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4816bb20ff546c172894801dc2fa19c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4816bb20ff546c172894801dc2fa19c8");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        synchronized (Lock.mIcccidLock) {
            Pair<Boolean, String> defaultIdValue = getDefaultIdValue(context, CacheKey.SIMSERIALNUMBER);
            if (((Boolean) defaultIdValue.first).booleanValue()) {
                return (String) defaultIdValue.second;
            }
            String str = "";
            if (isForeground() && ActivityCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0 && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                str = telephonyManager.getSimSerialNumber();
                saveIdCache(context, CacheKey.SIMSERIALNUMBER, str);
            }
            return (str == null || TextUtils.isEmpty(str)) ? "" : str;
        }
    }

    public static String getMNO(Context context) {
        Configuration configuration;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c86a9470e798c7a64c773d3d277dd691", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c86a9470e798c7a64c773d3d277dd691");
        }
        if (context == null) {
            return "unknown";
        }
        try {
            Resources resources = context.getResources();
            if (resources != null && (configuration = resources.getConfiguration()) != null) {
                int i = configuration.mcc;
                int i2 = configuration.mnc;
                if (i == 460) {
                    if (i2 != 0 && i2 != 2 && i2 != 7) {
                        if (i2 != 1 && i2 != 6) {
                            if (i2 == 3 || i2 == 5 || i2 == 11) {
                                return "中国电信";
                            }
                        }
                        return "中国联通";
                    }
                    return "中国移动";
                }
            }
            return "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static String getSerialNumber(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "41c6e7d577eb7750b13a61493a689bbc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "41c6e7d577eb7750b13a61493a689bbc");
        }
        try {
            return Build.SERIAL == null ? "unknown" : Build.SERIAL;
        } catch (Exception e) {
            e.printStackTrace();
            return "unknown";
        }
    }

    public static String getBluetoothMac(Context context) {
        Pair<Boolean, String> defaultIdValue;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3691764a43e9fd96c446c0bd03bafc1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3691764a43e9fd96c446c0bd03bafc1a");
        }
        synchronized (Lock.mBlueMacLock) {
            try {
                try {
                    defaultIdValue = getDefaultIdValue(context, CacheKey.BLUE_MAC);
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable unused) {
            }
            if (((Boolean) defaultIdValue.first).booleanValue()) {
                return (String) defaultIdValue.second;
            } else if (isForeground()) {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter != null) {
                    String address = defaultAdapter.getAddress();
                    saveIdCache(context, CacheKey.BLUE_MAC, address);
                    if (address != null) {
                        return address;
                    }
                }
                return "";
            } else {
                return "";
            }
        }
    }

    public static String getBluetoothMac(Context context, BluetoothAdapter bluetoothAdapter) {
        Pair<Boolean, String> defaultIdValue;
        Object[] objArr = {context, bluetoothAdapter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "288162935359f730f20de6c0a1874190", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "288162935359f730f20de6c0a1874190");
        }
        synchronized (Lock.mBlueMacLock) {
            try {
                try {
                    defaultIdValue = getDefaultIdValue(context, CacheKey.BLUE_MAC);
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable unused) {
            }
            if (((Boolean) defaultIdValue.first).booleanValue()) {
                return (String) defaultIdValue.second;
            } else if (isForeground()) {
                if (bluetoothAdapter != null) {
                    String address = bluetoothAdapter.getAddress();
                    saveIdCache(context, CacheKey.BLUE_MAC, address);
                    if (address != null) {
                        return address;
                    }
                }
                return "";
            } else {
                return "";
            }
        }
    }

    public static String getWifiMac(Context context) {
        String mac;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "38bd0397f120f460d88580d991c5ea96", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "38bd0397f120f460d88580d991c5ea96");
        }
        Pair<Boolean, String> defaultIdValue = getDefaultIdValue(context, CacheKey.WIFI_MAC);
        if (((Boolean) defaultIdValue.first).booleanValue()) {
            return (String) defaultIdValue.second;
        }
        if (isForeground()) {
            synchronized (Lock.mWifiMacLock) {
                mac = NetworkUtils.mac(context);
                saveIdCache(context, CacheKey.WIFI_MAC, mac);
            }
            return mac;
        }
        return "";
    }

    public static String getP2pMac(Context context) {
        String p2pMac;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4d29a3d0c486f48ef393d3aa22ad4652", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4d29a3d0c486f48ef393d3aa22ad4652");
        }
        Pair<Boolean, String> defaultIdValue = getDefaultIdValue(context, CacheKey.P2P_MAC);
        if (((Boolean) defaultIdValue.first).booleanValue()) {
            return (String) defaultIdValue.second;
        }
        if (isForeground()) {
            synchronized (Lock.mP2pMacLock) {
                p2pMac = NetworkUtils.p2pMac();
                saveIdCache(context, CacheKey.P2P_MAC, p2pMac);
            }
            return p2pMac;
        }
        return "";
    }

    public static String macCompatibility(Context context) {
        String str;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "83caf995f286fe36c2d09c9471109590", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "83caf995f286fe36c2d09c9471109590");
        }
        Pair<Boolean, String> defaultIdValue = getDefaultIdValue(context, CacheKey.WIFI_MAC1);
        if (((Boolean) defaultIdValue.first).booleanValue()) {
            return (String) defaultIdValue.second;
        }
        if (isForeground()) {
            synchronized (Lock.mWifiMac1Lock) {
                str = (String) NetworkUtils.macCompatibility().first;
                saveIdCache(context, CacheKey.WIFI_MAC1, str);
            }
            return str;
        }
        return "";
    }

    public static String macCompatibility(Context context, List<NetworkInterface> list) {
        String macCompatibility;
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "37ffb51a1c3fa4e3ce6f54491ee5c0b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "37ffb51a1c3fa4e3ce6f54491ee5c0b3");
        }
        Pair<Boolean, String> defaultIdValue = getDefaultIdValue(context, CacheKey.WIFI_MAC1);
        if (((Boolean) defaultIdValue.first).booleanValue()) {
            return (String) defaultIdValue.second;
        }
        if (isForeground()) {
            synchronized (Lock.mWifiMac1Lock) {
                macCompatibility = NetworkUtils.macCompatibility(list);
                saveIdCache(context, CacheKey.WIFI_MAC1, macCompatibility);
            }
            return macCompatibility;
        }
        return "";
    }

    public static String macMarshmallowEarlier(Context context) {
        String macMarshmallowEarlier;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4039c2ebcb2fcdacaa74cf2fb1ccb951", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4039c2ebcb2fcdacaa74cf2fb1ccb951");
        }
        Pair<Boolean, String> defaultIdValue = getDefaultIdValue(context, CacheKey.WIFI_MAC2);
        if (((Boolean) defaultIdValue.first).booleanValue()) {
            return (String) defaultIdValue.second;
        }
        if (isForeground()) {
            synchronized (Lock.mWifiMac2Lock) {
                macMarshmallowEarlier = NetworkUtils.macMarshmallowEarlier(context);
                saveIdCache(context, CacheKey.WIFI_MAC2, macMarshmallowEarlier);
            }
            return macMarshmallowEarlier;
        }
        return "";
    }

    public static String macMarshmallowEarlier(Context context, WifiInfo wifiInfo) {
        String macMarshmallowEarlier;
        Object[] objArr = {context, wifiInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "69378238a4f72db08d0bf939cc0d2fe8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "69378238a4f72db08d0bf939cc0d2fe8");
        }
        Pair<Boolean, String> defaultIdValue = getDefaultIdValue(context, CacheKey.WIFI_MAC2);
        if (((Boolean) defaultIdValue.first).booleanValue()) {
            return (String) defaultIdValue.second;
        }
        if (isForeground()) {
            synchronized (Lock.mWifiMac2Lock) {
                macMarshmallowEarlier = NetworkUtils.macMarshmallowEarlier(wifiInfo);
                saveIdCache(context, CacheKey.WIFI_MAC2, macMarshmallowEarlier);
            }
            return macMarshmallowEarlier;
        }
        return "";
    }

    public static byte[] stringToBytes(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bb9c7e79bf9e95b532765d4f514a935b", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bb9c7e79bf9e95b532765d4f514a935b");
        }
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String replace = str.replace(CommonConstant.Symbol.COLON, "");
        if (replace.length() % 2 != 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[replace.length() / 2];
        for (int i = 0; i < replace.length(); i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(replace.charAt(i), 16) << 4) + Character.digit(replace.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static boolean checkOverdue(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c7be7684be9832b11ab59a2482e1c46b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c7be7684be9832b11ab59a2482e1c46b")).booleanValue() : Math.abs(System.currentTimeMillis() - j) > 86400000;
    }

    public static String getPackageName(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "37cf118f66ce7c2e57e1ad74817fe0c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "37cf118f66ce7c2e57e1ad74817fe0c0");
        }
        if (TextUtils.isEmpty(Cache.mPackageName)) {
            if (context == null) {
                return "";
            }
            try {
                String packageName = context.getPackageName();
                Cache.mPackageName = packageName;
                return packageName;
            } catch (Throwable unused) {
                return "";
            }
        }
        return Cache.mPackageName;
    }

    public static String getApplicationName(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "17dc8bfecf3157846d49db9fdc471b8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "17dc8bfecf3157846d49db9fdc471b8f");
        }
        if (TextUtils.isEmpty(Cache.mAppName)) {
            if (context == null) {
                return "";
            }
            try {
                String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("APP_NAME");
                Cache.mAppName = string;
                return string;
            } catch (Throwable unused) {
                return "";
            }
        }
        return Cache.mAppName;
    }

    public static String getAppCanaryReleaseName(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4fceecda4d7b7b8c517cd464eb818653", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4fceecda4d7b7b8c517cd464eb818653");
        }
        if (TextUtils.isEmpty(Cache.mAppCanaryRelease)) {
            if (context == null) {
                return "";
            }
            try {
                String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("APP_CANARY_RELEASE");
                Cache.mAppCanaryRelease = string;
                return string;
            } catch (Throwable unused) {
                return "";
            }
        }
        return Cache.mAppCanaryRelease;
    }

    public static String getHarmonyOsBrand(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c3d6612501fa7aeec2a1e51a41ff4b86", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c3d6612501fa7aeec2a1e51a41ff4b86");
        }
        if (TextUtils.isEmpty(Cache.mHarmonyOsBrand)) {
            if (context == null) {
                return "";
            }
            try {
                String string = context.getApplicationContext().getString(Resources.getSystem().getIdentifier("config_os_brand", "string", "android"));
                Cache.mHarmonyOsBrand = string;
                return string;
            } catch (Throwable unused) {
                return "";
            }
        }
        return Cache.mHarmonyOsBrand;
    }

    public static String getHarmonyClassLoader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "69e0f2640404be7a5d847bb1d52d3537", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "69e0f2640404be7a5d847bb1d52d3537");
        }
        if (!TextUtils.isEmpty(Cache.mHarmonyClassLoader)) {
            return Cache.mHarmonyClassLoader;
        }
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            String str = (String) cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]);
            Cache.mHarmonyClassLoader = str;
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static java.lang.String getHarmonyEmuiVersion() {
        /*
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r8 = com.meituan.android.common.unionid.oneid.util.AppUtil.changeQuickRedirect
            java.lang.String r9 = "3a0aa24563d5592b10ef61ac40603583"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r8
            r5 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1c
            r1 = 1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r8, r1, r9)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1c:
            java.lang.String r0 = com.meituan.android.common.unionid.oneid.util.AppUtil.Cache.mHarmonyEmuiVersion
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L27
            java.lang.String r0 = com.meituan.android.common.unionid.oneid.util.AppUtil.Cache.mHarmonyEmuiVersion
            return r0
        L27:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = "getprop ro.build.version.emui"
            java.lang.Process r0 = r0.exec(r1)     // Catch: java.lang.Throwable -> L63
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L63
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L63
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Throwable -> L63
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L63
            r0 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L64
            r1.close()     // Catch: java.lang.Throwable -> L64
            r1.close()     // Catch: java.io.IOException -> L4d
            goto L51
        L4d:
            r1 = move-exception
            r1.printStackTrace()
        L51:
            com.meituan.android.common.unionid.oneid.util.AppUtil.Cache.mHarmonyEmuiVersion = r0
            return r0
        L54:
            r0 = move-exception
            r2 = r1
            goto L58
        L57:
            r0 = move-exception
        L58:
            if (r2 == 0) goto L62
            r2.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r1 = move-exception
            r1.printStackTrace()
        L62:
            throw r0
        L63:
            r1 = r2
        L64:
            java.lang.String r0 = ""
            if (r1 == 0) goto L70
            r1.close()     // Catch: java.io.IOException -> L6c
            goto L70
        L6c:
            r1 = move-exception
            r1.printStackTrace()
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.unionid.oneid.util.AppUtil.getHarmonyEmuiVersion():java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @java.lang.Deprecated
    public static java.lang.String getHarmonyDeviceType() {
        /*
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r8 = com.meituan.android.common.unionid.oneid.util.AppUtil.changeQuickRedirect
            java.lang.String r9 = "a5e879fd4cfde8150890a0189161cfe5"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r8
            r5 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1c
            r1 = 1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r8, r1, r9)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1c:
            java.lang.String r0 = com.meituan.android.common.unionid.oneid.util.AppUtil.Cache.mHarmonyDeviceType
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L27
            java.lang.String r0 = com.meituan.android.common.unionid.oneid.util.AppUtil.Cache.mHarmonyDeviceType
            return r0
        L27:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = "getprop ro.build.ohos.devicetype"
            java.lang.Process r0 = r0.exec(r1)     // Catch: java.lang.Throwable -> L63
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L63
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L63
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Throwable -> L63
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L63
            r0 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L64
            r1.close()     // Catch: java.lang.Throwable -> L64
            r1.close()     // Catch: java.io.IOException -> L4d
            goto L51
        L4d:
            r1 = move-exception
            r1.printStackTrace()
        L51:
            com.meituan.android.common.unionid.oneid.util.AppUtil.Cache.mHarmonyDeviceType = r0
            return r0
        L54:
            r0 = move-exception
            r2 = r1
            goto L58
        L57:
            r0 = move-exception
        L58:
            if (r2 == 0) goto L62
            r2.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r1 = move-exception
            r1.printStackTrace()
        L62:
            throw r0
        L63:
            r1 = r2
        L64:
            java.lang.String r0 = ""
            if (r1 == 0) goto L70
            r1.close()     // Catch: java.io.IOException -> L6c
            goto L70
        L6c:
            r1 = move-exception
            r1.printStackTrace()
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.unionid.oneid.util.AppUtil.getHarmonyDeviceType():java.lang.String");
    }

    public static String getLocalUuidInstallNsecTime(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3a5b49fa9c032e3609ac5c5c2391ca59", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3a5b49fa9c032e3609ac5c5c2391ca59") : getInstallNsecTimeForTransfer(context, CacheKey.UUID_TRANSFER_INFO);
    }

    public static String getLocalUnionIdInstallNsecTime(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4eac3bed480d8eeadfc1817238e3577d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4eac3bed480d8eeadfc1817238e3577d") : getInstallNsecTimeForTransfer(context, CacheKey.UNIONID_TRANSFER_INFO);
    }

    public static String getLocalDpidInstallNsecTime(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2fddc1f2d25526e28c49f8619ae2f744", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2fddc1f2d25526e28c49f8619ae2f744") : getInstallNsecTimeForTransfer(context, CacheKey.DPID_TRANSFER_INFO);
    }

    public static String getLocalUuidAndroidId(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d99f30449177bc02123ae6e92f4206ed", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d99f30449177bc02123ae6e92f4206ed") : getAndroidIdForTransfer(context, CacheKey.UUID_TRANSFER_INFO);
    }

    public static String getLocalUnionIdAndroidId(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "62c411fa9569a4dca8f2f786ab0f1105", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "62c411fa9569a4dca8f2f786ab0f1105") : getAndroidIdForTransfer(context, CacheKey.UNIONID_TRANSFER_INFO);
    }

    public static String getLocalDpidAndroidId(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f5363fd2ea3f312ca5d44d8550e359a0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f5363fd2ea3f312ca5d44d8550e359a0") : getAndroidIdForTransfer(context, CacheKey.DPID_TRANSFER_INFO);
    }

    @Deprecated
    public static boolean getUuidTransfer(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9907bd4862c209b8050ad44a7d0af4b6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9907bd4862c209b8050ad44a7d0af4b6")).booleanValue() : getTransfer(context, CacheKey.UUID_TRANSFER_INFO);
    }

    @Deprecated
    public static boolean getUnionIdTransfer(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9d8116aa288da8d6d49e5b40cac0e42b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9d8116aa288da8d6d49e5b40cac0e42b")).booleanValue() : getTransfer(context, CacheKey.UNIONID_TRANSFER_INFO);
    }

    @Deprecated
    public static boolean getDpidTransfer(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e3fd18572570b71a3c3c6a31d0bd5349", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e3fd18572570b71a3c3c6a31d0bd5349")).booleanValue() : getTransfer(context, CacheKey.DPID_TRANSFER_INFO);
    }

    public static boolean getUuidTransfer(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6c1159e3dcf935715aac70bd7a109baa", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6c1159e3dcf935715aac70bd7a109baa")).booleanValue() : getTransfer(context, CacheKey.UUID_TRANSFER_INFO, str, str2);
    }

    public static boolean getUnionIdTransfer(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8b94f562f5eebd4412d99cf3d81b87ce", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8b94f562f5eebd4412d99cf3d81b87ce")).booleanValue() : getTransfer(context, CacheKey.UNIONID_TRANSFER_INFO, str, str2);
    }

    public static boolean getDpidTransfer(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bdfe7a36e498bae050a890a27d286408", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bdfe7a36e498bae050a890a27d286408")).booleanValue() : getTransfer(context, CacheKey.DPID_TRANSFER_INFO, str, str2);
    }

    @Deprecated
    private static boolean getTransfer(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d310d628ef4c0171c66a6bf9328c5cd1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d310d628ef4c0171c66a6bf9328c5cd1")).booleanValue();
        }
        String localTransferInfo = getLocalTransferInfo(context, str);
        return (localTransferInfo.isEmpty() || localTransferInfo.equals(getNewTransferInfo(context))) ? false : true;
    }

    private static boolean getTransfer(Context context, String str, String str2, String str3) {
        Object[] objArr = {context, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6a4138ce641fdb6df0809233dccee5e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6a4138ce641fdb6df0809233dccee5e0")).booleanValue();
        }
        String newTransferInfo = getNewTransferInfo(context);
        if (TextUtils.isEmpty(newTransferInfo)) {
            return false;
        }
        String[] split = newTransferInfo.split(CommonConstant.Symbol.COMMA);
        if (split.length != 2) {
            return false;
        }
        String str4 = split[0];
        String str5 = split[1];
        return (TextUtils.isEmpty(str5) || TextUtils.isEmpty(str2) || str5.equals(str2) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3) || str4.equals(str3)) ? false : true;
    }

    private static String[] getInfoForTransfer(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aef06303f83f7d981a805aef47dcf12e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aef06303f83f7d981a805aef47dcf12e");
        }
        String localTransferInfo = getLocalTransferInfo(context, str);
        if (!TextUtils.isEmpty(localTransferInfo)) {
            return localTransferInfo.split(CommonConstant.Symbol.COMMA);
        }
        return new String[]{"", ""};
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r14.equals(com.meituan.android.common.unionid.oneid.util.AppUtil.CacheKey.DPID_TRANSFER_INFO) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String getLocalTransferInfo(android.content.Context r13, java.lang.String r14) {
        /*
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            r10 = 1
            r8[r10] = r14
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.android.common.unionid.oneid.util.AppUtil.changeQuickRedirect
            java.lang.String r12 = "1d671b96bd221710dbc5a8120bd31ca6"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            r13 = 0
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r10, r12)
            java.lang.String r13 = (java.lang.String) r13
            return r13
        L22:
            java.lang.String r1 = ""
            r2 = -1
            int r3 = r14.hashCode()
            r4 = -2112148844(0xffffffff821b2a94, float:-1.1399821E-37)
            if (r3 == r4) goto L4d
            r4 = -970826880(0xffffffffc6225b80, float:-10390.875)
            if (r3 == r4) goto L44
            r0 = 1323955331(0x4ee9f483, float:1.96255782E9)
            if (r3 == r0) goto L39
            goto L58
        L39:
            java.lang.String r0 = "unionidTransferInfo"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L58
            r0 = 1
            goto L59
        L44:
            java.lang.String r3 = "dpidTransferInfo"
            boolean r14 = r14.equals(r3)
            if (r14 == 0) goto L58
            goto L59
        L4d:
            java.lang.String r0 = "uuidTransferInfo"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L58
            r0 = 0
            goto L59
        L58:
            r0 = -1
        L59:
            switch(r0) {
                case 0: goto L6f;
                case 1: goto L66;
                case 2: goto L5d;
                default: goto L5c;
            }
        L5c:
            goto L77
        L5d:
            com.meituan.android.common.unionid.oneid.cache.OneIdSharePref r13 = com.meituan.android.common.unionid.oneid.cache.OneIdSharePref.getInstance(r13)
            java.lang.String r1 = r13.getLocalDpidTransferInfo()
            goto L77
        L66:
            com.meituan.android.common.unionid.oneid.cache.OneIdSharePref r13 = com.meituan.android.common.unionid.oneid.cache.OneIdSharePref.getInstance(r13)
            java.lang.String r1 = r13.getLocalUnionidTransferInfo()
            goto L77
        L6f:
            com.meituan.android.common.unionid.oneid.cache.OneIdSharePref r13 = com.meituan.android.common.unionid.oneid.cache.OneIdSharePref.getInstance(r13)
            java.lang.String r1 = r13.getLocalUuidTransferInfo()
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.unionid.oneid.util.AppUtil.getLocalTransferInfo(android.content.Context, java.lang.String):java.lang.String");
    }

    public static String getNewTransferInfo(Context context) {
        String str;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4f1474dd32a4a21564523f19a4b4154a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4f1474dd32a4a21564523f19a4b4154a");
        }
        if (context == null) {
            return "";
        }
        synchronized (Lock.mNewTransferinfoLock) {
            if (!TextUtils.isEmpty(newTransFerInfo)) {
                return newTransFerInfo;
            }
            String androidId = getAndroidId(context);
            try {
                str = CoreUtils.statFile("/data/user/0/" + context.getPackageName());
            } catch (Throwable unused) {
                str = "";
            }
            newTransFerInfo = str + CommonConstant.Symbol.COMMA + androidId;
            return newTransFerInfo;
        }
    }

    public static String getNewTransferInstallNsecTime(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "64a864f38c281e3528df19472f832f1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "64a864f38c281e3528df19472f832f1e");
        }
        if (!TextUtils.isEmpty(newTransFerInfo)) {
            String[] split = newTransFerInfo.split(CommonConstant.Symbol.COMMA);
            if (split.length == 2) {
                return split[0];
            }
        }
        getNewTransferInfo(context);
        String[] split2 = newTransFerInfo.split(CommonConstant.Symbol.COMMA);
        return split2.length == 2 ? split2[0] : "";
    }

    private static String getInstallNsecTimeForTransfer(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2a86094f8a594a8719d7c09a7c504cc6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2a86094f8a594a8719d7c09a7c504cc6");
        }
        String[] infoForTransfer = getInfoForTransfer(context, str);
        return infoForTransfer.length == 2 ? infoForTransfer[0] : "";
    }

    private static String getAndroidIdForTransfer(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2bf5a2a5418db0b720a9882686bba93b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2bf5a2a5418db0b720a9882686bba93b") : getInfoForTransfer(context, str).length == 2 ? getInfoForTransfer(context, str)[1] : "";
    }

    public static String getAdbShell(String str) {
        BufferedReader bufferedReader;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        BufferedReader bufferedReader2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e42ae0d5abcd1f6226c11bc7d4b1f3d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e42ae0d5abcd1f6226c11bc7d4b1f3d");
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(str).getInputStream()), 1024);
        } catch (IOException unused) {
            bufferedReader = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return readLine;
        } catch (IOException unused2) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static String getApplicationVersion(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "78147393532a08eb656f93881e66b30f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "78147393532a08eb656f93881e66b30f");
        }
        if (TextUtils.isEmpty(Cache.mAppVersion)) {
            if (context == null) {
                return "";
            }
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
                String str = packageInfo.versionName;
                Cache.mFirstInstallTime = packageInfo.firstInstallTime;
                Cache.mLastUpdateTime = packageInfo.lastUpdateTime;
                Cache.mAppVersion = str;
                return str;
            } catch (Throwable unused) {
                return "";
            }
        }
        return Cache.mAppVersion;
    }

    public static long getFirstInstallTime(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ae27fb84640d89096319d4eb418c33c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ae27fb84640d89096319d4eb418c33c5")).longValue();
        }
        if (Cache.mFirstInstallTime == -1 && context != null) {
            try {
                Cache.mFirstInstallTime = context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).firstInstallTime;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return Cache.mFirstInstallTime;
    }

    public static long getLastUpdateTime(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f4f590c35ceac2f25e745a76e65b2d99", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f4f590c35ceac2f25e745a76e65b2d99")).longValue();
        }
        if (Cache.mLastUpdateTime == -1 && context != null) {
            try {
                Cache.mLastUpdateTime = context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).lastUpdateTime;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return Cache.mLastUpdateTime;
    }

    public static String intIP2StringIP(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "81fb44e5aabed69cf6ce1e924bac48c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "81fb44e5aabed69cf6ce1e924bac48c6");
        }
        return (i & 255) + CommonConstant.Symbol.DOT + ((i >> 8) & 255) + CommonConstant.Symbol.DOT + ((i >> 16) & 255) + CommonConstant.Symbol.DOT + ((i >> 24) & 255);
    }

    public static boolean getNetWorkAvailable(Context context) {
        NetworkInfo activeNetworkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "be1eea095f8a765a4c863207b01eaf15", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "be1eea095f8a765a4c863207b01eaf15")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Context getAppContext(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d0f56508476c7319f92b709d46127eba", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d0f56508476c7319f92b709d46127eba");
        }
        if (context != null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            return context;
        }
        return null;
    }

    public static String getChannel(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "54d82d25af05e6707a49c2afda900ad4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "54d82d25af05e6707a49c2afda900ad4");
        }
        if (!TextUtils.isEmpty(Cache.mAppChannel)) {
            return Cache.mAppChannel;
        }
        try {
            String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("channel");
            Cache.mAppChannel = string;
            return string;
        } catch (Exception unused) {
            return "exception_channel";
        }
    }

    public static boolean checkNaturalDayRefresh(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d4790c8a5320021fbafe2656a1cba7a8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d4790c8a5320021fbafe2656a1cba7a8")).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        Date date = new Date(j);
        Date date2 = new Date(currentTimeMillis);
        calendar.setTime(date);
        int year = date.getYear();
        int month = date.getMonth();
        int i = calendar.get(6);
        calendar.setTime(date2);
        int year2 = date2.getYear();
        int month2 = date2.getMonth();
        int i2 = calendar.get(6);
        if (year2 > year) {
            return true;
        }
        if (year2 == year) {
            if (month2 > month) {
                return true;
            }
            if (month2 == month && i2 > i) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExceedReportCount(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5a59230f927ebd293898c93e95fe481f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5a59230f927ebd293898c93e95fe481f")).booleanValue() : ((long) OneIdSharePref.getInstance(context).getLogReportCount()) >= LIMIT_LOG_REPORT_COUNT;
    }

    private static boolean isNeedRefreshIdCache(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2327d2b095cc65ed904a40ac700b57cc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2327d2b095cc65ed904a40ac700b57cc")).booleanValue() : System.currentTimeMillis() - OneIdSharePref.getInstance(context).getLastCollectIdTime(str) > 86400000;
    }

    public static String getSerial(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5b54b84523e27a484c7521908a2004a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5b54b84523e27a484c7521908a2004a1");
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                return "";
            }
            if (Build.VERSION.SDK_INT >= 26) {
                synchronized (Lock.mSerialLock) {
                    Pair<Boolean, String> defaultIdValue = getDefaultIdValue(context, CacheKey.SERIAL);
                    if (((Boolean) defaultIdValue.first).booleanValue()) {
                        return (String) defaultIdValue.second;
                    } else if (isForeground() && ActivityCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                        String serial = Build.getSerial();
                        saveIdCache(context, CacheKey.SERIAL, serial);
                        return TextUtils.isEmpty(serial) ? "" : serial;
                    } else {
                        return "";
                    }
                }
            }
            return Build.SERIAL;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getSimoperator(Context context) {
        String str;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a2676793383e5e85e678b6cddd35bb2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a2676793383e5e85e678b6cddd35bb2e");
        }
        Pair<Boolean, String> defaultIdValue = getDefaultIdValue(context, CacheKey.SIMOPERATOR);
        if (!((Boolean) defaultIdValue.first).booleanValue()) {
            str = "";
            synchronized (Lock.mSimoperatorLock) {
                if (context != null) {
                    try {
                        if (isForeground() && ActivityCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                            str = telephonyManager != null ? telephonyManager.getSimOperator() : "";
                            saveIdCache(context, CacheKey.SIMOPERATOR, str);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            return str;
        }
        return (String) defaultIdValue.second;
    }

    public static String getSafeSimoperator(Context context) {
        Resources resources;
        String str;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e1882dc26fc6be64bf6564bc1ac76c35", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e1882dc26fc6be64bf6564bc1ac76c35");
        }
        String str2 = "";
        synchronized (Lock.mSaveSimoperatorLock) {
            if (context != null) {
                try {
                    resources = context.getResources();
                } catch (Throwable unused) {
                }
                if (resources != null) {
                    Configuration configuration = resources.getConfiguration();
                    if (configuration == null) {
                        return "";
                    }
                    if (configuration.mnc < 10) {
                        str = configuration.mcc + "0" + configuration.mnc;
                    } else if (configuration.mnc == 65535) {
                        str = configuration.mcc + "00";
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(configuration.mcc);
                        sb.append(configuration.mnc);
                        str2 = sb.toString();
                    }
                    return str;
                }
            }
            str = str2;
            return str;
        }
    }

    private static boolean saveCallTimes(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a97bff88a7e74a5c511270cbbe3dbb70", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a97bff88a7e74a5c511270cbbe3dbb70")).booleanValue();
        }
        String encrypt = AESUtils.encrypt(str + CALLTIMES);
        return OneIdSharePref.getInstance(context).saveDeviceInfoCallTimes(encrypt, OneIdSharePref.getInstance(context).getDeviceInfoCallTimes(encrypt) + 1);
    }

    public static String getImei1Cache(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "36e1539303513baeb97865f80ae3faaf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "36e1539303513baeb97865f80ae3faaf");
        }
        String str = (String) getDefaultIdValue(context, "imei0").second;
        return TextUtils.isEmpty(str) ? (String) getDefaultIdValue(context, "deviceid0").second : str;
    }

    public static int getImei1CallTimes(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6ce2e6d2ec6a94183f6ea8598f3aa28c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6ce2e6d2ec6a94183f6ea8598f3aa28c")).intValue() : OneIdSharePref.getInstance(context).getDeviceInfoCallTimes(AESUtils.encrypt("imei0calltimes")) + OneIdSharePref.getInstance(context).getDeviceInfoCallTimes(AESUtils.encrypt("deviceid0calltimes"));
    }

    public static String getImei2Cache(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd685d40a05e3ee7f11fd6aebed7e638", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd685d40a05e3ee7f11fd6aebed7e638");
        }
        String str = (String) getDefaultIdValue(context, DeviceInfo.IMEI_1).second;
        return TextUtils.isEmpty(str) ? (String) getDefaultIdValue(context, "deviceid1").second : str;
    }

    public static int getImei2CallTimes(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "22b575c937d866cffde8a93fedb089e3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "22b575c937d866cffde8a93fedb089e3")).intValue() : OneIdSharePref.getInstance(context).getDeviceInfoCallTimes(AESUtils.encrypt("imei1calltimes")) + OneIdSharePref.getInstance(context).getDeviceInfoCallTimes(AESUtils.encrypt("deviceid1calltimes"));
    }

    public static String getMeid1Cache(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7dfbb6e980e00cdae53e41df92e95bc2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7dfbb6e980e00cdae53e41df92e95bc2");
        }
        String str = (String) getDefaultIdValue(context, "meid0").second;
        return TextUtils.isEmpty(str) ? (String) getDefaultIdValue(context, "meid0").second : str;
    }

    public static int getMeid1CallTimes(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d931edda4925367c44bbceeb32ed1cf5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d931edda4925367c44bbceeb32ed1cf5")).intValue() : OneIdSharePref.getInstance(context).getDeviceInfoCallTimes(AESUtils.encrypt("meid0calltimes"));
    }

    public static String getMeid2Cache(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "99781ed68fb48b4143ebbb19037cfb52", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "99781ed68fb48b4143ebbb19037cfb52");
        }
        String str = (String) getDefaultIdValue(context, "meid1").second;
        return TextUtils.isEmpty(str) ? (String) getDefaultIdValue(context, "meid1").second : str;
    }

    public static int getMeid2CallTimes(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b56f989b1629812c91973fec022cded6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b56f989b1629812c91973fec022cded6")).intValue() : OneIdSharePref.getInstance(context).getDeviceInfoCallTimes(AESUtils.encrypt("meid1calltimes"));
    }

    public static String getImsi1Cache(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c49d7ee10eef7c3db89326994e9c5eb8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c49d7ee10eef7c3db89326994e9c5eb8");
        }
        String str = (String) getDefaultIdValue(context, CacheKey.SUBSCRIBERID).second;
        return TextUtils.isEmpty(str) ? (String) getDefaultIdValue(context, CacheKey.SUBSCRIBERID).second : str;
    }

    public static int getImsi1CallTimes(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b8209e7e64cc690a1495492b4b4063b6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b8209e7e64cc690a1495492b4b4063b6")).intValue() : OneIdSharePref.getInstance(context).getDeviceInfoCallTimes(AESUtils.encrypt("subscriberidcalltimes"));
    }

    public static String getImsi2Cache(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "902d62d5df9c6434e1469eedc852e524", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "902d62d5df9c6434e1469eedc852e524");
        }
        String str = (String) getDefaultIdValue(context, "subscriberid1").second;
        return TextUtils.isEmpty(str) ? (String) getDefaultIdValue(context, "subscriberid1").second : str;
    }

    public static int getImsi2CallTimes(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5294d0a0e281c33a88172f49349a02a8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5294d0a0e281c33a88172f49349a02a8")).intValue() : OneIdSharePref.getInstance(context).getDeviceInfoCallTimes(AESUtils.encrypt("subscriberid1calltimes"));
    }

    public static String getIccidCache(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c7be4860e9c368a8f0e1500dd75d36de", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c7be4860e9c368a8f0e1500dd75d36de");
        }
        String str = (String) getDefaultIdValue(context, CacheKey.SIMSERIALNUMBER).second;
        return TextUtils.isEmpty(str) ? (String) getDefaultIdValue(context, CacheKey.SIMSERIALNUMBER).second : str;
    }

    public static int getIccidCallTimes(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "af5c351a1738151e5cdecb6cd0298cfa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "af5c351a1738151e5cdecb6cd0298cfa")).intValue() : OneIdSharePref.getInstance(context).getDeviceInfoCallTimes(AESUtils.encrypt("simSerialNumbercalltimes"));
    }

    public static String getSerialCache(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e8d81602a9ae57ae6a186d9c32dc14e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e8d81602a9ae57ae6a186d9c32dc14e");
        }
        String str = (String) getDefaultIdValue(context, CacheKey.SERIAL).second;
        return TextUtils.isEmpty(str) ? (String) getDefaultIdValue(context, CacheKey.SERIAL).second : str;
    }

    public static int getSerialCallTimes(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d57cccb12d366691f2e3ce53c9b38e30", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d57cccb12d366691f2e3ce53c9b38e30")).intValue() : OneIdSharePref.getInstance(context).getDeviceInfoCallTimes(AESUtils.encrypt("serialcalltimes"));
    }

    public static String getAndroidIdCache(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b8be45a53f7cf5e79ab3a214ecf6362e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b8be45a53f7cf5e79ab3a214ecf6362e") : context == null ? "" : OneIdSharePref.getInstance(context).getIdCache(CacheKey.ANDROID_ID, "");
    }

    public static int getAndroidIdCallTimes(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5b9cfff4dc2037d19051acbd2b5c47ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5b9cfff4dc2037d19051acbd2b5c47ed")).intValue();
        }
        if (context == null) {
            return 0;
        }
        return OneIdSharePref.getInstance(context).getDeviceInfoCallTimes(AESUtils.encrypt("local_AIdcalltimes"));
    }
}
