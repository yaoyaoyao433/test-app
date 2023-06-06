package com.meituan.android.yoda.util;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.util.LruCache;
import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;
    private static int b = (((int) Runtime.getRuntime().maxMemory()) / 1024) / 16;
    private static LruCache<String, Bitmap> c = null;

    public static Drawable a(Drawable drawable, @ColorInt int i) {
        Object[] objArr = {drawable, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2049608bb068773d3a27a3a6091e3302", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2049608bb068773d3a27a3a6091e3302");
        }
        ColorStateList valueOf = ColorStateList.valueOf(i);
        Object[] objArr2 = {drawable, valueOf};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fa32d4b96f584a3663e38f58b6a10145", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fa32d4b96f584a3663e38f58b6a10145") : a(drawable, valueOf, null);
    }

    private static Drawable a(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Object[] objArr = {drawable, colorStateList, mode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b89a431ad3d45156274964e3c6450d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b89a431ad3d45156274964e3c6450d3");
        }
        if (drawable == null) {
            return null;
        }
        try {
            Drawable wrap = DrawableCompat.wrap(drawable);
            if (mode != null) {
                DrawableCompat.setTintMode(wrap, mode);
            }
            DrawableCompat.setTintList(wrap, colorStateList);
            return wrap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Drawable a(Drawable drawable) {
        Drawable.ConstantState constantState;
        Drawable newDrawable;
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d963598a43aece9c2642dfca46ba2a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d963598a43aece9c2642dfca46ba2a9");
        }
        if (drawable == null || (constantState = drawable.getConstantState()) == null || (newDrawable = constantState.newDrawable()) == null) {
            return null;
        }
        return newDrawable.mutate();
    }

    public static Bitmap a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3315e54826afc3426dc7a48730bb88f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3315e54826afc3426dc7a48730bb88f0");
        }
        byte[] decode = Base64.decode(str, 0);
        return com.sankuai.waimai.launcher.util.image.a.a(decode, 0, decode.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009b A[Catch: Exception -> 0x009f, TRY_ENTER, TryCatch #6 {Exception -> 0x009f, blocks: (B:10:0x003b, B:12:0x0041, B:13:0x0044, B:16:0x004e, B:24:0x0080, B:38:0x009b, B:39:0x009e, B:17:0x0063), top: B:56:0x003b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File a(android.content.Context r11, android.graphics.Bitmap r12, java.lang.String r13, com.meituan.android.yoda.bean.AESKeys r14) {
        /*
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r11
            r8 = 1
            r0[r8] = r12
            r1 = 2
            r0[r1] = r13
            r1 = 3
            r0[r1] = r14
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.yoda.util.i.a
            java.lang.String r10 = "af3baf9e4531ac09205347072fc695e0"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L27
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r9, r8, r10)
            java.io.File r11 = (java.io.File) r11
            return r11
        L27:
            com.meituan.android.cipstorage.u r0 = com.meituan.android.cipstorage.u.b     // Catch: java.lang.Exception -> La1
            java.io.File r11 = com.meituan.android.cipstorage.q.a(r11, r13, r2, r0)     // Catch: java.lang.Exception -> La1
            boolean r0 = r11.exists()     // Catch: java.lang.Exception -> La1
            if (r0 != 0) goto L36
            r11.mkdirs()     // Catch: java.lang.Exception -> La1
        L36:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> La1
            r0.<init>(r11, r13)     // Catch: java.lang.Exception -> La1
            boolean r11 = r0.exists()     // Catch: java.lang.Exception -> L9f
            if (r11 == 0) goto L44
            r0.delete()     // Catch: java.lang.Exception -> L9f
        L44:
            r0.createNewFile()     // Catch: java.lang.Exception -> L9f
            boolean r11 = r0.exists()     // Catch: java.lang.Exception -> L9f
            if (r11 != 0) goto L4e
            return r2
        L4e:
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L9f
            r11.<init>()     // Catch: java.lang.Exception -> L9f
            android.graphics.Bitmap$CompressFormat r13 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L9f
            r1 = 70
            r12.compress(r13, r1, r11)     // Catch: java.lang.Exception -> L9f
            byte[] r11 = r11.toByteArray()     // Catch: java.lang.Exception -> L9f
            com.meituan.android.yoda.xxtea.a r12 = new com.meituan.android.yoda.xxtea.a     // Catch: java.lang.Exception -> L9f
            r12.<init>()     // Catch: java.lang.Exception -> L9f
            java.lang.String r13 = r14.getEdk()     // Catch: java.lang.Throwable -> L70
            java.lang.String r14 = r14.getDk()     // Catch: java.lang.Throwable -> L70
            byte[] r11 = r12.a(r11, r13, r14)     // Catch: java.lang.Throwable -> L70
            goto L75
        L70:
            r11 = move-exception
            r11.printStackTrace()     // Catch: java.lang.Exception -> L9f
            r11 = r2
        L75:
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
            r12.write(r11)     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L98
            r12.flush()     // Catch: java.lang.Exception -> L85 java.lang.Throwable -> L98
            r12.close()     // Catch: java.lang.Exception -> L9f
            r2 = r0
            goto Lab
        L85:
            r11 = move-exception
            goto L8c
        L87:
            r11 = move-exception
            r12 = r2
            goto L99
        L8a:
            r11 = move-exception
            r12 = r2
        L8c:
            r11.printStackTrace()     // Catch: java.lang.Throwable -> L98
            r0.delete()     // Catch: java.lang.Throwable -> L98
            if (r12 == 0) goto Lab
            r12.close()     // Catch: java.lang.Exception -> La1
            goto Lab
        L98:
            r11 = move-exception
        L99:
            if (r12 == 0) goto L9e
            r12.close()     // Catch: java.lang.Exception -> L9f
        L9e:
            throw r11     // Catch: java.lang.Exception -> L9f
        L9f:
            r11 = move-exception
            goto La3
        La1:
            r11 = move-exception
            r0 = r2
        La3:
            r11.printStackTrace()
            if (r0 == 0) goto Lab
            r0.delete()
        Lab:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.yoda.util.i.a(android.content.Context, android.graphics.Bitmap, java.lang.String, com.meituan.android.yoda.bean.AESKeys):java.io.File");
    }
}
