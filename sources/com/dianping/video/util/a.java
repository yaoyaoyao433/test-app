package com.dianping.video.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static Bitmap a(String str, int i, int i2) {
        int i3;
        int i4;
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8177f5fbc5bcdd2c99120d4d10f69300", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8177f5fbc5bcdd2c99120d4d10f69300");
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.sankuai.waimai.launcher.util.image.a.a(str, options);
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.util.image.a.a;
        int intValue = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6c6cc2cbbbd43ea15589c9d85c0e64e6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6c6cc2cbbbd43ea15589c9d85c0e64e6")).intValue() : com.dianping.util.image.a.a(null, str, null);
        if (intValue == 0 || intValue == 180) {
            i3 = options.outWidth;
            i4 = options.outHeight;
        } else {
            i3 = options.outHeight;
            i4 = options.outWidth;
        }
        options.inSampleSize = a(i3, i4, i, i2);
        options.inJustDecodeBounds = false;
        Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(str, options);
        if (intValue != 0) {
            try {
                Matrix matrix = new Matrix();
                matrix.postRotate(intValue);
                Bitmap createBitmap = Bitmap.createBitmap(a2, 0, 0, a2.getWidth(), a2.getHeight(), matrix, true);
                if (a2 != createBitmap) {
                    a2.recycle();
                }
                return createBitmap;
            } catch (Throwable unused) {
                return a2;
            }
        }
        return a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
        if ((r22 * r8) < (r10 * r4)) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(long r22, long r24, long r26, long r28) {
        /*
            r0 = r22
            r2 = r24
            r4 = r26
            r6 = r28
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r0)
            r10 = 0
            r8[r10] = r9
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r2)
            r14 = 1
            r8[r14] = r9
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r4)
            r16 = 2
            r8[r16] = r9
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r6)
            r10 = 3
            r8[r10] = r9
            com.meituan.robust.ChangeQuickRedirect r15 = com.dianping.video.util.a.a
            java.lang.String r13 = "4ef84dd652d26a36b03614a5281e8615"
            r10 = 0
            r12 = 1
            r17 = 4611686018427387904(0x4000000000000000, double:2.0)
            r9 = r8
            r11 = r15
            r19 = r13
            r2 = r15
            r3 = 1
            r14 = r17
            boolean r9 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14)
            if (r9 == 0) goto L50
            r0 = 0
            r1 = r19
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r0, r2, r3, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L50:
            r8 = 2048(0x800, double:1.0118E-320)
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L5a
            long r4 = r4 / r6
            long r4 = r4 * r8
            goto L69
        L5a:
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L68
            long r4 = r6 / r4
            long r4 = r4 * r8
            r20 = r4
            r4 = r8
            r8 = r20
            goto L69
        L68:
            r8 = r6
        L69:
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L75
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 > 0) goto L75
            r4 = r0
            goto L94
        L75:
            if (r2 > 0) goto L7f
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 > 0) goto L7c
            goto L7f
        L7c:
            r10 = r24
            goto L91
        L7f:
            if (r2 <= 0) goto L86
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 > 0) goto L86
            goto L94
        L86:
            long r6 = r0 * r8
            r10 = r24
            long r12 = r10 * r4
            int r2 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r2 >= 0) goto L91
            goto L94
        L91:
            long r4 = r0 * r8
            long r4 = r4 / r10
        L94:
            float r2 = (float) r4
            float r0 = (float) r0
            float r2 = r2 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r1 >= 0) goto Lab
        L9d:
            int r3 = r3 * 2
            float r1 = (float) r3
            float r1 = r1 * r2
            int r1 = java.lang.Float.compare(r1, r0)
            if (r1 <= 0) goto L9d
            int r14 = r3 / 2
            goto Lac
        Lab:
            r14 = 1
        Lac:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.video.util.a.a(long, long, long, long):int");
    }
}
