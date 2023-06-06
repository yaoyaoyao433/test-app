package com.sankuai.meituan.mtliveqos.utils.cpu;

import android.util.Pair;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements a {
    public static ChangeQuickRedirect a;
    private long b;
    private long c;
    private float d;
    private long e;
    private long f;
    private long g;
    private float h;
    private long i;

    @Override // com.sankuai.meituan.mtliveqos.utils.cpu.a
    public final float a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a3b3e8ab8a7c3c2efc95442719dacae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a3b3e8ab8a7c3c2efc95442719dacae")).floatValue();
        }
        if (System.currentTimeMillis() - this.e < ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE) {
            return this.d;
        }
        Pair<Long, Long> d = d();
        if (d != null) {
            long longValue = ((Long) d.first).longValue();
            long longValue2 = ((Long) d.second).longValue();
            if (this.c > 0 && longValue2 > 0 && this.c != longValue2) {
                this.d = (((float) ((longValue2 - this.c) - (longValue - this.b))) * 100.0f) / ((float) (longValue2 - this.c));
            }
            this.c = longValue2;
            this.b = longValue;
            this.e = System.currentTimeMillis();
        }
        if (this.d < 0.0f) {
            this.d = 0.0f;
        }
        return this.d;
    }

    @Override // com.sankuai.meituan.mtliveqos.utils.cpu.a
    public final float b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "912b0fc867164dd1dc4ce6819af1b9d4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "912b0fc867164dd1dc4ce6819af1b9d4")).floatValue();
        }
        if (System.currentTimeMillis() - this.i < ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE) {
            return this.h;
        }
        long c = c();
        Pair<Long, Long> d = d();
        if (d == null) {
            return this.h;
        }
        long longValue = ((Long) d.second).longValue();
        long j = longValue - this.f;
        if (this.f == 0) {
            this.h = 0.0f;
        } else if (j > 0) {
            this.h = (((float) (c - this.g)) * 100.0f) / ((float) j);
        }
        this.f = longValue;
        this.g = c;
        this.i = System.currentTimeMillis();
        if (this.h < 0.0f) {
            this.h = 0.0f;
        }
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long c() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.meituan.mtliveqos.utils.cpu.b.a
            java.lang.String r10 = "e935b056a013a991eec84d489d6d2d39"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r9, r0, r10)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L1f:
            r0 = 0
            r1 = -1
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8c
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8c
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8c
            java.lang.String r6 = "/proc/self/stat"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8c
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8c
            r5 = 1000(0x3e8, float:1.401E-42)
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8c
            java.lang.String r0 = r3.readLine()     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La8
            java.lang.String r4 = " "
            java.lang.String[] r0 = r0.split(r4)     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La8
            int r4 = r0.length     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La8
            r5 = 17
            if (r4 >= r5) goto L52
            r3.close()     // Catch: java.io.IOException -> L48
            goto L51
        L48:
            r0 = move-exception
            java.lang.String r3 = "MtliveQosCpuUsageProvid"
            java.lang.String r4 = "getProcessCpuTime: "
            android.util.Log.e(r3, r4, r0)
        L51:
            return r1
        L52:
            r4 = 13
            r4 = r0[r4]     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La8
            long r4 = java.lang.Long.parseLong(r4)     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La8
            r6 = 14
            r6 = r0[r6]     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La8
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La8
            r8 = 0
            long r4 = r4 + r6
            r6 = 15
            r6 = r0[r6]     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La8
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La8
            r8 = 0
            long r4 = r4 + r6
            r6 = 16
            r0 = r0[r6]     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La8
            long r6 = java.lang.Long.parseLong(r0)     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La8
            r0 = 0
            long r4 = r4 + r6
            r3.close()     // Catch: java.io.IOException -> L7c
            goto L85
        L7c:
            r0 = move-exception
            java.lang.String r1 = "MtliveQosCpuUsageProvid"
            java.lang.String r2 = "getProcessCpuTime: "
            android.util.Log.e(r1, r2, r0)
        L85:
            return r4
        L86:
            r0 = move-exception
            goto L90
        L88:
            r1 = move-exception
            r3 = r0
            r0 = r1
            goto La9
        L8c:
            r3 = move-exception
            r11 = r3
            r3 = r0
            r0 = r11
        L90:
            java.lang.String r4 = "MtliveQosCpuUsageProvid"
            java.lang.String r5 = "getProcessCpuTime: "
            android.util.Log.e(r4, r5, r0)     // Catch: java.lang.Throwable -> La8
            if (r3 == 0) goto La7
            r3.close()     // Catch: java.io.IOException -> L9e
            goto La7
        L9e:
            r0 = move-exception
            java.lang.String r3 = "MtliveQosCpuUsageProvid"
            java.lang.String r4 = "getProcessCpuTime: "
            android.util.Log.e(r3, r4, r0)
        La7:
            return r1
        La8:
            r0 = move-exception
        La9:
            if (r3 == 0) goto Lb8
            r3.close()     // Catch: java.io.IOException -> Laf
            goto Lb8
        Laf:
            r1 = move-exception
            java.lang.String r2 = "MtliveQosCpuUsageProvid"
            java.lang.String r3 = "getProcessCpuTime: "
            android.util.Log.e(r2, r3, r1)
        Lb8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.mtliveqos.utils.cpu.b.c():long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.BufferedReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.util.Pair<java.lang.Long, java.lang.Long> d() {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.mtliveqos.utils.cpu.b.d():android.util.Pair");
    }
}
