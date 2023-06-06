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
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public class ReadableNativeArray extends NativeArray implements ReadableArray {
    public static ChangeQuickRedirect changeQuickRedirect;
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

    public ReadableNativeArray(HybridData hybridData) {
        super(hybridData);
        Object[] objArr = {hybridData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6de582a2653d824b8ea0b2c8f001dd27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6de582a2653d824b8ea0b2c8f001dd27");
        }
    }

    public static int getJNIPassCounter() {
        return jniPassCounter;
    }

    private Object[] getLocalArray() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed1060427001a6adee47b7e38c3b25d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Object[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed1060427001a6adee47b7e38c3b25d8");
        }
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
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "608768fc840a449596443536c70efbe3", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadableType[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "608768fc840a449596443536c70efbe3");
        }
        if (this.mLocalTypeArray != null) {
            return this.mLocalTypeArray;
        }
        synchronized (this) {
            if (this.mLocalTypeArray == null) {
                jniPassCounter++;
                Object[] objArr2 = (Object[]) a.a(importTypeArray());
                this.mLocalTypeArray = (ReadableType[]) Arrays.copyOf(objArr2, objArr2.length, ReadableType[].class);
            }
        }
        return this.mLocalTypeArray;
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    public int size() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4abde71a7eaaace315c3d98cffc7d878", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4abde71a7eaaace315c3d98cffc7d878")).intValue() : getLocalArray().length;
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    public boolean isNull(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecf64ba245c5607ae4b04302cb5b0bc5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecf64ba245c5607ae4b04302cb5b0bc5")).booleanValue() : getLocalArray()[i] == null;
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    public boolean getBoolean(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a309c79ac2da30182951ac69dbe23b4f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a309c79ac2da30182951ac69dbe23b4f")).booleanValue() : ((Boolean) getLocalArray()[i]).booleanValue();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    public double getDouble(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bd27c5ddd854929395ce9c6bbea04a8", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bd27c5ddd854929395ce9c6bbea04a8")).doubleValue() : ((Double) getLocalArray()[i]).doubleValue();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    public int getInt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39b536e0a966d30a80cd7190d74f8460", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39b536e0a966d30a80cd7190d74f8460")).intValue() : ((Double) getLocalArray()[i]).intValue();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    @Nullable
    public String getString(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad912dd36d77d9fb6504f1181ac377fb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad912dd36d77d9fb6504f1181ac377fb") : (String) getLocalArray()[i];
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    @Nullable
    public ReadableNativeArray getArray(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "051d42180c155f707d4b8e968b5ce261", RobustBitConfig.DEFAULT_VALUE) ? (ReadableNativeArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "051d42180c155f707d4b8e968b5ce261") : (ReadableNativeArray) getLocalArray()[i];
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    @Nullable
    public ReadableNativeMap getMap(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fa7404e85320833590261c93ac8130c", RobustBitConfig.DEFAULT_VALUE) ? (ReadableNativeMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fa7404e85320833590261c93ac8130c") : (ReadableNativeMap) getLocalArray()[i];
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    @NonNull
    public ReadableType getType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89423271b051029a963fb22ed9088db0", RobustBitConfig.DEFAULT_VALUE) ? (ReadableType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89423271b051029a963fb22ed9088db0") : getLocalTypeArray()[i];
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    @NonNull
    public Dynamic getDynamic(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09eff26ec165ba01bfe4ac5c88302242", RobustBitConfig.DEFAULT_VALUE) ? (Dynamic) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09eff26ec165ba01bfe4ac5c88302242") : DynamicFromArray.create(this, i);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b0cab5279a7fb2e9c45770a3c8e1920", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b0cab5279a7fb2e9c45770a3c8e1920")).intValue() : getLocalArray().hashCode();
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbc6d11917d900086f04d020d63f7971", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbc6d11917d900086f04d020d63f7971")).booleanValue();
        }
        if (obj instanceof ReadableNativeArray) {
            return Arrays.deepEquals(getLocalArray(), ((ReadableNativeArray) obj).getLocalArray());
        }
        return false;
    }

    @Override // com.meituan.msc.jse.bridge.ReadableArray
    @NonNull
    public ArrayList<Object> toArrayList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c523a7720ed7e482d78cb858b04e9ace", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c523a7720ed7e482d78cb858b04e9ace");
        }
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
