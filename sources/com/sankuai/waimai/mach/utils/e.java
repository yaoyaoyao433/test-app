package com.sankuai.waimai.mach.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.gson.Gson;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.l;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a = null;
    public static ar b = null;
    private static SimpleDateFormat c = null;
    private static String d = "https://catfront.dianping.com/";

    public static String a(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a86800325b6a1fbe0e4005bb323c9e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a86800325b6a1fbe0e4005bb323c9e2");
        }
        return str.replaceAll(str2 + CommonConstant.Symbol.DOT + str4, str3 + CommonConstant.Symbol.DOT + str4);
    }

    public static String b(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd0b0f379e1d577f0348d0e5c53b1fa2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd0b0f379e1d577f0348d0e5c53b1fa2");
        }
        return str.replaceAll(str2, str3 + CommonConstant.Symbol.DOT + str4);
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93be6d7b0b42a066913482e844f0f8c4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93be6d7b0b42a066913482e844f0f8c4")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return StringUtil.NULL.equals(str);
    }

    public static boolean a(Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c58e5f6324f914e86f1bd883a34eb526", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c58e5f6324f914e86f1bd883a34eb526")).booleanValue();
        }
        if (map == null) {
            return true;
        }
        return map.isEmpty();
    }

    public static void a(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff497afdca3728ae9b609fd58e84202d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff497afdca3728ae9b609fd58e84202d");
        } else if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(OutputStream outputStream) {
        Object[] objArr = {outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "461aa498f731599604ea06e6bd777e65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "461aa498f731599604ea06e6bd777e65");
        } else if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(BufferedWriter bufferedWriter) {
        Object[] objArr = {bufferedWriter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8072be3c919c73d57110d7c18b9740c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8072be3c919c73d57110d7c18b9740c");
        } else if (bufferedWriter != null) {
            try {
                bufferedWriter.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
        if (r12 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
        if (r12 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
        if (r12 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.io.File r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.mach.utils.e.a
            java.lang.String r11 = "df95a23bcdbbbb1104e8fb0c5357f52d"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r10, r0, r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L22:
            if (r12 == 0) goto L80
            boolean r1 = r12.exists()
            if (r1 == 0) goto L80
            boolean r1 = r12.isDirectory()
            if (r1 == 0) goto L80
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r12 = r12.getAbsolutePath()
            r3.append(r12)
            java.lang.String r12 = java.io.File.separator
            r3.append(r12)
            java.lang.String r12 = "__deleted__"
            r3.append(r12)
            java.lang.String r12 = r3.toString()
            r1.<init>(r12)
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L71 java.io.IOException -> L78 java.io.FileNotFoundException -> L7c
            r12.<init>(r1, r9)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L71 java.io.IOException -> L78 java.io.FileNotFoundException -> L7c
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L72 java.io.IOException -> L79 java.io.FileNotFoundException -> L7d
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L72 java.io.IOException -> L79 java.io.FileNotFoundException -> L7d
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L72 java.io.IOException -> L79 java.io.FileNotFoundException -> L7d
            r12.write(r1)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L72 java.io.IOException -> L79 java.io.FileNotFoundException -> L7d
            r12.close()     // Catch: java.io.IOException -> L81
            goto L81
        L67:
            r0 = move-exception
            goto L6b
        L69:
            r0 = move-exception
            r12 = r2
        L6b:
            if (r12 == 0) goto L70
            r12.close()     // Catch: java.io.IOException -> L70
        L70:
            throw r0
        L71:
            r12 = r2
        L72:
            if (r12 == 0) goto L80
        L74:
            r12.close()     // Catch: java.io.IOException -> L80
            goto L80
        L78:
            r12 = r2
        L79:
            if (r12 == 0) goto L80
            goto L74
        L7c:
            r12 = r2
        L7d:
            if (r12 == 0) goto L80
            goto L74
        L80:
            r0 = 0
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.utils.e.a(java.io.File):boolean");
    }

    public static boolean b(File file) {
        File[] listFiles;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf020c4fe532f6831984cf6c6877d79e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf020c4fe532f6831984cf6c6877d79e")).booleanValue();
        }
        if (file != null && file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (file2.isFile() && "__deleted__".equals(file2.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(Context context) {
        boolean equals;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd1c2104667aab795f94f58831c2dfc8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd1c2104667aab795f94f58831c2dfc8")).booleanValue();
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = l.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f4291006ce8eeefbb32f646d33f2529b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f4291006ce8eeefbb32f646d33f2529b")).booleanValue() : l.a(context, "waimai_takeout", "mach_debug", false)) {
            return true;
        }
        if (l.a()) {
            String a2 = com.sankuai.meituan.switchtestenv.a.a(context, "https://apimobile.meituan.com/appupdate/mach/checkUpdate");
            Object[] objArr3 = {"https://apimobile.meituan.com/appupdate/mach/checkUpdate", a2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "0f354f485edd166d3778a33b8751f4da", RobustBitConfig.DEFAULT_VALUE)) {
                equals = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "0f354f485edd166d3778a33b8751f4da")).booleanValue();
            } else if (TextUtils.isEmpty("https://apimobile.meituan.com/appupdate/mach/checkUpdate") || TextUtils.isEmpty(a2)) {
                equals = TextUtils.equals("https://apimobile.meituan.com/appupdate/mach/checkUpdate", a2);
            } else {
                equals = TextUtils.equals(Uri.parse("https://apimobile.meituan.com/appupdate/mach/checkUpdate").getHost(), Uri.parse(a2).getHost());
            }
            return !equals;
        }
        return false;
    }

    public static int a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28ba3ab16814eb77b3428d968c378f2e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28ba3ab16814eb77b3428d968c378f2e")).intValue();
        }
        if (str == null || str2 == null) {
            throw new RuntimeException("版本号不能为空");
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int min = Math.min(split.length, split2.length);
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            i = split[i2].length() - split2[i2].length();
            if (i != 0 || (i = split[i2].compareTo(split2[i2])) != 0) {
                break;
            }
        }
        return i != 0 ? i : split.length - split2.length;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean b(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "504552d202176307bcd46c652b869ceb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "504552d202176307bcd46c652b869ceb")).booleanValue();
        }
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception e) {
            com.sankuai.waimai.mach.log.b.b("MachUtil", "获取网络状态异常 | " + e.getMessage());
        }
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
            if (activeNetworkInfo.isAvailable()) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50949b2f389e37b4d571ba4e790859f7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50949b2f389e37b4d571ba4e790859f7")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            URI uri = new URI(str);
            if (uri.getHost() == null) {
                return false;
            }
            return uri.getScheme().equalsIgnoreCase("http") || uri.getScheme().equalsIgnoreCase("https");
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static <T> boolean a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce0aa2a17992069bab944924e1a8810b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce0aa2a17992069bab944924e1a8810b")).booleanValue() : list == null || list.isEmpty();
    }

    public static <T> boolean b(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "247c2cb5c4f82771ff437994d8c70893", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "247c2cb5c4f82771ff437994d8c70893")).booleanValue() : (list == null || list.isEmpty()) ? false : true;
    }

    @SuppressLint({"NewApi"})
    public static boolean c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff866438a6f827b207656df0ae036673", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff866438a6f827b207656df0ae036673")).booleanValue();
        }
        if (context == null) {
            return true;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return true;
            }
        }
        return false;
    }

    public static void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8119fbbfac17c24ba50a7fc0adb586ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8119fbbfac17c24ba50a7fc0adb586ca");
        } else {
            Mach.getMainHandler().post(runnable);
        }
    }

    public static String a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0033e6547bf0de0fd0c83e5b9030c4f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0033e6547bf0de0fd0c83e5b9030c4f4");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if ("dd".equals(str)) {
            long j2 = j / 86400000;
            if (j2 == 0) {
                return "00";
            }
            if (j2 < 10) {
                return "0" + j2;
            }
            return String.valueOf(j2);
        } else if ("d".equals(str)) {
            return String.valueOf(j / 86400000);
        } else {
            if ("HHH".equals(str)) {
                long j3 = j / DDLoadConstants.TIME_HOURS_MILLIS;
                if (j3 == 0) {
                    return "00";
                }
                if (j3 < 10) {
                    return "0" + j3;
                }
                return String.valueOf(j3);
            }
            if (c == null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
                c = simpleDateFormat;
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            }
            c.applyPattern(str);
            return c.format(new Date(j));
        }
    }

    @Nullable
    public static <T> T a(@Nullable List<T> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6b99b473106ad8e17ea7f949b28f502", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6b99b473106ad8e17ea7f949b28f502");
        }
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static boolean a(com.sankuai.waimai.mach.node.a<? extends ViewGroup> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ec0459f343f3cd22d76236f54bf9416", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ec0459f343f3cd22d76236f54bf9416")).booleanValue() : (aVar == null || aVar.b() == null || aVar.b().size() <= 0) ? false : true;
    }

    public static <T> boolean a(List<WeakReference<T>> list, T t) {
        Object[] objArr = {list, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97f55fe45b8a6fee17ba8209076ccfdb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97f55fe45b8a6fee17ba8209076ccfdb")).booleanValue();
        }
        if (a(list) || t == null) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            WeakReference<T> weakReference = list.get(i);
            if (weakReference != null && weakReference.get() == t) {
                return true;
            }
        }
        return false;
    }

    public static <T> void b(List<WeakReference<T>> list, T t) {
        Object[] objArr = {list, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9b2e0d5ea2f8d2497e4741802312c32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9b2e0d5ea2f8d2497e4741802312c32");
        } else if (!a(list)) {
            for (WeakReference<T> weakReference : list) {
                if (weakReference != null && weakReference.get() == t) {
                    list.remove(weakReference);
                }
            }
        }
    }

    @NonNull
    public static <T> CopyOnWriteArrayList<WeakReference<T>> a(List<WeakReference<T>> list, com.sankuai.waimai.mach.lifecycle.b bVar) {
        T t;
        Object[] objArr = {list, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b53c2756ffd443d3ad18b88925b8c2bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (CopyOnWriteArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b53c2756ffd443d3ad18b88925b8c2bb");
        }
        CopyOnWriteArrayList<WeakReference<T>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            WeakReference<T> weakReference = list.get(i);
            if (weakReference != null && (t = weakReference.get()) != null && t != bVar) {
                copyOnWriteArrayList.add(weakReference);
            }
        }
        list.clear();
        return copyOnWriteArrayList;
    }

    public static <T> void c(List<WeakReference<T>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "166008afcc3e5d0cf2dda0c57e07f676", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "166008afcc3e5d0cf2dda0c57e07f676");
        } else if (!a(list)) {
            for (WeakReference<T> weakReference : list) {
                if (weakReference == null || weakReference.get() == null) {
                    list.remove(weakReference);
                }
            }
        }
    }

    public static String b(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "810f8fa99ad3e8bcad8305fb94c4fa30", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "810f8fa99ad3e8bcad8305fb94c4fa30");
        }
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        while (true) {
            Map.Entry<String, String> next = it.next();
            sb.append('\"');
            sb.append(next.getKey());
            sb.append('\"');
            sb.append(':');
            sb.append('\"');
            sb.append(next.getValue());
            sb.append('\"');
            if (!it.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            sb.append(',');
            sb.append(Constants.SPACE);
        }
    }

    public static boolean d(Context context) throws RuntimeException {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce23955e92eb1bb51b505676cb794db9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce23955e92eb1bb51b505676cb794db9")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                return accessibilityManager.isTouchExplorationEnabled();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void a(Class cls, String str, @NonNull String str2) {
        Object[] objArr = {cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc692fb19ee36d1cc07fcd7f544dc733", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc692fb19ee36d1cc07fcd7f544dc733");
        } else if (g.a(com.sankuai.waimai.mach.manager.monitor.a.b)) {
            if (str2 == null) {
                str2 = "";
            }
            com.dianping.codelog.b.b(cls, str, str2);
        }
    }

    public static boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47d959fa61d9d743aee94c90ef2617f0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47d959fa61d9d743aee94c90ef2617f0")).booleanValue() : str != null && str.contains("exprAst");
    }

    public static void a(String str, String str2, String str3, String str4, Throwable th) {
        Object[] objArr = {str, str2, str3, str4, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "efeb9491fe4e4be6a3da49871c341346", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "efeb9491fe4e4be6a3da49871c341346");
            return;
        }
        String str5 = "";
        if (th != null) {
            try {
                str5 = (("" + th.getMessage()) + "\n\n") + Log.getStackTraceString(th);
            } catch (Exception unused) {
                return;
            }
        }
        a(str, str2, str3, str4, str5, true, true);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        Object[] objArr = {str, str2, str3, str4, str5, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74dee4bba3ab63a5cf1ce7b634a34018", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74dee4bba3ab63a5cf1ce7b634a34018");
            return;
        }
        JSONObject a2 = a(str2, str3, str4, str5, z, z2);
        if (a2 == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(a2);
        if (b == null) {
            b = new ar.a().a(d).a(com.sankuai.meituan.retrofit2.adapter.rxjava.f.a()).a(com.sankuai.meituan.retrofit2.converter.gson.a.a(new Gson())).a(com.sankuai.waimai.mach.common.i.a().e).a();
        }
        rx.d.a(new rx.j<Void>() { // from class: com.sankuai.waimai.mach.utils.e.1
            @Override // rx.e
            public final void onCompleted() {
            }

            @Override // rx.e
            public final void onError(Throwable th) {
            }

            @Override // rx.e
            public final /* bridge */ /* synthetic */ void onNext(Object obj) {
            }
        }, ((MachWebRaptorService) b.a(MachWebRaptorService.class)).log(z ? "MachPro" : "Mach", jSONArray.toString(), str).b(rx.schedulers.a.a(com.sankuai.android.jarvis.c.a())).a(rx.android.schedulers.a.a()));
    }

    private static JSONObject a(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        String trim;
        Object trim2;
        boolean a2;
        String str5 = str3;
        Object[] objArr = {str, str2, str5, str4, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f487a13069e532c06eaeef6ba54f4ea1", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f487a13069e532c06eaeef6ba54f4ea1");
        }
        if (com.sankuai.waimai.mach.common.i.a().g() == null) {
            return null;
        }
        try {
            if (z2) {
                trim2 = str4;
            } else if (z) {
                trim2 = str5;
                str5 = str5.split("\n")[0];
            } else {
                int max = Math.max(0, str5.indexOf("异常信息："));
                int max2 = Math.max(0, str5.indexOf("异常堆栈："));
                if (max2 == -1) {
                    max2 = str3.length();
                }
                if (max2 > max) {
                    trim = str5.substring(max, max2).replace("异常信息：", "").replace(" #|# ", "").trim();
                } else {
                    trim = str5.substring(max).replace("异常信息：", "").replace(" #|# ", "").trim();
                }
                trim2 = str5.substring(max).replace("异常堆栈：", "").trim();
                str5 = trim;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("project", z ? "com.sankuai.wmmach.machpro" : "com.sankuai.wmmach.mach");
                jSONObject.putOpt("pageUrl", str);
                jSONObject.putOpt("category", "jsError");
                if (!TextUtils.isEmpty(str5)) {
                    if (str5.length() > 199) {
                        str5 = str5.substring(0, 199);
                    }
                    jSONObject.putOpt("sec_category", str5);
                }
                jSONObject.putOpt("level", z2 ? "warn" : "error");
                jSONObject.putOpt("container", z ? "MachPro" : "Mach");
                jSONObject.putOpt("os", "Android");
                jSONObject.putOpt("unionId", com.sankuai.waimai.mach.common.i.a().g().i);
                if (trim2 == null) {
                    trim2 = "unknown";
                }
                jSONObject.putOpt("content", trim2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("appName", com.sankuai.waimai.mach.common.i.a().g().b);
                jSONObject2.putOpt("appVersion", com.sankuai.waimai.mach.common.i.a().g().d);
                String str6 = com.sankuai.waimai.mach.common.i.a().g().p;
                if (str6 == null) {
                    str6 = "unknown";
                }
                jSONObject2.putOpt("biz", str6);
                jSONObject2.putOpt(z ? Constants.ModelBeanConstants.KEY_BUNDLE_NAME : "templateID", str);
                jSONObject2.putOpt(z ? "bundleVersion" : "templateVersion", str2 == null ? "unknown" : str2);
                if (!z) {
                    a2 = l.a();
                } else {
                    a2 = com.sankuai.waimai.machpro.f.a().i != null ? com.sankuai.waimai.machpro.f.a().i.i : false;
                }
                jSONObject2.putOpt("env", a2 ? "test" : "prod");
                jSONObject.putOpt("dynamicMetric", jSONObject2);
                return jSONObject;
            } catch (Exception unused) {
                return jSONObject;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public static void b(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ff8ead7f4be9c86dd41920e0a6f28b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ff8ead7f4be9c86dd41920e0a6f28b1");
        } else if (aVar != null) {
            if (aVar.h != null) {
                aVar.h.b();
            }
            if (aVar.j()) {
                for (com.sankuai.waimai.mach.node.a aVar2 : aVar.b()) {
                    b(aVar2);
                }
            }
        }
    }

    public static <T extends com.sankuai.waimai.mach.component.base.a> boolean a(com.sankuai.waimai.mach.node.a aVar, Class<T> cls) {
        com.sankuai.waimai.mach.lifecycle.d dVar;
        Object[] objArr = {aVar, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a79ed8959bd305047c6b7c7ad29b3249", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a79ed8959bd305047c6b7c7ad29b3249")).booleanValue();
        }
        if (aVar == null || aVar.e == null || (dVar = aVar.e.h) == null) {
            return false;
        }
        return cls.isInstance(dVar);
    }

    public static void c(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f848b3b7eae4bfca36144e77d7679fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f848b3b7eae4bfca36144e77d7679fe");
        } else if (aVar != null && aVar.h != null && aVar.j()) {
            List<com.sankuai.waimai.mach.node.a> b2 = aVar.b();
            for (int i = 0; i < b2.size(); i++) {
                c(b2.get(i));
            }
        }
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0bc80b47c85bb890ded3d1898fb101d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0bc80b47c85bb890ded3d1898fb101d")).booleanValue() : "com.sankuai.meituan.takeoutnew".equals(com.meituan.android.singleton.b.a.getPackageName());
    }
}
