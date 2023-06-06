package com.facebook.react.bridge;

import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DynamicFromArray implements Dynamic {
    private static final Pools.SimplePool<DynamicFromArray> sPool = new Pools.SimplePool<>(10);
    @Nullable
    private ReadableArray mArray;
    private int mIndex = -1;

    private DynamicFromArray() {
    }

    public static DynamicFromArray create(ReadableArray readableArray, int i) {
        DynamicFromArray acquire = sPool.acquire();
        if (acquire == null) {
            acquire = new DynamicFromArray();
        }
        acquire.mArray = readableArray;
        acquire.mIndex = i;
        return acquire;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public void recycle() {
        this.mArray = null;
        this.mIndex = -1;
        sPool.release(this);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean isNull() {
        if (this.mArray == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mArray.isNull(this.mIndex);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean asBoolean() {
        if (this.mArray == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mArray.getBoolean(this.mIndex);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public double asDouble() {
        if (this.mArray == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mArray.getDouble(this.mIndex);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public int asInt() {
        if (this.mArray == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mArray.getInt(this.mIndex);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public String asString() {
        if (this.mArray == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mArray.getString(this.mIndex);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableArray asArray() {
        if (this.mArray == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mArray.getArray(this.mIndex);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableMap asMap() {
        if (this.mArray == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mArray.getMap(this.mIndex);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableType getType() {
        if (this.mArray == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mArray.getType(this.mIndex);
    }
}
