package com.meituan.snare;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.snare.h;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final e c = new e();
    h.a b;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static /* synthetic */ void a(com.meituan.snare.e r14) {
        /*
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.snare.e.a
            java.lang.String r10 = "7fcfdaac3fc228f9583859fbb99ba00c"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r14
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L18
            com.meituan.robust.PatchProxy.accessDispatch(r8, r14, r9, r0, r10)
            return
        L18:
            r14 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L6e
            com.meituan.snare.f r9 = com.meituan.snare.f.a()     // Catch: java.lang.Throwable -> L6e
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L6e
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.snare.f.a     // Catch: java.lang.Throwable -> L6e
            java.lang.String r12 = "7ab4e9bcddc827f099743e1157c30c2f"
            r5 = 0
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = r10
            r3 = r9
            r4 = r11
            r6 = r12
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L39
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r9, r11, r0, r12)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L6e
            goto L41
        L39:
            java.lang.String r0 = r9.e     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = ".fd"
            java.lang.String r0 = r9.b(r0, r2)     // Catch: java.lang.Throwable -> L6e
        L41:
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L6e
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L6e
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L6e
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L6e
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L6e
            int r14 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L65
            java.lang.String r14 = com.meituan.snare.t.b(r14)     // Catch: java.lang.Throwable -> L65
            r0.write(r14)     // Catch: java.lang.Throwable -> L65
            r0.flush()     // Catch: java.lang.Throwable -> L65
            r0.close()     // Catch: java.lang.Throwable -> L5f
        L5f:
            return
        L60:
            r14 = move-exception
            r13 = r0
            r0 = r14
            r14 = r13
            goto L68
        L65:
            r14 = r0
            goto L6e
        L67:
            r0 = move-exception
        L68:
            if (r14 == 0) goto L6d
            r14.close()     // Catch: java.lang.Throwable -> L6d
        L6d:
            throw r0
        L6e:
            if (r14 == 0) goto L74
            r14.close()     // Catch: java.lang.Throwable -> L73
        L73:
            return
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.snare.e.a(com.meituan.snare.e):void");
    }

    public static e a() {
        return c;
    }

    public final void a(s[] sVarArr) {
        int i = 1;
        Object[] objArr = {sVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "704d498179082ce24f737ec7f32c8efe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "704d498179082ce24f737ec7f32c8efe");
            return;
        }
        f a2 = f.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        File[] f = PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "7ffca58aab336f29b8501ec1ada93f45", RobustBitConfig.DEFAULT_VALUE) ? (File[]) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "7ffca58aab336f29b8501ec1ada93f45") : a2.f(".fd");
        if (f == null || f.length <= 0) {
            return;
        }
        int length = sVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            s sVar = sVarArr[i2];
            int i3 = 0;
            while (true) {
                if (i3 >= f.length) {
                    break;
                }
                File file = f[i3];
                if (file == null || !f.a().a(sVar.c, file.getAbsolutePath())) {
                    i3++;
                    i = 1;
                } else {
                    Object[] objArr3 = new Object[i];
                    objArr3[0] = file;
                    ChangeQuickRedirect changeQuickRedirect3 = s.a;
                    if (PatchProxy.isSupport(objArr3, sVar, changeQuickRedirect3, false, "428bbadce95947bb60752ed7f55dc7c0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, sVar, changeQuickRedirect3, false, "428bbadce95947bb60752ed7f55dc7c0");
                    } else {
                        sVar.f.put("FD Watchdog Info", file);
                    }
                    f[i3] = null;
                }
            }
            i2++;
            i = 1;
        }
        for (File file2 : f) {
            if (file2 != null) {
                f.a().e(file2.getAbsolutePath());
            }
        }
    }
}
