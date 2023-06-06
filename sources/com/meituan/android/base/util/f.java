package com.meituan.android.base.util;

import android.graphics.Bitmap;
import com.google.zxing.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Hashtable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static Bitmap a(String str, com.google.zxing.a aVar, int i, int i2) {
        com.google.zxing.common.b bVar;
        Object[] objArr = {str, aVar, 400, 400};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5b0d700d8cdea5cdf8bf683815e5858", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5b0d700d8cdea5cdf8bf683815e5858");
        }
        Hashtable hashtable = new Hashtable();
        hashtable.put(com.google.zxing.c.CHARACTER_SET, "utf-8");
        hashtable.put(com.google.zxing.c.MARGIN, 1);
        hashtable.put(com.google.zxing.c.ERROR_CORRECTION, com.google.zxing.qrcode.decoder.a.H);
        try {
            bVar = new com.google.zxing.e().a(str, aVar, 400, 400, hashtable);
        } catch (h unused) {
            bVar = null;
        }
        if (bVar == null) {
            return null;
        }
        int b = bVar.b();
        int c = bVar.c();
        int[] iArr = new int[b * c];
        for (int i3 = 0; i3 < c; i3++) {
            for (int i4 = 0; i4 < b; i4++) {
                if (bVar.a(i4, i3)) {
                    iArr[(i3 * b) + i4] = -16777216;
                }
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(b, c, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, b, 0, 0, b, c);
        return createBitmap;
    }
}
