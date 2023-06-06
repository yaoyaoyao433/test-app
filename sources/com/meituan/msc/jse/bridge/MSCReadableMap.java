package com.meituan.msc.jse.bridge;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.infer.annotation.a;
import com.meituan.msc.jse.common.annotations.DoNotStrip;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public class MSCReadableMap implements ReadableMap {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private HashMap<String, Object> mLocalMap;
    @Nullable
    private HashMap<String, ReadableType> mLocalTypeMap;
    protected JSONObject object;

    public MSCReadableMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7371e35710e2abc8befb7fc573a5efa4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7371e35710e2abc8befb7fc573a5efa4");
        } else {
            this.object = new JSONObject();
        }
    }

    public MSCReadableMap(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a86bc1add2a148ae287b95a1f759a8b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a86bc1add2a148ae287b95a1f759a8b");
        } else if (jSONObject == null) {
            throw new RuntimeException("object should not be null");
        } else {
            this.object = jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public HashMap<String, Object> getLocalMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb7c5c451cdf76c6aeb5822c33ec2dbb", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb7c5c451cdf76c6aeb5822c33ec2dbb");
        }
        if (this.mLocalMap != null) {
            return this.mLocalMap;
        }
        synchronized (this) {
            if (this.mLocalMap == null) {
                this.mLocalMap = new HashMap<>();
                this.mLocalTypeMap = new HashMap<>();
                Iterator<String> keys = this.object.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt = this.object.opt(next);
                    if (opt != null && !this.object.isNull(next)) {
                        if (opt instanceof String) {
                            this.mLocalMap.put(next, (String) opt);
                            this.mLocalTypeMap.put(next, ReadableType.String);
                        } else if (opt instanceof Boolean) {
                            this.mLocalMap.put(next, (Boolean) opt);
                            this.mLocalTypeMap.put(next, ReadableType.Boolean);
                        } else if (opt instanceof Number) {
                            this.mLocalMap.put(next, Double.valueOf(((Number) opt).doubleValue()));
                            this.mLocalTypeMap.put(next, ReadableType.Number);
                        } else if (opt instanceof JSONObject) {
                            this.mLocalMap.put(next, new MSCReadableMap((JSONObject) opt));
                            this.mLocalTypeMap.put(next, ReadableType.Map);
                        } else if (opt instanceof JSONArray) {
                            this.mLocalMap.put(next, new MSCReadableArray((JSONArray) opt));
                            this.mLocalTypeMap.put(next, ReadableType.Array);
                        } else {
                            throw new IllegalArgumentException("Could not convert object with key: " + next + CommonConstant.Symbol.DOT);
                        }
                    }
                    this.mLocalMap.put(next, null);
                    this.mLocalTypeMap.put(next, ReadableType.Null);
                }
            }
        }
        return this.mLocalMap;
    }

    @NonNull
    private HashMap<String, ReadableType> getLocalTypeMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cb2ffbf3bda118807a96914bb7aaf17", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cb2ffbf3bda118807a96914bb7aaf17");
        }
        if (this.mLocalTypeMap != null) {
            return this.mLocalTypeMap;
        }
        synchronized (this) {
            getLocalMap();
        }
        return this.mLocalTypeMap;
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    public boolean hasKey(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40ce8938f3ad53b2bb1d0913fb76af98", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40ce8938f3ad53b2bb1d0913fb76af98")).booleanValue() : getLocalMap().containsKey(str);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    public boolean isNull(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ccf906a3fcfd73f1d1e620f85dc01b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ccf906a3fcfd73f1d1e620f85dc01b5")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8f2a50f9ef9710714dabdc266477494", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8f2a50f9ef9710714dabdc266477494");
        }
        if (hasKey(str) && !isNull(str)) {
            return a.a(getLocalMap().get(str));
        }
        throw new NoSuchKeyException(str);
    }

    private <T> T getValue(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d398bb075cac65aae2055fd07cca58d", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d398bb075cac65aae2055fd07cca58d");
        }
        T t = (T) getValue(str);
        checkInstance(str, t, cls);
        return t;
    }

    @Nullable
    private Object getNullableValue(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd83be558bad29edef2f859154d44569", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd83be558bad29edef2f859154d44569");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba3906839979f5964480859c7cb3ff8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba3906839979f5964480859c7cb3ff8f");
        }
        T t = (T) getNullableValue(str);
        checkInstance(str, t, cls);
        return t;
    }

    private void checkInstance(String str, Object obj, Class cls) {
        Object[] objArr = {str, obj, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01f52ced53d1d43ae29219a6750ee31e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01f52ced53d1d43ae29219a6750ee31e");
        } else if (obj == null || cls.isInstance(obj)) {
        } else {
            throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + obj.getClass().getSimpleName() + " to " + cls.getSimpleName());
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    public boolean getBoolean(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2de3e054e92a7296e18474583702bb9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2de3e054e92a7296e18474583702bb9")).booleanValue() : ((Boolean) getValue(str, Boolean.class)).booleanValue();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    public double getDouble(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a02b4aa183fd7d2afdf2b2a9dafec7df", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a02b4aa183fd7d2afdf2b2a9dafec7df")).doubleValue() : ((Double) getValue(str, Double.class)).doubleValue();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    public int getInt(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "850dfb51bc31abda0a48d656287b6ea3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "850dfb51bc31abda0a48d656287b6ea3")).intValue() : ((Double) getValue(str, Double.class)).intValue();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    @Nullable
    public String getString(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0af6d9909b58d7b81881fa98d93027a4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0af6d9909b58d7b81881fa98d93027a4") : (String) getNullableValue(str, String.class);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    @Nullable
    public MSCReadableArray getArray(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "891efdff518e7630675cee54e6d8feb7", RobustBitConfig.DEFAULT_VALUE) ? (MSCReadableArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "891efdff518e7630675cee54e6d8feb7") : (MSCReadableArray) getNullableValue(str, MSCReadableArray.class);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    @Nullable
    public MSCReadableMap getMap(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2650bf2ba798fc48f388d7bbc25dddd4", RobustBitConfig.DEFAULT_VALUE) ? (MSCReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2650bf2ba798fc48f388d7bbc25dddd4") : (MSCReadableMap) getNullableValue(str, MSCReadableMap.class);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    @NonNull
    public ReadableType getType(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a86992e46868370f0bdb413ec7ea1464", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadableType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a86992e46868370f0bdb413ec7ea1464");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f791a3ab7e7deb57df1e0f82f3a40f63", RobustBitConfig.DEFAULT_VALUE) ? (Dynamic) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f791a3ab7e7deb57df1e0f82f3a40f63") : DynamicFromMap.create(this, str);
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    @NonNull
    public Iterator<Map.Entry<String, Object>> getEntryIterator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f283d2f56b1956839d2f79ea251dd6a1", RobustBitConfig.DEFAULT_VALUE) ? (Iterator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f283d2f56b1956839d2f79ea251dd6a1") : getLocalMap().entrySet().iterator();
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    @NonNull
    public ReadableMapKeySetIterator keySetIterator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bae6e64cfbf796c8b681362b0f0ed322", RobustBitConfig.DEFAULT_VALUE) ? (ReadableMapKeySetIterator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bae6e64cfbf796c8b681362b0f0ed322") : new MSCReadableMapKeySetIterator(this);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5bbc57e40cb09863bb6a31fd38ecee0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5bbc57e40cb09863bb6a31fd38ecee0")).intValue() : getLocalMap().hashCode();
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d44fa95acf28916361fe96801a6a669c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d44fa95acf28916361fe96801a6a669c")).booleanValue();
        }
        if (obj instanceof MSCReadableMap) {
            return getLocalMap().equals(((MSCReadableMap) obj).getLocalMap());
        }
        return false;
    }

    @Override // com.meituan.msc.jse.bridge.ReadableMap
    @NonNull
    public HashMap<String, Object> toHashMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e3a15dcbe49a1a2fa24ca0e8c45463a", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e3a15dcbe49a1a2fa24ca0e8c45463a");
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
                    hashMap.put(str, ((MSCReadableMap) a.a(getMap(str))).toHashMap());
                    break;
                case Array:
                    hashMap.put(str, ((MSCReadableArray) a.a(getArray(str))).toArrayList());
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object with key: " + str + CommonConstant.Symbol.DOT);
            }
        }
        return hashMap;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class MSCReadableMapKeySetIterator implements ReadableMapKeySetIterator {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final Iterator<String> mIterator;

        public MSCReadableMapKeySetIterator(MSCReadableMap mSCReadableMap) {
            this.mIterator = mSCReadableMap.getLocalMap().keySet().iterator();
        }

        @Override // com.meituan.msc.jse.bridge.ReadableMapKeySetIterator
        public boolean hasNextKey() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8c82f32c7085963b8c4dba5f2e8ac25", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8c82f32c7085963b8c4dba5f2e8ac25")).booleanValue() : this.mIterator.hasNext();
        }

        @Override // com.meituan.msc.jse.bridge.ReadableMapKeySetIterator
        public String nextKey() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d680a5739d9ca0502671068f3ece2c98", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d680a5739d9ca0502671068f3ece2c98") : this.mIterator.next();
        }
    }

    public JSONObject getRealData() {
        return this.object;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2960f7886e94e8b216d7bf1ebfaf426", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2960f7886e94e8b216d7bf1ebfaf426") : this.object == null ? "" : this.object.toString();
    }
}
