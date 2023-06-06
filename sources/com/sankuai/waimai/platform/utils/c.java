package com.sankuai.waimai.platform.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements com.google.zxing.g {
    public static ChangeQuickRedirect a;

    @Override // com.google.zxing.g
    public final com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i, int i2, Map<com.google.zxing.c, ?> map) throws com.google.zxing.h {
        int i3;
        Object[] objArr = {str, aVar, Integer.valueOf(i), Integer.valueOf(i2), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eafc1cd9070b75b8408b1e371fc84a69", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.google.zxing.common.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eafc1cd9070b75b8408b1e371fc84a69");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != com.google.zxing.a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + aVar);
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        } else {
            com.google.zxing.qrcode.decoder.a aVar2 = com.google.zxing.qrcode.decoder.a.L;
            if (map != null) {
                com.google.zxing.qrcode.decoder.a aVar3 = (com.google.zxing.qrcode.decoder.a) map.get(com.google.zxing.c.ERROR_CORRECTION);
                if (aVar3 != null) {
                    aVar2 = aVar3;
                }
                Integer num = (Integer) map.get(com.google.zxing.c.MARGIN);
                if (num != null) {
                    i3 = num.intValue();
                    return a(com.google.zxing.qrcode.encoder.c.a(str, aVar2, map), i, i2, i3);
                }
            }
            i3 = 4;
            return a(com.google.zxing.qrcode.encoder.c.a(str, aVar2, map), i, i2, i3);
        }
    }

    private static com.google.zxing.common.b a(com.google.zxing.qrcode.encoder.f fVar, int i, int i2, int i3) {
        Object[] objArr = {fVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0298cabb1b65d4ed871d61b21dee6343", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.google.zxing.common.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0298cabb1b65d4ed871d61b21dee6343");
        }
        com.google.zxing.qrcode.encoder.b bVar = fVar.e;
        if (bVar == null) {
            throw new IllegalStateException();
        }
        int i4 = bVar.b;
        int i5 = bVar.c;
        int max = Math.max(i, i4);
        int max2 = Math.max(i2, i5);
        int min = Math.min(max / i4, max2 / i5);
        int i6 = (max - (i4 * min)) / 2;
        int i7 = (max2 - (i5 * min)) / 2;
        if (i6 >= 0) {
            max -= i6 * 2;
            i6 = 0;
        }
        if (i7 >= 0) {
            max2 -= i7 * 2;
            i7 = 0;
        }
        com.google.zxing.common.b bVar2 = new com.google.zxing.common.b(max, max2);
        int i8 = 0;
        while (i8 < i5) {
            int i9 = i6;
            int i10 = 0;
            while (i10 < i4) {
                if (bVar.a(i10, i8) == 1) {
                    bVar2.a(i9, i7, min, min);
                }
                i10++;
                i9 += min;
            }
            i8++;
            i7 += min;
        }
        return bVar2;
    }
}
