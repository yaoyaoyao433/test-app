package com.xiaomi.push;

import java.io.IOException;
/* loaded from: classes6.dex */
public abstract class de {
    public abstract int a();

    public abstract void a(bd bdVar);

    public final void a(byte[] bArr, int i, int i2) {
        try {
            bd a = bd.a(bArr, i, i2);
            a(a);
            a.b();
        } catch (IOException unused) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).");
        }
    }

    public abstract int b();

    public abstract de b(ac acVar);

    public final de b(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public final byte[] d() {
        byte[] bArr = new byte[b()];
        a(bArr, 0, bArr.length);
        return bArr;
    }

    public final de b(byte[] bArr, int i, int i2) {
        try {
            ac acVar = new ac(bArr, i, i2);
            b(acVar);
            acVar.a(0);
            return this;
        } catch (ce e) {
            throw e;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }
}
