package com.dianping.monitor;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.dianping.monitor.impl.m;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.MtWifiManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.meituan.xp.core.XPlayerConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class h {
    public static ChangeQuickRedirect a;
    public static String b;
    private static MtTelephonyManager f;
    private static MtWifiManager g;
    private static Context i;
    private static int j;
    private static final com.dianping.monitor.impl.b d = new com.dianping.monitor.impl.b(4096);
    private static volatile List<String> e = new CopyOnWriteArrayList();
    private static final Pattern h = Pattern.compile("1\\d{2}\\*\\*\\*\\*\\d{4}");
    public static final Random c = new Random();

    public static String b(String str) {
        return str == null ? "" : str;
    }

    public static String e() {
        return "android";
    }

    public static void a(Context context, String str, int i2) {
        Object[] objArr = {context, str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fcd178f6daf03f91421859ad07e9b053", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fcd178f6daf03f91421859ad07e9b053");
        } else {
            context.getSharedPreferences("crash_log_monitor", 0).edit().putInt(str, i2).apply();
        }
    }

    public static int a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ca1a4a36677a56819bfa9a0771dd012", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ca1a4a36677a56819bfa9a0771dd012")).intValue() : context.getSharedPreferences("crash_log_monitor", 0).getInt(str, 0);
    }

    public static void a(Context context, String str, long j2) {
        Object[] objArr = {context, str, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca20d48a0d5401216843d429027162c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca20d48a0d5401216843d429027162c9");
        } else {
            context.getSharedPreferences("crash_log_monitor", 0).edit().putLong(str, j2).apply();
        }
    }

    public static long b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97bb975ffe7ce42c06be5a162d40fa1b", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97bb975ffe7ce42c06be5a162d40fa1b")).longValue() : context.getSharedPreferences("crash_log_monitor", 0).getLong(str, 0L);
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7fcae030bba334994d8dae7648f9439", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7fcae030bba334994d8dae7648f9439")).intValue();
        }
        try {
            Matcher matcher = Pattern.compile("(\\d+\\.?)+").matcher(b(context));
            if (matcher.find()) {
                return Integer.parseInt(matcher.group().replace(CommonConstant.Symbol.DOT, ""));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return 0;
    }

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e15a1f6cb4541aaab54130d3245b915", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e15a1f6cb4541aaab54130d3245b915")).intValue();
        }
        try {
            Matcher matcher = Pattern.compile("(\\d+\\.?)+").matcher(str);
            if (matcher.find()) {
                return Integer.parseInt(matcher.group().replace(CommonConstant.Symbol.DOT, ""));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return 0;
    }

    public static synchronized String b(Context context) {
        synchronized (h.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "807d9a1599b60a057da36adb7cdcf766", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "807d9a1599b60a057da36adb7cdcf766");
            }
            if (TextUtils.isEmpty(b)) {
                try {
                    b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (b == null) {
                b = "";
            }
            return b;
        }
    }

    public static String a() {
        return Build.MODEL;
    }

    public static String b() {
        return Build.VERSION.RELEASE;
    }

    public static String c() {
        return Build.BRAND;
    }

    public static byte[] a(byte[] bArr) throws Exception {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        GZIPOutputStream gZIPOutputStream = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41fa3b7978c244244a7c4a55176fed8c", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41fa3b7978c244244a7c4a55176fed8c");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream2.write(bArr);
                gZIPOutputStream2.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                a(gZIPOutputStream2);
                return byteArray;
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = gZIPOutputStream2;
                a(gZIPOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab7bd2a676f618f87865c19c120347f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab7bd2a676f618f87865c19c120347f1");
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d382d0412d087f35f688e4731399e944", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d382d0412d087f35f688e4731399e944");
        }
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String d() {
        return Build.VERSION.RELEASE;
    }

    public static String f() {
        return Build.MODEL;
    }

    public static synchronized void g() {
        synchronized (h.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d73b39ca4c742410b94cb87371f30298", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d73b39ca4c742410b94cb87371f30298");
            } else if (b.n()) {
                e = j();
            }
        }
    }

    public static boolean a(String str, String str2) {
        boolean z;
        boolean z2;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5bc667ff948a4f88de937a46054afc3", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5bc667ff948a4f88de937a46054afc3")).booleanValue();
        }
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b9e267d76f9ea197ce8fe659897f094b", 6917529027641081856L)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b9e267d76f9ea197ce8fe659897f094b")).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            z = false;
        } else {
            z = str.contains(Constants.PRIVACY.KEY_LATITUDE) || str.contains(Constants.PRIVACY.KEY_LONGITUDE) || str.contains("&lat") || str.contains("&lng") || str.contains("latlng") || (str.contains("lat=") && str.contains("lng="));
            if (z) {
                a(1, str2);
            }
        }
        if (!z && !b(str, str2)) {
            Object[] objArr3 = {str, str2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "7905a3bd8bb2246bafd74b1cefe57668", 6917529027641081856L)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "7905a3bd8bb2246bafd74b1cefe57668")).booleanValue();
            } else {
                if (!TextUtils.isEmpty(str)) {
                    for (String str3 : e) {
                        if (com.dianping.monitor.impl.a.DEBUG) {
                            new StringBuilder("val:").append(str3);
                        }
                        if (!TextUtils.isEmpty(str3) && str.contains(str3)) {
                            a(3, str2);
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    private static MtTelephonyManager h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69d91c5f42af2767eef76f3a3e851bff", 6917529027641081856L)) {
            return (MtTelephonyManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69d91c5f42af2767eef76f3a3e851bff");
        }
        if (i == null) {
            return null;
        }
        if (f == null) {
            synchronized (h.class) {
                if (f == null) {
                    try {
                        f = Privacy.createTelephonyManager(i, "raptor");
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return f;
    }

    private static MtWifiManager i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c2463171d9e48fdc2fcb6aa42cc7dcf", 6917529027641081856L)) {
            return (MtWifiManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c2463171d9e48fdc2fcb6aa42cc7dcf");
        }
        if (i == null) {
            return null;
        }
        if (g == null) {
            synchronized (h.class) {
                if (g == null) {
                    try {
                        g = Privacy.createWifiManager(i, "raptor");
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return g;
    }

    private static List<String> j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe5378c88a687d6ea6897ed0730e6911", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe5378c88a687d6ea6897ed0730e6911");
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        try {
            if (h() != null) {
                copyOnWriteArrayList.add(h().getImei());
                copyOnWriteArrayList.add(h().getMeid());
                copyOnWriteArrayList.add(h().getSubscriberId());
            }
            if (i() != null) {
                copyOnWriteArrayList.add(i().getMacAddress());
            }
        } catch (Throwable unused) {
        }
        return copyOnWriteArrayList;
    }

    private static boolean b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76094ba340b6a45eabe56182a0140e36", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76094ba340b6a45eabe56182a0140e36")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            boolean find = h.matcher(str).find();
            if (find) {
                a(2, str2);
            }
            return find;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0084e5e63591cae4d607b878992bb81a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0084e5e63591cae4d607b878992bb81a");
        } else if (i == null) {
            i = context;
            g();
        }
    }

    public static void a(int i2) {
        if (j <= 0) {
            j = i2;
        }
    }

    private static void a(int i2, String str) {
        Object[] objArr = {Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a9c2fa265e8724e68f4b333c171276d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a9c2fa265e8724e68f4b333c171276d");
        } else if (i == null) {
        } else {
            if (com.dianping.monitor.impl.a.DEBUG) {
                StringBuilder sb = new StringBuilder("report privacyType:");
                sb.append(i2);
                sb.append(";privacyLocation:");
                sb.append(str);
            }
            if (c.nextFloat() >= b.o()) {
                boolean z = com.dianping.monitor.impl.a.DEBUG;
                return;
            }
            m mVar = new m(XPlayerConstants.FFP_MSG_VIDEO_FROZEN_ENDED, i);
            mVar.a("app_id", String.valueOf(j));
            mVar.a("privacy_location", str);
            mVar.a("privacy_type", String.valueOf(i2));
            mVar.a("privacy_count", Collections.singletonList(Float.valueOf(1.0f)));
            mVar.a();
        }
    }

    public static byte[] b(byte[] bArr) throws IOException {
        GZIPInputStream gZIPInputStream;
        boolean z = true;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70497056cdd292576859c55e14422f7a", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70497056cdd292576859c55e14422f7a");
        }
        if (bArr != null && bArr.length != 0) {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        } catch (Throwable th) {
            th = th;
            gZIPInputStream = null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
            byte[] bArr2 = new byte[4096];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read >= 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    a(gZIPInputStream);
                    return byteArray;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            a(gZIPInputStream);
            throw th;
        }
    }
}
