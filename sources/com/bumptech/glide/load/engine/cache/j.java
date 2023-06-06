package com.bumptech.glide.load.engine.cache;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j {
    private final com.bumptech.glide.util.e<com.bumptech.glide.load.c, String> a = new com.bumptech.glide.util.e<>(1000);

    public final String a(com.bumptech.glide.load.c cVar) {
        String b;
        synchronized (this.a) {
            b = this.a.b((com.bumptech.glide.util.e<com.bumptech.glide.load.c, String>) cVar);
        }
        if (b == null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                cVar.a(messageDigest);
                b = com.bumptech.glide.util.h.a(messageDigest.digest());
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e2) {
                e2.printStackTrace();
            }
            synchronized (this.a) {
                this.a.b(cVar, b);
            }
        }
        return b;
    }
}
