package com.dianping.codelog.Utils;

import android.os.Build;
import android.text.TextUtils;
import com.dianping.logreportswitcher.c;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class f {
    public static ChangeQuickRedirect a = null;
    private static final String b = "f";
    private static e d;
    private static final Queue<JSONObject> c = new ConcurrentLinkedQueue();
    private static boolean e = false;
    private static String f = "";
    private static final ExecutorService g = com.sankuai.android.jarvis.c.a("CodeLogUpload", 2, 10, 10, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardOldestPolicy());

    public static /* synthetic */ void a(JSONObject jSONObject, e eVar) {
        Object[] objArr = {jSONObject, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae60bbed3796ef55d28f943b771bb537", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae60bbed3796ef55d28f943b771bb537");
        } else if (jSONObject != null) {
            if (com.dianping.codelog.b.c()) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
                b(jSONArray.toString(), eVar);
            } else if (c.size() < 200) {
                c.add(jSONObject);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.net.HttpURLConnection] */
    private static void a(String str, boolean z, String str2, e eVar) {
        OutputStream outputStream;
        Object[] objArr = {str, (byte) 1, str2, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        OutputStream outputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee0a0c987a5264f1a342f5249dec8822", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee0a0c987a5264f1a342f5249dec8822");
            return;
        }
        d = eVar;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                str = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str).openConnection());
                try {
                    str.setUseCaches(false);
                    str.setReadTimeout(15000);
                    str.addRequestProperty("Content-Type", "multipart/form-data");
                    str.setRequestProperty("Accept-Encoding", "gzip");
                    str.setDoInput(true);
                    str.setDoOutput(true);
                    str.setRequestMethod("POST");
                    outputStream = str.getOutputStream();
                } catch (AssertionError e2) {
                    e = e2;
                } catch (Exception e3) {
                    e = e3;
                } catch (NoSuchMethodError e4) {
                    e = e4;
                }
                try {
                    outputStream.write(a(str2, (String) null));
                    outputStream.flush();
                    str.connect();
                    if (d != null && str.getResponseCode() != 200) {
                        d.a();
                    }
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                    if (str != 0) {
                        str.disconnect();
                    }
                } catch (AssertionError e6) {
                    e = e6;
                    outputStream2 = outputStream;
                    e.printStackTrace();
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (Exception e7) {
                            e7.printStackTrace();
                        }
                    }
                    if (str != 0) {
                        str.disconnect();
                    }
                } catch (Exception e8) {
                    e = e8;
                    outputStream2 = outputStream;
                    if (d != null) {
                        d.a();
                    }
                    e.printStackTrace();
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (Exception e9) {
                            e9.printStackTrace();
                        }
                    }
                    if (str != 0) {
                        str.disconnect();
                    }
                } catch (NoSuchMethodError e10) {
                    e = e10;
                    outputStream2 = outputStream;
                    e.printStackTrace();
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    if (str != 0) {
                        str.disconnect();
                    }
                } catch (Throwable th) {
                    th = th;
                    outputStream2 = outputStream;
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    }
                    if (str != 0) {
                        str.disconnect();
                    }
                    throw th;
                }
            } catch (AssertionError e13) {
                e = e13;
                str = 0;
            } catch (Exception e14) {
                e = e14;
                str = 0;
            } catch (NoSuchMethodError e15) {
                e = e15;
                str = 0;
            } catch (Throwable th2) {
                th = th2;
                str = 0;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074 A[Catch: JSONException -> 0x0085, TryCatch #0 {JSONException -> 0x0085, blocks: (B:10:0x004a, B:12:0x0060, B:16:0x006c, B:18:0x0074, B:19:0x007f), top: B:24:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject a(java.lang.String r18, long r19, java.lang.String r21, java.lang.String r22, boolean r23) {
        /*
            r0 = r18
            r1 = r19
            r3 = r21
            r4 = r22
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r13 = 0
            r5[r13] = r0
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r1)
            r14 = 1
            r5[r14] = r6
            r6 = 2
            r5[r6] = r3
            r6 = 3
            r5[r6] = r4
            java.lang.Byte r6 = java.lang.Byte.valueOf(r23)
            r7 = 4
            r5[r7] = r6
            com.meituan.robust.ChangeQuickRedirect r15 = com.dianping.codelog.Utils.f.a
            java.lang.String r11 = "0dce4c984ed73c4edecd766ce710ccc5"
            r7 = 0
            r9 = 1
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            r6 = r5
            r8 = r15
            r10 = r11
            r13 = r11
            r11 = r16
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11)
            if (r6 == 0) goto L3e
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r5, r7, r15, r14, r13)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            return r0
        L3e:
            boolean r5 = android.text.TextUtils.isEmpty(r22)
            if (r5 == 0) goto L45
            return r7
        L45:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r6 = "category"
            r5.put(r6, r3)     // Catch: org.json.JSONException -> L85
            java.lang.String r6 = "time"
            r5.put(r6, r1)     // Catch: org.json.JSONException -> L85
            java.lang.String r1 = "level"
            r5.put(r1, r0)     // Catch: org.json.JSONException -> L85
            java.lang.String r0 = "log"
            r5.put(r0, r4)     // Catch: org.json.JSONException -> L85
            if (r23 == 0) goto L6b
            java.lang.String r0 = b(r21, r22)     // Catch: org.json.JSONException -> L85
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: org.json.JSONException -> L85
            if (r1 != 0) goto L6b
            goto L6c
        L6b:
            r0 = r3
        L6c:
            java.lang.String r1 = "::"
            boolean r1 = r0.contains(r1)     // Catch: org.json.JSONException -> L85
            if (r1 == 0) goto L7f
            java.lang.String r1 = "::"
            int r1 = r0.indexOf(r1)     // Catch: org.json.JSONException -> L85
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)     // Catch: org.json.JSONException -> L85
        L7f:
            java.lang.String r1 = "module"
            r5.put(r1, r0)     // Catch: org.json.JSONException -> L85
            goto L89
        L85:
            r0 = move-exception
            r0.printStackTrace()
        L89:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.codelog.Utils.f.a(java.lang.String, long, java.lang.String, java.lang.String, boolean):org.json.JSONObject");
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ad545655796fc73f1f9094322be748b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ad545655796fc73f1f9094322be748b");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str != null && str.length() > 10000) {
            str = str.substring(0, 9995) + "...";
            if (a.a(com.dianping.codelog.b.b())) {
                c.a(b, "Log toooooooo long, it's over:10000, -------->" + str);
            }
        }
        return str;
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c11b997d539e25e2ac7fa1427b10acc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c11b997d539e25e2ac7fa1427b10acc");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str != null && str.length() > 50) {
            str = str.substring(0, 45) + "...";
            if (a.a(com.dianping.codelog.b.b())) {
                c.a(b, "Tag toooooooo long, it's over:50, -------->" + str);
            }
        }
        return str;
    }

    public static String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24e62e5a0eaedc02e3680cd6215d005c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24e62e5a0eaedc02e3680cd6215d005c");
        }
        if (str.length() > 80) {
            return "…" + str.substring((str.length() - 80) + 1);
        }
        return str;
    }

    private static JSONObject d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f8066bb89d3626f117810d37c7d3882", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f8066bb89d3626f117810d37c7d3882");
        }
        JSONObject jSONObject = com.dianping.codelog.b.a().c() == null ? new JSONObject() : com.dianping.codelog.b.a().c();
        try {
            jSONObject.put("appId", com.dianping.codelog.b.a().a());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            jSONObject.put("unionId", com.dianping.codelog.b.a().b());
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            jSONObject.put("debug", a.a(com.dianping.codelog.b.b()));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        try {
            jSONObject.put("platform", "android");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        try {
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str)) {
                str = str.trim();
            }
            jSONObject.put("platVersion", str);
            jSONObject.put("os-build", str);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        try {
            jSONObject.put("deviceBrand", Build.BRAND);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        try {
            jSONObject.put(DeviceInfo.DEVICE_MODEL, Build.MODEL);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        try {
            jSONObject.put("device-fingerprint", Build.FINGERPRINT);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return jSONObject;
    }

    public static void a(final String str, final String str2, final String str3, final boolean z, final e eVar) {
        Object[] objArr = {str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0), eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1a154c7184a5426f917baa420175c9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1a154c7184a5426f917baa420175c9e");
        } else if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
        } else {
            g.execute(new Runnable() { // from class: com.dianping.codelog.Utils.f.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11222d6a18e6a80a21588f1a15e855da", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11222d6a18e6a80a21588f1a15e855da");
                        return;
                    }
                    try {
                        JSONObject a2 = f.a(str, System.currentTimeMillis(), str2, f.a(str3), z);
                        Object[] objArr3 = {a2};
                        ChangeQuickRedirect changeQuickRedirect3 = d.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6d144b108c7ec08a9d34fa86c2730e56", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6d144b108c7ec08a9d34fa86c2730e56");
                        } else if (a2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(SnifferDBHelper.COLUMN_LOG, a2.get(SnifferDBHelper.COLUMN_LOG));
                                jSONObject.put("level", a2.getString("level"));
                                jSONObject.put(DeviceInfo.TM, a2.getString("time"));
                                jSONObject.put("category", a2.getString("category"));
                                com.dianping.networklog.c.a(jSONObject.toString(), 3);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                        if (str.equals("error")) {
                            f.a(a2, eVar);
                        }
                    } catch (OutOfMemoryError e3) {
                        String str4 = f.b;
                        c.a(str4, "OOM: " + e3.getMessage());
                    }
                }
            });
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4999a08bab45a3900e86ae344c9c2e5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4999a08bab45a3900e86ae344c9c2e5d");
        } else if (c.isEmpty()) {
        } else {
            final e eVar = new e() { // from class: com.dianping.codelog.Utils.f.2
                public static ChangeQuickRedirect a;

                @Override // com.dianping.codelog.Utils.e
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61f620530a5c881b2445239d9a0d960c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61f620530a5c881b2445239d9a0d960c");
                    } else {
                        c.a(f.b, "post cache log fail.");
                    }
                }
            };
            g.execute(new Runnable() { // from class: com.dianping.codelog.Utils.f.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95baed45668c0183c0e14fed46eb2a21", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95baed45668c0183c0e14fed46eb2a21");
                        return;
                    }
                    JSONArray jSONArray = new JSONArray();
                    for (JSONObject jSONObject : f.c) {
                        jSONArray.put(jSONObject);
                    }
                    f.c.clear();
                    f.b(jSONArray.toString(), e.this);
                }
            });
        }
    }

    private static byte[] a(String str, String str2) {
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eed1bed6980e0019081db7fa98ff63e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eed1bed6980e0019081db7fa98ff63e3");
        }
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String str3 = TextUtils.isEmpty(null) ? "UTF-8" : null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = null;
            }
        } catch (IOException e2) {
            e = e2;
        }
        try {
            gZIPOutputStream.write(str.getBytes(str3));
            gZIPOutputStream.flush();
            byteArrayOutputStream.close();
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                gZIPOutputStream.close();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            return byteArray;
        } catch (IOException e4) {
            e = e4;
            gZIPOutputStream2 = gZIPOutputStream;
            e.printStackTrace();
            byte[] bArr = new byte[0];
            try {
                byteArrayOutputStream.close();
                if (gZIPOutputStream2 != null) {
                    gZIPOutputStream2.close();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return bArr;
        } catch (Throwable th2) {
            th = th2;
            try {
                byteArrayOutputStream.close();
                if (gZIPOutputStream != null) {
                    gZIPOutputStream.close();
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            throw th;
        }
    }

    private static String b(String str, String str2) {
        boolean z;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b63b27e9891716ea1e9f181a2b1a547", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b63b27e9891716ea1e9f181a2b1a547");
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            String substring = str2.substring(str2.indexOf(str, 1) + str.length() + 1);
            Pattern compile = Pattern.compile(".*?\\bat\\s+((?:[^\\s\":./()]+\\.)*[^\\s\":./()]+)\\..*");
            for (String str3 : substring.split("\n")) {
                Matcher matcher = compile.matcher(str3);
                if (matcher.find()) {
                    String group = matcher.group(1);
                    Object[] objArr2 = {group};
                    ChangeQuickRedirect changeQuickRedirect2 = com.dianping.codelog.Constants.a.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "66879bcc65a8cd78f74f0eee0083920f", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "66879bcc65a8cd78f74f0eee0083920f")).booleanValue();
                    } else {
                        if (group != null && !group.isEmpty() && (group.startsWith("com.dianping.") || group.startsWith("com.meituan.") || group.startsWith("com.sankuai.") || group.startsWith("com.google.zxing."))) {
                            z = true;
                        }
                        z = false;
                    }
                    if (z) {
                        return group;
                    }
                }
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, e eVar) {
        Object[] objArr = {str, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "476d0cfb64a5c64cfba23897e5144c83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "476d0cfb64a5c64cfba23897e5144c83");
            return;
        }
        boolean a2 = c.b.a.a("codelog");
        if (TextUtils.isEmpty(str) || !a2) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", str);
            jSONObject.put("customParam", d().toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        try {
            a(b.a(true), true, jSONObject.toString(), eVar);
        } catch (Exception e3) {
            String str2 = b;
            c.a(str2, "Failed to post log " + e3);
        } catch (OutOfMemoryError e4) {
            String str3 = b;
            c.a(str3, "Failed to post log " + e4.getMessage());
        }
    }
}
