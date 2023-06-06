package com.dianping.dataservice.mapi.impl;

import android.support.v4.internal.view.SupportMenu;
import com.dianping.archive.DPObject;
import com.dianping.dataservice.mapi.j;
import com.dianping.util.NativeHelper;
import com.dianping.util.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.export.external.interfaces.ISelectionInterface;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.GZIPInputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final String b = "AES/CBC/NoPadding";
    private static final byte[] c;
    private static final byte[] d;

    static {
        byte[] bArr = {92, 115, 116, 117, 112, 113, 6, 112, 112, 3, 3, 4, 6, 118, 0, 112};
        byte b2 = 24;
        for (int i = 0; i < 16; i++) {
            b2 = (byte) (b2 ^ (bArr[i] & 255));
            bArr[i] = b2;
        }
        c = bArr;
        byte[] bArr2 = {0, 118, 122, 10, 3, 116, 124, 10, 5, 117, 6, 5, 3, 4, 2, 37};
        byte b3 = 97;
        for (int i2 = 15; i2 >= 0; i2--) {
            b3 = (byte) (b3 ^ (bArr2[i2] & 255));
            bArr2[i2] = b3;
        }
        d = bArr2;
    }

    public static byte[] a(byte[] bArr) throws Exception {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        byte[] bArr2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f62bdd7e38f0b23a655a7b2815f367ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f62bdd7e38f0b23a655a7b2815f367ce");
        }
        if (bArr.length % 16 == 0 && NativeHelper.a) {
            bArr2 = NativeHelper.ndug(bArr, c, d);
        }
        if (bArr2 != null) {
            return bArr2;
        }
        Cipher cipher = Cipher.getInstance(b);
        cipher.init(2, new SecretKeySpec(c, b.substring(0, 3)), new IvParameterSpec(d));
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(cipher.doFinal(bArr)));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] bArr3 = new byte[4096];
        while (true) {
            int read = gZIPInputStream.read(bArr3);
            if (read > 0) {
                byteArrayOutputStream.write(bArr3, 0, read);
            } else {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static InputStream a(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bdf37c6159e1ea57e284aa6cfac1ac35", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bdf37c6159e1ea57e284aa6cfac1ac35");
        }
        if ((inputStream instanceof com.dianping.dataservice.mapi.d) || (inputStream instanceof j)) {
            return new a((k) inputStream);
        }
        if (inputStream instanceof com.dianping.util.b) {
            InputStream[] a2 = ((com.dianping.util.b) inputStream).a();
            InputStream[] inputStreamArr = new InputStream[a2.length];
            for (int i = 0; i < a2.length; i++) {
                if (a2[i] instanceof com.dianping.dataservice.mapi.d) {
                    inputStreamArr[i] = new a((com.dianping.dataservice.mapi.d) a2[i]);
                } else {
                    inputStreamArr[i] = a2[i];
                }
            }
            return new com.dianping.util.b(inputStreamArr);
        }
        return inputStream;
    }

    public static Object b(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b709673bf469bf71309ae4c47b5d7c3", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b709673bf469bf71309ae4c47b5d7c3");
        }
        if (bArr.length > 0 && bArr[0] == 65) {
            return DPObject.b(bArr, 0, bArr.length);
        }
        if (bArr.length > 0 && bArr[0] == 83) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr, 1, bArr.length - 1);
            wrap.order(ByteOrder.BIG_ENDIAN);
            return new String(bArr, 3, wrap.getShort() & ISelectionInterface.HELD_NOTHING);
        } else if (bArr.length > 0 && bArr[0] == 66) {
            ByteBuffer wrap2 = ByteBuffer.wrap(bArr, 1, bArr.length - 1);
            wrap2.order(ByteOrder.BIG_ENDIAN);
            return new String(bArr, 5, wrap2.getInt() & SupportMenu.USER_MASK);
        } else {
            return DPObject.a(bArr, 0, bArr.length);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a extends k {
        public static ChangeQuickRedirect a;
        private k b;

        public a(k kVar) {
            Object[] objArr = {kVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "610ca6945e767087d90138de04656a61", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "610ca6945e767087d90138de04656a61");
            } else {
                this.b = kVar;
            }
        }

        @Override // com.dianping.util.k
        public final InputStream a() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01e3ffa2455d502ad05875ba83281216", RobustBitConfig.DEFAULT_VALUE)) {
                return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01e3ffa2455d502ad05875ba83281216");
            }
            this.b.reset();
            int available = this.b.available();
            int i = available % 16;
            byte[] bArr = new byte[i == 0 ? available : (16 - i) + available];
            int i2 = 0;
            while (true) {
                int read = this.b.read(bArr, i2, available - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            }
            byte[] bArr2 = null;
            if (NativeHelper.a) {
                byte[] bArr3 = new byte[bArr.length];
                if (NativeHelper.ne(bArr, bArr3, e.c, e.d)) {
                    bArr2 = bArr3;
                }
            }
            if (bArr2 == null) {
                SecretKeySpec secretKeySpec = new SecretKeySpec(e.c, e.b.substring(0, 3));
                IvParameterSpec ivParameterSpec = new IvParameterSpec(e.d);
                try {
                    Cipher cipher = Cipher.getInstance(e.b);
                    cipher.init(1, secretKeySpec, ivParameterSpec);
                    bArr2 = cipher.doFinal(bArr);
                } catch (Exception unused) {
                    throw new IOException();
                }
            }
            return new ByteArrayInputStream(bArr2);
        }
    }
}
