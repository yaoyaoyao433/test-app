package com.google.zxing.aztec.encoder;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends g {
    private final short c;
    private final short d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(g gVar, int i, int i2) {
        super(gVar);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // com.google.zxing.aztec.encoder.g
    public final void a(com.google.zxing.common.a aVar, byte[] bArr) {
        for (int i = 0; i < this.d; i++) {
            if (i == 0 || (i == 31 && this.d <= 62)) {
                aVar.a(31, 5);
                if (this.d > 62) {
                    aVar.a(this.d - 31, 16);
                } else if (i == 0) {
                    aVar.a(Math.min((int) this.d, 31), 5);
                } else {
                    aVar.a(this.d - 31, 5);
                }
            }
            aVar.a(bArr[this.c + i], 8);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.c);
        sb.append("::");
        sb.append((this.c + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
