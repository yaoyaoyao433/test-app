package com.ciphergateway.crypto;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CGCipherSM3 extends CGCipher {
    private native byte[] SM3_digest(byte[] bArr);

    private native byte[] SM3_hkdf(byte[] bArr, byte[] bArr2, int i);

    private native byte[] SM3_hmac(byte[] bArr, byte[] bArr2);
}
