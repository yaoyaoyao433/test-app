package com.meituan.android.cipstorage;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class y {
    public static ChangeQuickRedirect a;
    public static volatile String b;
    public static volatile String c;
    public static volatile String d;
    public static volatile String e;
    private static final String f = File.separator + "cips" + File.separator;
    private static final String g = File.separator + "obj" + File.separator;
    private static final String h;
    private static final String i;
    private static final char[] j;
    private static String k;
    private static String l;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(File.separator);
        sb.append("kv");
        h = sb.toString();
        i = File.separator + APKStructure.Assets_Type + File.separator;
        j = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "552262144fc5456bef72cea539160a92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "552262144fc5456bef72cea539160a92");
        } else if (c == null || b == null || e == null || d == null) {
            synchronized (y.class) {
                c = context.getCacheDir().getAbsolutePath() + f;
                b = context.getFilesDir().getAbsolutePath() + f;
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    e = context.getExternalCacheDir().getAbsolutePath() + f;
                    d = context.getExternalFilesDir("").getAbsolutePath() + f;
                } else {
                    e = c;
                    d = b;
                }
            }
        }
    }

    public static String a(boolean z) {
        if (z) {
            return e;
        }
        return c;
    }

    private static String b(boolean z) {
        if (z) {
            return d;
        }
        return b;
    }

    private static String a(u uVar, boolean z) {
        Object[] objArr = {uVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef3aa18d40e102387fd3e692d4663e86", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef3aa18d40e102387fd3e692d4663e86");
        }
        String a2 = uVar.h ? v.a() : "common";
        if (uVar.g) {
            return b(z) + a2 + File.separator;
        }
        return a(z) + a2 + File.separator;
    }

    public static String a(String str, u uVar) {
        Object[] objArr = {str, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25297e92959eaa25c3e3597f26267776", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25297e92959eaa25c3e3597f26267776");
        }
        return a(uVar, false) + str + g;
    }

    public static String b(String str, u uVar) {
        Object[] objArr = {str, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79f1268c570f612e643a29c46171b479", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79f1268c570f612e643a29c46171b479");
        }
        return a(uVar, true) + str + g;
    }

    public static String a(String str, u uVar, boolean z) {
        Object[] objArr = {str, uVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57032a6fdbbd80e0de43371944b91de8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57032a6fdbbd80e0de43371944b91de8");
        }
        return a(uVar, z) + str + i;
    }

    public static String c(String str, u uVar) {
        Object[] objArr = {str, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "141e9e39a68aa2aa448b64e9200ee846", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "141e9e39a68aa2aa448b64e9200ee846");
        }
        return a(uVar, false) + str + h;
    }

    public static String a(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "adf21e388c0d38568b582d32fe269d98", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "adf21e388c0d38568b582d32fe269d98");
        }
        return b(lVar.d) + "lru" + File.separator + lVar.b + File.separator + lVar.c;
    }

    public static String a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e26aeff73cd92a7e5c8969c94dd297b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e26aeff73cd92a7e5c8969c94dd297b5");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr = new char[digest.length * 2];
            int i2 = 0;
            for (byte b2 : digest) {
                int i3 = i2 + 1;
                cArr[i2] = j[(b2 >>> 4) & 15];
                i2 = i3 + 1;
                cArr[i3] = j[b2 & 15];
            }
            return new String(cArr);
        } catch (Exception e2) {
            throw new c((short) -1, (Throwable) e2);
        }
    }

    public static String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5eb3f33b24936e596fe37a59106c3018", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5eb3f33b24936e596fe37a59106c3018");
        }
        if (k != null) {
            return k;
        }
        try {
            k = (String) ApplicationInfo.class.getDeclaredField("primaryCpuAbi").get(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0));
        } catch (Throwable unused) {
        }
        return k == null ? "" : k;
    }

    public static long a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "488818d688b6ef562e148c69ab9ae3f5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "488818d688b6ef562e148c69ab9ae3f5")).longValue();
        }
        long j2 = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isFile()) {
            return file.length();
        }
        String[] list = file.list();
        if (list == null || list.length <= 0) {
            return 0L;
        }
        for (String str : list) {
            j2 += a(new File(file, str));
        }
        return j2;
    }

    public static String a() {
        FileInputStream fileInputStream;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        FileInputStream fileInputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cea50deaa17324c2510f9dc9b9ff7be6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cea50deaa17324c2510f9dc9b9ff7be6");
        }
        if (!TextUtils.isEmpty(l)) {
            return l;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            l = processName;
            return processName;
        }
        File file = new File("/proc/" + Process.myPid() + "/cmdline");
        try {
            long length = file.length();
            if (length == 0) {
                return "";
            }
            byte[] bArr = new byte[(int) length];
            fileInputStream = new FileInputStream(file);
            try {
                if (fileInputStream.read(bArr) == -1) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    return "";
                }
                String str = new String(bArr, "UTF-8").split("\u0000")[0];
                l = str;
                try {
                    fileInputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                return str;
            } catch (Exception unused) {
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return "";
            } catch (Throwable th) {
                th = th;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "baca7410ec0df270396badbff489c867", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "baca7410ec0df270396badbff489c867") : a(str, (List<String>) null);
    }

    public static String a(String str, List<String> list) {
        boolean z;
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b886591b365786e7e625f3916e6ffb67", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b886591b365786e7e625f3916e6ffb67");
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i2 = length - 1;
        int i3 = -1;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (charAt >= '0' && charAt <= '9') {
                i4++;
            }
            char[] cArr = b.a;
            int length2 = cArr.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length2) {
                    z = false;
                    break;
                } else if (charAt == cArr[i6]) {
                    z = true;
                    break;
                } else {
                    i6++;
                }
            }
            if (z || i5 == i2) {
                String substring = str.substring(i3 + 1, z ? i5 : length);
                int length3 = substring.length();
                if (length3 > 0 && i4 * 2 >= length3) {
                    sb.append(":cipsdyn:");
                    if (list != null) {
                        list.add(substring);
                    }
                } else {
                    sb.append(substring);
                }
                if (z) {
                    sb.append(charAt);
                }
                i3 = i5;
                i4 = 0;
            }
        }
        return i3 != -1 ? sb.toString() : str;
    }

    public static <K, V> void a(Map<K, V> map, Map<K, V> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "601d66cedec6c2f9b17f9380485a098a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "601d66cedec6c2f9b17f9380485a098a");
            return;
        }
        for (Map.Entry<K, V> entry : map2.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (Build.VERSION.SDK_INT >= 24) {
                map.putIfAbsent(key, value);
            } else if (!map.containsKey(key)) {
                map.put(key, value);
            }
        }
    }
}
