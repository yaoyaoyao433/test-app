package com.facebook.react.bridge;

import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DynamicFromMap implements Dynamic {
    private static final ThreadLocal<Pools.SimplePool<DynamicFromMap>> sPool = new ThreadLocal<Pools.SimplePool<DynamicFromMap>>() { // from class: com.facebook.react.bridge.DynamicFromMap.1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public final Pools.SimplePool<DynamicFromMap> initialValue() {
            return new Pools.SimplePool<>(10);
        }
    };
    @Nullable
    private ReadableMap mMap;
    @Nullable
    private String mName;

    private DynamicFromMap() {
    }

    public static DynamicFromMap create(ReadableMap readableMap, String str) {
        DynamicFromMap acquire = sPool.get().acquire();
        if (acquire == null) {
            acquire = new DynamicFromMap();
        }
        acquire.mMap = readableMap;
        acquire.mName = str;
        return acquire;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public void recycle() {
        this.mMap = null;
        this.mName = null;
        sPool.get().release(this);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean isNull() {
        if (this.mMap == null || this.mName == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mMap.isNull(this.mName);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean asBoolean() {
        if (this.mMap == null || this.mName == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mMap.getBoolean(this.mName);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public double asDouble() {
        if (this.mMap == null || this.mName == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mMap.getDouble(this.mName);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public int asInt() {
        if (this.mMap == null || this.mName == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mMap.getInt(this.mName);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public String asString() {
        if (this.mMap == null || this.mName == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mMap.getString(this.mName);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableArray asArray() {
        if (this.mMap == null || this.mName == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mMap.getArray(this.mName);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableMap asMap() {
        if (this.mMap == null || this.mName == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mMap.getMap(this.mName);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableType getType() {
        if (this.mMap == null || this.mName == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mMap.getType(this.mName);
    }
}
