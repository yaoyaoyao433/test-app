package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.kv;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ky {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final kr<String, String> b = new kr<>(1000);
    private final kv.g<kv.i<MessageDigest>> c = kv.a(10, new kv.e<kv.i<MessageDigest>>() { // from class: com.tencent.mapsdk.internal.ky.1
        @Override // com.tencent.mapsdk.internal.kv.e
        public final /* synthetic */ kv.i<MessageDigest> a() {
            return b();
        }

        private static kv.i<MessageDigest> b() {
            try {
                return new kv.i<>(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    });

    public final String a(String str) {
        String b;
        synchronized (this.b) {
            b = this.b.b((kr<String, String>) str);
        }
        if (b == null) {
            kv.i<MessageDigest> a2 = this.c.a();
            try {
                a2.a.update(str.getBytes());
                byte[] digest = a2.a.digest();
                if (digest == null || digest.length == 0) {
                    b = null;
                } else {
                    char[] cArr = new char[digest.length * 2];
                    for (int i = 0; i < digest.length; i++) {
                        byte b2 = digest[i];
                        int i2 = i * 2;
                        cArr[i2 + 1] = a[b2 & 15];
                        cArr[i2 + 0] = a[((byte) (b2 >>> 4)) & 15];
                    }
                    b = new String(cArr);
                }
            } finally {
                this.c.a(a2);
            }
        }
        synchronized (this.b) {
            this.b.a((kr<String, String>) str, b);
        }
        return b;
    }

    private static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            cArr[i2 + 1] = a[b & 15];
            cArr[i2 + 0] = a[((byte) (b >>> 4)) & 15];
        }
        return new String(cArr);
    }
}
