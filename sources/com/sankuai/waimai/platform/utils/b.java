package com.sankuai.waimai.platform.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.google.zxing.g {
    public static ChangeQuickRedirect a;

    @Override // com.google.zxing.g
    public final com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i, int i2, Map<com.google.zxing.c, ?> map) throws com.google.zxing.h {
        com.google.zxing.g iVar;
        Object[] objArr = {str, aVar, Integer.valueOf(i), Integer.valueOf(i2), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfd9b9907ed5dc8d420f533174e2602e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.google.zxing.common.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfd9b9907ed5dc8d420f533174e2602e");
        }
        switch (aVar) {
            case EAN_8:
                iVar = new com.google.zxing.oned.i();
                break;
            case EAN_13:
                iVar = new com.google.zxing.oned.h();
                break;
            case UPC_A:
                iVar = new com.google.zxing.oned.n();
                break;
            case QR_CODE:
                iVar = new c();
                break;
            case CODE_39:
                iVar = new com.google.zxing.oned.f();
                break;
            case CODE_128:
                iVar = new com.google.zxing.oned.d();
                break;
            case ITF:
                iVar = new com.google.zxing.oned.k();
                break;
            case PDF_417:
                iVar = new com.google.zxing.pdf417.a();
                break;
            case CODABAR:
                iVar = new com.google.zxing.oned.b();
                break;
            case DATA_MATRIX:
                iVar = new com.google.zxing.datamatrix.a();
                break;
            case AZTEC:
                iVar = new com.google.zxing.aztec.a();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format " + aVar);
        }
        return iVar.a(str, aVar, i, i2, map);
    }
}
