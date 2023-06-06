package com.sankuai.meituan.tte;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.tte.i;
import com.sankuai.meituan.tte.x;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j implements i {
    public static ChangeQuickRedirect a;
    private final byte[] b;

    @Override // com.sankuai.meituan.tte.i
    public final String a() {
        return "ECDH";
    }

    @Override // com.sankuai.meituan.tte.i
    public final /* synthetic */ i.a b() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2bad8b88afac2fd57faff4285014456", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2bad8b88afac2fd57faff4285014456") : new a();
    }

    public j(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a999fa1717dcc7f404903e9adef2fdd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a999fa1717dcc7f404903e9adef2fdd");
        } else {
            this.b = bArr;
        }
    }

    @Override // com.sankuai.meituan.tte.i
    public final boolean a(byte[] bArr, byte[] bArr2) throws Exception {
        PublicKey a2;
        Object[] objArr = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcec37c94563fcc434b539bb10ad5e4b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcec37c94563fcc434b539bb10ad5e4b")).booleanValue();
        }
        byte[] bArr3 = this.b;
        Object[] objArr2 = {bArr3, "secp256r1"};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "aebddd31334f20858f7563ffc9ac18cb", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (PublicKey) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "aebddd31334f20858f7563ffc9ac18cb");
        } else {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
            a2 = f.a(bArr3, ((ECPublicKey) keyPairGenerator.generateKeyPair().getPublic()).getParams());
        }
        Signature signature = Signature.getInstance("SHA256withECDSA");
        signature.initVerify(a2);
        signature.update(bArr);
        return signature.verify(bArr2);
    }

    @Override // com.sankuai.meituan.tte.i
    public final byte[] b(byte[] bArr, byte[] bArr2) throws Exception {
        Object[] objArr = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f35209350f5db4a748bf37c034fb165", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f35209350f5db4a748bf37c034fb165") : x.c.AES_GCM.a().b(bArr, bArr2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a implements i.a {
        public static ChangeQuickRedirect a;
        private final KeyPair c;

        @Override // java.lang.AutoCloseable
        public final void close() throws Exception {
        }

        public a() throws GeneralSecurityException {
            Object[] objArr = {j.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff53828266092ca929554f71b71a00b7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff53828266092ca929554f71b71a00b7");
                return;
            }
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
            this.c = keyPairGenerator.generateKeyPair();
        }

        @Override // com.sankuai.meituan.tte.i.a
        public final byte[] a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10ef2f6676ce269ea7b88cf57869b940", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10ef2f6676ce269ea7b88cf57869b940");
            }
            ECPublicKey eCPublicKey = (ECPublicKey) this.c.getPublic();
            Object[] objArr2 = {eCPublicKey};
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3fa7154efbe6bc74f1fe8d5b71db2029", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3fa7154efbe6bc74f1fe8d5b71db2029");
            }
            ECPoint w = eCPublicKey.getW();
            EllipticCurve curve = eCPublicKey.getParams().getCurve();
            Object[] objArr3 = {w, curve};
            ChangeQuickRedirect changeQuickRedirect3 = f.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6d233c6c5c836373d23c3810cbf38fbf", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6d233c6c5c836373d23c3810cbf38fbf");
            }
            int fieldSize = (curve.getField().getFieldSize() + 7) >> 3;
            byte[] a2 = f.a(w.getAffineX().toByteArray());
            byte[] a3 = f.a(w.getAffineY().toByteArray());
            if (a2.length > fieldSize || a3.length > fieldSize) {
                throw new RuntimeException("Point coordinates do not match field size");
            }
            byte[] bArr = new byte[(fieldSize << 1) + 1];
            bArr[0] = 4;
            System.arraycopy(a2, 0, bArr, (fieldSize - a2.length) + 1, a2.length);
            System.arraycopy(a3, 0, bArr, bArr.length - a3.length, a3.length);
            return bArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00d0 A[Catch: Throwable -> 0x00e7, LOOP:0: B:19:0x00be->B:21:0x00d0, LOOP_END, TryCatch #0 {Throwable -> 0x00e7, blocks: (B:6:0x0023, B:8:0x007d, B:10:0x0084, B:13:0x0092, B:16:0x0096, B:18:0x00ad, B:19:0x00be, B:21:0x00d0, B:22:0x00d9, B:17:0x009f, B:24:0x00de, B:25:0x00e6), top: B:29:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00d9 A[SYNTHETIC] */
        @Override // com.sankuai.meituan.tte.i.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final byte[] a(byte[] r20) throws java.lang.IllegalStateException {
            /*
                Method dump skipped, instructions count: 240
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.tte.j.a.a(byte[]):byte[]");
        }
    }
}
