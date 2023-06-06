package com.sankuai.eh.component.service.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.StrictMode;
import android.support.annotation.RequiresPermission;
import android.text.TextUtils;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.eh.component.service.tools.a;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public static volatile Boolean b;

    public static int a() {
        FileReader fileReader;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1acca9b1573c03d19d209326b4107116", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1acca9b1573c03d19d209326b4107116")).intValue();
        }
        Pattern compile = Pattern.compile("^MemTotal:\\s+([0-9]+) kB$");
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                fileReader = new FileReader("/proc/meminfo");
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (Exception e) {
            com.sankuai.eh.component.service.tools.d.a(e);
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                Matcher matcher = compile.matcher(readLine);
                if (matcher.find()) {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    if (parseInt > 1024) {
                        bufferedReader.close();
                        fileReader.close();
                        return parseInt;
                    }
                }
            }
            bufferedReader.close();
            fileReader.close();
            return 0;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (th != null) {
                    try {
                        fileReader.close();
                    } catch (Throwable unused) {
                    }
                } else {
                    fileReader.close();
                }
                throw th2;
            }
        }
    }

    public static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b46c8d0685194d60ee308a962f00937", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b46c8d0685194d60ee308a962f00937");
        }
        if (obj == null) {
            return "";
        }
        return obj.getClass().getSimpleName() + obj.hashCode();
    }

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac6d57fd11314b6236bc7a256924d9bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac6d57fd11314b6236bc7a256924d9bf");
        }
        try {
            String packageName = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningTasks(1).get(0).topActivity.getPackageName();
            return !TextUtils.isEmpty(packageName) ? packageName.equals(context.getPackageName()) ? "foreground" : "background" : "background";
        } catch (Exception unused) {
            return "error";
        }
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static boolean b(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84c0b1ba3d723be390206e9573c32ebf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84c0b1ba3d723be390206e9573c32ebf")).booleanValue() : (context instanceof Activity) && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED;
    }

    public static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59af7e26cdfbba37dd82858955938dcf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59af7e26cdfbba37dd82858955938dcf");
        }
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i2 = 0; i2 < i; i2++) {
            if (Constants.CHAR.equalsIgnoreCase(random.nextInt(2) % 2 == 0 ? Constants.CHAR : RaptorConstants.JS_BATCH_NUM)) {
                sb.append((char) ((random.nextInt(2) % 2 == 0 ? 65 : 97) + random.nextInt(26)));
            } else {
                sb.append(random.nextInt(10));
            }
        }
        return sb.toString();
    }

    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5e706bda91cc7182cd72ff669fafe72", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5e706bda91cc7182cd72ff669fafe72") : a(System.currentTimeMillis());
    }

    public static String a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f403afa6231715d1f6ed319ec3281f8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f403afa6231715d1f6ed319ec3281f8") : new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j));
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b47173a63624f381bfdea257ab94083", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b47173a63624f381bfdea257ab94083") : new SimpleDateFormat("HH:mm:ss:SSS").format(Long.valueOf(System.currentTimeMillis()));
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53a56aec85c3e82e74b998d9e8baa7e9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53a56aec85c3e82e74b998d9e8baa7e9")).booleanValue();
        }
        try {
            Runtime runtime = Runtime.getRuntime();
            Process exec = runtime.exec("ping -c 2 -i 0.3 -w 2 " + str);
            int waitFor = exec.waitFor();
            if (a.C0548a.a.a()) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    stringBuffer.append(readLine);
                }
                com.sankuai.eh.component.service.tools.d.a("ping_test", "test" + stringBuffer.toString() + "  status:" + waitFor);
            }
            return waitFor == 0;
        } catch (Exception unused) {
            return false;
        }
    }
}
