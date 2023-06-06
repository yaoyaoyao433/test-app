package com.sankuai.meituan.location.collector.utils;

import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* loaded from: classes4.dex */
public class d {
    public static ChangeQuickRedirect a;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static synchronized boolean a(java.io.File r13, byte[] r14, boolean r15) {
        /*
            java.lang.Class<com.sankuai.meituan.location.collector.utils.d> r0 = com.sankuai.meituan.location.collector.utils.d.class
            monitor-enter(r0)
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L9d
            r9 = 0
            r1[r9] = r13     // Catch: java.lang.Throwable -> L9d
            r10 = 1
            r1[r10] = r14     // Catch: java.lang.Throwable -> L9d
            r2 = 2
            java.lang.Byte r3 = java.lang.Byte.valueOf(r15)     // Catch: java.lang.Throwable -> L9d
            r1[r2] = r3     // Catch: java.lang.Throwable -> L9d
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.meituan.location.collector.utils.d.a     // Catch: java.lang.Throwable -> L9d
            java.lang.String r12 = "1a64c26f03783dd851a23d99b6ea8308"
            r3 = 0
            r5 = 1
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = r1
            r4 = r11
            r6 = r12
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L9d
            r3 = 0
            if (r2 == 0) goto L31
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r1, r3, r11, r10, r12)     // Catch: java.lang.Throwable -> L9d
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> L9d
            boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> L9d
            monitor-exit(r0)
            return r13
        L31:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L62
            r1.<init>(r13, r15)     // Catch: java.lang.Throwable -> L62
            java.io.DataOutputStream r13 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L5d
            r13.<init>(r1)     // Catch: java.lang.Throwable -> L5d
            r13.write(r14)     // Catch: java.lang.Throwable -> L5a
            r13.close()     // Catch: java.lang.Throwable -> L5a
            r13.close()     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L9d
            goto L4b
        L45:
            r13 = move-exception
            java.lang.Class<com.sankuai.meituan.location.collector.utils.j> r14 = com.sankuai.meituan.location.collector.utils.j.class
            com.meituan.android.common.locate.util.LogUtils.a(r14, r13)     // Catch: java.lang.Throwable -> L9d
        L4b:
            r1.close()     // Catch: java.io.IOException -> L4f java.lang.Throwable -> L9d
            goto L55
        L4f:
            r13 = move-exception
            java.lang.Class<com.sankuai.meituan.location.collector.utils.d> r14 = com.sankuai.meituan.location.collector.utils.d.class
            com.meituan.android.common.locate.util.LogUtils.a(r14, r13)     // Catch: java.lang.Throwable -> L9d
        L55:
            monitor-exit(r0)
            return r10
        L57:
            r14 = move-exception
            r3 = r13
            goto L84
        L5a:
            r14 = move-exception
            r3 = r13
            goto L64
        L5d:
            r14 = move-exception
            goto L64
        L5f:
            r14 = move-exception
            r1 = r3
            goto L84
        L62:
            r14 = move-exception
            r1 = r3
        L64:
            java.lang.Class<com.sankuai.meituan.location.collector.utils.j> r13 = com.sankuai.meituan.location.collector.utils.j.class
            com.meituan.android.common.locate.util.LogUtils.a(r13, r14)     // Catch: java.lang.Throwable -> L83
            if (r3 == 0) goto L75
            r3.close()     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L9d
            goto L75
        L6f:
            r13 = move-exception
            java.lang.Class<com.sankuai.meituan.location.collector.utils.j> r14 = com.sankuai.meituan.location.collector.utils.j.class
            com.meituan.android.common.locate.util.LogUtils.a(r14, r13)     // Catch: java.lang.Throwable -> L9d
        L75:
            if (r1 == 0) goto L81
            r1.close()     // Catch: java.io.IOException -> L7b java.lang.Throwable -> L9d
            goto L81
        L7b:
            r13 = move-exception
            java.lang.Class<com.sankuai.meituan.location.collector.utils.d> r14 = com.sankuai.meituan.location.collector.utils.d.class
            com.meituan.android.common.locate.util.LogUtils.a(r14, r13)     // Catch: java.lang.Throwable -> L9d
        L81:
            monitor-exit(r0)
            return r9
        L83:
            r14 = move-exception
        L84:
            if (r3 == 0) goto L90
            r3.close()     // Catch: java.io.IOException -> L8a java.lang.Throwable -> L9d
            goto L90
        L8a:
            r13 = move-exception
            java.lang.Class<com.sankuai.meituan.location.collector.utils.j> r15 = com.sankuai.meituan.location.collector.utils.j.class
            com.meituan.android.common.locate.util.LogUtils.a(r15, r13)     // Catch: java.lang.Throwable -> L9d
        L90:
            if (r1 == 0) goto L9c
            r1.close()     // Catch: java.io.IOException -> L96 java.lang.Throwable -> L9d
            goto L9c
        L96:
            r13 = move-exception
            java.lang.Class<com.sankuai.meituan.location.collector.utils.d> r15 = com.sankuai.meituan.location.collector.utils.d.class
            com.meituan.android.common.locate.util.LogUtils.a(r15, r13)     // Catch: java.lang.Throwable -> L9d
        L9c:
            throw r14     // Catch: java.lang.Throwable -> L9d
        L9d:
            r13 = move-exception
            monitor-exit(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.location.collector.utils.d.a(java.io.File, byte[], boolean):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static synchronized byte[] a(java.io.File r13) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.location.collector.utils.d.a(java.io.File):byte[]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(byte[] bArr, File file) {
        Object[] objArr = {bArr, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b46a452883b3afe4b60c07c78654a43e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b46a452883b3afe4b60c07c78654a43e")).booleanValue();
        }
        if (file != null && file.exists()) {
            try {
                a(file, bArr, true);
                LogUtils.a("CollectorFileUtil writeFile " + file.getAbsolutePath() + " length " + file.length());
                return true;
            } catch (Throwable th) {
                LogUtils.a(th);
                return false;
            }
        }
        return false;
    }

    public static synchronized void a(final byte[] bArr) {
        synchronized (d.class) {
            Object[] objArr = {bArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0818719fb73bfd60df67823325158a89", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0818719fb73bfd60df67823325158a89");
                return;
            }
            LogUtils.a("CollectorFileUtil  recordToFile cache: " + bArr);
            if (bArr == null) {
                return;
            }
            Object[] objArr2 = {bArr};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ef49ae521c984fe3bd0c16aa21dcd877", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ef49ae521c984fe3bd0c16aa21dcd877");
            } else {
                com.sankuai.meituan.location.collector.io.a.a(new com.sankuai.meituan.location.collector.io.c() { // from class: com.sankuai.meituan.location.collector.utils.d.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.location.collector.io.c
                    public final boolean a(File file) {
                        Object[] objArr3 = {file};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "14261925a50ff2d45fda93ece8fba701", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "14261925a50ff2d45fda93ece8fba701")).booleanValue() : d.b(bArr, file);
                    }
                });
            }
        }
    }
}
