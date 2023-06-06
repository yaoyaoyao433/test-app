package com.facebook.react.bridge;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.infer.annotation.a;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public class ReadableNativeArray extends NativeArray implements ReadableArray {
    private static int jniPassCounter;
    @Nullable
    private Object[] mLocalArray;
    @Nullable
    private ReadableType[] mLocalTypeArray;

    private native Object[] importArray();

    private native Object[] importTypeArray();

    static {
        ReactBridge.staticInit();
        jniPassCounter = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ReadableNativeArray(HybridData hybridData) {
        super(hybridData);
    }

    public static int getJNIPassCounter() {
        return jniPassCounter;
    }

    private Object[] getLocalArray() {
        if (this.mLocalArray != null) {
            return this.mLocalArray;
        }
        synchronized (this) {
            if (this.mLocalArray == null) {
                jniPassCounter++;
                this.mLocalArray = (Object[]) a.a(importArray());
            }
        }
        return this.mLocalArray;
    }

    private ReadableType[] getLocalTypeArray() {
        if (this.mLocalTypeArray != null) {
            return this.mLocalTypeArray;
        }
        synchronized (this) {
            if (this.mLocalTypeArray == null) {
                jniPassCounter++;
                Object[] objArr = (Object[]) a.a(importTypeArray());
                this.mLocalTypeArray = (ReadableType[]) Arrays.copyOf(objArr, objArr.length, ReadableType[].class);
            }
        }
        return this.mLocalTypeArray;
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public int size() {
        return getLocalArray().length;
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public boolean isNull(int i) {
        return getLocalArray()[i] == null;
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public boolean getBoolean(int i) {
        return ((Boolean) getLocalArray()[i]).booleanValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public double getDouble(int i) {
        return ((Double) getLocalArray()[i]).doubleValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public int getInt(int i) {
        return ((Double) getLocalArray()[i]).intValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    @Nullable
    public String getString(int i) {
        return (String) getLocalArray()[i];
    }

    @Override // com.facebook.react.bridge.ReadableArray
    @Nullable
    public ReadableNativeArray getArray(int i) {
        return (ReadableNativeArray) getLocalArray()[i];
    }

    @Override // com.facebook.react.bridge.ReadableArray
    @Nullable
    public ReadableNativeMap getMap(int i) {
        return (ReadableNativeMap) getLocalArray()[i];
    }

    @Override // com.facebook.react.bridge.ReadableArray
    @NonNull
    public ReadableType getType(int i) {
        return getLocalTypeArray()[i];
    }

    @Override // com.facebook.react.bridge.ReadableArray
    @NonNull
    public Dynamic getDynamic(int i) {
        return DynamicFromArray.create(this, i);
    }

    public int hashCode() {
        return getLocalArray().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof ReadableNativeArray) {
            return Arrays.deepEquals(getLocalArray(), ((ReadableNativeArray) obj).getLocalArray());
        }
        return false;
    }

    @Override // com.facebook.react.bridge.ReadableArray
    @NonNull
    public ArrayList<Object> toArrayList() {
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            switch (getType(i)) {
                case Null:
                    arrayList.add(null);
                    break;
                case Boolean:
                    arrayList.add(Boolean.valueOf(getBoolean(i)));
                    break;
                case Number:
                    arrayList.add(Double.valueOf(getDouble(i)));
                    break;
                case String:
                    arrayList.add(getString(i));
                    break;
                case Map:
                    arrayList.add(getMap(i).toHashMap());
                    break;
                case Array:
                    arrayList.add(getArray(i).toArrayList());
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object at index: " + i + CommonConstant.Symbol.DOT);
            }
        }
        return arrayList;
    }
}
