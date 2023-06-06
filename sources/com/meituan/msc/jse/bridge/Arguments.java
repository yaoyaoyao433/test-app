package com.meituan.msc.jse.bridge;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class Arguments {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static Object makeNativeObject(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "30bc7e31a639be50fed7ed7d89f420fe", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "30bc7e31a639be50fed7ed7d89f420fe");
        }
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Float) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short)) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj.getClass().isArray()) {
            return makeNativeArray(obj);
        }
        if (obj instanceof List) {
            return makeNativeArray((List) obj);
        }
        if (obj instanceof Map) {
            return makeNativeMap((Map) obj);
        }
        return obj instanceof Bundle ? makeNativeMap((Bundle) obj) : obj;
    }

    public static WritableArray makeNativeArray(List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4dcd008140db111a19ed077ccba5a459", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4dcd008140db111a19ed077ccba5a459");
        }
        MSCWritableArray mSCWritableArray = new MSCWritableArray();
        if (list == null) {
            return mSCWritableArray;
        }
        for (Object obj : list) {
            Object makeNativeObject = makeNativeObject(obj);
            if (makeNativeObject == null) {
                mSCWritableArray.pushNull();
            } else if (makeNativeObject instanceof Boolean) {
                mSCWritableArray.pushBoolean(((Boolean) makeNativeObject).booleanValue());
            } else if (makeNativeObject instanceof Integer) {
                mSCWritableArray.pushInt(((Integer) makeNativeObject).intValue());
            } else if (makeNativeObject instanceof Double) {
                mSCWritableArray.pushDouble(((Double) makeNativeObject).doubleValue());
            } else if (makeNativeObject instanceof String) {
                mSCWritableArray.pushString((String) makeNativeObject);
            } else if (makeNativeObject instanceof WritableArray) {
                mSCWritableArray.pushArray((WritableArray) makeNativeObject);
            } else if (makeNativeObject instanceof ReadableMap) {
                mSCWritableArray.pushMap((ReadableMap) makeNativeObject);
            } else {
                throw new IllegalArgumentException("Could not convert " + makeNativeObject.getClass());
            }
        }
        return mSCWritableArray;
    }

    public static <T> WritableArray makeNativeArray(final Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c3dad66e5ecf4ba5fd9290dd6f39c647", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c3dad66e5ecf4ba5fd9290dd6f39c647");
        }
        if (obj == null) {
            return new MSCWritableArray();
        }
        return makeNativeArray((List) new AbstractList() { // from class: com.meituan.msc.jse.bridge.Arguments.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e3a2b0a1b03906524a92dc826c445af1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e3a2b0a1b03906524a92dc826c445af1")).intValue() : Array.getLength(obj);
            }

            @Override // java.util.AbstractList, java.util.List
            public final Object get(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5bd496ccd85ad650c63569a90a008140", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5bd496ccd85ad650c63569a90a008140") : Array.get(obj, i);
            }
        });
    }

    private static void addEntry(WritableMap writableMap, String str, Object obj) {
        Object[] objArr = {writableMap, str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d74f4dff507a7592aaad60acf091e711", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d74f4dff507a7592aaad60acf091e711");
            return;
        }
        Object makeNativeObject = makeNativeObject(obj);
        if (makeNativeObject == null) {
            writableMap.putNull(str);
        } else if (makeNativeObject instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) makeNativeObject).booleanValue());
        } else if (makeNativeObject instanceof Integer) {
            writableMap.putInt(str, ((Integer) makeNativeObject).intValue());
        } else if (makeNativeObject instanceof Number) {
            writableMap.putDouble(str, ((Number) makeNativeObject).doubleValue());
        } else if (makeNativeObject instanceof String) {
            writableMap.putString(str, (String) makeNativeObject);
        } else if (makeNativeObject instanceof WritableArray) {
            writableMap.putArray(str, (WritableArray) makeNativeObject);
        } else if (makeNativeObject instanceof WritableMap) {
            writableMap.putMap(str, (WritableMap) makeNativeObject);
        } else {
            throw new IllegalArgumentException("Could not convert " + makeNativeObject.getClass());
        }
    }

    public static MSCWritableMap makeNativeMap(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cdabf79a316a412aa61e72103090dc8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCWritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cdabf79a316a412aa61e72103090dc8a");
        }
        MSCWritableMap mSCWritableMap = new MSCWritableMap();
        if (map == null) {
            return mSCWritableMap;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            addEntry(mSCWritableMap, entry.getKey(), entry.getValue());
        }
        return mSCWritableMap;
    }

    public static MSCWritableMap makeNativeMap(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d4129d63685b9a94f63389da66f2952b", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCWritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d4129d63685b9a94f63389da66f2952b");
        }
        MSCWritableMap mSCWritableMap = new MSCWritableMap();
        if (bundle == null) {
            return mSCWritableMap;
        }
        for (String str : bundle.keySet()) {
            addEntry(mSCWritableMap, str, bundle.get(str));
        }
        return mSCWritableMap;
    }

    public static WritableArray createArray() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "78ecf2f4e3d39bab1b62431e7f9f4103", RobustBitConfig.DEFAULT_VALUE) ? (WritableArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "78ecf2f4e3d39bab1b62431e7f9f4103") : new MSCWritableArray();
    }

    public static WritableMap createMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3ffc340fd741fc847c0f1cfa9857d989", RobustBitConfig.DEFAULT_VALUE) ? (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3ffc340fd741fc847c0f1cfa9857d989") : new MSCWritableMap();
    }

    public static WritableArray fromJavaArgs(Object[] objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ce1ac63fff3c2da8c8dc46c8e385d596", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableArray) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ce1ac63fff3c2da8c8dc46c8e385d596");
        }
        MSCWritableArray mSCWritableArray = new MSCWritableArray();
        for (Object obj : objArr) {
            if (obj == null) {
                mSCWritableArray.pushNull();
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class) {
                    mSCWritableArray.pushBoolean(((Boolean) obj).booleanValue());
                } else if (cls == Integer.class) {
                    mSCWritableArray.pushDouble(((Integer) obj).doubleValue());
                } else if (cls == Double.class) {
                    mSCWritableArray.pushDouble(((Double) obj).doubleValue());
                } else if (cls == Float.class) {
                    mSCWritableArray.pushDouble(((Float) obj).doubleValue());
                } else if (cls == String.class) {
                    mSCWritableArray.pushString(obj.toString());
                } else if (cls == MSCWritableMap.class) {
                    mSCWritableArray.pushMap((WritableMap) obj);
                } else if (cls == MSCWritableArray.class) {
                    mSCWritableArray.pushArray((WritableArray) obj);
                } else {
                    throw new RuntimeException("Cannot convert argument of type " + cls);
                }
            }
        }
        return mSCWritableArray;
    }

    @NonNull
    public static JSONArray getJSArgs(Object[] objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c65beff64946a2fa1862896e637504b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c65beff64946a2fa1862896e637504b6");
        }
        JSONArray jSONArray = new JSONArray();
        if (objArr == null) {
            return jSONArray;
        }
        for (Object obj : objArr) {
            try {
                if (obj != null) {
                    Class<?> cls = obj.getClass();
                    if (cls == Boolean.class) {
                        jSONArray.put(((Boolean) obj).booleanValue());
                    } else if (cls == Integer.class) {
                        jSONArray.put(((Integer) obj).doubleValue());
                    } else if (cls == Double.class) {
                        jSONArray.put(((Double) obj).doubleValue());
                    } else if (cls == Float.class) {
                        jSONArray.put(((Float) obj).doubleValue());
                    } else if (cls == String.class) {
                        jSONArray.put(obj.toString());
                    } else if (cls == MSCWritableMap.class) {
                        jSONArray.put(((MSCWritableMap) obj).getRealData());
                    } else if (cls == MSCWritableArray.class) {
                        jSONArray.put(((MSCWritableArray) obj).getRealData());
                    } else if (cls == JSONObject.class) {
                        jSONArray.put((JSONObject) obj);
                    } else if (cls == JSONArray.class) {
                        jSONArray.put((JSONArray) obj);
                    } else {
                        throw new RuntimeException("Cannot convert argument of type " + cls);
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray;
    }

    public static WritableArray fromArray(Object obj) {
        int i = 0;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5b818cdb6499fd5c6b088bab2367e298", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5b818cdb6499fd5c6b088bab2367e298");
        }
        WritableArray createArray = createArray();
        if (obj instanceof String[]) {
            String[] strArr = (String[]) obj;
            int length = strArr.length;
            while (i < length) {
                createArray.pushString(strArr[i]);
                i++;
            }
        } else if (obj instanceof Bundle[]) {
            Bundle[] bundleArr = (Bundle[]) obj;
            int length2 = bundleArr.length;
            while (i < length2) {
                createArray.pushMap(fromBundle(bundleArr[i]));
                i++;
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            while (i < length3) {
                createArray.pushInt(iArr[i]);
                i++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length4 = fArr.length;
            while (i < length4) {
                createArray.pushDouble(fArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length5 = dArr.length;
            while (i < length5) {
                createArray.pushDouble(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length6 = zArr.length;
            while (i < length6) {
                createArray.pushBoolean(zArr[i]);
                i++;
            }
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            int length7 = parcelableArr.length;
            while (i < length7) {
                Parcelable parcelable = parcelableArr[i];
                if (parcelable instanceof Bundle) {
                    createArray.pushMap(fromBundle((Bundle) parcelable));
                    i++;
                } else {
                    throw new IllegalArgumentException("Unexpected array member type " + parcelable.getClass());
                }
            }
        } else {
            throw new IllegalArgumentException("Unknown array type " + obj.getClass());
        }
        return createArray;
    }

    public static WritableArray fromList(List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c6bee81e9fe9b7c385f6257bafef7853", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c6bee81e9fe9b7c385f6257bafef7853");
        }
        WritableArray createArray = createArray();
        for (Object obj : list) {
            if (obj == null) {
                createArray.pushNull();
            } else if (obj.getClass().isArray()) {
                createArray.pushArray(fromArray(obj));
            } else if (obj instanceof Bundle) {
                createArray.pushMap(fromBundle((Bundle) obj));
            } else if (obj instanceof List) {
                createArray.pushArray(fromList((List) obj));
            } else if (obj instanceof String) {
                createArray.pushString((String) obj);
            } else if (obj instanceof Integer) {
                createArray.pushInt(((Integer) obj).intValue());
            } else if (obj instanceof Number) {
                createArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                createArray.pushBoolean(((Boolean) obj).booleanValue());
            } else {
                throw new IllegalArgumentException("Unknown value type " + obj.getClass());
            }
        }
        return createArray;
    }

    public static WritableMap fromBundle(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d3075668b3d1c47380b08d0deb23a976", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d3075668b3d1c47380b08d0deb23a976");
        }
        WritableMap createMap = createMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj == null) {
                createMap.putNull(str);
            } else if (obj.getClass().isArray()) {
                createMap.putArray(str, fromArray(obj));
            } else if (obj instanceof String) {
                createMap.putString(str, (String) obj);
            } else if (obj instanceof Number) {
                if (obj instanceof Integer) {
                    createMap.putInt(str, ((Integer) obj).intValue());
                } else {
                    createMap.putDouble(str, ((Number) obj).doubleValue());
                }
            } else if (obj instanceof Boolean) {
                createMap.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Bundle) {
                createMap.putMap(str, fromBundle((Bundle) obj));
            } else if (obj instanceof List) {
                createMap.putArray(str, fromList((List) obj));
            } else {
                throw new IllegalArgumentException("Could not convert " + obj.getClass());
            }
        }
        return createMap;
    }

    @Nullable
    public static ArrayList toList(@Nullable ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9cc6d8bd50d303d38bec0206ef93df13", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9cc6d8bd50d303d38bec0206ef93df13");
        }
        if (readableArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (readableArray.getType(i)) {
                case Null:
                    arrayList.add(null);
                    break;
                case Boolean:
                    arrayList.add(Boolean.valueOf(readableArray.getBoolean(i)));
                    break;
                case Number:
                    double d = readableArray.getDouble(i);
                    if (d == Math.rint(d)) {
                        arrayList.add(Integer.valueOf((int) d));
                        break;
                    } else {
                        arrayList.add(Double.valueOf(d));
                        break;
                    }
                case String:
                    arrayList.add(readableArray.getString(i));
                    break;
                case Map:
                    arrayList.add(toBundle(readableArray.getMap(i)));
                    break;
                case Array:
                    arrayList.add(toList(readableArray.getArray(i)));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object in array.");
            }
        }
        return arrayList;
    }

    @Nullable
    public static Bundle toBundle(@Nullable ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "af6bed326f830a1bf3c8bcfd1b1041e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "af6bed326f830a1bf3c8bcfd1b1041e0");
        }
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        Bundle bundle = new Bundle();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (readableMap.getType(nextKey)) {
                case Null:
                    bundle.putString(nextKey, null);
                    break;
                case Boolean:
                    bundle.putBoolean(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case Number:
                    bundle.putDouble(nextKey, readableMap.getDouble(nextKey));
                    break;
                case String:
                    bundle.putString(nextKey, readableMap.getString(nextKey));
                    break;
                case Map:
                    bundle.putBundle(nextKey, toBundle(readableMap.getMap(nextKey)));
                    break;
                case Array:
                    bundle.putSerializable(nextKey, toList(readableMap.getArray(nextKey)));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object with key: " + nextKey + CommonConstant.Symbol.DOT);
            }
        }
        return bundle;
    }
}
