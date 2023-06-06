package com.meituan.android.edfu.cvlog.monitor;

import android.content.Context;
import com.meituan.android.edfu.cvlog.netservice.bean.ConfigResult;
import com.meituan.android.edfu.edfucamera.argorithm.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    private static volatile a D;
    public static ChangeQuickRedirect a;
    private e[] A;
    private int B;
    private int C;
    public boolean b;
    public ConfigResult.Config c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public long h;
    public long i;
    public int j;
    public com.meituan.android.edfu.cvlog.netservice.e k;
    public k l;
    public String m;
    public String n;
    public String o;
    public Context p;
    private final String q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public static /* synthetic */ boolean b(a aVar, ConfigResult.Config config) {
        Object[] objArr = {config};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "ab00e0d6cae7615ff74f5bb1bb91da4d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "ab00e0d6cae7615ff74f5bb1bb91da4d")).booleanValue();
        }
        if (config == null) {
            return false;
        }
        aVar.b = config.getUpload();
        if (config.getTimeout() > 0 && config.getTimeout() <= 20) {
            aVar.e = config.getTimeout() * 1000;
        }
        if (config.getImagequality() > 0 && config.getImagequality() <= 100) {
            aVar.x = config.getImagequality();
        }
        if (config.getInterval() > 0 && config.getInterval() <= 10) {
            aVar.f = config.getInterval() * 1000;
        }
        if (config.getMaxframe() > 0 && config.getMaxframe() <= 10) {
            aVar.g = config.getMaxframe();
        }
        if (config.getImagewidth() > 0 && config.getImagewidth() <= 5000) {
            aVar.y = config.getImagewidth();
        }
        return true;
    }

    public static a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20adf16b8035ab4e739fbedfa196b469", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20adf16b8035ab4e739fbedfa196b469");
        }
        if (D == null) {
            synchronized (a.class) {
                if (D == null) {
                    D = new a(context);
                }
            }
        }
        return D;
    }

    private a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e45e665115051143077294151c8cc022", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e45e665115051143077294151c8cc022");
            return;
        }
        this.q = a.class.getSimpleName();
        this.r = 5;
        this.s = 2;
        this.t = 5;
        this.u = 300;
        this.v = 400;
        this.w = 85;
        this.b = false;
        this.d = false;
        this.e = this.r * 1000;
        this.f = this.s * 1000;
        this.x = this.w;
        this.y = this.u;
        this.z = this.v;
        this.g = this.t;
        this.B = 0;
        this.C = 3;
        this.m = "";
        this.n = "";
        this.o = "";
        this.p = context;
        this.A = new e[this.C];
        for (int i = 0; i < this.C; i++) {
            this.A[i] = new e();
        }
        this.B = 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public byte[] a(byte[] r19, int r20, int r21, int r22) {
        /*
            r18 = this;
            r8 = r18
            r0 = r19
            r9 = r21
            r10 = r22
            r1 = 4
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r12 = 0
            r11[r12] = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r13 = 1
            r11[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            r14 = 2
            r11[r14] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r15 = 3
            r11[r15] = r1
            com.meituan.robust.ChangeQuickRedirect r6 = com.meituan.android.edfu.cvlog.monitor.a.a
            java.lang.String r7 = "a472be34857a9ebfbc5a2ebf93a59348"
            r4 = 0
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r11
            r2 = r18
            r3 = r6
            r5 = r7
            r13 = r6
            r14 = r7
            r6 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L40
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r8, r13, r12, r14)
            byte[] r0 = (byte[]) r0
            return r0
        L40:
            r7 = 0
            if (r0 == 0) goto L9c
            int r1 = r0.length
            int r2 = r9 * r10
            int r2 = r2 * 3
            r3 = 2
            int r2 = r2 / r3
            if (r1 == r2) goto L4d
            goto L9c
        L4d:
            android.graphics.YuvImage r11 = new android.graphics.YuvImage     // Catch: java.lang.Throwable -> L97
            r6 = 0
            r1 = r11
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L97
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L97
            r1.<init>()     // Catch: java.lang.Throwable -> L97
            int r0 = r8.y     // Catch: java.lang.Throwable -> L98
            int r2 = r8.z     // Catch: java.lang.Throwable -> L98
            int r0 = r8.a(r9, r10, r0, r2)     // Catch: java.lang.Throwable -> L98
            r2 = 1
            if (r0 != r2) goto L7c
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L98
            r0.<init>(r12, r12, r9, r10)     // Catch: java.lang.Throwable -> L98
            int r2 = r8.x     // Catch: java.lang.Throwable -> L98
            r11.compressToJpeg(r0, r2, r1)     // Catch: java.lang.Throwable -> L98
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L98
        L7a:
            r7 = r0
            goto L98
        L7c:
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L98
            r0.<init>(r12, r12, r9, r10)     // Catch: java.lang.Throwable -> L98
            r2 = 100
            r11.compressToJpeg(r0, r2, r1)     // Catch: java.lang.Throwable -> L98
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L98
            byte[] r0 = r8.a(r0, r9, r10)     // Catch: java.lang.Throwable -> L98
            goto L7a
        L8f:
            r0 = move-exception
            goto L93
        L91:
            r0 = move-exception
            r1 = r7
        L93:
            com.sankuai.common.utils.IOUtils.close(r1)
            throw r0
        L97:
            r1 = r7
        L98:
            com.sankuai.common.utils.IOUtils.close(r1)
            return r7
        L9c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.edfu.cvlog.monitor.a.a(byte[], int, int, int):byte[]");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:6|(6:18|19|9|10|(1:14)|15)|8|9|10|(2:12|14)|15) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] a(byte[] r12, int r13, int r14) {
        /*
            r11 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r2 = 1
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r2 = 2
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.edfu.cvlog.monitor.a.a
            java.lang.String r10 = "8da56cff0c2ecebdfd20fb8cbfe0c989"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L2c
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            byte[] r12 = (byte[]) r12
            return r12
        L2c:
            int r0 = r12.length
            r1 = 0
            if (r0 == 0) goto L45
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Exception -> L45
            r0.<init>()     // Catch: java.lang.Exception -> L45
            int r2 = r11.y     // Catch: java.lang.Exception -> L45
            int r3 = r11.z     // Catch: java.lang.Exception -> L45
            int r13 = r11.a(r13, r14, r2, r3)     // Catch: java.lang.Exception -> L45
            r0.inSampleSize = r13     // Catch: java.lang.Exception -> L45
            int r13 = r12.length     // Catch: java.lang.Exception -> L45
            android.graphics.Bitmap r12 = com.sankuai.waimai.launcher.util.image.a.a(r12, r8, r13, r0)     // Catch: java.lang.Exception -> L45
            goto L46
        L45:
            r12 = r1
        L46:
            java.io.ByteArrayOutputStream r13 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L57
            r13.<init>()     // Catch: java.lang.Exception -> L57
            android.graphics.Bitmap$CompressFormat r14 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L57
            int r0 = r11.x     // Catch: java.lang.Exception -> L57
            r12.compress(r14, r0, r13)     // Catch: java.lang.Exception -> L57
            byte[] r13 = r13.toByteArray()     // Catch: java.lang.Exception -> L57
            goto L58
        L57:
            r13 = r1
        L58:
            if (r12 == 0) goto L63
            boolean r14 = r12.isRecycled()
            if (r14 != 0) goto L63
            r12.recycle()
        L63:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.edfu.cvlog.monitor.a.a(byte[], int, int):byte[]");
    }

    private int a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d68d16cb55e033f39e2ca137399b3144", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d68d16cb55e033f39e2ca137399b3144")).intValue();
        }
        if (i > i3) {
            return 1 + (i / i3);
        }
        return 1;
    }

    public e a(byte[] bArr, int i, int i2, int i3, int i4, int i5, boolean z) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcc8007536d6bf4b6489d7dcd5ff6c34", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcc8007536d6bf4b6489d7dcd5ff6c34");
        }
        e a2 = a();
        return a2 != null ? a(a2, bArr, i, i2, i3, i4, i5, z) : a2;
    }

    private e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d290addeed781483ee3893ab84aa641", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d290addeed781483ee3893ab84aa641");
        }
        e eVar = null;
        int length = (this.B + 1) % this.A.length;
        synchronized (this.A) {
            if (this.A[length].k) {
                eVar = this.A[length];
                eVar.l = System.currentTimeMillis();
                this.B = length;
            }
        }
        return eVar;
    }

    private e a(e eVar, byte[] bArr, int i, int i2, int i3, int i4, int i5, boolean z) {
        Object[] objArr = {eVar, bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc99c6282f971ac18549e724bbb0ecdd", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc99c6282f971ac18549e724bbb0ecdd");
        }
        if (eVar.b > 0 && eVar.c > 0 && (eVar.b != i || eVar.c != i2)) {
            eVar.a();
        }
        if (bArr == null) {
            return null;
        }
        eVar.e = i5;
        try {
            if (eVar.f == null) {
                eVar.f = new byte[bArr.length];
            }
            System.arraycopy(bArr, 0, eVar.f, 0, bArr.length);
            eVar.b = i;
            eVar.d = i3;
            eVar.c = i2;
            eVar.e = i5;
            eVar.j = z;
            return eVar;
        } catch (Throwable unused) {
            return null;
        }
    }
}
