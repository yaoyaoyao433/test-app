package com.sankuai.meituan.tte;

import com.ciphergateway.crypto.CGCipher;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface q {
    public static final byte[] a = "pangolin".getBytes();

    byte[] a(byte[] bArr, byte[] bArr2) throws com.sankuai.meituan.tte.c;

    byte[] b(byte[] bArr, byte[] bArr2) throws com.sankuai.meituan.tte.c;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static abstract class b implements q {
        public static ChangeQuickRedirect c;
        protected static final SecureRandom d = new SecureRandom();
        protected int e;
        protected int f;

        public abstract byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws Exception;

        public abstract byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) throws Exception;

        public b(int i, int i2) {
            Object[] objArr = {12, 16};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da530788f4939a102664ac945950d652", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da530788f4939a102664ac945950d652");
                return;
            }
            this.e = 12;
            this.f = 16;
        }

        @Override // com.sankuai.meituan.tte.q
        public final byte[] a(byte[] bArr, byte[] bArr2) throws com.sankuai.meituan.tte.c {
            byte[] bArr3;
            Object[] objArr = {bArr, bArr2};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb343d6b6391d70496fa0796192fbcb5", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb343d6b6391d70496fa0796192fbcb5");
            }
            try {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "24c69e1ac16f9cddb967057e05263611", RobustBitConfig.DEFAULT_VALUE)) {
                    bArr3 = (byte[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "24c69e1ac16f9cddb967057e05263611");
                } else {
                    bArr3 = new byte[this.e];
                    d.nextBytes(bArr3);
                }
                return y.a(bArr3, a(bArr, bArr2, bArr3, a));
            } catch (com.sankuai.meituan.tte.c e) {
                throw e;
            } catch (Throwable th) {
                throw new com.sankuai.meituan.tte.c("Encrypt exception", th, -10100);
            }
        }

        @Override // com.sankuai.meituan.tte.q
        public final byte[] b(byte[] bArr, byte[] bArr2) throws com.sankuai.meituan.tte.c {
            Object[] objArr = {bArr, bArr2};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "772762b62ee22d69db07a51c6381a661", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "772762b62ee22d69db07a51c6381a661");
            }
            if (bArr.length < this.e + this.f) {
                throw new com.sankuai.meituan.tte.c("Inner cipher msg too short: " + bArr.length, -10002);
            }
            byte[] bArr3 = new byte[this.e];
            byte[] bArr4 = new byte[(bArr.length - this.e) - this.f];
            byte[] bArr5 = new byte[this.f];
            ByteBuffer.wrap(bArr).get(bArr3).get(bArr4).get(bArr5);
            try {
                return a(bArr4, bArr2, bArr3, a, bArr5);
            } catch (com.sankuai.meituan.tte.c e) {
                throw e;
            } catch (Throwable th) {
                throw new com.sankuai.meituan.tte.c("Decrypt exception", th, -10100);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c extends b {
        public static ChangeQuickRedirect b;
        public static volatile c g;
        private final CGCipher h;

        public static c a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a1e0b69807c470afa2ce2cf136a52fc", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a1e0b69807c470afa2ce2cf136a52fc");
            }
            if (g == null) {
                synchronized (c.class) {
                    if (g == null) {
                        g = new c();
                    }
                }
            }
            return g;
        }

        public c() {
            super(12, 16);
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cfeb69e116e45b59dc3a8566ef0a7d7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cfeb69e116e45b59dc3a8566ef0a7d7");
                return;
            }
            CGCipher cGCipher = null;
            try {
                cGCipher = com.sankuai.meituan.tte.a.a("SM4", "GCM");
            } catch (Throwable th) {
                u.b("CGCipher", "load error", th);
            }
            this.h = cGCipher;
        }

        @Override // com.sankuai.meituan.tte.q.b
        public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws Exception {
            Object[] objArr = {bArr, bArr2, bArr3, bArr4};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88213f6b8f8af45028b6ca593515bd52", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88213f6b8f8af45028b6ca593515bd52");
            }
            if (this.h == null) {
                throw new com.sankuai.meituan.tte.c("CGCipher init error", -10102);
            }
            return this.h.a(bArr, bArr2, bArr3, bArr4);
        }

        @Override // com.sankuai.meituan.tte.q.b
        public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) throws Exception {
            Object[] objArr = {bArr, bArr2, bArr3, bArr4, bArr5};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25daeaf3a70271fac54a8ee68690a090", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25daeaf3a70271fac54a8ee68690a090");
            }
            if (this.h == null) {
                throw new com.sankuai.meituan.tte.c("CGCipher init error", -10102);
            }
            return this.h.a(bArr, bArr2, bArr3, bArr4, bArr5);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends b {
        public static ChangeQuickRedirect b;

        public a() {
            super(12, 16);
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32407751f98e6a50c0b39874e9712a55", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32407751f98e6a50c0b39874e9712a55");
            }
        }

        @Override // com.sankuai.meituan.tte.q.b
        public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws Exception {
            Object[] objArr = {bArr, bArr2, bArr3, bArr4};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0a071de2039ec0d28e070660b35f3a5", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0a071de2039ec0d28e070660b35f3a5");
            }
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, new SecretKeySpec(bArr2, "AES"), new GCMParameterSpec(this.f << 3, bArr3));
            cipher.updateAAD(bArr4);
            return cipher.doFinal(bArr);
        }

        @Override // com.sankuai.meituan.tte.q.b
        public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) throws Exception {
            Object[] objArr = {bArr, bArr2, bArr3, bArr4, bArr5};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0841a8e863574c26bd5447a2f5031d3", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0841a8e863574c26bd5447a2f5031d3");
            }
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, new SecretKeySpec(bArr2, "AES"), new GCMParameterSpec(this.f << 3, bArr3));
            cipher.updateAAD(bArr4);
            return cipher.doFinal(y.a(bArr, bArr5));
        }
    }
}
