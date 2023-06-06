package com.meituan.android.paybase.wasmtest;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Wasm3Simple {
    public static ChangeQuickRedirect a;

    public native int runWasm3Simple(byte[] bArr);

    static {
        System.loadLibrary("wasm3simple");
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "284423e90f61932a1397de3a5bedf8cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "284423e90f61932a1397de3a5bedf8cd");
        } else if (context != null) {
            c.a("wasm3Simple", a.a(context)).start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v8, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void b(android.content.Context r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.paybase.wasmtest.Wasm3Simple.a
            java.lang.String r10 = "30eaaa17df4375df050ba6101b52f8e5"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r0, r10)
            return
        L1b:
            r0 = 0
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            long r3 = r3.getTime()
            android.content.res.Resources r11 = r11.getResources()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            r5 = 2131230725(0x7f080005, float:1.807751E38)
            java.io.InputStream r11 = r11.openRawResource(r5)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            int r5 = r11.available()     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L9b
            byte[] r5 = new byte[r5]     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L9b
            r11.read(r5)     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L9b
            com.meituan.android.paybase.wasmtest.Wasm3Simple r6 = new com.meituan.android.paybase.wasmtest.Wasm3Simple     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L9b
            r6.<init>()     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L9b
            int r5 = r6.runWasm3Simple(r5)     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L9b
            java.util.Date r6 = new java.util.Date     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L9b
            r6.<init>()     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L9b
            long r6 = r6.getTime()     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L9b
            r0 = 0
            long r0 = r6 - r3
            if (r11 == 0) goto L6f
            r11.close()     // Catch: java.lang.Exception -> L55
            goto L6f
        L55:
            r11 = move-exception
            java.lang.String r3 = "Wasm3Simple_inputStream_close"
            com.meituan.android.paybase.common.analyse.a.a(r11, r3, r2)
            goto L6f
        L5c:
            r3 = move-exception
            goto L63
        L5e:
            r0 = move-exception
            r11 = r2
            goto L9c
        L61:
            r3 = move-exception
            r11 = r2
        L63:
            r5 = -999(0xfffffffffffffc19, float:NaN)
            java.lang.String r4 = "Wasm3Simple_load"
            com.meituan.android.paybase.common.analyse.a.a(r3, r4, r2)     // Catch: java.lang.Throwable -> L9b
            if (r11 == 0) goto L6f
            r11.close()     // Catch: java.lang.Exception -> L55
        L6f:
            java.lang.String r11 = "b_pay_g5pb5esj_sc"
            com.meituan.android.paybase.common.analyse.a$c r2 = new com.meituan.android.paybase.common.analyse.a$c
            r2.<init>()
            java.lang.String r3 = "wasm3_run_result"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            com.meituan.android.paybase.common.analyse.a$c r2 = r2.a(r3, r4)
            java.lang.String r3 = "wasm3_run_duration"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            com.meituan.android.paybase.common.analyse.a$c r0 = r2.a(r3, r0)
            java.lang.String r1 = "is_debug"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            com.meituan.android.paybase.common.analyse.a$c r0 = r0.a(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r0.b
            com.meituan.android.paybase.utils.v.a(r11, r0)
            return
        L9b:
            r0 = move-exception
        L9c:
            if (r11 == 0) goto La8
            r11.close()     // Catch: java.lang.Exception -> La2
            goto La8
        La2:
            r11 = move-exception
            java.lang.String r1 = "Wasm3Simple_inputStream_close"
            com.meituan.android.paybase.common.analyse.a.a(r11, r1, r2)
        La8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.paybase.wasmtest.Wasm3Simple.b(android.content.Context):void");
    }
}
