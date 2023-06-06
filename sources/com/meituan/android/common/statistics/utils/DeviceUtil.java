package com.meituan.android.common.statistics.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
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
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DeviceUtil {
    private static final String CPU_FILE_PATH_0 = "/sys/devices/system/cpu/";
    private static final String CPU_FILE_PATH_1 = "/sys/devices/system/cpu/possible";
    private static final String CPU_FILE_PATH_2 = "/sys/devices/system/cpu/present";
    private static final long GB = 1073741824;
    private static final int INVALID = 0;
    public static final String INVALID_NA = "N/A";
    private static final long MB = 1048576;
    public static final String MEMORY_AVAILABLE = "MemAvailable:";
    private static final String MEMORY_FILE_PATH = "/proc/meminfo";
    public static final String MEMORY_TOTAL = "MemTotal:";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static int cpuCoreNums;
    private static long cpuMaxFreq;
    private static long cpuMinFreq;
    private static long maxMemApp;
    private static long maxMemPhone;
    private static long sLowMemoryThreshold;
    private static long totalMemApp;
    private static long totalMemPhone;
    private static final String[] suPathname = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
    private static final FileFilter CPU_FILTER = new FileFilter() { // from class: com.meituan.android.common.statistics.utils.DeviceUtil.1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            Object[] objArr = {file};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79b8008c036ca5492896466bab35a9aa", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79b8008c036ca5492896466bab35a9aa")).booleanValue() : Pattern.matches("cpu[0-9]", file.getName());
        }
    };

    public static int getNumOfCores() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "02773099c4cb211d9abdf26dff4a6229", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "02773099c4cb211d9abdf26dff4a6229")).intValue();
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

    @Deprecated
    public static boolean isRoot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "54e69456af584c38e531aac84c6f4f3b", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "54e69456af584c38e531aac84c6f4f3b")).booleanValue();
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

    @Deprecated
    public static String getAbiList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7bc79817e5f3b2882555796c0541cb1b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7bc79817e5f3b2882555796c0541cb1b");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "730ab49da4ccfe18c663702e315b2d9f", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "730ab49da4ccfe18c663702e315b2d9f")).intValue();
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8c64c414d4e4f6e0e7fe69a05e71110a", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8c64c414d4e4f6e0e7fe69a05e71110a")).intValue();
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

    @Deprecated
    public static String queryCpuMaxFreq() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5869eab54af26acf6e9247ebf92eb51d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5869eab54af26acf6e9247ebf92eb51d");
        }
        long obtainMaxFreq = obtainMaxFreq();
        return obtainMaxFreq > 0 ? String.valueOf(obtainMaxFreq) : "N/A";
    }

    @Deprecated
    public static String queryCpuMinFreq() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fd288637e91da343ed26b2502d4d0c37", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fd288637e91da343ed26b2502d4d0c37");
        }
        long obtainMinFreq = obtainMinFreq();
        return obtainMinFreq > 0 ? String.valueOf(obtainMinFreq) : "N/A";
    }

    private static long obtainMaxFreq() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f2ea79eeccf8c562d0fb1a5028a91701", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f2ea79eeccf8c562d0fb1a5028a91701")).longValue();
        }
        if (cpuMaxFreq > 0) {
            return cpuMaxFreq;
        }
        long j = 0;
        for (int i = 0; i < getNumOfCores(); i++) {
            long parseLong = NumberUtils.parseLong(FileUtils.readFile("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq"), 0L);
            if (parseLong > j) {
                j = parseLong;
            }
        }
        cpuMaxFreq = j;
        return j;
    }

    private static long obtainMinFreq() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "10ed061ec4de04b96c3baaa248c99c20", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "10ed061ec4de04b96c3baaa248c99c20")).longValue();
        }
        if (cpuMinFreq > 0) {
            return cpuMinFreq;
        }
        long j = Long.MAX_VALUE;
        for (int i = 0; i < getNumOfCores(); i++) {
            long parseLong = NumberUtils.parseLong(FileUtils.readFile("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_min_freq"), 0L);
            if (parseLong < j && parseLong > 0) {
                j = parseLong;
            }
        }
        if (j == Long.MAX_VALUE) {
            return 0L;
        }
        cpuMinFreq = j;
        return j;
    }

    @Deprecated
    public static String queryAppMemory(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3ba38bd79ce14a04dd2252d863c8275b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3ba38bd79ce14a04dd2252d863c8275b");
        }
        long maxAppMemory = getMaxAppMemory(context);
        return maxAppMemory > 0 ? String.valueOf(maxAppMemory) : "N/A";
    }

    @Deprecated
    public static String queryTotalAppMemory(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c45210e1f2c6530bbdea26dcd8cb3a4b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c45210e1f2c6530bbdea26dcd8cb3a4b");
        }
        long totalAppMemory = getTotalAppMemory(context);
        return totalAppMemory > 0 ? String.valueOf(totalAppMemory) : "N/A";
    }

    public static String queryPhoneMemory(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "29d824dd43936ca9d959d820cc68b652", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "29d824dd43936ca9d959d820cc68b652");
        }
        long maxPhoneMemory = getMaxPhoneMemory(context);
        return maxPhoneMemory > 0 ? String.valueOf(maxPhoneMemory) : "N/A";
    }

    @Deprecated
    public static String queryTotalPhoneMemory(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "17e3840879734df7c8b61e78456bfd98", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "17e3840879734df7c8b61e78456bfd98");
        }
        long maxPhoneMemory = getMaxPhoneMemory(context);
        if (maxPhoneMemory > 0) {
            long memoryAvailable = maxPhoneMemory - getMemoryAvailable(context);
            return memoryAvailable > 0 ? String.valueOf(memoryAvailable) : "N/A";
        }
        return "N/A";
    }

    private static long getMaxPhoneMemory(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d6669f6ae1bd81a241b29a4c10161a6d", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d6669f6ae1bd81a241b29a4c10161a6d")).longValue();
        }
        if (maxMemPhone > 0) {
            return maxMemPhone;
        }
        if (Build.VERSION.SDK_INT >= 16 && context != null) {
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
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.statistics.utils.DeviceUtil.changeQuickRedirect
            java.lang.String r11 = "ad75f826574085803d47c54bb5a77993"
            r2 = 0
            r4 = 1
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
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
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.statistics.utils.DeviceUtil.getMemory(java.lang.String):long");
    }

    private static long getMaxAppMemory(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "38d1036772a5b66efaffafc0935bf7d2", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "38d1036772a5b66efaffafc0935bf7d2")).longValue();
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "794574cdf910d4b4e19e4f687d1d066f", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "794574cdf910d4b4e19e4f687d1d066f")).longValue();
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ed52e47cff8d57326ed3f9f968c6f45e", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ed52e47cff8d57326ed3f9f968c6f45e")).longValue();
        }
        if (Build.VERSION.SDK_INT >= 16 && context != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getMemoryInfo(memoryInfo);
            return memoryInfo.availMem;
        }
        return getMemory("MemAvailable:");
    }

    public static boolean isXiaomiOS10and11() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "37a833381f09ad673a645f4daaa0eab4", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "37a833381f09ad673a645f4daaa0eab4")).booleanValue();
        }
        String str = Build.BRAND;
        String str2 = Build.VERSION.RELEASE;
        return ("xiaomi".equalsIgnoreCase(str) || "redmi".equalsIgnoreCase(str)) && ("11".equals(str2) || "10".equals(str2));
    }

    public static boolean isPrivacyMode(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7be1462b40cd3f1a778f17b8b4952f4e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7be1462b40cd3f1a778f17b8b4952f4e")).booleanValue();
        }
        e createPermissionGuard = Privacy.createPermissionGuard();
        return createPermissionGuard != null && createPermissionGuard.a(context);
    }

    public static String getScreenDPI(Context context) {
        DisplayMetrics displayMetrics;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f94a301dfec6cf3c21d4e0fdd48ab914", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f94a301dfec6cf3c21d4e0fdd48ab914") : (context == null || context.getResources() == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) ? "unKnown" : String.valueOf(displayMetrics.density);
    }

    public static long getAppCpuTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "80cb45cf966b95cd7be03cac31d26d9c", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "80cb45cf966b95cd7be03cac31d26d9c")).longValue();
        }
        try {
            int myPid = Process.myPid();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + myPid + "/stat")), 1000);
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            String[] split = readLine.split(StringUtil.SPACE);
            return Long.parseLong(split[13]) + Long.parseLong(split[14]) + Long.parseLong(split[15]) + Long.parseLong(split[16]);
        } catch (Exception unused) {
            return 0L;
        }
    }
}
