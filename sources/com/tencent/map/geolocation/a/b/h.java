package com.tencent.map.geolocation.a.b;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.robust.common.CommonConstant;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h {
    public static final Object a = new Object();
    public static String b = "complist_loading";
    public static long c = 0;
    private static HashMap<String, i> d = new HashMap<>();

    private static double a(double d2) {
        return (d2 * 3.141592653589793d) / 180.0d;
    }

    private static i c(Context context, String str) {
        if (d.containsKey(str)) {
            return d.get(str);
        }
        i iVar = new i(context.getFilesDir().getAbsolutePath() + "/TencentLocation/conf/" + str);
        d.put(str, iVar);
        return iVar;
    }

    public static boolean a(Context context, String str, String str2) {
        return c(context, str).a(str2.getBytes());
    }

    public static boolean a(Context context, String str, Long l) {
        return c(context, str).a(String.valueOf(l).getBytes());
    }

    public static boolean a(Context context, String str) {
        return c(context, str).a("0".getBytes());
    }

    public static String b(Context context, String str, String str2) {
        return c(context, str).a(str2);
    }

    public static Long b(Context context, String str, Long l) {
        try {
            return Long.valueOf(Long.parseLong(c(context, str).a(String.valueOf(l))));
        } catch (Exception unused) {
            return l;
        }
    }

    public static String a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String str = packageInfo.versionName;
            int i = packageInfo.versionCode;
            if (str != null && str.trim().length() > 0) {
                return str;
            }
            return String.valueOf(i);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(Context context) {
        return context.getFilesDir().getAbsolutePath() + File.separator + "TencentLocation/comp";
    }

    public static List<String> a(File file) {
        File[] listFiles;
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : listFiles) {
            arrayList.add(file2.getName() + CommonConstant.Symbol.COMMA + file2.length() + CommonConstant.Symbol.COMMA + b(file2));
        }
        return arrayList;
    }

    public static String c(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            return bundle != null ? bundle.containsKey("TencentGeoLocationSDK") ? bundle.getString("TencentGeoLocationSDK") : bundle.containsKey("TencentMapSDK") ? bundle.getString("TencentMapSDK") : "" : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String d(Context context) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        return runningAppProcessInfo.processName;
                    }
                }
            }
            bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
            try {
                String trim = bufferedReader.readLine().trim();
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return trim;
            } catch (Exception unused2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static int a() {
        return Process.myPid();
    }

    public static String b(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        if (!file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            fileInputStream = new FileInputStream(file);
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 1024);
                    if (read != -1) {
                        messageDigest.update(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    }
                } catch (Exception unused2) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            }
            fileInputStream.close();
            return c(messageDigest.digest());
        } catch (Exception unused5) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String a(String str) {
        try {
            return c(MessageDigest.getInstance("MD5").digest(str.getBytes()));
        } catch (Exception unused) {
            return str;
        }
    }

    private static String c(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString().toLowerCase();
    }

    public static long b() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static boolean e(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.getType() == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void a(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    public static byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayInputStream byteArrayInputStream;
        GZIPInputStream gZIPInputStream;
        GZIPInputStream gZIPInputStream2 = null;
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byteArrayInputStream = new ByteArrayInputStream(bArr);
                            try {
                                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                try {
                                    byte[] bArr2 = new byte[307200];
                                    while (true) {
                                        int read = gZIPInputStream.read(bArr2);
                                        if (read < 0) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr2, 0, read);
                                    }
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    try {
                                        gZIPInputStream.close();
                                        byteArrayInputStream.close();
                                        byteArrayOutputStream.close();
                                    } catch (Exception unused) {
                                    }
                                    return byteArray;
                                } catch (Error unused2) {
                                    if (gZIPInputStream != null) {
                                        gZIPInputStream.close();
                                    }
                                    if (byteArrayInputStream != null) {
                                        byteArrayInputStream.close();
                                    }
                                    if (byteArrayOutputStream == null) {
                                        return null;
                                    }
                                    byteArrayOutputStream.close();
                                    return null;
                                } catch (Exception unused3) {
                                    if (gZIPInputStream != null) {
                                        gZIPInputStream.close();
                                    }
                                    if (byteArrayInputStream != null) {
                                        byteArrayInputStream.close();
                                    }
                                    if (byteArrayOutputStream == null) {
                                        return null;
                                    }
                                    byteArrayOutputStream.close();
                                    return null;
                                } catch (Throwable th) {
                                    gZIPInputStream2 = gZIPInputStream;
                                    th = th;
                                    if (gZIPInputStream2 != null) {
                                        try {
                                            gZIPInputStream2.close();
                                        } catch (Exception unused4) {
                                            throw th;
                                        }
                                    }
                                    if (byteArrayInputStream != null) {
                                        byteArrayInputStream.close();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Error unused5) {
                                gZIPInputStream = null;
                            } catch (Exception unused6) {
                                gZIPInputStream = null;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Error unused7) {
                            gZIPInputStream = null;
                            byteArrayInputStream = null;
                        } catch (Exception unused8) {
                            gZIPInputStream = null;
                            byteArrayInputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            byteArrayInputStream = null;
                        }
                    } catch (Error unused9) {
                        gZIPInputStream = null;
                        byteArrayOutputStream = null;
                        byteArrayInputStream = null;
                    } catch (Exception unused10) {
                        gZIPInputStream = null;
                        byteArrayOutputStream = null;
                        byteArrayInputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        byteArrayOutputStream = null;
                        byteArrayInputStream = null;
                    }
                }
            } catch (Exception unused11) {
                return null;
            }
        }
        return null;
    }

    public static byte[] b(byte[] bArr) {
        byte[] bArr2 = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                bArr2 = byteArray;
                th = th;
                th.printStackTrace();
                return bArr2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static byte[] a(int i) {
        byte[] bArr = new byte[2];
        for (int i2 = 0; i2 < 2; i2++) {
            bArr[i2] = Integer.valueOf(i & 255).byteValue();
            i >>= 8;
        }
        return bArr;
    }

    public static List<com.tencent.map.geolocation.a.a.a> b(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str2 : str.split(";")) {
                String[] split = str2.split(CommonConstant.Symbol.COMMA);
                if (split.length >= 5) {
                    try {
                        com.tencent.map.geolocation.a.a.a aVar = new com.tencent.map.geolocation.a.a.a();
                        aVar.a = Integer.valueOf(split[0]).intValue();
                        aVar.b = split[1];
                        aVar.c = split[2];
                        aVar.d = Integer.valueOf(split[3]).intValue();
                        aVar.e = split[4];
                        if (split.length > 5) {
                            aVar.f = split[5];
                        }
                        arrayList.add(aVar);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return arrayList;
    }

    public static String c(String str) {
        JSONObject jSONObject;
        String string;
        try {
            jSONObject = new JSONObject(str);
            string = jSONObject.getString("status");
            com.tencent.map.geolocation.a.a.e.a().a("DRG", "statucode:".concat(String.valueOf(string)));
        } catch (Exception e) {
            com.tencent.map.geolocation.a.a.e a2 = com.tencent.map.geolocation.a.a.e.a();
            a2.a("DRG", "statucode:" + e.toString());
        }
        if (string.equals("-3")) {
            return null;
        }
        if (!string.equals("0")) {
            return (string.equals("-1") || string.equals(ErrorCode.ERROR_CODE_RESPONSE_NULL) || string.equals("-4") || !string.equals("-5")) ? null : null;
        }
        StringBuilder sb = new StringBuilder();
        JSONArray jSONArray = jSONObject.getJSONArray("compList");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            int i2 = jSONObject2.getInt("compId");
            String string2 = jSONObject2.getString("compVer");
            String string3 = jSONObject2.getString("md5");
            int i3 = jSONObject2.getInt(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE);
            String string4 = jSONObject2.getString("compName");
            sb.append(i2);
            sb.append(CommonConstant.Symbol.COMMA);
            sb.append(string2);
            sb.append(CommonConstant.Symbol.COMMA);
            sb.append(string4);
            sb.append(CommonConstant.Symbol.COMMA);
            sb.append(i3);
            sb.append(CommonConstant.Symbol.COMMA);
            sb.append(string3);
            sb.append(",;");
        }
        return sb.toString();
    }

    public static String a(List<com.tencent.map.geolocation.a.a.a> list) {
        StringBuilder sb = new StringBuilder();
        for (com.tencent.map.geolocation.a.a.a aVar : list) {
            sb.append(aVar.a);
            sb.append(CommonConstant.Symbol.COMMA);
            sb.append(aVar.b);
            sb.append(CommonConstant.Symbol.COMMA);
            if (!aVar.c.contains(".dex")) {
                aVar.c += ".dex";
            }
            sb.append(aVar.c);
            sb.append(CommonConstant.Symbol.COMMA);
            sb.append(aVar.d);
            sb.append(CommonConstant.Symbol.COMMA);
            sb.append(aVar.e);
            sb.append(CommonConstant.Symbol.COMMA);
            sb.append(aVar.f);
            sb.append(";");
        }
        return sb.toString();
    }

    public static boolean a(Context context, List<com.tencent.map.geolocation.a.a.a> list) {
        List<com.tencent.map.geolocation.a.a.a> b2 = b(b(context, "__SP_UPDATE_TencentLoc_COMP_INFO__", ""));
        if (list.size() == 0) {
            return false;
        }
        if (b2.size() == 0) {
            return a(context, "__SP_UPDATE_TencentLoc_COMP_INFO__", a(list));
        }
        for (int i = 0; i < b2.size(); i++) {
            com.tencent.map.geolocation.a.a.a aVar = b2.get(i);
            int i2 = 0;
            while (true) {
                if (i2 < list.size()) {
                    com.tencent.map.geolocation.a.a.a aVar2 = list.get(i2);
                    if (aVar2.a == aVar.a) {
                        aVar.c = aVar2.c;
                        aVar.b = aVar2.b;
                        aVar.d = aVar2.d;
                        aVar.e = aVar2.e;
                        break;
                    }
                    i2++;
                }
            }
        }
        return a(context, "__SP_UPDATE_TencentLoc_COMP_INFO__", a(b2));
    }

    public static boolean a(Context context, String str, String str2, String str3, byte[] bArr) {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        String str4 = str2 + File.separator + str3;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdir();
        }
        boolean z = false;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                inputStream = context.getResources().getAssets().open(str);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str4, true), 1024);
                        while (true) {
                            try {
                                int read = inputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                            } catch (Exception unused) {
                                bufferedOutputStream = bufferedOutputStream2;
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                return z;
                            } catch (Throwable th) {
                                th = th;
                                bufferedOutputStream = bufferedOutputStream2;
                                if (byteArrayOutputStream != null) {
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (IOException unused2) {
                                        throw th;
                                    }
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                throw th;
                            }
                        }
                        byte[] a2 = a(c.b(byteArrayOutputStream.toByteArray(), "sE0zy%DVqLnXA$hmNZ8NBwcg7FDrvi!q"));
                        if (a2 != null) {
                            bufferedOutputStream2.write(a2);
                            z = true;
                        }
                        byteArrayOutputStream.close();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        bufferedOutputStream2.close();
                    } catch (Exception unused3) {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception unused4) {
                    byteArrayOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = null;
                }
            } catch (IOException unused5) {
            }
        } catch (Exception unused6) {
            inputStream = null;
            byteArrayOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            byteArrayOutputStream = null;
        }
        return z;
    }

    private static boolean e(String str) {
        String[] list;
        File file = new File(str);
        if (file.exists() && (list = file.list()) != null && list.length > 0) {
            for (String str2 : list) {
                File file2 = new File(str, str2);
                if (file2.isDirectory()) {
                    e(file2.getAbsolutePath());
                    file2.delete();
                } else {
                    file2.delete();
                }
            }
            return true;
        }
        return false;
    }

    public static boolean a(String str, String str2, String str3, byte[] bArr) {
        FileInputStream fileInputStream;
        String str4 = str2 + File.separator + str3;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdir();
        }
        FileOutputStream fileOutputStream = null;
        boolean z = false;
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(str4);
                    while (true) {
                        try {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, read);
                        } catch (Exception unused) {
                            fileOutputStream = fileOutputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            return z;
                        } catch (Throwable th) {
                            fileOutputStream = fileOutputStream2;
                            th = th;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused2) {
                                    throw th;
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    }
                    z = true;
                    fileInputStream.close();
                    fileOutputStream2.close();
                } catch (Exception unused3) {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException unused4) {
            }
        } catch (Exception unused5) {
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
        return z;
    }

    public static boolean d(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
            return true;
        }
        String[] list = file.list();
        if (list != null && list.length > 0) {
            for (String str2 : list) {
                File file2 = new File(str, str2);
                if (file2.isDirectory()) {
                    e(file2.getAbsolutePath());
                    file2.delete();
                } else {
                    file2.delete();
                }
            }
        }
        return true;
    }

    public static String b(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            InputStream open = context.getAssets().open(str);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, "UTF-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            open.close();
        } catch (UnsupportedEncodingException | IOException unused) {
        }
        return sb.toString();
    }

    public static double a(double d2, double d3, double d4, double d5) {
        double a2 = a(d2);
        double a3 = a(d4);
        return (Math.round(((Math.asin(Math.sqrt(Math.pow(Math.sin((a2 - a3) / 2.0d), 2.0d) + ((Math.cos(a2) * Math.cos(a3)) * Math.pow(Math.sin((a(d3) - a(d5)) / 2.0d), 2.0d)))) * 2.0d) * 6378.137d) * 10000.0d) / 10000.0d) * 1000.0d;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:4|(2:5|6)|(5:8|9|10|(2:12|(13:14|15|16|(12:42|43|44|45|(1:47)(1:48)|(1:21)|(1:23)|(1:25)|(1:27)|(1:29)|(1:31)|32)|18|19|(0)|(0)|(0)|(0)|(0)|(0)|32))|56)(1:61)|57|15|16|(0)|18|19|(0)|(0)|(0)|(0)|(0)|(0)|32) */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int f(android.content.Context r9) {
        /*
            if (r9 != 0) goto L4
            r9 = -1
            return r9
        L4:
            boolean r0 = g(r9)
            r1 = 1
            r2 = 0
            java.lang.String r3 = "wifi"
            java.lang.Object r3 = r9.getSystemService(r3)     // Catch: java.lang.Throwable -> L2e
            android.net.wifi.WifiManager r3 = (android.net.wifi.WifiManager) r3     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L29
            boolean r4 = r3.isWifiEnabled()     // Catch: java.lang.Throwable -> L2e
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2f
            r6 = 18
            if (r5 < r6) goto L27
            boolean r3 = r3.isScanAlwaysAvailable()     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L27
            r3 = 1
            r5 = 1
            goto L31
        L27:
            r3 = 1
            goto L2b
        L29:
            r3 = 0
            r4 = 0
        L2b:
            r5 = r3
            r3 = 0
            goto L31
        L2e:
            r4 = 0
        L2f:
            r3 = 0
            r5 = 0
        L31:
            java.lang.String r6 = "location"
            java.lang.Object r6 = r9.getSystemService(r6)     // Catch: java.lang.Exception -> L5c
            android.location.LocationManager r6 = (android.location.LocationManager) r6     // Catch: java.lang.Exception -> L5c
            if (r6 == 0) goto L5c
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L46
            java.lang.String r7 = "location_mode"
            int r9 = android.provider.Settings.Secure.getInt(r9, r7)     // Catch: java.lang.Throwable -> L46
            goto L47
        L46:
            r9 = 0
        L47:
            java.lang.String r7 = "gps"
            boolean r7 = com.sankuai.meituan.takeoutnew.util.aop.g.a(r6, r7)     // Catch: java.lang.Exception -> L5d
            java.util.List r6 = r6.getAllProviders()     // Catch: java.lang.Exception -> L5d
            if (r6 != 0) goto L55
            r6 = 0
            goto L5f
        L55:
            java.lang.String r8 = "gps"
            boolean r6 = r6.contains(r8)     // Catch: java.lang.Exception -> L5d
            goto L5f
        L5c:
            r9 = 0
        L5d:
            r6 = 0
            r7 = 0
        L5f:
            if (r0 != 0) goto L62
            goto L63
        L62:
            r1 = 0
        L63:
            if (r4 != 0) goto L67
            int r1 = r1 + 2
        L67:
            if (r7 != 0) goto L6b
            int r1 = r1 + 4
        L6b:
            if (r5 != 0) goto L6f
            int r1 = r1 + 8
        L6f:
            if (r6 != 0) goto L73
            int r1 = r1 + 16
        L73:
            if (r3 != 0) goto L77
            int r1 = r1 + 32
        L77:
            switch(r9) {
                case 0: goto L84;
                case 1: goto L81;
                case 2: goto L7e;
                case 3: goto L7b;
                default: goto L7a;
            }
        L7a:
            goto L86
        L7b:
            int r1 = r1 + 512
            goto L86
        L7e:
            int r1 = r1 + 256
            goto L86
        L81:
            int r1 = r1 + 128
            goto L86
        L84:
            int r1 = r1 + 64
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.map.geolocation.a.b.h.f(android.content.Context):int");
    }

    private static boolean g(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return false;
            }
            return telephonyManager.getSimState() == 5;
        } catch (Exception unused) {
            return false;
        }
    }
}
