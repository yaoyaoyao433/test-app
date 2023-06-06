package com.bumptech.glide.signature;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements com.bumptech.glide.load.c {
    private final String a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("Signature cannot be null!");
        }
        this.a = str;
    }

    @Override // com.bumptech.glide.load.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((c) obj).a);
    }

    @Override // com.bumptech.glide.load.c
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.bumptech.glide.load.c
    public final void a(MessageDigest messageDigest) throws UnsupportedEncodingException {
        messageDigest.update(this.a.getBytes("UTF-8"));
    }

    public final String toString() {
        return "StringSignature{signature='" + this.a + "'}";
    }
}
