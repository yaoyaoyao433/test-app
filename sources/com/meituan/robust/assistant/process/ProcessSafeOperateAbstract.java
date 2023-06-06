package com.meituan.robust.assistant.process;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class ProcessSafeOperateAbstract<T> {
    protected abstract T failure();

    protected abstract String getLockPath();

    protected abstract T lockFailure();

    protected abstract T operate();

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public T perform() throws java.io.IOException {
        /*
            r5 = this;
            java.lang.String r0 = r5.getLockPath()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r2 = "rw"
            r0.<init>(r1, r2)
            r1 = 0
            java.nio.channels.FileChannel r2 = r0.getChannel()     // Catch: java.lang.Throwable -> L5e
            java.nio.channels.FileLock r3 = r2.lock()     // Catch: java.lang.Throwable -> L57
            java.lang.Object r4 = r5.operate()     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L28
            r3.release()     // Catch: java.io.IOException -> L24
            goto L28
        L24:
            r1 = move-exception
            com.meituan.robust.assistant.ThrowableReporter.report(r1)
        L28:
            if (r2 == 0) goto L2d
            com.squareup.okhttp.internal.j.a(r2)
        L2d:
            com.squareup.okhttp.internal.j.a(r0)
            if (r1 != 0) goto L33
            return r4
        L33:
            throw r1
        L34:
            r4 = move-exception
            com.meituan.robust.assistant.ThrowableReporter.report(r4)     // Catch: java.lang.Throwable -> L52
            if (r3 == 0) goto L42
            r3.release()     // Catch: java.io.IOException -> L3e
            goto L42
        L3e:
            r1 = move-exception
            com.meituan.robust.assistant.ThrowableReporter.report(r1)
        L42:
            if (r2 == 0) goto L47
            com.squareup.okhttp.internal.j.a(r2)
        L47:
            com.squareup.okhttp.internal.j.a(r0)
            if (r1 != 0) goto L51
            java.lang.Object r0 = r5.failure()
            return r0
        L51:
            throw r1
        L52:
            r4 = move-exception
            goto L61
        L54:
            r4 = move-exception
            r3 = r1
            goto L7f
        L57:
            r4 = move-exception
            r3 = r1
            goto L61
        L5a:
            r4 = move-exception
            r2 = r1
            r3 = r2
            goto L7f
        L5e:
            r4 = move-exception
            r2 = r1
            r3 = r2
        L61:
            com.meituan.robust.assistant.ThrowableReporter.report(r4)     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r4 = r5.lockFailure()     // Catch: java.lang.Throwable -> L7e
            if (r3 == 0) goto L72
            r3.release()     // Catch: java.io.IOException -> L6e
            goto L72
        L6e:
            r1 = move-exception
            com.meituan.robust.assistant.ThrowableReporter.report(r1)
        L72:
            if (r2 == 0) goto L77
            com.squareup.okhttp.internal.j.a(r2)
        L77:
            com.squareup.okhttp.internal.j.a(r0)
            if (r1 != 0) goto L7d
            return r4
        L7d:
            throw r1
        L7e:
            r4 = move-exception
        L7f:
            if (r3 == 0) goto L89
            r3.release()     // Catch: java.io.IOException -> L85
            goto L89
        L85:
            r1 = move-exception
            com.meituan.robust.assistant.ThrowableReporter.report(r1)
        L89:
            if (r2 == 0) goto L8e
            com.squareup.okhttp.internal.j.a(r2)
        L8e:
            com.squareup.okhttp.internal.j.a(r0)
            if (r1 == 0) goto L94
            throw r1
        L94:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.robust.assistant.process.ProcessSafeOperateAbstract.perform():java.lang.Object");
    }
}
