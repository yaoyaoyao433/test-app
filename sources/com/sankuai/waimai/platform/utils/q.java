package com.sankuai.waimai.platform.utils;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Hashtable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class q {
    public static ChangeQuickRedirect a;

    public static Bitmap a(String str, com.google.zxing.a aVar, int i, int i2, boolean z) {
        com.google.zxing.common.b bVar;
        Object[] objArr = {str, aVar, Integer.valueOf(i), Integer.valueOf(i2), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1a4148b4e5f7e6401d957f91df8036f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1a4148b4e5f7e6401d957f91df8036f");
        }
        Hashtable hashtable = new Hashtable();
        hashtable.put(com.google.zxing.c.CHARACTER_SET, "utf-8");
        hashtable.put(com.google.zxing.c.MARGIN, 1);
        hashtable.put(com.google.zxing.c.ERROR_CORRECTION, com.google.zxing.qrcode.decoder.a.H);
        try {
            if (aVar == com.google.zxing.a.QR_CODE) {
                bVar = new b().a(str, aVar, i, i2, hashtable);
            } else {
                bVar = new com.google.zxing.e().a(str, aVar, i, i2, hashtable);
            }
        } catch (com.google.zxing.h unused) {
            bVar = null;
        }
        if (bVar == null) {
            return null;
        }
        int i3 = bVar.a;
        int i4 = bVar.b;
        int[] iArr = new int[i3 * i4];
        for (int i5 = 0; i5 < i4; i5++) {
            for (int i6 = 0; i6 < i3; i6++) {
                if (bVar.a(i6, i5)) {
                    iArr[(i5 * i3) + i6] = -16777216;
                }
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, i3, 0, 0, i3, i4);
        return createBitmap;
    }
}
