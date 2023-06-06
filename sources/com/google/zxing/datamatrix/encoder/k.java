package com.google.zxing.datamatrix.encoder;

import com.sankuai.common.utils.shortcut.ShortcutUtils;
import com.tencent.smtt.sdk.TbsListener;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class k {
    static final k[] a;
    private static k[] g;
    final int b;
    final int c;
    public final int d;
    public final int e;
    final int f;
    private final boolean h;
    private final int i;
    private final int j;

    static {
        k[] kVarArr = {new k(false, 3, 5, 8, 8, 1), new k(false, 5, 7, 10, 10, 1), new k(true, 5, 7, 16, 6, 1), new k(false, 8, 10, 12, 12, 1), new k(true, 10, 11, 14, 6, 2), new k(false, 12, 12, 14, 14, 1), new k(true, 16, 14, 24, 10, 1), new k(false, 18, 14, 16, 16, 1), new k(false, 22, 18, 18, 18, 1), new k(true, 22, 18, 16, 10, 2), new k(false, 30, 20, 20, 20, 1), new k(true, 32, 24, 16, 14, 2), new k(false, 36, 24, 22, 22, 1), new k(false, 44, 28, 24, 24, 1), new k(true, 49, 28, 22, 14, 2), new k(false, 62, 36, 14, 14, 4), new k(false, 86, 42, 16, 16, 4), new k(false, 114, 48, 18, 18, 4), new k(false, 144, 56, 20, 20, 4), new k(false, TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_4, 68, 22, 22, 4), new k(false, TbsListener.ErrorCode.APK_INVALID, 84, 24, 24, 4, 102, 42), new k(false, 280, 112, 14, 14, 16, 140, 56), new k(false, 368, 144, 16, 16, 16, 92, 36), new k(false, 456, 192, 18, 18, 16, 114, 48), new k(false, 576, TbsListener.ErrorCode.EXCEED_INCR_UPDATE, 20, 20, 16, 144, 56), new k(false, 696, ShortcutUtils.SHORTCUT_TYPE_ENABLE, 22, 22, 16, TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_4, 68), new k(false, 816, 336, 24, 24, 16, 136, 56), new k(false, 1050, TbsListener.ErrorCode.INFO_CAN_NOT_DISABLED_BY_CRASH, 18, 18, 36, TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_5, 68), new k(false, 1304, 496, 20, 20, 36, TbsListener.ErrorCode.STARTDOWNLOAD_4, 62), new d()};
        a = kVarArr;
        g = kVarArr;
    }

    private k(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.h = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.i = i5;
        this.j = i6;
        this.f = i7;
    }

    public static k a(int i, l lVar, com.google.zxing.b bVar, com.google.zxing.b bVar2, boolean z) {
        k[] kVarArr;
        for (k kVar : g) {
            if (!(lVar == l.FORCE_SQUARE && kVar.h) && ((lVar != l.FORCE_RECTANGLE || kVar.h) && ((bVar == null || (kVar.d() >= bVar.a && kVar.e() >= bVar.b)) && ((bVar2 == null || (kVar.d() <= bVar2.a && kVar.e() <= bVar2.b)) && i <= kVar.b)))) {
                return kVar;
            }
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: " + i);
    }

    private int f() {
        int i = this.i;
        if (i != 4) {
            if (i != 16) {
                if (i != 36) {
                    switch (i) {
                        case 1:
                            return 1;
                        case 2:
                            return 2;
                        default:
                            throw new IllegalStateException("Cannot handle this number of data regions");
                    }
                }
                return 6;
            }
            return 4;
        }
        return 2;
    }

    private int g() {
        int i = this.i;
        if (i != 4) {
            if (i != 16) {
                if (i != 36) {
                    switch (i) {
                        case 1:
                            return 1;
                        case 2:
                            return 1;
                        default:
                            throw new IllegalStateException("Cannot handle this number of data regions");
                    }
                }
                return 6;
            }
            return 4;
        }
        return 2;
    }

    public final int b() {
        return f() * this.d;
    }

    public final int c() {
        return g() * this.e;
    }

    public final int d() {
        return b() + (f() * 2);
    }

    public final int e() {
        return c() + (g() * 2);
    }

    public int a() {
        return this.b / this.j;
    }

    public int a(int i) {
        return this.j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.h ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.d);
        sb.append('x');
        sb.append(this.e);
        sb.append(", symbol size ");
        sb.append(d());
        sb.append('x');
        sb.append(e());
        sb.append(", symbol data size ");
        sb.append(b());
        sb.append('x');
        sb.append(c());
        sb.append(", codewords ");
        sb.append(this.b);
        sb.append('+');
        sb.append(this.c);
        return sb.toString();
    }
}
