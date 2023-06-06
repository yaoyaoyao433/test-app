package com.bumptech.glide.load.engine;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k implements com.bumptech.glide.load.c {
    private final String a;
    private final com.bumptech.glide.load.c b;

    public k(String str, com.bumptech.glide.load.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    @Override // com.bumptech.glide.load.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.a.equals(kVar.a) && this.b.equals(kVar.b);
    }

    @Override // com.bumptech.glide.load.c
    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // com.bumptech.glide.load.c
    public final void a(MessageDigest messageDigest) throws UnsupportedEncodingException {
        messageDigest.update(this.a.getBytes("UTF-8"));
        this.b.a(messageDigest);
    }
}
