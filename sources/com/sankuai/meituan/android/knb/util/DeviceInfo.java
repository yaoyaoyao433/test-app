package com.sankuai.meituan.android.knb.util;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.os.BatteryManager;
import android.os.Build;
import android.util.Log;
import android.view.WindowManager;
import com.alipay.sdk.app.PayTask;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.waimai.platform.utils.f;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class DeviceInfo {
    private static final FileFilter CPU_FILTER = new FileFilter() { // from class: com.sankuai.meituan.android.knb.util.DeviceInfo.1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            Object[] objArr = {file};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bbb9a301b82dde7bad7062a2418d469", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bbb9a301b82dde7bad7062a2418d469")).booleanValue();
            }
            String name = file.getName();
            if (name.startsWith(Constants.CPU)) {
                for (int i = 3; i < name.length(); i++) {
                    if (!Character.isDigit(name.charAt(i))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
    };
    private static int DEVICEINFO_UNKNOWN = -1;
    private static String TAG = "DeviceInfo";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum DeviceLevel {
        LOW(0),
        MID(1),
        MID_HIGHT(2),
        HIGH(3);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public int value;

        public static DeviceLevel valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8c002ec301b3592b5b66854a42677dc0", RobustBitConfig.DEFAULT_VALUE) ? (DeviceLevel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8c002ec301b3592b5b66854a42677dc0") : (DeviceLevel) Enum.valueOf(DeviceLevel.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static DeviceLevel[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f31b83e6b4e44609f7221b9f9eb5f8d8", RobustBitConfig.DEFAULT_VALUE) ? (DeviceLevel[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f31b83e6b4e44609f7221b9f9eb5f8d8") : (DeviceLevel[]) values().clone();
        }

        DeviceLevel(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c55adf62d4ee8e1d5c3033524d37c29f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c55adf62d4ee8e1d5c3033524d37c29f");
            } else {
                this.value = i;
            }
        }

        public final int getValue() {
            return this.value;
        }
    }

    public static Point getScreenRealSize(Context context, Point point) {
        Object[] objArr = {context, point};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9a52551be24ab763099c5537d006412f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Point) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9a52551be24ab763099c5537d006412f");
        }
        if (point == null) {
            point = new Point(0, 0);
        }
        if (context == null) {
            return point;
        }
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        return point;
    }

    public static int getRemainingBattery(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "df08f208c0207c3a8ddac4df6677695d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "df08f208c0207c3a8ddac4df6677695d")).intValue();
        }
        if (context == null) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return ((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4);
        }
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return f.a(registerReceiver, "level", -1);
        }
        return -1;
    }

    public static DeviceLevel getCPULevel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "67e79deb084776217549af0fca372315", RobustBitConfig.DEFAULT_VALUE)) {
            return (DeviceLevel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "67e79deb084776217549af0fca372315");
        }
        int cPUMaxFreqKHz = getCPUMaxFreqKHz() / 1000;
        if (cPUMaxFreqKHz <= 1600) {
            return DeviceLevel.LOW;
        }
        if (cPUMaxFreqKHz <= 2000) {
            return DeviceLevel.MID;
        }
        if (cPUMaxFreqKHz <= 2500) {
            return DeviceLevel.MID_HIGHT;
        }
        return DeviceLevel.HIGH;
    }

    public static DeviceLevel getMemoryLevel(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3ea3ee3b4d35408ad035b7a396f34b96", RobustBitConfig.DEFAULT_VALUE)) {
            return (DeviceLevel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3ea3ee3b4d35408ad035b7a396f34b96");
        }
        long totalMemory = getTotalMemory(context) / 1048576;
        if (totalMemory <= PayTask.j) {
            return DeviceLevel.LOW;
        }
        if (totalMemory <= 4000) {
            return DeviceLevel.MID;
        }
        if (totalMemory <= 6000) {
            return DeviceLevel.MID_HIGHT;
        }
        return DeviceLevel.HIGH;
    }

    public static DeviceLevel getAvailMemoryLevel(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1d7342f05c53a6173a2a5dc3df7e31b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (DeviceLevel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1d7342f05c53a6173a2a5dc3df7e31b4");
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getMemoryInfo(memoryInfo);
        if (memoryInfo.availMem / 1048576 < 1000) {
            return DeviceLevel.MID;
        }
        return DeviceLevel.HIGH;
    }

    @TargetApi(16)
    private static long getTotalMemory(Context context) {
        FileInputStream fileInputStream;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "db1d02f02e80947c099f121d01e5b67e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "db1d02f02e80947c099f121d01e5b67e")).longValue();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        }
        long j = DEVICEINFO_UNKNOWN;
        try {
            j = parseFileForValue("MemTotal", fileInputStream) * 1024;
            new FileInputStream("/proc/meminfo").close();
        } catch (IOException unused) {
            Log.e(TAG, "error gtm");
        }
        return j;
    }

    private static int getCPUMaxFreqKHz() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a5e3691b0e52b3a165f74dd4429677b7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a5e3691b0e52b3a165f74dd4429677b7")).intValue();
        }
        int i = DEVICEINFO_UNKNOWN;
        for (int i2 = 0; i2 < getNumberOfCPUCores(); i2++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[128];
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            fileInputStream.read(bArr);
                            int i3 = 0;
                            while (Character.isDigit(bArr[i3]) && i3 < 128) {
                                i3++;
                            }
                            Integer valueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i3)));
                            if (valueOf.intValue() > i) {
                                i = valueOf.intValue();
                            }
                            fileInputStream.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                                break;
                            } catch (Throwable th2) {
                                if (th != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th3) {
                                        th.addSuppressed(th3);
                                    }
                                } else {
                                    fileInputStream.close();
                                }
                                throw th2;
                                break;
                            }
                        }
                    } catch (NumberFormatException unused) {
                        Log.e(TAG, "error nfe");
                    }
                }
            } catch (IOException unused2) {
                return DEVICEINFO_UNKNOWN;
            }
        }
        if (i == DEVICEINFO_UNKNOWN) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
                int parseFileForValue = parseFileForValue("cpu MHz", fileInputStream2) * 1000;
                if (parseFileForValue > i) {
                    i = parseFileForValue;
                }
                fileInputStream2.close();
                return i;
            } catch (Exception unused3) {
                Log.e(TAG, "error gcpumfkhz");
                return i;
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int parseFileForValue(java.lang.String r12, java.io.FileInputStream r13) throws java.io.IOException {
        /*
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r9 = 1
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.meituan.android.knb.util.DeviceInfo.changeQuickRedirect
            java.lang.String r11 = "7bfe339173d70f0547c293e39e9a795a"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L26
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r9, r11)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            return r12
        L26:
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
            int r13 = r13.read(r0)
        L2e:
            if (r8 >= r13) goto L5c
            r1 = r0[r8]
            r2 = 10
            if (r1 == r2) goto L38
            if (r8 != 0) goto L5a
        L38:
            r1 = r0[r8]
            if (r1 != r2) goto L3e
            int r8 = r8 + 1
        L3e:
            r1 = r8
        L3f:
            if (r1 >= r13) goto L5a
            int r2 = r1 - r8
            r3 = r0[r1]
            char r4 = r12.charAt(r2)
            if (r3 != r4) goto L5a
            int r3 = r12.length()
            int r3 = r3 - r9
            if (r2 != r3) goto L57
            int r12 = extractValue(r0, r1)
            return r12
        L57:
            int r1 = r1 + 1
            goto L3f
        L5a:
            int r8 = r8 + r9
            goto L2e
        L5c:
            int r12 = com.sankuai.meituan.android.knb.util.DeviceInfo.DEVICEINFO_UNKNOWN
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.android.knb.util.DeviceInfo.parseFileForValue(java.lang.String, java.io.FileInputStream):int");
    }

    private static int extractValue(byte[] bArr, int i) {
        Object[] objArr = {bArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "288997d36117a090c84a01a09d64fddd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "288997d36117a090c84a01a09d64fddd")).intValue();
        }
        while (i < bArr.length && bArr[i] != 10) {
            if (Character.isDigit(bArr[i])) {
                int i2 = i + 1;
                while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return Integer.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return DEVICEINFO_UNKNOWN;
    }

    private static int getNumberOfCPUCores() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "60721e5c9b77ca25b207fb2246f4590b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "60721e5c9b77ca25b207fb2246f4590b")).intValue();
        }
        if (Build.VERSION.SDK_INT <= 10) {
            return 1;
        }
        try {
            int coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/possible");
            if (coresFromFileInfo == DEVICEINFO_UNKNOWN) {
                coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/present");
            }
            return coresFromFileInfo == DEVICEINFO_UNKNOWN ? new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER).length : coresFromFileInfo;
        } catch (NullPointerException unused) {
            return DEVICEINFO_UNKNOWN;
        } catch (SecurityException unused2) {
            return DEVICEINFO_UNKNOWN;
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
    private static int getCoresFromFileInfo(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.meituan.android.knb.util.DeviceInfo.changeQuickRedirect
            java.lang.String r10 = "b9a8ae3dad3cb8e0ab65cc496f09cf03"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r0, r10)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            return r12
        L22:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L87
            r0.<init>(r12)     // Catch: java.lang.Exception -> L87
            java.io.InputStreamReader r12 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L75
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L75
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r12)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Throwable -> L46
            int r3 = getCoresFromFileString(r3)     // Catch: java.lang.Throwable -> L46
            r1.close()     // Catch: java.lang.Throwable -> L5e
            r12.close()     // Catch: java.lang.Throwable -> L75
            r0.close()     // Catch: java.lang.Exception -> L87
            return r3
        L43:
            r3 = move-exception
            r4 = r2
            goto L4c
        L46:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L48
        L48:
            r4 = move-exception
            r11 = r4
            r4 = r3
            r3 = r11
        L4c:
            if (r4 == 0) goto L57
            r1.close()     // Catch: java.lang.Throwable -> L52
            goto L5a
        L52:
            r1 = move-exception
            r4.addSuppressed(r1)     // Catch: java.lang.Throwable -> L5e
            goto L5a
        L57:
            r1.close()     // Catch: java.lang.Throwable -> L5e
        L5a:
            throw r3     // Catch: java.lang.Throwable -> L5e
        L5b:
            r1 = move-exception
            r3 = r2
            goto L64
        L5e:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L60
        L60:
            r3 = move-exception
            r11 = r3
            r3 = r1
            r1 = r11
        L64:
            if (r3 == 0) goto L6f
            r12.close()     // Catch: java.lang.Throwable -> L6a
            goto L72
        L6a:
            r12 = move-exception
            r3.addSuppressed(r12)     // Catch: java.lang.Throwable -> L75
            goto L72
        L6f:
            r12.close()     // Catch: java.lang.Throwable -> L75
        L72:
            throw r1     // Catch: java.lang.Throwable -> L75
        L73:
            r12 = move-exception
            goto L78
        L75:
            r12 = move-exception
            r2 = r12
            throw r2     // Catch: java.lang.Throwable -> L73
        L78:
            if (r2 == 0) goto L83
            r0.close()     // Catch: java.lang.Throwable -> L7e
            goto L86
        L7e:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.lang.Exception -> L87
            goto L86
        L83:
            r0.close()     // Catch: java.lang.Exception -> L87
        L86:
            throw r12     // Catch: java.lang.Exception -> L87
        L87:
            java.lang.String r12 = com.sankuai.meituan.android.knb.util.DeviceInfo.TAG
            java.lang.String r0 = "error gcffi"
            android.util.Log.e(r12, r0)
            int r12 = com.sankuai.meituan.android.knb.util.DeviceInfo.DEVICEINFO_UNKNOWN
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.android.knb.util.DeviceInfo.getCoresFromFileInfo(java.lang.String):int");
    }

    private static int getCoresFromFileString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "55f4702fcd49dceaa7984ac2a231f4d2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "55f4702fcd49dceaa7984ac2a231f4d2")).intValue();
        }
        if (str == null || !str.matches("0-[\\d]+$")) {
            return DEVICEINFO_UNKNOWN;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }
}
