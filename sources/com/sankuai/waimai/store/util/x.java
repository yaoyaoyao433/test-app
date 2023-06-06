package com.sankuai.waimai.store.util;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class x {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    @android.annotation.TargetApi(18)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap a(android.content.Context r11, android.graphics.Bitmap r12, int r13) throws android.renderscript.RSRuntimeException {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r11
            r8 = 1
            r0[r8] = r12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r2 = 2
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.store.util.x.a
            java.lang.String r10 = "3d364b78d435e9bf20788c5718c6e2c1"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L28
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r9, r8, r10)
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            return r11
        L28:
            android.renderscript.RenderScript r11 = android.renderscript.RenderScript.create(r11)     // Catch: java.lang.Throwable -> L78
            android.renderscript.RenderScript$RSMessageHandler r0 = new android.renderscript.RenderScript$RSMessageHandler     // Catch: java.lang.Throwable -> L75
            r0.<init>()     // Catch: java.lang.Throwable -> L75
            r11.setMessageHandler(r0)     // Catch: java.lang.Throwable -> L75
            android.renderscript.Allocation$MipmapControl r0 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch: java.lang.Throwable -> L75
            android.renderscript.Allocation r0 = android.renderscript.Allocation.createFromBitmap(r11, r12, r0, r8)     // Catch: java.lang.Throwable -> L75
            android.renderscript.Type r1 = r0.getType()     // Catch: java.lang.Throwable -> L72
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createTyped(r11, r1)     // Catch: java.lang.Throwable -> L72
            android.renderscript.Element r3 = android.renderscript.Element.U8_4(r11)     // Catch: java.lang.Throwable -> L6e
            android.renderscript.ScriptIntrinsicBlur r3 = android.renderscript.ScriptIntrinsicBlur.create(r11, r3)     // Catch: java.lang.Throwable -> L6e
            r3.setInput(r0)     // Catch: java.lang.Throwable -> L6c
            float r13 = (float) r13     // Catch: java.lang.Throwable -> L6c
            r3.setRadius(r13)     // Catch: java.lang.Throwable -> L6c
            r3.forEach(r1)     // Catch: java.lang.Throwable -> L6c
            r1.copyTo(r12)     // Catch: java.lang.Throwable -> L6c
            if (r11 == 0) goto L5c
            r11.destroy()
        L5c:
            if (r0 == 0) goto L61
            r0.destroy()
        L61:
            if (r1 == 0) goto L66
            r1.destroy()
        L66:
            if (r3 == 0) goto L6b
            r3.destroy()
        L6b:
            return r12
        L6c:
            r12 = move-exception
            goto L70
        L6e:
            r12 = move-exception
            r3 = r2
        L70:
            r2 = r1
            goto L7c
        L72:
            r12 = move-exception
            r3 = r2
            goto L7c
        L75:
            r12 = move-exception
            r0 = r2
            goto L7b
        L78:
            r12 = move-exception
            r11 = r2
            r0 = r11
        L7b:
            r3 = r0
        L7c:
            if (r11 == 0) goto L81
            r11.destroy()
        L81:
            if (r0 == 0) goto L86
            r0.destroy()
        L86:
            if (r2 == 0) goto L8b
            r2.destroy()
        L8b:
            if (r3 == 0) goto L90
            r3.destroy()
        L90:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.util.x.a(android.content.Context, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }
}
