package com.sankuai.meituan.kernel.net.utils;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.metrics.traffic.report.BusinessCodeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.t;
import dianping.com.nvlinker.NVLinker;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import okhttp3.Headers;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile ExecutorService b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends IOException {
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.kernel.net.utils.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0596b extends IOException {
    }

    public static int a() {
        return -700;
    }

    public static boolean a(int i) {
        return i > 25000;
    }

    public static int b() {
        return -999;
    }

    private static int b(int i) {
        return (i < -1000 || i > 600) ? i : i + 10000;
    }

    public static int a(Headers headers) {
        Object[] objArr = {headers};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5add9b54251eb35b4077d9052e58816", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5add9b54251eb35b4077d9052e58816")).intValue();
        }
        if (headers == null || headers.size() == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            sb.append(headers.name(i));
            sb.append(headers.value(i));
        }
        return sb.toString().getBytes().length;
    }

    private static int a(Reader reader) {
        JsonElement jsonElement;
        Object[] objArr = {reader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8af763b7557f1e0cb13abdd147b47f7c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8af763b7557f1e0cb13abdd147b47f7c")).intValue();
        }
        if (reader == null) {
            return BusinessCodeUtil.CODE_JSON_GZIP_FAIL;
        }
        try {
            jsonElement = new JsonParser().parse(reader);
        } catch (Exception unused) {
            jsonElement = null;
        }
        return a(jsonElement);
    }

    private static int a(JsonElement jsonElement) {
        JsonObject jsonObject;
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b188e32db4fdf58d51fc14238ba157cd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b188e32db4fdf58d51fc14238ba157cd")).intValue();
        }
        if (jsonElement == null || jsonElement.isJsonPrimitive() || jsonElement.isJsonNull()) {
            return BusinessCodeUtil.CODE_JSON_PARSER_FAIL;
        }
        if (jsonElement.isJsonArray()) {
            return BusinessCodeUtil.CODE_DATA_ARRAY;
        }
        try {
            jsonObject = jsonElement.getAsJsonObject();
        } catch (Exception unused) {
            jsonObject = null;
        }
        if (jsonObject == null) {
            return BusinessCodeUtil.CODE_JSON_PARSER_FAIL;
        }
        int a2 = a(jsonObject, "code");
        if (Integer.MAX_VALUE != a2) {
            return a2;
        }
        int a3 = a(jsonObject, "status");
        if (Integer.MAX_VALUE != a3) {
            return a3;
        }
        int a4 = a(jsonObject, "apicode");
        if (Integer.MAX_VALUE != a4) {
            return a4;
        }
        int a5 = a(jsonObject, "statusCode");
        if (Integer.MAX_VALUE != a5) {
            return a5;
        }
        int a6 = a(jsonObject);
        if (Integer.MAX_VALUE != a6) {
            return a6;
        }
        try {
            JsonObject asJsonObject = jsonObject.getAsJsonObject("error");
            if (asJsonObject != null) {
                int a7 = a(asJsonObject, "code");
                if (Integer.MAX_VALUE != a7) {
                    return a7;
                }
            }
        } catch (Exception unused2) {
        }
        try {
            JsonElement jsonElement2 = jsonObject.get("data");
            return jsonElement2 != null ? jsonElement2.isJsonObject() ? jsonElement2.getAsJsonObject().size() > 0 ? BusinessCodeUtil.CODE_DATA_HAS_CONTENT : BusinessCodeUtil.CODE_DATA_NULL_CONTENT : jsonElement2.isJsonArray() ? jsonElement2.getAsJsonArray().size() > 0 ? BusinessCodeUtil.CODE_DATA_HAS_CONTENT : BusinessCodeUtil.CODE_DATA_NULL_CONTENT : jsonElement2.isJsonPrimitive() ? BusinessCodeUtil.CODE_DATA_HAS_CONTENT : jsonElement2.isJsonNull() ? BusinessCodeUtil.CODE_DATA_NULL_CONTENT : BusinessCodeUtil.CODE_MATCH_FAIL : BusinessCodeUtil.CODE_MATCH_FAIL;
        } catch (Exception unused3) {
            return BusinessCodeUtil.CODE_MATCH_FAIL;
        }
    }

    private static int a(JsonObject jsonObject, String str) {
        int i;
        JsonPrimitive b2;
        Object[] objArr = {jsonObject, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc3e60844f25625b475200aa20bb7604", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc3e60844f25625b475200aa20bb7604")).intValue();
        }
        try {
            b2 = b(jsonObject, str);
        } catch (Exception unused) {
            i = Integer.MAX_VALUE;
        }
        if (b2 == null) {
            return Integer.MAX_VALUE;
        }
        i = b2.getAsInt();
        if (Integer.MAX_VALUE == i) {
            return Integer.MAX_VALUE;
        }
        return b(i);
    }

    private static int a(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82661e5f824d02a667825d0fee9d72e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82661e5f824d02a667825d0fee9d72e0")).intValue();
        }
        try {
            JsonPrimitive b2 = b(jsonObject, "state");
            if (b2 == null) {
                return Integer.MAX_VALUE;
            }
            if (b2.getAsBoolean()) {
                return b(1);
            }
            return b(0);
        } catch (Exception unused) {
            return Integer.MAX_VALUE;
        }
    }

    private static JsonPrimitive b(JsonObject jsonObject, String str) throws IllegalStateException {
        Object[] objArr = {jsonObject, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b945503c64059b0d88c98a3e9961cf6", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonPrimitive) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b945503c64059b0d88c98a3e9961cf6");
        }
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null) {
            return null;
        }
        return jsonElement.getAsJsonPrimitive();
    }

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a9e8dfcb3264fc54bf8d01a42674255", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a9e8dfcb3264fc54bf8d01a42674255")).intValue() : (!"http".equalsIgnoreCase(str) && "https".equalsIgnoreCase(str)) ? 8 : 0;
    }

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67e42b4cf0afcca56efbc8971fc4acea", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67e42b4cf0afcca56efbc8971fc4acea");
        }
        com.sankuai.meituan.kernel.net.base.b a2 = com.sankuai.meituan.kernel.net.base.c.a();
        return a2 != null ? a2.l() : "";
    }

    public static int a(byte[] bArr, Charset charset, String str) {
        Reader reader;
        Object[] objArr = {bArr, charset, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88053d19f64ca7496f379271633fe615", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88053d19f64ca7496f379271633fe615")).intValue();
        }
        try {
            reader = b(bArr, charset, str);
            try {
                int a2 = a(reader);
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException unused) {
                    }
                }
                return a2;
            } catch (OutOfMemoryError unused2) {
                if (reader != null) {
                    try {
                        reader.close();
                        return BusinessCodeUtil.CODE_OOM_FAIL;
                    } catch (IOException unused3) {
                        return BusinessCodeUtil.CODE_OOM_FAIL;
                    }
                }
                return BusinessCodeUtil.CODE_OOM_FAIL;
            } catch (Throwable unused4) {
                if (reader != null) {
                    try {
                        reader.close();
                        return BusinessCodeUtil.CODE_ERROR_FAIL;
                    } catch (IOException unused5) {
                        return BusinessCodeUtil.CODE_ERROR_FAIL;
                    }
                }
                return BusinessCodeUtil.CODE_ERROR_FAIL;
            }
        } catch (OutOfMemoryError unused6) {
            reader = null;
        } catch (Throwable unused7) {
            reader = null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(4:(3:29|30|(6:32|11|12|23|24|25))|23|24|25)|10|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        r10 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b A[Catch: IOException -> 0x005e, TRY_LEAVE, TryCatch #2 {IOException -> 0x005e, blocks: (B:21:0x0056, B:23:0x005b), top: B:32:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.io.Reader b(byte[] r10, java.nio.charset.Charset r11, java.lang.String r12) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r10
            r8 = 1
            r0[r8] = r11
            r11 = 2
            r0[r11] = r12
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.meituan.kernel.net.utils.b.a
            java.lang.String r9 = "eacdb657009547a5e0a02d41f752f296"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r11
            r5 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L24
            java.lang.Object r10 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r11, r8, r9)
            java.io.Reader r10 = (java.io.Reader) r10
            return r10
        L24:
            if (r10 == 0) goto L5f
            int r11 = r10.length
            if (r11 != 0) goto L2a
            goto L5f
        L2a:
            if (r12 == 0) goto L40
            java.lang.String r11 = "gzip"
            boolean r11 = r12.equalsIgnoreCase(r11)     // Catch: java.lang.Exception -> L52
            if (r11 == 0) goto L40
            java.util.zip.GZIPInputStream r11 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Exception -> L52
            java.io.ByteArrayInputStream r12 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L52
            r12.<init>(r10)     // Catch: java.lang.Exception -> L52
            r11.<init>(r12)     // Catch: java.lang.Exception -> L52
            goto L45
        L40:
            java.io.ByteArrayInputStream r11 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L52
            r11.<init>(r10)     // Catch: java.lang.Exception -> L52
        L45:
            java.io.BufferedInputStream r10 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> L50
            r10.<init>(r11)     // Catch: java.lang.Exception -> L50
            java.io.InputStreamReader r12 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L54
            r12.<init>(r10)     // Catch: java.lang.Exception -> L54
            return r12
        L50:
            r10 = r2
            goto L54
        L52:
            r10 = r2
            r11 = r10
        L54:
            if (r11 == 0) goto L59
            r11.close()     // Catch: java.io.IOException -> L5e
        L59:
            if (r10 == 0) goto L5e
            r10.close()     // Catch: java.io.IOException -> L5e
        L5e:
            return r2
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.kernel.net.utils.b.b(byte[], java.nio.charset.Charset, java.lang.String):java.io.Reader");
    }

    public static Map<String, String> b(String str) {
        String[] split;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39cfb2788ec13490207190abffd585a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39cfb2788ec13490207190abffd585a1");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String[] split2 = str.split(";");
        if (split2 != null && split2.length > 0) {
            for (String str2 : split2) {
                if (!TextUtils.isEmpty(str2) && (split = str2.split("=")) != null && split.length == 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                    hashMap.put(split[0], split[1]);
                }
            }
        }
        return hashMap;
    }

    public static Map<String, String> a(String str, int i, String str2, String str3) {
        Object[] objArr = {str, Integer.valueOf(i), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed7176fc1f24d4feefc5962289cb0552", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed7176fc1f24d4feefc5962289cb0552");
        }
        HashMap hashMap = new HashMap();
        com.sankuai.meituan.kernel.net.base.b a2 = com.sankuai.meituan.kernel.net.base.c.a();
        if (a2 == null) {
            return hashMap;
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("businessCode", str2);
        }
        hashMap.put("code", String.valueOf(i));
        hashMap.put("from", str);
        hashMap.put(DeviceInfo.USER_ID, String.valueOf(a2.a()));
        hashMap.put("isBg", NVLinker.isAppBackground() ? "1" : "0");
        return hashMap;
    }

    public static ExecutorService c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "34e5d9e305e24be36d3eb5cb73ba5bd1", RobustBitConfig.DEFAULT_VALUE)) {
            return (ExecutorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "34e5d9e305e24be36d3eb5cb73ba5bd1");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = com.sankuai.android.jarvis.c.b("mt-netmodule");
                }
            }
        }
        return b;
    }

    public static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ecb11190f8b17612129efa99c177b7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ecb11190f8b17612129efa99c177b7f");
        } else {
            d(t.e(str).f());
        }
    }

    public static void d(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "311697b5f6de00efc59d27864fc031d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "311697b5f6de00efc59d27864fc031d3");
        } else {
            c().submit(new Runnable() { // from class: com.sankuai.meituan.kernel.net.utils.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af34e49a7323b5550b72cb22f549e417", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af34e49a7323b5550b72cb22f549e417");
                        return;
                    }
                    com.sankuai.meituan.kernel.net.report.a.a().uploadDNS(str, com.sankuai.meituan.common.net.a.b(str));
                }
            });
        }
    }

    public static String e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed4fc7f35b98b38ec08721277565b036", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed4fc7f35b98b38ec08721277565b036") : TextUtils.isEmpty(str) ? "" : str.replaceAll("[(\\u4e00-\\u9fa5)]", "");
    }
}
