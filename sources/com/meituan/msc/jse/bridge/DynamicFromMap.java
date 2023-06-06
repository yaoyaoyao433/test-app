package com.meituan.msc.jse.bridge;

import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DynamicFromMap implements Dynamic {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ThreadLocal<Pools.SimplePool<DynamicFromMap>> sPool = new ThreadLocal<Pools.SimplePool<DynamicFromMap>>() { // from class: com.meituan.msc.jse.bridge.DynamicFromMap.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public final Pools.SimplePool<DynamicFromMap> initialValue() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c336beb401967876b20ab684e5b1c5fa", RobustBitConfig.DEFAULT_VALUE) ? (Pools.SimplePool) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c336beb401967876b20ab684e5b1c5fa") : new Pools.SimplePool<>(10);
        }
    };
    @Nullable
    private ReadableMap mMap;
    @Nullable
    private String mName;

    public static DynamicFromMap create(ReadableMap readableMap, String str) {
        Object[] objArr = {readableMap, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c966f3e4e571b70b77fcbdfe078f0765", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicFromMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c966f3e4e571b70b77fcbdfe078f0765");
        }
        DynamicFromMap acquire = sPool.get().acquire();
        if (acquire == null) {
            acquire = new DynamicFromMap();
        }
        acquire.mMap = readableMap;
        acquire.mName = str;
        return acquire;
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public void recycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de5c18c423fba38521ce1518d305664f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de5c18c423fba38521ce1518d305664f");
            return;
        }
        this.mMap = null;
        this.mName = null;
        sPool.get().release(this);
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public boolean isNull() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cda917c63a3dce5a4930a5bae72080c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cda917c63a3dce5a4930a5bae72080c")).booleanValue();
        }
        if (this.mMap == null || this.mName == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mMap.isNull(this.mName);
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public boolean asBoolean() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c77a9e2f608705e873bd9ac8e10c5bfe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c77a9e2f608705e873bd9ac8e10c5bfe")).booleanValue();
        }
        if (this.mMap == null || this.mName == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mMap.getBoolean(this.mName);
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public double asDouble() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d962fd31052f2ceeb6e9314c25a16301", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d962fd31052f2ceeb6e9314c25a16301")).doubleValue();
        }
        if (this.mMap == null || this.mName == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mMap.getDouble(this.mName);
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public int asInt() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3741ea26cc396c9e5fc3437abd3616d8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3741ea26cc396c9e5fc3437abd3616d8")).intValue();
        }
        if (this.mMap == null || this.mName == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mMap.getInt(this.mName);
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public String asString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68c0402c0d27a7a25f30f5ebb2e935c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68c0402c0d27a7a25f30f5ebb2e935c6");
        }
        if (this.mMap == null || this.mName == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mMap.getString(this.mName);
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public ReadableArray asArray() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef7735f801e48dd26e7347c45eefe440", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadableArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef7735f801e48dd26e7347c45eefe440");
        }
        if (this.mMap == null || this.mName == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mMap.getArray(this.mName);
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public ReadableMap asMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4778d0d069cab808d2968eb463968bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4778d0d069cab808d2968eb463968bb");
        }
        if (this.mMap == null || this.mName == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mMap.getMap(this.mName);
    }

    @Override // com.meituan.msc.jse.bridge.Dynamic
    public ReadableType getType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88278a309214f8961868007018177e22", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadableType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88278a309214f8961868007018177e22");
        }
        if (this.mMap == null || this.mName == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return this.mMap.getType(this.mName);
    }
}
