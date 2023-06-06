package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class eb extends JsonComposer {
    @Json(name = "layerid")
    public String a;
    @Json(name = "type")
    public int b;
    @Json(name = "local_data_ver")
    public int c;
    @Json(name = "local_cfg_ver")
    public int d;
    @Json(ignore = true)
    public String e;
    @Json(name = "data_ver")
    private String f;
    @Json(name = "cfg_ver")
    private String g;
    @Json(name = "params")
    private String[] h;
    @Json(name = "url")
    private String i;

    private String b() {
        return this.a;
    }

    private String c() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        return sb.toString();
    }

    private String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        return sb.toString();
    }

    private void a(int i) {
        if (i != this.c) {
            this.e = null;
        }
        this.c = i;
    }

    private void b(int i) {
        if (i != this.d) {
            this.e = null;
        }
        this.d = i;
    }

    private boolean e() {
        String str = this.f;
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        if (str.equals(sb.toString())) {
            String str2 = this.g;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.d);
            return !str2.equals(sb2.toString());
        }
        return true;
    }

    private dx f() {
        return dx.a(this.b);
    }

    public final String toString() {
        return "DataLayer{layerId='" + this.a + "', layerType='" + this.b + "', remoteDataVersion='" + this.f + "', dataVersion=" + this.c + ", remoteStyleVersion='" + this.g + "', styleVersion=" + this.d + ", params=" + Arrays.toString(this.h) + ", dataUrl='" + this.i + "', decodeDataUrl='" + this.e + "'}";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a() {
        /*
            r8 = this;
            java.lang.String r0 = r8.f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r8.c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L30
            java.lang.String r0 = r8.g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r8.d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2e
            goto L30
        L2e:
            r0 = 0
            goto L31
        L30:
            r0 = 1
        L31:
            if (r0 == 0) goto L56
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r8.d
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r8.g = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r8.c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r8.f = r0
            r0 = 0
            r8.e = r0
        L56:
            java.lang.String[] r0 = r8.h
            if (r0 == 0) goto L9e
            java.lang.String r0 = r8.e
            if (r0 != 0) goto L9e
            java.lang.String r0 = r8.i
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L9e
            java.lang.String r0 = r8.i
            r8.e = r0
            java.lang.String[] r0 = r8.h
            int r2 = r0.length
        L6d:
            if (r1 >= r2) goto L9e
            r3 = r0[r1]
            java.lang.Object r4 = r8.getFieldValueByJsonName(r3)     // Catch: java.lang.IllegalAccessException -> L97
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.IllegalAccessException -> L97
            if (r5 == 0) goto L9b
            java.lang.String r5 = r8.e     // Catch: java.lang.IllegalAccessException -> L97
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.IllegalAccessException -> L97
            java.lang.String r7 = "\\{"
            r6.<init>(r7)     // Catch: java.lang.IllegalAccessException -> L97
            r6.append(r3)     // Catch: java.lang.IllegalAccessException -> L97
            java.lang.String r3 = "\\}"
            r6.append(r3)     // Catch: java.lang.IllegalAccessException -> L97
            java.lang.String r3 = r6.toString()     // Catch: java.lang.IllegalAccessException -> L97
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.IllegalAccessException -> L97
            java.lang.String r3 = r5.replaceAll(r3, r4)     // Catch: java.lang.IllegalAccessException -> L97
            r8.e = r3     // Catch: java.lang.IllegalAccessException -> L97
            goto L9b
        L97:
            r3 = move-exception
            r3.printStackTrace()
        L9b:
            int r1 = r1 + 1
            goto L6d
        L9e:
            java.lang.String r0 = r8.e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.eb.a():java.lang.String");
    }
}
