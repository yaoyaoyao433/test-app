package com.squareup.picasso.progressive;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i implements com.bumptech.glide.load.c {
    private final String a;
    private final int b;
    private final int c;
    private final long d;
    private final int e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final boolean j;
    private int k;
    private StringBuilder l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(String str, int i, int i2, long j, int i3, int i4, boolean z, boolean z2, int i5, boolean z3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = z2;
        this.i = i5;
        this.j = z3;
    }

    @Override // com.bumptech.glide.load.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.c == iVar.c && this.b == iVar.b && this.d == iVar.d && this.e == iVar.e && this.f == iVar.f && this.g == iVar.g && this.h == iVar.h && this.i == iVar.i && this.j == iVar.j;
    }

    @Override // com.bumptech.glide.load.c
    public final int hashCode() {
        if (this.k == 0) {
            this.k = this.a.hashCode();
            this.k = (this.k * 31) + this.b;
            this.k = (this.k * 31) + this.c;
            this.k = (this.k * 31) + ((int) this.d);
            this.k = (this.k * 31) + this.e;
            this.k = (this.k * 31) + this.f;
            this.k = (this.k * 31) + (this.g ? 1 : 0);
            this.k = (this.k * 31) + (this.h ? 1 : 0);
            this.k = (this.k * 31) + this.i;
            this.k = (this.k * 31) + (this.j ? 1 : 0);
        }
        return this.k;
    }

    public final String toString() {
        if (this.l == null) {
            StringBuilder sb = new StringBuilder("EngineKey{");
            sb.append("id=");
            sb.append(this.a);
            sb.append("+[width=");
            sb.append(this.b);
            sb.append(":height=");
            sb.append(this.c);
            sb.append("]:time=");
            sb.append(this.d);
            sb.append(":imageViewHashcode=");
            sb.append(this.e);
            sb.append(":placeHolder=");
            sb.append(this.f);
            sb.append(":noFade=");
            sb.append(this.g);
            sb.append(":localOnly=");
            sb.append(this.h);
            sb.append(":imageSize=");
            sb.append(this.i);
            sb.append(":centerCrop=");
            sb.append(this.j);
            this.l = sb;
        }
        return this.l.toString();
    }

    @Override // com.bumptech.glide.load.c
    public final void a(MessageDigest messageDigest) throws UnsupportedEncodingException {
        byte[] array = ByteBuffer.allocate(8).putInt(this.b).putInt(this.c).array();
        messageDigest.update(this.a.getBytes("UTF-8"));
        messageDigest.update(array);
    }
}
