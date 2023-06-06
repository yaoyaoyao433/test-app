package com.facebook.react.bridge;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.infer.annotation.a;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.meituan.robust.common.CommonConstant;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public class ReadableNativeMap extends NativeMap implements ReadableMap {
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

    /* JADX INFO: Access modifiers changed from: protected */
    public ReadableNativeMap(HybridData hybridData) {
        super(hybridData);
    }

    public static int getJNIPassCounter() {
        return mJniCallCounter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, Object> getLocalMap() {
        if (this.mLocalMap != null) {
            return this.mLocalMap;
        }
        synchronized (this) {
            if (this.mKeys == null) {
                this.mKeys = (String[]) a.a(importKeys());
                mJniCallCounter++;
            }
            if (this.mLocalMap == null) {
                Object[] objArr = (Object[]) a.a(importValues());
                mJniCallCounter++;
                int length = this.mKeys.length;
                this.mLocalMap = new HashMap<>(length);
                for (int i = 0; i < length; i++) {
                    this.mLocalMap.put(this.mKeys[i], objArr[i]);
                }
            }
        }
        return this.mLocalMap;
    }

    @NonNull
    private HashMap<String, ReadableType> getLocalTypeMap() {
        if (this.mLocalTypeMap != null) {
            return this.mLocalTypeMap;
        }
        synchronized (this) {
            if (this.mKeys == null) {
                this.mKeys = (String[]) a.a(importKeys());
                mJniCallCounter++;
            }
            if (this.mLocalTypeMap == null) {
                Object[] objArr = (Object[]) a.a(importTypes());
                mJniCallCounter++;
                int length = this.mKeys.length;
                this.mLocalTypeMap = new HashMap<>(length);
                for (int i = 0; i < length; i++) {
                    this.mLocalTypeMap.put(this.mKeys[i], (ReadableType) objArr[i]);
                }
            }
        }
        return this.mLocalTypeMap;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean hasKey(@NonNull String str) {
        return getLocalMap().containsKey(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean isNull(@NonNull String str) {
        if (getLocalMap().containsKey(str)) {
            return getLocalMap().get(str) == null;
        }
        throw new NoSuchKeyException(str);
    }

    @NonNull
    private Object getValue(@NonNull String str) {
        if (hasKey(str) && !isNull(str)) {
            return a.a(getLocalMap().get(str));
        }
        throw new NoSuchKeyException(str);
    }

    private <T> T getValue(String str, Class<T> cls) {
        T t = (T) getValue(str);
        checkInstance(str, t, cls);
        return t;
    }

    @Nullable
    private Object getNullableValue(String str) {
        if (hasKey(str)) {
            return getLocalMap().get(str);
        }
        throw new NoSuchKeyException(str);
    }

    @Nullable
    private <T> T getNullableValue(String str, Class<T> cls) {
        T t = (T) getNullableValue(str);
        checkInstance(str, t, cls);
        return t;
    }

    private void checkInstance(String str, Object obj, Class cls) {
        if (obj == null || cls.isInstance(obj)) {
            return;
        }
        throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + obj.getClass().getSimpleName() + " to " + cls.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean getBoolean(@NonNull String str) {
        return ((Boolean) getValue(str, Boolean.class)).booleanValue();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public double getDouble(@NonNull String str) {
        return ((Double) getValue(str, Double.class)).doubleValue();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public int getInt(@NonNull String str) {
        return ((Double) getValue(str, Double.class)).intValue();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nullable
    public String getString(@NonNull String str) {
        return (String) getNullableValue(str, String.class);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nullable
    public ReadableArray getArray(@NonNull String str) {
        return (ReadableArray) getNullableValue(str, ReadableArray.class);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nullable
    public ReadableNativeMap getMap(@NonNull String str) {
        return (ReadableNativeMap) getNullableValue(str, ReadableNativeMap.class);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @NonNull
    public ReadableType getType(@NonNull String str) {
        if (getLocalTypeMap().containsKey(str)) {
            return (ReadableType) a.a(getLocalTypeMap().get(str));
        }
        throw new NoSuchKeyException(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @NonNull
    public Dynamic getDynamic(@NonNull String str) {
        return DynamicFromMap.create(this, str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @NonNull
    public Iterator<Map.Entry<String, Object>> getEntryIterator() {
        return getLocalMap().entrySet().iterator();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @NonNull
    public ReadableMapKeySetIterator keySetIterator() {
        return new ReadableNativeMapKeySetIterator(this);
    }

    public int hashCode() {
        return getLocalMap().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof ReadableNativeMap) {
            return getLocalMap().equals(((ReadableNativeMap) obj).getLocalMap());
        }
        return false;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @NonNull
    public HashMap<String, Object> toHashMap() {
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
    /* loaded from: classes.dex */
    public static class ReadableNativeMapKeySetIterator implements ReadableMapKeySetIterator {
        private final Iterator<String> mIterator;

        public ReadableNativeMapKeySetIterator(ReadableNativeMap readableNativeMap) {
            this.mIterator = readableNativeMap.getLocalMap().keySet().iterator();
        }

        @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
        public boolean hasNextKey() {
            return this.mIterator.hasNext();
        }

        @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
        public String nextKey() {
            return this.mIterator.next();
        }
    }
}
