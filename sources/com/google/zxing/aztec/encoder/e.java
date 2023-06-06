package com.google.zxing.aztec.encoder;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e extends g {
    private final short c;
    private final short d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(g gVar, int i, int i2) {
        super(gVar);
        this.c = (short) i;
        this.d = (short) i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.zxing.aztec.encoder.g
    public final void a(com.google.zxing.common.a aVar, byte[] bArr) {
        aVar.a(this.c, this.d);
    }

    public final String toString() {
        int i = (this.c & ((1 << this.d) - 1)) | (1 << this.d);
        return "<" + Integer.toBinaryString(i | (1 << this.d)).substring(1) + '>';
    }
}
