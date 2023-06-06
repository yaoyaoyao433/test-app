package com.meituan.msc.jse.bridge;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.infer.annotation.a;
import com.facebook.jni.HybridData;
import com.meituan.msc.jse.common.annotations.DoNotStrip;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public class WritableNativeMap extends ReadableNativeMap implements WritableMap {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static native HybridData initHybrid();

    private native void mergeNativeMap(ReadableNativeMap readableNativeMap);

    private native void putNativeArray(String str, WritableNativeArray writableNativeArray);

    private native void putNativeMap(String str, WritableNativeMap writableNativeMap);

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public native void putBoolean(@NonNull String str, boolean z);

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public native void putDouble(@NonNull String str, double d);

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public native void putInt(@NonNull String str, int i);

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public native void putNull(@NonNull String str);

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public native void putString(@NonNull String str, @Nullable String str2);

    @Override // com.meituan.msc.jse.bridge.ReadableNativeMap
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableNativeMap, com.meituan.msc.jse.bridge.ReadableMap
    @Nullable
    public /* bridge */ /* synthetic */ ReadableArray getArray(@NonNull String str) {
        return super.getArray(str);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableNativeMap, com.meituan.msc.jse.bridge.ReadableMap
    public /* bridge */ /* synthetic */ boolean getBoolean(@NonNull String str) {
        return super.getBoolean(str);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableNativeMap, com.meituan.msc.jse.bridge.ReadableMap
    public /* bridge */ /* synthetic */ double getDouble(@NonNull String str) {
        return super.getDouble(str);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableNativeMap, com.meituan.msc.jse.bridge.ReadableMap
    @NonNull
    public /* bridge */ /* synthetic */ Dynamic getDynamic(@NonNull String str) {
        return super.getDynamic(str);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableNativeMap, com.meituan.msc.jse.bridge.ReadableMap
    @NonNull
    public /* bridge */ /* synthetic */ Iterator getEntryIterator() {
        return super.getEntryIterator();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableNativeMap, com.meituan.msc.jse.bridge.ReadableMap
    public /* bridge */ /* synthetic */ int getInt(@NonNull String str) {
        return super.getInt(str);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableNativeMap, com.meituan.msc.jse.bridge.ReadableMap
    @Nullable
    public /* bridge */ /* synthetic */ ReadableNativeMap getMap(@NonNull String str) {
        return super.getMap(str);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableNativeMap, com.meituan.msc.jse.bridge.ReadableMap
    @Nullable
    public /* bridge */ /* synthetic */ String getString(@NonNull String str) {
        return super.getString(str);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableNativeMap, com.meituan.msc.jse.bridge.ReadableMap
    @NonNull
    public /* bridge */ /* synthetic */ ReadableType getType(@NonNull String str) {
        return super.getType(str);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableNativeMap, com.meituan.msc.jse.bridge.ReadableMap
    public /* bridge */ /* synthetic */ boolean hasKey(@NonNull String str) {
        return super.hasKey(str);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableNativeMap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableNativeMap, com.meituan.msc.jse.bridge.ReadableMap
    public /* bridge */ /* synthetic */ boolean isNull(@NonNull String str) {
        return super.isNull(str);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableNativeMap, com.meituan.msc.jse.bridge.ReadableMap
    @NonNull
    public /* bridge */ /* synthetic */ ReadableMapKeySetIterator keySetIterator() {
        return super.keySetIterator();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableNativeMap, com.meituan.msc.jse.bridge.ReadableMap
    @NonNull
    public /* bridge */ /* synthetic */ HashMap toHashMap() {
        return super.toHashMap();
    }

    static {
        ReactBridge.staticInit();
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putMap(@NonNull String str, @Nullable ReadableMap readableMap) {
        boolean z = false;
        Object[] objArr = {str, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78495c6daa65eb9f9f7519b9b8e71de8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78495c6daa65eb9f9f7519b9b8e71de8");
            return;
        }
        a.a((readableMap == null || (readableMap instanceof WritableNativeMap)) ? true : true, "Illegal type provided");
        putNativeMap(str, (WritableNativeMap) readableMap);
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putArray(@NonNull String str, @Nullable ReadableArray readableArray) {
        boolean z = false;
        Object[] objArr = {str, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a2cb5339875db47dc85f7150f3dce9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a2cb5339875db47dc85f7150f3dce9b");
            return;
        }
        a.a((readableArray == null || (readableArray instanceof WritableNativeArray)) ? true : true, "Illegal type provided");
        putNativeArray(str, (WritableNativeArray) readableArray);
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void merge(@NonNull ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f669d664be1a0a94520f7b4681d73391", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f669d664be1a0a94520f7b4681d73391");
            return;
        }
        a.a(readableMap instanceof ReadableNativeMap, "Illegal type provided");
        mergeNativeMap((ReadableNativeMap) readableMap);
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public WritableMap copy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c94d574c2ba223c0ec36ae46ae0f90fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c94d574c2ba223c0ec36ae46ae0f90fa");
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.merge(this);
        return writableNativeMap;
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putArray(@NonNull String str, @Nullable WritableArray writableArray) {
        Object[] objArr = {str, writableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1bd97b6fef7f348eac02d15fb0f088c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1bd97b6fef7f348eac02d15fb0f088c");
        } else {
            putArray(str, (ReadableArray) writableArray);
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putMap(@NonNull String str, @Nullable WritableMap writableMap) {
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7eb1a668421e5d942ffe202a12ba37ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7eb1a668421e5d942ffe202a12ba37ce");
        } else {
            putMap(str, (ReadableMap) writableMap);
        }
    }

    public WritableNativeMap() {
        super(initHybrid());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8069f2b1c8b9344edc7617dabe4a4b03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8069f2b1c8b9344edc7617dabe4a4b03");
        }
    }
}
