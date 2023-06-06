package com.ciphergateway.crypto;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CGCipherSM4 extends CGCipher {
    private String a;

    private native byte[] SM4_GCMCCM_Decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5);

    private native byte[] SM4_GCMCCM_Encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    private native byte[] SM4_decrypt(int i, String str, byte[] bArr, byte[] bArr2, byte[] bArr3);

    private native byte[] SM4_encrypt(int i, String str, byte[] bArr, byte[] bArr2, byte[] bArr3);

    public CGCipherSM4(String str) {
        if (!str.equalsIgnoreCase("ecb") && !str.equalsIgnoreCase("cbc") && !str.equalsIgnoreCase("ctr") && !str.equalsIgnoreCase("gcm")) {
            throw a.b("sm4 algType input error, please input ecb||cbc||ctr||gcm");
        }
        this.a = str;
    }

    @Override // com.ciphergateway.crypto.CGCipher
    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr == null || bArr.length == 0) {
            throw a.a("sm4 plain input error");
        }
        if (bArr2 == null || bArr2.length != 16) {
            throw a.a("sm4 key input error");
        }
        if (bArr3 == null || bArr3.length == 0) {
            throw a.a("sm4 iv input error");
        }
        return SM4_GCMCCM_Encrypt(bArr, bArr2, bArr3, bArr4);
    }

    @Override // com.ciphergateway.crypto.CGCipher
    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        if (bArr == null || bArr.length == 0) {
            throw a.a("sm4 plain input error");
        }
        if (bArr2 == null || bArr2.length != 16) {
            throw a.a("sm4 key input error");
        }
        if (bArr3 == null || bArr3.length == 0) {
            throw a.a("sm4 iv input error");
        }
        if (bArr5 == null || bArr5.length == 0) {
            throw a.a("sm4 tag input error");
        }
        return SM4_GCMCCM_Decrypt(bArr, bArr2, bArr3, bArr4, bArr5);
    }
}
