package com.huawei.updatesdk.a.b.c.c;

import com.huawei.updatesdk.a.a.d.f;
import com.huawei.updatesdk.service.appmgr.bean.SDKNetTransmission;
import com.meituan.robust.Constants;
import com.meituan.robust.common.CommonConstant;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class b {
    private static final char COMMA = ',';
    private static final String END_FLAG = "_";
    private static final String TAG = "b";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements PrivilegedAction {
        private Field a;

        a(Field field) {
            this.a = field;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            this.a.setAccessible(true);
            return null;
        }
    }

    private String arrayToJson(Object obj) {
        int length = Array.getLength(obj);
        if (length <= 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < length; i++) {
            String valueToJson = valueToJson(Array.get(obj, i));
            if (valueToJson != null) {
                sb.append(valueToJson);
                sb.append(COMMA);
            }
        }
        formatJsonStr(sb);
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return sb.toString();
    }

    private void formatJsonStr(StringBuilder sb) {
        int length = sb.length();
        if (length > 0) {
            int i = length - 1;
            if (sb.charAt(i) == ',') {
                sb.delete(i, length);
            }
        }
    }

    private boolean isPrimitiveObj(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Boolean) || (obj instanceof Float) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Short);
    }

    private Object jsonBeanFromJson(Class cls, Object obj) {
        b bVar = (b) cls.newInstance();
        bVar.fromJson((JSONObject) obj);
        return bVar;
    }

    private String mapToJson(Map map) {
        if (map.size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(CommonConstant.Symbol.BIG_BRACKET_LEFT);
        Iterator it = map.entrySet().iterator();
        while (true) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String valueToJson = valueToJson(entry.getValue());
            if (valueToJson != null) {
                sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
                sb.append(str);
                sb.append("\":");
                sb.append(valueToJson);
            }
            if (!it.hasNext()) {
                sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
                return sb.toString();
            } else if (valueToJson != null) {
                sb.append(COMMA);
            }
        }
    }

    private void processValueError(Field field, Object obj) {
        if (obj == null || !(obj instanceof String)) {
            return;
        }
        try {
            Class<?> type = field.getType();
            if (type.isPrimitive()) {
                String name = type.getName();
                if ("int".equals(name)) {
                    field.set(this, Integer.valueOf(Integer.parseInt((String) obj)));
                } else if ("float".equals(name)) {
                    field.set(this, Float.valueOf(Float.parseFloat((String) obj)));
                } else if (Constants.LONG.equals(name)) {
                    field.set(this, Long.valueOf(Long.parseLong((String) obj)));
                } else if (Constants.BOOLEAN.equals(name)) {
                    field.set(this, Boolean.valueOf(Boolean.parseBoolean((String) obj)));
                } else if (Constants.DOUBLE.equals(name)) {
                    field.set(this, Double.valueOf(Double.parseDouble((String) obj)));
                } else if (Constants.SHORT.equals(name)) {
                    field.set(this, Short.valueOf(Short.parseShort((String) obj)));
                } else if (Constants.BYTE.equals(name)) {
                    field.set(this, Byte.valueOf(Byte.parseByte((String) obj)));
                } else if (Constants.CHAR.equals(name)) {
                    field.set(this, Character.valueOf(((String) obj).charAt(0)));
                }
            }
        } catch (IllegalAccessException e) {
            String str = TAG;
            com.huawei.updatesdk.a.a.c.a.a.a.b(str, "processValueError Throwable:" + e.getMessage());
        }
    }

    private Object valueFromJson(Class cls, Class cls2, Object obj) {
        if (cls.isPrimitive() || cls.equals(String.class)) {
            return ("float".equals(cls.getName()) && (obj instanceof Double)) ? Float.valueOf(((Double) obj).floatValue()) : obj;
        } else if (List.class.isAssignableFrom(cls)) {
            return listFromJson(cls2, obj);
        } else {
            if (b.class.isAssignableFrom(cls)) {
                if (cls.equals(b.class)) {
                    throw new IllegalArgumentException("error type, type:" + cls);
                }
                return jsonBeanFromJson(cls, obj);
            } else if (Map.class.isAssignableFrom(cls)) {
                return mapFromJson(cls2, obj);
            } else {
                throw new IllegalArgumentException("unsupport type, Type:" + cls);
            }
        }
    }

    private String valueToJson(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return JSONObject.quote(obj.toString());
        }
        if (isPrimitiveObj(obj)) {
            return String.valueOf(obj);
        }
        if (obj instanceof b) {
            return ((b) obj).toJson();
        }
        if (obj instanceof List) {
            return listToJson((List) obj);
        }
        if (obj instanceof Map) {
            return mapToJson((Map) obj);
        }
        if (obj.getClass().isArray()) {
            return arrayToJson(obj);
        }
        return null;
    }

    public void fromJson(JSONObject jSONObject) {
        Field[] a2 = f.a(getClass());
        Object obj = null;
        for (int i = 0; i < a2.length; i++) {
            AccessController.doPrivileged(new a(a2[i]));
            String name = a2[i].getName();
            if (a2[i].isAnnotationPresent(SDKNetTransmission.class) || name.endsWith("_")) {
                if (name.endsWith("_")) {
                    name = name.substring(0, name.length() - 1);
                }
                if (jSONObject.has(name)) {
                    Object obj2 = jSONObject.get(name);
                    if (!JSONObject.NULL.equals(obj2)) {
                        try {
                            Object valueFromJson = valueFromJson(a2[i].getType(), f.a(a2[i]), obj2);
                            try {
                                a2[i].set(this, valueFromJson);
                                obj = valueFromJson;
                            } catch (Exception e) {
                                e = e;
                                obj = valueFromJson;
                                com.huawei.updatesdk.a.a.a.a(TAG, getClass().getName() + ".fromJson error, fieldName:" + name + e.toString());
                                processValueError(a2[i], obj);
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                    }
                }
            }
        }
    }

    protected Object listFromJson(Class cls, Object obj) {
        if (cls != null) {
            if (!(obj instanceof JSONArray)) {
                throw new IllegalArgumentException("jsonobject is not JSONArray, jsonValue:" + obj);
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = (JSONArray) obj;
            for (int i = 0; i < jSONArray.length(); i++) {
                Object valueFromJson = valueFromJson(cls, null, jSONArray.get(i));
                if (valueFromJson != null) {
                    if (cls.equals(valueFromJson.getClass())) {
                        arrayList.add(valueFromJson);
                    } else {
                        String str = TAG;
                        com.huawei.updatesdk.a.a.c.a.a.a.b(str, "listFromJson error, memberClass:" + cls + ", valueClass:" + valueFromJson.getClass());
                    }
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("generic type is null");
    }

    protected String listToJson(List list) {
        if (list.size() <= 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            String valueToJson = valueToJson(list.get(i));
            if (valueToJson != null) {
                sb.append(valueToJson);
                sb.append(COMMA);
            }
        }
        formatJsonStr(sb);
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return sb.toString();
    }

    protected Object mapFromJson(Class cls, Object obj) {
        if (cls != null) {
            if (!(obj instanceof JSONObject)) {
                throw new IllegalArgumentException("jsonobject is not JSONObject, jsonValue:" + obj);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object valueFromJson = valueFromJson(cls, null, jSONObject.get(next));
                if (valueFromJson != null) {
                    if (cls.equals(valueFromJson.getClass())) {
                        linkedHashMap.put(next, valueFromJson);
                    } else {
                        String str = TAG;
                        com.huawei.updatesdk.a.a.c.a.a.a.b(str, "mapFromJson error, memberClass:" + cls + ", valueClass:" + valueFromJson.getClass());
                    }
                }
            }
            return linkedHashMap;
        }
        throw new IllegalArgumentException("generic type is null");
    }

    public String toJson() {
        Field[] a2 = f.a(getClass());
        if (a2.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(CommonConstant.Symbol.BIG_BRACKET_LEFT);
        for (int i = 0; i < a2.length; i++) {
            AccessController.doPrivileged(new a(a2[i]));
            String name = a2[i].getName();
            if (a2[i].isAnnotationPresent(SDKNetTransmission.class) || (name != null && name.endsWith("_"))) {
                if (name.endsWith("_")) {
                    name = name.substring(0, name.length() - 1);
                }
                String valueToJson = valueToJson(a2[i].get(this));
                if (valueToJson != null) {
                    sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
                    sb.append(name);
                    sb.append("\":");
                    sb.append(valueToJson);
                    sb.append(COMMA);
                }
            }
        }
        formatJsonStr(sb);
        sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        return sb.toString();
    }
}
