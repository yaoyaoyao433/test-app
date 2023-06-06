package com.facebook.react.views.image.blur;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    @android.annotation.TargetApi(18)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap a(android.content.Context r4, android.graphics.Bitmap r5, int r6) throws android.renderscript.RSRuntimeException {
        /*
            r0 = 0
            android.renderscript.RenderScript r4 = android.renderscript.RenderScript.create(r4)     // Catch: java.lang.Throwable -> L52
            android.renderscript.RenderScript$RSMessageHandler r1 = new android.renderscript.RenderScript$RSMessageHandler     // Catch: java.lang.Throwable -> L4f
            r1.<init>()     // Catch: java.lang.Throwable -> L4f
            r4.setMessageHandler(r1)     // Catch: java.lang.Throwable -> L4f
            android.renderscript.Allocation$MipmapControl r1 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch: java.lang.Throwable -> L4f
            r2 = 1
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r4, r5, r1, r2)     // Catch: java.lang.Throwable -> L4f
            android.renderscript.Type r2 = r1.getType()     // Catch: java.lang.Throwable -> L4c
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createTyped(r4, r2)     // Catch: java.lang.Throwable -> L4c
            android.renderscript.Element r3 = android.renderscript.Element.U8_4(r4)     // Catch: java.lang.Throwable -> L48
            android.renderscript.ScriptIntrinsicBlur r3 = android.renderscript.ScriptIntrinsicBlur.create(r4, r3)     // Catch: java.lang.Throwable -> L48
            r3.setInput(r1)     // Catch: java.lang.Throwable -> L46
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L46
            r3.setRadius(r6)     // Catch: java.lang.Throwable -> L46
            r3.forEach(r2)     // Catch: java.lang.Throwable -> L46
            r2.copyTo(r5)     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L36
            r4.destroy()
        L36:
            if (r1 == 0) goto L3b
            r1.destroy()
        L3b:
            if (r2 == 0) goto L40
            r2.destroy()
        L40:
            if (r3 == 0) goto L45
            r3.destroy()
        L45:
            return r5
        L46:
            r5 = move-exception
            goto L4a
        L48:
            r5 = move-exception
            r3 = r0
        L4a:
            r0 = r2
            goto L56
        L4c:
            r5 = move-exception
            r3 = r0
            goto L56
        L4f:
            r5 = move-exception
            r1 = r0
            goto L55
        L52:
            r5 = move-exception
            r4 = r0
            r1 = r4
        L55:
            r3 = r1
        L56:
            if (r4 == 0) goto L5b
            r4.destroy()
        L5b:
            if (r1 == 0) goto L60
            r1.destroy()
        L60:
            if (r0 == 0) goto L65
            r0.destroy()
        L65:
            if (r3 == 0) goto L6a
            r3.destroy()
        L6a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.blur.c.a(android.content.Context, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }
}
