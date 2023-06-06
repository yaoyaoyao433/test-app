package com.meituan.msc.jse.bridge;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class JavaOnlyMap implements ReadableMap, WritableMap {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Map mBackingMap;

    public static JavaOnlyMap of(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fb5924d1083aa3fa24d3ad83ed7cbddb", RobustBitConfig.DEFAULT_VALUE) ? (JavaOnlyMap) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fb5924d1083aa3fa24d3ad83ed7cbddb") : new JavaOnlyMap(objArr);
    }

    public static JavaOnlyMap deepClone(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a8a5b36b06c21eb6313776781fa8ad1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JavaOnlyMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a8a5b36b06c21eb6313776781fa8ad1b");
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (readableMap.getType(nextKey)) {
                case Null:
                    javaOnlyMap.putNull(nextKey);
                    break;
                case Boolean:
                    javaOnlyMap.putBoolean(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case Number:
                    javaOnlyMap.putDouble(nextKey, readableMap.getDouble(nextKey));
                    break;
                case String:
                    javaOnlyMap.putString(nextKey, readableMap.getString(nextKey));
                    break;
                case Map:
                    javaOnlyMap.putMap(nextKey, (WritableMap) deepClone(readableMap.getMap(nextKey)));
                    break;
                case Array:
                    javaOnlyMap.putArray(nextKey, (WritableArray) JavaOnlyArray.deepClone(readableMap.getArray(nextKey)));
                    break;
            }
        }
        return javaOnlyMap;
    }

    public JavaOnlyMap(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70ca275c4d02c60e27d415aaffef95d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70ca275c4d02c60e27d415aaffef95d7");
        } else if (objArr.length % 2 != 0) {
            throw new IllegalArgumentException("You must provide the same number of keys and values");
        } else {
            this.mBackingMap = new HashMap();
            for (int i = 0; i < objArr.length; i += 2) {
                Object obj = objArr[i + 1];
                if (obj instanceof Number) {
                    obj = Double.valueOf(((Number) obj).doubleValue());
                }
                this.mBackingMap.put(objArr[i], obj);
            }
        }
    }

    public JavaOnlyMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "088ac62edc416bc2dee7ae0bb5e62575", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "088ac62edc416bc2dee7ae0bb5e62575");
        } else {
            this.mBackingMap = new HashMap();
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    public boolean hasKey(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa626c54556dc3f59682ef0c4db8f75e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa626c54556dc3f59682ef0c4db8f75e")).booleanValue() : this.mBackingMap.containsKey(str);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    public boolean isNull(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f9e55382d3a6661aaa8689a243c41df", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f9e55382d3a6661aaa8689a243c41df")).booleanValue() : this.mBackingMap.get(str) == null;
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    public boolean getBoolean(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58f5429eda324de50db035b72fe1eadf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58f5429eda324de50db035b72fe1eadf")).booleanValue() : ((Boolean) this.mBackingMap.get(str)).booleanValue();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    public double getDouble(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2a7dbc493746e6eab510dc12950c253", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2a7dbc493746e6eab510dc12950c253")).doubleValue() : ((Number) this.mBackingMap.get(str)).doubleValue();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    public int getInt(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e459d7d30a325de455f1b5fb613f375", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e459d7d30a325de455f1b5fb613f375")).intValue() : ((Number) this.mBackingMap.get(str)).intValue();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    public String getString(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfed59162ed743c4615b89c85d3d8be4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfed59162ed743c4615b89c85d3d8be4") : (String) this.mBackingMap.get(str);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    public ReadableMap getMap(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccc73dc8ae89f1a5bc092f53f9651a21", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccc73dc8ae89f1a5bc092f53f9651a21") : (ReadableMap) this.mBackingMap.get(str);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    public ReadableArray getArray(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a048268b065c19d1acde1dd822cb8372", RobustBitConfig.DEFAULT_VALUE) ? (ReadableArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a048268b065c19d1acde1dd822cb8372") : (ReadableArray) this.mBackingMap.get(str);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    @NonNull
    public Dynamic getDynamic(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5dac6f4909d630907a25da213cb2c1d6", RobustBitConfig.DEFAULT_VALUE) ? (Dynamic) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5dac6f4909d630907a25da213cb2c1d6") : DynamicFromMap.create(this, str);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    @NonNull
    public ReadableType getType(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f079378a11810667e998fdd554b587a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadableType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f079378a11810667e998fdd554b587a");
        }
        Object obj = this.mBackingMap.get(str);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Number) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj instanceof Dynamic) {
            return ((Dynamic) obj).getType();
        }
        throw new IllegalArgumentException("Invalid value " + obj.toString() + " for key " + str + "contained in JavaOnlyMap");
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    @NonNull
    public Iterator<Map.Entry<String, Object>> getEntryIterator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2148103178d914662b975346ea4f110c", RobustBitConfig.DEFAULT_VALUE) ? (Iterator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2148103178d914662b975346ea4f110c") : this.mBackingMap.entrySet().iterator();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    @NonNull
    public ReadableMapKeySetIterator keySetIterator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae6bf16d2e7f031c86b6e2f2dbb253e4", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMapKeySetIterator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae6bf16d2e7f031c86b6e2f2dbb253e4") : new ReadableMapKeySetIterator() { // from class: com.meituan.msc.jse.bridge.JavaOnlyMap.1
            public static ChangeQuickRedirect changeQuickRedirect;
            public Iterator<Map.Entry<String, Object>> mIterator;

            {
                this.mIterator = JavaOnlyMap.this.mBackingMap.entrySet().iterator();
            }

            @Override // com.meituan.msc.jse.bridge.ReadableMapKeySetIterator
            public boolean hasNextKey() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ebf9dc075a74aaf7c983e26e562ae8a2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ebf9dc075a74aaf7c983e26e562ae8a2")).booleanValue() : this.mIterator.hasNext();
            }

            @Override // com.meituan.msc.jse.bridge.ReadableMapKeySetIterator
            public String nextKey() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "471c0c5e8d8fb91687515713c99e393e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "471c0c5e8d8fb91687515713c99e393e") : this.mIterator.next().getKey();
            }
        };
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putBoolean(@NonNull String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c0d28b3698393a5b5d9e6d62e46025d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c0d28b3698393a5b5d9e6d62e46025d");
        } else {
            this.mBackingMap.put(str, Boolean.valueOf(z));
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putDouble(@NonNull String str, double d) {
        Object[] objArr = {str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83f3ccf3a4221372de3abd6fa2c1b1f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83f3ccf3a4221372de3abd6fa2c1b1f5");
        } else {
            this.mBackingMap.put(str, Double.valueOf(d));
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putInt(@NonNull String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8876786744e08412f5e10b4b8b88cbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8876786744e08412f5e10b4b8b88cbd");
        } else {
            this.mBackingMap.put(str, new Double(i));
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putString(@NonNull String str, @Nullable String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54c01c57303805fe69a66d25561ed8da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54c01c57303805fe69a66d25561ed8da");
        } else {
            this.mBackingMap.put(str, str2);
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putNull(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f87f800b151c979d08c37ed9d07bc0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f87f800b151c979d08c37ed9d07bc0b");
        } else {
            this.mBackingMap.put(str, null);
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putMap(@NonNull String str, @Nullable ReadableMap readableMap) {
        Object[] objArr = {str, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db00e97311c1b475ce4cc16849f2b1fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db00e97311c1b475ce4cc16849f2b1fd");
        } else {
            this.mBackingMap.put(str, readableMap);
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void merge(@NonNull ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2d5d48dd0a239565e3a23345f813fe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2d5d48dd0a239565e3a23345f813fe3");
        } else {
            this.mBackingMap.putAll(((JavaOnlyMap) readableMap).mBackingMap);
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public WritableMap copy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0502c4886c7dbbbdef4df04d6e7f279", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0502c4886c7dbbbdef4df04d6e7f279");
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.merge(this);
        return javaOnlyMap;
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putArray(@NonNull String str, @Nullable WritableArray writableArray) {
        Object[] objArr = {str, writableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ec2bf5e529191b85cb46a00a6de480e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ec2bf5e529191b85cb46a00a6de480e");
        } else {
            putArray(str, (ReadableArray) writableArray);
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putMap(@NonNull String str, @Nullable WritableMap writableMap) {
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3266c3f23e306924436be238d055c08f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3266c3f23e306924436be238d055c08f");
        } else {
            putMap(str, (ReadableMap) writableMap);
        }
    }

    @Override // com.meituan.msc.jse.bridge.WritableMap
    public void putArray(@NonNull String str, @Nullable ReadableArray readableArray) {
        Object[] objArr = {str, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37ef21c83c4297e280c53518f27d64bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37ef21c83c4297e280c53518f27d64bb");
        } else {
            this.mBackingMap.put(str, readableArray);
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    @NonNull
    public HashMap<String, Object> toHashMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6cc6d10f485c99e918741ca48aff876", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6cc6d10f485c99e918741ca48aff876") : new HashMap<>(this.mBackingMap);
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92f27c611546b6dd0a4185a8ceef6581", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92f27c611546b6dd0a4185a8ceef6581") : this.mBackingMap.toString();
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ec88196d7a4326ce95677859ab015c8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ec88196d7a4326ce95677859ab015c8")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JavaOnlyMap javaOnlyMap = (JavaOnlyMap) obj;
        return this.mBackingMap == null ? javaOnlyMap.mBackingMap == null : this.mBackingMap.equals(javaOnlyMap.mBackingMap);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e76dd32f2ec95b4761ac358bc140b0dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e76dd32f2ec95b4761ac358bc140b0dc")).intValue();
        }
        if (this.mBackingMap != null) {
            return this.mBackingMap.hashCode();
        }
        return 0;
    }
}
