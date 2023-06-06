package com.sankuai.xm.protobase.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements b<com.sankuai.xm.login.net.mempool.heap.b> {
    public static ChangeQuickRedirect a;
    private int b;
    private byte[] c;
    private final boolean d;

    @Override // com.sankuai.xm.protobase.utils.b
    public final /* synthetic */ com.sankuai.xm.login.net.mempool.heap.b a(com.sankuai.xm.login.net.mempool.heap.b bVar) {
        com.sankuai.xm.login.net.mempool.heap.b bVar2 = bVar;
        Object[] objArr = {bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70eb96da6e0b7fa319b7dcefd5c83ad5", 6917529027641081856L)) {
            return (com.sankuai.xm.login.net.mempool.heap.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70eb96da6e0b7fa319b7dcefd5c83ad5");
        }
        if (bVar2 == null || bVar2.g() < 24) {
            return bVar2;
        }
        byte[] bArr = new byte[bVar2.g()];
        bVar2.a(bArr);
        bVar2.a(0);
        bVar2.b(bArr.length);
        byte[] c = c(bArr);
        if (c != null && c.length > 0) {
            bVar2.a(c, 0, c.length);
            bVar2.f();
        }
        return bVar2;
    }

    public a() {
        this(false);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "457c28dc9e152bac0f6b93c7b68cd00a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "457c28dc9e152bac0f6b93c7b68cd00a");
        }
    }

    public a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90b08de59dc1593181b621a3bbd664fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90b08de59dc1593181b621a3bbd664fd");
        } else {
            this.d = z;
        }
    }

    @Override // com.sankuai.xm.protobase.utils.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08a0cad08af17cc73b2618fdaa73c5c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08a0cad08af17cc73b2618fdaa73c5c7");
            return;
        }
        this.c = bArr;
        synchronized (this) {
            this.b = 0;
        }
    }

    @Override // com.sankuai.xm.protobase.utils.b
    public final byte[] b(byte[] bArr) {
        byte[] bArr2;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1115b398502eb145a2190501080a5748", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1115b398502eb145a2190501080a5748");
        }
        if (bArr == null || bArr.length < 24) {
            return bArr;
        }
        try {
            int i = this.d ? 16 : 0;
            byte[] bArr3 = new byte[bArr.length + i];
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.c, "AES");
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            if (i > 0) {
                bArr2 = new byte[16];
                new SecureRandom().nextBytes(bArr2);
            } else {
                bArr2 = new byte[cipher.getBlockSize()];
            }
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
            byte[] doFinal = cipher.doFinal(bArr, 24, bArr.length - 24);
            System.arraycopy(bArr, 0, bArr3, 0, 24);
            if (i > 0) {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.position(0);
                allocate.put(bArr3, 0, 4);
                allocate.flip();
                int i2 = allocate.getInt();
                allocate.flip();
                allocate.putInt(i2 + 16);
                allocate.flip();
                byte[] bArr4 = new byte[4];
                allocate.get(bArr4);
                System.arraycopy(bArr4, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, 0, bArr3, 24, 16);
            }
            System.arraycopy(doFinal, 0, bArr3, i + 24, doFinal.length);
            return bArr3;
        } catch (Exception e) {
            com.sankuai.xm.log.a.a(e);
            return bArr;
        }
    }

    @Override // com.sankuai.xm.protobase.utils.b
    public final synchronized boolean b() {
        return this.b >= 3;
    }

    @Override // com.sankuai.xm.protobase.utils.b
    public final byte[] c(byte[] bArr) {
        int i;
        byte[] bArr2;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "308fe3d2cc7aa05413a4eab7a3e10682", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "308fe3d2cc7aa05413a4eab7a3e10682");
        }
        int i2 = this.d ? 16 : 0;
        if (bArr == null || bArr.length < (i = i2 + 24)) {
            return bArr;
        }
        try {
            byte[] bArr3 = new byte[bArr.length - i2];
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.c, "AES");
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            if (i2 > 0) {
                bArr2 = new byte[16];
                System.arraycopy(bArr, 24, bArr2, 0, 16);
            } else {
                bArr2 = new byte[cipher.getBlockSize()];
            }
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr2));
            byte[] doFinal = cipher.doFinal(bArr, i, (bArr.length - 24) - i2);
            System.arraycopy(bArr, 0, bArr3, 0, 24);
            if (i2 > 0) {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.position(0);
                allocate.put(bArr3, 0, 4);
                allocate.flip();
                int i3 = allocate.getInt();
                allocate.flip();
                allocate.putInt(i3 - 16);
                allocate.flip();
                byte[] bArr4 = new byte[4];
                allocate.get(bArr4);
                System.arraycopy(bArr4, 0, bArr3, 0, 4);
            }
            System.arraycopy(doFinal, 0, bArr3, 24, doFinal.length);
            synchronized (this) {
                this.b = 0;
            }
            return bArr3;
        } catch (Exception e) {
            com.sankuai.xm.login.d.a(e);
            synchronized (this) {
                this.b++;
                return bArr;
            }
        }
    }
}
