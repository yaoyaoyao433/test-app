package com.google.zxing.qrcode.decoder;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum b {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    
    public final int k;
    private final int[] l;

    b(int[] iArr, int i) {
        this.l = iArr;
        this.k = i;
    }

    public final int a(c cVar) {
        int i = cVar.a;
        return this.l[i <= 9 ? (char) 0 : i <= 26 ? (char) 1 : (char) 2];
    }
}
