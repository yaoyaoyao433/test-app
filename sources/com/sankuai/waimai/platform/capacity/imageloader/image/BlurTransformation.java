package com.sankuai.waimai.platform.capacity.imageloader.image;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BlurTransformation implements BitmapTransformation {
    public static ChangeQuickRedirect a = null;
    private static int c = 25;
    private static int d = 1;
    public boolean b;
    private final Context e;
    private final int f;
    private final int g;
    private final float h;
    private final float i;
    private final float j;

    public static BlurTransformation a(Context context, float f, float f2, float f3) {
        Object[] objArr = {context, Float.valueOf(0.1f), Float.valueOf(0.3f), Float.valueOf(0.33f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a614481ef80c406968f1d237d3191c6", RobustBitConfig.DEFAULT_VALUE) ? (BlurTransformation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a614481ef80c406968f1d237d3191c6") : new BlurTransformation(context, d, -1, 0.1f, 0.3f, 0.33f);
    }

    private BlurTransformation(Context context, int i, int i2, float f, float f2, float f3) {
        Object[] objArr = {context, Integer.valueOf(i), -1, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac412c0966af59cd67471eeffd846486", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac412c0966af59cd67471eeffd846486");
            return;
        }
        this.b = true;
        this.e = context.getApplicationContext();
        this.f = i;
        this.g = -1;
        this.h = f;
        this.i = f2;
        this.j = f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    @Override // com.sankuai.meituan.mtimageloader.utils.BitmapTransformation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap transform(android.graphics.Bitmap r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r9 = 1
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r2 = 2
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.platform.capacity.imageloader.image.BlurTransformation.a
            java.lang.String r11 = "41294f46afbb75bd83d5ef60eba494d1"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L2c
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r8, r11)
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            return r13
        L2c:
            int r0 = r13.getWidth()
            int r1 = r13.getHeight()
            int r2 = r12.g
            float r3 = r12.h
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L43
            float r2 = (float) r0
            float r3 = r12.h
            float r2 = r2 * r3
            int r2 = (int) r2
        L43:
            if (r2 <= 0) goto L49
            int r3 = com.sankuai.waimai.platform.capacity.imageloader.image.BlurTransformation.c
            if (r2 <= r3) goto L4b
        L49:
            int r2 = com.sankuai.waimai.platform.capacity.imageloader.image.BlurTransformation.c
        L4b:
            float r3 = r12.i
            float r4 = (float) r0
            float r3 = r3 * r4
            int r3 = (int) r3
            int r4 = r0 / 2
            int r3 = com.sankuai.waimai.foundation.utils.o.b(r3, r8, r4)
            float r4 = r12.j
            float r5 = (float) r1
            float r4 = r4 * r5
            int r4 = (int) r4
            int r5 = r1 / 2
            int r4 = com.sankuai.waimai.foundation.utils.o.b(r4, r8, r5)
            int r5 = r3 * 2
            int r0 = r0 - r5
            int r5 = r4 * 2
            int r1 = r1 - r5
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createBitmap(r13, r3, r4, r0, r1)
            boolean r0 = r12.b
            if (r0 == 0) goto L98
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r0 != r1) goto L90
            java.lang.String r0 = "OPPO"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L8b
            java.lang.String r0 = "VIVO"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L90
        L8b:
            android.graphics.Bitmap r13 = com.sankuai.waimai.foundation.utils.i.a(r13, r2, r9)
            goto L9c
        L90:
            android.content.Context r0 = r12.e     // Catch: android.renderscript.RSRuntimeException -> L98
            android.graphics.Bitmap r0 = com.sankuai.waimai.foundation.utils.t.a(r0, r13, r2)     // Catch: android.renderscript.RSRuntimeException -> L98
            r13 = r0
            goto L9c
        L98:
            android.graphics.Bitmap r13 = com.sankuai.waimai.foundation.utils.i.a(r13, r2, r9)
        L9c:
            android.graphics.Bitmap r14 = com.sankuai.waimai.foundation.utils.c.a(r13, r14, r15)
            if (r13 == 0) goto La5
            r13.recycle()
        La5:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.capacity.imageloader.image.BlurTransformation.transform(android.graphics.Bitmap, int, int):android.graphics.Bitmap");
    }
}
