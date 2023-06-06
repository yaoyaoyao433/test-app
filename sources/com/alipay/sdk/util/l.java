package com.alipay.sdk.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.alipay.sdk.data.a;
import com.meituan.android.common.weaver.impl.blank.BlankConfig;
import com.meituan.android.recce.host.RecceBridgeHandler;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l {
    public static final String[] a = {"10.1.5.1013151", "10.1.5.1013148"};

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a implements Runnable {
        public final /* synthetic */ Activity a;

        public a(Activity activity) {
            this.a = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.finish();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class b implements Runnable {
        public final /* synthetic */ Runnable a;
        public final /* synthetic */ ConditionVariable b;

        public b(Runnable runnable, ConditionVariable conditionVariable) {
            this.a = runnable;
            this.b = conditionVariable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.a.run();
            } finally {
                this.b.open();
            }
        }
    }

    public static String a() {
        if (com.alipay.sdk.app.a.a()) {
            return "com.eg.android.AlipayGphoneRC";
        }
        try {
            return com.alipay.sdk.app.c.d.get(0).a;
        } catch (Throwable unused) {
            return "com.eg.android.AlipayGphone";
        }
    }

    public static String a(String str) {
        return (com.alipay.sdk.app.a.a() && TextUtils.equals(str, "com.eg.android.AlipayGphoneRC")) ? "com.eg.android.AlipayGphoneRC.IAlixPay" : "com.eg.android.AlipayGphone.IAlixPay";
    }

    public static boolean a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.alipay.android.app", 128) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static String b(com.alipay.sdk.sys.a aVar, String str) {
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            com.alipay.sdk.app.statistic.a.a(aVar, "biz", "H5PayDataAnalysisError", e);
            return "";
        }
    }

    public static boolean b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(a(), 128);
            if (packageInfo == null) {
                return false;
            }
            return packageInfo.versionCode < 99;
        } catch (Throwable th) {
            d.a(th);
            return false;
        }
    }

    public static String c() {
        String f = f();
        int indexOf = f.indexOf(CommonConstant.Symbol.MINUS);
        if (indexOf != -1) {
            f = f.substring(0, indexOf);
        }
        int indexOf2 = f.indexOf("\n");
        if (indexOf2 != -1) {
            f = f.substring(0, indexOf2);
        }
        return "Linux " + f;
    }

    public static String c(Context context) {
        String b2 = b();
        String c2 = c();
        String d = d(context);
        String e = e(context);
        return " (" + b2 + ";" + c2 + ";" + d + ";;" + e + ")(sdk android)";
    }

    public static JSONObject c(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    private static String f() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), 256);
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            Matcher matcher = Pattern.compile("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(readLine);
            if (matcher.matches() && matcher.groupCount() >= 4) {
                return matcher.group(1) + "\n" + matcher.group(2) + StringUtil.SPACE + matcher.group(3) + "\n" + matcher.group(4);
            }
            return "Unavailable";
        } catch (IOException unused) {
            return "Unavailable";
        }
    }

    public static String g(Context context) {
        return "-1;-1";
    }

    public static Map<String, String> a(com.alipay.sdk.sys.a aVar, String str) {
        String[] split;
        HashMap hashMap = new HashMap(4);
        int indexOf = str.indexOf(63);
        if (indexOf != -1 && indexOf < str.length() - 1) {
            for (String str2 : str.substring(indexOf + 1).split("&")) {
                int indexOf2 = str2.indexOf(61, 1);
                if (indexOf2 != -1 && indexOf2 < str2.length() - 1) {
                    hashMap.put(str2.substring(0, indexOf2), b(aVar, str2.substring(indexOf2 + 1)));
                }
            }
        }
        return hashMap;
    }

    public static String b() {
        return "Android " + Build.VERSION.RELEASE;
    }

    public static String e(Context context) {
        DisplayMetrics i = i(context);
        return i.widthPixels + "*" + i.heightPixels;
    }

    public static String f(Context context) {
        String a2 = k.a(context);
        return a2.substring(0, a2.indexOf("://"));
    }

    public static Map<String, String> b(String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("&")) {
            int indexOf = str2.indexOf("=", 1);
            if (-1 != indexOf) {
                hashMap.put(str2.substring(0, indexOf), URLDecoder.decode(str2.substring(indexOf + 1)));
            }
        }
        return hashMap;
    }

    public static String f(String str) {
        return a(str, true);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class c {
        public final PackageInfo a;
        public final int b;
        public final String c;

        public c(PackageInfo packageInfo, int i, String str) {
            this.a = packageInfo;
            this.b = i;
            this.c = str;
        }

        public final boolean a(com.alipay.sdk.sys.a aVar) {
            Signature[] signatureArr = this.a.signatures;
            if (signatureArr == null || signatureArr.length == 0) {
                return false;
            }
            for (Signature signature : signatureArr) {
                String a = l.a(aVar, signature.toByteArray());
                if (a != null && !TextUtils.equals(a, this.c)) {
                    com.alipay.sdk.app.statistic.a.a(aVar, "biz", "PublicKeyUnmatch", String.format("Got %s, expected %s", a, this.c));
                    return true;
                }
            }
            return false;
        }

        public final boolean a() {
            return this.a.versionCode < this.b;
        }
    }

    public static int d() {
        try {
            return Process.myUid();
        } catch (Throwable th) {
            d.a(th);
            return -200;
        }
    }

    private static DisplayMetrics i(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static boolean d(String str) {
        return Pattern.compile("^http(s)?://([a-z0-9_\\-]+\\.)*(alipaydev|alipay|taobao)\\.(com|net)(:\\d+)?(/.*)?$").matcher(str).matches();
    }

    public static String e(String str) {
        try {
            Uri parse = Uri.parse(str);
            return String.format("%s%s", parse.getAuthority(), parse.getPath());
        } catch (Throwable th) {
            d.a(th);
            return CommonConstant.Symbol.MINUS;
        }
    }

    public static boolean c(com.alipay.sdk.sys.a aVar, String str) {
        int g;
        try {
            g = g(str);
            StringBuilder sb = new StringBuilder();
            sb.append(g);
            com.alipay.sdk.app.statistic.a.b(aVar, "biz", "bindExt", sb.toString());
        } catch (Throwable unused) {
        }
        return com.alipay.sdk.data.a.a().u && (g & 2) == 2;
    }

    public static String a(String str, String str2, String str3) {
        try {
            int indexOf = str3.indexOf(str) + str.length();
            if (indexOf <= str.length()) {
                return "";
            }
            int indexOf2 = TextUtils.isEmpty(str2) ? 0 : str3.indexOf(str2, indexOf);
            if (indexOf2 <= 0) {
                return str3.substring(indexOf);
            }
            return str3.substring(indexOf, indexOf2);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean b(com.alipay.sdk.sys.a aVar, Context context, List<a.b> list) {
        try {
            for (a.b bVar : list) {
                if (bVar != null) {
                    String str = bVar.a;
                    if (com.alipay.sdk.app.a.a() && "com.eg.android.AlipayGphone".equals(str)) {
                        str = "com.eg.android.AlipayGphoneRC";
                    }
                    try {
                        if (context.getPackageManager().getPackageInfo(str, 128) != null) {
                            return true;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        continue;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            com.alipay.sdk.app.statistic.a.a(aVar, "biz", "CheckLaunchAppExistEx", th);
            return false;
        }
    }

    public static boolean e() {
        try {
            String[] split = com.alipay.sdk.data.a.a().m.split(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR);
            String str = Build.MODEL;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            for (String str2 : split) {
                if (TextUtils.equals(str, str2) || TextUtils.equals(str2, "all")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            d.a(th);
            return false;
        }
    }

    public static String a(com.alipay.sdk.sys.a aVar, byte[] bArr) {
        BigInteger modulus;
        try {
            PublicKey publicKey = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey();
            if (!(publicKey instanceof RSAPublicKey) || (modulus = ((RSAPublicKey) publicKey).getModulus()) == null) {
                return null;
            }
            return modulus.toString(16);
        } catch (Exception e) {
            com.alipay.sdk.app.statistic.a.a(aVar, "auth", "GetPublicKeyFromSignEx", e);
            return null;
        }
    }

    public static String d(Context context) {
        return context.getResources().getConfiguration().locale.toString();
    }

    private static String e(com.alipay.sdk.sys.a aVar, String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e) {
            com.alipay.sdk.app.statistic.a.a(aVar, "biz", "rflex", e.getClass().getSimpleName());
            return null;
        }
    }

    private static int g(String str) {
        try {
            String str2 = com.alipay.sdk.data.a.a().s;
            if (TextUtils.isEmpty(str2)) {
                return 0;
            }
            String a2 = com.sankuai.meituan.takeoutnew.util.aop.l.a(((Application) com.alipay.sdk.sys.b.a().b).getContentResolver(), str2);
            if (a2 == null) {
                a2 = "";
            }
            return (a2.contains(str) ? 2 : 0) | 1;
        } catch (Throwable unused) {
            return 61440;
        }
    }

    public static int b(int i) {
        return i / BlankConfig.MAX_SAMPLE;
    }

    public static c a(com.alipay.sdk.sys.a aVar, Context context, List<a.b> list) {
        c a2;
        if (list == null) {
            return null;
        }
        for (a.b bVar : list) {
            if (bVar != null && (a2 = a(aVar, context, bVar.a, bVar.b, bVar.c)) != null && !a2.a(aVar) && !a2.a()) {
                return a2;
            }
        }
        return null;
    }

    private static c a(com.alipay.sdk.sys.a aVar, Context context, String str, int i, String str2) {
        PackageInfo packageInfo;
        if (com.alipay.sdk.app.a.a() && "com.eg.android.AlipayGphone".equals(str)) {
            str = "com.eg.android.AlipayGphoneRC";
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 192);
        } catch (Throwable th) {
            com.alipay.sdk.app.statistic.a.a(aVar, "auth", "GetPackageInfoEx", th.getMessage());
            packageInfo = null;
        }
        String str3 = "";
        boolean z = false;
        if (packageInfo == null) {
            str3 = "info == null";
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                str3 = "info.signatures == null";
            } else if (signatureArr.length <= 0) {
                str3 = "info.signatures.length <= 0";
            } else {
                z = true;
            }
        }
        if (!z) {
            com.alipay.sdk.app.statistic.a.a(aVar, "auth", "NotIncludeSignatures", str3);
        }
        if (z && packageInfo != null) {
            return new c(packageInfo, i, str2);
        }
        return null;
    }

    public static boolean a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        try {
            String str = packageInfo.versionName;
            if (!TextUtils.equals(str, a[0])) {
                if (!TextUtils.equals(str, a[1])) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a(int i) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            int nextInt = random.nextInt(3);
            if (nextInt == 0) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 65.0d)));
            } else if (nextInt == 1) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 97.0d)));
            } else if (nextInt == 2) {
                sb.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return sb.toString();
    }

    public static String a(Context context, String str) {
        String str2 = "";
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getApplicationContext().getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses()) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    str2 = str2 + "#M";
                } else {
                    if (runningAppProcessInfo.processName.startsWith(str + CommonConstant.Symbol.COLON)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append("#");
                        sb.append(runningAppProcessInfo.processName.replace(str + CommonConstant.Symbol.COLON, ""));
                        str2 = sb.toString();
                    }
                }
            }
        } catch (Throwable unused) {
            str2 = "";
        }
        if (str2.length() > 0) {
            str2 = str2.substring(1);
        }
        return str2.length() == 0 ? ErrorCode.ERROR_TYPE_N : str2;
    }

    public static boolean a(com.alipay.sdk.sys.a aVar, String str, Activity activity) {
        String substring;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (activity == null) {
            return false;
        }
        if (!str.toLowerCase().startsWith("alipays://platformapi/startApp?".toLowerCase()) && !str.toLowerCase().startsWith("intent://platformapi/startapp?".toLowerCase())) {
            if (!TextUtils.equals(str, "sdklite://h5quit") && !TextUtils.equals(str, "http://m.alipay.com/?action=h5quit")) {
                if (str.startsWith("sdklite://h5quit?result=")) {
                    try {
                        String substring2 = str.substring(str.indexOf("sdklite://h5quit?result=") + 24);
                        int parseInt = Integer.parseInt(substring2.substring(substring2.lastIndexOf("&end_code=") + 10));
                        if (parseInt != com.alipay.sdk.app.e.SUCCEEDED.i && parseInt != com.alipay.sdk.app.e.PAY_WAITTING.i) {
                            com.alipay.sdk.app.e a2 = com.alipay.sdk.app.e.a(com.alipay.sdk.app.e.FAILED.i);
                            com.alipay.sdk.app.d.b = com.alipay.sdk.app.d.a(a2.i, a2.j, "");
                        } else {
                            if (com.alipay.sdk.cons.a.c) {
                                StringBuilder sb = new StringBuilder();
                                String decode = URLDecoder.decode(str);
                                String decode2 = URLDecoder.decode(decode);
                                String str2 = decode2.substring(decode2.indexOf("sdklite://h5quit?result=") + 24, decode2.lastIndexOf("&end_code=")).split("&return_url=")[0];
                                int indexOf = decode.indexOf("&return_url=") + 12;
                                sb.append(str2);
                                sb.append("&return_url=");
                                sb.append(decode.substring(indexOf, decode.indexOf("&", indexOf)));
                                sb.append(decode.substring(decode.indexOf("&", indexOf)));
                                substring = sb.toString();
                            } else {
                                String decode3 = URLDecoder.decode(str);
                                substring = decode3.substring(decode3.indexOf("sdklite://h5quit?result=") + 24, decode3.lastIndexOf("&end_code="));
                            }
                            com.alipay.sdk.app.e a3 = com.alipay.sdk.app.e.a(parseInt);
                            com.alipay.sdk.app.d.b = com.alipay.sdk.app.d.a(a3.i, a3.j, substring);
                        }
                    } catch (Exception unused) {
                        com.alipay.sdk.app.e a4 = com.alipay.sdk.app.e.a(com.alipay.sdk.app.e.PARAMS_ERROR.i);
                        com.alipay.sdk.app.d.b = com.alipay.sdk.app.d.a(a4.i, a4.j, "");
                    }
                    activity.runOnUiThread(new a(activity));
                    return true;
                }
                return false;
            }
            com.alipay.sdk.app.d.b = com.alipay.sdk.app.d.a();
            activity.finish();
            return true;
        }
        try {
            c a5 = a(aVar, activity, com.alipay.sdk.app.c.d);
            if (a5 != null && !a5.a() && !a5.a(aVar)) {
                if (str.startsWith("intent://platformapi/startapp")) {
                    str = str.replaceFirst("intent://platformapi/startapp\\?", "alipays://platformapi/startApp?");
                }
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            }
        } catch (Throwable unused2) {
        }
        return true;
    }

    private static String a(String str, boolean z) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            if (digest.length > 16) {
                byte[] bArr = new byte[16];
                System.arraycopy(digest, 0, bArr, 0, 16);
                return a(bArr);
            }
            return a(digest);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(Character.forDigit((b2 & 240) >> 4, 16));
            sb.append(Character.forDigit(b2 & 15, 16));
        }
        return sb.toString();
    }

    public static ActivityInfo h(Context context) {
        ActivityInfo[] activityInfoArr;
        if (context instanceof Activity) {
            try {
                Activity activity = (Activity) context;
                for (ActivityInfo activityInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities) {
                    if (TextUtils.equals(activityInfo.name, activity.getClass().getName())) {
                        return activityInfo;
                    }
                }
                return null;
            } catch (Throwable th) {
                d.a(th);
                return null;
            }
        }
        return null;
    }

    public static String a(com.alipay.sdk.sys.a aVar) {
        return e(aVar, "ro.build.fingerprint");
    }

    public static <T> T a(WeakReference<T> weakReference) {
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static boolean d(com.alipay.sdk.sys.a aVar, String str) {
        try {
            String host = new URL(str).getHost();
            if (host.endsWith("alipay.com")) {
                return true;
            }
            return host.endsWith("alipay.net");
        } catch (Throwable th) {
            com.alipay.sdk.app.statistic.a.a(aVar, "biz", "ckUrlErr", th);
            return false;
        }
    }

    public static JSONObject a(Intent intent) {
        Bundle extras;
        JSONObject jSONObject = new JSONObject();
        if (intent != null && (extras = intent.getExtras()) != null) {
            for (String str : extras.keySet()) {
                try {
                    jSONObject.put(str, String.valueOf(extras.get(str)));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONObject;
    }

    public static boolean a(long j, Runnable runnable, String str) {
        ConditionVariable conditionVariable = new ConditionVariable();
        Thread thread = new Thread(new b(runnable, conditionVariable));
        if (!TextUtils.isEmpty(str)) {
            thread.setName(str);
        }
        thread.start();
        try {
            return conditionVariable.block(600L);
        } catch (Throwable unused) {
            return true;
        }
    }
}
