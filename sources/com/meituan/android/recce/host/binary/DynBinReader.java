package com.meituan.android.recce.host.binary;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class DynBinReader {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final BinReader binReader;
    private byte dataType;

    public DynBinReader(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37f82e5c722da0bc1534c22c07d54b04", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37f82e5c722da0bc1534c22c07d54b04");
            return;
        }
        this.dataType = (byte) 0;
        this.binReader = new BinReader(bArr);
    }

    public final int peekDataType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7668d12031eb1d81b8842eeac2c6a346", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7668d12031eb1d81b8842eeac2c6a346")).intValue();
        }
        this.dataType = this.binReader.getByte();
        return this.dataType;
    }

    private int getDataType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a96030b378ecc0593deae39175d4b01c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a96030b378ecc0593deae39175d4b01c")).intValue();
        }
        if (this.dataType > 0) {
            byte b = this.dataType;
            this.dataType = (byte) 0;
            return b;
        }
        return this.binReader.getByte();
    }

    private void consumeDataType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec08ec4a543732a7d0b282a67b5ee798", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec08ec4a543732a7d0b282a67b5ee798");
        } else if (i != getDataType()) {
            throw new RuntimeException("dyn type mismatch");
        }
    }

    public final byte getByte() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af8b09a071ce7ecbc21ad1b2cd15aa61", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Byte) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af8b09a071ce7ecbc21ad1b2cd15aa61")).byteValue();
        }
        consumeDataType(1);
        return this.binReader.getByte();
    }

    public final short getShort() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9fd6fd030f325c1de819a22a03cc1d4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9fd6fd030f325c1de819a22a03cc1d4")).shortValue();
        }
        consumeDataType(2);
        return this.binReader.getShort();
    }

    public final int getInt() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe292ca2aafcc0de9990e6310cd116dd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe292ca2aafcc0de9990e6310cd116dd")).intValue();
        }
        consumeDataType(3);
        return this.binReader.getInt();
    }

    public final long getLong() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74d85d1d73bbe13b22cd1a25fe11d8cf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74d85d1d73bbe13b22cd1a25fe11d8cf")).longValue();
        }
        consumeDataType(4);
        return this.binReader.getLong();
    }

    public final boolean getBool() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f3107e3da659ede79e060df805895ca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f3107e3da659ede79e060df805895ca")).booleanValue();
        }
        consumeDataType(7);
        return this.binReader.getBool();
    }

    public final float getFloat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "630527cb01e4e0f4078249f3ca812e5d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "630527cb01e4e0f4078249f3ca812e5d")).floatValue();
        }
        consumeDataType(5);
        return this.binReader.getFloat();
    }

    public final double getDouble() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a67467cb1c0176802dfde62ea05c4ad", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a67467cb1c0176802dfde62ea05c4ad")).doubleValue();
        }
        consumeDataType(6);
        return this.binReader.getDouble();
    }

    public final int getIntSignedLeb128() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abbf740019757e8c7686104d26796afd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abbf740019757e8c7686104d26796afd")).intValue();
        }
        consumeDataType(8);
        return this.binReader.getIntSignedLeb128();
    }

    public final long getLongSignedLeb128() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3ab9b9c9a384826f66522fd065995ad", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3ab9b9c9a384826f66522fd065995ad")).longValue();
        }
        consumeDataType(9);
        return this.binReader.getLongSignedLeb128();
    }

    public final byte[] getBytes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33bad4f3c2cdf498ee99f6f6a300fd37", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33bad4f3c2cdf498ee99f6f6a300fd37");
        }
        consumeDataType(10);
        return this.binReader.getBytes();
    }

    public final String getString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c92f2ded2e1e7fac9c42fee6d7fc5b2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c92f2ded2e1e7fac9c42fee6d7fc5b2f");
        }
        consumeDataType(11);
        return this.binReader.getString();
    }
}
