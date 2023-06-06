package com.dianping.imagemanager.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class t {
    public static ChangeQuickRedirect a;
    public static final boolean b;
    public static final boolean c;
    public static final boolean d;
    private static final byte[] e;
    private static final byte[] f;
    private static final byte[] g;
    private static final byte[] h;
    private static final byte[] i;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        if (r1.outWidth == 1) goto L21;
     */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            r2 = 0
            r3 = 1
            if (r0 > r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.dianping.imagemanager.utils.t.b = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 14
            if (r0 < r4) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            com.dianping.imagemanager.utils.t.c = r0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.meituan.robust.ChangeQuickRedirect r11 = com.dianping.imagemanager.utils.t.a
            java.lang.String r12 = "5ff9c4e00d71d5941a0241035f1dc700"
            r5 = 0
            r7 = 1
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            r4 = r0
            r6 = r11
            r8 = r12
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto L37
            r1 = 0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r11, r3, r12)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            goto L5b
        L37:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r1) goto L3c
            goto L5b
        L3c:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 != r1) goto L5a
            java.lang.String r0 = "UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA=="
            byte[] r0 = android.util.Base64.decode(r0, r2)
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r1.inJustDecodeBounds = r3
            int r4 = r0.length
            com.sankuai.waimai.launcher.util.image.a.a(r0, r2, r4, r1)
            int r0 = r1.outHeight
            if (r0 != r3) goto L5b
            int r0 = r1.outWidth
            if (r0 == r3) goto L5a
            goto L5b
        L5a:
            r2 = 1
        L5b:
            com.dianping.imagemanager.utils.t.d = r2
            java.lang.String r0 = "RIFF"
            byte[] r0 = com.dianping.imagemanager.utils.g.a(r0)
            com.dianping.imagemanager.utils.t.e = r0
            java.lang.String r0 = "WEBP"
            byte[] r0 = com.dianping.imagemanager.utils.g.a(r0)
            com.dianping.imagemanager.utils.t.f = r0
            java.lang.String r0 = "VP8 "
            byte[] r0 = com.dianping.imagemanager.utils.g.a(r0)
            com.dianping.imagemanager.utils.t.g = r0
            java.lang.String r0 = "VP8L"
            byte[] r0 = com.dianping.imagemanager.utils.g.a(r0)
            com.dianping.imagemanager.utils.t.h = r0
            java.lang.String r0 = "VP8X"
            byte[] r0 = com.dianping.imagemanager.utils.g.a(r0)
            com.dianping.imagemanager.utils.t.i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.imagemanager.utils.t.<clinit>():void");
    }

    public static boolean a(byte[] bArr, int i2) {
        Object[] objArr = {bArr, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ed4357eb6878497b2254368a163b407", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ed4357eb6878497b2254368a163b407")).booleanValue();
        }
        return g.a(bArr, 12, i) && ((bArr[20] & 2) == 2);
    }

    public static boolean b(byte[] bArr, int i2) {
        Object[] objArr = {bArr, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8fb42ce6f30fd84342476ad01f0be5a2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8fb42ce6f30fd84342476ad01f0be5a2")).booleanValue() : g.a(bArr, 12, g);
    }

    public static boolean c(byte[] bArr, int i2) {
        Object[] objArr = {bArr, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d37a9796c53263a8c47124dca5700a6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d37a9796c53263a8c47124dca5700a6")).booleanValue() : g.a(bArr, 12, h);
    }

    public static boolean d(byte[] bArr, int i2) {
        Object[] objArr = {bArr, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d55650bc7c34dc8bb18f12a80637a38f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d55650bc7c34dc8bb18f12a80637a38f")).booleanValue();
        }
        return g.a(bArr, 12, i) && ((bArr[20] & 16) == 16);
    }

    public static boolean a(byte[] bArr, int i2, int i3) {
        Object[] objArr = {bArr, 0, 21};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67ceed520594de5fcc50fb09287cc069", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67ceed520594de5fcc50fb09287cc069")).booleanValue() : g.a(bArr, 0, e) && g.a(bArr, 8, f);
    }
}
