package com.meituan.android.common.fingerprint.utils;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.android.privacy.aop.e;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.io.File;
import java.io.FileFilter;
import java.io.RandomAccessFile;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CommonFingerItemCache {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String devicePixels;
    public static String CpuStyle = System.getProperty("os.arch");
    private static String macAddress = "unknown";
    private static int densityDpi = 0;
    private static String cpuMaxFreq = "unknown";
    private static int cpuCore = 0;
    private static long firstLaunchTime = 0;
    private static long installTime = 0;
    private static String appVersion = "Unknown";

    public static String getMacAddress(Context context, String str) {
        WifiInfo connectionInfo;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1ceecaa61c8d25f6625160160f81828b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1ceecaa61c8d25f6625160160f81828b");
        }
        if (!Permissions.isPermissionGranted("android.permission.ACCESS_WIFI_STATE", context) || !Permissions.isPermissionGrantedFromPrivacy("Locate.once", context, str)) {
            return macAddress;
        }
        if ((TextUtils.isEmpty(macAddress) || TextUtils.equals("unknown", macAddress)) && Build.VERSION.SDK_INT == 23) {
            try {
                macAddress = MacAddressUtils.getMacAddressByFile();
            } catch (Throwable th) {
                StringUtils.setErrorLogan(th);
            }
        }
        if ((TextUtils.isEmpty(macAddress) || TextUtils.equals("unknown", macAddress)) && (connectionInfo = Privacy.createWifiManager(context, str).getConnectionInfo()) != null) {
            macAddress = e.a(connectionInfo);
        }
        return macAddress;
    }

    public static int getDensityDpi(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0c5f3d1fbfdb78ca7cf2906e52e6575a", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0c5f3d1fbfdb78ca7cf2906e52e6575a")).intValue();
        }
        if (densityDpi == 0 && context != null) {
            densityDpi = context.getResources().getDisplayMetrics().densityDpi;
        }
        return densityDpi;
    }

    public static String getCpuMaxFreq() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e18c9f9d7913998b99f06bce7410616", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e18c9f9d7913998b99f06bce7410616");
        }
        if (TextUtils.isEmpty(cpuMaxFreq) || TextUtils.equals("unknown", cpuMaxFreq)) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq", r.o);
                cpuMaxFreq = randomAccessFile.readLine();
                randomAccessFile.close();
            } catch (Throwable th) {
                StringUtils.setErrorLogan(th);
            }
        }
        return cpuMaxFreq;
    }

    public static String getDevicePixels(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "da2dcdac310c4e43ad0c8faeea806e88", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "da2dcdac310c4e43ad0c8faeea806e88");
        }
        if (TextUtils.isEmpty(devicePixels) || TextUtils.isEmpty(devicePixels)) {
            if (context == null) {
                devicePixels = "";
            } else {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                devicePixels = displayMetrics.widthPixels + CommonConstant.Symbol.COMMA + displayMetrics.heightPixels;
            }
        }
        return devicePixels;
    }

    public static int getCpuCore() {
        FileFilter fileFilter;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cfe35abea9b702cd8492380e465da4ef", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cfe35abea9b702cd8492380e465da4ef")).intValue();
        }
        if (cpuCore == 0) {
            try {
                File file = new File("/sys/devices/system/cpu/");
                fileFilter = CommonFingerItemCache$$Lambda$1.instance;
                cpuCore = file.listFiles(fileFilter).length;
            } catch (Throwable th) {
                cpuCore = 1;
                StringUtils.setErrorLogan(th);
            }
        }
        return cpuCore;
    }

    public static /* synthetic */ boolean lambda$getCpuCore$0(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "349a81d1e61e2a32a28efcc6407ccb0c", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "349a81d1e61e2a32a28efcc6407ccb0c")).booleanValue() : Pattern.matches("cpu[0-9]+", file.getName());
    }

    public static long getFirstLaunchTime(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2810c5727af8cbbf32a4551431e7ad51", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2810c5727af8cbbf32a4551431e7ad51")).longValue();
        }
        if (0 == firstLaunchTime) {
            firstLaunchTime = context.getSharedPreferences("mtcx", 0).getLong("firstLaunchTime", 0L);
        }
        return firstLaunchTime;
    }

    public static long getInstallTime(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1c5f10f1a845369fcb6ec971b4c52285", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1c5f10f1a845369fcb6ec971b4c52285")).longValue();
        }
        if (0 == installTime) {
            installTime = new File(context.getApplicationInfo().sourceDir).lastModified();
        }
        return installTime;
    }

    public static String getAppVersion(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "08fae7ec742d8080cd43cbfa7f5b3adc", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "08fae7ec742d8080cd43cbfa7f5b3adc");
        }
        if (TextUtils.isEmpty(appVersion) || TextUtils.equals("Unknown", appVersion)) {
            try {
                appVersion = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (Throwable th) {
                StringUtils.setErrorLogan(th);
            }
        }
        return appVersion;
    }
}
