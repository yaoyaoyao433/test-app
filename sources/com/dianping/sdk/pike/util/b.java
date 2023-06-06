package com.dianping.sdk.pike.util;

import com.dianping.sdk.pike.i;
import com.dianping.sdk.pike.packet.af;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static byte[] a(af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6281a19200fe0198cdff609cee60b855", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6281a19200fe0198cdff609cee60b855");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(255);
            dataOutputStream.writeByte(afVar.b);
            dataOutputStream.writeByte(afVar.c);
            dataOutputStream.writeByte(0);
            dataOutputStream.write(a(Integer.valueOf(afVar.e).intValue()));
            byte[] bArr = afVar.h;
            int length = bArr != null ? bArr.length : 0;
            dataOutputStream.write(a(length));
            byte[] bArr2 = afVar.i;
            int length2 = bArr2 != null ? bArr2.length : 0;
            dataOutputStream.write(a(length2));
            if (length > 0) {
                dataOutputStream.write(bArr);
            }
            if (length2 > 0) {
                dataOutputStream.write(bArr2);
            }
            dataOutputStream.flush();
        } catch (Exception e) {
            i.a("BinaryProtocolUtils", "binary protocol encode error", e);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static af a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de2335177cc9febeb58df103fb4ebd33", RobustBitConfig.DEFAULT_VALUE)) {
            return (af) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de2335177cc9febeb58df103fb4ebd33");
        }
        if (bArr == null || bArr.length < 7) {
            return null;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            if (dataInputStream.readUnsignedByte() != 255) {
                throw new Exception();
            }
            dataInputStream.readUnsignedByte();
            int readUnsignedByte = dataInputStream.readUnsignedByte();
            dataInputStream.readUnsignedByte();
            int b = b(a(dataInputStream));
            int b2 = b(a(dataInputStream));
            int b3 = b(a(dataInputStream));
            int length = bArr.length - 7;
            if (b2 > length || b3 > length) {
                throw new Exception("decode length is invalid");
            }
            byte[] bArr2 = new byte[0];
            if (b2 > 0) {
                bArr2 = new byte[b2];
                dataInputStream.readFully(bArr2);
            }
            byte[] bArr3 = new byte[0];
            if (b3 > 0) {
                bArr3 = new byte[b3];
                dataInputStream.readFully(bArr3);
            }
            return new af(b, readUnsignedByte, bArr2, bArr3);
        } catch (Exception e) {
            i.a("BinaryProtocolUtils", "binary protocol decode error", e);
            return null;
        }
    }

    private static byte[] a(int i) throws Exception {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64ab97738959af225519b56eedc6d4df", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64ab97738959af225519b56eedc6d4df");
        }
        if (i < 0 || i > 268435455) {
            throw new Exception("variable length encode error");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        do {
            byte b = (byte) (i & 127);
            i >>>= 7;
            if (i != 0) {
                b = (byte) (b | 128);
            }
            byteArrayOutputStream.write(b);
        } while (i != 0);
        return byteArrayOutputStream.toByteArray();
    }

    private static int b(byte[] bArr) throws Exception {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "513107fdc1afc4373e0f57090860d7a1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "513107fdc1afc4373e0f57090860d7a1")).intValue();
        }
        if (bArr == null) {
            throw new Exception("encodedInfo is null");
        }
        int i = 0;
        int i2 = 1;
        for (byte b : bArr) {
            i += (b & Byte.MAX_VALUE) * i2;
            i2 *= 128;
            if (i2 > 268435456) {
                throw new Exception("variable length decode error");
            }
        }
        return i;
    }

    private static byte[] a(DataInputStream dataInputStream) throws Exception {
        byte readByte;
        Object[] objArr = {dataInputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ca49b6146f9fd3ec739f0e53046e144", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ca49b6146f9fd3ec739f0e53046e144");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        do {
            readByte = dataInputStream.readByte();
            byteArrayOutputStream.write(readByte);
            if (byteArrayOutputStream.size() > 4) {
                throw new Exception("prepare variable data error");
            }
        } while ((readByte & 128) != 0);
        return byteArrayOutputStream.toByteArray();
    }
}
