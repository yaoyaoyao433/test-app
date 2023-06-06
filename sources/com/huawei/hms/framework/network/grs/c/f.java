package com.huawei.hms.framework.network.grs.c;

import android.text.TextUtils;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.Logger;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class f {
    private static final String a = "f";
    private Map<String, List<String>> b;
    private byte[] c;
    private int d;
    private long e;
    private long f;
    private long g;
    private String h;
    private int i;
    private int j;
    private String k;
    private String l;
    private String m;
    private long n;
    private Exception o;
    private String p;
    private int q;

    public f(int i, Map<String, List<String>> map, byte[] bArr, long j) {
        this.d = 0;
        this.i = 2;
        this.j = ConnectionResult.RESOLUTION_REQUIRED;
        this.k = "";
        this.l = "";
        this.m = "";
        this.n = 0L;
        this.d = i;
        this.b = map;
        this.c = ByteBuffer.wrap(bArr).array();
        this.e = j;
        q();
    }

    public f(Exception exc, long j) {
        this.d = 0;
        this.i = 2;
        this.j = ConnectionResult.RESOLUTION_REQUIRED;
        this.k = "";
        this.l = "";
        this.m = "";
        this.n = 0L;
        this.o = exc;
        this.e = j;
    }

    private void a(Map<String, String> map) {
        long time;
        if (map == null || map.size() <= 0) {
            Logger.w(a, "getExpireTime {headers == null} or {headers.size() <= 0}");
            return;
        }
        if (map.containsKey("Cache-Control")) {
            String str = map.get("Cache-Control");
            if (!TextUtils.isEmpty(str) && str.contains("max-age=")) {
                try {
                    time = Long.parseLong(str.substring(str.indexOf("max-age=") + 8));
                } catch (NumberFormatException e) {
                    e = e;
                    time = 0;
                }
                try {
                    Logger.v(a, "Cache-Control value{%s}", Long.valueOf(time));
                } catch (NumberFormatException e2) {
                    e = e2;
                    Logger.w(a, "getExpireTime addHeadersToResult NumberFormatException", e);
                    if (time > 0) {
                    }
                    time = TbsDownloadConfig.DEFAULT_RETRY_INTERVAL_SEC;
                    long j = time * 1000;
                    Logger.v(a, "convert expireTime{%s}", Long.valueOf(j));
                    b(String.valueOf(j + System.currentTimeMillis()));
                }
            }
            time = 0;
        } else {
            if (map.containsKey("Expires")) {
                String str2 = map.get("Expires");
                Logger.v(a, "expires is{%s}", str2);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.ROOT);
                String str3 = map.containsKey("Date") ? map.get("Date") : null;
                try {
                    time = (simpleDateFormat.parse(str2).getTime() - (TextUtils.isEmpty(str3) ? new Date() : simpleDateFormat.parse(str3)).getTime()) / 1000;
                } catch (ParseException e3) {
                    Logger.w(a, "getExpireTime ParseException.", e3);
                }
            } else {
                Logger.i(a, "response headers neither contains Cache-Control nor Expires.");
            }
            time = 0;
        }
        if (time > 0 || time > 2592000) {
            time = TbsDownloadConfig.DEFAULT_RETRY_INTERVAL_SEC;
        }
        long j2 = time * 1000;
        Logger.v(a, "convert expireTime{%s}", Long.valueOf(j2));
        b(String.valueOf(j2 + System.currentTimeMillis()));
    }

    private void b(int i) {
        this.j = i;
    }

    private void b(String str) {
        this.m = str;
    }

    private void b(Map<String, String> map) {
        long j;
        if (map == null || map.size() <= 0) {
            Logger.w(a, "getExpireTime {headers == null} or {headers.size() <= 0}");
            return;
        }
        if (map.containsKey("Retry-After")) {
            String str = map.get("Retry-After");
            if (!TextUtils.isEmpty(str)) {
                try {
                    j = Long.parseLong(str);
                } catch (NumberFormatException e) {
                    Logger.w(a, "getRetryAfter addHeadersToResult NumberFormatException", e);
                }
                long j2 = j * 1000;
                Logger.v(a, "convert retry-afterTime{%s}", Long.valueOf(j2));
                c(j2);
            }
        }
        j = 0;
        long j22 = j * 1000;
        Logger.v(a, "convert retry-afterTime{%s}", Long.valueOf(j22));
        c(j22);
    }

    private void c(int i) {
        this.i = i;
    }

    private void c(long j) {
        this.n = j;
    }

    private void c(String str) {
        this.k = str;
    }

    private void d(String str) {
        this.l = str;
    }

    private void e(String str) {
        this.h = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void n() {
        /*
            r6 = this;
            boolean r0 = r6.m()
            r1 = 2
            if (r0 != 0) goto L12
            java.lang.String r0 = com.huawei.hms.framework.network.grs.c.f.a
            java.lang.String r2 = "GRSSDK parse server body all failed."
            com.huawei.hms.framework.common.Logger.i(r0, r2)
            r6.c(r1)
            return
        L12:
            byte[] r0 = r6.c     // Catch: org.json.JSONException -> Lab
            java.lang.String r0 = com.huawei.hms.framework.common.StringUtils.byte2Str(r0)     // Catch: org.json.JSONException -> Lab
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lab
            r2.<init>(r0)     // Catch: org.json.JSONException -> Lab
            r3 = -1
            java.lang.String r4 = "isSuccess"
            boolean r4 = r2.has(r4)     // Catch: org.json.JSONException -> Lab
            if (r4 == 0) goto L2b
            java.lang.String r3 = "isSuccess"
            goto L37
        L2b:
            java.lang.String r4 = "resultCode"
            boolean r4 = r2.has(r4)     // Catch: org.json.JSONException -> Lab
            if (r4 == 0) goto L3c
            java.lang.String r3 = "resultCode"
        L37:
            int r3 = r2.getInt(r3)     // Catch: org.json.JSONException -> Lab
            goto L44
        L3c:
            java.lang.String r4 = com.huawei.hms.framework.network.grs.c.f.a     // Catch: org.json.JSONException -> Lab
            java.lang.String r5 = "sth. wrong because server errorcode's key."
            com.huawei.hms.framework.common.Logger.e(r4, r5)     // Catch: org.json.JSONException -> Lab
        L44:
            r6.c(r3)     // Catch: org.json.JSONException -> Lab
            r4 = 1
            if (r3 != 0) goto L55
            java.lang.String r5 = "services"
            boolean r0 = r0.contains(r5)     // Catch: org.json.JSONException -> Lab
            if (r0 == 0) goto L55
            r0 = 1
            goto L56
        L55:
            r0 = 0
        L56:
            if (r3 == r4) goto L86
            if (r0 != 0) goto L86
            r6.c(r1)     // Catch: org.json.JSONException -> Lab
            java.lang.String r0 = "errorCode"
            boolean r0 = r2.has(r0)     // Catch: org.json.JSONException -> Lab
            if (r0 == 0) goto L6c
            java.lang.String r0 = "errorCode"
            int r0 = r2.getInt(r0)     // Catch: org.json.JSONException -> Lab
            goto L6e
        L6c:
            r0 = 9001(0x2329, float:1.2613E-41)
        L6e:
            r6.b(r0)     // Catch: org.json.JSONException -> Lab
            java.lang.String r0 = "errorDesc"
            boolean r0 = r2.has(r0)     // Catch: org.json.JSONException -> Lab
            if (r0 == 0) goto L80
            java.lang.String r0 = "errorDesc"
            java.lang.String r0 = r2.getString(r0)     // Catch: org.json.JSONException -> Lab
            goto L82
        L80:
            java.lang.String r0 = ""
        L82:
            r6.c(r0)     // Catch: org.json.JSONException -> Lab
            return
        L86:
            java.lang.String r3 = "services"
            org.json.JSONObject r3 = r2.getJSONObject(r3)     // Catch: org.json.JSONException -> Lab
            java.lang.String r3 = r3.toString()     // Catch: org.json.JSONException -> Lab
            r6.e(r3)     // Catch: org.json.JSONException -> Lab
            if (r0 == 0) goto Lb6
            java.lang.String r0 = "errorList"
            boolean r0 = r2.has(r0)     // Catch: org.json.JSONException -> Lab
            if (r0 == 0) goto La5
            java.lang.String r0 = "errorList"
            java.lang.String r0 = r2.getString(r0)     // Catch: org.json.JSONException -> Lab
            goto La7
        La5:
            java.lang.String r0 = ""
        La7:
            r6.d(r0)     // Catch: org.json.JSONException -> Lab
            return
        Lab:
            r0 = move-exception
            java.lang.String r2 = com.huawei.hms.framework.network.grs.c.f.a
            java.lang.String r3 = "GrsResponse GrsResponse(String result) JSONException"
            com.huawei.hms.framework.common.Logger.w(r2, r3, r0)
            r6.c(r1)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.c.f.n():void");
    }

    private void o() {
        if (m() || l()) {
            Map<String, String> p = p();
            try {
                if (m()) {
                    a(p);
                }
                if (l()) {
                    b(p);
                }
            } catch (JSONException e) {
                Logger.w(a, "parseHeader catch JSONException", e);
            }
        }
    }

    private Map<String, String> p() {
        HashMap hashMap = new HashMap(16);
        Map<String, List<String>> map = this.b;
        if (map == null || map.size() <= 0) {
            Logger.v(a, "parseRespHeaders {respHeaders == null} or {respHeaders.size() <= 0}");
            return hashMap;
        }
        for (Map.Entry<String, List<String>> entry : this.b.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().get(0));
        }
        return hashMap;
    }

    private void q() {
        o();
        n();
    }

    public String a() {
        return this.m;
    }

    public void a(int i) {
        this.q = i;
    }

    public void a(long j) {
        this.g = j;
    }

    public void a(String str) {
        this.p = str;
    }

    public int b() {
        return this.d;
    }

    public void b(long j) {
        this.f = j;
    }

    public int c() {
        return this.j;
    }

    public Exception d() {
        return this.o;
    }

    public int e() {
        return this.i;
    }

    public long f() {
        return this.g;
    }

    public long g() {
        return this.f;
    }

    public long h() {
        return this.e;
    }

    public String i() {
        return this.h;
    }

    public long j() {
        return this.n;
    }

    public String k() {
        return this.p;
    }

    public boolean l() {
        return this.d == 503;
    }

    public boolean m() {
        return this.d == 200;
    }
}
