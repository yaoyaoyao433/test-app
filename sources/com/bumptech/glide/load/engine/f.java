package com.bumptech.glide.load.engine;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f implements com.bumptech.glide.load.c {
    final String a;
    private final int b;
    private final int c;
    private final com.bumptech.glide.load.e d;
    private final com.bumptech.glide.load.e e;
    private final com.bumptech.glide.load.g f;
    private final com.bumptech.glide.load.f g;
    private final com.bumptech.glide.load.resource.transcode.c h;
    private final com.bumptech.glide.load.b i;
    private final com.bumptech.glide.load.c j;
    private String k;
    private int l;
    private com.bumptech.glide.load.c m;

    public f(String str, com.bumptech.glide.load.c cVar, int i, int i2, com.bumptech.glide.load.e eVar, com.bumptech.glide.load.e eVar2, com.bumptech.glide.load.g gVar, com.bumptech.glide.load.f fVar, com.bumptech.glide.load.resource.transcode.c cVar2, com.bumptech.glide.load.b bVar) {
        this.a = str;
        this.j = cVar;
        this.b = i;
        this.c = i2;
        this.d = eVar;
        this.e = eVar2;
        this.f = gVar;
        this.g = fVar;
        this.h = cVar2;
        this.i = bVar;
    }

    public final com.bumptech.glide.load.c a() {
        if (this.m == null) {
            this.m = new k(this.a, this.j);
        }
        return this.m;
    }

    @Override // com.bumptech.glide.load.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.a.equals(fVar.a) && this.j.equals(fVar.j) && this.c == fVar.c && this.b == fVar.b) {
            if ((this.f == null) ^ (fVar.f == null)) {
                return false;
            }
            if (this.f == null || this.f.a().equals(fVar.f.a())) {
                if ((this.e == null) ^ (fVar.e == null)) {
                    return false;
                }
                if (this.e == null || this.e.a().equals(fVar.e.a())) {
                    if ((this.d == null) ^ (fVar.d == null)) {
                        return false;
                    }
                    if (this.d == null || this.d.a().equals(fVar.d.a())) {
                        if ((this.g == null) ^ (fVar.g == null)) {
                            return false;
                        }
                        if (this.g == null || this.g.a().equals(fVar.g.a())) {
                            if ((this.h == null) ^ (fVar.h == null)) {
                                return false;
                            }
                            if (this.h == null || this.h.a().equals(fVar.h.a())) {
                                if ((this.i == null) ^ (fVar.i == null)) {
                                    return false;
                                }
                                return this.i == null || this.i.a().equals(fVar.i.a());
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.c
    public final int hashCode() {
        if (this.l == 0) {
            this.l = this.a.hashCode();
            this.l = (this.l * 31) + this.j.hashCode();
            this.l = (this.l * 31) + this.b;
            this.l = (this.l * 31) + this.c;
            this.l = (this.l * 31) + (this.d != null ? this.d.a().hashCode() : 0);
            this.l = (this.l * 31) + (this.e != null ? this.e.a().hashCode() : 0);
            this.l = (this.l * 31) + (this.f != null ? this.f.a().hashCode() : 0);
            this.l = (this.l * 31) + (this.g != null ? this.g.a().hashCode() : 0);
            this.l = (this.l * 31) + (this.h != null ? this.h.a().hashCode() : 0);
            this.l = (this.l * 31) + (this.i != null ? this.i.a().hashCode() : 0);
        }
        return this.l;
    }

    public final String toString() {
        if (this.k == null) {
            StringBuilder sb = new StringBuilder("EngineKey{");
            sb.append(this.a);
            sb.append('+');
            sb.append(this.j);
            sb.append("+[");
            sb.append(this.b);
            sb.append('x');
            sb.append(this.c);
            sb.append("]+'");
            sb.append(this.d != null ? this.d.a() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            sb.append(this.e != null ? this.e.a() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            sb.append(this.f != null ? this.f.a() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            sb.append(this.g != null ? this.g.a() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            sb.append(this.h != null ? this.h.a() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            sb.append(this.i != null ? this.i.a() : "");
            sb.append('\'');
            sb.append('}');
            this.k = sb.toString();
        }
        return this.k;
    }

    @Override // com.bumptech.glide.load.c
    public final void a(MessageDigest messageDigest) throws UnsupportedEncodingException {
        byte[] array = ByteBuffer.allocate(8).putInt(this.b).putInt(this.c).array();
        this.j.a(messageDigest);
        messageDigest.update(this.a.getBytes("UTF-8"));
        messageDigest.update(array);
        messageDigest.update((this.d != null ? this.d.a() : "").getBytes("UTF-8"));
        messageDigest.update((this.e != null ? this.e.a() : "").getBytes("UTF-8"));
        messageDigest.update((this.f != null ? this.f.a() : "").getBytes("UTF-8"));
        messageDigest.update((this.g != null ? this.g.a() : "").getBytes("UTF-8"));
        messageDigest.update((this.i != null ? this.i.a() : "").getBytes("UTF-8"));
    }
}
