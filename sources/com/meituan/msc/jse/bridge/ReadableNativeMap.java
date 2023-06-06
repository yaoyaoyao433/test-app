package com.meituan.msc.jse.bridge;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.infer.annotation.a;
import com.facebook.jni.HybridData;
import com.meituan.msc.jse.common.annotations.DoNotStrip;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public class ReadableNativeMap extends NativeMap implements ReadableMap {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static int mJniCallCounter;
    @Nullable
    private String[] mKeys;
    @Nullable
    private HashMap<String, Object> mLocalMap;
    @Nullable
    private HashMap<String, ReadableType> mLocalTypeMap;

    private native String[] importKeys();

    private native Object[] importTypes();

    private native Object[] importValues();

    static {
        ReactBridge.staticInit();
    }

    public ReadableNativeMap(HybridData hybridData) {
        super(hybridData);
        Object[] objArr = {hybridData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b9c779a1b3ccc8b560d649200e682c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b9c779a1b3ccc8b560d649200e682c4");
        }
    }

    public static int getJNIPassCounter() {
        return mJniCallCounter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, Object> getLocalMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "232baa1284fc0a02c0e97ec270f8f7b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "232baa1284fc0a02c0e97ec270f8f7b1");
        }
        if (this.mLocalMap != null) {
            return this.mLocalMap;
        }
        synchronized (this) {
            if (this.mKeys == null) {
                this.mKeys = (String[]) a.a(importKeys());
                mJniCallCounter++;
            }
            if (this.mLocalMap == null) {
                Object[] objArr2 = (Object[]) a.a(importValues());
                mJniCallCounter++;
                int length = this.mKeys.length;
                this.mLocalMap = new HashMap<>(length);
                for (int i = 0; i < length; i++) {
                    this.mLocalMap.put(this.mKeys[i], objArr2[i]);
                }
            }
        }
        return this.mLocalMap;
    }

    @NonNull
    private HashMap<String, ReadableType> getLocalTypeMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fbb5acc196c471dbad19579fb29e7a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fbb5acc196c471dbad19579fb29e7a8");
        }
        if (this.mLocalTypeMap != null) {
            return this.mLocalTypeMap;
        }
        synchronized (this) {
            if (this.mKeys == null) {
                this.mKeys = (String[]) a.a(importKeys());
                mJniCallCounter++;
            }
            if (this.mLocalTypeMap == null) {
                Object[] objArr2 = (Object[]) a.a(importTypes());
                mJniCallCounter++;
                int length = this.mKeys.length;
                this.mLocalTypeMap = new HashMap<>(length);
                for (int i = 0; i < length; i++) {
                    this.mLocalTypeMap.put(this.mKeys[i], (ReadableType) objArr2[i]);
                }
            }
        }
        return this.mLocalTypeMap;
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    public boolean hasKey(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "570639eec2ad0a56157ecf97965714ce", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "570639eec2ad0a56157ecf97965714ce")).booleanValue() : getLocalMap().containsKey(str);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    public boolean isNull(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49f76412742cbf2e968a8b0c8d103344", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49f76412742cbf2e968a8b0c8d103344")).booleanValue();
        }
        if (getLocalMap().containsKey(str)) {
            return getLocalMap().get(str) == null;
        }
        throw new NoSuchKeyException(str);
    }

    @NonNull
    private Object getValue(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "770852306cd5bdd84b4052f7c3e3b356", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "770852306cd5bdd84b4052f7c3e3b356");
        }
        if (hasKey(str) && !isNull(str)) {
            return a.a(getLocalMap().get(str));
        }
        throw new NoSuchKeyException(str);
    }

    private <T> T getValue(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a7abeee927f196f155cbbc287926ef9", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a7abeee927f196f155cbbc287926ef9");
        }
        T t = (T) getValue(str);
        checkInstance(str, t, cls);
        return t;
    }

    @Nullable
    private Object getNullableValue(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b1441074f6ca4a23d924c13da90e39d", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b1441074f6ca4a23d924c13da90e39d");
        }
        if (hasKey(str)) {
            return getLocalMap().get(str);
        }
        throw new NoSuchKeyException(str);
    }

    @Nullable
    private <T> T getNullableValue(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c53e9d141124ebbfd7c0f1a027777ebf", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c53e9d141124ebbfd7c0f1a027777ebf");
        }
        T t = (T) getNullableValue(str);
        checkInstance(str, t, cls);
        return t;
    }

    private void checkInstance(String str, Object obj, Class cls) {
        Object[] objArr = {str, obj, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6dda94716bef3d9cac818d0a150df0d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6dda94716bef3d9cac818d0a150df0d0");
        } else if (obj == null || cls.isInstance(obj)) {
        } else {
            throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + obj.getClass().getSimpleName() + " to " + cls.getSimpleName());
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    public boolean getBoolean(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df74e7106181816d8375fe1cd96e7249", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df74e7106181816d8375fe1cd96e7249")).booleanValue() : ((Boolean) getValue(str, Boolean.class)).booleanValue();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    public double getDouble(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "269be0c84264abac01860f119b9bee30", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "269be0c84264abac01860f119b9bee30")).doubleValue() : ((Double) getValue(str, Double.class)).doubleValue();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    public int getInt(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22a474b6266a63a15c6a81860ac0f130", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22a474b6266a63a15c6a81860ac0f130")).intValue() : ((Double) getValue(str, Double.class)).intValue();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    @Nullable
    public String getString(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf8ea81fe4e8e39ed1e4feecfc227195", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf8ea81fe4e8e39ed1e4feecfc227195") : (String) getNullableValue(str, String.class);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    @Nullable
    public ReadableArray getArray(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6ba7f4e865ec1990400185a12b96e48", RobustBitConfig.DEFAULT_VALUE) ? (ReadableArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6ba7f4e865ec1990400185a12b96e48") : (ReadableArray) getNullableValue(str, ReadableArray.class);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    @Nullable
    public ReadableNativeMap getMap(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05851ad6f8de4cf9102daa8f023f32eb", RobustBitConfig.DEFAULT_VALUE) ? (ReadableNativeMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05851ad6f8de4cf9102daa8f023f32eb") : (ReadableNativeMap) getNullableValue(str, ReadableNativeMap.class);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    @NonNull
    public ReadableType getType(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e08160c21455583a09393601c0b0339d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadableType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e08160c21455583a09393601c0b0339d");
        }
        if (getLocalTypeMap().containsKey(str)) {
            return (ReadableType) a.a(getLocalTypeMap().get(str));
        }
        throw new NoSuchKeyException(str);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    @NonNull
    public Dynamic getDynamic(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22b51b120d44e7caee2bd3a00ffe0970", RobustBitConfig.DEFAULT_VALUE) ? (Dynamic) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22b51b120d44e7caee2bd3a00ffe0970") : DynamicFromMap.create(this, str);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    @NonNull
    public Iterator<Map.Entry<String, Object>> getEntryIterator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1b820771eccb4fdf7c7afd703458197", RobustBitConfig.DEFAULT_VALUE) ? (Iterator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1b820771eccb4fdf7c7afd703458197") : getLocalMap().entrySet().iterator();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    @NonNull
    public ReadableMapKeySetIterator keySetIterator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33547d02468aa7ba010a1749b8b4f563", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMapKeySetIterator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33547d02468aa7ba010a1749b8b4f563") : new ReadableNativeMapKeySetIterator(this);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e99f0d6df08adb7d8060aae9cb225fa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e99f0d6df08adb7d8060aae9cb225fa")).intValue() : getLocalMap().hashCode();
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90789fe024b111a92eb4940fe44b39c7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90789fe024b111a92eb4940fe44b39c7")).booleanValue();
        }
        if (obj instanceof ReadableNativeMap) {
            return getLocalMap().equals(((ReadableNativeMap) obj).getLocalMap());
        }
        return false;
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    @NonNull
    public HashMap<String, Object> toHashMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02aa580262eb2b8fa85404e84b0c60bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02aa580262eb2b8fa85404e84b0c60bb");
        }
        HashMap<String, Object> hashMap = new HashMap<>(getLocalMap());
        for (String str : hashMap.keySet()) {
            switch (getType(str)) {
                case Null:
                case Boolean:
                case Number:
                case String:
                    break;
                case Map:
                    hashMap.put(str, ((ReadableNativeMap) a.a(getMap(str))).toHashMap());
                    break;
                case Array:
                    hashMap.put(str, ((ReadableArray) a.a(getArray(str))).toArrayList());
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object with key: " + str + CommonConstant.Symbol.DOT);
            }
        }
        return hashMap;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class ReadableNativeMapKeySetIterator implements ReadableMapKeySetIterator {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final Iterator<String> mIterator;

        public ReadableNativeMapKeySetIterator(ReadableNativeMap readableNativeMap) {
            this.mIterator = readableNativeMap.getLocalMap().keySet().iterator();
        }

        @Override // com.meituan.msc.jse.bridge.ReadableMapKeySetIterator
        public boolean hasNextKey() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36aa1a42d28c6165448f77049a74942a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36aa1a42d28c6165448f77049a74942a")).booleanValue() : this.mIterator.hasNext();
        }

        @Override // com.meituan.msc.jse.bridge.ReadableMapKeySetIterator
        public String nextKey() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2763b68c843aa5c83112d6a39bb83c6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2763b68c843aa5c83112d6a39bb83c6") : this.mIterator.next();
        }
    }
}
