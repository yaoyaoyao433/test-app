package com.tencent.mapsdk.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.tools.net.NetUtil;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class gy {
    private static a A = null;
    private static final int O = 100;
    private static final int T = -85000000;
    private static final int U = 85000000;
    private static final int V = -180000000;
    private static final int W = 180000000;
    private static final int aa = 20;
    private static final double ab = 6378137.0d;
    private static final double ac = 4.007501668557849E7d;
    private static final double ad = 0.017453292519943295d;
    private static final double ae = 2.68435456E8d;
    public static final String d = "tencentmap/mapsdk_vector/";
    public static final int e = -1;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o = 3;
    private static final String u = "Tencent";
    public static final File a = new File(Environment.getExternalStorageDirectory(), u);
    private static final String v = "MapSDK";
    public static final File b = new File(a, v);
    private static final String w = "Caches";
    public static final File c = new File(b, w);
    private static String x = null;
    private static String y = null;
    private static String z = null;
    private static final String B = sd.j;
    private static final String C = sd.j;
    private static String D = null;
    private static String E = null;
    private static String F = null;
    private static String G = null;
    private static String H = null;
    private static String I = null;
    private static String J = null;
    private static int K = 0;
    private static String L = null;
    private static String M = Constants.UNDEFINED;
    private static float N = 1.0f;
    public static int i = 2;
    public static int j = 0;
    public static int k = 0;
    public static int l = 0;
    public static int p = 2;
    private static final int P = 4000000;
    public static int q = P;
    private static final int Q = 53500000;
    public static int r = Q;
    private static final int R = 73670000;
    public static int s = R;
    private static final int S = 135100000;
    public static int t = S;
    private static int X = 0;
    private static int Y = 160;
    private static float Z = 0.0f;

    private static String M() {
        return u;
    }

    private static String N() {
        return v;
    }

    private static String O() {
        return w;
    }

    private static float a(int i2) {
        return i2 / 255.0f;
    }

    private static Date H() {
        return Calendar.getInstance().getTime();
    }

    public static String a() {
        P();
        if (y != null && !y.equals(x)) {
            return y;
        }
        return x;
    }

    public static float b() {
        P();
        return N;
    }

    public static String c() {
        P();
        return NetUtil.STR_UserAgent;
    }

    public static String d() {
        return (P().a || G == null) ? "" : G;
    }

    public static String e() {
        return (P().a || H == null) ? "" : H;
    }

    public static int f() {
        P();
        return X;
    }

    public static String g() {
        return (P().a || I == null) ? "" : I;
    }

    public static String h() {
        return (P().a || L == null) ? "" : L;
    }

    private static String I() {
        return P().a ? "" : M;
    }

    public static String i() {
        P();
        return B;
    }

    public static int j() {
        if (P().a) {
            return 0;
        }
        return K;
    }

    public static String k() {
        P();
        return E == null ? "" : E;
    }

    private static String J() {
        return (P().a || F == null) ? "" : F;
    }

    public static String l() {
        P();
        if (z == null || TextUtils.isEmpty(z) || z.equals(J)) {
            return J == null ? "" : J;
        }
        return z;
    }

    public static String m() {
        P();
        return C;
    }

    public static float n() {
        P();
        return Z;
    }

    private static String b(String str) {
        return str == null ? "" : str.replace("&", "").replace("#", "").replace(CommonConstant.Symbol.QUESTION_MARK, "");
    }

    private static String c(String str) throws PatternSyntaxException {
        return Pattern.compile("[^a-zA-Z0-9]").matcher(str).replaceAll("").trim();
    }

    public static void a(Context context, String str, String str2, String str3) {
        kc.d = c;
        y = str;
        z = str2;
        M = str3;
        if (X == 0 && context != null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            X = displayMetrics.widthPixels * displayMetrics.heightPixels;
            if (Build.VERSION.SDK_INT < 24) {
                a(displayMetrics);
            } else {
                Y = displayMetrics.densityDpi;
                K();
            }
        }
        if (L == null) {
            try {
                String a2 = hc.a();
                L = a2;
                String b2 = b(a2);
                L = b2;
                L = URLEncoder.encode(b2, "utf-8");
            } catch (Exception unused) {
            }
        }
        if (K == 0) {
            K = Build.VERSION.SDK_INT;
        }
        if (J == null) {
            try {
                String packageName = context.getPackageName();
                J = packageName;
                String b3 = b(packageName);
                J = b3;
                J = URLEncoder.encode(b3, "utf-8");
            } catch (Exception unused2) {
            }
        }
        if (D == null) {
            try {
                String h2 = hc.h(context);
                D = h2;
                String b4 = b(h2);
                D = b4;
                D = URLEncoder.encode(b4, "utf-8");
            } catch (Exception unused3) {
            }
        }
        if (E == null) {
            try {
                String e2 = hc.e(context);
                E = e2;
                String b5 = b(e2);
                E = b5;
                E = URLEncoder.encode(b5, "utf-8");
            } catch (Exception unused4) {
            }
        }
        if (F == null) {
            try {
                String i2 = hc.i(context);
                F = i2;
                String b6 = b(i2);
                F = b6;
                F = URLEncoder.encode(b6, "utf-8");
            } catch (Exception unused5) {
            }
        }
        if (G == null) {
            try {
                String f2 = hc.f(context);
                G = f2;
                String b7 = b(f2);
                G = b7;
                G = URLEncoder.encode(b7, "utf-8");
            } catch (Exception unused6) {
            }
        }
        if (TextUtils.isEmpty(H)) {
            try {
                String g2 = hc.g(context);
                H = g2;
                String b8 = b(g2);
                H = b8;
                H = URLEncoder.encode(b8, "utf-8");
            } catch (Exception unused7) {
            }
        }
        if (I == null) {
            try {
                String netTypeStr = NetUtil.getNetTypeStr(context);
                I = netTypeStr;
                String b9 = b(netTypeStr);
                I = b9;
                I = URLEncoder.encode(b9, "utf-8");
            } catch (Exception unused8) {
            }
        }
        if (x == null) {
            try {
                String a3 = hc.a(context, "TencentMapSDK");
                x = a3;
                x = URLEncoder.encode(a3, "utf-8");
            } catch (Exception unused9) {
            }
        }
        if (N == 1.0f) {
            N = 320.0f / context.getResources().getDisplayMetrics().densityDpi;
        }
        Z = context.getResources().getDisplayMetrics().density;
    }

    public static String a(String str, String str2) {
        String c2;
        if (hb.a(str)) {
            str = "";
        }
        if (hb.a(str2)) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder(256);
        sb.append("key=");
        sb.append(a());
        sb.append("&pid=");
        sb.append(l());
        sb.append("&key2=");
        sb.append(str);
        sb.append("&pid2=");
        sb.append(str2);
        sb.append("&psv=");
        sb.append(k());
        sb.append("&ver=");
        P();
        sb.append(C);
        sb.append("&pf=");
        P();
        sb.append("androidsdk&hm=");
        sb.append(h());
        sb.append("&suid=");
        sb.append(d());
        sb.append("&os=");
        sb.append(j());
        sb.append("&dip=");
        sb.append((P().a || F == null) ? "" : F);
        sb.append("&nt=");
        sb.append(g());
        sb.append("&channel=1&output=json");
        if (!TextUtils.isEmpty(M)) {
            try {
                c2 = URLEncoder.encode(M, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                c2 = c(M);
            }
            sb.append("&cuid=");
            sb.append(c2);
            sb.append("&uuid=");
            sb.append(c2);
        }
        return sb.toString();
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder(256);
        if (!TextUtils.isEmpty(G)) {
            sb.append("&suid=");
            sb.append(d());
        }
        if (!TextUtils.isEmpty(H)) {
            sb.append("&duid=");
            sb.append(e());
        }
        if (!TextUtils.isEmpty(J)) {
            sb.append("&appid=");
            sb.append(l());
        }
        if (!TextUtils.isEmpty(B)) {
            sb.append("&sdkver=");
            P();
            sb.append(B);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append("&ui=");
            sb.append(str);
        }
        if (!TextUtils.isEmpty(M)) {
            sb.append("&appsuid=");
            try {
                sb.append(URLEncoder.encode(M, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
                sb.append(c(M));
            }
            sb.append("&cuid=");
            sb.append(M);
        }
        sb.append("&api_key=" + a());
        return sb.toString();
    }

    private static String d(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                sb.append(Integer.toHexString(b2 & 255));
                sb.append("");
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    private static String a(byte[] bArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(Integer.toHexString(b2 & 255));
            sb.append(str);
        }
        return sb.toString();
    }

    private static void a(DisplayMetrics displayMetrics) {
        Field field;
        try {
            field = displayMetrics.getClass().getField("densityDpi");
        } catch (NoSuchFieldException | SecurityException unused) {
            field = null;
        }
        if (field != null) {
            try {
                Y = field.getInt(displayMetrics);
                K();
                return;
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return;
            } catch (IllegalArgumentException e3) {
                e3.printStackTrace();
                return;
            }
        }
        L();
    }

    private static void b(DisplayMetrics displayMetrics) {
        Y = displayMetrics.densityDpi;
        K();
    }

    private static void K() {
        if (Y <= 120) {
            p = 1;
        } else if (Y <= 160) {
            p = 2;
        } else if (Y <= 240) {
            p = 3;
        } else {
            L();
        }
    }

    private static void L() {
        if (X > 153600) {
            p = 3;
        } else if (X < 153600) {
            p = 1;
        } else {
            p = 2;
        }
    }

    private static void a(Context context) {
        if (context == null) {
            return;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        X = displayMetrics.widthPixels * displayMetrics.heightPixels;
        if (Build.VERSION.SDK_INT < 24) {
            a(displayMetrics);
            return;
        }
        Y = displayMetrics.densityDpi;
        K();
    }

    private static String b(Context context) {
        ApplicationInfo applicationInfo;
        if (context == null) {
            return "";
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            applicationInfo = null;
        }
        try {
            return URLEncoder.encode((applicationInfo != null ? applicationInfo.loadLabel(packageManager) : "can't find app name").toString(), "utf-8");
        } catch (Exception unused) {
            return "can't find app name";
        }
    }

    public static void o() {
        s = R;
        t = S;
        r = Q;
        q = P;
    }

    public static double a(double d2, double d3) {
        return (d2 * 6.698324247899813d) / Math.cos(d3 * ad);
    }

    private static boolean a(Context context, byte[] bArr, String str) {
        File fileStreamPath = context.getFileStreamPath("tecentmap");
        if (!fileStreamPath.exists()) {
            fileStreamPath.mkdirs();
        }
        String str2 = fileStreamPath.getPath() + "/" + str;
        return (TextUtils.isEmpty(str2) ? 0 : kd.a(bArr, new File(str2))) != 0;
    }

    private static byte[] a(Context context, String str) {
        File fileStreamPath = context.getFileStreamPath("tecentmap");
        InputStream b2 = kd.b(fileStreamPath.getPath() + "/" + str);
        byte[] b3 = kd.b(b2);
        kd.a((Closeable) b2);
        return b3;
    }

    private static String[] e(String str) {
        String[] strArr = new String[3];
        try {
            JSONObject jSONObject = new JSONObject(str);
            strArr[0] = jSONObject.optString("version");
            strArr[1] = jSONObject.optString("data");
            strArr[2] = jSONObject.optString("otherDistrict");
        } catch (JSONException unused) {
        }
        return strArr;
    }

    public static int b(String str, String str2) {
        if (hb.a(str2)) {
            return 1;
        }
        if (hb.a(str)) {
            return -1;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int length = split.length;
        if (length > split2.length) {
            length = split2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            String str3 = split2[i2];
            String str4 = split[i2];
            if (TextUtils.isEmpty(str3)) {
                str3 = "0";
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = "0";
            }
            if (Integer.valueOf(str3).intValue() < Integer.valueOf(str4).intValue()) {
                return 1;
            }
            if (Integer.valueOf(str3).intValue() > Integer.valueOf(str4).intValue()) {
                return -1;
            }
        }
        if (split.length > split2.length) {
            return 1;
        }
        return split.length == split2.length ? 0 : -1;
    }

    private static a P() {
        if (A != null) {
            return A;
        }
        return new a(false, (byte) 0);
    }

    private static a Q() {
        return new a(false, (byte) 0);
    }

    public static void a(boolean z2) {
        A = new a(z2, (byte) 0);
    }

    public static void p() {
        A = null;
        z = null;
        y = null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        final boolean a;

        private static String c() {
            return NetUtil.STR_UserAgent;
        }

        /* synthetic */ a(boolean z, byte b) {
            this(z);
        }

        private a(boolean z) {
            this.a = z;
        }

        private String a() {
            return (this.a || gy.G == null) ? "" : gy.G;
        }

        private String b() {
            return (this.a || gy.H == null) ? "" : gy.H;
        }

        private String d() {
            return (this.a || gy.L == null) ? "" : gy.L;
        }

        private String e() {
            return this.a ? "" : gy.M;
        }

        private int f() {
            if (this.a) {
                return 0;
            }
            return gy.K;
        }

        private String g() {
            return (this.a || gy.F == null) ? "" : gy.F;
        }

        private static int h() {
            return gy.X;
        }

        private String i() {
            return (this.a || gy.I == null) ? "" : gy.I;
        }

        private static String j() {
            if (gy.z == null || TextUtils.isEmpty(gy.z) || gy.z.equals(gy.J)) {
                return gy.J == null ? "" : gy.J;
            }
            return gy.z;
        }

        private static String k() {
            return gy.B;
        }

        private static String l() {
            return gy.E == null ? "" : gy.E;
        }

        private static String m() {
            return gy.C;
        }

        private static float n() {
            return gy.N;
        }

        private static float o() {
            return gy.Z;
        }

        private static String p() {
            return (gy.y == null || gy.y.equals(gy.x)) ? gy.x : gy.y;
        }
    }
}
