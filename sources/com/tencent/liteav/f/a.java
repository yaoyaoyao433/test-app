package com.tencent.liteav.f;

import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.bundle.AiDownloadEnv;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.c.a;
import com.tencent.liteav.i.a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a extends c {
    private static a d;
    private List<a.b> e;
    private CopyOnWriteArrayList<com.tencent.liteav.d.a> f = new CopyOnWriteArrayList<>();

    public static a a() {
        if (d == null) {
            d = new a();
        }
        return d;
    }

    private a() {
    }

    public void a(List<a.b> list) {
        this.e = list;
        this.f.clear();
        if (this.c != null) {
            a(this.c);
        }
    }

    public List<com.tencent.liteav.d.a> b() {
        return this.f;
    }

    public void a(com.tencent.liteav.d.e eVar) {
        if (eVar == null || this.a == 0 || this.b == 0 || this.e == null || this.e.size() == 0) {
            return;
        }
        com.tencent.liteav.d.g b = b(eVar);
        for (a.b bVar : this.e) {
            if (bVar != null) {
                a.b a = a(bVar, a(bVar.b, b));
                com.tencent.liteav.c.a a2 = a(a.a);
                if (a2 != null && a2.c > 0) {
                    long j = a.c;
                    long j2 = a.d - j;
                    int i = a2.b / a2.c;
                    int i2 = (int) (j2 / a2.b);
                    if (j2 % a2.b > 0) {
                        i2++;
                    }
                    long j3 = j;
                    int i3 = 0;
                    while (i3 < i2) {
                        int i4 = 0;
                        while (i4 < a2.c) {
                            long j4 = i + j3;
                            if (j4 <= a.d) {
                                com.tencent.liteav.d.a aVar = new com.tencent.liteav.d.a();
                                aVar.a = a.a + a2.g.get(i4).a + ".png";
                                aVar.b = a.b;
                                aVar.c = j3;
                                aVar.d = j4;
                                aVar.e = a.e;
                                this.f.add(aVar);
                                j3 = aVar.d;
                                i4++;
                                b = b;
                            }
                        }
                        i3++;
                        b = b;
                    }
                }
            }
        }
    }

    private com.tencent.liteav.c.a a(String str) {
        String b = b(str + AiDownloadEnv.AI_JS_FRAMEWORK_CONFIG_NAME);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(b);
            com.tencent.liteav.c.a aVar = new com.tencent.liteav.c.a();
            try {
                aVar.a = jSONObject.getString("name");
                aVar.c = jSONObject.getInt("count");
                aVar.b = jSONObject.getInt("period");
                aVar.d = jSONObject.getInt("width");
                aVar.e = jSONObject.getInt("height");
                aVar.f = jSONObject.getInt("keyframe");
                JSONArray jSONArray = jSONObject.getJSONArray("frameArray");
                for (int i = 0; i < aVar.c; i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    a.C1449a c1449a = new a.C1449a();
                    c1449a.a = jSONObject2.getString("picture");
                    aVar.g.add(c1449a);
                }
            } catch (JSONException e) {
                TXCLog.e("AnimatedPasterFilterChain", "failed to get value from json.", e);
            }
            return aVar;
        } catch (JSONException e2) {
            TXCLog.e("AnimatedPasterFilterChain", "parse invalid json string", e2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r6 == null) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.BufferedReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L35
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L35
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L35
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L35
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L35
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L35
        L12:
            java.lang.String r1 = r6.readLine()     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L44
            if (r1 == 0) goto L29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L44
            r2.<init>()     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L44
            r2.append(r0)     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L44
            r2.append(r1)     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L44
            java.lang.String r1 = r2.toString()     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L44
            r0 = r1
            goto L12
        L29:
            r6.close()     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L44
        L2c:
            r6.close()     // Catch: java.io.IOException -> L43
            goto L43
        L30:
            r1 = move-exception
            goto L39
        L32:
            r0 = move-exception
            r6 = r1
            goto L45
        L35:
            r6 = move-exception
            r4 = r1
            r1 = r6
            r6 = r4
        L39:
            java.lang.String r2 = "AnimatedPasterFilterChain"
            java.lang.String r3 = "read file failed."
            com.tencent.liteav.basic.log.TXCLog.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L43
            goto L2c
        L43:
            return r0
        L44:
            r0 = move-exception
        L45:
            if (r6 == 0) goto L4a
            r6.close()     // Catch: java.io.IOException -> L4a
        L4a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.f.a.b(java.lang.String):java.lang.String");
    }

    private a.b a(a.b bVar, a.h hVar) {
        a.b bVar2 = new a.b();
        bVar2.b = hVar;
        bVar2.a = bVar.a;
        bVar2.c = bVar.c;
        bVar2.d = bVar.d;
        bVar2.e = bVar.e;
        return bVar2;
    }

    @Override // com.tencent.liteav.f.c
    public void c() {
        super.c();
        this.f.clear();
        if (this.e != null) {
            this.e.clear();
        }
        this.e = null;
    }
}
