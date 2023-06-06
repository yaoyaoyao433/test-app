package com.ciphergateway.crypto;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CGCipherSM2 extends CGCipher {
    private native byte[] SM2_decrypt(byte[] bArr, byte[] bArr2);

    private native byte[] SM2_encrypt(byte[] bArr, byte[] bArr2);

    private native int SM2_exchg_check_hash(byte[] bArr, byte[] bArr2);

    private native int SM2_exchg_ctx_free(byte[] bArr);

    private native byte[] SM2_exchg_ctx_init(int i, byte[] bArr, byte[] bArr2, byte[] bArr3);

    private native byte[] SM2_exchg_exchange(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte[] bArr5, byte[] bArr6);

    private native byte[] SM2_genkey();

    private native byte[] SM2_sign(byte[] bArr, byte[] bArr2, byte[] bArr3);

    private native int SM2_verify(byte[] bArr, byte[] bArr2, byte[] bArr3);

    @Override // com.ciphergateway.crypto.CGCipher
    public final byte[] a() {
        return SM2_genkey();
    }

    @Override // com.ciphergateway.crypto.CGCipher
    public final int a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr3 == null || bArr3.length != 64) {
            throw a.a("sm2 pubkey input error");
        }
        if (bArr == null || bArr.length == 0) {
            throw a.a("sm2 plain input error");
        }
        if (bArr2 == null || bArr2.length != 64) {
            throw a.a("sm2 signValue input error");
        }
        return SM2_verify(bArr, bArr2, bArr3);
    }

    @Override // com.ciphergateway.crypto.CGCipher
    public final byte[] a(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr2 == null || bArr2.length != 64) {
            throw a.a("sm2 SelfPubkey input error");
        }
        if (bArr3 == null || bArr3.length != 32) {
            throw a.a("sm2 SelfPrikey input error");
        }
        return SM2_exchg_ctx_init(1, bArr, bArr2, bArr3);
    }

    @Override // com.ciphergateway.crypto.CGCipher
    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        if (bArr == null || bArr.length != 8) {
            throw a.a("sm2 ctx input error");
        }
        if (bArr2 == null || bArr2.length != 32) {
            throw a.a("sm2 SelfTempPrikey input error");
        }
        if (bArr3 == null || bArr3.length != 64) {
            throw a.a("sm2 SelfPubkey input error");
        }
        if (bArr5 == null || bArr5.length != 64) {
            throw a.a("sm2 OtherPubkey input error");
        }
        if (bArr6 == null || bArr6.length != 64) {
            throw a.a("sm2 OtherTempPubkey input error");
        }
        return SM2_exchg_exchange(bArr, bArr2, bArr3, 16, bArr4, bArr5, bArr6);
    }

    @Override // com.ciphergateway.crypto.CGCipher
    public final int a(byte[] bArr) {
        if (bArr == null || bArr.length != 8) {
            throw a.a("sm2 ctx input error");
        }
        return SM2_exchg_ctx_free(bArr);
    }
}
