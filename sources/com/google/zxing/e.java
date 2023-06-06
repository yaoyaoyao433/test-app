package com.google.zxing;

import com.google.zxing.oned.i;
import com.google.zxing.oned.k;
import com.google.zxing.oned.n;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e implements g {
    @Override // com.google.zxing.g
    public final com.google.zxing.common.b a(String str, a aVar, int i, int i2, Map<c, ?> map) throws h {
        g iVar;
        switch (aVar) {
            case EAN_8:
                iVar = new i();
                break;
            case EAN_13:
                iVar = new com.google.zxing.oned.h();
                break;
            case UPC_A:
                iVar = new n();
                break;
            case QR_CODE:
                iVar = new com.google.zxing.qrcode.a();
                break;
            case CODE_39:
                iVar = new com.google.zxing.oned.f();
                break;
            case CODE_128:
                iVar = new com.google.zxing.oned.d();
                break;
            case ITF:
                iVar = new k();
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
