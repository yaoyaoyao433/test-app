package com.dianping.video.videofilter.transcoder;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a b;

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.video.videofilter.transcoder.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0135a {
        void a();

        void a(double d);

        void a(Exception exc);
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc89a01d56c21b4876640d6c6845d639", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc89a01d56c21b4876640d6c6845d639");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.io.FileDescriptor r13, com.dianping.video.model.g r14, final com.dianping.video.videofilter.transcoder.a.InterfaceC0135a r15) throws java.lang.Exception {
        /*
            r12 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r13
            r9 = 1
            r0[r9] = r14
            r1 = 2
            r0[r1] = r15
            com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.video.videofilter.transcoder.a.a
            java.lang.String r11 = "fca6c39eec93665d6c654d1da5da5b1f"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L28
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r8, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L28:
            r0 = 0
            com.dianping.video.videofilter.transcoder.engine.h r1 = new com.dianping.video.videofilter.transcoder.engine.h     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L42 java.lang.InterruptedException -> L4c java.io.IOException -> L56
            r1.<init>()     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L42 java.lang.InterruptedException -> L4c java.io.IOException -> L56
            com.dianping.video.videofilter.transcoder.a$1 r2 = new com.dianping.video.videofilter.transcoder.a$1     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L42 java.lang.InterruptedException -> L4c java.io.IOException -> L56
            r2.<init>()     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L42 java.lang.InterruptedException -> L4c java.io.IOException -> L56
            r1.c = r2     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L42 java.lang.InterruptedException -> L4c java.io.IOException -> L56
            r1.b = r13     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L42 java.lang.InterruptedException -> L4c java.io.IOException -> L56
            boolean r13 = r1.a(r14)     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L42 java.lang.InterruptedException -> L4c java.io.IOException -> L56
            goto L59
        L3c:
            r13 = move-exception
            r0 = r13
            r0.printStackTrace()
            goto L58
        L42:
            r13 = move-exception
            r0 = r13
            java.lang.String r13 = "MediaTranscoder"
            java.lang.String r14 = "Fatal error while transcoding, this might be invalid format or bug in engine or Android."
            android.util.Log.e(r13, r14, r0)
            goto L58
        L4c:
            r13 = move-exception
            r0 = r13
            java.lang.String r13 = "MediaTranscoder"
            java.lang.String r14 = "Cancel transcode video file."
            android.util.Log.i(r13, r14, r0)
            goto L58
        L56:
            r13 = move-exception
            r0 = r13
        L58:
            r13 = 0
        L59:
            if (r0 != 0) goto L5f
            r15.a()
            goto L86
        L5f:
            r15.a(r0)
            com.dianping.video.util.d r14 = com.dianping.video.util.d.a()
            java.lang.Object[] r15 = new java.lang.Object[r9]
            r15[r8] = r0
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.video.util.d.a
            java.lang.String r10 = "64fd2c7328b6f5bc8e5c93b9b48214d1"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r15
            r2 = r14
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L7f
            com.meituan.robust.PatchProxy.accessDispatch(r15, r14, r9, r8, r10)
            goto L86
        L7f:
            java.lang.String r15 = r14.a(r0)
            r14.a(r15)
        L86:
            if (r0 != 0) goto L89
            return r13
        L89:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.video.videofilter.transcoder.a.a(java.io.FileDescriptor, com.dianping.video.model.g, com.dianping.video.videofilter.transcoder.a$a):boolean");
    }
}
