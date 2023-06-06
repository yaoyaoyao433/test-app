package com.tencent.map.tools.json;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.tools.Util;
import com.tencent.map.tools.json.JsonParser;
import com.tencent.map.tools.json.annotation.Json;
import com.tencent.map.tools.json.annotation.JsonType;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class JsonComposer implements JsonEncoder, JsonParser {
    private static Map<Class, Map<Field, String>> sClassJsonMap = new ConcurrentHashMap();
    private String mFieldNamePrefix;
    private Map<Field, String> mJsonFields;
    private FieldNameStyle mFieldNameStyle = FieldNameStyle.HUMP;
    private boolean mAllowEmpty = true;
    private Map<Field, JsonParser.Deserializer> mFieldDeserializer = new HashMap();
    private Map<Class, JsonParser.Deserializer> mClassDeserializer = new HashMap();

    protected boolean onEachItemParse(String str, Object obj) {
        return false;
    }

    protected boolean onEachItemToJson(JSONObject jSONObject, String str, Object obj) {
        return false;
    }

    @Override // com.tencent.map.tools.json.JsonEncoder
    public JSONObject toJson() {
        Object obj;
        checkJsonComposerElements();
        Set<Map.Entry<Field, String>> entrySet = this.mJsonFields.entrySet();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Field, String> entry : entrySet) {
            Field key = entry.getKey();
            key.setAccessible(true);
            Class<?> type = key.getType();
            try {
                obj = key.get(this);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                obj = null;
            }
            if (!onEachItemToJson(jSONObject, entry.getValue(), obj)) {
                if (Collection.class.isAssignableFrom(type)) {
                    try {
                        Collection collection = (Collection) key.get(this);
                        JSONArray jSONArray = new JSONArray();
                        if (collection != null && !collection.isEmpty()) {
                            for (Object obj2 : collection) {
                                if (obj2 instanceof JsonEncoder) {
                                    jSONArray.put(JsonUtils.modelToJson(obj2));
                                }
                            }
                        }
                        String value = entry.getValue();
                        if (!this.mAllowEmpty && (collection == null || collection.isEmpty())) {
                            jSONArray = null;
                        }
                        jSONObject.put(value, jSONArray);
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                } else {
                    try {
                        Object obj3 = key.get(this);
                        if (obj3 instanceof Double) {
                            jSONObject.put(entry.getValue(), ((Double) obj3).doubleValue());
                        } else if (obj3 instanceof Long) {
                            jSONObject.put(entry.getValue(), ((Long) obj3).longValue());
                        } else if (obj3 instanceof Integer) {
                            jSONObject.put(entry.getValue(), ((Integer) obj3).intValue());
                        } else if (obj3 instanceof Boolean) {
                            jSONObject.put(entry.getValue(), ((Boolean) obj3).booleanValue());
                        } else if (obj3 instanceof JsonEncoder) {
                            jSONObject.put(entry.getValue(), JsonUtils.modelToJson(obj3));
                        } else if (obj3 != null && obj3.getClass().isArray()) {
                            if (Build.VERSION.SDK_INT >= 19) {
                                jSONObject.put(entry.getValue(), new JSONArray(obj3));
                            } else {
                                int length = Array.getLength(obj3);
                                JSONArray jSONArray2 = new JSONArray();
                                for (int i = 0; i < length; i++) {
                                    jSONArray2.put(i, Array.get(obj3, i));
                                }
                                jSONObject.put(entry.getValue(), jSONArray2);
                            }
                        } else {
                            String value2 = entry.getValue();
                            if (obj3 == null && this.mAllowEmpty) {
                                obj3 = "";
                            }
                            jSONObject.put(value2, obj3);
                        }
                    } catch (IllegalAccessException e4) {
                        e4.printStackTrace();
                    } catch (JSONException e5) {
                        e5.printStackTrace();
                    }
                }
            }
        }
        return jSONObject;
    }

    @Override // com.tencent.map.tools.json.JsonParser
    public void parse(JSONObject jSONObject) {
        Class findClass;
        checkJsonComposerElements();
        JsonParser.Deserializer deserializer = this.mClassDeserializer.get(getClass());
        if (deserializer != null) {
            try {
                deserializer.deserialize(this, getClass().getName(), jSONObject);
                return;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        for (Map.Entry<Field, String> entry : this.mJsonFields.entrySet()) {
            Field key = entry.getKey();
            key.setAccessible(true);
            Class<?> type = key.getType();
            Object opt = jSONObject.opt(entry.getValue());
            JsonParser.Deserializer deserializer2 = this.mFieldDeserializer.get(key);
            if (deserializer2 != null) {
                try {
                    key.set(this, deserializer2.deserialize(this, entry.getValue(), opt));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (!onEachItemParse(entry.getValue(), opt)) {
                if (opt instanceof JSONArray) {
                    Type genericType = key.getGenericType();
                    if (genericType instanceof ParameterizedType) {
                        String pickString = pickString(genericType.toString());
                        try {
                            if (!TextUtils.isEmpty(pickString) && (findClass = Util.findClass(pickString, getClass().getClassLoader())) != null) {
                                Collection collection = null;
                                if (Set.class.isAssignableFrom(key.getType())) {
                                    collection = JsonUtils.parseTo(HashSet.class, (JSONArray) opt, findClass, new Object[0]);
                                } else if (List.class.isAssignableFrom(key.getType())) {
                                    collection = JsonUtils.parseTo(ArrayList.class, (JSONArray) opt, findClass, new Object[0]);
                                }
                                key.set(this, collection);
                            }
                        } catch (IllegalAccessException e3) {
                            e3.printStackTrace();
                        }
                    } else {
                        Class cls = (Class) genericType;
                        if (cls.isArray()) {
                            try {
                                key.set(this, JsonUtils.parseToArray((JSONArray) opt, cls.getComponentType()));
                            } catch (IllegalAccessException e4) {
                                e4.printStackTrace();
                            }
                        }
                    }
                } else if (opt instanceof JSONObject) {
                    try {
                        key.set(this, JsonUtils.parseToModel((JSONObject) opt, key.getType(), new Object[0]));
                    } catch (IllegalAccessException e5) {
                        e5.printStackTrace();
                    }
                } else if (type == String.class) {
                    try {
                        key.set(this, String.valueOf(opt));
                    } catch (IllegalAccessException e6) {
                        e6.printStackTrace();
                    }
                } else {
                    try {
                        if (type == Boolean.TYPE) {
                            if (opt instanceof Boolean) {
                                key.setBoolean(this, ((Boolean) opt).booleanValue());
                            } else if (opt instanceof String) {
                                if (opt.equals("false")) {
                                    key.setBoolean(this, false);
                                } else if (opt.equals("true")) {
                                    key.setBoolean(this, true);
                                }
                            }
                        } else if (type == Byte.TYPE) {
                            if (opt instanceof Byte) {
                                key.setByte(this, ((Byte) opt).byteValue());
                            } else if (opt instanceof Number) {
                                key.setByte(this, ((Number) opt).byteValue());
                            }
                        } else if (type == Character.TYPE) {
                            if (opt instanceof Character) {
                                key.setChar(this, ((Character) opt).charValue());
                            } else if (opt instanceof Integer) {
                                if (Character.isLetter(((Integer) opt).intValue())) {
                                    key.setChar(this, Character.toChars(((Integer) opt).intValue())[0]);
                                } else if (10 > ((Integer) opt).intValue() && ((Integer) opt).intValue() >= 0) {
                                    key.setChar(this, Character.forDigit(((Integer) opt).intValue(), 10));
                                }
                            }
                        } else if (type == Double.TYPE) {
                            if (opt instanceof Number) {
                                key.setDouble(this, ((Number) opt).doubleValue());
                            } else if (opt instanceof String) {
                                key.setDouble(this, Double.parseDouble((String) opt));
                            }
                        } else if (type == Float.TYPE) {
                            if (opt instanceof Number) {
                                key.setFloat(this, ((Number) opt).floatValue());
                            } else if (opt instanceof String) {
                                key.setFloat(this, Float.parseFloat((String) opt));
                            }
                        } else if (type == Integer.TYPE) {
                            if (opt instanceof Number) {
                                key.setInt(this, ((Number) opt).intValue());
                            } else if (opt instanceof String) {
                                key.setInt(this, Integer.parseInt((String) opt));
                            }
                        } else if (type == Long.TYPE) {
                            if (opt instanceof Number) {
                                key.setLong(this, ((Number) opt).longValue());
                            } else if (opt instanceof String) {
                                key.setLong(this, Long.parseLong((String) opt));
                            }
                        } else if (type == Short.TYPE) {
                            if (opt instanceof Number) {
                                key.setShort(this, ((Number) opt).shortValue());
                            } else if (opt instanceof String) {
                                key.setShort(this, Short.parseShort((String) opt));
                            }
                        } else if (opt != null) {
                            key.set(this, opt);
                        }
                    } catch (IllegalAccessException e7) {
                        e7.printStackTrace();
                    } catch (NumberFormatException e8) {
                        e8.printStackTrace();
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String pickString(java.lang.String r5) {
        /*
            r4 = this;
        L0:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L7
            return r5
        L7:
            java.lang.String r0 = "<"
            java.lang.String r1 = ">"
            int r2 = r5.indexOf(r0)
            int r3 = r5.lastIndexOf(r1)
            if (r2 >= 0) goto L16
            r2 = 0
        L16:
            if (r3 >= 0) goto L1c
            int r3 = r5.length()
        L1c:
            if (r3 <= r2) goto L32
            int r2 = r2 + 1
            java.lang.String r5 = r5.substring(r2, r3)
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L31
            boolean r0 = r5.contains(r1)
            if (r0 == 0) goto L31
            goto L0
        L31:
            return r5
        L32:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.map.tools.json.JsonComposer.pickString(java.lang.String):java.lang.String");
    }

    private synchronized void checkJsonComposerElements() {
        Class<? extends JsonParser.Deserializer> deserializer;
        JsonType jsonType = (JsonType) getClass().getAnnotation(JsonType.class);
        if (jsonType != null) {
            this.mAllowEmpty = jsonType.allowEmpty();
            this.mFieldNameStyle = jsonType.fieldNameStyle();
            this.mFieldNamePrefix = jsonType.fieldNamePrefix();
            Class<? extends JsonParser.Deserializer> deserializer2 = jsonType.deserializer();
            if (deserializer2 != JsonParser.Deserializer.class) {
                this.mClassDeserializer.put(getClass(), (JsonParser.Deserializer) Util.newInstance(deserializer2, new Object[0]));
            }
        }
        this.mJsonFields = sClassJsonMap.get(getClass());
        Collection<Field> arrayList = new ArrayList();
        if (this.mJsonFields == null) {
            this.mJsonFields = new ConcurrentHashMap();
            for (Class<?> cls = getClass(); cls != JsonComposer.class; cls = cls.getSuperclass()) {
                arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            }
            sClassJsonMap.put(getClass(), this.mJsonFields);
        } else {
            arrayList = this.mJsonFields.keySet();
        }
        for (Field field : arrayList) {
            if (!Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers()) && !Modifier.isFinal(field.getModifiers())) {
                JsonType jsonType2 = (JsonType) field.getType().getAnnotation(JsonType.class);
                if (jsonType2 != null && (deserializer = jsonType2.deserializer()) != JsonParser.Deserializer.class) {
                    this.mFieldDeserializer.put(field, (JsonParser.Deserializer) Util.newInstance(deserializer, new Object[0]));
                }
                Json json = (Json) field.getAnnotation(Json.class);
                if (json != null) {
                    if (!json.ignore()) {
                        if (TextUtils.isEmpty(json.name())) {
                            this.mJsonFields.put(field, translateFieldName(field.getName()));
                        } else {
                            this.mJsonFields.put(field, json.name());
                        }
                    }
                    Class<? extends JsonParser.Deserializer> deserializer3 = json.deserializer();
                    if (deserializer3 != JsonParser.Deserializer.class) {
                        this.mFieldDeserializer.put(field, (JsonParser.Deserializer) Util.newInstance(deserializer3, new Object[0]));
                    }
                } else if (!field.getName().contains("this")) {
                    this.mJsonFields.put(field, translateFieldName(field.getName()));
                }
            }
        }
    }

    private String translateFieldName(String str) {
        if (this.mFieldNamePrefix != null && str.startsWith(this.mFieldNamePrefix)) {
            String substring = str.substring(this.mFieldNamePrefix.length(), this.mFieldNamePrefix.length() + 1);
            str = substring.toLowerCase() + str.substring(this.mFieldNamePrefix.length() + 1);
        }
        if (this.mFieldNameStyle == FieldNameStyle.UNDERLINE) {
            Matcher matcher = Pattern.compile("[A-Z]").matcher(str);
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                matcher.appendReplacement(stringBuffer, CommonConstant.Symbol.UNDERLINE + matcher.group(0).toLowerCase());
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object getFieldValueByJsonName(String str) throws IllegalAccessException {
        if (this.mJsonFields != null) {
            for (Map.Entry<Field, String> entry : this.mJsonFields.entrySet()) {
                if (entry.getValue().equals(str)) {
                    return entry.getKey().get(this);
                }
            }
            return null;
        }
        return null;
    }
}
