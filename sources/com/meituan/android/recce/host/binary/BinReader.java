package com.meituan.android.recce.host.binary;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class BinReader {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ByteBuffer byteBuffer;

    public BinReader(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "760f361d324ca16a375bcab08a298c1b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "760f361d324ca16a375bcab08a298c1b");
        } else {
            this.byteBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public BinReader(ByteBuffer byteBuffer) {
        Object[] objArr = {byteBuffer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a56505b25246034440e67b0b48f9da4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a56505b25246034440e67b0b48f9da4");
        } else {
            this.byteBuffer = byteBuffer;
        }
    }

    public final BinReader len(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f31eb5a5ff73bb8218d56f638228bba", RobustBitConfig.DEFAULT_VALUE)) {
            return (BinReader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f31eb5a5ff73bb8218d56f638228bba");
        }
        this.byteBuffer.limit(i);
        return this;
    }

    public final int position() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3601d73afe714f16b5ac706112715ee6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3601d73afe714f16b5ac706112715ee6")).intValue() : this.byteBuffer.position();
    }

    public final byte getByte() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "184b3ae26fe348caefe3d6a26cc96b25", RobustBitConfig.DEFAULT_VALUE) ? ((Byte) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "184b3ae26fe348caefe3d6a26cc96b25")).byteValue() : this.byteBuffer.get();
    }

    public final short getShort() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abd31e54094c483593e05d65aa7e8be2", RobustBitConfig.DEFAULT_VALUE) ? ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abd31e54094c483593e05d65aa7e8be2")).shortValue() : this.byteBuffer.getShort();
    }

    public final int getInt() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bac5a2a235bdb9983a196b5bccdfaf9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bac5a2a235bdb9983a196b5bccdfaf9")).intValue() : this.byteBuffer.getInt();
    }

    public final long getLong() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6aa6a3e4ef744bd2da45115b54033703", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6aa6a3e4ef744bd2da45115b54033703")).longValue() : this.byteBuffer.getLong();
    }

    public final float getFloat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69178fb4ac67b1b547818bde31258b30", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69178fb4ac67b1b547818bde31258b30")).floatValue() : this.byteBuffer.getFloat();
    }

    public final double getDouble() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4897fe945ad8725e6ee8c2fd7ee3d62", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4897fe945ad8725e6ee8c2fd7ee3d62")).doubleValue() : this.byteBuffer.getDouble();
    }

    public final boolean getBool() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "898f5fe32be17316ccd08123fd543ab1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "898f5fe32be17316ccd08123fd543ab1")).booleanValue() : this.byteBuffer.get() == 1;
    }

    public final int getIntSignedLeb128() {
        int i;
        int i2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd74f9e8fdf6c2e426074fdb01dd31a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd74f9e8fdf6c2e426074fdb01dd31a5")).intValue();
        }
        int i3 = 0;
        int i4 = -1;
        do {
            int i5 = this.byteBuffer.get() & 255;
            i2 |= (i5 & 127) << (i3 * 7);
            i4 <<= 7;
            i3++;
            i = i5 & 128;
            if (i != 128) {
                break;
            }
        } while (i3 < 5);
        if (i != 128) {
            return ((i4 >> 1) & i2) != 0 ? i2 | i4 : i2;
        }
        throw new RuntimeException("invalid LEB128 sequence");
    }

    public final long getLongSignedLeb128() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c74cb3f9a84810cc80b81ac919e6639a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c74cb3f9a84810cc80b81ac919e6639a")).longValue();
        }
        long j = 0;
        int i2 = 0;
        int i3 = -1;
        do {
            long j2 = this.byteBuffer.get() & 255;
            j |= (127 & j2) << (i2 * 7);
            i3 <<= 7;
            i2++;
            i = ((j2 & 128) > 128L ? 1 : ((j2 & 128) == 128L ? 0 : -1));
            if (i != 0) {
                break;
            }
        } while (i2 < 10);
        if (i != 0) {
            return (((long) (i3 >> 1)) & j) != 0 ? j | i3 : j;
        }
        throw new RuntimeException("invalid LEB128 sequence");
    }

    public final byte[] getBytes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3839269862550e15a123cc923bfa8aff", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3839269862550e15a123cc923bfa8aff");
        }
        byte[] bArr = new byte[getIntSignedLeb128()];
        this.byteBuffer.get(bArr);
        return bArr;
    }

    public final void advance(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b44b11b510498468dc797ce6de962249", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b44b11b510498468dc797ce6de962249");
        } else {
            this.byteBuffer.position(this.byteBuffer.position() + i);
        }
    }

    public final String getString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e812b9c605318c75f978f5924e4c2c1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e812b9c605318c75f978f5924e4c2c1") : new String(getBytes(), StandardCharsets.UTF_8);
    }

    public final BinReader slice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecfa67dcc11e83e66fd8060a71d903e6", RobustBitConfig.DEFAULT_VALUE) ? (BinReader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecfa67dcc11e83e66fd8060a71d903e6") : new BinReader(this.byteBuffer.slice().order(ByteOrder.LITTLE_ENDIAN));
    }
}
