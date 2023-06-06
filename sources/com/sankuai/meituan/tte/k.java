package com.sankuai.meituan.tte;

import com.ciphergateway.crypto.CGCipher;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.tte.i;
import com.sankuai.meituan.tte.q;
import com.sankuai.meituan.tte.x;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k implements i {
    public static ChangeQuickRedirect a;
    private static final byte[] b;
    private static final byte[] c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final byte[] g;
    private final byte[] h;
    private final byte[] i;

    @Override // com.sankuai.meituan.tte.i
    public final String a() {
        return "SM2";
    }

    @Override // com.sankuai.meituan.tte.i
    public final /* synthetic */ i.a b() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "671a568c93f750522ec2513fff6c9b0a", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "671a568c93f750522ec2513fff6c9b0a") : new a(com.sankuai.meituan.tte.a.a("SM2", ""));
    }

    static {
        byte[] bArr = {49, 50, 51, 52, 53, 54, 55, 56, 49, 50, 51, 52, 53, 54, 55, 56};
        b = bArr;
        c = bArr;
    }

    public static k a(x.d dVar) {
        byte[] a2;
        byte[] a3;
        byte[] a4;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a09d01a13f493fe2346d5064acd9cf9", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a09d01a13f493fe2346d5064acd9cf9");
        }
        if (x.d.PROD == dVar) {
            a2 = y.a("Vo2PXgevCSjbZt+lt5kAiO+Yf5xl3xFBqu4LjVpdU30=");
            a3 = y.a("gmCc2W7ZAnk0sPsgzAUhbuczZflR0kidFdjgXMv2FB1kpCM8N+zXiBf0WemOaZJBQ3HfC2yQq9bToCi8fMn1+Q==");
            a4 = y.a("vZVoJaokUS2mL/5aqVz5vN77i+Xycp4ThxPk4iDXr0GzN/7FFPvthZvPb1fxREbU2wQoHZqKRate2D5rZ+XLbg==");
        } else {
            a2 = y.a("LkfLmiEhx4HKsnBAb+W9gn8+wHJmQ05YU8z9ZnkEkd0=");
            a3 = y.a("xoqnbVndP/Bz39cLlu/UFD6kCfD2wGaf01eO3tcQjGd+kikOnuhUoXD0ZGihIIH7xglMtddf7Clav+popYNLeA==");
            a4 = y.a("asMkJUzTQXqSSSzk0vmmQjKCX1FRdY2m5+Ux8af73QJ4mCDM1pr3tU25IesJhjmB0rhh4lvdhVFE8glIDaKyIA==");
        }
        byte[] bArr = a4;
        return new k(b, c, a2, a3, bArr, bArr);
    }

    private k(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        Object[] objArr = {bArr, bArr2, bArr3, bArr4, bArr5, bArr6};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91655b84cbe65f3196564e7902a3f8d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91655b84cbe65f3196564e7902a3f8d7");
            return;
        }
        this.d = bArr;
        this.e = bArr2;
        this.f = bArr3;
        this.g = bArr4;
        this.h = bArr5;
        this.i = bArr6;
    }

    @Override // com.sankuai.meituan.tte.i
    public final boolean a(byte[] bArr, byte[] bArr2) throws Exception {
        Object[] objArr = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e323f9da14edeedefe887d60bd584383", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e323f9da14edeedefe887d60bd584383")).booleanValue() : com.sankuai.meituan.tte.a.a(bArr, bArr2, this.i);
    }

    @Override // com.sankuai.meituan.tte.i
    public final byte[] b(byte[] bArr, byte[] bArr2) throws Exception {
        Object[] objArr = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1de8d03b3e2b60b1108326f464586235", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1de8d03b3e2b60b1108326f464586235") : q.c.a().b(bArr, bArr2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a implements i.a {
        public static ChangeQuickRedirect a;
        private final CGCipher c;
        private byte[] d;
        private final byte[] e;
        private final byte[] f;

        public a(CGCipher cGCipher) throws Exception {
            Object[] objArr = {k.this, cGCipher};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18e7d4214a0b789265212b60c3b67602", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18e7d4214a0b789265212b60c3b67602");
                return;
            }
            this.c = cGCipher;
            try {
                this.d = cGCipher.a(1, k.this.d, k.this.g, k.this.f);
                byte[] a2 = cGCipher.a();
                this.e = Arrays.copyOfRange(a2, 0, 64);
                this.f = Arrays.copyOfRange(a2, 64, a2.length);
            } catch (Error e) {
                throw new Exception("sm2 key exchange init error", e);
            }
        }

        @Override // com.sankuai.meituan.tte.i.a
        public final byte[] a() {
            return this.e;
        }

        @Override // com.sankuai.meituan.tte.i.a
        public final byte[] a(byte[] bArr) throws IllegalStateException {
            Object[] objArr = {bArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca523e103cd08fadb5325e8b4ffed785", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca523e103cd08fadb5325e8b4ffed785");
            }
            try {
                byte[] a2 = this.c.a(this.d, this.f, this.e, 16, k.this.e, k.this.h, bArr);
                return Arrays.copyOfRange(a2, 32, a2.length);
            } catch (Throwable th) {
                throw new IllegalStateException("sm2 key agreement error", th);
            }
        }

        @Override // java.lang.AutoCloseable
        public final void close() throws Exception {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ee12f04cfe5bcda0af5de924f6fff4b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ee12f04cfe5bcda0af5de924f6fff4b");
            } else if (this.d != null) {
                try {
                    this.c.a(this.d);
                    this.d = null;
                } catch (Error e) {
                    throw new Exception("cgcipher free ctx error", e);
                }
            }
        }
    }
}
