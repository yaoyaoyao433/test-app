package com.meizu.cloud.pushsdk.c.g;
/* loaded from: classes3.dex */
public final class j {
    final byte[] a;
    int b;
    int c;
    boolean d;
    final boolean e;
    j f;
    j g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j() {
        this.a = new byte[2048];
        this.e = true;
        this.d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(j jVar) {
        this(jVar.a, jVar.b, jVar.c);
    }

    private j(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.e = false;
        this.d = true;
    }

    public final j a() {
        j jVar = this.f != this ? this.f : null;
        this.g.f = this.f;
        this.f.g = this.g;
        this.f = null;
        this.g = null;
        return jVar;
    }

    public final j a(j jVar) {
        jVar.g = this;
        jVar.f = this.f;
        this.f.g = jVar;
        this.f = jVar;
        return jVar;
    }

    public final void a(j jVar, int i) {
        if (!jVar.e) {
            throw new IllegalArgumentException();
        }
        if (jVar.c + i > 2048) {
            if (jVar.d) {
                throw new IllegalArgumentException();
            }
            if ((jVar.c + i) - jVar.b > 2048) {
                throw new IllegalArgumentException();
            }
            System.arraycopy(jVar.a, jVar.b, jVar.a, 0, jVar.c - jVar.b);
            jVar.c -= jVar.b;
            jVar.b = 0;
        }
        System.arraycopy(this.a, this.b, jVar.a, jVar.c, i);
        jVar.c += i;
        this.b += i;
    }
}
