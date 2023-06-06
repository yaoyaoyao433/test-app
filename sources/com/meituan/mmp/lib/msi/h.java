package com.meituan.mmp.lib.msi;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.titans.base.TitansBundle;
import com.sankuai.waimai.business.ugc.machpro.module.calendar.WMCalendarModule;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class h {
    public static ChangeQuickRedirect a = null;
    private static volatile boolean c = false;
    private static List<String> d;
    private static a k;
    public static final String[] b = new String[0];
    private static final String[] e = new String[0];
    private static final String[] f = new String[0];
    private static final String[] g = {"showTabBar", "hideTabBar", "setTabBarBadge", "removeTabBarBadge", "showTabBarRedDot", "hideTabBarRedDot", "setTabBarStyle", "setTabBarItem", "openLink", SocialConstants.TYPE_REQUEST, "RequestTask.abort", "RequestTask.onHeadersReceived", "RequestTask.offHeadersReceived", "canIUse", "openBluetoothAdapter", "closeBluetoothAdapter", "startBluetoothDevicesDiscovery", "stopBluetoothDevicesDiscovery", "getBluetoothAdapterState", "getBLEDeviceRSSI", "setBLEMTU", "onBLECharacteristicValueChange", "onBLEConnectionStateChange", "onBluetoothDeviceFound", "onBluetoothAdapterStateChange", "notifyBLECharacteristicValueChange", "writeBLECharacteristicValue", "readBLECharacteristicValue", "getBLEDeviceCharacteristics", "getBLEDeviceServices", "closeBLEConnection", "createBLEConnection", "getConnectedBluetoothDevices", "getBluetoothDevices", "offBLEConnectionStateChange", "offBLECharacteristicValueChange", "offBluetoothDeviceFound", "offBluetoothAdapterStateChange", "setStorage", "setStorageSync", "removeStorageSync", "removeStorage", "getStorageSync", "getStorage", "getStorageInfoSync", "getStorageInfo", "clearStorageSync", "clearStorage", "compressImage", "showToast", "hideToast", TitansBundle.PARAM_SHOW_LOADING, "hideLoading", "makePhoneCall", "vibrateShort", "vibrateLong", "getScreenBrightness", "setKeepScreenOn", "setScreenBrightness", "onUserCaptureScreen", "offUserCaptureScreen", "getSystemInfo", "getSystemInfoSync", "authorize", "openSetting", "getSetting", "setInnerAudioOption", "createInnerAudioContext", "InnerAudioContext.getAudioProperties", "InnerAudioContext.setAudioProperties", "InnerAudioContext.destroy", "InnerAudioContext.play", "InnerAudioContext.seek", "InnerAudioContext.stop", "InnerAudioContext.onPlay", "InnerAudioContext.onStop", "InnerAudioContext.onSeeking", "InnerAudioContext.onPause", "InnerAudioContext.onCanplay", "InnerAudioContext.onEnded", "InnerAudioContext.onSeeked", "InnerAudioContext.onTimeUpdate", "InnerAudioContext.onWaiting", "InnerAudioContext.offCanplay", "InnerAudioContext.offEnded", "InnerAudioContext.offError", "InnerAudioContext.offPause", "InnerAudioContext.offPlay", "InnerAudioContext.offSeeked", "InnerAudioContext.offSeeking", "InnerAudioContext.offStop", "InnerAudioContext.offTimeUpdate", "InnerAudioContext.offWaiting", "chooseContact", "addPhoneContact", "getSystemInfoAsync", "getRecorderManager", "RecorderManager.start", "RecorderManager.stop", "RecorderManager.pause", "RecorderManager.onFrameRecorded", "RecorderManager.onStop", "RecorderManager.resume", "RecorderManager.onError", "RecorderManager.onPause", "RecorderManager.onResume", "RecorderManager.onStart", "getBatteryInfo", "getBatteryInfoSync", "chooseVideo", "chooseMedia", "previewMedia", "saveVideoToPhotosAlbum", "chooseImage", "saveImageToPhotosAlbum", "previewImage", "getNetworkType", "onNetworkStatusChange", "offNetworkStatusChange", "startLocationUpdate", "startLocationUpdateBackground", "stopLocationUpdate", "getLocation", "onLocationChange", "offLocationChange", "sendSocketMessage", "onSocketOpen", "onSocketMessage", "onSocketError", "onSocketClose", "connectSocket", "closeSocket", "SocketTask.close", "SocketTask.onClose", "SocketTask.onError", "SocketTask.onMessage", "SocketTask.onOpen", "SocketTask.send", "startWifi", "stopWifi", "setWifiList", "onWifiConnected", "offWifiConnected", "onGetWifiList", "offGetWifiList", "getWifiList", "getConnectedWifi", "connectWifi", "addPhoneRepeatCalendar", WMCalendarModule.ADD_PHONE_CALENDAR, "setClipboardData", "getClipboardData", "scanCode", "startCompass", "stopCompass", "onCompassChange", "offCompassChange", "startDeviceMotionListening", "stopDeviceMotionListening", "onDeviceMotionChange", "offDeviceMotionChange", "startGyroscope", "stopGyroscope", "onGyroscopeChange", "offGyroscopeChange", "startAccelerometer", "stopAccelerometer", "onAccelerometerChange", "offAccelerometerChange", "uploadFile", "UploadTask.abort", "UploadTask.onProgressUpdate", "UploadTask.onHeadersReceived", "UploadTask.offProgressUpdate", "UploadTask.offHeadersReceived", "downloadFile", "DownloadTask.onProgressUpdate", "DownloadTask.abort", "DownloadTask.onHeadersReceived", "DownloadTask.offProgressUpdate", "DownloadTask.offHeadersReceived", "chooseAddress", "showModal", "showActionSheet", "getImageInfo", "components.map", "components.container", "getFileSystemManager", "saveFile", "saveFileSync", "removeSavedFile", "getFileInfo", "getSavedFileList", "getSavedFileInfo", "access", "accessSync", "fs_appendFile", "fs_appendFileSync", "writeFile", "writeFileSync", "readFile", "readFileSync", "fs_copyFile", "fs_copyFileSync", "mkdir", "mkdirSync", "readdir", "readdirSync", "fs_rename", "fs_renameSync", "rmdir", "rmdirSync", "unlink", "unlinkSync", "unzip", "stat", "statSync"};
    private static final String[] h = new String[0];
    private static final String[] i = new String[0];
    private static final String[] j = {"default", PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE, "custom"};

    public static /* synthetic */ boolean a(boolean z) {
        c = true;
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        @SerializedName("enable_msi")
        private boolean b;
        @SerializedName("version")
        private int c;
        @SerializedName("msiBlackApisMap")
        private Map<String, List<String>> d;
        @SerializedName("msiFEBlackApisMap")
        private Map<String, List<String>> e;
        @SerializedName("msiSamplingRate")
        private int f;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6415d488324111c455b82c1dc67fb8e4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6415d488324111c455b82c1dc67fb8e4");
                return;
            }
            this.b = false;
            this.c = 0;
            this.f = -1;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        protected final boolean b;
        protected final Map<String, List<String>> c;
        protected final Map<String, List<String>> d;
        protected final a e;

        public b(boolean z, Map<String, List<String>> map, Map<String, List<String>> map2, a aVar) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), map, map2, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d1bba0e7e2e28eb64d9a551d9ec2fa3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d1bba0e7e2e28eb64d9a551d9ec2fa3");
                return;
            }
            this.b = z;
            this.c = map;
            this.d = map2;
            this.e = aVar;
        }

        public final Map<String, List<String>> a() {
            return this.c;
        }

        public final int b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c8efb7d4d340f0011df32bd8916243f", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c8efb7d4d340f0011df32bd8916243f")).intValue();
            }
            if (this.e != null) {
                return this.e.f;
            }
            return -1;
        }

        public final boolean c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2fd4422325a794a4c6445b8ecba01f2", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2fd4422325a794a4c6445b8ecba01f2")).booleanValue();
            }
            if (this.e != null) {
                return this.e.b;
            }
            return false;
        }

        public final boolean d() {
            return this.b;
        }

        public final Map<String, List<String>> e() {
            return this.d;
        }

        public static b f() {
            String[] strArr;
            HashMap hashMap;
            String[] strArr2;
            boolean z = false;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3be25b01f9a26500eeaedf16d8c61243", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3be25b01f9a26500eeaedf16d8c61243");
            }
            HashMap hashMap2 = new HashMap();
            for (String str : h.j) {
                List asList = Arrays.asList(h.e(str));
                if (asList != null && asList.size() > 0) {
                    hashMap2.put(str, asList);
                }
            }
            if (hashMap2.size() > 0) {
                hashMap = null;
                z = true;
            } else {
                hashMap = new HashMap();
                for (String str2 : h.j) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add("all");
                    hashMap.put(str2, arrayList);
                }
            }
            return new b(z, hashMap2, hashMap, null);
        }
    }

    public static void a(List<String> list) {
        d = list;
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6c006c69b58086eea43bc464c20c1e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6c006c69b58086eea43bc464c20c1e6");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("MMPMsi", "registerHorn mmp_msi_config ");
        HashMap hashMap = new HashMap();
        hashMap.put("mmpSdkVersion", "0.4.231.7-wm");
        Horn.register("mmp_msi_config", new HornCallback() { // from class: com.meituan.mmp.lib.msi.h.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dee345f9cd03c519d90e3512c493f7c3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dee345f9cd03c519d90e3512c493f7c3");
                    return;
                }
                if (z) {
                    h.d(str);
                    h.a(true);
                }
                if (str != null) {
                    com.meituan.mmp.lib.trace.b.b("MMPMsi", "mmp_msi_config " + str);
                }
            }
        }, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str) {
        a aVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a0f5173b39405549027bdace948acfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a0f5173b39405549027bdace948acfc");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                aVar = (a) com.meituan.mmp.lib.utils.j.b.fromJson(str, (Class<Object>) a.class);
            } catch (Exception e2) {
                e2.printStackTrace();
                aVar = null;
            }
            if (aVar != null) {
                synchronized (h.class) {
                    k = aVar;
                }
            }
            a(k, "horn");
        }
    }

    public static b b() {
        String[] strArr;
        String[] strArr2;
        char c2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        boolean z = true;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "524d2651bad398b22c039e33d95d99d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "524d2651bad398b22c039e33d95d99d0");
        }
        if (!c) {
            String accessCache = Horn.accessCache("mmp_msi_config");
            if (!TextUtils.isEmpty(accessCache)) {
                d(accessCache);
                com.meituan.mmp.lib.trace.b.b("MMPMsi", "load from cache mmp_msi_config " + accessCache);
            } else {
                com.meituan.mmp.lib.trace.b.b("MMPMsi", "load from cache mmp_msi_config ");
            }
            c = true;
        }
        if (k == null) {
            return b.f();
        }
        synchronized (h.class) {
            if (k == null) {
                return b.f();
            }
            HashMap hashMap = new HashMap();
            String[] strArr3 = j;
            int length = strArr3.length;
            int i2 = 0;
            while (i2 < length) {
                String str = strArr3[i2];
                ArrayList arrayList = new ArrayList();
                List list = k.d != null ? (List) k.d.get(str) : null;
                if (k.b) {
                    Object[] objArr2 = new Object[1];
                    objArr2[c2] = str;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1543385228bc45b1f5e8c5f27c439979", RobustBitConfig.DEFAULT_VALUE)) {
                        strArr2 = (String[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1543385228bc45b1f5e8c5f27c439979");
                    } else if ("default".equals(str)) {
                        strArr2 = b;
                    } else if (PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE.equals(str)) {
                        strArr2 = e;
                    } else {
                        strArr2 = "custom".equals(str) ? f : null;
                    }
                    if (strArr2 != null && strArr2.length > 0) {
                        for (String str2 : strArr2) {
                            if (list == null || list.size() == 0 || !list.contains(str2)) {
                                arrayList.add(str2);
                            }
                        }
                    }
                }
                String[] e2 = e(str);
                if (e2 != null && e2.length > 0) {
                    for (String str3 : e2) {
                        if (list == null || list.size() == 0 || !list.contains(str3)) {
                            arrayList.add(str3);
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    hashMap.put(str, arrayList);
                }
                i2++;
                c2 = 0;
            }
            Map map = k.e;
            if (hashMap.size() <= 0) {
                map = new HashMap();
                for (String str4 : j) {
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add("all");
                    map.put(str4, arrayList2);
                }
                z = false;
            }
            return new b(z, hashMap, map, k);
        }
    }

    public static void a(b bVar, String str) {
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8b8e67768ccd8e8f2c47ca87f8d180d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8b8e67768ccd8e8f2c47ca87f8d180d");
        } else {
            a(bVar != null ? bVar.e : null, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(a aVar, String str) {
        int i2 = 0;
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c76a24b20b4fab39c43f018432acfff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c76a24b20b4fab39c43f018432acfff");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("category", str);
        int i3 = -1;
        if (aVar != null) {
            boolean z = aVar.b;
            i3 = aVar.c;
            i2 = z;
        }
        hashMap.put("msiEnable", Integer.valueOf(i2));
        hashMap.put("version", Integer.valueOf(i3));
        Babel.logRT(new Log.Builder("").tag("mmp.msi.grey").generalChannelStatus(true).optional(hashMap).build());
    }

    public static boolean a(b bVar) {
        String[] strArr;
        String[] strArr2;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c787c58c5988c15d46d0f6d3f5054b4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c787c58c5988c15d46d0f6d3f5054b4")).booleanValue();
        }
        synchronized (h.class) {
            try {
                if (bVar == null) {
                    return k != null;
                } else if (bVar.e == k) {
                    return false;
                } else {
                    if (bVar.e != null && k != null) {
                        if (bVar.e.b != k.b) {
                            return true;
                        }
                        for (String str : j) {
                            if (!a(k.d != null ? (List) k.d.get(str) : null, bVar.e.d != null ? (List) bVar.e.d.get(str) : null)) {
                                return true;
                            }
                        }
                        for (String str2 : j) {
                            if (!a(k.e != null ? (List) k.e.get(str2) : null, bVar.e.e != null ? (List) bVar.e.e.get(str2) : null)) {
                                return true;
                            }
                        }
                        return false;
                    }
                    return true;
                }
            } finally {
            }
        }
    }

    private static boolean a(List<String> list, List<String> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4947e899b3c5663a48ea800ee1e70df", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4947e899b3c5663a48ea800ee1e70df")).booleanValue();
        }
        int size = list == null ? 0 : list.size();
        if (size != (list2 == null ? 0 : list2.size())) {
            return false;
        }
        if (size == 0) {
            return true;
        }
        for (String str : list) {
            if (!list2.contains(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] e(String str) {
        int i2 = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6459d791810bd9b7df6a30ea7cc4e76", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6459d791810bd9b7df6a30ea7cc4e76");
        }
        if ("default".equals(str)) {
            if (d != null && d.size() > 0) {
                String[] strArr = new String[g.length + d.size()];
                String[] strArr2 = g;
                int length = strArr2.length;
                int i3 = 0;
                while (i2 < length) {
                    strArr[i3] = strArr2[i2];
                    i2++;
                    i3++;
                }
                for (String str2 : d) {
                    strArr[i3] = str2;
                    i3++;
                }
                return strArr;
            }
            return g;
        } else if (PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE.equals(str)) {
            return h;
        } else {
            if ("custom".equals(str)) {
                return i;
            }
            return null;
        }
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac57791a941f01d826970dfb408e1cab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac57791a941f01d826970dfb408e1cab")).booleanValue();
        }
        for (String str2 : g) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
        }
        for (String str3 : b) {
            if (TextUtils.equals(str, str3)) {
                return true;
            }
        }
        return "insertMap".equals(str);
    }
}
