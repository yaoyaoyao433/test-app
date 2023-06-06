package com.meituan.msc.jse.bridge;

import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DynamicFromArray implements Dynamic {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Pools.SimplePool<DynamicFromArray> sPool = new Pools.SimplePool<>(10);
    @Nullable
    private ReadableArray mArray;
    private int mIndex;

    public DynamicFromArray() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ae4518c92582532f7898bb9953d0528", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ae4518c92582532f7898bb9953d0528");
        } else {
            this.mIndex = -1;
        }
    }

    public static DynamicFromArray create(ReadableArray readableArray, int i) {
        Object[] objArr = {readableArray, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8dd40c02a75ef5bda4aaf85608ba92fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicFromArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8dd40c02a75ef5bda4aaf85608ba92fd");
        }
        DynamicFromArray acquire = sPool.acquire();
        if (acquire == null) {
            acquire = new DynamicFromArray();
        }
        acquire.mArray = readableArray;
        acquire.mIndex = i;
        return acquire;
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public void recycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05499cecee98c22e97878f905f66fe09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05499cecee98c22e97878f905f66fe09");
            return;
        }
        this.mArray = null;
        this.mIndex = -1;
        sPool.release(this);
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public boolean isNull() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70a3ae42e90f55f764b30decffa4b724", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70a3ae42e90f55f764b30decffa4b724")).booleanValue();
        }
        if (this.mArray == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mArray.isNull(this.mIndex);
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public boolean asBoolean() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e5c86b9833684c13bbedc59bf7c8ca0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e5c86b9833684c13bbedc59bf7c8ca0")).booleanValue();
        }
        if (this.mArray == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mArray.getBoolean(this.mIndex);
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public double asDouble() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcea32d20e02835bca731a222a6b7eb4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcea32d20e02835bca731a222a6b7eb4")).doubleValue();
        }
        if (this.mArray == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mArray.getDouble(this.mIndex);
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public int asInt() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f85099db0e104a592e97f920cc628784", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f85099db0e104a592e97f920cc628784")).intValue();
        }
        if (this.mArray == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mArray.getInt(this.mIndex);
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public String asString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4ed01965d10c28efab73c6c2db4d70a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4ed01965d10c28efab73c6c2db4d70a");
        }
        if (this.mArray == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mArray.getString(this.mIndex);
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public ReadableArray asArray() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12d1867eec031fdd911d779ce36b8cb6", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadableArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12d1867eec031fdd911d779ce36b8cb6");
        }
        if (this.mArray == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mArray.getArray(this.mIndex);
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public ReadableMap asMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfe2a3b79e424fb13fa1d8625b9ac99e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfe2a3b79e424fb13fa1d8625b9ac99e");
        }
        if (this.mArray == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mArray.getMap(this.mIndex);
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public ReadableType getType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b67ad1bd337b89bc3c77847fbb04d4c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadableType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b67ad1bd337b89bc3c77847fbb04d4c");
        }
        if (this.mArray == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mArray.getType(this.mIndex);
    }
}
