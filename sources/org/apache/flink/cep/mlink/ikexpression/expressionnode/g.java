package org.apache.flink.cep.mlink.ikexpression.expressionnode;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Nonnull;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.ikexpression.datameta.a;
import org.apache.flink.cep.pattern.conditions.b;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class g {
    public static Object a(Object obj, String str) {
        Field field;
        if (obj == null || ((obj instanceof org.apache.flink.cep.mlink.ikexpression.datameta.b) && (obj = ((org.apache.flink.cep.mlink.ikexpression.datameta.b) obj).b) == null)) {
            return null;
        }
        if (obj instanceof HashMap) {
            return ((HashMap) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        try {
            field = obj.getClass().getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            field = null;
        }
        if (field != null) {
            field.setAccessible(true);
            try {
                return field.get(obj);
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static org.apache.flink.cep.mlink.ikexpression.datameta.b a(Object obj) {
        if (obj == null) {
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
        }
        if (obj instanceof Boolean) {
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, obj);
        }
        if (obj instanceof Date) {
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_DATE, obj);
        }
        if (obj instanceof Double) {
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_DOUBLE, obj);
        }
        if (obj instanceof Float) {
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_FLOAT, obj);
        }
        if (obj instanceof Integer) {
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_INT, obj);
        }
        if (obj instanceof Long) {
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_LONG, obj);
        }
        if (obj instanceof String) {
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_STRING, obj);
        }
        if (obj instanceof List) {
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_LIST, obj);
        }
        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_OBJECT, obj);
    }

    public static boolean a(org.apache.flink.cep.mlink.ikexpression.datameta.b bVar) {
        if (bVar != null) {
            try {
                a.EnumC1538a a = bVar.a();
                if (a == a.EnumC1538a.DATATYPE_BOOLEAN) {
                    return bVar.d().booleanValue();
                }
                if (a != a.EnumC1538a.DATATYPE_STRING) {
                    return (a.EnumC1538a.DATATYPE_DOUBLE == a || a.EnumC1538a.DATATYPE_FLOAT == a || a.EnumC1538a.DATATYPE_LONG == a || a.EnumC1538a.DATATYPE_INT == a) && Double.compare(bVar.h().doubleValue(), Double.valueOf(0.0d).doubleValue()) > 0;
                }
                String b = bVar.b();
                if (!TextUtils.isEmpty(b)) {
                    String lowerCase = b.toLowerCase();
                    if ("true".equals(lowerCase)) {
                        return true;
                    }
                    return !"false".equals(lowerCase) && Double.compare(Double.valueOf(Double.parseDouble(lowerCase)).doubleValue(), Double.valueOf(0.0d).doubleValue()) > 0;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static JSONArray a(List list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj == null) {
                jSONArray.put((Object) null);
            } else if (obj instanceof StreamData) {
                jSONArray.put(((StreamData) obj).toJson());
            } else if (obj instanceof List) {
                jSONArray.put(a((List) obj));
            } else if (obj instanceof org.apache.flink.cep.mlink.ikexpression.datameta.b) {
                org.apache.flink.cep.mlink.ikexpression.datameta.b bVar = (org.apache.flink.cep.mlink.ikexpression.datameta.b) obj;
                Object obj2 = bVar.b;
                if (obj2 instanceof List) {
                    jSONArray.put(a((List) obj2));
                } else if (obj2 instanceof StreamData) {
                    jSONArray.put(((StreamData) obj2).toJson());
                } else {
                    jSONArray.put(bVar.b);
                }
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }

    public static Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            return a((List) obj);
        }
        return obj instanceof StreamData ? ((StreamData) obj).toJson() : obj;
    }

    public static Boolean b(org.apache.flink.cep.mlink.ikexpression.datameta.b bVar) {
        if (bVar != null) {
            try {
                if (bVar.b != null) {
                    a.EnumC1538a a = bVar.a();
                    if (a == a.EnumC1538a.DATATYPE_BOOLEAN) {
                        return Boolean.valueOf(bVar.d().booleanValue());
                    }
                    if (a != a.EnumC1538a.DATATYPE_STRING) {
                        if (a.EnumC1538a.DATATYPE_DOUBLE == a || a.EnumC1538a.DATATYPE_FLOAT == a || a.EnumC1538a.DATATYPE_LONG == a || a.EnumC1538a.DATATYPE_INT == a) {
                            if (Double.compare(bVar.h().doubleValue(), Double.valueOf(0.0d).doubleValue()) > 0) {
                                return Boolean.TRUE;
                            }
                            return Boolean.FALSE;
                        }
                        return null;
                    }
                    String b = bVar.b();
                    if (TextUtils.isEmpty(b)) {
                        return null;
                    }
                    String lowerCase = b.toLowerCase();
                    if ("true".equals(lowerCase)) {
                        return Boolean.TRUE;
                    }
                    if ("false".equals(lowerCase)) {
                        return Boolean.FALSE;
                    }
                    if (Double.compare(Double.valueOf(Double.parseDouble(lowerCase)).doubleValue(), Double.valueOf(0.0d).doubleValue()) > 0) {
                        return Boolean.TRUE;
                    }
                    return Boolean.FALSE;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    @Nonnull
    public static org.apache.flink.cep.mlink.ikexpression.datameta.b a(org.apache.flink.cep.mlink.ikexpression.datameta.b bVar, a aVar, StreamData streamData, b.a aVar2, boolean z) throws org.apache.flink.cep.mlink.ikexpression.b {
        Object obj = bVar.b;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 0) {
                if (list.get(0) instanceof org.apache.flink.cep.mlink.ikexpression.datameta.b) {
                    while (i < list.size()) {
                        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) aVar.a(streamData, aVar2, (org.apache.flink.cep.mlink.ikexpression.datameta.b) list.get(i));
                        if (z || !bVar2.a().equals(a.EnumC1538a.DATATYPE_NULL)) {
                            arrayList.add(bVar2);
                        }
                        i++;
                    }
                } else {
                    while (i < list.size()) {
                        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar3 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) aVar.a(streamData, aVar2, a(list.get(i)));
                        if (z || !bVar3.a().equals(a.EnumC1538a.DATATYPE_NULL)) {
                            arrayList.add(bVar3);
                        }
                        i++;
                    }
                }
            }
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            while (i < jSONArray.length()) {
                org.apache.flink.cep.mlink.ikexpression.datameta.b bVar4 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) aVar.a(streamData, aVar2, a(jSONArray.opt(i)));
                if (z || !bVar4.a().equals(a.EnumC1538a.DATATYPE_NULL)) {
                    arrayList.add(bVar4);
                }
                i++;
            }
        } else {
            org.apache.flink.cep.mlink.ikexpression.datameta.b bVar5 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) aVar.a(streamData, aVar2, bVar);
            if (z || !bVar5.a().equals(a.EnumC1538a.DATATYPE_NULL)) {
                arrayList.add(bVar5);
            }
        }
        return a((Object) arrayList);
    }
}
