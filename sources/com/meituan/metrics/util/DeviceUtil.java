package com.meituan.metrics.util;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.support.annotation.WorkerThread;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.common.utils.FileUtils;
import com.sankuai.common.utils.IOUtils;
import com.sankuai.common.utils.NumberUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DeviceUtil {
    private static final String CPU_FILE_PATH_0 = "/sys/devices/system/cpu/";
    private static final String CPU_FILE_PATH_1 = "/sys/devices/system/cpu/possible";
    private static final String CPU_FILE_PATH_2 = "/sys/devices/system/cpu/present";
    public static final String DEVICE_LEVEL = "deviceLevel";
    public static final String DEVICE_MEMORY_AVAILABLE = "MemoryAvailable";
    public static final String DEVICE_MEMORY_TOTAL = "MemoryTotal";
    private static final int FALLBACK_INVALID = -1;
    private static final long GB = 1073741824;
    private static final String HIGH = "HIGH";
    private static final String HORN_DEVICE_CONFIG = "metrics_device_config";
    public static final String HORN_DEVICE_CONFIG_SP = "metrics_device_config_sp";
    private static final String HORN_DEVICE_CONFIG_SP_LEVEL = "level";
    private static final int INVALID = 0;
    public static final String INVALID_NA = "N/A";
    private static final String LOW = "LOW";
    private static final long MB = 1048576;
    public static final String MEMORY_AVAILABLE = "MemAvailable:";
    private static final String MEMORY_FILE_PATH = "/proc/meminfo";
    public static final String MEMORY_TOTAL = "MemTotal:";
    private static final String MIDDLE = "MIDDLE";
    private static final int OHOS_FALSE = 0;
    private static final int OHOS_TRUE = 1;
    private static final int OHOS_UNKNOWN = -1;
    private static final int PERF_HIGH = 90;
    private static final int PERF_LOW = 10;
    private static final int PERF_MIDDLE = 50;
    private static final int PERF_UNKNOW = -1;
    private static final String UN_KNOW = "UN_KNOW";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static int cpuCoreNums = 0;
    private static long cpuMinFreq = 0;
    private static volatile int isOhos = -1;
    private static long mJiffyMillis = 0;
    private static long maxCpuFreq = 0;
    private static long maxMemApp = 0;
    private static long maxMemPhone = 0;
    private static LEVEL newDeviceLevel = null;
    private static volatile String ohosVersion = "";
    private static LEVEL sLevelCache;
    private static long sLowMemoryThreshold;
    private static long totalMemApp;
    private static long totalMemPhone;
    private static final String[] suPathname = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
    private static final FileFilter CPU_FILTER = new FileFilter() { // from class: com.meituan.metrics.util.DeviceUtil.1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            Object[] objArr = {file};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76c13b6b5dc77a5160ae5b6f010450a5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76c13b6b5dc77a5160ae5b6f010450a5")).booleanValue() : Pattern.matches("cpu[0-9]", file.getName());
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum LEVEL {
        BEST(4),
        BAD(-1),
        HIGH(3),
        MIDDLE(2),
        LOW(1),
        UN_KNOW(0);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public int value;

        public static LEVEL valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "585cfe278eb2c1b71f3b7e051247d1f7", RobustBitConfig.DEFAULT_VALUE) ? (LEVEL) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "585cfe278eb2c1b71f3b7e051247d1f7") : (LEVEL) Enum.valueOf(LEVEL.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static LEVEL[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "634bf92069603e28d3f560ba67996a74", RobustBitConfig.DEFAULT_VALUE) ? (LEVEL[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "634bf92069603e28d3f560ba67996a74") : (LEVEL[]) values().clone();
        }

        LEVEL(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3ee9b0520d8dcfaca38b655d00e3b30", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3ee9b0520d8dcfaca38b655d00e3b30");
            } else {
                this.value = i;
            }
        }

        public final int getValue() {
            return this.value;
        }
    }

    public static LEVEL getDeviceLevel(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "10e023a3b4e92cc7b72ca4aaf28c9b33", RobustBitConfig.DEFAULT_VALUE)) {
            return (LEVEL) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "10e023a3b4e92cc7b72ca4aaf28c9b33");
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(HORN_DEVICE_CONFIG_SP, 0);
        if (sharedPreferences.getBoolean(NewDeviceLevel.DEVICE_CACHE_SP_USE_NEW_LEVEL, false)) {
            if (newDeviceLevel == null) {
                newDeviceLevel = transform2Level(sharedPreferences.getString(NewDeviceLevel.DEVICE_CACHE_SP_NEW_LEVEL, GrsBaseInfo.CountryCodeSource.UNKNOWN));
            }
            return newDeviceLevel;
        }
        if (sLevelCache == null) {
            String string = sharedPreferences.getString("level", "");
            if (TextUtils.isEmpty(string)) {
                sLevelCache = getDeviceLevelLocal(context);
            } else {
                sLevelCache = transform2Level(string);
            }
        }
        return sLevelCache;
    }

    public static int getPerfLevel(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0dbde07ebc8e07e4bcfc9056c49d00b7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0dbde07ebc8e07e4bcfc9056c49d00b7")).intValue();
        }
        switch (getDeviceLevel(context)) {
            case HIGH:
                return 90;
            case MIDDLE:
                return 50;
            case LOW:
                return 10;
            default:
                return -1;
        }
    }

    public static int getNumOfCores() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "13cb5bbfa895cfe10f1556e9604e7c7a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "13cb5bbfa895cfe10f1556e9604e7c7a")).intValue();
        }
        if (cpuCoreNums > 0) {
            return cpuCoreNums;
        }
        try {
            int coresFromFile = getCoresFromFile(CPU_FILE_PATH_1);
            if (coresFromFile == 0) {
                coresFromFile = getCoresFromFile(CPU_FILE_PATH_2);
            }
            if (coresFromFile == 0) {
                coresFromFile = getCoresFromCPUFiles(CPU_FILE_PATH_0);
            }
            i = coresFromFile;
        } catch (Exception unused) {
        }
        if (i == 0) {
            i = 1;
        }
        cpuCoreNums = i;
        return i;
    }

    public static boolean isRoot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b4dd5dde4c5227b9b8338288b1f80bd7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b4dd5dde4c5227b9b8338288b1f80bd7")).booleanValue();
        }
        try {
            for (String str : suPathname) {
                if (new File(str).exists()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static String getAbiList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8b60cacccdf4b70f5026db2a2e23dfee", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8b60cacccdf4b70f5026db2a2e23dfee");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return TextUtils.join(CommonConstant.Symbol.COMMA, Build.SUPPORTED_ABIS);
        }
        String str = Build.CPU_ABI;
        String str2 = Build.CPU_ABI2;
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str + CommonConstant.Symbol.COMMA + str2;
    }

    private static int getCoresFromCPUFiles(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "751cb9a0b9c0b613424dd7d78633842b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "751cb9a0b9c0b613424dd7d78633842b")).intValue();
        }
        File[] listFiles = new File(str).listFiles(CPU_FILTER);
        if (listFiles == null) {
            return 0;
        }
        return listFiles.length;
    }

    private static int getCoresFromFile(String str) {
        FileInputStream fileInputStream;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eff9d21c8c41f504359d166381b968da", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eff9d21c8c41f504359d166381b968da")).intValue();
        }
        try {
            fileInputStream = new FileInputStream(str);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, "UTF-8"));
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                if (readLine != null && readLine.matches("0-[\\d]+$")) {
                    int parseInt = Integer.parseInt(readLine.substring(2)) + 1;
                    IOUtils.close(fileInputStream);
                    return parseInt;
                }
                IOUtils.close(fileInputStream);
                return 0;
            } catch (IOException unused) {
                IOUtils.close(fileInputStream);
                return 0;
            } catch (Throwable th) {
                th = th;
                IOUtils.close(fileInputStream);
                throw th;
            }
        } catch (IOException unused2) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public static String queryCpuMaxFreq() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "01208986e302c086fb67b54025f010d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "01208986e302c086fb67b54025f010d6");
        }
        long obtainMaxFreq = obtainMaxFreq();
        return obtainMaxFreq > 0 ? String.valueOf(obtainMaxFreq) : "N/A";
    }

    public static String queryCpuMinFreq() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7e3710abfbc32d2be486fc39e0efe9db", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7e3710abfbc32d2be486fc39e0efe9db");
        }
        long obtainMinFreq = obtainMinFreq();
        return obtainMinFreq > 0 ? String.valueOf(obtainMinFreq) : "N/A";
    }

    private static long obtainMaxFreq() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "658567f94a59f2f2c47b1e92b492efe2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "658567f94a59f2f2c47b1e92b492efe2")).longValue();
        }
        if (maxCpuFreq > 0) {
            return maxCpuFreq;
        }
        long j = 0;
        for (int i = 0; i < getNumOfCores(); i++) {
            long parseLong = NumberUtils.parseLong(FileUtils.readFile("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq"), 0L);
            if (j < parseLong) {
                j = parseLong;
            }
        }
        maxCpuFreq = j;
        return j;
    }

    private static long obtainMinFreq() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7b8c61cd90b4b782e888d299a7477831", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7b8c61cd90b4b782e888d299a7477831")).longValue();
        }
        if (cpuMinFreq > 0) {
            return cpuMinFreq;
        }
        long j = Long.MAX_VALUE;
        for (int i = 0; i < getNumOfCores(); i++) {
            String str = "/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_min_freq";
            if (new File(str).exists()) {
                long parseLong = NumberUtils.parseLong(FileUtils.readFile(str), 0L);
                if (parseLong < j && parseLong > 0) {
                    j = parseLong;
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            return 0L;
        }
        cpuMinFreq = j;
        return j;
    }

    public static String queryAppMemory(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c5376d9248ded8d725e3172388b33804", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c5376d9248ded8d725e3172388b33804");
        }
        long maxAppMemory = getMaxAppMemory(context);
        return maxAppMemory > 0 ? String.valueOf(maxAppMemory) : "N/A";
    }

    public static String queryTotalAppMemory(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6a84a6952f4c08971ba4d191e5cb71a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6a84a6952f4c08971ba4d191e5cb71a2");
        }
        long totalAppMemory = getTotalAppMemory(context);
        return totalAppMemory > 0 ? String.valueOf(totalAppMemory) : "N/A";
    }

    public static String queryPhoneMemory(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e86a0665c97f39304254a64e337cbc50", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e86a0665c97f39304254a64e337cbc50");
        }
        long maxPhoneMemory = getMaxPhoneMemory(context);
        return maxPhoneMemory > 0 ? String.valueOf(maxPhoneMemory) : "N/A";
    }

    public static String queryTotalPhoneMemory(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "11fb054ba518805bdae8edfaa0fe22df", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "11fb054ba518805bdae8edfaa0fe22df");
        }
        long maxPhoneMemory = getMaxPhoneMemory(context);
        if (maxPhoneMemory > 0) {
            long memoryAvailable = maxPhoneMemory - getMemoryAvailable(context);
            return memoryAvailable > 0 ? String.valueOf(memoryAvailable) : "N/A";
        }
        return "N/A";
    }

    @WorkerThread
    public static String getCpuCortex() {
        String property;
        BufferedReader bufferedReader;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        BufferedReader bufferedReader2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5eb619909dce4112bb743986697ddaea", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5eb619909dce4112bb743986697ddaea");
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                z = Process.is64Bit();
            } else if (Build.VERSION.SDK_INT >= 21 && (property = System.getProperty("os.arch")) != null && property.contains("64")) {
                z = true;
            }
            String str = z ? "dalvik.vm.isa.arm64.variant" : "dalvik.vm.isa.arm.variant";
            Process exec = Runtime.getRuntime().exec("getprop " + str);
            int waitFor = exec.waitFor();
            if (waitFor == 0) {
                bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            } else {
                bufferedReader = new BufferedReader(new InputStreamReader(exec.getErrorStream()));
            }
            bufferedReader2 = bufferedReader;
            String readLine = bufferedReader2.readLine();
            if (waitFor != 0) {
                readLine = "error: " + readLine;
            }
            return readLine;
        } catch (Exception e) {
            return "error: " + e.getMessage();
        } finally {
            closeBufferReader(bufferedReader2);
        }
    }

    public static long getMaxPhoneMemory(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e6a8d154ae39c255779d10f6b67fb0d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e6a8d154ae39c255779d10f6b67fb0d6")).longValue();
        }
        if (maxMemPhone > 0) {
            return maxMemPhone;
        }
        if (Build.VERSION.SDK_INT >= 16 && context != null) {
            try {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
                activityManager.getMemoryInfo(memoryInfo);
                maxMemPhone = memoryInfo.totalMem;
                sLowMemoryThreshold = memoryInfo.threshold;
                long maxMemory = Runtime.getRuntime().maxMemory();
                if (maxMemory == Long.MAX_VALUE) {
                    maxMemApp = activityManager.getMemoryClass();
                } else {
                    maxMemApp = maxMemory;
                }
            } catch (Throwable unused) {
            }
            return maxMemPhone;
        }
        return getMemory("MemTotal:");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        r3 = java.lang.Integer.parseInt(r2[1]) * 1024;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long getMemory(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.metrics.util.DeviceUtil.changeQuickRedirect
            java.lang.String r11 = "5af2cd77f6f8dcc4625c9128784a10a5"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r10, r0, r11)
            java.lang.Long r12 = (java.lang.Long) r12
            long r0 = r12.longValue()
            return r0
        L22:
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            r3 = 0
            if (r1 == 0) goto L2b
            return r3
        L2b:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6c
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6c
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6c
            java.lang.String r7 = "/proc/meminfo"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6c
            java.lang.String r7 = "UTF-8"
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6c
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6c
            java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L6d
        L42:
            if (r2 == 0) goto L6d
            java.lang.String r5 = "\\s+"
            java.lang.String[] r2 = r2.split(r5)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L6d
            r5 = r2[r9]     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L6d
            boolean r5 = r12.equals(r5)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L6d
            if (r5 == 0) goto L5f
            r12 = r2[r0]     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L6d
            int r12 = java.lang.Integer.parseInt(r12)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L6d
            long r2 = (long) r12     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L6d
            r4 = 1024(0x400, double:5.06E-321)
            long r2 = r2 * r4
            r3 = r2
            goto L6d
        L5f:
            java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L6d
            goto L42
        L64:
            r12 = move-exception
            goto L68
        L66:
            r12 = move-exception
            r1 = r2
        L68:
            com.sankuai.common.utils.IOUtils.close(r1)
            throw r12
        L6c:
            r1 = r2
        L6d:
            com.sankuai.common.utils.IOUtils.close(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.metrics.util.DeviceUtil.getMemory(java.lang.String):long");
    }

    private static long getMaxAppMemory(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7174c053469ed0b3535b1a5cfe310f1a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7174c053469ed0b3535b1a5cfe310f1a")).longValue();
        }
        if (maxMemApp > 0) {
            return maxMemApp;
        }
        getMaxPhoneMemory(context);
        return maxMemApp;
    }

    private static long getTotalAppMemory(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "227323a7eb7c3f8c28525abee769d3fd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "227323a7eb7c3f8c28525abee769d3fd")).longValue();
        }
        if (totalMemApp > 0) {
            return totalMemApp;
        }
        long j = Runtime.getRuntime().totalMemory();
        totalMemApp = j;
        return j;
    }

    private static long getMemoryAvailable(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ac2ecdc51db8497048d1ef9baae9e765", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ac2ecdc51db8497048d1ef9baae9e765")).longValue();
        }
        if (Build.VERSION.SDK_INT >= 16 && context != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getMemoryInfo(memoryInfo);
            return memoryInfo.availMem;
        }
        return getMemory("MemAvailable:");
    }

    @SuppressLint({"DefaultLocale"})
    public static JSONObject getDeviceInfo(JSONObject jSONObject, Context context) {
        Object[] objArr = {jSONObject, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c8d2fc92f82ebfc875ed0dc2a175852b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c8d2fc92f82ebfc875ed0dc2a175852b");
        }
        try {
            jSONObject.put("deviceLevel", getDeviceLevel(context));
            jSONObject.put(DEVICE_MEMORY_TOTAL, String.format("%.2f MB", Float.valueOf((((float) getMaxPhoneMemory(context)) * 1.0f) / 1048576.0f)));
            jSONObject.put(DEVICE_MEMORY_AVAILABLE, String.format("%.2f MB", Float.valueOf((((float) getMemoryAvailable(context)) * 1.0f) / 1048576.0f)));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static void addDeviceInfo(Map<String, Object> map, String str, Context context) {
        Object[] objArr = {map, str, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "753d60200c1a16cac8b89cd3208f0fee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "753d60200c1a16cac8b89cd3208f0fee");
            return;
        }
        map.put("cpuCoreNums", Integer.valueOf(getNumOfCores()));
        map.put("cpuMaxFreq", queryCpuMaxFreq());
        map.put("cpuMinFreq", queryCpuMinFreq());
        map.put("maxMemApp", queryAppMemory(context));
        map.put("maxMemPhone", queryPhoneMemory(context));
        if (TextUtils.equals(str, "lag_log") || TextUtils.equals(str, "anr")) {
            map.put("totalMemApp", queryTotalAppMemory(context));
            map.put("totalMemPhone", queryTotalPhoneMemory(context));
        }
    }

    public static void prepareDeviceLevelFromRemote(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6a08c89c3a27dd0fb23711075f659e00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6a08c89c3a27dd0fb23711075f659e00");
            return;
        }
        HashMap hashMap = new HashMap();
        if (cpuCoreNums <= 0) {
            cpuCoreNums = getNumOfCores();
        }
        if (maxMemPhone <= 0) {
            maxMemPhone = getMaxPhoneMemory(context);
        }
        hashMap.put(Constants.CPU, Integer.valueOf(cpuCoreNums));
        hashMap.put("ram", Long.valueOf(maxMemPhone));
        hashMap.put("manufacturer", Build.MANUFACTURER);
        hashMap.put("brand", Build.BRAND);
        hashMap.put("deviceScore", Double.valueOf(NewDeviceLevel.getDeviceScore(context)));
        Horn.register(HORN_DEVICE_CONFIG, new HornCallback() { // from class: com.meituan.metrics.util.DeviceUtil.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5677b33371d1b0a9e671665377b4f2b9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5677b33371d1b0a9e671665377b4f2b9");
                } else if (z) {
                    DeviceUtil.processHornCallback(context, str);
                }
            }
        }, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void processHornCallback(Context context, String str) {
        String parseForLevel;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d4a298c381cfefd7203911d7bdbde218", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d4a298c381cfefd7203911d7bdbde218");
            return;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(HORN_DEVICE_CONFIG_SP, 0);
            JSONObject jSONObject = new JSONObject(str);
            boolean optBoolean = jSONObject.optBoolean("enableDeviceScore", false);
            String optString = jSONObject.optString(NewDeviceLevel.DEVICE_CACHE_SP_NEW_LEVEL);
            sharedPreferences.edit().putBoolean(NewDeviceLevel.DEVICE_CACHE_SP_ENABLE_SCORE, optBoolean).putString(NewDeviceLevel.DEVICE_CACHE_SP_NEW_LEVEL, optString).putBoolean(NewDeviceLevel.DEVICE_CACHE_SP_USE_NEW_LEVEL, jSONObject.optBoolean("useNewDeviceModel", false)).apply();
            parseForLevel = jSONObject.optString("level");
            newDeviceLevel = transform2Level(optString);
            JSONObject optJSONObject = jSONObject.optJSONObject("cpuPartScores");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    NewDeviceLevel.cpuScoresFromHorn.put(next, Double.valueOf(optJSONObject.optDouble(next, -1.0d)));
                }
            }
            NewDeviceLevel.updateDeviceScore(context);
        } catch (JSONException unused) {
            parseForLevel = parseForLevel(str);
        }
        if (TextUtils.isEmpty(parseForLevel)) {
            return;
        }
        sLevelCache = transform2Level(parseForLevel);
        context.getSharedPreferences(HORN_DEVICE_CONFIG_SP, 0).edit().putString("level", parseForLevel).apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r12.equals(com.meituan.metrics.util.DeviceUtil.MIDDLE) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.meituan.metrics.util.DeviceUtil.LEVEL transform2Level(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.metrics.util.DeviceUtil.changeQuickRedirect
            java.lang.String r11 = "0bb122bbec4f190e7444ef4e10639689"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            com.meituan.metrics.util.DeviceUtil$LEVEL r12 = (com.meituan.metrics.util.DeviceUtil.LEVEL) r12
            return r12
        L1f:
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 == 0) goto L28
            com.meituan.metrics.util.DeviceUtil$LEVEL r12 = com.meituan.metrics.util.DeviceUtil.LEVEL.UN_KNOW
            return r12
        L28:
            r1 = -1
            int r2 = r12.hashCode()
            r3 = -2021012075(0xffffffff8789cd95, float:-2.07343E-34)
            if (r2 == r3) goto L60
            r0 = 75572(0x12734, float:1.05899E-40)
            if (r2 == r0) goto L56
            r0 = 2217378(0x21d5a2, float:3.107208E-39)
            if (r2 == r0) goto L4c
            r0 = 451521649(0x1ae9ac71, float:9.6645135E-23)
            if (r2 == r0) goto L42
            goto L69
        L42:
            java.lang.String r0 = "UN_KNOW"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L69
            r0 = 3
            goto L6a
        L4c:
            java.lang.String r0 = "HIGH"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L69
            r0 = 0
            goto L6a
        L56:
            java.lang.String r0 = "LOW"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L69
            r0 = 2
            goto L6a
        L60:
            java.lang.String r2 = "MIDDLE"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L69
            goto L6a
        L69:
            r0 = -1
        L6a:
            switch(r0) {
                case 0: goto L76;
                case 1: goto L73;
                case 2: goto L70;
                default: goto L6d;
            }
        L6d:
            com.meituan.metrics.util.DeviceUtil$LEVEL r12 = com.meituan.metrics.util.DeviceUtil.LEVEL.UN_KNOW
            return r12
        L70:
            com.meituan.metrics.util.DeviceUtil$LEVEL r12 = com.meituan.metrics.util.DeviceUtil.LEVEL.LOW
            return r12
        L73:
            com.meituan.metrics.util.DeviceUtil$LEVEL r12 = com.meituan.metrics.util.DeviceUtil.LEVEL.MIDDLE
            return r12
        L76:
            com.meituan.metrics.util.DeviceUtil$LEVEL r12 = com.meituan.metrics.util.DeviceUtil.LEVEL.HIGH
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.metrics.util.DeviceUtil.transform2Level(java.lang.String):com.meituan.metrics.util.DeviceUtil$LEVEL");
    }

    private static LEVEL getDeviceLevelLocal(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "297478d39a69dbb1670a769b9ab08105", RobustBitConfig.DEFAULT_VALUE)) {
            return (LEVEL) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "297478d39a69dbb1670a769b9ab08105");
        }
        if (cpuCoreNums <= 0) {
            cpuCoreNums = getNumOfCores();
        }
        if (maxMemPhone <= 0) {
            maxMemPhone = getMaxPhoneMemory(context);
        }
        if (cpuCoreNums <= 0 || maxMemPhone <= 0) {
            return LEVEL.UN_KNOW;
        }
        if (cpuCoreNums <= 4 || maxMemPhone <= 2147483648L) {
            return LEVEL.LOW;
        }
        if (maxMemPhone <= 4294967296L) {
            return LEVEL.MIDDLE;
        }
        return LEVEL.HIGH;
    }

    private static String parseForLevel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7cf6a73ee68a7503a1f4663c57a6eca1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7cf6a73ee68a7503a1f4663c57a6eca1");
        }
        try {
            return ((HashMap) new Gson().fromJson(str, new TypeToken<HashMap<String, Object>>() { // from class: com.meituan.metrics.util.DeviceUtil.3
                public static ChangeQuickRedirect changeQuickRedirect;
            }.getType())).get("level").toString();
        } catch (Exception e) {
            Logger.getMetricxLogger().e(e.getMessage());
            return "";
        }
    }

    public static boolean isOhos() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fd25d491c44eb7c2ad41654b42507b63", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fd25d491c44eb7c2ad41654b42507b63")).booleanValue();
        }
        if (isOhos == -1) {
            try {
                Class<?> cls = Class.forName("com.huawei.system.BuildEx");
                Method method = cls.getMethod("getOsBrand", new Class[0]);
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader != null && classLoader.getParent() == null) {
                    isOhos = "harmony".equals(method.invoke(cls, new Object[0])) ? 1 : 0;
                }
            } catch (Exception unused) {
            }
        }
        return isOhos == 1;
    }

    @SuppressLint({"PrivateApi"})
    public static String getOhosVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "36cc176bb5dece7bcb6ccbdc5d32e18b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "36cc176bb5dece7bcb6ccbdc5d32e18b");
        }
        if (isOhos != 1) {
            return "";
        }
        if (!TextUtils.isEmpty(ohosVersion)) {
            return ohosVersion;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method declaredMethod = cls.getDeclaredMethod("get", String.class);
            ohosVersion = "HarmonyOS" + declaredMethod.invoke(cls, "hw_sc.build.platform.version");
        } catch (Throwable th) {
            Logger.getMetricxLogger().e(th.getLocalizedMessage());
        }
        return ohosVersion;
    }

    public static long getJiffyMillis() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a3fdf8db9ed97cc4c5dae804eac8df82", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a3fdf8db9ed97cc4c5dae804eac8df82")).longValue();
        }
        if (mJiffyMillis > 0) {
            return mJiffyMillis;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
            if (sysconf > 0) {
                mJiffyMillis = 1000 / sysconf;
            }
        }
        if (mJiffyMillis <= 0) {
            mJiffyMillis = 10L;
        }
        return mJiffyMillis;
    }

    public static void closeBufferReader(BufferedReader bufferedReader) {
        Object[] objArr = {bufferedReader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "64f1ac3faca0f53b6c40180bc61b9f14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "64f1ac3faca0f53b6c40180bc61b9f14");
        } else if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException unused) {
            }
        }
    }

    public static double getDeviceScore(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "783a525188c0f33330433e28df7ee565", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "783a525188c0f33330433e28df7ee565")).doubleValue() : NewDeviceLevel.getDeviceScore(context);
    }
}
