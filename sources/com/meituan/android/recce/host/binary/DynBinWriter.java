package com.meituan.android.recce.host.binary;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class DynBinWriter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final BinWriter binWriter;

    public DynBinWriter(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1011bee2feb299228e8c8098b5a22de6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1011bee2feb299228e8c8098b5a22de6");
        } else {
            this.binWriter = new BinWriter(i);
        }
    }

    public DynBinWriter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ebb92bea33db5d162c64560b869f419", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ebb92bea33db5d162c64560b869f419");
        } else {
            this.binWriter = new BinWriter();
        }
    }

    public final int size() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57966f0f75ae2b6210819389fbbe73c9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57966f0f75ae2b6210819389fbbe73c9")).intValue() : this.binWriter.size();
    }

    public final byte[] asBytes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a07c013092f54afb014d3530c2e7aa8", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a07c013092f54afb014d3530c2e7aa8") : this.binWriter.asBytes();
    }

    private void putDataType(byte b) {
        Object[] objArr = {Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44efb87aa3311da500c356fe59412778", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44efb87aa3311da500c356fe59412778");
        } else {
            this.binWriter.putByte(b);
        }
    }

    public final void putByte(byte b) {
        Object[] objArr = {Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22fad5d81c5a02af3c969105b8f59c39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22fad5d81c5a02af3c969105b8f59c39");
            return;
        }
        putDataType((byte) 1);
        this.binWriter.putByte(b);
    }

    public final void putShort(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84da4e86e0b70af0533ddb911c3d7818", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84da4e86e0b70af0533ddb911c3d7818");
            return;
        }
        putDataType((byte) 2);
        this.binWriter.putShort(s);
    }

    public final void putInt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34da05b53deabc503bdd6e715c600154", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34da05b53deabc503bdd6e715c600154");
            return;
        }
        putDataType((byte) 3);
        this.binWriter.putInt(i);
    }

    public final void putLong(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0caa2211f22d4c77fa7f9e10a646e282", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0caa2211f22d4c77fa7f9e10a646e282");
            return;
        }
        putDataType((byte) 4);
        this.binWriter.putLong(j);
    }

    public final void putBool(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f2bb13ac634c49f9f68f38feb8c53d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f2bb13ac634c49f9f68f38feb8c53d2");
            return;
        }
        putDataType((byte) 7);
        this.binWriter.putBool(z);
    }

    public final void putFloat(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09b3e76be548dd460a4d5afb5e7b2d77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09b3e76be548dd460a4d5afb5e7b2d77");
            return;
        }
        putDataType((byte) 5);
        this.binWriter.putFloat(f);
    }

    public final void putDouble(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "637cec84bc634bedaf85db6c0d228d1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "637cec84bc634bedaf85db6c0d228d1c");
            return;
        }
        putDataType((byte) 6);
        this.binWriter.putDouble(d);
    }

    public final void putIntSignedLeb128(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b996b32b24e8267d89794848be130d56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b996b32b24e8267d89794848be130d56");
            return;
        }
        putDataType((byte) 8);
        this.binWriter.putIntSignedLeb128(i);
    }

    public final void putLongSignedLeb128(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c0131b000f2004e0e5b7dfdfde01096", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c0131b000f2004e0e5b7dfdfde01096");
            return;
        }
        putDataType((byte) 9);
        this.binWriter.putLongSignedLeb128(j);
    }

    public final void putBytes(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db9c9f7661a552f099557117a1ab60a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db9c9f7661a552f099557117a1ab60a2");
            return;
        }
        putDataType((byte) 10);
        this.binWriter.putBytes(bArr);
    }

    public final void putString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06415d54f21a045061cd3b4b8f9e504b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06415d54f21a045061cd3b4b8f9e504b");
            return;
        }
        putDataType((byte) 11);
        this.binWriter.putString(str);
    }
}
