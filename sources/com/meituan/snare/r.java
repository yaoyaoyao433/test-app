package com.meituan.snare;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.snare.h;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class r {
    public static ChangeQuickRedirect a;
    private static final r c = new r();
    h.a b;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static /* synthetic */ void a(com.meituan.snare.r r14) {
        /*
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.snare.r.a
            java.lang.String r10 = "464310248541c8fc7263db01cf830e08"
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
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L73
            com.meituan.snare.f r9 = com.meituan.snare.f.a()     // Catch: java.lang.Throwable -> L73
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L73
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.snare.f.a     // Catch: java.lang.Throwable -> L73
            java.lang.String r12 = "2c4f22a30ad5c5d1ebbbb3d09854b031"
            r5 = 0
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = r10
            r3 = r9
            r4 = r11
            r6 = r12
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto L39
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r9, r11, r0, r12)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L73
            goto L41
        L39:
            java.lang.String r0 = r9.e     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = ".thread"
            java.lang.String r0 = r9.b(r0, r2)     // Catch: java.lang.Throwable -> L73
        L41:
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L73
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L73
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L73
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L73
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L73
            int r14 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L6a
            r1 = 300(0x12c, float:4.2E-43)
            r2 = 600(0x258, float:8.41E-43)
            r3 = 1
            java.lang.String r14 = com.meituan.snare.t.a(r14, r1, r2, r3)     // Catch: java.lang.Throwable -> L6a
            r0.write(r14)     // Catch: java.lang.Throwable -> L6a
            r0.flush()     // Catch: java.lang.Throwable -> L6a
            r0.close()     // Catch: java.lang.Throwable -> L64
        L64:
            return
        L65:
            r14 = move-exception
            r13 = r0
            r0 = r14
            r14 = r13
            goto L6d
        L6a:
            r14 = r0
            goto L73
        L6c:
            r0 = move-exception
        L6d:
            if (r14 == 0) goto L72
            r14.close()     // Catch: java.lang.Throwable -> L72
        L72:
            throw r0
        L73:
            if (r14 == 0) goto L79
            r14.close()     // Catch: java.lang.Throwable -> L78
        L78:
            return
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.snare.r.a(com.meituan.snare.r):void");
    }

    public static r a() {
        return c;
    }
}
