package com.dianping.imagemanager.image.loader.decode;

import android.content.res.AssetManager;
import com.dianping.imagemanager.utils.downloadphoto.d;
import com.dianping.imagemanager.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    private static String c = "DecodeHelper";
    public AssetManager b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9d1598cb9be56e85966db5f9756af86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9d1598cb9be56e85966db5f9756af86");
            return;
        }
        try {
            this.b = com.dianping.imagemanager.base.a.a().c.getAssets();
        } catch (NullPointerException unused) {
            com.dianping.imagemanager.utils.a.b(a.class, "DPImageEnvironment.applicationContext == null, isInited=" + com.dianping.imagemanager.base.a.a().b);
        }
    }

    public static d a(com.dianping.imagemanager.imagedecode.a aVar, int i, String str, long j, long j2, boolean z) {
        d a2;
        Object[] objArr = {aVar, Integer.valueOf(i), str, new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03f598ec5c43fde32d8b9bad4ac75104", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03f598ec5c43fde32d8b9bad4ac75104");
        }
        if (!aVar.a()) {
            return new d(aVar.e);
        }
        i.a e = aVar.e();
        int i2 = i;
        if (i2 == -1) {
            switch (e) {
                case JPEG:
                case SIMPLE_WEBP:
                case PNG_A:
                case PNG:
                case LOSSLESS_WEBP:
                case EXTENDED_WEBP_WITH_ALPHA:
                case BMP:
                    i2 = 0;
                    break;
                case GIF:
                    i2 = 1;
                    break;
                case ANIMATED_WEBP:
                    i2 = 2;
                    break;
            }
        }
        if (i2 == 0 || i2 == -1) {
            a2 = a(aVar, e, str, j, j2, z, true);
        } else if (i2 == 1 || i2 == 2) {
            a2 = new d(true, i2);
            a2.n = aVar.a(true);
            a2.p = e;
        } else if (i2 == 3) {
            a2 = new d(true, 3);
        } else {
            a2 = new d(true, i2);
        }
        if (aVar instanceof com.dianping.imagemanager.image.loader.decode.task.a) {
            a2.a(((com.dianping.imagemanager.image.loader.decode.task.a) aVar).f);
        }
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0187 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016e  */
    /* JADX WARN: Type inference failed for: r13v12, types: [android.graphics.Bitmap$Config] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v15, types: [int] */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.dianping.imagemanager.utils.downloadphoto.d a(com.dianping.imagemanager.imagedecode.a r29, com.dianping.imagemanager.utils.i.a r30, java.lang.String r31, long r32, long r34, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.imagemanager.image.loader.decode.a.a(com.dianping.imagemanager.imagedecode.a, com.dianping.imagemanager.utils.i$a, java.lang.String, long, long, boolean, boolean):com.dianping.imagemanager.utils.downloadphoto.d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] a(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r13
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.imagemanager.image.loader.decode.a.a
            java.lang.String r10 = "690a9fb86662876e376a945bfe69d1b7"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r12
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r9, r8, r10)
            byte[] r13 = (byte[]) r13
            return r13
        L1e:
            r0 = 0
            android.content.res.AssetManager r1 = r12.b     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L62
            java.io.InputStream r13 = r1.open(r13)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L62
            if (r13 == 0) goto L52
            int r1 = r13.available()     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L75
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r1 <= 0) goto L36
            int r1 = r13.available()     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L75
            int r1 = r1 + 4096
            goto L38
        L36:
            r1 = 16384(0x4000, float:2.2959E-41)
        L38:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L75
            r3.<init>(r1)     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L75
            byte[] r1 = new byte[r2]     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L75
        L3f:
            int r4 = r13.read(r1, r8, r2)     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L75
            r5 = -1
            if (r4 == r5) goto L4a
            r3.write(r1, r8, r4)     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L75
            goto L3f
        L4a:
            r3.flush()     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L75
            byte[] r1 = r3.toByteArray()     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L75
            r0 = r1
        L52:
            if (r13 == 0) goto L5c
            r13.close()     // Catch: java.io.IOException -> L58
            goto L5c
        L58:
            r13 = move-exception
            r13.printStackTrace()
        L5c:
            return r0
        L5d:
            r13 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
            goto L76
        L62:
            r13 = r0
        L63:
            java.lang.String r1 = com.dianping.imagemanager.image.loader.decode.a.c     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = "getDataFromAssets error"
            com.dianping.imagemanager.utils.k.d(r1, r2)     // Catch: java.lang.Throwable -> L75
            if (r13 == 0) goto L74
            r13.close()     // Catch: java.io.IOException -> L70
            goto L74
        L70:
            r13 = move-exception
            r13.printStackTrace()
        L74:
            return r0
        L75:
            r0 = move-exception
        L76:
            if (r13 == 0) goto L80
            r13.close()     // Catch: java.io.IOException -> L7c
            goto L80
        L7c:
            r13 = move-exception
            r13.printStackTrace()
        L80:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.imagemanager.image.loader.decode.a.a(java.lang.String):byte[]");
    }
}
