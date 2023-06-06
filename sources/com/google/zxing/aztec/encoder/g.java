package com.google.zxing.aztec.encoder;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class g {
    static final g a = new e(null, 0, 0);
    final g b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(com.google.zxing.common.a aVar, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(g gVar) {
        this.b = gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final g a(int i, int i2) {
        return new e(this, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final g b(int i, int i2) {
        return new b(this, i, i2);
    }
}
