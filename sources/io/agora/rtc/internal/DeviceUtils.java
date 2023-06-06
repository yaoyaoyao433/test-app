package io.agora.rtc.internal;

import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import com.meituan.metrics.common.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class DeviceUtils {
    public static final int DEVICE_INFO_UNKNOWN = -1;
    private static final String TAG = "DeviceUtils";
    private static final String[] H264_HW_BLACKLIST = {"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4", "P6-C00", "HM 2A", "XT105", "XT109", "XT1060"};
    private static final FileFilter CPU_FILTER = new FileFilter() { // from class: io.agora.rtc.internal.DeviceUtils.1
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
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

    public static String getDeviceId() {
        String str = Build.MANUFACTURER + "/" + Build.MODEL + "/" + Build.PRODUCT + "/" + Build.DEVICE + "/" + Build.VERSION.SDK_INT + "/" + System.getProperty("os.version");
        if (str != null) {
            str = str.toLowerCase();
        }
        Matcher matcher = Pattern.compile(".*[A-Z][A-M][0-9]$").matcher(Build.ID);
        if (Build.BRAND.toLowerCase().equals("samsung") && Build.DEVICE.toLowerCase().startsWith("cs02") && !matcher.find() && Build.VERSION.SDK_INT == 19) {
            return "yeshen/simulator/" + Build.MODEL + "/" + Build.PRODUCT + "/" + Build.DEVICE + "/" + Build.VERSION.SDK_INT + "/" + System.getProperty("os.version");
        }
        return str;
    }

    public static String getDeviceInfo() {
        String str = Build.MANUFACTURER + "/" + Build.MODEL;
        return str != null ? str.toLowerCase() : str;
    }

    public static String getSystemInfo() {
        return "Android/" + Build.VERSION.RELEASE;
    }

    public static int selectFrontCamera() {
        try {
            return Camera.getNumberOfCameras() > 1 ? 1 : 0;
        } catch (Exception e) {
            Log.e(TAG, e.toString());
            return 0;
        }
    }

    public static int getNumberOfCameras() {
        try {
            return Camera.getNumberOfCameras();
        } catch (Exception e) {
            Log.e(TAG, e.toString());
            return 0;
        }
    }

    public static int getRecommendedEncoderType() {
        if (!Arrays.asList(H264_HW_BLACKLIST).contains(Build.MODEL)) {
            return Build.VERSION.SDK_INT <= 18 ? 1 : 0;
        }
        Logging.w(TAG, "Model: " + Build.MODEL + " has black listed H.264 encoder.");
        return 1;
    }

    public static int getNumberOfCPUCores() {
        if (Build.VERSION.SDK_INT <= 10) {
            return 1;
        }
        try {
            int coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/possible");
            if (coresFromFileInfo == -1) {
                coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/present");
            }
            if (coresFromFileInfo == -1) {
                coresFromFileInfo = getCoresFromCPUFileList();
            }
            return coresFromFileInfo;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    public static String getCpuName() {
        FileReader fileReader;
        FileReader fileReader2 = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                fileReader = new FileReader("/proc/cpuinfo");
            } catch (IOException e) {
                Logging.e(TAG, "failed to close proc file", e);
                return null;
            }
            try {
                String[] split = new BufferedReader(fileReader).readLine().split(":\\s+", 2);
                fileReader.close();
                String str = split[1];
                try {
                    fileReader.close();
                } catch (IOException e2) {
                    Logging.e(TAG, "failed to close proc file", e2);
                }
                return str;
            } catch (FileNotFoundException e3) {
                e = e3;
                Logging.e(TAG, "getCpuName failed, no /proc/cpuinfo found in system", e);
                if (fileReader != null) {
                    fileReader.close();
                }
                return null;
            } catch (IOException e4) {
                e = e4;
                Logging.e(TAG, "getCpuName failed,", e);
                if (fileReader != null) {
                    fileReader.close();
                }
                return null;
            }
        } catch (FileNotFoundException e5) {
            e = e5;
            fileReader = null;
        } catch (IOException e6) {
            e = e6;
            fileReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                try {
                    fileReader2.close();
                } catch (IOException e7) {
                    Logging.e(TAG, "failed to close proc file", e7);
                }
            }
            throw th;
        }
    }

    public static String getCpuABI() {
        return Build.CPU_ABI;
    }

    private static int getCoresFromFileInfo(String str) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                String readLine = new BufferedReader(new InputStreamReader(fileInputStream)).readLine();
                fileInputStream.close();
                int coresFromFileString = getCoresFromFileString(readLine);
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    Logging.e(TAG, "close file stream", e);
                }
                return coresFromFileString;
            } catch (IOException unused) {
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                        return -1;
                    } catch (IOException e2) {
                        Logging.e(TAG, "close file stream", e2);
                        return -1;
                    }
                }
                return -1;
            } catch (Throwable th) {
                th = th;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e3) {
                        Logging.e(TAG, "close file stream", e3);
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    private static int getCoresFromFileString(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    private static int getCoresFromCPUFileList() {
        return new File("/sys/devices/system/cpu").listFiles(CPU_FILTER).length;
    }

    public static int getCPUMaxFreqKHz() {
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < getNumberOfCPUCores(); i3++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i3 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i4 = 0;
                        while (Character.isDigit(bArr[i4]) && i4 < 128) {
                            i4++;
                        }
                        Integer valueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i4)));
                        if (valueOf.intValue() > i2) {
                            i2 = valueOf.intValue();
                        }
                    } catch (NumberFormatException unused) {
                    }
                    fileInputStream.close();
                }
            } catch (IOException unused2) {
                return i;
            }
        }
        if (i2 == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            int parseFileForValue = parseFileForValue("cpu MHz", fileInputStream2) * 1000;
            if (parseFileForValue <= i2) {
                parseFileForValue = i2;
            }
            fileInputStream2.close();
            i = parseFileForValue;
            return i;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0036, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int parseFileForValue(java.lang.String r6, java.io.FileInputStream r7) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
            int r7 = r7.read(r0)     // Catch: java.lang.Throwable -> L39
            r1 = 0
        L9:
            if (r1 >= r7) goto L39
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L39
            r3 = 10
            if (r2 == r3) goto L13
            if (r1 != 0) goto L36
        L13:
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L39
            if (r2 != r3) goto L19
            int r1 = r1 + 1
        L19:
            r2 = r1
        L1a:
            if (r2 >= r7) goto L36
            int r3 = r2 - r1
            r4 = r0[r2]     // Catch: java.lang.Throwable -> L39
            char r5 = r6.charAt(r3)     // Catch: java.lang.Throwable -> L39
            if (r4 != r5) goto L36
            int r4 = r6.length()     // Catch: java.lang.Throwable -> L39
            int r4 = r4 + (-1)
            if (r3 != r4) goto L33
            int r6 = extractValue(r0, r2)     // Catch: java.lang.Throwable -> L39
            return r6
        L33:
            int r2 = r2 + 1
            goto L1a
        L36:
            int r1 = r1 + 1
            goto L9
        L39:
            r6 = -1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.internal.DeviceUtils.parseFileForValue(java.lang.String, java.io.FileInputStream):int");
    }

    private static int extractValue(byte[] bArr, int i) {
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
        return -1;
    }
}
