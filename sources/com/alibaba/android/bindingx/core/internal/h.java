package com.alibaba.android.bindingx.core.internal;

import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h {
    JSONObject a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(String str) {
        try {
            this.a = (JSONObject) new JSONTokener(str).nextValue();
        } catch (Throwable th) {
            com.alibaba.android.bindingx.core.d.a("[Expression] expression is illegal. \n ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object a(Map<String, Object> map) throws IllegalArgumentException, JSONException {
        return a(this.a, map);
    }

    private static double a(Object obj) {
        if (obj instanceof String) {
            return Double.parseDouble((String) obj);
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1.0d : 0.0d;
        }
        return ((Double) obj).doubleValue();
    }

    private static boolean b(Object obj) {
        if (obj instanceof String) {
            return ((String) obj) == "";
        } else if (obj instanceof Double) {
            return ((Double) obj).doubleValue() != 0.0d;
        } else {
            return ((Boolean) obj).booleanValue();
        }
    }

    private boolean a(Object obj, Object obj2) {
        if ((obj instanceof m) && (obj2 instanceof m)) {
            return obj == obj2;
        } else if ((obj instanceof String) && (obj2 instanceof String)) {
            return obj.equals(obj2);
        } else {
            return ((obj instanceof Boolean) && (obj2 instanceof Boolean)) ? b(obj) == b(obj2) : a(obj) == a(obj2);
        }
    }

    private static boolean b(Object obj, Object obj2) {
        if (!(obj instanceof m) || (obj2 instanceof m)) {
            if (!(obj instanceof Boolean) || (obj2 instanceof Boolean)) {
                if (!(obj instanceof Double) || (obj2 instanceof Double)) {
                    return (!(obj instanceof String) || (obj2 instanceof String)) && obj == obj2;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private Object a(JSONObject jSONObject, Map<String, Object> map) throws IllegalArgumentException, JSONException {
        while (true) {
            String string = jSONObject.getString("type");
            JSONArray optJSONArray = jSONObject.optJSONArray("children");
            char c = 65535;
            switch (string.hashCode()) {
                case -1746151498:
                    if (string.equals("CallExpression")) {
                        c = 4;
                        break;
                    }
                    break;
                case 33:
                    if (string.equals("!")) {
                        c = 22;
                        break;
                    }
                    break;
                case 37:
                    if (string.equals("%")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 42:
                    if (string.equals("*")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 43:
                    if (string.equals("+")) {
                        c = 6;
                        break;
                    }
                    break;
                case 45:
                    if (string.equals(CommonConstant.Symbol.MINUS)) {
                        c = 7;
                        break;
                    }
                    break;
                case 47:
                    if (string.equals("/")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 60:
                    if (string.equals("<")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 62:
                    if (string.equals(">")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 63:
                    if (string.equals(CommonConstant.Symbol.QUESTION_MARK)) {
                        c = 5;
                        break;
                    }
                    break;
                case 1084:
                    if (string.equals("!=")) {
                        c = 18;
                        break;
                    }
                    break;
                case 1216:
                    if (string.equals(CommonConstant.Symbol.LOGIC_AND)) {
                        c = 20;
                        break;
                    }
                    break;
                case 1344:
                    if (string.equals("**")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1921:
                    if (string.equals("<=")) {
                        c = 15;
                        break;
                    }
                    break;
                case 1952:
                    if (string.equals("==")) {
                        c = 16;
                        break;
                    }
                    break;
                case 1983:
                    if (string.equals(">=")) {
                        c = 14;
                        break;
                    }
                    break;
                case 3968:
                    if (string.equals(CommonConstant.Symbol.LOGIC_OR)) {
                        c = 21;
                        break;
                    }
                    break;
                case 33665:
                    if (string.equals("!==")) {
                        c = 19;
                        break;
                    }
                    break;
                case 60573:
                    if (string.equals("===")) {
                        c = 17;
                        break;
                    }
                    break;
                case 189157634:
                    if (string.equals("NumericLiteral")) {
                        c = 1;
                        break;
                    }
                    break;
                case 375032009:
                    if (string.equals("Identifier")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1074430782:
                    if (string.equals("StringLiteral")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1816238983:
                    if (string.equals("BooleanLiteral")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return jSONObject.getString("value");
                case 1:
                    return Double.valueOf(jSONObject.getDouble("value"));
                case 2:
                    return Boolean.valueOf(jSONObject.getBoolean("value"));
                case 3:
                    return map.get(jSONObject.getString("value"));
                case 4:
                    k kVar = (k) a(optJSONArray.getJSONObject(0), map);
                    ArrayList<Object> arrayList = new ArrayList<>();
                    JSONArray jSONArray = optJSONArray.getJSONObject(1).getJSONArray("children");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(a(jSONArray.getJSONObject(i), map));
                    }
                    return kVar.a(arrayList);
                case 5:
                    if (((Boolean) a(optJSONArray.getJSONObject(0), map)).booleanValue()) {
                        jSONObject = optJSONArray.getJSONObject(1);
                        break;
                    } else {
                        jSONObject = optJSONArray.getJSONObject(2);
                        break;
                    }
                case 6:
                    return Double.valueOf(a(a(optJSONArray.getJSONObject(0), map)) + a(a(optJSONArray.getJSONObject(1), map)));
                case 7:
                    return Double.valueOf(a(a(optJSONArray.getJSONObject(0), map)) - a(a(optJSONArray.getJSONObject(1), map)));
                case '\b':
                    return Double.valueOf(a(a(optJSONArray.getJSONObject(0), map)) * a(a(optJSONArray.getJSONObject(1), map)));
                case '\t':
                    return Double.valueOf(a(a(optJSONArray.getJSONObject(0), map)) / a(a(optJSONArray.getJSONObject(1), map)));
                case '\n':
                    return Double.valueOf(a(a(optJSONArray.getJSONObject(0), map)) % a(a(optJSONArray.getJSONObject(1), map)));
                case 11:
                    return Double.valueOf(Math.pow(a(a(optJSONArray.getJSONObject(0), map)), a(a(optJSONArray.getJSONObject(1), map))));
                case '\f':
                    return Boolean.valueOf(a(a(optJSONArray.getJSONObject(0), map)) > a(a(optJSONArray.getJSONObject(1), map)));
                case '\r':
                    return Boolean.valueOf(a(a(optJSONArray.getJSONObject(0), map)) < a(a(optJSONArray.getJSONObject(1), map)));
                case 14:
                    return Boolean.valueOf(a(a(optJSONArray.getJSONObject(0), map)) >= a(a(optJSONArray.getJSONObject(1), map)));
                case 15:
                    return Boolean.valueOf(a(a(optJSONArray.getJSONObject(0), map)) <= a(a(optJSONArray.getJSONObject(1), map)));
                case 16:
                    return Boolean.valueOf(a(a(optJSONArray.getJSONObject(0), map), a(optJSONArray.getJSONObject(1), map)));
                case 17:
                    return Boolean.valueOf(b(a(optJSONArray.getJSONObject(0), map), a(optJSONArray.getJSONObject(1), map)));
                case 18:
                    return Boolean.valueOf(!a(a(optJSONArray.getJSONObject(0), map), a(optJSONArray.getJSONObject(1), map)));
                case 19:
                    return Boolean.valueOf(!b(a(optJSONArray.getJSONObject(0), map), a(optJSONArray.getJSONObject(1), map)));
                case 20:
                    Object a = a(optJSONArray.getJSONObject(0), map);
                    if (b(a)) {
                        jSONObject = optJSONArray.getJSONObject(1);
                        break;
                    } else {
                        return a;
                    }
                case 21:
                    Object a2 = a(optJSONArray.getJSONObject(0), map);
                    if (!b(a2)) {
                        jSONObject = optJSONArray.getJSONObject(1);
                        break;
                    } else {
                        return a2;
                    }
                case 22:
                    return Boolean.valueOf(!b(a(optJSONArray.getJSONObject(0), map)));
                default:
                    return null;
            }
        }
    }
}
