package com.ciphergateway.crypto;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class CGCipher {
    private static boolean a = false;

    private static native byte[] GenRandom(int i);

    public static native String GetVersion();

    public int a(byte[] bArr) {
        return 0;
    }

    public int a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return 0;
    }

    public byte[] a() {
        return null;
    }

    public byte[] a(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return null;
    }

    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        return null;
    }

    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        return null;
    }

    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return null;
    }

    public static CGCipher a(String str, String str2) {
        if (!a) {
            synchronized (CGCipher.class) {
                if (!a) {
                    try {
                        if (b.a()) {
                            if (Integer.parseInt(System.getProperty("sun.arch.data.model")) == 64) {
                                b.a("/com/ciphergateway/crypto/resources/windows/libCGCipherSDK_x64.dll");
                            } else {
                                b.a("/com/ciphergateway/crypto/resources/windows/libCGCipherSDK_x86.dll");
                            }
                        } else if (b.b()) {
                            System.loadLibrary("CGCipherSDK");
                        } else if (b.c()) {
                            b.a("/com/ciphergateway/crypto/resources/linux/libCGCipherSDK_arm.so");
                        } else if (b.e()) {
                            b.a("/com/ciphergateway/crypto/resources/mac/libCGCipherSDK.dylib");
                        } else if (b.d()) {
                            b.a("/com/ciphergateway/crypto/resources/linux/libCGCipherSDK_x86.so");
                        } else {
                            throw a.c("The current system does not support!!!");
                        }
                        a = true;
                    } catch (Exception e) {
                        throw a.c(String.format("Load library faild <%s>!!!", e.getMessage()));
                    }
                }
            }
        }
        if (str.equalsIgnoreCase("sm2")) {
            return new CGCipherSM2();
        }
        if (str.equalsIgnoreCase("sm3")) {
            return new CGCipherSM3();
        }
        if (str.equalsIgnoreCase("sm4")) {
            return new CGCipherSM4(str2);
        }
        throw a.b("please input sm2||sm3||sm4");
    }
}
