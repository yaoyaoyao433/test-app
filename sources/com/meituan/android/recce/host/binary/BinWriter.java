package com.meituan.android.recce.host.binary;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class BinWriter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ByteBuffer byteBuffer;

    public BinWriter(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e770ced82e350ce3b3420d5ce10f0f85", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e770ced82e350ce3b3420d5ce10f0f85");
        } else {
            this.byteBuffer = ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public BinWriter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e69ee911abb9367e0cd71bf3adda63e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e69ee911abb9367e0cd71bf3adda63e6");
        } else {
            this.byteBuffer = ByteBuffer.allocate(128).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public final int size() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d746af89a1713043927ced99e042e4d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d746af89a1713043927ced99e042e4d")).intValue() : this.byteBuffer.position();
    }

    public final byte[] asBytes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd697ae93173071fafe49a3b3abb82f7", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd697ae93173071fafe49a3b3abb82f7") : this.byteBuffer.array();
    }

    private void grow(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9358d68f2c07faf271806244db450533", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9358d68f2c07faf271806244db450533");
        } else if (this.byteBuffer.remaining() > i) {
        } else {
            ByteBuffer byteBuffer = this.byteBuffer;
            this.byteBuffer = ByteBuffer.allocate((byteBuffer.capacity() + i) * 2).order(ByteOrder.LITTLE_ENDIAN);
            this.byteBuffer.put(byteBuffer.array());
            this.byteBuffer.position(byteBuffer.position());
        }
    }

    public final void putByte(byte b) {
        Object[] objArr = {Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "233541d1b14095d022b7651031a129b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "233541d1b14095d022b7651031a129b2");
            return;
        }
        grow(1);
        this.byteBuffer.put(b);
    }

    public final void putShort(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fac7286e5ca1ecb1911bfb09e24af13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fac7286e5ca1ecb1911bfb09e24af13");
            return;
        }
        grow(2);
        this.byteBuffer.putShort(s);
    }

    public final void putInt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2053836d31f25d6d0f08a888a76194d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2053836d31f25d6d0f08a888a76194d8");
            return;
        }
        grow(4);
        this.byteBuffer.putInt(i);
    }

    public final void putLong(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f114152fa8e8ace2ee8a1bca7d96157e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f114152fa8e8ace2ee8a1bca7d96157e");
            return;
        }
        grow(8);
        this.byteBuffer.putLong(j);
    }

    public final void putBool(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93fdbbd2ae55b9dc25437911fa144925", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93fdbbd2ae55b9dc25437911fa144925");
            return;
        }
        grow(1);
        this.byteBuffer.put(z ? (byte) 1 : (byte) 0);
    }

    public final void putFloat(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26775d7c0e837d01b515e1a960c8ebc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26775d7c0e837d01b515e1a960c8ebc5");
            return;
        }
        grow(4);
        this.byteBuffer.putFloat(f);
    }

    public final void putDouble(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2abe2d0ab8c568dc6c1cddc61c59eb5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2abe2d0ab8c568dc6c1cddc61c59eb5c");
            return;
        }
        grow(8);
        this.byteBuffer.putDouble(d);
    }

    public final void putIntSignedLeb128(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53679f419a1cb8e7d3ba0557c4d22585", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53679f419a1cb8e7d3ba0557c4d22585");
            return;
        }
        grow(5);
        int i2 = i >> 7;
        int i3 = (Integer.MIN_VALUE & i) == 0 ? 0 : -1;
        int i4 = i;
        boolean z = true;
        while (z) {
            z = (i2 == i3 && (i2 & 1) == ((i4 >> 6) & 1)) ? false : true;
            putByte((byte) ((i4 & 127) | (z ? 128 : 0)));
            i4 = i2;
            i2 >>= 7;
        }
    }

    public final void putLongSignedLeb128(long j) {
        long j2 = j;
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc620ead6f6fc78e0a4d0835bd9f838c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc620ead6f6fc78e0a4d0835bd9f838c");
            return;
        }
        grow(10);
        long j3 = j2 >> 7;
        int i = (Long.MIN_VALUE & j2) == 0 ? 0 : -1;
        long j4 = j3;
        boolean z = true;
        while (z) {
            z = (j4 == ((long) i) && (j4 & 1) == (1 & (j2 >> 6))) ? false : true;
            putByte((byte) ((j2 & 127) | (z ? 128 : 0)));
            long j5 = j4;
            j4 >>= 7;
            j2 = j5;
        }
    }

    public final void putBytes(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f50e74676b0eeb8252db04bb6cc69c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f50e74676b0eeb8252db04bb6cc69c4");
            return;
        }
        grow(bArr.length + 5);
        putIntSignedLeb128(bArr.length);
        this.byteBuffer.put(bArr);
    }

    public final void putString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae9e468544d66cd3b3e34ca83718b63e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae9e468544d66cd3b3e34ca83718b63e");
        } else {
            putBytes(str.getBytes(StandardCharsets.UTF_8));
        }
    }
}
