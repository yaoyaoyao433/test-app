package com.meituan.msc.jse.bridge;

import android.os.Bundle;
import android.os.Parcelable;
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
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RNArguments {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static Object makeNativeObject(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "89a96ccc166e0ee9770295cd32061977", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "89a96ccc166e0ee9770295cd32061977");
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

    public static WritableNativeArray makeNativeArray(List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "32c80887a75db3006f95d1e79c10ef11", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableNativeArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "32c80887a75db3006f95d1e79c10ef11");
        }
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (list == null) {
            return writableNativeArray;
        }
        for (Object obj : list) {
            Object makeNativeObject = makeNativeObject(obj);
            if (makeNativeObject == null) {
                writableNativeArray.pushNull();
            } else if (makeNativeObject instanceof Boolean) {
                writableNativeArray.pushBoolean(((Boolean) makeNativeObject).booleanValue());
            } else if (makeNativeObject instanceof Integer) {
                writableNativeArray.pushInt(((Integer) makeNativeObject).intValue());
            } else if (makeNativeObject instanceof Double) {
                writableNativeArray.pushDouble(((Double) makeNativeObject).doubleValue());
            } else if (makeNativeObject instanceof String) {
                writableNativeArray.pushString((String) makeNativeObject);
            } else if (makeNativeObject instanceof WritableNativeArray) {
                writableNativeArray.pushArray((WritableArray) ((WritableNativeArray) makeNativeObject));
            } else if (makeNativeObject instanceof WritableNativeMap) {
                writableNativeArray.pushMap((WritableMap) ((WritableNativeMap) makeNativeObject));
            } else {
                throw new IllegalArgumentException("Could not convert " + makeNativeObject.getClass());
            }
        }
        return writableNativeArray;
    }

    public static <T> WritableNativeArray makeNativeArray(final Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b344ed8c7680d64493a69c1597c9de2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableNativeArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b344ed8c7680d64493a69c1597c9de2e");
        }
        if (obj == null) {
            return new WritableNativeArray();
        }
        return makeNativeArray((List) new AbstractList() { // from class: com.meituan.msc.jse.bridge.RNArguments.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2e1c2c1453ccacfbf474a9b155692356", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2e1c2c1453ccacfbf474a9b155692356")).intValue() : Array.getLength(obj);
            }

            @Override // java.util.AbstractList, java.util.List
            public final Object get(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bf822d915923ba4be443bcd8e30bb3ca", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bf822d915923ba4be443bcd8e30bb3ca") : Array.get(obj, i);
            }
        });
    }

    private static void addEntry(WritableNativeMap writableNativeMap, String str, Object obj) {
        Object[] objArr = {writableNativeMap, str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fa4fe61ca68cdf8f0ca06eebeeab2b66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fa4fe61ca68cdf8f0ca06eebeeab2b66");
            return;
        }
        Object makeNativeObject = makeNativeObject(obj);
        if (makeNativeObject == null) {
            writableNativeMap.putNull(str);
        } else if (makeNativeObject instanceof Boolean) {
            writableNativeMap.putBoolean(str, ((Boolean) makeNativeObject).booleanValue());
        } else if (makeNativeObject instanceof Integer) {
            writableNativeMap.putInt(str, ((Integer) makeNativeObject).intValue());
        } else if (makeNativeObject instanceof Number) {
            writableNativeMap.putDouble(str, ((Number) makeNativeObject).doubleValue());
        } else if (makeNativeObject instanceof String) {
            writableNativeMap.putString(str, (String) makeNativeObject);
        } else if (makeNativeObject instanceof WritableNativeArray) {
            writableNativeMap.putArray(str, (WritableArray) ((WritableNativeArray) makeNativeObject));
        } else if (makeNativeObject instanceof WritableNativeMap) {
            writableNativeMap.putMap(str, (WritableMap) ((WritableNativeMap) makeNativeObject));
        } else {
            throw new IllegalArgumentException("Could not convert " + makeNativeObject.getClass());
        }
    }

    public static WritableNativeMap makeNativeMap(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "39ad4ba879d0a2cca36f9f9fb7011a98", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableNativeMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "39ad4ba879d0a2cca36f9f9fb7011a98");
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (map == null) {
            return writableNativeMap;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            addEntry(writableNativeMap, entry.getKey(), entry.getValue());
        }
        return writableNativeMap;
    }

    public static WritableNativeMap makeNativeMap(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c6ccd1adb548d523b207379f18bdddec", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableNativeMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c6ccd1adb548d523b207379f18bdddec");
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (bundle == null) {
            return writableNativeMap;
        }
        for (String str : bundle.keySet()) {
            addEntry(writableNativeMap, str, bundle.get(str));
        }
        return writableNativeMap;
    }

    public static WritableArray createArray() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "67ee8508ce15d70eab965c22b99716fe", RobustBitConfig.DEFAULT_VALUE) ? (WritableArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "67ee8508ce15d70eab965c22b99716fe") : new WritableNativeArray();
    }

    public static WritableMap createMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "537aa029efd91011d20c3d1f5229e779", RobustBitConfig.DEFAULT_VALUE) ? (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "537aa029efd91011d20c3d1f5229e779") : new WritableNativeMap();
    }

    public static WritableNativeArray fromJavaArgs(Object[] objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3c239937da9426e849b59728bf65ceab", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableNativeArray) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3c239937da9426e849b59728bf65ceab");
        }
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (Object obj : objArr) {
            if (obj == null) {
                writableNativeArray.pushNull();
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class) {
                    writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
                } else if (cls == Integer.class) {
                    writableNativeArray.pushDouble(((Integer) obj).doubleValue());
                } else if (cls == Double.class) {
                    writableNativeArray.pushDouble(((Double) obj).doubleValue());
                } else if (cls == Float.class) {
                    writableNativeArray.pushDouble(((Float) obj).doubleValue());
                } else if (cls == String.class) {
                    writableNativeArray.pushString(obj.toString());
                } else if (cls == WritableNativeMap.class) {
                    writableNativeArray.pushMap((WritableMap) ((WritableNativeMap) obj));
                } else if (cls == WritableNativeArray.class) {
                    writableNativeArray.pushArray((WritableArray) ((WritableNativeArray) obj));
                } else {
                    throw new RuntimeException("Cannot convert argument of type " + cls);
                }
            }
        }
        return writableNativeArray;
    }

    public static WritableArray fromArray(Object obj) {
        int i = 0;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "19a9164236b623d83b8f8dd022b2582d", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "19a9164236b623d83b8f8dd022b2582d");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "df21320df8dbb84704ddcd92d7c3d98a", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "df21320df8dbb84704ddcd92d7c3d98a");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1a95430fd73783d409947953430f3e2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1a95430fd73783d409947953430f3e2e");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "173f3c73de9164becf5884fcc2b88013", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "173f3c73de9164becf5884fcc2b88013");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "669ee68885e9d5f41fc3af16fa6c376b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "669ee68885e9d5f41fc3af16fa6c376b");
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
