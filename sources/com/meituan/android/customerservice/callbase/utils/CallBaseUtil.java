package com.meituan.android.customerservice.callbase.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.legwork.bean.monitor.DaBaiBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.meituan.takeoutnew.util.aop.f;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CallBaseUtil {
    private static final String CIP_CHANNEL = "customerservice_voip";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int long2int(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ea5738f09f9e3bfdc2ef199456e94740", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ea5738f09f9e3bfdc2ef199456e94740")).intValue();
        }
        int i = (int) (j & 4294967295L);
        return i == 0 ? (int) ((j >>> 32) & 4294967295L) : i;
    }

    public static final ConnectivityManager getConnectivityManager(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "889212daedede001ced4fff108987fbf", RobustBitConfig.DEFAULT_VALUE) ? (ConnectivityManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "889212daedede001ced4fff108987fbf") : (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static String getStackTraceMessage(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d3ae82122f6b965ac596517674b6faa4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d3ae82122f6b965ac596517674b6faa4");
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        String obj = stringWriter.toString();
        printWriter.close();
        return obj;
    }

    public static boolean isPhoneCalling(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a1371a8af266be44a3b9c4a65a62d1dc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a1371a8af266be44a3b9c4a65a62d1dc")).booleanValue() : ((TelephonyManager) context.getApplicationContext().getSystemService("phone")).getCallState() != 0;
    }

    public static NetworkInfo getAvailableNetworkInfo(Context context) {
        NetworkInfo activeNetworkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c13a654ef16c353a16a99cbbe5b17b44", RobustBitConfig.DEFAULT_VALUE)) {
            return (NetworkInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c13a654ef16c353a16a99cbbe5b17b44");
        }
        ConnectivityManager connectivityManager = getConnectivityManager(context);
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return null;
        }
        return activeNetworkInfo;
    }

    public static boolean isNetworkAvailable(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "39f7ab50a66f9d9011606f0b687a26c1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "39f7ab50a66f9d9011606f0b687a26c1")).booleanValue() : getAvailableNetworkInfo(context) != null;
    }

    public static boolean isConnectedToWifi(Context context) {
        NetworkInfo networkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e3fb6d3d4c989a68d022f5e61725dd28", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e3fb6d3d4c989a68d022f5e61725dd28")).booleanValue();
        }
        ConnectivityManager connectivityManager = getConnectivityManager(context);
        return (connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(1)) == null || !networkInfo.isConnected()) ? false : true;
    }

    public static String formatDuration(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "87055baa3f2f97d4b62530feb7cc15ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "87055baa3f2f97d4b62530feb7cc15ab");
        }
        StringBuilder sb = new StringBuilder();
        int i2 = i / DaBaiBean.DABAI_DATA_EXPIRE_TIME;
        if (i2 > 0) {
            sb.append(String.format("%02d:", Integer.valueOf(i2)));
        }
        int i3 = i % DaBaiBean.DABAI_DATA_EXPIRE_TIME;
        int i4 = i3 / 60;
        if (i4 > 0) {
            sb.append(String.format("%02d:", Integer.valueOf(i4)));
        } else {
            sb.append("00:");
        }
        sb.append(String.format("%02d", Integer.valueOf(i3 % 60)));
        return sb.toString();
    }

    public static boolean isApplicationOnForeground(Context context) {
        boolean z = false;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "00c8c3671efeed457617d06e77e66a27", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "00c8c3671efeed457617d06e77e66a27")).booleanValue();
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.contains(context.getPackageName()) && runningAppProcessInfo.importance == 100) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static boolean checkSelfPermission(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bacf9e3c964f1a881a22e645d9af5f24", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bacf9e3c964f1a881a22e645d9af5f24")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("permission is null");
        }
        return f.a(context, str, Process.myPid(), Process.myUid()) == 0;
    }

    public static String getCachePath(Context context, String str) {
        File b;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7f2acd563919ad412c29b5386216af9c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7f2acd563919ad412c29b5386216af9c");
        }
        if ("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) {
            b = q.b(context, CIP_CHANNEL, str);
        } else {
            b = q.a(context, CIP_CHANNEL, str);
        }
        if (b == null) {
            return null;
        }
        return b.getPath();
    }
}
