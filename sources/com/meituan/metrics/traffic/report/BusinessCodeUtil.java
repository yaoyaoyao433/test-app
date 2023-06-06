package com.meituan.metrics.traffic.report;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BusinessCodeUtil {
    private static final String APICODE_PATTERNSTR = "apicode";
    public static final int CODE_DATA_ARRAY = 8995;
    public static final int CODE_DATA_HAS_CONTENT = 8997;
    public static final int CODE_DATA_NULL_CONTENT = 8996;
    public static final int CODE_ERROR_FAIL = -702;
    public static final int CODE_JSON_GZIP_FAIL = -998;
    public static final int CODE_JSON_PARSER_FAIL = -997;
    public static final int CODE_MATCH_FAIL = 8999;
    public static final int CODE_OOM_FAIL = -701;
    private static final String CODE_PATTERNSTR = "code";
    public static final int CODE_STATE_FALSE = 0;
    public static final int CODE_STATE_TRUE = 1;
    private static final String DATA_PATTERNSTR = "data";
    public static final int ERROR_CODE = Integer.MAX_VALUE;
    private static final String ERROR_PATTERNSTR = "error";
    private static final String STATE_PATTERNSTR = "state";
    private static final String STATUSCODE_PATTERNSTR = "statusCode";
    private static final String STATUS_PATTERNSTR = "status";
    public static final String UTF8 = "UTF-8";
    public static ChangeQuickRedirect changeQuickRedirect;

    private static int getCode(Reader reader) {
        JsonElement jsonElement;
        Object[] objArr = {reader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ea900a08df277d6d237d676956c40f9b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ea900a08df277d6d237d676956c40f9b")).intValue();
        }
        if (reader == null) {
            return CODE_JSON_GZIP_FAIL;
        }
        try {
            jsonElement = new JsonParser().parse(reader);
        } catch (Exception unused) {
            jsonElement = null;
        }
        return getCode(jsonElement);
    }

    private static int getCode(JsonElement jsonElement) {
        JsonObject jsonObject;
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7af34d83299f45f763e36fc53a33f313", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7af34d83299f45f763e36fc53a33f313")).intValue();
        }
        if (jsonElement == null || jsonElement.isJsonPrimitive() || jsonElement.isJsonNull()) {
            return CODE_JSON_PARSER_FAIL;
        }
        if (jsonElement.isJsonArray()) {
            return CODE_DATA_ARRAY;
        }
        try {
            jsonObject = jsonElement.getAsJsonObject();
        } catch (Exception unused) {
            jsonObject = null;
        }
        if (jsonObject == null) {
            return CODE_JSON_PARSER_FAIL;
        }
        int code = getCode(jsonObject, "code");
        if (Integer.MAX_VALUE != code) {
            return code;
        }
        int code2 = getCode(jsonObject, "status");
        if (Integer.MAX_VALUE != code2) {
            return code2;
        }
        int code3 = getCode(jsonObject, APICODE_PATTERNSTR);
        if (Integer.MAX_VALUE != code3) {
            return code3;
        }
        int code4 = getCode(jsonObject, "statusCode");
        if (Integer.MAX_VALUE != code4) {
            return code4;
        }
        int stateCode = getStateCode(jsonObject);
        if (Integer.MAX_VALUE != stateCode) {
            return stateCode;
        }
        try {
            JsonObject asJsonObject = jsonObject.getAsJsonObject("error");
            if (asJsonObject != null) {
                int code5 = getCode(asJsonObject, "code");
                if (Integer.MAX_VALUE != code5) {
                    return code5;
                }
            }
        } catch (Exception unused2) {
        }
        try {
            JsonElement jsonElement2 = jsonObject.get("data");
            return jsonElement2 != null ? jsonElement2.isJsonObject() ? jsonElement2.getAsJsonObject().size() > 0 ? CODE_DATA_HAS_CONTENT : CODE_DATA_NULL_CONTENT : jsonElement2.isJsonArray() ? jsonElement2.getAsJsonArray().size() > 0 ? CODE_DATA_HAS_CONTENT : CODE_DATA_NULL_CONTENT : jsonElement2.isJsonPrimitive() ? CODE_DATA_HAS_CONTENT : jsonElement2.isJsonNull() ? CODE_DATA_NULL_CONTENT : CODE_MATCH_FAIL : CODE_MATCH_FAIL;
        } catch (Exception unused3) {
            return CODE_MATCH_FAIL;
        }
    }

    private static int getCode(JsonObject jsonObject, String str) {
        Object[] objArr = {jsonObject, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4361c8af087f408c3673395ae089721b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4361c8af087f408c3673395ae089721b")).intValue();
        }
        try {
            JsonPrimitive jsonPrimitive = getJsonPrimitive(jsonObject, str);
            if (jsonPrimitive == null) {
                return Integer.MAX_VALUE;
            }
            return jsonPrimitive.getAsInt();
        } catch (Exception unused) {
            return Integer.MAX_VALUE;
        }
    }

    private static int getStateCode(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1078e8a2baad07d0063ad500032ad633", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1078e8a2baad07d0063ad500032ad633")).intValue();
        }
        try {
            JsonPrimitive jsonPrimitive = getJsonPrimitive(jsonObject, "state");
            if (jsonPrimitive == null) {
                return Integer.MAX_VALUE;
            }
            return jsonPrimitive.getAsBoolean() ? 1 : 0;
        } catch (Exception unused) {
            return Integer.MAX_VALUE;
        }
    }

    private static JsonPrimitive getJsonPrimitive(JsonObject jsonObject, String str) throws IllegalStateException {
        Object[] objArr = {jsonObject, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9baea1ddb557e719b2f60d5adc194060", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonPrimitive) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9baea1ddb557e719b2f60d5adc194060");
        }
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null) {
            return null;
        }
        return jsonElement.getAsJsonPrimitive();
    }

    @Deprecated
    public static int getCode(byte[] bArr, Charset charset, String str) {
        Reader reader;
        Object[] objArr = {bArr, charset, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e1a15f655cc569e1fd9d05195b6230bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e1a15f655cc569e1fd9d05195b6230bd")).intValue();
        }
        try {
            reader = getBodyReader(bArr, charset, str);
            try {
                int code = getCode(reader);
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException unused) {
                    }
                }
                return code;
            } catch (OutOfMemoryError unused2) {
                if (reader != null) {
                    try {
                        reader.close();
                        return CODE_OOM_FAIL;
                    } catch (IOException unused3) {
                        return CODE_OOM_FAIL;
                    }
                }
                return CODE_OOM_FAIL;
            } catch (Throwable unused4) {
                if (reader != null) {
                    try {
                        reader.close();
                        return CODE_ERROR_FAIL;
                    } catch (IOException unused5) {
                        return CODE_ERROR_FAIL;
                    }
                }
                return CODE_ERROR_FAIL;
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
    private static java.io.Reader getBodyReader(byte[] r10, java.nio.charset.Charset r11, java.lang.String r12) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r10
            r8 = 1
            r0[r8] = r11
            r11 = 2
            r0[r11] = r12
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.metrics.traffic.report.BusinessCodeUtil.changeQuickRedirect
            java.lang.String r9 = "d491eaf9b773e77e44734e908fd63ee7"
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
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.metrics.traffic.report.BusinessCodeUtil.getBodyReader(byte[], java.nio.charset.Charset, java.lang.String):java.io.Reader");
    }
}
